package com.onesignal.user.internal.backend.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.backend.impl.UserBackendService", f = "UserBackendService.kt", l = {74}, m = "updateUser")
/* loaded from: classes.dex */
public final class UserBackendService$updateUser$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserBackendService$updateUser$1(UserBackendService userBackendService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = userBackendService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateUser(null, null, null, null, false, null, null, this);
    }
}
