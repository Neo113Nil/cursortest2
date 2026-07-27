package com.onesignal.otel;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.otel.OtelLoggingHelper", f = "OtelLoggingHelper.kt", l = {58}, m = "logToOtel")
/* loaded from: classes.dex */
public final class OtelLoggingHelper$logToOtel$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelLoggingHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelLoggingHelper$logToOtel$1(OtelLoggingHelper otelLoggingHelper, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = otelLoggingHelper;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logToOtel(null, null, null, null, null, null, this);
    }
}
