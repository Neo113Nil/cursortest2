package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.7u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C18147u {
    public final long A00;
    public final long A01;
    public static final C18147u A04 = new C18147u(0, 0);
    public static final C18147u A02 = new C18147u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C18147u A06 = new C18147u(Long.MAX_VALUE, 0);
    public static final C18147u A05 = new C18147u(0, Long.MAX_VALUE);
    public static final C18147u A03 = A04;

    public C18147u(long j, long j2) {
        AbstractC17143y.A07(j >= 0);
        AbstractC17143y.A07(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final long A00(long minPositionUs, long j, long j2) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long A0V = C5C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long A0S = C5C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = A0V <= j && j <= A0S;
        if (A0V > j2 || j2 > A0S) {
            z = false;
        }
        if (z2 && z) {
            long abs = Math.abs(j - minPositionUs);
            long maxPositionUs = Math.abs(j2 - minPositionUs);
            if (abs <= maxPositionUs) {
                return j;
            }
            return j2;
        }
        if (z2) {
            return j;
        }
        if (z) {
            return j2;
        }
        return A0V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18147u c18147u = (C18147u) obj;
        return this.A01 == c18147u.A01 && this.A00 == c18147u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
