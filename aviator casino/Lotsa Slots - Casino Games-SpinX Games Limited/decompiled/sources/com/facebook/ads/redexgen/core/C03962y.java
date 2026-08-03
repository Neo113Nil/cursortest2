package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03962y {
    public final android.net.Uri A00;
    public final java.util.List<java.lang.Integer> A01;

    @java.lang.Deprecated
    public final java.util.List<java.lang.Integer> A02;
    public final java.util.Map<java.lang.String, java.lang.String> A03;

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, java.lang.String> A04;
    public final java.util.UUID A05;

    @java.lang.Deprecated
    public final java.util.UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C03962y(com.facebook.ads.redexgen.core.C03952x c03952x) {
        boolean z;
        boolean z2;
        java.util.UUID uuid;
        android.net.Uri uri;
        java.util.Map<java.lang.String, java.lang.String> map;
        java.util.Map<java.lang.String, java.lang.String> map2;
        boolean z3;
        boolean z4;
        boolean z5;
        java.util.List<java.lang.Integer> list;
        java.util.List<java.lang.Integer> list2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        android.net.Uri uri2;
        z = c03952x.A04;
        if (z) {
            uri2 = c03952x.A00;
            if (uri2 == null) {
                z2 = false;
                com.facebook.ads.redexgen.core.AbstractC04203y.A08(z2);
                uuid = c03952x.A03;
                this.A05 = (java.util.UUID) com.facebook.ads.redexgen.core.AbstractC04203y.A01(uuid);
                this.A06 = this.A05;
                uri = c03952x.A00;
                this.A00 = uri;
                map = c03952x.A02;
                this.A04 = map;
                map2 = c03952x.A02;
                this.A03 = map2;
                z3 = c03952x.A05;
                this.A08 = z3;
                z4 = c03952x.A04;
                this.A07 = z4;
                z5 = c03952x.A06;
                this.A09 = z5;
                list = c03952x.A01;
                this.A02 = list;
                list2 = c03952x.A01;
                this.A01 = list2;
                bArr = c03952x.A07;
                if (bArr == null) {
                    bArr3 = c03952x.A07;
                    bArr4 = c03952x.A07;
                    bArr2 = java.util.Arrays.copyOf(bArr3, bArr4.length);
                } else {
                    bArr2 = null;
                }
                this.A0A = bArr2;
            }
        }
        z2 = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(z2);
        uuid = c03952x.A03;
        this.A05 = (java.util.UUID) com.facebook.ads.redexgen.core.AbstractC04203y.A01(uuid);
        this.A06 = this.A05;
        uri = c03952x.A00;
        this.A00 = uri;
        map = c03952x.A02;
        this.A04 = map;
        map2 = c03952x.A02;
        this.A03 = map2;
        z3 = c03952x.A05;
        this.A08 = z3;
        z4 = c03952x.A04;
        this.A07 = z4;
        z5 = c03952x.A06;
        this.A09 = z5;
        list = c03952x.A01;
        this.A02 = list;
        list2 = c03952x.A01;
        this.A01 = list2;
        bArr = c03952x.A07;
        if (bArr == null) {
        }
        this.A0A = bArr2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.C03962y)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C03962y c03962y = (com.facebook.ads.redexgen.core.C03962y) obj;
        if (this.A05.equals(c03962y.A05) && com.facebook.ads.redexgen.core.C5C.A1E(this.A00, c03962y.A00) && com.facebook.ads.redexgen.core.C5C.A1E(this.A03, c03962y.A03) && this.A08 == c03962y.A08 && this.A07 == c03962y.A07 && this.A09 == c03962y.A09 && this.A01.equals(c03962y.A01) && java.util.Arrays.equals(this.A0A, c03962y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + java.util.Arrays.hashCode(this.A0A);
    }
}
