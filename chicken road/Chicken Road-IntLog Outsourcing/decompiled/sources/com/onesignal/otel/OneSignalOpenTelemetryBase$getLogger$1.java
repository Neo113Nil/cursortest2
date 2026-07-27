package com.onesignal.otel;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.otel.OneSignalOpenTelemetryBase", f = "OneSignalOpenTelemetry.kt", l = {69}, m = "getLogger$suspendImpl")
/* loaded from: classes.dex */
public final class OneSignalOpenTelemetryBase$getLogger$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneSignalOpenTelemetryBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalOpenTelemetryBase$getLogger$1(OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = oneSignalOpenTelemetryBase;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OneSignalOpenTelemetryBase.getLogger$suspendImpl(this.this$0, this);
    }
}
