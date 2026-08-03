package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1725iC implements com.facebook.ads.redexgen.core.InterfaceC0931Ol {
    public final android.content.SharedPreferences.Editor A00;

    public C1725iC(android.content.SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final com.facebook.ads.redexgen.core.C1725iC A00(java.lang.String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1725iC A01(java.lang.String str, java.lang.String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
