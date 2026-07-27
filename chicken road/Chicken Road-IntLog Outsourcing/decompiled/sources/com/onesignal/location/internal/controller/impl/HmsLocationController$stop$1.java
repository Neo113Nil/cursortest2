package com.onesignal.location.internal.controller.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.location.internal.controller.impl.HmsLocationController", f = "HmsLocationController.kt", l = {229}, m = "stop")
/* loaded from: classes.dex */
public final class HmsLocationController$stop$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmsLocationController$stop$1(HmsLocationController hmsLocationController, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = hmsLocationController;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.stop(this);
    }
}
