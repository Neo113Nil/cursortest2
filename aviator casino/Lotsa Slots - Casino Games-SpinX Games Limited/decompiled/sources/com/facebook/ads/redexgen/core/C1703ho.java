package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ho, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1703ho extends com.facebook.ads.redexgen.core.AbstractC0980Qm {
    public C1703ho(com.facebook.ads.redexgen.core.R2 r2) {
        super(r2, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A06() {
        return this.A02.A0Z();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A07() {
        return this.A02.A0Z() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A09() {
        return this.A02.A0a();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0A() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0B() {
        return (this.A02.A0Z() - this.A02.A0i()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0C(android.view.View view) {
        return this.A02.A0l(view) + ((com.facebook.ads.redexgen.core.R3) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0D(android.view.View view) {
        com.facebook.ads.redexgen.core.R3 r3 = (com.facebook.ads.redexgen.core.R3) view.getLayoutParams();
        return this.A02.A0n(view) + r3.topMargin + r3.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0E(android.view.View view) {
        com.facebook.ads.redexgen.core.R3 r3 = (com.facebook.ads.redexgen.core.R3) view.getLayoutParams();
        return this.A02.A0o(view) + r3.leftMargin + r3.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0F(android.view.View view) {
        return this.A02.A0q(view) - ((com.facebook.ads.redexgen.core.R3) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0G(android.view.View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final int A0H(android.view.View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0980Qm
    public final void A0J(int i) {
        this.A02.A12(i);
    }
}
