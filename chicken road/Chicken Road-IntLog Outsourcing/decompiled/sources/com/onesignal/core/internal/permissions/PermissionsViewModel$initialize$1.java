package com.onesignal.core.internal.permissions;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.permissions.PermissionsViewModel", f = "PermissionsViewModel.kt", l = {57}, m = "initialize")
/* loaded from: classes.dex */
public final class PermissionsViewModel$initialize$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PermissionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsViewModel$initialize$1(PermissionsViewModel permissionsViewModel, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = permissionsViewModel;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initialize(null, null, null, this);
    }
}
