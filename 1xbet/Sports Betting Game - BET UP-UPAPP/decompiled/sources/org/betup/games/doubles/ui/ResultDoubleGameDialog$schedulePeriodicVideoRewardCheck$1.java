package org.betup.games.doubles.ui;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.databinding.FragmentResultDoubleGameDialogBinding;
import org.betup.services.offer.PromoService;

/* compiled from: ResultDoubleGameDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.games.doubles.ui.ResultDoubleGameDialog$schedulePeriodicVideoRewardCheck$1", f = "ResultDoubleGameDialog.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ResultDoubleGameDialog$schedulePeriodicVideoRewardCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ResultDoubleGameDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultDoubleGameDialog$schedulePeriodicVideoRewardCheck$1(ResultDoubleGameDialog resultDoubleGameDialog, Continuation<? super ResultDoubleGameDialog$schedulePeriodicVideoRewardCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = resultDoubleGameDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResultDoubleGameDialog$schedulePeriodicVideoRewardCheck$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResultDoubleGameDialog$schedulePeriodicVideoRewardCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x004f -> B:5:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        ResultDialogDoubleGameDto resultDialogDoubleGameDto;
        FragmentResultDoubleGameDialogBinding binding;
        ResultDialogDoubleGameDto resultDialogDoubleGameDto2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.isAdded()) {
                j = this.this$0.VIDEO_REWARD_CHECK_INTERVAL;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                }
                if (this.this$0.isAdded()) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isAdded() && !this.this$0.isDetached() && this.this$0.getActivity() != null && !this.this$0.requireActivity().isDestroyed()) {
            resultDialogDoubleGameDto = this.this$0.result;
            if (resultDialogDoubleGameDto != null) {
                try {
                    binding = this.this$0.getBinding();
                    if (!binding.watchAdLl.isEnabled()) {
                        resultDialogDoubleGameDto2 = this.this$0.result;
                        if (resultDialogDoubleGameDto2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("result");
                            resultDialogDoubleGameDto2 = null;
                        }
                        if (resultDialogDoubleGameDto2.isWin()) {
                            Log.d("ResultDoubleGameDialog", "Periodic check: Checking video reward availability");
                            this.this$0.getVideoRewardService().triggerCaching();
                            this.this$0.getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE, Boxing.boxLong(1000L), null);
                            if (this.this$0.isAdded() && !this.this$0.isDetached() && this.this$0.getActivity() != null && !this.this$0.requireActivity().isDestroyed()) {
                                j = this.this$0.VIDEO_REWARD_CHECK_INTERVAL;
                                this.label = 1;
                                if (DelayKt.delay(j, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (this.this$0.isAdded()) {
                                    resultDialogDoubleGameDto = this.this$0.result;
                                    if (resultDialogDoubleGameDto != null) {
                                    }
                                }
                            }
                        }
                    }
                    Log.d("ResultDoubleGameDialog", "Periodic check: Stopping - button enabled or bet lost");
                } catch (Exception e) {
                    Log.e("ResultDoubleGameDialog", "Periodic check failed", e);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
