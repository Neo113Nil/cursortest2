package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1698hj implements com.facebook.ads.redexgen.core.RN {
    public final /* synthetic */ com.facebook.ads.redexgen.core.R2 A00;

    public C1698hj(com.facebook.ads.redexgen.core.R2 r2) {
        this.A00 = r2;
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final android.view.View A7H(int i) {
        return this.A00.A0v(i);
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A7J(android.view.View view) {
        return this.A00.A0p(view) + ((com.facebook.ads.redexgen.core.R3) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A7K(android.view.View view) {
        return this.A00.A0m(view) - ((com.facebook.ads.redexgen.core.R3) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A8g() {
        return this.A00.A0j() - this.A00.A0h();
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A8h() {
        return this.A00.A0g();
    }
}
