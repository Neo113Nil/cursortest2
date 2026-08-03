package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0805Jo {
    public static final java.util.Comparator<com.facebook.ads.redexgen.core.C0805Jo> A02 = new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            int compare;
            compare = java.lang.Integer.compare(((com.facebook.ads.redexgen.core.C0805Jo) obj2).A00, ((com.facebook.ads.redexgen.core.C0805Jo) obj).A00);
            return compare;
        }
    };
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2146pT A01;

    public C0805Jo(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        com.facebook.ads.redexgen.core.C04103o cueBuilder = new com.facebook.ads.redexgen.core.C04103o().A0G(charSequence).A0F(alignment).A07(f, i).A09(i2).A04(f2).A0A(i3).A06(f3);
        if (z) {
            cueBuilder.A0C(i4);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i5;
    }
}
