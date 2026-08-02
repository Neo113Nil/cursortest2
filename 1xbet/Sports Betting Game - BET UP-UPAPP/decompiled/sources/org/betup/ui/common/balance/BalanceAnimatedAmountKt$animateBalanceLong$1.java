package org.betup.ui.common.balance;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BalanceAnimatedAmount.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.common.balance.BalanceAnimatedAmountKt", f = "BalanceAnimatedAmount.kt", i = {0, 0, 0, 0, 0}, l = {257}, m = "animateBalanceLong", n = {"onFrame", "from", "to", "startNs", "durationNs"}, s = {"L$0", "J$0", "J$1", "J$2", "J$3"})
/* loaded from: classes2.dex */
final class BalanceAnimatedAmountKt$animateBalanceLong$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    BalanceAnimatedAmountKt$animateBalanceLong$1(Continuation<? super BalanceAnimatedAmountKt$animateBalanceLong$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object animateBalanceLong;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateBalanceLong = BalanceAnimatedAmountKt.animateBalanceLong(0L, 0L, 0, null, this);
        return animateBalanceLong;
    }
}
