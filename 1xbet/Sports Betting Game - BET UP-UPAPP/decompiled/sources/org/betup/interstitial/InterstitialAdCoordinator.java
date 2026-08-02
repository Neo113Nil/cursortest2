package org.betup.interstitial;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.activity.result.ActivityResultCaller;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.interstitial.GetInterstitialCampaignInteractor;
import org.betup.model.remote.api.rest.interstitial.InterstitialActionType;
import org.betup.model.remote.api.rest.interstitial.InterstitialCampaignRequest;
import org.betup.model.remote.api.rest.interstitial.PostInterstitialActionInteractor;
import org.betup.model.remote.api.rest.interstitial.PostInterstitialActionRequest;
import org.betup.model.remote.entity.interstitial.InterstitialCampaignDto;
import org.betup.model.remote.entity.interstitial.InterstitialCreativeType;
import org.betup.presentation.ScreenTracker;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.ui.dialogs.interstitial.InterstitialBackHandler;
import org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment;
import org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragment;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialBridgeContext;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialDismissPolicy;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler;
import org.betup.ui.dialogs.presentation.PresentationWebViewDialogFragment;
import org.betup.utils.DeferredOverlayQueue;
import org.betup.utils.DialogManager;
import org.betup.utils.ExternalOverlayDeferral;
import org.betup.utils.FragmentSafeOps;
import org.betup.utils.ImmersiveOverlayGate;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InterstitialAdCoordinator.kt */
@Singleton
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0006\u0010\u001a\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000eJ*\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J*\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000bH\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\"\u0010'\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0002J6\u0010(\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lorg/betup/interstitial/InterstitialAdCoordinator;", "", "getInterstitialCampaignInteractor", "Lorg/betup/model/remote/api/rest/interstitial/GetInterstitialCampaignInteractor;", "postInterstitialActionInteractor", "Lorg/betup/model/remote/api/rest/interstitial/PostInterstitialActionInteractor;", "screenTracker", "Lorg/betup/presentation/ScreenTracker;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/interstitial/GetInterstitialCampaignInteractor;Lorg/betup/model/remote/api/rest/interstitial/PostInterstitialActionInteractor;Lorg/betup/presentation/ScreenTracker;)V", "tag", "", "hostRef", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentActivity;", "isShowing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShowInProgress", "bind", "", "host", "unbind", "showCampaignFromPush", "campaignId", "eventKey", "reconcileStaleState", "onPresentationDismissed", "handleHardwareBack", "", "showCampaign", "campaign", "Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "screenKey", "resetAfterFailedShow", "createBridgeContext", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialBridgeContext;", "openExternalUrl", "url", "dismissDialog", "trackImpression", "sendAction", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "Lorg/betup/model/remote/api/rest/interstitial/InterstitialActionType;", "targetUrl", "isHostReady", "isInterstitialVisible", "isAnyImmersiveVisible", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialAdCoordinator {
    public static final int $stable = 8;
    private final GetInterstitialCampaignInteractor getInterstitialCampaignInteractor;
    private WeakReference<FragmentActivity> hostRef;
    private final AtomicBoolean isShowInProgress;
    private final AtomicBoolean isShowing;
    private final PostInterstitialActionInteractor postInterstitialActionInteractor;
    private final ScreenTracker screenTracker;
    private final String tag;

    /* compiled from: InterstitialAdCoordinator.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterstitialCreativeType.values().length];
            try {
                iArr[InterstitialCreativeType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterstitialCreativeType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterstitialCreativeType.HTML_WITH_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public InterstitialAdCoordinator(GetInterstitialCampaignInteractor getInterstitialCampaignInteractor, PostInterstitialActionInteractor postInterstitialActionInteractor, ScreenTracker screenTracker) {
        Intrinsics.checkNotNullParameter(getInterstitialCampaignInteractor, "getInterstitialCampaignInteractor");
        Intrinsics.checkNotNullParameter(postInterstitialActionInteractor, "postInterstitialActionInteractor");
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        this.getInterstitialCampaignInteractor = getInterstitialCampaignInteractor;
        this.postInterstitialActionInteractor = postInterstitialActionInteractor;
        this.screenTracker = screenTracker;
        this.tag = "InterstitialAdCoordinator";
        this.isShowing = new AtomicBoolean(false);
        this.isShowInProgress = new AtomicBoolean(false);
    }

    public final void bind(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.hostRef = new WeakReference<>(host);
    }

    public final void unbind() {
        this.hostRef = null;
    }

    public final void showCampaignFromPush(final String campaignId, final String eventKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        WeakReference<FragmentActivity> weakReference = this.hostRef;
        final FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            Log.w(this.tag, "showCampaignFromPush: host unavailable campaignId=" + campaignId);
            return;
        }
        reconcileStaleState(fragmentActivity);
        if (ImmersiveOverlayGate.isActive() && !isAnyImmersiveVisible(fragmentActivity)) {
            Log.w(this.tag, "reconcile: immersive gate active without visible dialog, clearing");
            ImmersiveOverlayGate.onImmersiveDismissed();
            onPresentationDismissed();
        }
        if (ImmersiveOverlayGate.isActive() || this.isShowing.get() || isInterstitialVisible(fragmentActivity)) {
            Log.d(this.tag, "showCampaignFromPush blocked: immersive already active campaignId=" + campaignId);
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogManager.reconcileTrackedDialogsWith(supportFragmentManager);
        if (ExternalOverlayDeferral.shouldDefer(fragmentActivity) || DialogManager.hasTrackedDialogShowing()) {
            Log.d(this.tag, "showCampaignFromPush: other overlay visible — deferring campaignId=" + campaignId);
            DeferredOverlayQueue.enqueue(fragmentActivity, new Runnable() { // from class: org.betup.interstitial.InterstitialAdCoordinator$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialAdCoordinator.this.showCampaignFromPush(campaignId, eventKey);
                }
            });
        } else if (this.isShowInProgress.compareAndSet(false, true)) {
            final String currentScreenKey = this.screenTracker.getCurrentScreenKey();
            Log.d(this.tag, "showCampaignFromPush: campaignId=" + campaignId + " eventKey=" + eventKey + " screenKey=" + currentScreenKey);
            this.getInterstitialCampaignInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.interstitial.InterstitialAdCoordinator$$ExternalSyntheticLambda2
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    InterstitialAdCoordinator.showCampaignFromPush$lambda$1(InterstitialAdCoordinator.this, fragmentActivity, campaignId, eventKey, currentScreenKey, fetchedResponseMessage);
                }
            }, new InterstitialCampaignRequest(campaignId, eventKey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCampaignFromPush$lambda$1(InterstitialAdCoordinator interstitialAdCoordinator, FragmentActivity fragmentActivity, String str, String str2, String str3, FetchedResponseMessage fetchedResponseMessage) {
        boolean z;
        try {
            if (!interstitialAdCoordinator.isHostReady(fragmentActivity)) {
                if (z) {
                    return;
                } else {
                    return;
                }
            }
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
                Object model = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                InterstitialCampaignDto interstitialCampaignDto = (InterstitialCampaignDto) model;
                if (str2 == null) {
                    str2 = "";
                }
                interstitialAdCoordinator.showCampaign(fragmentActivity, interstitialCampaignDto, str2, str3);
                if (interstitialAdCoordinator.isShowing.get()) {
                    return;
                }
                interstitialAdCoordinator.isShowInProgress.set(false);
                return;
            }
            Log.d(interstitialAdCoordinator.tag, "showCampaignFromPush: campaign not available campaignId=" + str + " stat=" + fetchedResponseMessage.getStat());
            if (interstitialAdCoordinator.isShowing.get()) {
                return;
            }
            interstitialAdCoordinator.isShowInProgress.set(false);
        } finally {
            if (!interstitialAdCoordinator.isShowing.get()) {
                interstitialAdCoordinator.isShowInProgress.set(false);
            }
        }
    }

    private final void reconcileStaleState(FragmentActivity host) {
        if (!this.isShowing.get() || isInterstitialVisible(host)) {
            return;
        }
        Log.w(this.tag, "reconcile: isShowing without visible interstitial, clearing");
        onPresentationDismissed();
    }

    public final void onPresentationDismissed() {
        this.isShowing.set(false);
        this.isShowInProgress.set(false);
    }

    public final boolean handleHardwareBack(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (!isInterstitialVisible(host)) {
            return false;
        }
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        ActivityResultCaller findFragmentByTag = supportFragmentManager.findFragmentByTag(InterstitialWebViewDialogFragment.TAG);
        InterstitialBackHandler interstitialBackHandler = null;
        InterstitialBackHandler interstitialBackHandler2 = findFragmentByTag instanceof InterstitialBackHandler ? (InterstitialBackHandler) findFragmentByTag : null;
        if (interstitialBackHandler2 != null) {
            DialogFragment dialogFragment = interstitialBackHandler2 instanceof DialogFragment ? (DialogFragment) interstitialBackHandler2 : null;
            if (dialogFragment == null || !dialogFragment.isAdded()) {
                interstitialBackHandler2 = null;
            }
            if (interstitialBackHandler2 != null) {
                return interstitialBackHandler2.handleHardwareBack();
            }
        }
        ActivityResultCaller findFragmentByTag2 = supportFragmentManager.findFragmentByTag(InterstitialVideoDialogFragment.TAG);
        InterstitialBackHandler interstitialBackHandler3 = findFragmentByTag2 instanceof InterstitialBackHandler ? (InterstitialBackHandler) findFragmentByTag2 : null;
        if (interstitialBackHandler3 != null) {
            DialogFragment dialogFragment2 = interstitialBackHandler3 instanceof DialogFragment ? (DialogFragment) interstitialBackHandler3 : null;
            if (dialogFragment2 != null && dialogFragment2.isAdded()) {
                interstitialBackHandler = interstitialBackHandler3;
            }
            if (interstitialBackHandler != null) {
                return interstitialBackHandler.handleHardwareBack();
            }
        }
        return false;
    }

    private final void showCampaign(final FragmentActivity host, final InterstitialCampaignDto campaign, final String eventKey, final String screenKey) {
        Object newInstance;
        String str;
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogManager.reconcileTrackedDialogsWith(supportFragmentManager);
        if (ExternalOverlayDeferral.shouldDefer(host) || DialogManager.hasTrackedDialogShowing()) {
            Log.d(this.tag, "showCampaign: other overlay visible — deferring id=" + campaign.getId());
            this.isShowInProgress.set(false);
            DeferredOverlayQueue.enqueue(host, new Runnable() { // from class: org.betup.interstitial.InterstitialAdCoordinator$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialAdCoordinator.showCampaign$lambda$6(InterstitialAdCoordinator.this, campaign, eventKey);
                }
            });
            return;
        }
        if (!this.isShowing.compareAndSet(false, true)) {
            Log.w(this.tag, "showCampaign: isShowing already true");
            this.isShowInProgress.set(false);
            return;
        }
        this.isShowInProgress.set(false);
        Log.d(this.tag, "showCampaign: id=" + campaign.getId() + " slug=" + campaign.getSlug() + " type=" + campaign.getCreativeType() + " eventKey=" + eventKey);
        InterstitialBridgeContext createBridgeContext = createBridgeContext(host, campaign, eventKey, screenKey);
        int i = WhenMappings.$EnumSwitchMapping$0[campaign.getCreativeType().ordinal()];
        if (i == 1) {
            newInstance = InterstitialVideoDialogFragment.INSTANCE.newInstance(createBridgeContext);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            newInstance = InterstitialWebViewDialogFragment.INSTANCE.newInstance(createBridgeContext);
        }
        final Object obj = newInstance;
        if (WhenMappings.$EnumSwitchMapping$0[campaign.getCreativeType().ordinal()] == 1) {
            str = InterstitialVideoDialogFragment.TAG;
        } else {
            str = InterstitialWebViewDialogFragment.TAG;
        }
        final String str2 = str;
        ImmersiveOverlayGate.onImmersiveShown(host, new Function0() { // from class: org.betup.interstitial.InterstitialAdCoordinator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showCampaign$lambda$10;
                showCampaign$lambda$10 = InterstitialAdCoordinator.showCampaign$lambda$10(InterstitialAdCoordinator.this, host, str2, obj, campaign, eventKey, screenKey);
                return showCampaign$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCampaign$lambda$6(InterstitialAdCoordinator interstitialAdCoordinator, InterstitialCampaignDto interstitialCampaignDto, String str) {
        interstitialAdCoordinator.showCampaignFromPush(interstitialCampaignDto.getId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCampaign$lambda$10(final InterstitialAdCoordinator interstitialAdCoordinator, final FragmentActivity fragmentActivity, String str, Object obj, final InterstitialCampaignDto interstitialCampaignDto, final String str2, final String str3) {
        Object m10853constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            if (supportFragmentManager.findFragmentByTag(str) != null) {
                Log.w(interstitialAdCoordinator.tag, "showCampaign: duplicate tag");
                interstitialAdCoordinator.resetAfterFailedShow();
            } else {
                ((DialogFragment) obj).show(supportFragmentManager, str);
                FragmentSafeOps.INSTANCE.runAfterFragmentTransactions(fragmentActivity, new Function0() { // from class: org.betup.interstitial.InterstitialAdCoordinator$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit showCampaign$lambda$10$lambda$8$lambda$7;
                        showCampaign$lambda$10$lambda$8$lambda$7 = InterstitialAdCoordinator.showCampaign$lambda$10$lambda$8$lambda$7(InterstitialAdCoordinator.this, fragmentActivity, interstitialCampaignDto, str2, str3);
                        return showCampaign$lambda$10$lambda$8$lambda$7;
                    }
                });
            }
            m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m10856exceptionOrNullimpl = Result.m10856exceptionOrNullimpl(m10853constructorimpl);
        if (m10856exceptionOrNullimpl != null) {
            Log.e(interstitialAdCoordinator.tag, "Failed to show interstitial", m10856exceptionOrNullimpl);
            interstitialAdCoordinator.resetAfterFailedShow();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCampaign$lambda$10$lambda$8$lambda$7(InterstitialAdCoordinator interstitialAdCoordinator, FragmentActivity fragmentActivity, InterstitialCampaignDto interstitialCampaignDto, String str, String str2) {
        if (!interstitialAdCoordinator.isInterstitialVisible(fragmentActivity)) {
            Log.e(interstitialAdCoordinator.tag, "showCampaign: dialog did not attach");
            interstitialAdCoordinator.resetAfterFailedShow();
            return Unit.INSTANCE;
        }
        interstitialAdCoordinator.trackImpression(interstitialCampaignDto.getId(), str, str2);
        return Unit.INSTANCE;
    }

    private final void resetAfterFailedShow() {
        onPresentationDismissed();
        ImmersiveOverlayGate.onImmersiveDismissed();
    }

    private final InterstitialBridgeContext createBridgeContext(final FragmentActivity host, final InterstitialCampaignDto campaign, final String eventKey, final String screenKey) {
        boolean allowSkip = campaign.getAllowSkip();
        boolean requireClickToClose = campaign.getRequireClickToClose();
        Integer skipAfterSeconds = campaign.getSkipAfterSeconds();
        final InterstitialDismissPolicy interstitialDismissPolicy = new InterstitialDismissPolicy(allowSkip, requireClickToClose, RangesKt.coerceAtLeast(skipAfterSeconds != null ? skipAfterSeconds.intValue() : 0, 0), null, 8, null);
        return new InterstitialBridgeContext(campaign, new InterstitialWebViewBridgeHandler() { // from class: org.betup.interstitial.InterstitialAdCoordinator$createBridgeContext$handler$1
            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onPresentationStarted() {
                InterstitialDismissPolicy.this.startCountdown();
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public boolean canSkip() {
                return InterstitialDismissPolicy.this.canDismiss();
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onClose() {
                if (InterstitialDismissPolicy.this.canDismiss()) {
                    InterstitialAdCoordinator.sendAction$default(this, campaign.getId(), InterstitialActionType.CLOSE, eventKey, screenKey, null, 16, null);
                    AnalyticsHelper.INSTANCE.logInterstitialClosed(campaign.getId(), eventKey);
                    this.dismissDialog(host);
                }
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onSkip() {
                if (InterstitialDismissPolicy.this.canDismiss()) {
                    InterstitialAdCoordinator.sendAction$default(this, campaign.getId(), InterstitialActionType.SKIP, eventKey, screenKey, null, 16, null);
                    AnalyticsHelper.INSTANCE.logInterstitialSkipped(campaign.getId(), eventKey);
                    this.dismissDialog(host);
                }
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onClick(String targetUrl) {
                InterstitialDismissPolicy.this.markClicked();
                this.sendAction(campaign.getId(), InterstitialActionType.CLICK, eventKey, screenKey, targetUrl);
                AnalyticsHelper.INSTANCE.logInterstitialClicked(campaign.getId(), eventKey, targetUrl);
                if (targetUrl != null) {
                    this.openExternalUrl(host, targetUrl);
                }
                if (!campaign.getAllowSkip() || campaign.getRequireClickToClose()) {
                    return;
                }
                this.dismissDialog(host);
            }

            @Override // org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler
            public void onVideoComplete() {
                InterstitialAdCoordinator.sendAction$default(this, campaign.getId(), InterstitialActionType.VIDEO_COMPLETE, eventKey, screenKey, null, 16, null);
                AnalyticsHelper.INSTANCE.logInterstitialVideoCompleted(campaign.getId(), eventKey);
            }
        }, interstitialDismissPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openExternalUrl(FragmentActivity host, String url) {
        Object m10853constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            InterstitialAdCoordinator interstitialAdCoordinator = this;
            new CustomTabsIntent.Builder().build().launchUrl(host, Uri.parse(url));
            m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10856exceptionOrNullimpl(m10853constructorimpl) != null) {
            host.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissDialog(FragmentActivity host) {
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(InterstitialWebViewDialogFragment.TAG);
        InterstitialWebViewDialogFragment interstitialWebViewDialogFragment = findFragmentByTag instanceof InterstitialWebViewDialogFragment ? (InterstitialWebViewDialogFragment) findFragmentByTag : null;
        if (interstitialWebViewDialogFragment != null) {
            interstitialWebViewDialogFragment.dismissAllowingStateLoss();
        }
        Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(InterstitialVideoDialogFragment.TAG);
        InterstitialVideoDialogFragment interstitialVideoDialogFragment = findFragmentByTag2 instanceof InterstitialVideoDialogFragment ? (InterstitialVideoDialogFragment) findFragmentByTag2 : null;
        if (interstitialVideoDialogFragment != null) {
            interstitialVideoDialogFragment.dismissAllowingStateLoss();
        }
        onPresentationDismissed();
        ImmersiveOverlayGate.onImmersiveDismissed();
    }

    private final void trackImpression(String campaignId, String eventKey, String screenKey) {
        sendAction$default(this, campaignId, InterstitialActionType.IMPRESSION, eventKey, screenKey, null, 16, null);
        AnalyticsHelper.INSTANCE.logInterstitialShown(campaignId, eventKey, screenKey);
    }

    static /* synthetic */ void sendAction$default(InterstitialAdCoordinator interstitialAdCoordinator, String str, InterstitialActionType interstitialActionType, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        interstitialAdCoordinator.sendAction(str, interstitialActionType, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAction(String campaignId, InterstitialActionType actionType, String eventKey, String screenKey, String targetUrl) {
        this.postInterstitialActionInteractor.load(null, new PostInterstitialActionRequest(campaignId, actionType, eventKey, screenKey, targetUrl));
    }

    private final boolean isHostReady(FragmentActivity host) {
        return (host.isFinishing() || host.isDestroyed()) ? false : true;
    }

    private final boolean isInterstitialVisible(FragmentActivity host) {
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(InterstitialWebViewDialogFragment.TAG);
        if (findFragmentByTag != null && findFragmentByTag.isAdded()) {
            return true;
        }
        Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(InterstitialVideoDialogFragment.TAG);
        return findFragmentByTag2 != null && findFragmentByTag2.isAdded();
    }

    private final boolean isAnyImmersiveVisible(FragmentActivity host) {
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (isInterstitialVisible(host)) {
            return true;
        }
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(PresentationWebViewDialogFragment.TAG);
        return findFragmentByTag != null && findFragmentByTag.isAdded();
    }
}
