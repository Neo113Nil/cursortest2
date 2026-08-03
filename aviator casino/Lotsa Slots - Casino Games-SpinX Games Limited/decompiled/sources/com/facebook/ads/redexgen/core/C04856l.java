package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04856l implements java.lang.Comparable<com.facebook.ads.redexgen.core.C04856l> {
    public int A00;
    public long A01;
    public java.lang.Object A02;
    public final com.facebook.ads.redexgen.core.C05037d A03;

    public C04856l(com.facebook.ads.redexgen.core.C05037d c05037d) {
        this.A03 = c05037d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.C04856l c04856l) {
        if ((this.A02 == null) != (c04856l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c04856l.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = com.facebook.ads.redexgen.core.C5C.A08(this.A01, c04856l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, java.lang.Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
