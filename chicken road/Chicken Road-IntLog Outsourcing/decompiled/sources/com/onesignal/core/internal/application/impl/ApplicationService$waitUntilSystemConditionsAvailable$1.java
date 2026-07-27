package com.onesignal.core.internal.application.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.application.impl.ApplicationService", f = "ApplicationService.kt", l = {238, 269, 296}, m = "waitUntilSystemConditionsAvailable")
/* loaded from: classes.dex */
public final class ApplicationService$waitUntilSystemConditionsAvailable$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApplicationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationService$waitUntilSystemConditionsAvailable$1(ApplicationService applicationService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = applicationService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitUntilSystemConditionsAvailable(this);
    }
}
