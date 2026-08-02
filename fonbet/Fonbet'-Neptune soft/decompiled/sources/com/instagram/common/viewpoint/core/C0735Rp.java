package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0735Rp {
    public final long A00;
    public final EnumC0734Ro A01;
    public final String A02;
    public final boolean A03;

    public C0735Rp(String str, boolean z, EnumC0734Ro enumC0734Ro) {
        this(str, z, enumC0734Ro, System.currentTimeMillis());
    }

    public C0735Rp(String str, boolean z, EnumC0734Ro enumC0734Ro, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC0734Ro;
        this.A00 = j;
    }

    public static C0735Rp A00() {
        return new C0735Rp("", true, EnumC0734Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC0734Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
