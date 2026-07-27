package com.onesignal.user.internal.operations.impl.executors;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.operations.impl.executors.CustomEventOperationExecutor", f = "CustomEventOperationExecutor.kt", l = {48}, m = "execute")
/* loaded from: classes.dex */
public final class CustomEventOperationExecutor$execute$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomEventOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEventOperationExecutor$execute$1(CustomEventOperationExecutor customEventOperationExecutor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = customEventOperationExecutor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
