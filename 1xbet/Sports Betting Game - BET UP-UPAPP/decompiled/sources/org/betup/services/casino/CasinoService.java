package org.betup.services.casino;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.FragmentActivity;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.casino.V7CasinoAuthInteractor;
import org.betup.model.remote.entity.casino.CasinoAuthTokenModel;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.dialogs.CasinoWelcomeDialogFragment;
import org.betup.utils.CustomTabsHelper;
import org.betup.utils.SharedPrefs;

@Singleton
/* loaded from: classes2.dex */
public class CasinoService implements BaseCachedSharedInteractor.OnFetchedListener<CasinoAuthTokenModel, Void> {
    private WeakReference<Activity> activityWeakRef;
    private WeakReference<ProgressDisplay> progressDisplayWeakRef;
    private boolean shouldShowCasino;
    private final UserService userService;
    private final V7CasinoAuthInteractor v7CasinoAuthInteractor;

    @Inject
    public CasinoService(V7CasinoAuthInteractor v7CasinoAuthInteractor, UserService userService) {
        this.v7CasinoAuthInteractor = v7CasinoAuthInteractor;
        this.userService = userService;
    }

    public void init() {
        if (this.userService.isRegistered()) {
            this.v7CasinoAuthInteractor.load(this, null);
        }
    }

    public void runGame(Activity activity, ProgressDisplay progressDisplay) {
        if (this.userService.isRegistered()) {
            if (activity == null) {
                throw new IllegalArgumentException("activity should not be null!");
            }
            this.progressDisplayWeakRef = new WeakReference<>(progressDisplay);
            this.activityWeakRef = new WeakReference<>(activity);
            if (SharedPrefs.isCasinoAccepted(activity)) {
                prepareAndRunGame();
            } else if (activity instanceof FragmentActivity) {
                CasinoWelcomeDialogFragment.show((FragmentActivity) activity, new CasinoWelcomeDialogFragment.CasinoAcceptedListener() { // from class: org.betup.services.casino.CasinoService.1
                    @Override // org.betup.ui.dialogs.CasinoWelcomeDialogFragment.CasinoAcceptedListener
                    public void onRejected() {
                    }

                    @Override // org.betup.ui.dialogs.CasinoWelcomeDialogFragment.CasinoAcceptedListener
                    public void onAccepted() {
                        SharedPrefs.saveCasinoAccepted(BetUpApp.getContext());
                        CasinoService.this.prepareAndRunGame();
                    }
                });
            }
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<CasinoAuthTokenModel, Void> responseMessage) {
        String authenticationToken;
        WeakReference<ProgressDisplay> weakReference = this.progressDisplayWeakRef;
        ProgressDisplay progressDisplay = weakReference != null ? weakReference.get() : null;
        WeakReference<Activity> weakReference2 = this.activityWeakRef;
        Activity activity = weakReference2 != null ? weakReference2.get() : null;
        if (progressDisplay != null) {
            progressDisplay.hideProgress();
        }
        if (responseMessage.getStat() != FetchStat.SUCCESS || activity == null || (authenticationToken = responseMessage.getModel().getAuthenticationToken()) == null || authenticationToken.isEmpty()) {
            return;
        }
        try {
            String str = "https://betup.org/test/tvbet.php?lang=" + Locale.getDefault().getLanguage() + "&tokenAuth=" + URLEncoder.encode(authenticationToken, "UTF-8");
            if (this.shouldShowCasino) {
                this.shouldShowCasino = false;
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.outWidth = 24;
                options.outHeight = 24;
                CustomTabsIntent build = builder.setToolbarColor(-16777216).setShowTitle(false).enableUrlBarHiding().setCloseButtonIcon(BitmapFactory.decodeResource(activity.getResources(), R.drawable.ic_arrow_back_white_24dp)).build();
                build.intent.setPackage(CustomTabsHelper.getPackageNameToUse(activity));
                build.launchUrl(activity, Uri.parse(str));
            }
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareAndRunGame() {
        ProgressDisplay progressDisplay = this.progressDisplayWeakRef.get();
        if (progressDisplay != null) {
            progressDisplay.displayProgress();
        }
        this.shouldShowCasino = true;
        this.v7CasinoAuthInteractor.load(this, null);
    }
}
