package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05579n extends com.facebook.ads.redexgen.core.AbstractC2051nv implements com.facebook.ads.redexgen.core.DI {
    public long A00;
    public com.facebook.ads.redexgen.core.InterfaceC04675t A01;
    public com.facebook.ads.redexgen.core.InterfaceC1877ku<com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final com.facebook.ads.redexgen.core.AnonymousClass32 A07;
    public final com.facebook.ads.redexgen.core.C2185q7 A08;
    public final com.facebook.ads.redexgen.core.C5Y A09;
    public final com.facebook.ads.redexgen.core.A6 A0A;
    public final com.facebook.ads.redexgen.core.DC A0B;
    public final com.facebook.ads.redexgen.core.FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C05579n(com.facebook.ads.redexgen.core.C2185q7 c2185q7, com.facebook.ads.redexgen.core.C5Y c5y, com.facebook.ads.redexgen.core.DC dc, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.FF ff, int i, com.facebook.ads.redexgen.core.InterfaceC1877ku<com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb> interfaceC1877ku) {
        this.A07 = (com.facebook.ads.redexgen.core.AnonymousClass32) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2185q7.A03);
        this.A08 = c2185q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? com.facebook.ads.redexgen.core.A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC1877ku;
    }

    private void A00() {
        final com.facebook.ads.androidx.media3.common.Timeline c05569m = new com.facebook.ads.redexgen.core.C05569m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            com.facebook.ads.androidx.media3.common.Timeline timeline = new com.facebook.ads.redexgen.core.C9t(c05569m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final com.facebook.ads.redexgen.core.C2163pl A0I(int i, com.facebook.ads.redexgen.core.C2163pl c2163pl, boolean z) {
                    super.A0I(i, c2163pl, z);
                    c2163pl.A05 = true;
                    return c2163pl;
                }

                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final com.facebook.ads.redexgen.core.C2161pj A0L(int i, com.facebook.ads.redexgen.core.C2161pj c2161pj, long j) {
                    super.A0L(i, c2161pj, j);
                    c2161pj.A0F = true;
                    return c2161pj;
                }
            };
            c05569m = timeline;
        }
        A05(c05569m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2051nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2051nv
    public final void A0A(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        this.A01 = interfaceC04675t;
        this.A0A.AH4();
        this.A0A.AJe((android.os.Looper) com.facebook.ads.redexgen.core.AbstractC04203y.A01(android.os.Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0634Cx
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("PlayerId needs to be set")
    public final com.facebook.ads.redexgen.core.InterfaceC2045np A5W(com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.redexgen.core.F0 f0, long j) {
        com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb interfaceExecutorC0690Fb;
        com.facebook.ads.redexgen.core.InterfaceC2132pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        android.net.Uri uri = this.A07.A00;
        com.facebook.ads.redexgen.core.DD A5X = this.A0B.A5X(com.facebook.ads.redexgen.core.C8O.A03);
        com.facebook.ads.redexgen.core.A6 a6 = this.A0A;
        com.facebook.ads.redexgen.core.A1 A01 = A01(c2044no);
        com.facebook.ads.redexgen.core.FF ff = this.A0C;
        com.facebook.ads.redexgen.core.D8 A02 = A02(c2044no);
        java.lang.String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0690Fb = this.A02.get();
        } else {
            interfaceExecutorC0690Fb = null;
        }
        return new com.facebook.ads.redexgen.core.C05599p(uri, A5I, A5X, a6, A01, ff, A02, this, f0, str, i, interfaceExecutorC0690Fb);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0634Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG0(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0634Cx
    public final void AHk(com.facebook.ads.redexgen.core.InterfaceC2045np interfaceC2045np) {
        ((com.facebook.ads.redexgen.core.C05599p) interfaceC2045np).A0a();
    }
}
