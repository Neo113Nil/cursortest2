package org.betup.ui.fragment.home.controller;

import androidx.mediarouter.media.MediaRouter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.R;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;

/* compiled from: HomeVideoBonusController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.controller.HomeVideoBonusController$scheduleActionLoadingTimeout$1", f = "HomeVideoBonusController.kt", i = {}, l = {MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeVideoBonusController$scheduleActionLoadingTimeout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeVideoBonusController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeVideoBonusController$scheduleActionLoadingTimeout$1(HomeVideoBonusController homeVideoBonusController, Continuation<? super HomeVideoBonusController$scheduleActionLoadingTimeout$1> continuation) {
        super(2, continuation);
        this.this$0 = homeVideoBonusController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeVideoBonusController$scheduleActionLoadingTimeout$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeVideoBonusController$scheduleActionLoadingTimeout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        VideoRewardService videoRewardService;
        MutableStateFlow mutableStateFlow2;
        Object value;
        VideoOfferAvailabilityPhase videoOfferAvailabilityPhase;
        HomeVideoBonusUiState copy;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(90000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        mutableStateFlow = this.this$0._uiState;
        if (!((HomeVideoBonusUiState) mutableStateFlow.getValue()).isActionLoading()) {
            return Unit.INSTANCE;
        }
        videoRewardService = this.this$0.videoRewardService;
        if (videoRewardService.isVideoRewardFlowInProgress()) {
            this.this$0.scheduleActionLoadingTimeout();
            return Unit.INSTANCE;
        }
        mutableStateFlow2 = this.this$0._uiState;
        do {
            value = mutableStateFlow2.getValue();
            HomeVideoBonusUiState homeVideoBonusUiState = (HomeVideoBonusUiState) value;
            if (homeVideoBonusUiState.getAdsActive()) {
                videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.READY;
            } else {
                videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.UNAVAILABLE;
            }
            copy = homeVideoBonusUiState.copy((r22 & 1) != 0 ? homeVideoBonusUiState.adsActive : false, (r22 & 2) != 0 ? homeVideoBonusUiState.availabilityPhase : videoOfferAvailabilityPhase, (r22 & 4) != 0 ? homeVideoBonusUiState.adsAmount : 0L, (r22 & 8) != 0 ? homeVideoBonusUiState.displayPrizeAmount : 0L, (r22 & 16) != 0 ? homeVideoBonusUiState.usedInInterval : 0, (r22 & 32) != 0 ? homeVideoBonusUiState.maxPerInterval : 0, (r22 & 64) != 0 ? homeVideoBonusUiState.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? homeVideoBonusUiState.isActionLoading : false);
        } while (!mutableStateFlow2.compareAndSet(value, copy));
        z = this.this$0.homeVideoRewardSessionPending;
        if (z) {
            this.this$0.emitMessage(R.string.home_video_reward_action_timeout);
            this.this$0.performVideoBonusNetworkRefresh(HomeVideoBonusController.VideoBonusNetworkRefreshPolicy.BYPASS_TRACKED_OVERLAY, true);
        }
        return Unit.INSTANCE;
    }
}
