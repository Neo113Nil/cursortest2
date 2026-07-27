package com.onesignal.core.internal.application.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.application.impl.ApplicationService", f = "ApplicationService.kt", l = {309}, m = "waitUntilActivityReady")
/* loaded from: classes.dex */
public final class ApplicationService$waitUntilActivityReady$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApplicationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationService$waitUntilActivityReady$1(ApplicationService applicationService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = applicationService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitUntilActivityReady(this);
    }
}
