package com.ironsource.adqualitysdk.sdk.i;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0943 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f2646;

    public C0943(C0449 c0449) {
        this.f2646 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f2646;
        DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) arrayList.get(0);
        c0449.getClass();
        return diagnosticEvent.getStringTagsMap();
    }
}
