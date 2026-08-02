package org.betup.games;

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
import org.betup.utils.balance.OptimisticBalanceTiming;

/* compiled from: BaseGameFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.games.BaseGameFragment$scheduleOptimisticWinCreditThenServerRefresh$1", f = "BaseGameFragment.kt", i = {}, l = {127, 132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BaseGameFragment$scheduleOptimisticWinCreditThenServerRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $winCreditAmount;
    int label;
    final /* synthetic */ BaseGameFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseGameFragment$scheduleOptimisticWinCreditThenServerRefresh$1(long j, BaseGameFragment baseGameFragment, Continuation<? super BaseGameFragment$scheduleOptimisticWinCreditThenServerRefresh$1> continuation) {
        super(2, continuation);
        this.$winCreditAmount = j;
        this.this$0 = baseGameFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseGameFragment$scheduleOptimisticWinCreditThenServerRefresh$1(this.$winCreditAmount, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseGameFragment$scheduleOptimisticWinCreditThenServerRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$winCreditAmount > 0) {
                this.label = 1;
                if (DelayKt.delay(OptimisticBalanceTiming.WIN_CREDIT_DELAY_MS, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.label = 2;
            if (DelayKt.delay(OptimisticBalanceTiming.SERVER_SYNC_AFTER_LAST_STEP_MS, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (this.this$0.isAdded()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.isAdded()) {
                this.this$0.validateProfile();
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isActive()) {
            this.this$0.applyOptimisticWinCreditInternal(this.$winCreditAmount);
        }
        this.label = 2;
        if (DelayKt.delay(OptimisticBalanceTiming.SERVER_SYNC_AFTER_LAST_STEP_MS, this) == coroutine_suspended) {
        }
        if (this.this$0.isAdded()) {
        }
        return Unit.INSTANCE;
    }
}
