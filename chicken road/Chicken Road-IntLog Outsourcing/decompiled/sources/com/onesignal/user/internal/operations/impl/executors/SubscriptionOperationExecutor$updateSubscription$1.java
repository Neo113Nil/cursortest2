package com.onesignal.user.internal.operations.impl.executors;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", f = "SubscriptionOperationExecutor.kt", l = {229, 232, 234}, m = "updateSubscription")
/* loaded from: classes.dex */
public final class SubscriptionOperationExecutor$updateSubscription$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationExecutor$updateSubscription$1(SubscriptionOperationExecutor subscriptionOperationExecutor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = subscriptionOperationExecutor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object updateSubscription;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateSubscription = this.this$0.updateSubscription(null, null, this);
        return updateSubscription;
    }
}
