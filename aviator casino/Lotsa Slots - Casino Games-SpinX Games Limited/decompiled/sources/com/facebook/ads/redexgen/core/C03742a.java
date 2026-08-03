package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03742a {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C03742a() {
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = -1;
    }

    public C03742a(com.facebook.ads.androidx.media3.common.ColorInfo colorInfo) {
        this.A01 = colorInfo.A02;
        this.A00 = colorInfo.A01;
        this.A02 = colorInfo.A03;
        this.A03 = colorInfo.A04;
    }

    public final com.facebook.ads.redexgen.core.C03742a A00(int i) {
        this.A00 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C03742a A01(int i) {
        this.A01 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C03742a A02(int i) {
        this.A02 = i;
        return this;
    }

    public final com.facebook.ads.androidx.media3.common.ColorInfo A03() {
        return new com.facebook.ads.androidx.media3.common.ColorInfo(this.A01, this.A00, this.A02, this.A03);
    }
}
