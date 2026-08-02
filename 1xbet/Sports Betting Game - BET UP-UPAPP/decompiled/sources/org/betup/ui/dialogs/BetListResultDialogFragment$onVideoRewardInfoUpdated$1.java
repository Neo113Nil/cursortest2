package org.betup.ui.dialogs;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoService;

/* compiled from: BetListResultDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.BetListResultDialogFragment$onVideoRewardInfoUpdated$1", f = "BetListResultDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetListResultDialogFragment$onVideoRewardInfoUpdated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VideoRewardPlacementInfo $info;
    int label;
    final /* synthetic */ BetListResultDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetListResultDialogFragment$onVideoRewardInfoUpdated$1(BetListResultDialogFragment betListResultDialogFragment, VideoRewardPlacementInfo videoRewardPlacementInfo, Continuation<? super BetListResultDialogFragment$onVideoRewardInfoUpdated$1> continuation) {
        super(2, continuation);
        this.this$0 = betListResultDialogFragment;
        this.$info = videoRewardPlacementInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetListResultDialogFragment$onVideoRewardInfoUpdated$1(this.this$0, this.$info, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetListResultDialogFragment$onVideoRewardInfoUpdated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PromoService.PromoPlacement promoPlacement;
        MutableStateFlow mutableStateFlow;
        boolean z;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Job job;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            promoPlacement = this.this$0.currentPlacement;
            if (promoPlacement != null) {
                BetListResultDialogFragment betListResultDialogFragment = this.this$0;
                VideoRewardPlacementInfo videoRewardPlacementInfo = this.$info;
                mutableStateFlow = betListResultDialogFragment._videoRewardAmount;
                mutableStateFlow.setValue(Boxing.boxLong(videoRewardPlacementInfo.getPrizeAmount()));
                boolean z2 = false;
                try {
                    z = betListResultDialogFragment.getVideoRewardService().isRewardedReady(promoPlacement);
                } catch (Exception e) {
                    Log.e("BetListResultDialog", "Error checking rewarded ad availability", e);
                    z = false;
                }
                boolean z3 = videoRewardPlacementInfo.isAvailable() && !videoRewardPlacementInfo.isQuotaExhausted();
                if (z3 && z) {
                    z2 = true;
                }
                mutableStateFlow2 = betListResultDialogFragment._isVideoRewardAvailable;
                boolean booleanValue = ((Boolean) mutableStateFlow2.getValue()).booleanValue();
                mutableStateFlow3 = betListResultDialogFragment._isVideoRewardAvailable;
                mutableStateFlow3.setValue(Boxing.boxBoolean(z2));
                Log.d("BetListResultDialog", "Video reward updated: backendAvailable=" + z3 + ", adSdkAvailable=" + z + ", finalAvailable=" + z2 + ", wasAvailable=" + booleanValue + ", amount=" + videoRewardPlacementInfo.getPrizeAmount() + ", placement=" + promoPlacement);
                if (z2 && !booleanValue) {
                    job = betListResultDialogFragment.videoRewardCheckJob;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    betListResultDialogFragment.videoRewardCheckJob = null;
                    Log.d("BetListResultDialog", "Video reward available, stopping periodic checks");
                } else if (!z2 && booleanValue) {
                    betListResultDialogFragment.schedulePeriodicVideoRewardCheck();
                    Log.d("BetListResultDialog", "Video reward unavailable, starting periodic checks");
                }
                if (z3 && !betListResultDialogFragment.getVideoRewardService().isRewardedReady(promoPlacement)) {
                    betListResultDialogFragment.getVideoRewardService().preloadRewarded();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
