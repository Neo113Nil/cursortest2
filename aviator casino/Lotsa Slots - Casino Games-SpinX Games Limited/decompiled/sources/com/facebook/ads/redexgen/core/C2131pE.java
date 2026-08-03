package com.facebook.ads.redexgen.core;

@java.lang.Deprecated
/* renamed from: com.facebook.ads.redexgen.X.pE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2131pE implements com.facebook.ads.redexgen.core.C5Y {
    public final android.content.Context A00;
    public final com.facebook.ads.redexgen.core.C5Y A01;
    public final com.facebook.ads.redexgen.core.InterfaceC04675t A02;

    public C2131pE(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t, com.facebook.ads.redexgen.core.C5Y c5y) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC04675t;
        this.A01 = c5y;
    }

    public C2131pE(android.content.Context context, java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        this(context, interfaceC04675t, new com.facebook.ads.redexgen.core.AO().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.AP A5I() {
        com.facebook.ads.redexgen.core.AP ap = new com.facebook.ads.redexgen.core.AP(this.A00, this.A01.A5I());
        if (this.A02 != null) {
            ap.A43(this.A02);
        }
        return ap;
    }
}
