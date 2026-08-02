package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.ColorInfo;

/* renamed from: com.facebook.ads.redexgen.X.1y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00901y {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C00901y() {
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = -1;
    }

    public C00901y(ColorInfo colorInfo) {
        this.A01 = colorInfo.A02;
        this.A00 = colorInfo.A01;
        this.A02 = colorInfo.A03;
        this.A03 = colorInfo.A04;
    }

    public final C00901y A00(int i) {
        this.A00 = i;
        return this;
    }

    public final C00901y A01(int i) {
        this.A01 = i;
        return this;
    }

    public final C00901y A02(int i) {
        this.A02 = i;
        return this;
    }

    public final ColorInfo A03() {
        return new ColorInfo(this.A01, this.A00, this.A02, this.A03);
    }
}
