package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.qC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2190qC implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final com.facebook.ads.redexgen.core.C2190qC A06 = new com.facebook.ads.redexgen.core.C03932v().A0A();
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.AW> A05 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.AW A0B;
            A0B = new com.facebook.ads.redexgen.core.C03932v().A06(bundle.getLong(com.facebook.ads.redexgen.core.C2190qC.A01(0), 0L)).A05(bundle.getLong(com.facebook.ads.redexgen.core.C2190qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(com.facebook.ads.redexgen.core.C2190qC.A01(2), false)).A07(bundle.getBoolean(com.facebook.ads.redexgen.core.C2190qC.A01(3), false)).A09(bundle.getBoolean(com.facebook.ads.redexgen.core.C2190qC.A01(4), false)).A0B();
            return A0B;
        }
    };

    public C2190qC(com.facebook.ads.redexgen.core.C03932v c03932v) {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        j = c03932v.A01;
        this.A01 = j;
        j2 = c03932v.A00;
        this.A00 = j2;
        z = c03932v.A03;
        this.A03 = z;
        z2 = c03932v.A02;
        this.A02 = z2;
        z3 = c03932v.A04;
        this.A04 = z3;
    }

    public static java.lang.String A01(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.C2190qC)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2190qC c2190qC = (com.facebook.ads.redexgen.core.C2190qC) obj;
        return this.A01 == c2190qC.A01 && this.A00 == c2190qC.A00 && this.A03 == c2190qC.A03 && this.A02 == c2190qC.A02 && this.A04 == c2190qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
