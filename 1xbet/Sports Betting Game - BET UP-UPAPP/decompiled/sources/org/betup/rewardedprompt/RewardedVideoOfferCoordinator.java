package org.betup.rewardedprompt;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.GetEligibleRewardedPromptsInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.GetRewardedPromptCampaignInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.PostRewardedPromptActionInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.PostRewardedPromptActionRequest;
import org.betup.model.remote.api.rest.rewardedprompt.RewardedPromptActionType;
import org.betup.model.remote.api.rest.rewardedprompt.RewardedPromptCampaignRequest;
import org.betup.model.remote.api.rest.rewardedprompt.RewardedPromptEligibilityRequest;
import org.betup.model.remote.api.rest.videoRewards.GetVideoRewardForPlacementStateInteractor;
import org.betup.model.remote.entity.rewardedprompt.RewardedPromptCampaignDto;
import org.betup.model.remote.entity.videoRewards.VideoRewardForPlacementState;
import org.betup.presentation.ScreenTracker;
import org.betup.services.offer.PromoParams;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.dialogs.RewardedVideoOfferDialogFragment;
import org.betup.utils.DeferredOverlayQueue;
import org.betup.utils.DialogManager;
import org.betup.utils.ExternalOverlayDeferral;
import org.betup.utils.FragmentSafeOps;
import org.betup.utils.ImmersiveOverlayGate;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedVideoOfferCoordinator.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 T2\u00020\u0001:\u0002STB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0014J\u0006\u0010&\u001a\u00020#J\u0006\u0010'\u001a\u00020(J.\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001aJ\"\u0010.\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010/\u001a\u00020(2\b\b\u0002\u00100\u001a\u00020(J\u000e\u00101\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001aJ\u000e\u00102\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001aJ\u000e\u00103\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001aJ6\u00104\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u001aH\u0002J\b\u00107\u001a\u00020#H\u0002J4\u00108\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00142\u0006\u00109\u001a\u00020:2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u0010;\u001a\u00020\u001aH\u0002J,\u0010<\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00142\u0006\u00109\u001a\u00020:2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u00106\u001a\u0004\u0018\u00010\u001aH\u0002J<\u0010=\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00142\u0006\u00109\u001a\u00020:2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u00106\u001a\u0004\u0018\u00010\u001aH\u0002J4\u0010B\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00142\u0006\u00109\u001a\u00020:2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u0010@\u001a\u00020AH\u0002J4\u0010C\u001a\u00020#2\u0006\u00109\u001a\u00020:2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u0010@\u001a\u00020A2\u0006\u0010D\u001a\u00020(H\u0002J0\u0010E\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020G2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010H\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001aH\u0002J6\u0010I\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0006\u0010J\u001a\u00020\u001aH\u0002J\u0010\u0010K\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001aH\u0002J\"\u0010L\u001a\u00020#2\u0006\u0010M\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020\u001a2\b\b\u0002\u0010N\u001a\u00020(H\u0002J\b\u0010O\u001a\u00020#H\u0002J\u0010\u0010P\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010Q\u001a\u00020(2\u0006\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010R\u001a\u00020(2\u0006\u0010%\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0018\u001a&\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\u001c0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lorg/betup/rewardedprompt/RewardedVideoOfferCoordinator;", "", "getEligibleRewardedPromptsInteractor", "Lorg/betup/model/remote/api/rest/rewardedprompt/GetEligibleRewardedPromptsInteractor;", "getRewardedPromptCampaignInteractor", "Lorg/betup/model/remote/api/rest/rewardedprompt/GetRewardedPromptCampaignInteractor;", "postRewardedPromptActionInteractor", "Lorg/betup/model/remote/api/rest/rewardedprompt/PostRewardedPromptActionInteractor;", "getVideoRewardForPlacementStateInteractor", "Lorg/betup/model/remote/api/rest/videoRewards/GetVideoRewardForPlacementStateInteractor;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "screenTracker", "Lorg/betup/presentation/ScreenTracker;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/rewardedprompt/GetEligibleRewardedPromptsInteractor;Lorg/betup/model/remote/api/rest/rewardedprompt/GetRewardedPromptCampaignInteractor;Lorg/betup/model/remote/api/rest/rewardedprompt/PostRewardedPromptActionInteractor;Lorg/betup/model/remote/api/rest/videoRewards/GetVideoRewardForPlacementStateInteractor;Lorg/betup/services/offer/VideoRewardService;Lorg/betup/presentation/ScreenTracker;)V", "mainHandler", "Landroid/os/Handler;", "hostRef", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentActivity;", "isShowing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShowInProgress", "sessionSuppressedCampaignIds", "", "", "kotlin.jvm.PlatformType", "", "lastEligibleScreenKey", "pendingPush", "Lorg/betup/rewardedprompt/RewardedVideoOfferCoordinator$PendingPushShow;", "lastShownMeta", "screenListener", "Lkotlin/Function1;", "", "bind", "host", "unbind", "isOfferShowing", "", "showCampaignFromPush", "campaignId", "eventKey", X3.k, "contextParamsJson", "onDialogDismissed", "dismissedWithoutWatch", "forcedByOverlay", "onWatchStarted", "markCampaignConsumed", "onWatchCompleted", "fetchAndShowPush", "clearSessionSuppressIfScreenChanged", "screenKey", "refreshAndShowIfEligibleForScreen", "prepareAndShow", "campaign", "Lorg/betup/model/remote/entity/rewardedprompt/RewardedPromptCampaignDto;", "source", "scheduleCampaignRetry", "showDialog", "placement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", "prizeAmount", "", "awaitDeferredDialogAppearance", "onDialogActuallyVisible", "alreadyVisible", "postAction", "action", "Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptActionType;", "warmVideoPlacement", "savePendingPush", "reason", "clearPendingPushIfSame", "releaseShowAttempt", "step", "asWait", "flushPendingPush", "reconcileShowingState", "isOwnDialogVisible", "isHostReady", "PendingPushShow", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewardedVideoOfferCoordinator {
    private static final long RETRY_BUSY_DELAY_MS = 350;
    private final GetEligibleRewardedPromptsInteractor getEligibleRewardedPromptsInteractor;
    private final GetRewardedPromptCampaignInteractor getRewardedPromptCampaignInteractor;
    private final GetVideoRewardForPlacementStateInteractor getVideoRewardForPlacementStateInteractor;
    private WeakReference<FragmentActivity> hostRef;
    private final AtomicBoolean isShowInProgress;
    private final AtomicBoolean isShowing;
    private volatile String lastEligibleScreenKey;
    private volatile PendingPushShow lastShownMeta;
    private final Handler mainHandler;
    private volatile PendingPushShow pendingPush;
    private final PostRewardedPromptActionInteractor postRewardedPromptActionInteractor;
    private final Function1<String, Unit> screenListener;
    private final ScreenTracker screenTracker;
    private final Set<String> sessionSuppressedCampaignIds;
    private final VideoRewardService videoRewardService;
    public static final int $stable = 8;

    @Inject
    public RewardedVideoOfferCoordinator(GetEligibleRewardedPromptsInteractor getEligibleRewardedPromptsInteractor, GetRewardedPromptCampaignInteractor getRewardedPromptCampaignInteractor, PostRewardedPromptActionInteractor postRewardedPromptActionInteractor, GetVideoRewardForPlacementStateInteractor getVideoRewardForPlacementStateInteractor, VideoRewardService videoRewardService, ScreenTracker screenTracker) {
        Intrinsics.checkNotNullParameter(getEligibleRewardedPromptsInteractor, "getEligibleRewardedPromptsInteractor");
        Intrinsics.checkNotNullParameter(getRewardedPromptCampaignInteractor, "getRewardedPromptCampaignInteractor");
        Intrinsics.checkNotNullParameter(postRewardedPromptActionInteractor, "postRewardedPromptActionInteractor");
        Intrinsics.checkNotNullParameter(getVideoRewardForPlacementStateInteractor, "getVideoRewardForPlacementStateInteractor");
        Intrinsics.checkNotNullParameter(videoRewardService, "videoRewardService");
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        this.getEligibleRewardedPromptsInteractor = getEligibleRewardedPromptsInteractor;
        this.getRewardedPromptCampaignInteractor = getRewardedPromptCampaignInteractor;
        this.postRewardedPromptActionInteractor = postRewardedPromptActionInteractor;
        this.getVideoRewardForPlacementStateInteractor = getVideoRewardForPlacementStateInteractor;
        this.videoRewardService = videoRewardService;
        this.screenTracker = screenTracker;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.isShowing = new AtomicBoolean(false);
        this.isShowInProgress = new AtomicBoolean(false);
        this.sessionSuppressedCampaignIds = Collections.synchronizedSet(new LinkedHashSet());
        this.screenListener = new Function1() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit screenListener$lambda$0;
                screenListener$lambda$0 = RewardedVideoOfferCoordinator.screenListener$lambda$0(RewardedVideoOfferCoordinator.this, (String) obj);
                return screenListener$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RewardedVideoOfferCoordinator.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/betup/rewardedprompt/RewardedVideoOfferCoordinator$PendingPushShow;", "", "campaignId", "", "eventKey", X3.k, "contextParamsJson", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "getEventKey", "getPlacementId", "getContextParamsJson", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class PendingPushShow {
        private final String campaignId;
        private final String contextParamsJson;
        private final String eventKey;
        private final String placementId;

        public static /* synthetic */ PendingPushShow copy$default(PendingPushShow pendingPushShow, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingPushShow.campaignId;
            }
            if ((i & 2) != 0) {
                str2 = pendingPushShow.eventKey;
            }
            if ((i & 4) != 0) {
                str3 = pendingPushShow.placementId;
            }
            if ((i & 8) != 0) {
                str4 = pendingPushShow.contextParamsJson;
            }
            return pendingPushShow.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCampaignId() {
            return this.campaignId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEventKey() {
            return this.eventKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPlacementId() {
            return this.placementId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContextParamsJson() {
            return this.contextParamsJson;
        }

        public final PendingPushShow copy(String campaignId, String eventKey, String placementId, String contextParamsJson) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            return new PendingPushShow(campaignId, eventKey, placementId, contextParamsJson);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingPushShow)) {
                return false;
            }
            PendingPushShow pendingPushShow = (PendingPushShow) other;
            return Intrinsics.areEqual(this.campaignId, pendingPushShow.campaignId) && Intrinsics.areEqual(this.eventKey, pendingPushShow.eventKey) && Intrinsics.areEqual(this.placementId, pendingPushShow.placementId) && Intrinsics.areEqual(this.contextParamsJson, pendingPushShow.contextParamsJson);
        }

        public int hashCode() {
            int hashCode = this.campaignId.hashCode() * 31;
            String str = this.eventKey;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.contextParamsJson;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "PendingPushShow(campaignId=" + this.campaignId + ", eventKey=" + this.eventKey + ", placementId=" + this.placementId + ", contextParamsJson=" + this.contextParamsJson + ")";
        }

        public PendingPushShow(String campaignId, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            this.campaignId = campaignId;
            this.eventKey = str;
            this.placementId = str2;
            this.contextParamsJson = str3;
        }

        public /* synthetic */ PendingPushShow(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4);
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getEventKey() {
            return this.eventKey;
        }

        public final String getPlacementId() {
            return this.placementId;
        }

        public final String getContextParamsJson() {
            return this.contextParamsJson;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit screenListener$lambda$0(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String screenKey) {
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        rewardedVideoOfferCoordinator.clearSessionSuppressIfScreenChanged(screenKey);
        RewardedPromptFlowLog.step("SCREEN", "screen changed → key=" + screenKey + " context=" + rewardedVideoOfferCoordinator.screenTracker.getCurrentContext() + " — try eligible");
        rewardedVideoOfferCoordinator.refreshAndShowIfEligibleForScreen();
        return Unit.INSTANCE;
    }

    public final void bind(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.hostRef = new WeakReference<>(host);
        this.screenTracker.registerListener(this.screenListener);
        String overlaySnapshot = RewardedPromptFlowLog.overlaySnapshot(host);
        String currentScreenKey = this.screenTracker.getCurrentScreenKey();
        PendingPushShow pendingPushShow = this.pendingPush;
        RewardedPromptFlowLog.ok("BIND", "host bound. " + overlaySnapshot + " screen=" + currentScreenKey + " pendingPush=" + (pendingPushShow != null ? pendingPushShow.getCampaignId() : null) + " inProgress=" + this.isShowInProgress.get() + " showing=" + this.isShowing.get());
        reconcileShowingState(host);
        if (this.isShowInProgress.get() && !isOwnDialogVisible(host) && !this.isShowing.get()) {
            RewardedPromptFlowLog.wait("BIND", "stale isShowInProgress after bind — clearing");
            this.isShowInProgress.set(false);
        }
        flushPendingPush();
        refreshAndShowIfEligibleForScreen();
    }

    public final void unbind() {
        PendingPushShow pendingPushShow = this.pendingPush;
        RewardedPromptFlowLog.step("UNBIND", "host cleared — keeping pendingPush=" + (pendingPushShow != null ? pendingPushShow.getCampaignId() : null) + " for next bind");
        this.screenTracker.unregisterListener(this.screenListener);
        this.isShowing.set(false);
        this.isShowInProgress.set(false);
        this.hostRef = null;
    }

    public final boolean isOfferShowing() {
        return this.isShowing.get() || DialogManager.isDialogShowing(RewardedVideoOfferDialogFragment.TAG);
    }

    public static /* synthetic */ void showCampaignFromPush$default(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        rewardedVideoOfferCoordinator.showCampaignFromPush(str, str2, str3, str4);
    }

    public final void showCampaignFromPush(final String campaignId, final String eventKey, final String placementId, final String contextParamsJson) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        RewardedPromptFlowLog.step("PUSH_1", "showCampaignFromPush ENTER campaignId=" + campaignId + " eventKey=" + eventKey + " placementId=" + placementId + " contextParams=" + contextParamsJson);
        if (this.sessionSuppressedCampaignIds.remove(campaignId)) {
            RewardedPromptFlowLog.ok("PUSH_1", "cleared session suppress for campaignId=" + campaignId + " (new push)");
        }
        WeakReference<FragmentActivity> weakReference = this.hostRef;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || !isHostReady(fragmentActivity)) {
            savePendingPush(campaignId, eventKey, placementId, contextParamsJson, "host unavailable");
            RewardedPromptFlowLog.wait("PUSH_1", "host unavailable — saved pendingPush (null=" + (fragmentActivity == null) + " finishing=" + (fragmentActivity != null ? Boolean.valueOf(fragmentActivity.isFinishing()) : null) + " destroyed=" + (fragmentActivity != null ? Boolean.valueOf(fragmentActivity.isDestroyed()) : null) + ")");
            return;
        }
        reconcileShowingState(fragmentActivity);
        RewardedPromptFlowLog.step("PUSH_2", RewardedPromptFlowLog.overlaySnapshot(fragmentActivity));
        if (isOwnDialogVisible(fragmentActivity) || this.isShowing.get()) {
            savePendingPush(campaignId, eventKey, placementId, contextParamsJson, "already showing");
            RewardedPromptFlowLog.wait("PUSH_2", "already showing — saved pendingPush for after dismiss isShowing=" + this.isShowing.get() + " fragmentVisible=" + isOwnDialogVisible(fragmentActivity));
            return;
        }
        warmVideoPlacement(placementId);
        if (ExternalOverlayDeferral.shouldDefer(fragmentActivity) || ImmersiveOverlayGate.isActive()) {
            RewardedPromptFlowLog.wait("PUSH_3", "overlay blocks show — enqueue. " + RewardedPromptFlowLog.overlaySnapshot(fragmentActivity));
            DeferredOverlayQueue.enqueue(fragmentActivity, new Runnable() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    RewardedVideoOfferCoordinator.showCampaignFromPush$lambda$1(RewardedVideoOfferCoordinator.this, campaignId, eventKey, placementId, contextParamsJson);
                }
            });
        } else if (!this.isShowInProgress.compareAndSet(false, true)) {
            savePendingPush(campaignId, eventKey, placementId, contextParamsJson, "show in progress");
            RewardedPromptFlowLog.wait("PUSH_4", "isShowInProgress already true — saved pendingPush campaignId=" + campaignId);
        } else {
            fetchAndShowPush(fragmentActivity, campaignId, eventKey, placementId, contextParamsJson);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCampaignFromPush$lambda$1(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, String str2, String str3, String str4) {
        RewardedPromptFlowLog.step("PUSH_3_RETRY", "DeferredOverlayQueue fired — retry push show");
        rewardedVideoOfferCoordinator.showCampaignFromPush(str, str2, str3, str4);
    }

    public static /* synthetic */ void onDialogDismissed$default(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        rewardedVideoOfferCoordinator.onDialogDismissed(str, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r11 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDialogDismissed(String campaignId, boolean dismissedWithoutWatch, boolean forcedByOverlay) {
        boolean z = false;
        this.isShowing.set(false);
        this.isShowInProgress.set(false);
        if (campaignId != null && this.sessionSuppressedCampaignIds.contains(campaignId)) {
            z = true;
        }
        RewardedPromptFlowLog.step("DISMISS", "campaignId=" + campaignId + " withoutWatch=" + dismissedWithoutWatch + " forcedByOverlay=" + forcedByOverlay + " suppressed=" + z);
        if (forcedByOverlay && dismissedWithoutWatch) {
            if (campaignId != null && this.sessionSuppressedCampaignIds.contains(campaignId)) {
                RewardedPromptFlowLog.stop("DISMISS", "forced dismiss but already session-suppressed — no retry");
                flushPendingPush();
                return;
            }
            final PendingPushShow pendingPushShow = this.lastShownMeta;
            if (pendingPushShow != null) {
                if (!Intrinsics.areEqual(pendingPushShow.getCampaignId(), campaignId)) {
                    pendingPushShow = null;
                }
            }
            if (campaignId == null) {
                campaignId = "";
            }
            pendingPushShow = new PendingPushShow(campaignId, null, null, null);
            RewardedPromptFlowLog.wait("DISMISS", "forced by overlay — will retry push campaignId=" + pendingPushShow.getCampaignId());
            WeakReference<FragmentActivity> weakReference = this.hostRef;
            FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
            if (fragmentActivity != null && isHostReady(fragmentActivity) && !StringsKt.isBlank(pendingPushShow.getCampaignId())) {
                DeferredOverlayQueue.enqueue(fragmentActivity, new Runnable() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RewardedVideoOfferCoordinator.onDialogDismissed$lambda$3(RewardedVideoOfferCoordinator.this, pendingPushShow);
                    }
                });
                return;
            } else {
                if (StringsKt.isBlank(pendingPushShow.getCampaignId())) {
                    return;
                }
                savePendingPush(pendingPushShow.getCampaignId(), pendingPushShow.getEventKey(), pendingPushShow.getPlacementId(), pendingPushShow.getContextParamsJson(), "forced dismiss no host");
                return;
            }
        }
        if (campaignId != null) {
            this.sessionSuppressedCampaignIds.add(campaignId);
            if (!dismissedWithoutWatch || forcedByOverlay) {
                RewardedPromptFlowLog.step("DISMISS", "session-suppress campaignId=" + campaignId);
            } else {
                RewardedPromptFlowLog.step("DISMISS", "user closed without watch → POST DISMISS + session suppress");
                postAction$default(this, campaignId, RewardedPromptActionType.DISMISS, null, null, 12, null);
            }
        }
        flushPendingPush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDialogDismissed$lambda$3(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, PendingPushShow pendingPushShow) {
        rewardedVideoOfferCoordinator.showCampaignFromPush(pendingPushShow.getCampaignId(), pendingPushShow.getEventKey(), pendingPushShow.getPlacementId(), pendingPushShow.getContextParamsJson());
    }

    public final void onWatchStarted(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        RewardedPromptFlowLog.ok("WATCH", "WATCH_STARTED campaignId=" + campaignId);
        postAction$default(this, campaignId, RewardedPromptActionType.WATCH_STARTED, null, null, 12, null);
    }

    public final void markCampaignConsumed(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.sessionSuppressedCampaignIds.add(campaignId);
        RewardedPromptFlowLog.ok("WATCH", "campaign consumed (ad showing) campaignId=" + campaignId);
    }

    public final void onWatchCompleted(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.sessionSuppressedCampaignIds.add(campaignId);
        RewardedPromptFlowLog.ok("WATCH", "WATCH_COMPLETED campaignId=" + campaignId);
        postAction$default(this, campaignId, RewardedPromptActionType.WATCH_COMPLETED, null, null, 12, null);
    }

    private final void fetchAndShowPush(FragmentActivity host, final String campaignId, final String eventKey, final String placementId, final String contextParamsJson) {
        final String currentScreenKey = this.screenTracker.getCurrentScreenKey();
        Map<String, String> merge = RewardedPromptContextParams.INSTANCE.merge(this.screenTracker.getCurrentContext(), RewardedPromptContextParams.INSTANCE.fromJson(contextParamsJson));
        RewardedPromptFlowLog.ok("PUSH_5", "fetching campaign GET /rewarded-prompts/" + campaignId + " screenKey=" + currentScreenKey + " contextParams=" + merge);
        this.getRewardedPromptCampaignInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                RewardedVideoOfferCoordinator.fetchAndShowPush$lambda$4(RewardedVideoOfferCoordinator.this, campaignId, eventKey, placementId, contextParamsJson, currentScreenKey, fetchedResponseMessage);
            }
        }, new RewardedPromptCampaignRequest(campaignId, eventKey, currentScreenKey, merge));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchAndShowPush$lambda$4(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, String str2, String str3, String str4, String str5, FetchedResponseMessage fetchedResponseMessage) {
        WeakReference<FragmentActivity> weakReference = rewardedVideoOfferCoordinator.hostRef;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || !rewardedVideoOfferCoordinator.isHostReady(fragmentActivity)) {
            rewardedVideoOfferCoordinator.savePendingPush(str, str2, str3, str4, "host gone after fetch");
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "PUSH_6", "host not ready after campaign fetch — pendingPush saved", false, 4, null);
            return;
        }
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "PUSH_6", "campaign fetch FAILED stat=" + fetchedResponseMessage.getStat() + " modelNull=" + (fetchedResponseMessage.getModel() == null) + ". Check 401/NO_AUTH, campaign enabled, frequency caps, user tags, contextFilters.", false, 4, null);
            return;
        }
        RewardedPromptFlowLog.ok("PUSH_6", "campaign OK id=" + ((RewardedPromptCampaignDto) fetchedResponseMessage.getModel()).getId() + " placement=" + ((RewardedPromptCampaignDto) fetchedResponseMessage.getModel()).getPlacementId() + " enabled=" + ((RewardedPromptCampaignDto) fetchedResponseMessage.getModel()).getEnabled());
        rewardedVideoOfferCoordinator.lastShownMeta = new PendingPushShow(str, str2, str3, str4);
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        rewardedVideoOfferCoordinator.prepareAndShow(fragmentActivity, (RewardedPromptCampaignDto) model, str2, str5, "PUSH");
    }

    private final void clearSessionSuppressIfScreenChanged(String screenKey) {
        String str = this.lastEligibleScreenKey;
        this.lastEligibleScreenKey = screenKey;
        if (str == null || Intrinsics.areEqual(str, screenKey) || this.sessionSuppressedCampaignIds.isEmpty()) {
            return;
        }
        this.sessionSuppressedCampaignIds.clear();
        RewardedPromptFlowLog.ok("SCREEN", "cleared session suppress (" + str + " → " + screenKey + ") — server cooldown/frequency decide next show");
    }

    private final void refreshAndShowIfEligibleForScreen() {
        WeakReference<FragmentActivity> weakReference = this.hostRef;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null) {
            RewardedPromptFlowLog.stop("SCREEN_1", "no host — skip eligible refresh");
            return;
        }
        if (!isHostReady(fragmentActivity)) {
            RewardedPromptFlowLog.stop("SCREEN_1", "host finishing/destroyed — skip eligible refresh");
            return;
        }
        reconcileShowingState(fragmentActivity);
        if (isOwnDialogVisible(fragmentActivity) || this.isShowing.get()) {
            RewardedPromptFlowLog.stop("SCREEN_2", "already showing — skip eligible");
            return;
        }
        if (this.pendingPush != null) {
            PendingPushShow pendingPushShow = this.pendingPush;
            RewardedPromptFlowLog.wait("SCREEN_2", "pending push waiting campaignId=" + (pendingPushShow != null ? pendingPushShow.getCampaignId() : null) + " — flush instead of eligible");
            flushPendingPush();
        } else if (ExternalOverlayDeferral.shouldDefer(fragmentActivity) || ImmersiveOverlayGate.isActive()) {
            RewardedPromptFlowLog.wait("SCREEN_3", "overlay blocks eligible — enqueue. " + RewardedPromptFlowLog.overlaySnapshot(fragmentActivity));
            DeferredOverlayQueue.enqueue(fragmentActivity, new Runnable() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    RewardedVideoOfferCoordinator.refreshAndShowIfEligibleForScreen$lambda$5(RewardedVideoOfferCoordinator.this);
                }
            });
        } else {
            if (!this.isShowInProgress.compareAndSet(false, true)) {
                RewardedPromptFlowLog.stop("SCREEN_4", "isShowInProgress already true — skip eligible");
                return;
            }
            final String currentScreenKey = this.screenTracker.getCurrentScreenKey();
            clearSessionSuppressIfScreenChanged(currentScreenKey);
            final Map<String, String> currentContext = this.screenTracker.getCurrentContext();
            RewardedPromptFlowLog.ok("SCREEN_5", "GET /rewarded-prompts/eligible?screenKey=" + currentScreenKey + " contextParams=" + currentContext);
            this.getEligibleRewardedPromptsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda7
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    RewardedVideoOfferCoordinator.refreshAndShowIfEligibleForScreen$lambda$8(RewardedVideoOfferCoordinator.this, currentScreenKey, currentContext, fetchedResponseMessage);
                }
            }, new RewardedPromptEligibilityRequest(null, currentScreenKey, currentContext, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshAndShowIfEligibleForScreen$lambda$5(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator) {
        RewardedPromptFlowLog.step("SCREEN_3_RETRY", "DeferredOverlayQueue fired — retry eligible");
        rewardedVideoOfferCoordinator.refreshAndShowIfEligibleForScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshAndShowIfEligibleForScreen$lambda$8(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, Map map, FetchedResponseMessage fetchedResponseMessage) {
        Collection collection;
        WeakReference<FragmentActivity> weakReference = rewardedVideoOfferCoordinator.hostRef;
        Object obj = null;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || !rewardedVideoOfferCoordinator.isHostReady(fragmentActivity)) {
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "SCREEN_6", "host not ready after eligible fetch", false, 4, null);
            return;
        }
        if (rewardedVideoOfferCoordinator.pendingPush != null) {
            rewardedVideoOfferCoordinator.releaseShowAttempt("SCREEN_6", "pending push arrived during eligible — yielding", true);
            return;
        }
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || (collection = (Collection) fetchedResponseMessage.getModel()) == null || collection.isEmpty()) {
            FetchStat stat = fetchedResponseMessage.getStat();
            List list = (List) fetchedResponseMessage.getModel();
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "SCREEN_6", "no eligible campaigns stat=" + stat + " count=" + (list != null ? list.size() : 0) + " screenKey=" + str + " contextParams=" + map + " — will flush pendingPush if any", false, 4, null);
            return;
        }
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        Iterator it = ((Iterable) model).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!rewardedVideoOfferCoordinator.sessionSuppressedCampaignIds.contains(((RewardedPromptCampaignDto) next).getId())) {
                obj = next;
                break;
            }
        }
        RewardedPromptCampaignDto rewardedPromptCampaignDto = (RewardedPromptCampaignDto) obj;
        if (rewardedPromptCampaignDto == null) {
            Object model2 = fetchedResponseMessage.getModel();
            Intrinsics.checkNotNullExpressionValue(model2, "getModel(...)");
            Iterable iterable = (Iterable) model2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(((RewardedPromptCampaignDto) it2.next()).getId());
            }
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "SCREEN_6", "all eligible campaigns session-suppressed ids=" + arrayList, false, 4, null);
            return;
        }
        RewardedPromptFlowLog.ok("SCREEN_6", "picked campaignId=" + rewardedPromptCampaignDto.getId() + " placement=" + rewardedPromptCampaignDto.getPlacementId() + " from " + ((List) fetchedResponseMessage.getModel()).size() + " eligible");
        rewardedVideoOfferCoordinator.prepareAndShow(fragmentActivity, rewardedPromptCampaignDto, null, str, "SCREEN");
    }

    private final void prepareAndShow(FragmentActivity host, final RewardedPromptCampaignDto campaign, final String eventKey, final String screenKey, String source) {
        RewardedPromptFlowLog.step("PREP_1", "source=" + source + " campaignId=" + campaign.getId() + " placement=" + campaign.getPlacementId());
        if (this.sessionSuppressedCampaignIds.contains(campaign.getId())) {
            if (!Intrinsics.areEqual(source, "PUSH")) {
                releaseShowAttempt$default(this, "PREP_1", "campaign session-suppressed id=" + campaign.getId(), false, 4, null);
                return;
            } else {
                this.sessionSuppressedCampaignIds.remove(campaign.getId());
                RewardedPromptFlowLog.ok("PREP_1", "PUSH ignoring session suppress id=" + campaign.getId());
            }
        }
        if (ExternalOverlayDeferral.shouldDefer(host) || ImmersiveOverlayGate.isActive()) {
            releaseShowAttempt("PREP_2", "overlay after fetch — retry later. " + RewardedPromptFlowLog.overlaySnapshot(host), true);
            scheduleCampaignRetry(host, campaign, eventKey, screenKey);
            return;
        }
        PromoService.PromoPlacement placementFromVideoPlacementId = PromoParams.placementFromVideoPlacementId(campaign.getPlacementId());
        if (placementFromVideoPlacementId == null) {
            placementFromVideoPlacementId = PromoService.PromoPlacement.AUTO_PROMPT;
        }
        final PromoService.PromoPlacement promoPlacement = placementFromVideoPlacementId;
        final String videoPlacement = PromoParams.getVideoPlacement(promoPlacement);
        warmVideoPlacement(videoPlacement);
        boolean isRewardedReady = this.videoRewardService.isRewardedReady(promoPlacement);
        RewardedPromptFlowLog.step("PREP_3", "resolved placement enum=" + promoPlacement + " apiId=" + videoPlacement + " adReady=" + isRewardedReady);
        if (!isRewardedReady) {
            RewardedPromptFlowLog.wait("PREP_3", "AdMob not ready — preload (dialog can still show if state OK)");
        }
        RewardedPromptFlowLog.ok("PREP_4", "GET /videoRewards/" + videoPlacement + "/state");
        this.getVideoRewardForPlacementStateInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda8
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                RewardedVideoOfferCoordinator.prepareAndShow$lambda$9(RewardedVideoOfferCoordinator.this, videoPlacement, campaign, promoPlacement, eventKey, screenKey, fetchedResponseMessage);
            }
        }, videoPlacement, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareAndShow$lambda$9(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, RewardedPromptCampaignDto rewardedPromptCampaignDto, PromoService.PromoPlacement promoPlacement, String str2, String str3, FetchedResponseMessage fetchedResponseMessage) {
        WeakReference<FragmentActivity> weakReference = rewardedVideoOfferCoordinator.hostRef;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || !rewardedVideoOfferCoordinator.isHostReady(fragmentActivity)) {
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "PREP_5", "host not ready after video state fetch", false, 4, null);
            return;
        }
        VideoRewardForPlacementState videoRewardForPlacementState = (VideoRewardForPlacementState) fetchedResponseMessage.getModel();
        RewardedPromptFlowLog.step("PREP_5", "video state stat=" + fetchedResponseMessage.getStat() + " available=" + (videoRewardForPlacementState != null ? Boolean.valueOf(videoRewardForPlacementState.isAvailable()) : null) + " remaining=" + (videoRewardForPlacementState != null ? Integer.valueOf(videoRewardForPlacementState.getRemainingInInterval()) : null) + "/" + (videoRewardForPlacementState != null ? Integer.valueOf(videoRewardForPlacementState.getMaxPerInterval()) : null) + " prize=" + (videoRewardForPlacementState != null ? Long.valueOf(videoRewardForPlacementState.getPrizeAmount()) : null) + " placement=" + str);
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && videoRewardForPlacementState != null && videoRewardForPlacementState.isAvailable()) {
            RewardedPromptFlowLog.ok("PREP_5", "placement available prize=" + videoRewardForPlacementState.getPrizeAmount() + " → showDialog");
            rewardedVideoOfferCoordinator.showDialog(fragmentActivity, rewardedPromptCampaignDto, promoPlacement, videoRewardForPlacementState.getPrizeAmount(), str2, str3);
        } else {
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "PREP_5", "ABORT — placement state not available. Create/enable video placement `" + str + "` in dashboard Videos, or quota exhausted. stat=" + fetchedResponseMessage.getStat(), false, 4, null);
        }
    }

    private final void scheduleCampaignRetry(final FragmentActivity host, final RewardedPromptCampaignDto campaign, final String eventKey, final String screenKey) {
        DeferredOverlayQueue.enqueue(host, new Runnable() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RewardedVideoOfferCoordinator.scheduleCampaignRetry$lambda$11(RewardedVideoOfferCoordinator.this, host, campaign, eventKey, screenKey);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleCampaignRetry$lambda$11(final RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, FragmentActivity fragmentActivity, final RewardedPromptCampaignDto rewardedPromptCampaignDto, final String str, final String str2) {
        if (!rewardedVideoOfferCoordinator.isHostReady(fragmentActivity) || rewardedVideoOfferCoordinator.isShowing.get() || rewardedVideoOfferCoordinator.isOwnDialogVisible(fragmentActivity)) {
            RewardedPromptFlowLog.stop("RETRY", "skip retry hostReady=" + rewardedVideoOfferCoordinator.isHostReady(fragmentActivity) + " showing=" + rewardedVideoOfferCoordinator.isShowing.get() + " visible=" + rewardedVideoOfferCoordinator.isOwnDialogVisible(fragmentActivity));
            return;
        }
        if (rewardedVideoOfferCoordinator.pendingPush != null) {
            RewardedPromptFlowLog.wait("RETRY", "pending push present — skip screen retry");
            rewardedVideoOfferCoordinator.flushPendingPush();
            return;
        }
        if (rewardedVideoOfferCoordinator.sessionSuppressedCampaignIds.contains(rewardedPromptCampaignDto.getId())) {
            RewardedPromptFlowLog.stop("RETRY", "skipped — session suppressed campaignId=" + rewardedPromptCampaignDto.getId());
            return;
        }
        if (ExternalOverlayDeferral.shouldDefer(fragmentActivity) || ImmersiveOverlayGate.isActive()) {
            RewardedPromptFlowLog.wait("RETRY", "still blocked — re-enqueue. " + RewardedPromptFlowLog.overlaySnapshot(fragmentActivity));
            rewardedVideoOfferCoordinator.scheduleCampaignRetry(fragmentActivity, rewardedPromptCampaignDto, str, str2);
        } else if (!rewardedVideoOfferCoordinator.isShowInProgress.compareAndSet(false, true)) {
            RewardedPromptFlowLog.wait("RETRY", "isShowInProgress busy — delayed retry in 350ms");
            rewardedVideoOfferCoordinator.mainHandler.postDelayed(new Runnable() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    RewardedVideoOfferCoordinator.scheduleCampaignRetry$lambda$11$lambda$10(RewardedVideoOfferCoordinator.this, rewardedPromptCampaignDto, str, str2);
                }
            }, RETRY_BUSY_DELAY_MS);
        } else {
            RewardedPromptFlowLog.ok("RETRY", "retrying prepareAndShow campaignId=" + rewardedPromptCampaignDto.getId());
            rewardedVideoOfferCoordinator.prepareAndShow(fragmentActivity, rewardedPromptCampaignDto, str, str2, "RETRY");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleCampaignRetry$lambda$11$lambda$10(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, RewardedPromptCampaignDto rewardedPromptCampaignDto, String str, String str2) {
        FragmentActivity fragmentActivity;
        WeakReference<FragmentActivity> weakReference = rewardedVideoOfferCoordinator.hostRef;
        if (weakReference == null || (fragmentActivity = weakReference.get()) == null || !rewardedVideoOfferCoordinator.isHostReady(fragmentActivity)) {
            return;
        }
        rewardedVideoOfferCoordinator.scheduleCampaignRetry(fragmentActivity, rewardedPromptCampaignDto, str, str2);
    }

    private final void showDialog(FragmentActivity host, final RewardedPromptCampaignDto campaign, final PromoService.PromoPlacement placement, final long prizeAmount, final String eventKey, final String screenKey) {
        RewardedPromptFlowLog.step("SHOW_1", "runAfterFragmentTransactions campaignId=" + campaign.getId());
        if (FragmentSafeOps.INSTANCE.runAfterFragmentTransactions(host, new Function0() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showDialog$lambda$12;
                showDialog$lambda$12 = RewardedVideoOfferCoordinator.showDialog$lambda$12(RewardedVideoOfferCoordinator.this, campaign, eventKey, screenKey, prizeAmount, placement);
                return showDialog$lambda$12;
            }
        })) {
            return;
        }
        releaseShowAttempt$default(this, "SHOW_1", "host dead — cannot schedule show", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDialog$lambda$12(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, RewardedPromptCampaignDto rewardedPromptCampaignDto, String str, String str2, long j, PromoService.PromoPlacement promoPlacement) {
        WeakReference<FragmentActivity> weakReference = rewardedVideoOfferCoordinator.hostRef;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || !rewardedVideoOfferCoordinator.isHostReady(fragmentActivity)) {
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "SHOW_2", "host not ready at show time", false, 4, null);
            return Unit.INSTANCE;
        }
        if (rewardedVideoOfferCoordinator.isOwnDialogVisible(fragmentActivity)) {
            rewardedVideoOfferCoordinator.onDialogActuallyVisible(rewardedPromptCampaignDto, str, str2, j, true);
            return Unit.INSTANCE;
        }
        if (ImmersiveOverlayGate.isActive() || ExternalOverlayDeferral.shouldDefer(fragmentActivity)) {
            rewardedVideoOfferCoordinator.releaseShowAttempt("SHOW_2", "blocked at show time — retry. " + RewardedPromptFlowLog.overlaySnapshot(fragmentActivity), true);
            rewardedVideoOfferCoordinator.scheduleCampaignRetry(fragmentActivity, rewardedPromptCampaignDto, str, str2);
            return Unit.INSTANCE;
        }
        RewardedVideoOfferDialogFragment newInstance = RewardedVideoOfferDialogFragment.INSTANCE.newInstance(rewardedPromptCampaignDto.getId(), promoPlacement.name(), j, str, str2);
        RewardedPromptFlowLog.step("SHOW_3", "DialogManager.showDialogSafely tag=RewardedVideoOfferDialog prize=" + j + " placement=" + promoPlacement);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (DialogManager.showDialogSafely(newInstance, supportFragmentManager, RewardedVideoOfferDialogFragment.TAG)) {
            rewardedVideoOfferCoordinator.onDialogActuallyVisible(rewardedPromptCampaignDto, str, str2, j, false);
        } else if (ExternalOverlayDeferral.shouldDefer(fragmentActivity) || ImmersiveOverlayGate.isActive()) {
            RewardedPromptFlowLog.wait("SHOW_4", "DialogManager deferred instance — await appearance (no second retry). " + RewardedPromptFlowLog.overlaySnapshot(fragmentActivity));
            rewardedVideoOfferCoordinator.isShowInProgress.set(false);
            rewardedVideoOfferCoordinator.awaitDeferredDialogAppearance(fragmentActivity, rewardedPromptCampaignDto, str, str2, j);
        } else if (rewardedVideoOfferCoordinator.isOwnDialogVisible(fragmentActivity) || DialogManager.isDialogShowing(RewardedVideoOfferDialogFragment.TAG)) {
            rewardedVideoOfferCoordinator.onDialogActuallyVisible(rewardedPromptCampaignDto, str, str2, j, true);
        } else {
            releaseShowAttempt$default(rewardedVideoOfferCoordinator, "SHOW_4", "DialogManager.showDialogSafely=false (duplicate tag / failed show). tracked=" + DialogManager.isDialogShowing(RewardedVideoOfferDialogFragment.TAG) + " " + RewardedPromptFlowLog.overlaySnapshot(fragmentActivity), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    private final void awaitDeferredDialogAppearance(FragmentActivity host, final RewardedPromptCampaignDto campaign, final String eventKey, final String screenKey, final long prizeAmount) {
        DeferredOverlayQueue.enqueue(host, new Runnable() { // from class: org.betup.rewardedprompt.RewardedVideoOfferCoordinator$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                RewardedVideoOfferCoordinator.awaitDeferredDialogAppearance$lambda$13(RewardedVideoOfferCoordinator.this, campaign, eventKey, screenKey, prizeAmount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void awaitDeferredDialogAppearance$lambda$13(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, RewardedPromptCampaignDto rewardedPromptCampaignDto, String str, String str2, long j) {
        FragmentActivity fragmentActivity;
        WeakReference<FragmentActivity> weakReference = rewardedVideoOfferCoordinator.hostRef;
        if (weakReference == null || (fragmentActivity = weakReference.get()) == null || !rewardedVideoOfferCoordinator.isHostReady(fragmentActivity)) {
            return;
        }
        if (rewardedVideoOfferCoordinator.isOwnDialogVisible(fragmentActivity)) {
            rewardedVideoOfferCoordinator.onDialogActuallyVisible(rewardedPromptCampaignDto, str, str2, j, false);
            return;
        }
        if (rewardedVideoOfferCoordinator.pendingPush != null) {
            rewardedVideoOfferCoordinator.flushPendingPush();
            return;
        }
        RewardedPromptFlowLog.wait("SHOW_4", "deferred dialog not visible — one prepareAndShow retry");
        if (rewardedVideoOfferCoordinator.isShowInProgress.compareAndSet(false, true)) {
            rewardedVideoOfferCoordinator.prepareAndShow(fragmentActivity, rewardedPromptCampaignDto, str, str2, "RETRY");
        }
    }

    private final void onDialogActuallyVisible(RewardedPromptCampaignDto campaign, String eventKey, String screenKey, long prizeAmount, boolean alreadyVisible) {
        String str;
        this.isShowing.set(true);
        this.isShowInProgress.set(false);
        String id = campaign.getId();
        String placementId = campaign.getPlacementId();
        PendingPushShow pendingPushShow = this.lastShownMeta;
        String str2 = null;
        if (pendingPushShow != null) {
            if (!Intrinsics.areEqual(pendingPushShow.getCampaignId(), campaign.getId())) {
                pendingPushShow = null;
            }
            if (pendingPushShow != null) {
                str2 = pendingPushShow.getContextParamsJson();
            }
        }
        this.lastShownMeta = new PendingPushShow(id, eventKey, placementId, str2);
        clearPendingPushIfSame(campaign.getId());
        if (alreadyVisible) {
            str = "DIALOG already visible campaignId=" + campaign.getId();
        } else {
            str = "DIALOG VISIBLE on screen campaignId=" + campaign.getId() + " prize=" + prizeAmount + " → POST IMPRESSION";
        }
        RewardedPromptFlowLog.ok("SHOW_4", str);
        if (!alreadyVisible) {
            postAction(campaign.getId(), RewardedPromptActionType.IMPRESSION, eventKey, screenKey);
        }
        flushPendingPush();
    }

    static /* synthetic */ void postAction$default(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, RewardedPromptActionType rewardedPromptActionType, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = rewardedVideoOfferCoordinator.screenTracker.getCurrentScreenKey();
        }
        rewardedVideoOfferCoordinator.postAction(str, rewardedPromptActionType, str2, str3);
    }

    private final void postAction(String campaignId, RewardedPromptActionType action, String eventKey, String screenKey) {
        RewardedPromptFlowLog.step("API", "POST rewarded-prompt action=" + action + " campaignId=" + campaignId);
        this.postRewardedPromptActionInteractor.load(null, new PostRewardedPromptActionRequest(campaignId, action, eventKey, screenKey));
    }

    private final void warmVideoPlacement(String placementId) {
        PromoService.PromoPlacement placementFromVideoPlacementId = PromoParams.placementFromVideoPlacementId(placementId);
        if (placementFromVideoPlacementId == null) {
            placementFromVideoPlacementId = PromoService.PromoPlacement.AUTO_PROMPT;
        }
        String videoPlacement = PromoParams.getVideoPlacement(placementFromVideoPlacementId);
        boolean isRewardedReady = this.videoRewardService.isRewardedReady(placementFromVideoPlacementId);
        RewardedPromptFlowLog.step("WARM", "preload placement=" + placementFromVideoPlacementId + " apiId=" + videoPlacement + " alreadyReady=" + isRewardedReady);
        if (isRewardedReady) {
            return;
        }
        this.videoRewardService.preloadRewarded(placementFromVideoPlacementId);
    }

    private final void savePendingPush(String campaignId, String eventKey, String placementId, String contextParamsJson, String reason) {
        this.pendingPush = new PendingPushShow(campaignId, eventKey, placementId, contextParamsJson);
        RewardedPromptFlowLog.step("PUSH_PENDING", "saved pendingPush campaignId=" + campaignId + " reason=" + reason + " contextParams=" + contextParamsJson);
    }

    private final void clearPendingPushIfSame(String campaignId) {
        PendingPushShow pendingPushShow = this.pendingPush;
        if (pendingPushShow != null && Intrinsics.areEqual(pendingPushShow.getCampaignId(), campaignId)) {
            this.pendingPush = null;
        }
    }

    static /* synthetic */ void releaseShowAttempt$default(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        rewardedVideoOfferCoordinator.releaseShowAttempt(str, str2, z);
    }

    private final void releaseShowAttempt(String step, String reason, boolean asWait) {
        if (asWait) {
            RewardedPromptFlowLog.wait(step, reason);
        } else {
            RewardedPromptFlowLog.stop(step, reason);
        }
        this.isShowInProgress.set(false);
        flushPendingPush();
    }

    private final void flushPendingPush() {
        PendingPushShow pendingPushShow = this.pendingPush;
        if (pendingPushShow == null || this.isShowing.get() || this.isShowInProgress.get()) {
            return;
        }
        WeakReference<FragmentActivity> weakReference = this.hostRef;
        FragmentActivity fragmentActivity = weakReference != null ? weakReference.get() : null;
        if (fragmentActivity == null || !isHostReady(fragmentActivity)) {
            RewardedPromptFlowLog.wait("PUSH_PENDING", "keep pending push until host ready campaignId=" + pendingPushShow.getCampaignId());
            return;
        }
        if (isOwnDialogVisible(fragmentActivity)) {
            RewardedPromptFlowLog.wait("PUSH_PENDING", "own dialog visible — keep pending");
            return;
        }
        this.pendingPush = null;
        RewardedPromptFlowLog.ok("PUSH_PENDING", "flushing saved push campaignId=" + pendingPushShow.getCampaignId() + " eventKey=" + pendingPushShow.getEventKey());
        showCampaignFromPush(pendingPushShow.getCampaignId(), pendingPushShow.getEventKey(), pendingPushShow.getPlacementId(), pendingPushShow.getContextParamsJson());
    }

    private final void reconcileShowingState(FragmentActivity host) {
        boolean isOwnDialogVisible = isOwnDialogVisible(host);
        if (this.isShowing.get() && !isOwnDialogVisible) {
            RewardedPromptFlowLog.step("RECONCILE", "stale isShowing=true but fragment gone — clearing flags");
            this.isShowing.set(false);
            this.isShowInProgress.set(false);
            DialogManager.onDialogDismissed(RewardedVideoOfferDialogFragment.TAG);
            flushPendingPush();
            return;
        }
        if (this.isShowing.get() || !isOwnDialogVisible) {
            return;
        }
        RewardedPromptFlowLog.step("RECONCILE", "fragment visible without flag — sync isShowing=true");
        this.isShowing.set(true);
    }

    private final boolean isOwnDialogVisible(FragmentActivity host) {
        Fragment findFragmentByTag = host.getSupportFragmentManager().findFragmentByTag(RewardedVideoOfferDialogFragment.TAG);
        return findFragmentByTag != null && findFragmentByTag.isAdded();
    }

    private final boolean isHostReady(FragmentActivity host) {
        return (host.isFinishing() || host.isDestroyed()) ? false : true;
    }
}
