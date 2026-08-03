package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1724iB implements com.facebook.ads.redexgen.core.InterfaceC0932Om {
    public final android.content.SharedPreferences A00;

    public C1724iB(android.content.SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0932Om
    public final com.facebook.ads.redexgen.core.C1725iC A6I() {
        return new com.facebook.ads.redexgen.core.C1725iC(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0932Om
    public final long A8Q(java.lang.String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0932Om
    public final java.lang.String A9E(java.lang.String str, java.lang.String str2) {
        return this.A00.getString(str, str2);
    }
}
