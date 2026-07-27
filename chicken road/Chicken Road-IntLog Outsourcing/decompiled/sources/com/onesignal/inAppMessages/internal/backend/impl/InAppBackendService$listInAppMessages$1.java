package com.onesignal.inAppMessages.internal.backend.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {34, 37}, m = "listInAppMessages")
/* loaded from: classes.dex */
public final class InAppBackendService$listInAppMessages$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBackendService$listInAppMessages$1(InAppBackendService inAppBackendService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppBackendService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.listInAppMessages(null, null, null, null, this);
    }
}
