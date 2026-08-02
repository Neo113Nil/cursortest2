package org.betup.presentation;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.presentation.GetActivePresentationsInteractor;
import org.betup.model.remote.api.rest.presentation.GetPresentationScreenRegistryInteractor;
import org.betup.model.remote.api.rest.presentation.PostPresentationActionInteractor;
import org.betup.model.remote.api.rest.presentation.PostPresentationActionRequest;
import org.betup.model.remote.api.rest.presentation.PresentationActionType;
import org.betup.model.remote.api.rest.presentation.PresentationEligibilityContext;
import org.betup.model.remote.entity.presentation.PresentationCampaignDto;
import org.betup.model.remote.entity.presentation.PresentationScreenRegistryDto;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.ui.dialogs.presentation.PresentationWebViewDialogFragment;
import org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeHandler;
import org.betup.utils.DeferredOverlayQueue;
import org.betup.utils.DialogManager;
import org.betup.utils.ExternalOverlayDeferral;
import org.betup.utils.FragmentDialogSafeOps;
import org.betup.utils.FragmentSafeOps;
import org.betup.utils.PresentationOverlayGate;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationCoordinator.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0014J\u0006\u0010%\u001a\u00020\"J\b\u0010&\u001a\u00020\"H\u0002J\u0006\u0010'\u001a\u00020\"J\u0014\u0010(\u001a\u00020\"2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0011H\u0002J\u0012\u0010.\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010\u0011H\u0002J\u0014\u0010/\u001a\u00020\"2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u00101\u001a\u00020\"H\u0002J\u0006\u00102\u001a\u00020\"J\u001e\u00103\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J \u00104\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011H\u0002J\u0010\u00105\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0014H\u0002J\u0018\u00106\u001a\u0002072\u0006\u0010$\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0011H\u0002J\b\u00109\u001a\u00020\"H\u0002J\u0010\u0010:\u001a\u0002072\u0006\u0010$\u001a\u00020\u0014H\u0002J\u0010\u0010;\u001a\u0002072\u0006\u0010$\u001a\u00020\u0014H\u0002J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020\"H\u0002J \u0010@\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010A\u001a\u00020B2\u0006\u0010)\u001a\u00020\u0011H\u0002J\u0016\u0010C\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u001b\u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00110\u0011 \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u001e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lorg/betup/presentation/PresentationCoordinator;", "", "getActivePresentationsInteractor", "Lorg/betup/model/remote/api/rest/presentation/GetActivePresentationsInteractor;", "getScreenRegistryInteractor", "Lorg/betup/model/remote/api/rest/presentation/GetPresentationScreenRegistryInteractor;", "screenRegistryStore", "Lorg/betup/presentation/PresentationScreenRegistryStore;", "presentationScreens", "Lorg/betup/presentation/PresentationScreens;", "screenTracker", "Lorg/betup/presentation/ScreenTracker;", "postPresentationActionInteractor", "Lorg/betup/model/remote/api/rest/presentation/PostPresentationActionInteractor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/presentation/GetActivePresentationsInteractor;Lorg/betup/model/remote/api/rest/presentation/GetPresentationScreenRegistryInteractor;Lorg/betup/presentation/PresentationScreenRegistryStore;Lorg/betup/presentation/PresentationScreens;Lorg/betup/presentation/ScreenTracker;Lorg/betup/model/remote/api/rest/presentation/PostPresentationActionInteractor;)V", "tag", "", "hostRef", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentActivity;", "campaignsCache", "", "Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "isShowing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShowInProgress", "sessionSuppressedCampaignIds", "", "kotlin.jvm.PlatformType", "", "activeCampaignId", "screenListener", "Lkotlin/Function1;", "", "bind", "host", "unbind", "syncScreenRegistry", "onPresentationDismissed", "invalidateEligibilityCache", "screenKey", "filterClientSuppressed", "campaigns", "suppressCampaign", "campaignId", "releaseFailedCampaign", "resetAfterFailedShow", "failedCampaignId", "resetPresentationFlags", "refreshAndShowIfEligible", "showTopPriorityEligible", "verifyPresentationAttached", "reconcileShowingState", "tryAcquireShowAttempt", "", "reason", "releaseShowAttempt", "isHostReadyForPresentation", "isPresentationVisible", "createBridgeHandler", "Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeHandler;", "campaign", "dismissPresentationDialog", "sendAction", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "Lorg/betup/model/remote/api/rest/presentation/PresentationActionType;", "trackImpressionIfNeeded", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationCoordinator {
    public static final int $stable = 8;
    private String activeCampaignId;
    private List<PresentationCampaignDto> campaignsCache;
    private final GetActivePresentationsInteractor getActivePresentationsInteractor;
    private final GetPresentationScreenRegistryInteractor getScreenRegistryInteractor;
    private WeakReference<FragmentActivity> hostRef;
    private final AtomicBoolean isShowInProgress;
    private final AtomicBoolean isShowing;
    private final PostPresentationActionInteractor postPresentationActionInteractor;
    private final PresentationScreens presentationScreens;
    private final Function1<String, Unit> screenListener;
    private final PresentationScreenRegistryStore screenRegistryStore;
    private final ScreenTracker screenTracker;
    private final Set<String> sessionSuppressedCampaignIds;
    private final String tag;

    @Inject
    public PresentationCoordinator(GetActivePresentationsInteractor getActivePresentationsInteractor, GetPresentationScreenRegistryInteractor getScreenRegistryInteractor, PresentationScreenRegistryStore screenRegistryStore, PresentationScreens presentationScreens, ScreenTracker screenTracker, PostPresentationActionInteractor postPresentationActionInteractor) {
        Intrinsics.checkNotNullParameter(getActivePresentationsInteractor, "getActivePresentationsInteractor");
        Intrinsics.checkNotNullParameter(getScreenRegistryInteractor, "getScreenRegistryInteractor");
        Intrinsics.checkNotNullParameter(screenRegistryStore, "screenRegistryStore");
        Intrinsics.checkNotNullParameter(presentationScreens, "presentationScreens");
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        Intrinsics.checkNotNullParameter(postPresentationActionInteractor, "postPresentationActionInteractor");
        this.getActivePresentationsInteractor = getActivePresentationsInteractor;
        this.getScreenRegistryInteractor = getScreenRegistryInteractor;
        this.screenRegistryStore = screenRegistryStore;
        this.presentationScreens = presentationScreens;
        this.screenTracker = screenTracker;
        this.postPresentationActionInteractor = postPresentationActionInteractor;
        this.tag = "PresentationCoordinator";
        this.campaignsCache = CollectionsKt.emptyList();
        this.isShowing = new AtomicBoolean(false);
        this.isShowInProgress = new AtomicBoolean(false);
        this.sessionSuppressedCampaignIds = Collections.synchronizedSet(new LinkedHashSet());
        this.screenListener = new Function1() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit screenListener$lambda$0;
                screenListener$lambda$0 = PresentationCoordinator.screenListener$lambda$0(PresentationCoordinator.this, (String) obj);
                return screenListener$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit screenListener$lambda$0(PresentationCoordinator presentationCoordinator, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        presentationCoordinator.refreshAndShowIfEligible();
        return Unit.INSTANCE;
    }

    public final void bind(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.hostRef = new WeakReference<>(host);
        this.screenTracker.registerListener(this.screenListener);
        Log.d(this.tag, "bind: registered screen listener");
        syncScreenRegistry();
        refreshAndShowIfEligible();
    }

    public final void unbind() {
        this.screenTracker.unregisterListener(this.screenListener);
        Log.d(this.tag, "unbind: unregistered screen listener");
        this.hostRef = null;
    }

    private final void syncScreenRegistry() {
        this.getScreenRegistryInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                PresentationCoordinator.syncScreenRegistry$lambda$1(PresentationCoordinator.this, fetchedResponseMessage);
            }
        }, Unit.INSTANCE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncScreenRegistry$lambda$1(PresentationCoordinator presentationCoordinator, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            Log.d(presentationCoordinator.tag, "screen registry fetch failed: stat=" + fetchedResponseMessage.getStat());
        } else {
            presentationCoordinator.screenRegistryStore.apply((PresentationScreenRegistryDto) fetchedResponseMessage.getModel());
            Log.d(presentationCoordinator.tag, "screen registry loaded: screens=" + ((PresentationScreenRegistryDto) fetchedResponseMessage.getModel()).getScreens().size() + " groups=" + ((PresentationScreenRegistryDto) fetchedResponseMessage.getModel()).getGroups().size());
        }
    }

    public final void onPresentationDismissed() {
        FragmentActivity fragmentActivity;
        resetPresentationFlags();
        PresentationOverlayGate.onPresentationDismissed();
        this.activeCampaignId = null;
        invalidateEligibilityCache$default(this, null, 1, null);
        WeakReference<FragmentActivity> weakReference = this.hostRef;
        if (weakReference == null || (fragmentActivity = weakReference.get()) == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        FragmentSafeOps.INSTANCE.runAfterFragmentTransactions(fragmentActivity, new Function0() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onPresentationDismissed$lambda$2;
                onPresentationDismissed$lambda$2 = PresentationCoordinator.onPresentationDismissed$lambda$2(PresentationCoordinator.this);
                return onPresentationDismissed$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPresentationDismissed$lambda$2(PresentationCoordinator presentationCoordinator) {
        presentationCoordinator.refreshAndShowIfEligible();
        return Unit.INSTANCE;
    }

    static /* synthetic */ void invalidateEligibilityCache$default(PresentationCoordinator presentationCoordinator, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentationCoordinator.screenTracker.getCurrentScreenKey();
        }
        presentationCoordinator.invalidateEligibilityCache(str);
    }

    private final void invalidateEligibilityCache(String screenKey) {
        this.getActivePresentationsInteractor.invalidate(new PresentationEligibilityContext(screenKey));
    }

    private final List<PresentationCampaignDto> filterClientSuppressed(List<PresentationCampaignDto> campaigns) {
        if (this.sessionSuppressedCampaignIds.isEmpty()) {
            return campaigns;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : campaigns) {
            if (!this.sessionSuppressedCampaignIds.contains(((PresentationCampaignDto) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void suppressCampaign(String campaignId) {
        this.sessionSuppressedCampaignIds.add(campaignId);
    }

    private final void releaseFailedCampaign(String campaignId) {
        if (campaignId == null) {
            return;
        }
        this.sessionSuppressedCampaignIds.remove(campaignId);
    }

    static /* synthetic */ void resetAfterFailedShow$default(PresentationCoordinator presentationCoordinator, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentationCoordinator.activeCampaignId;
        }
        presentationCoordinator.resetAfterFailedShow(str);
    }

    private final void resetAfterFailedShow(String failedCampaignId) {
        Log.w(this.tag, "resetAfterFailedShow: clearing presentation state without auto-refresh");
        releaseFailedCampaign(failedCampaignId);
        this.activeCampaignId = null;
        resetPresentationFlags();
        PresentationOverlayGate.onPresentationDismissed();
    }

    private final void resetPresentationFlags() {
        this.isShowing.set(false);
        this.isShowInProgress.set(false);
    }

    public final void refreshAndShowIfEligible() {
        final FragmentActivity fragmentActivity;
        WeakReference<FragmentActivity> weakReference = this.hostRef;
        if (weakReference == null || (fragmentActivity = weakReference.get()) == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        reconcileShowingState(fragmentActivity);
        if (tryAcquireShowAttempt(fragmentActivity, "refreshAndShowIfEligible")) {
            String currentScreenKey = this.screenTracker.getCurrentScreenKey();
            Log.d(this.tag, "refreshAndShowIfEligible: requesting campaigns for screenKey=" + currentScreenKey);
            this.getActivePresentationsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda6
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    PresentationCoordinator.refreshAndShowIfEligible$lambda$5(PresentationCoordinator.this, fragmentActivity, fetchedResponseMessage);
                }
            }, new PresentationEligibilityContext(currentScreenKey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshAndShowIfEligible$lambda$5(PresentationCoordinator presentationCoordinator, FragmentActivity fragmentActivity, FetchedResponseMessage fetchedResponseMessage) {
        boolean z;
        try {
            if (!presentationCoordinator.isHostReadyForPresentation(fragmentActivity)) {
                Log.d(presentationCoordinator.tag, "host not ready after fetch, skip show");
                if (z) {
                    return;
                } else {
                    return;
                }
            }
            if (presentationCoordinator.isPresentationVisible(fragmentActivity)) {
                Log.d(presentationCoordinator.tag, "presentation already visible after fetch, skip show");
                if (presentationCoordinator.isShowing.get()) {
                    return;
                }
                presentationCoordinator.releaseShowAttempt();
                return;
            }
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
                Object model = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                presentationCoordinator.campaignsCache = (List) model;
                String str = presentationCoordinator.tag;
                int size = ((List) fetchedResponseMessage.getModel()).size();
                Object model2 = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNullExpressionValue(model2, "getModel(...)");
                Iterable iterable = (Iterable) model2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PresentationCampaignDto) it.next()).getId());
                }
                Log.d(str, "campaign fetch success: count=" + size + " ids=" + arrayList);
                Object model3 = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNullExpressionValue(model3, "getModel(...)");
                presentationCoordinator.showTopPriorityEligible(fragmentActivity, presentationCoordinator.filterClientSuppressed((List) model3));
                if (presentationCoordinator.isShowing.get()) {
                    return;
                }
                presentationCoordinator.releaseShowAttempt();
                return;
            }
            Log.d(presentationCoordinator.tag, "campaign fetch failed: stat=" + fetchedResponseMessage.getStat());
            if (presentationCoordinator.isShowing.get()) {
                return;
            }
            presentationCoordinator.releaseShowAttempt();
        } finally {
            if (!presentationCoordinator.isShowing.get()) {
                presentationCoordinator.releaseShowAttempt();
            }
        }
    }

    private final void showTopPriorityEligible(final FragmentActivity host, List<PresentationCampaignDto> campaigns) {
        if (isPresentationVisible(host)) {
            Log.d(this.tag, "showTopPriorityEligible: dialog already on screen");
            return;
        }
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogManager.reconcileTrackedDialogsWith(supportFragmentManager);
        if (ExternalOverlayDeferral.shouldDefer(host) || DialogManager.hasTrackedDialogShowing()) {
            Log.d(this.tag, "showTopPriorityEligible: other overlay visible — deferring");
            releaseShowAttempt();
            DeferredOverlayQueue.enqueue(host, new Runnable() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    PresentationCoordinator.this.refreshAndShowIfEligible();
                }
            });
            return;
        }
        if (!this.isShowing.compareAndSet(false, true)) {
            Log.d(this.tag, "showTopPriorityEligible: another presentation is already visible");
            return;
        }
        releaseShowAttempt();
        if (campaigns.isEmpty()) {
            this.isShowing.set(false);
            Log.d(this.tag, "showTopPriorityEligible: no campaigns from backend");
            return;
        }
        final Date date = new Date();
        final String currentScreenKey = this.screenTracker.getCurrentScreenKey();
        List list = SequencesKt.toList(SequencesKt.sortedWith(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(campaigns), new Function1() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean showTopPriorityEligible$lambda$7;
                showTopPriorityEligible$lambda$7 = PresentationCoordinator.showTopPriorityEligible$lambda$7((PresentationCampaignDto) obj);
                return Boolean.valueOf(showTopPriorityEligible$lambda$7);
            }
        }), new Function1() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean showTopPriorityEligible$lambda$8;
                showTopPriorityEligible$lambda$8 = PresentationCoordinator.showTopPriorityEligible$lambda$8((PresentationCampaignDto) obj);
                return Boolean.valueOf(showTopPriorityEligible$lambda$8);
            }
        }), new Function1() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean showTopPriorityEligible$lambda$9;
                showTopPriorityEligible$lambda$9 = PresentationCoordinator.showTopPriorityEligible$lambda$9(date, (PresentationCampaignDto) obj);
                return Boolean.valueOf(showTopPriorityEligible$lambda$9);
            }
        }), new Function1() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean showTopPriorityEligible$lambda$10;
                showTopPriorityEligible$lambda$10 = PresentationCoordinator.showTopPriorityEligible$lambda$10(date, (PresentationCampaignDto) obj);
                return Boolean.valueOf(showTopPriorityEligible$lambda$10);
            }
        }), new Function1() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean showTopPriorityEligible$lambda$12;
                showTopPriorityEligible$lambda$12 = PresentationCoordinator.showTopPriorityEligible$lambda$12(PresentationCoordinator.this, currentScreenKey, (PresentationCampaignDto) obj);
                return Boolean.valueOf(showTopPriorityEligible$lambda$12);
            }
        }), new Comparator() { // from class: org.betup.presentation.PresentationCoordinator$showTopPriorityEligible$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((PresentationCampaignDto) t2).getPriority()), Integer.valueOf(((PresentationCampaignDto) t).getPriority()));
            }
        }));
        if (list.isEmpty()) {
            this.isShowing.set(false);
            Log.d(this.tag, "showTopPriorityEligible: no eligible campaigns for screenKey=" + currentScreenKey);
            return;
        }
        final PresentationCampaignDto presentationCampaignDto = (PresentationCampaignDto) CollectionsKt.first(list);
        Log.d(this.tag, "showTopPriorityEligible: selectedCampaign=" + presentationCampaignDto.getId() + " priority=" + presentationCampaignDto.getPriority() + " screenKey=" + currentScreenKey);
        this.activeCampaignId = presentationCampaignDto.getId();
        suppressCampaign(presentationCampaignDto.getId());
        PresentationOverlayGate.onPresentationShown(host, new Function0() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showTopPriorityEligible$lambda$16;
                showTopPriorityEligible$lambda$16 = PresentationCoordinator.showTopPriorityEligible$lambda$16(PresentationCampaignDto.this, this, currentScreenKey, host);
                return showTopPriorityEligible$lambda$16;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTopPriorityEligible$lambda$7(PresentationCampaignDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTopPriorityEligible$lambda$8(PresentationCampaignDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getRemoteUrl() != null && (!StringsKt.isBlank(r0))) {
            return true;
        }
        String htmlContent = it.getHtmlContent();
        return htmlContent != null && (StringsKt.isBlank(htmlContent) ^ true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTopPriorityEligible$lambda$9(Date date, PresentationCampaignDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getStartAt() == null || date.after(it.getStartAt()) || Intrinsics.areEqual(date, it.getStartAt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTopPriorityEligible$lambda$10(Date date, PresentationCampaignDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEndAt() == null || date.before(it.getEndAt()) || Intrinsics.areEqual(date, it.getEndAt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTopPriorityEligible$lambda$12(PresentationCoordinator presentationCoordinator, String str, PresentationCampaignDto campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        if (!campaign.getScreenKeys().isEmpty()) {
            List<String> screenKeys = campaign.getScreenKeys();
            if (!(screenKeys instanceof Collection) || !screenKeys.isEmpty()) {
                Iterator<T> it = screenKeys.iterator();
                while (it.hasNext()) {
                    if (presentationCoordinator.presentationScreens.matchesCampaignScreen((String) it.next(), str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTopPriorityEligible$lambda$16(PresentationCampaignDto presentationCampaignDto, PresentationCoordinator presentationCoordinator, String str, FragmentActivity fragmentActivity) {
        Object m10853constructorimpl;
        PresentationWebViewDialogFragment newInstance = PresentationWebViewDialogFragment.INSTANCE.newInstance(presentationCampaignDto, presentationCoordinator.createBridgeHandler(presentationCampaignDto, str));
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            if (supportFragmentManager.findFragmentByTag(PresentationWebViewDialogFragment.TAG) != null) {
                Log.d(presentationCoordinator.tag, "showTopPriorityEligible: duplicate tag detected, skip show()");
                resetAfterFailedShow$default(presentationCoordinator, null, 1, null);
            } else {
                newInstance.show(supportFragmentManager, PresentationWebViewDialogFragment.TAG);
                presentationCoordinator.verifyPresentationAttached(fragmentActivity, presentationCampaignDto.getId(), str);
            }
            m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m10856exceptionOrNullimpl = Result.m10856exceptionOrNullimpl(m10853constructorimpl);
        if (m10856exceptionOrNullimpl != null) {
            Log.e(presentationCoordinator.tag, "Failed to show presentation", m10856exceptionOrNullimpl);
            resetAfterFailedShow$default(presentationCoordinator, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void verifyPresentationAttached(final FragmentActivity host, final String campaignId, final String screenKey) {
        FragmentSafeOps.INSTANCE.runAfterFragmentTransactions(host, new Function0() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit verifyPresentationAttached$lambda$18;
                verifyPresentationAttached$lambda$18 = PresentationCoordinator.verifyPresentationAttached$lambda$18(FragmentActivity.this, this, campaignId, screenKey);
                return verifyPresentationAttached$lambda$18;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyPresentationAttached$lambda$18(final FragmentActivity fragmentActivity, final PresentationCoordinator presentationCoordinator, final String str, final String str2) {
        FragmentSafeOps fragmentSafeOps = FragmentSafeOps.INSTANCE;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        fragmentSafeOps.executePendingTransactionsSafely(supportFragmentManager);
        if (presentationCoordinator.isPresentationVisible(fragmentActivity)) {
            presentationCoordinator.trackImpressionIfNeeded(str, str2);
            return Unit.INSTANCE;
        }
        FragmentSafeOps.INSTANCE.runAfterFragmentTransactions(fragmentActivity, new Function0() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit verifyPresentationAttached$lambda$18$lambda$17;
                verifyPresentationAttached$lambda$18$lambda$17 = PresentationCoordinator.verifyPresentationAttached$lambda$18$lambda$17(PresentationCoordinator.this, fragmentActivity, str, str2);
                return verifyPresentationAttached$lambda$18$lambda$17;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyPresentationAttached$lambda$18$lambda$17(PresentationCoordinator presentationCoordinator, FragmentActivity fragmentActivity, String str, String str2) {
        if (!presentationCoordinator.isPresentationVisible(fragmentActivity)) {
            Log.e(presentationCoordinator.tag, "showTopPriorityEligible: show() did not attach dialog");
            resetAfterFailedShow$default(presentationCoordinator, null, 1, null);
        } else {
            presentationCoordinator.trackImpressionIfNeeded(str, str2);
        }
        return Unit.INSTANCE;
    }

    private final void reconcileShowingState(FragmentActivity host) {
        boolean isPresentationVisible = isPresentationVisible(host);
        if (this.isShowing.get() && !isPresentationVisible) {
            Log.d(this.tag, "reconcileShowingState: stale isShowing, clearing");
            resetPresentationFlags();
            PresentationOverlayGate.onPresentationDismissed();
        } else {
            if (this.isShowing.get() || !isPresentationVisible) {
                return;
            }
            Log.d(this.tag, "reconcileShowingState: dialog visible without flag, syncing");
            this.isShowing.set(true);
            PresentationOverlayGate.onPresentationShown$default(host, null, 2, null);
        }
    }

    private final boolean tryAcquireShowAttempt(FragmentActivity host, String reason) {
        if (PresentationOverlayGate.isActive() && isPresentationVisible(host)) {
            Log.d(this.tag, reason + ": blocked, presentation overlay active");
            return false;
        }
        if (this.isShowing.get() || isPresentationVisible(host)) {
            Log.d(this.tag, reason + ": blocked, presentation already showing");
            return false;
        }
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogManager.reconcileTrackedDialogsWith(supportFragmentManager);
        if (ExternalOverlayDeferral.shouldDefer(host) || DialogManager.hasTrackedDialogShowing()) {
            Log.d(this.tag, reason + ": blocked, other overlay visible — deferring");
            DeferredOverlayQueue.enqueue(host, new Runnable() { // from class: org.betup.presentation.PresentationCoordinator$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PresentationCoordinator.this.refreshAndShowIfEligible();
                }
            });
            return false;
        }
        if (this.isShowInProgress.compareAndSet(false, true)) {
            return true;
        }
        Log.d(this.tag, reason + ": blocked, another show attempt in progress");
        return false;
    }

    private final void releaseShowAttempt() {
        this.isShowInProgress.set(false);
    }

    private final boolean isHostReadyForPresentation(FragmentActivity host) {
        return (host.isFinishing() || host.isDestroyed()) ? false : true;
    }

    private final boolean isPresentationVisible(FragmentActivity host) {
        Fragment findFragmentByTag = host.getSupportFragmentManager().findFragmentByTag(PresentationWebViewDialogFragment.TAG);
        return findFragmentByTag != null && findFragmentByTag.isAdded();
    }

    private final PresentationWebViewBridgeHandler createBridgeHandler(final PresentationCampaignDto campaign, final String screenKey) {
        return new PresentationWebViewBridgeHandler() { // from class: org.betup.presentation.PresentationCoordinator$createBridgeHandler$1
            @Override // org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeHandler
            public void onClose() {
                PresentationCoordinator.this.sendAction(campaign.getId(), PresentationActionType.CLOSE, screenKey);
                AnalyticsHelper.INSTANCE.logPresentationClosed(campaign.getId(), screenKey);
                PresentationCoordinator.this.dismissPresentationDialog();
            }

            @Override // org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeHandler
            public void onSkip() {
                if (campaign.getAllowSkip()) {
                    PresentationCoordinator.this.sendAction(campaign.getId(), PresentationActionType.SKIP, screenKey);
                    AnalyticsHelper.INSTANCE.logPresentationSkipped(campaign.getId(), screenKey);
                    PresentationCoordinator.this.dismissPresentationDialog();
                    return;
                }
                onClose();
            }

            @Override // org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeHandler
            public void onRemindLater() {
                if (campaign.getAllowRemindLater()) {
                    PresentationCoordinator.this.sendAction(campaign.getId(), PresentationActionType.LATER, screenKey);
                    AnalyticsHelper.INSTANCE.logPresentationRemindLater(campaign.getId(), screenKey);
                    PresentationCoordinator.this.dismissPresentationDialog();
                    return;
                }
                onClose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissPresentationDialog() {
        FragmentActivity fragmentActivity;
        WeakReference<FragmentActivity> weakReference = this.hostRef;
        if (weakReference == null || (fragmentActivity = weakReference.get()) == null) {
            return;
        }
        Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(PresentationWebViewDialogFragment.TAG);
        PresentationWebViewDialogFragment presentationWebViewDialogFragment = findFragmentByTag instanceof PresentationWebViewDialogFragment ? (PresentationWebViewDialogFragment) findFragmentByTag : null;
        if (presentationWebViewDialogFragment != null) {
            FragmentDialogSafeOps.INSTANCE.dismissAllowingStateLoss(presentationWebViewDialogFragment);
        }
        onPresentationDismissed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAction(String campaignId, PresentationActionType actionType, String screenKey) {
        Log.d(this.tag, "sendAction: campaignId=" + campaignId + " actionType=" + actionType + " screenKey=" + screenKey);
        suppressCampaign(campaignId);
        invalidateEligibilityCache(screenKey);
        this.postPresentationActionInteractor.load(null, new PostPresentationActionRequest(campaignId, actionType, screenKey));
    }

    public final void trackImpressionIfNeeded(String campaignId, String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        Log.d(this.tag, "trackImpressionIfNeeded: campaignId=" + campaignId + " screenKey=" + screenKey);
        sendAction(campaignId, PresentationActionType.IMPRESSION, screenKey);
        AnalyticsHelper.INSTANCE.logPresentationShown(campaignId, screenKey);
    }
}
