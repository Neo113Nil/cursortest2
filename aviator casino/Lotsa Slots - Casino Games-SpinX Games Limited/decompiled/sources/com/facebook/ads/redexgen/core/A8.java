package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class A8 implements com.facebook.ads.redexgen.core.InterfaceC2100oj {
    public static java.lang.String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
    public com.facebook.ads.redexgen.core.InterfaceC03993b A00;
    public com.facebook.ads.redexgen.core.C4X A01;
    public com.facebook.ads.redexgen.core.C04254d<com.facebook.ads.redexgen.core.AnonymousClass88> A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.AnonymousClass45 A07;
    public final com.facebook.ads.redexgen.core.C2163pl A05 = new com.facebook.ads.redexgen.core.C2163pl();
    public final com.facebook.ads.redexgen.core.C2161pj A06 = new com.facebook.ads.redexgen.core.C2161pj();
    public final com.facebook.ads.redexgen.core.C8A A08 = new com.facebook.ads.redexgen.core.C8A(this.A05);
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.AnonymousClass86> A04 = new android.util.SparseArray<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.86] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    private final com.facebook.ads.redexgen.core.AnonymousClass86 A03(final com.facebook.ads.androidx.media3.common.Timeline timeline, final int i, com.facebook.ads.redexgen.core.C2044no c2044no) {
        final com.facebook.ads.redexgen.core.C2044no c2044no2 = c2044no;
        if (timeline.A0N()) {
            c2044no2 = null;
        }
        final long A6J = this.A07.A6J();
        boolean z = timeline.equals(this.A00.A7g()) && i == this.A00.A7b();
        if (c2044no2 != null && c2044no2.A00()) {
            if (z && this.A00.A7Y() == c2044no2.A00 && this.A00.A7Z() == c2044no2.A01) {
                r9 = this.A00.A7e();
            }
        } else if (z) {
            r9 = this.A00.A7T();
            java.lang.String[] strArr = A09;
            if (strArr[3].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
        } else {
            r9 = timeline.A0N() ? 0L : timeline.A0K(i, this.A06).A04();
            java.lang.String[] strArr2 = A09;
            if (strArr2[3].length() == strArr2[1].length()) {
                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
            }
        }
        final com.facebook.ads.redexgen.core.C2044no A06 = this.A08.A06();
        final com.facebook.ads.androidx.media3.common.Timeline A7g = this.A00.A7g();
        final int A7b = this.A00.A7b();
        final long A7e = this.A00.A7e();
        final long A9J = this.A00.A9J();
        return new java.lang.Object(A6J, timeline, i, c2044no2, r9, A7g, A7b, A06, A7e, A9J) { // from class: com.facebook.ads.redexgen.X.86
            public final int A00;
            public final int A01;
            public final long A02;
            public final long A03;
            public final long A04;
            public final long A05;
            public final com.facebook.ads.androidx.media3.common.Timeline A06;
            public final com.facebook.ads.androidx.media3.common.Timeline A07;
            public final com.facebook.ads.redexgen.core.C2044no A08;
            public final com.facebook.ads.redexgen.core.C2044no A09;

            {
                this.A04 = A6J;
                this.A07 = timeline;
                this.A01 = i;
                this.A09 = c2044no2;
                this.A03 = r6;
                this.A06 = A7g;
                this.A00 = A7b;
                this.A08 = A06;
                this.A02 = A7e;
                this.A05 = A9J;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                com.facebook.ads.redexgen.core.AnonymousClass86 anonymousClass86 = (com.facebook.ads.redexgen.core.AnonymousClass86) obj;
                if (this.A04 == anonymousClass86.A04 && this.A01 == anonymousClass86.A01 && this.A03 == anonymousClass86.A03 && this.A00 == anonymousClass86.A00 && this.A02 == anonymousClass86.A02 && this.A05 == anonymousClass86.A05 && com.facebook.ads.redexgen.core.CB.A01(this.A07, anonymousClass86.A07) && com.facebook.ads.redexgen.core.CB.A01(this.A09, anonymousClass86.A09) && com.facebook.ads.redexgen.core.CB.A01(this.A06, anonymousClass86.A06) && com.facebook.ads.redexgen.core.CB.A01(this.A08, anonymousClass86.A08)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return com.facebook.ads.redexgen.core.CB.A00(java.lang.Long.valueOf(this.A04), this.A07, java.lang.Integer.valueOf(this.A01), this.A09, java.lang.Long.valueOf(this.A03), this.A06, java.lang.Integer.valueOf(this.A00), this.A08, java.lang.Long.valueOf(this.A02), java.lang.Long.valueOf(this.A05));
            }
        };
    }

    public A8(com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45) {
        this.A07 = (com.facebook.ads.redexgen.core.AnonymousClass45) com.facebook.ads.redexgen.core.AbstractC04203y.A01(anonymousClass45);
        this.A02 = new com.facebook.ads.redexgen.core.C04254d<>(com.facebook.ads.redexgen.core.C5C.A0d(), anonymousClass45, new com.facebook.ads.redexgen.core.InterfaceC04234b() { // from class: com.facebook.ads.redexgen.X.og
        });
    }

    private final com.facebook.ads.redexgen.core.AnonymousClass86 A00() {
        return A04(this.A08.A06());
    }

    private com.facebook.ads.redexgen.core.AnonymousClass86 A01(int i, com.facebook.ads.redexgen.core.C2044no c2044no) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        boolean z = true;
        if (c2044no != null) {
            if (this.A08.A05(c2044no) == null) {
                z = false;
            }
            if (z) {
                return A04(c2044no);
            }
            return A03(com.facebook.ads.androidx.media3.common.Timeline.A02, i, c2044no);
        }
        com.facebook.ads.androidx.media3.common.Timeline A7g = this.A00.A7g();
        if (i >= A7g.A07()) {
            z = false;
        }
        if (!z) {
            A7g = com.facebook.ads.androidx.media3.common.Timeline.A02;
        }
        return A03(A7g, i, null);
    }

    private com.facebook.ads.redexgen.core.AnonymousClass86 A02(com.facebook.ads.redexgen.core.C2177pz c2177pz) {
        if (c2177pz instanceof com.facebook.ads.redexgen.core.AD) {
            com.facebook.ads.redexgen.core.AD ad = (com.facebook.ads.redexgen.core.AD) c2177pz;
            if (ad.A05 != null) {
                return A04(new com.facebook.ads.redexgen.core.C2044no(ad.A05));
            }
        }
        return A00();
    }

    private com.facebook.ads.redexgen.core.AnonymousClass86 A04(com.facebook.ads.redexgen.core.C2044no c2044no) {
        com.facebook.ads.androidx.media3.common.Timeline A05;
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        if (c2044no == null) {
            A05 = null;
        } else {
            A05 = this.A08.A05(c2044no);
        }
        if (c2044no == null || A05 == null) {
            int windowIndex = this.A00.A7b();
            com.facebook.ads.androidx.media3.common.Timeline knownTimeline = this.A00.A7g();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = com.facebook.ads.androidx.media3.common.Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(A05, A05.A0J(c2044no.A04, this.A05).A00, c2044no);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
    private final void A05(com.facebook.ads.redexgen.core.AnonymousClass86 anonymousClass86, int i, com.facebook.ads.redexgen.core.InterfaceC04224a<com.facebook.ads.redexgen.core.AnonymousClass88> interfaceC04224a) {
        this.A04.put(i, anonymousClass86);
        this.A02.A0A(i, interfaceC04224a);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2100oj
    public final void ACe() {
        if (!this.A03) {
            final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
            this.A03 = true;
            A05(A00, -1, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oe
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void ADZ(final com.facebook.ads.redexgen.core.C2144pR c2144pR) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
        A05(A00, 27, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oc
        });
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void ADa(final java.util.List<com.facebook.ads.redexgen.core.C2146pT> list) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
        A05(A00, 27, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oR
        });
    }

    @Override // com.facebook.ads.redexgen.core.D9
    public final void ADk(int i, com.facebook.ads.redexgen.core.C2044no c2044no, final com.facebook.ads.redexgen.core.C0629Cs c0629Cs) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A01 = A01(i, c2044no);
        A05(A01, 1004, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oh
        });
    }

    @Override // com.facebook.ads.redexgen.core.D9
    public final void AEb(int i, com.facebook.ads.redexgen.core.C2044no c2044no, final com.facebook.ads.redexgen.core.Cq cq, final com.facebook.ads.redexgen.core.C0629Cs c0629Cs) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A01 = A01(i, c2044no);
        A05(A01, 1002, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.od
        });
    }

    @Override // com.facebook.ads.redexgen.core.D9
    public final void AEd(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i, @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) com.facebook.ads.redexgen.core.C2044no c2044no, final com.facebook.ads.redexgen.core.Cq cq, final com.facebook.ads.redexgen.core.C0629Cs c0629Cs, java.lang.Object obj, java.lang.Object obj2) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A01 = A01(i, c2044no);
        A05(A01, 1001, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oT
        });
    }

    @Override // com.facebook.ads.redexgen.core.D9
    public final void AEg(int i, com.facebook.ads.redexgen.core.C2044no c2044no, final com.facebook.ads.redexgen.core.Cq cq, final com.facebook.ads.redexgen.core.C0629Cs c0629Cs, final java.io.IOException iOException, final boolean z) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A01 = A01(i, c2044no);
        A05(A01, 1003, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oi
        });
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void AFI(final com.facebook.ads.redexgen.core.C2175px c2175px) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
        A05(A00, 12, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.ob
        });
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void AFK(final com.facebook.ads.redexgen.core.C2177pz c2177pz) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A02 = A02(c2177pz);
        A05(A02, 10, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.of
        });
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void AFM(final boolean z, final int i) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
        A05(A00, -1, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oa
        });
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void AFt() {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
        A05(A00, -1, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oS
        });
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void AGA(com.facebook.ads.androidx.media3.common.Timeline timeline, final int i) {
        this.A08.A07((com.facebook.ads.redexgen.core.InterfaceC03993b) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00));
        final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
        A05(A00, 0, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oY
        });
    }

    @Override // com.facebook.ads.redexgen.core.C3U
    public final void AGE(final com.facebook.ads.redexgen.core.C2151pY c2151pY) {
        final com.facebook.ads.redexgen.core.AnonymousClass86 A00 = A00();
        A05(A00, 2, new com.facebook.ads.redexgen.core.InterfaceC04224a() { // from class: com.facebook.ads.redexgen.X.oW
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2100oj
    public final void AJf(final com.facebook.ads.redexgen.core.InterfaceC03993b interfaceC03993b, android.os.Looper looper) {
        boolean z;
        com.facebook.ads.redexgen.core.BP bp;
        if (this.A00 != null) {
            bp = this.A08.A03;
            if (!bp.isEmpty()) {
                z = false;
                com.facebook.ads.redexgen.core.AbstractC04203y.A08(z);
                this.A00 = (com.facebook.ads.redexgen.core.InterfaceC03993b) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC03993b);
                this.A01 = this.A07.A5P(looper, null);
                this.A02 = this.A02.A07(looper, new com.facebook.ads.redexgen.core.InterfaceC04234b() { // from class: com.facebook.ads.redexgen.X.oZ
                });
            }
        }
        z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(z);
        this.A00 = (com.facebook.ads.redexgen.core.InterfaceC03993b) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC03993b);
        this.A01 = this.A07.A5P(looper, null);
        this.A02 = this.A02.A07(looper, new com.facebook.ads.redexgen.core.InterfaceC04234b() { // from class: com.facebook.ads.redexgen.X.oZ
        });
    }
}
