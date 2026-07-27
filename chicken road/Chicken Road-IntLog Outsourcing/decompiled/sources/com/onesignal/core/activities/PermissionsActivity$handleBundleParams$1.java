package com.onesignal.core.activities;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.activities.PermissionsActivity", f = "PermissionsActivity.kt", l = {99}, m = "handleBundleParams")
/* loaded from: classes.dex */
public final class PermissionsActivity$handleBundleParams$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PermissionsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsActivity$handleBundleParams$1(PermissionsActivity permissionsActivity, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = permissionsActivity;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object handleBundleParams;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleBundleParams = this.this$0.handleBundleParams(null, this);
        return handleBundleParams;
    }
}
