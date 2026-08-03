package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2004nA implements com.facebook.ads.redexgen.core.F6, com.facebook.ads.redexgen.core.InterfaceC04675t {
    public int A00;
    public int A01;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Needed for Meta Custom getAvailableSamples")
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public boolean A0A;
    public final com.facebook.ads.redexgen.core.AnonymousClass45 A0B;
    public final com.facebook.ads.redexgen.core.F4 A0C;
    public final com.facebook.ads.redexgen.core.FW A0D;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Upstream uses Map. Oculus doesn't play well with these collections")
    public final java.util.Map<java.lang.Integer, java.lang.Long> A0E;
    public final boolean A0F;
    public static final java.util.List<java.lang.Long> A0L = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final java.util.List<java.lang.Long> A0G = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final java.util.List<java.lang.Long> A0H = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final java.util.List<java.lang.Long> A0I = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final java.util.List<java.lang.Long> A0J = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final java.util.List<java.lang.Long> A0K = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    @java.lang.Deprecated
    public C2004nA() {
        this(null, java.util.Collections.emptyMap(), 2000, com.facebook.ads.redexgen.core.AnonymousClass45.A00, false);
    }

    public C2004nA(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Long> initialBitrateEstimates, int i, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45, boolean z) {
        this.A0E = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A04(initialBitrateEstimates);
        this.A0C = new com.facebook.ads.redexgen.core.F4();
        this.A0D = new com.facebook.ads.redexgen.core.FW(i);
        this.A0B = anonymousClass45;
        this.A0F = z;
        if (context != null) {
            com.facebook.ads.redexgen.core.C04374p A03 = com.facebook.ads.redexgen.core.C04374p.A03(context);
            this.A00 = A03.A09();
            this.A04 = A00(this.A00);
            A03.A0A(new com.facebook.ads.redexgen.core.InterfaceC04354n() { // from class: com.facebook.ads.redexgen.X.nB
                @Override // com.facebook.ads.redexgen.core.InterfaceC04354n
                public final void AF1(int i2) {
                    com.facebook.ads.redexgen.core.C2004nA.this.A01(i2);
                }
            });
            return;
        }
        this.A00 = 0;
        this.A04 = A00(0);
    }

    private long A00(int i) {
        java.lang.Long initialBitrateEstimate = this.A0E.get(java.lang.Integer.valueOf(i));
        if (initialBitrateEstimate == null) {
            initialBitrateEstimate = this.A0E.get(0);
        }
        if (initialBitrateEstimate == null) {
            initialBitrateEstimate = 1000000L;
        }
        return initialBitrateEstimate.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A01(int i) {
        int sampleElapsedTimeMs;
        if (this.A00 == 0 || this.A0F) {
            if (this.A0A) {
                i = this.A01;
            }
            if (this.A00 == i) {
                return;
            }
            this.A00 = i;
            if (i == 1 || i == 0 || i == 8) {
                return;
            }
            this.A04 = A00(i);
            long A6J = this.A0B.A6J();
            if (this.A03 > 0) {
                long nowMs = A6J - this.A07;
                sampleElapsedTimeMs = (int) nowMs;
            } else {
                sampleElapsedTimeMs = 0;
            }
            A02(sampleElapsedTimeMs, this.A06, this.A04);
            this.A07 = A6J;
            this.A06 = 0L;
            this.A08 = 0L;
            this.A09 = 0L;
            this.A0D.A06();
        }
    }

    private void A02(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.A05) {
            return;
        }
        this.A05 = j2;
        this.A0C.A00(i, j, j2);
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C04565i c04565i, boolean z) {
        return z && !c04565i.A06(8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04675t
    public final synchronized void ADK(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.C04565i c04565i, boolean z, int i) {
        if (A04(c04565i, z)) {
            this.A06 += i;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04675t
    public final synchronized void AGG(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.C04565i c04565i, boolean z) {
        if (A04(c04565i, z)) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A03 > 0);
            long nowMs = this.A0B.A6J();
            int i = (int) (nowMs - this.A07);
            this.A09 += i;
            this.A08 += this.A06;
            if (i > 0) {
                com.facebook.ads.redexgen.core.FW fw = this.A0D;
                int sampleElapsedTimeMs = (int) java.lang.Math.sqrt(this.A06);
                fw.A07(sampleElapsedTimeMs, (this.A06 * 8000.0f) / i);
                if (this.A09 >= 2000 || this.A08 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.A04 = (long) this.A0D.A05(0.5f);
                }
                int sampleElapsedTimeMs2 = this.A02;
                this.A02 = sampleElapsedTimeMs2 + 1;
                A02(i, this.A06, this.A04);
                this.A07 = nowMs;
                this.A06 = 0L;
            }
            int sampleElapsedTimeMs3 = this.A03;
            this.A03 = sampleElapsedTimeMs3 - 1;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04675t
    public final synchronized void AGH(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.C04565i c04565i, boolean z, boolean z2) {
        if (A04(c04565i, z)) {
            if (this.A03 == 0) {
                this.A07 = this.A0B.A6J();
            }
            this.A03++;
        }
    }
}
