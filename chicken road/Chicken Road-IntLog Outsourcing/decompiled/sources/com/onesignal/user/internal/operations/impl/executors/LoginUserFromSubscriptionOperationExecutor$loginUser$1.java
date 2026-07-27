package com.onesignal.user.internal.operations.impl.executors;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.operations.impl.executors.LoginUserFromSubscriptionOperationExecutor", f = "LoginUserFromSubscriptionOperationExecutor.kt", l = {55}, m = "loginUser")
/* loaded from: classes.dex */
public final class LoginUserFromSubscriptionOperationExecutor$loginUser$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoginUserFromSubscriptionOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginUserFromSubscriptionOperationExecutor$loginUser$1(LoginUserFromSubscriptionOperationExecutor loginUserFromSubscriptionOperationExecutor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = loginUserFromSubscriptionOperationExecutor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object loginUser;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loginUser = this.this$0.loginUser(null, this);
        return loginUser;
    }
}
