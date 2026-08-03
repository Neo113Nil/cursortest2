package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1696hh implements com.facebook.ads.redexgen.core.RN {
    public final /* synthetic */ com.facebook.ads.redexgen.core.R2 A00;

    public C1696hh(com.facebook.ads.redexgen.core.R2 r2) {
        this.A00 = r2;
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final android.view.View A7H(int i) {
        return this.A00.A0v(i);
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A7J(android.view.View view) {
        return this.A00.A0l(view) + ((com.facebook.ads.redexgen.core.R3) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A7K(android.view.View view) {
        return this.A00.A0q(view) - ((com.facebook.ads.redexgen.core.R3) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A8g() {
        return this.A00.A0Z() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.RN
    public final int A8h() {
        return this.A00.A0i();
    }
}
