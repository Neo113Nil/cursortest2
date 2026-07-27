package com.onesignal.otel.attributes;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.otel.attributes.OtelFieldsTopLevel", f = "OtelFieldsTopLevel.kt", l = {17}, m = "getAttributes")
/* loaded from: classes.dex */
public final class OtelFieldsTopLevel$getAttributes$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelFieldsTopLevel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelFieldsTopLevel$getAttributes$1(OtelFieldsTopLevel otelFieldsTopLevel, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = otelFieldsTopLevel;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAttributes(this);
    }
}
