package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class GP {
    public final android.os.Handler A00;
    public final com.facebook.ads.redexgen.core.GQ A01;

    public GP(android.os.Handler handler, com.facebook.ads.redexgen.core.GQ gq) {
        this.A00 = gq != null ? (android.os.Handler) com.facebook.ads.redexgen.core.AbstractC04203y.A01(handler) : null;
        this.A01 = gq;
    }

    public final void A00(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GL
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A02(i, j);
                }
            });
        }
    }

    public final void A01(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GC
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A03(i, j);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j) {
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).ADU(i, j);
    }

    public final /* synthetic */ void A03(int i, long j) {
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).ADl(i, j);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("New event handler")
    public final void A04(int i, com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.GO(this, i, c2196qI));
        }
    }

    public final void A05(final com.facebook.ads.redexgen.core.C2196qI c2196qI, final com.facebook.ads.redexgen.core.C6L c6l) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GI
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A06(c2196qI, c6l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C6L c6l) {
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AGU(c2196qI);
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AGV(c2196qI, c6l);
    }

    public final void A07(final com.facebook.ads.redexgen.core.C2149pW c2149pW) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GK
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A08(c2149pW);
                }
            });
        }
    }

    public final /* synthetic */ void A08(com.facebook.ads.redexgen.core.C2149pW c2149pW) {
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AGb(c2149pW);
    }

    public final void A09(final com.facebook.ads.redexgen.core.C6I c6i) {
        c6i.A02();
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GM
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A0B(c6i);
                }
            });
        }
    }

    public final void A0A(final com.facebook.ads.redexgen.core.C6I c6i) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GG
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A0C(c6i);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(com.facebook.ads.redexgen.core.C6I c6i) {
        c6i.A02();
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AGO(c6i);
    }

    public final /* synthetic */ void A0C(com.facebook.ads.redexgen.core.C6I c6i) {
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AGP(c6i);
    }

    public final void A0D(final java.lang.Object obj) {
        if (this.A00 != null) {
            final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GH
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A0E(obj, elapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(java.lang.Object obj, long j) {
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AFf(obj, j);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("New event handler")
    public final void A0F(final java.lang.String str) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GJ
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final java.lang.String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.GF
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.GP.this.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(java.lang.String str, long j, long j2) {
        ((com.facebook.ads.redexgen.core.GQ) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AGN(str, j, j2);
    }
}
