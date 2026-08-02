package org.betup.ui.dialogs;

import android.util.Log;
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
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;

/* compiled from: BetPlacedDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.BetPlacedDialog$schedulePeriodicVideoRewardCheck$1", f = "BetPlacedDialog.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetPlacedDialog$schedulePeriodicVideoRewardCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BetPlacedDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetPlacedDialog$schedulePeriodicVideoRewardCheck$1(BetPlacedDialog betPlacedDialog, Continuation<? super BetPlacedDialog$schedulePeriodicVideoRewardCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = betPlacedDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetPlacedDialog$schedulePeriodicVideoRewardCheck$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetPlacedDialog$schedulePeriodicVideoRewardCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0039 -> B:5:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        MutableStateFlow mutableStateFlow;
        PromoService.PromoPlacement promoPlacement;
        PromoService.PromoPlacement promoPlacement2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.isAdded()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isAdded() && !this.this$0.isDetached()) {
            mutableStateFlow = this.this$0._isVideoRewardAvailable;
            if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                promoPlacement = this.this$0.placement;
                Log.d("BetPlacedDialog", "Periodic check: Checking video reward availability for placement=" + promoPlacement);
                this.this$0.getVideoRewardService().triggerCaching();
                VideoRewardService videoRewardService = this.this$0.getVideoRewardService();
                promoPlacement2 = this.this$0.placement;
                videoRewardService.getVideoRewardInfo(promoPlacement2, null, null);
            } else {
                Log.d("BetPlacedDialog", "Periodic check: Stopping - button available");
                return Unit.INSTANCE;
            }
        }
        if (this.this$0.isAdded() && !this.this$0.isDetached()) {
            j = this.this$0.VIDEO_REWARD_CHECK_INTERVAL;
            this.label = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (this.this$0.isAdded()) {
                mutableStateFlow = this.this$0._isVideoRewardAvailable;
                if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                }
            }
            if (this.this$0.isAdded()) {
                j = this.this$0.VIDEO_REWARD_CHECK_INTERVAL;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                }
                if (this.this$0.isAdded()) {
                }
                if (this.this$0.isAdded()) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
