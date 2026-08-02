package org.betup.ui.common.balance;

import androidx.compose.runtime.MutableLongState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BalanceAnimatedAmount.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.common.balance.BalanceAnimatedAmountKt$CounterBalance$1$1", f = "BalanceAnimatedAmount.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BalanceAnimatedAmountKt$CounterBalance$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLongState $animatedValue$delegate;
    final /* synthetic */ long $balance;
    final /* synthetic */ long $previousBalance;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceAnimatedAmountKt$CounterBalance$1$1(long j, long j2, MutableLongState mutableLongState, Continuation<? super BalanceAnimatedAmountKt$CounterBalance$1$1> continuation) {
        super(2, continuation);
        this.$previousBalance = j;
        this.$balance = j2;
        this.$animatedValue$delegate = mutableLongState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BalanceAnimatedAmountKt$CounterBalance$1$1(this.$previousBalance, this.$balance, this.$animatedValue$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BalanceAnimatedAmountKt$CounterBalance$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object animateBalanceLong;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$previousBalance;
            long j2 = this.$balance;
            final MutableLongState mutableLongState = this.$animatedValue$delegate;
            this.label = 1;
            animateBalanceLong = BalanceAnimatedAmountKt.animateBalanceLong(j, j2, 700, new Function1() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$CounterBalance$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BalanceAnimatedAmountKt$CounterBalance$1$1.invokeSuspend$lambda$0(MutableLongState.this, ((Long) obj2).longValue());
                    return invokeSuspend$lambda$0;
                }
            }, this);
            if (animateBalanceLong == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableLongState mutableLongState, long j) {
        mutableLongState.setLongValue(j);
        return Unit.INSTANCE;
    }
}
