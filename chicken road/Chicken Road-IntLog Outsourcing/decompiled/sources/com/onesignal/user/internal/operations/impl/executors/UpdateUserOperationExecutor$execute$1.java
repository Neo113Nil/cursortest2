package com.onesignal.user.internal.operations.impl.executors;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor", f = "UpdateUserOperationExecutor.kt", l = {149, 160, 162}, m = "execute")
/* loaded from: classes.dex */
public final class UpdateUserOperationExecutor$execute$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateUserOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserOperationExecutor$execute$1(UpdateUserOperationExecutor updateUserOperationExecutor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = updateUserOperationExecutor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
