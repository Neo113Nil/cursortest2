package org.betup.ui.splash.load;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.Set;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.NewLoginInteractor;
import org.betup.model.remote.entity.login.LoginResponseModel;
import org.betup.services.user.UserService;
import org.betup.ui.LoginActivity;
import org.betup.ui.fragment.login.AuthFragment;

/* loaded from: classes4.dex */
public class DefaultLoader implements Loader {
    private Context context;
    private Handler handler;
    private LoadListener listener;

    @Inject
    NewLoginInteractor newLoginInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<LoginResponseModel, Void> newLoginListener = new BaseCachedSharedInteractor.OnFetchedListener<LoginResponseModel, Void>() { // from class: org.betup.ui.splash.load.DefaultLoader.1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<LoginResponseModel, Void> responseMessage) {
            if (responseMessage.getStat() == FetchStat.NO_AUTH) {
                DefaultLoader.this.userService.clearUserInfo();
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(DefaultLoader.this.context, (Class<?>) LoginActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("action", AuthFragment.Action.LOGIN);
                bundle.putBoolean(TtmlNode.START, true);
                intent.putExtras(bundle);
                DefaultLoader.this.context.startActivity(intent);
                return;
            }
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                DefaultLoader.this.listener.loadInetError();
            } else {
                DefaultLoader.this.fetchMyInfo();
            }
        }
    };
    private UserService.UserInfoListener onUserFetched = new UserService.UserInfoListener() { // from class: org.betup.ui.splash.load.DefaultLoader.2
        @Override // org.betup.services.user.UserService.UserInfoListener
        public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> kinds, FetchStat stat) {
            if (stat != FetchStat.SUCCESS) {
                if (stat == FetchStat.NO_AUTH) {
                    DefaultLoader.this.userService.clearUserInfo();
                    FirebaseAuth.getInstance().signOut();
                    Intent intent = new Intent(DefaultLoader.this.context, (Class<?>) LoginActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("action", AuthFragment.Action.LOGIN);
                    bundle.putSerializable(TtmlNode.START, true);
                    intent.putExtras(bundle);
                    DefaultLoader.this.context.startActivity(intent);
                    return;
                }
                DefaultLoader.this.listener.loadInetError();
                return;
            }
            DefaultLoader.this.listener.loadCompleted();
        }
    };

    @Inject
    UserService userService;

    public DefaultLoader(Context context, LoadListener listener, Handler handler) {
        ((BetUpApp) context.getApplicationContext()).getComponent().inject(this);
        this.context = context;
        this.listener = listener;
        this.handler = handler;
    }

    @Override // org.betup.ui.splash.load.Loader
    public void load() {
        if (FirebaseAuth.getInstance().getCurrentUser() == null) {
            Log.d("NO_USER", "CHECK");
        }
        makeLogin();
    }

    private void makeLogin() {
        this.listener.loadProgress(20, this.context.getString(R.string.loading_account));
        this.newLoginInteractor.load(this.newLoginListener, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchMyInfo() {
        this.userService.getProfile(this.onUserFetched, UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
    }
}
