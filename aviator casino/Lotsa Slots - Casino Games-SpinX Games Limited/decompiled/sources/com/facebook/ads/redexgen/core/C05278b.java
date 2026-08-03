package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05278b implements com.facebook.ads.redexgen.core.InterfaceC1960mF {
    public long A00;
    public final long A01;
    public final com.facebook.ads.redexgen.core.C04294h A03 = new com.facebook.ads.redexgen.core.C04294h();
    public final com.facebook.ads.redexgen.core.C04294h A02 = new com.facebook.ads.redexgen.core.C04294h();

    public C05278b(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j3;
        this.A03.A04(0L);
        this.A02.A04(j2);
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(long j, long j2) {
        if (A02(j)) {
            return;
        }
        this.A03.A04(j);
        this.A02.A04(j2);
    }

    public final boolean A02(long j) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j - lastIndexedTimeUs < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1960mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final com.facebook.ads.redexgen.core.HX A91(long j) {
        int A0C = com.facebook.ads.redexgen.core.C5C.A0C(this.A03, j, true, true);
        com.facebook.ads.redexgen.core.HZ hz = new com.facebook.ads.redexgen.core.HZ(this.A03.A03(A0C), this.A02.A03(A0C));
        if (hz.A01 != j) {
            int targetIndex = this.A03.A02();
            if (A0C != targetIndex - 1) {
                int targetIndex2 = A0C + 1;
                long A03 = this.A03.A03(targetIndex2);
                int targetIndex3 = A0C + 1;
                com.facebook.ads.redexgen.core.HZ nextSeekPoint = new com.facebook.ads.redexgen.core.HZ(A03, this.A02.A03(targetIndex3));
                return new com.facebook.ads.redexgen.core.HX(hz, nextSeekPoint);
            }
        }
        return new com.facebook.ads.redexgen.core.HX(hz);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1960mF
    public final long A9H(long j) {
        return this.A03.A03(com.facebook.ads.redexgen.core.C5C.A0C(this.A02, j, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
