package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class C8 {
    public java.lang.String A00;
    public java.lang.String A01;
    public java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> A02;
    public byte[] A03;
    public byte[] A04;
    public final android.net.Uri A05;
    public final java.lang.String A06;

    public C8(java.lang.String str, android.net.Uri uri) {
        this.A06 = str;
        this.A05 = uri;
    }

    public final com.facebook.ads.redexgen.core.C8 A00(java.lang.String str) {
        this.A00 = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C8 A01(java.lang.String str) {
        this.A01 = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C8 A02(java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> streamKeys) {
        this.A02 = streamKeys;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C8 A03(byte[] bArr) {
        this.A03 = bArr;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C8 A04(byte[] bArr) {
        this.A04 = bArr;
        return this;
    }

    public final com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A05() {
        return new com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest(this.A06, this.A05, this.A01, this.A02 != null ? this.A02 : com.facebook.ads.redexgen.core.BP.A03(), this.A04, this.A00, this.A03, null);
    }
}
