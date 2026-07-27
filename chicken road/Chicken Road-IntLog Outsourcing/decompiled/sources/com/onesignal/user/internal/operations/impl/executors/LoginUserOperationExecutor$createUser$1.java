package com.onesignal.user.internal.operations.impl.executors;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor", f = "LoginUserOperationExecutor.kt", l = {189, 247}, m = "createUser")
/* loaded from: classes.dex */
public final class LoginUserOperationExecutor$createUser$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoginUserOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginUserOperationExecutor$createUser$1(LoginUserOperationExecutor loginUserOperationExecutor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = loginUserOperationExecutor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object createUser;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createUser = this.this$0.createUser(null, null, this);
        return createUser;
    }
}
