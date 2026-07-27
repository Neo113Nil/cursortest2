package com.onesignal.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.internal.OneSignalImp", f = "OneSignalImp.kt", l = {679}, m = "waitUntilInitInternal")
/* loaded from: classes.dex */
public final class OneSignalImp$waitUntilInitInternal$1 extends AbstractC1295c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$waitUntilInitInternal$1(OneSignalImp oneSignalImp, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = oneSignalImp;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object waitUntilInitInternal;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        waitUntilInitInternal = this.this$0.waitUntilInitInternal(null, this);
        return waitUntilInitInternal;
    }
}
