package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.o7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2062o7 implements com.facebook.ads.redexgen.core.BY {
    public android.media.MediaCodecInfo[] A00;
    public final int A01;

    public C2062o7(boolean z, boolean z2) {
        int i;
        if (z || z2) {
            i = 1;
        } else {
            i = 0;
        }
        this.A01 = i;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaCodecInfos"})
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new android.media.MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final int A7P() {
        A00();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final android.media.MediaCodecInfo A7Q(int i) {
        A00();
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAR(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAS(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AJ4() {
        return true;
    }
}
