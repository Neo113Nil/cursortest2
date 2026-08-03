package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AA extends com.facebook.ads.redexgen.core.AbstractC2201qP implements com.facebook.ads.redexgen.core.InterfaceC2109os {
    public static byte[] A0N;
    public static java.lang.String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public android.view.Surface A03;
    public android.view.SurfaceHolder A04;
    public android.view.TextureView A05;
    public com.facebook.ads.redexgen.core.C2202qQ A06;
    public com.facebook.ads.redexgen.core.C2196qI A07;
    public com.facebook.ads.redexgen.core.C2196qI A08;
    public com.facebook.ads.redexgen.core.C6I A09;
    public com.facebook.ads.redexgen.core.C6I A0A;
    public com.facebook.ads.redexgen.core.InterfaceC0634Cx A0B;
    public boolean A0C;
    public final android.os.Handler A0D;
    public final com.facebook.ads.redexgen.core.AC A0E;
    public final com.facebook.ads.redexgen.core.SurfaceHolderCallbackC2103om A0F;
    public final com.facebook.ads.redexgen.core.InterfaceC2100oj A0G;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.InterfaceC05408p> A0H;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.C3U> A0I;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.InterfaceC0593Bf> A0J;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.GQ> A0K;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.InterfaceC2102ol> A0L;
    public final com.facebook.ads.redexgen.core.InterfaceC2105oo[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AA(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC05197t interfaceC05197t, com.facebook.ads.redexgen.core.AbstractC0685Ew abstractC0685Ew, com.facebook.ads.redexgen.core.AnonymousClass74 anonymousClass74, com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.InterfaceC1847kO<com.facebook.ads.redexgen.core.AnonymousClass45, com.facebook.ads.redexgen.core.InterfaceC2100oj> interfaceC1847kO, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45) {
        this.A0F = new com.facebook.ads.redexgen.core.SurfaceHolderCallbackC2103om(this);
        this.A0L = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0J = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0K = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0H = new java.util.concurrent.CopyOnWriteArraySet<>();
        android.os.Looper myLooper = android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper();
        this.A0D = new android.os.Handler(myLooper);
        this.A0M = interfaceC05197t.A5Y(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, a6);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = com.facebook.ads.redexgen.core.C2202qQ.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, abstractC0685Ew, anonymousClass74, f6, anonymousClass45);
        this.A0G = interfaceC1847kO.A4B(anonymousClass45);
        this.A0G.AJf(this.A0E, myLooper);
        this.A0I = new java.util.concurrent.CopyOnWriteArraySet<>();
    }

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{-41, -19, -15, -12, -16, -23, -55, -4, -13, -44, -16, -27, -3, -23, -10, com.google.common.base.Ascii.FF, 46, 43, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, 49, 45, 46, 43, com.google.common.base.Ascii.RS, 5, 34, 44, 45, com.google.common.base.Ascii.RS, 39, com.google.common.base.Ascii.RS, 43, -39, com.google.common.base.Ascii.SUB, 37, 43, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, 50, -39, 46, 39, 44, com.google.common.base.Ascii.RS, 45, -39, 40, 43, -39, 43, com.google.common.base.Ascii.RS, 41, 37, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, -25};
    }

    static {
        A0E();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<com.facebook.ads.androidx.media3.common.util.Clock, com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsCollector> */
    public AA(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC05197t interfaceC05197t, com.facebook.ads.redexgen.core.AbstractC0685Ew abstractC0685Ew, com.facebook.ads.redexgen.core.AnonymousClass74 anonymousClass74, com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.InterfaceC1847kO<com.facebook.ads.redexgen.core.AnonymousClass45, com.facebook.ads.redexgen.core.InterfaceC2100oj> interfaceC1847kO) {
        this(context, interfaceC05197t, abstractC0685Ew, anonymousClass74, f6, a6, interfaceC1847kO, com.facebook.ads.redexgen.core.AnonymousClass45.A00);
    }

    @java.lang.Deprecated
    public AA(com.facebook.ads.redexgen.core.InterfaceC05197t interfaceC05197t, com.facebook.ads.redexgen.core.AbstractC0685Ew abstractC0685Ew, com.facebook.ads.redexgen.core.AnonymousClass74 anonymousClass74, com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.A6 a6) {
        this(null, interfaceC05197t, abstractC0685Ew, anonymousClass74, f6, a6, new com.facebook.ads.redexgen.core.InterfaceC1847kO() { // from class: com.facebook.ads.redexgen.X.or
            @Override // com.facebook.ads.redexgen.core.InterfaceC1847kO
            public final java.lang.Object A4B(java.lang.Object obj) {
                return new com.facebook.ads.redexgen.core.A8((com.facebook.ads.redexgen.core.AnonymousClass45) obj);
            }
        });
    }

    private final com.facebook.ads.redexgen.core.AC A06(com.facebook.ads.redexgen.core.InterfaceC2105oo[] interfaceC2105ooArr, com.facebook.ads.redexgen.core.AbstractC0685Ew abstractC0685Ew, com.facebook.ads.redexgen.core.AnonymousClass74 anonymousClass74, com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45) {
        return new com.facebook.ads.redexgen.core.AC(interfaceC2105ooArr, abstractC0685Ew, anonymousClass74, f6, anonymousClass45);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                android.util.Log.w(A07(0, 15, 71), A07(15, 49, 124));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            java.lang.String[] strArr = A0O;
            if (strArr[6].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0O;
            strArr2[6] = "1mt3T64XRkFMJTK0AHNCLCnfNjMbTppi";
            strArr2[3] = "rnp4JtgfYQ";
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(android.view.Surface surface, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.facebook.ads.redexgen.core.InterfaceC2105oo interfaceC2105oo : this.A0M) {
            if (interfaceC2105oo.A9N() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC2105oo).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.facebook.ads.redexgen.core.C05037d) it.next()).A0C();
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2201qP
    public final void A0H(int i, long j) {
        this.A0G.ACe();
        this.A0E.A0H(i, j);
    }

    public final int A0I() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.C2196qI A0J() {
        return this.A07;
    }

    public final com.facebook.ads.redexgen.core.C2196qI A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f) {
        float A00 = com.facebook.ads.redexgen.core.C5C.A00(f, 0.0f, 1.0f);
        if (this.A00 == A00) {
            return;
        }
        this.A00 = A00;
        for (com.facebook.ads.redexgen.core.InterfaceC2105oo interfaceC2105oo : this.A0M) {
            if (interfaceC2105oo.A9N() == 1) {
                this.A0E.A0L(interfaceC2105oo).A07(2).A08(java.lang.Float.valueOf(A00)).A06();
            }
        }
    }

    public final void A0N(android.view.Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(com.facebook.ads.redexgen.core.C3U c3u) {
        this.A0E.A0O(c3u);
        this.A0I.add(c3u);
    }

    public final void A0P(com.facebook.ads.redexgen.core.InterfaceC2102ol interfaceC2102ol) {
        this.A0L.add(interfaceC2102ol);
    }

    public final void A0Q(com.facebook.ads.redexgen.core.InterfaceC0634Cx interfaceC0634Cx) {
        A0R(interfaceC0634Cx, true, true);
    }

    public final void A0R(com.facebook.ads.redexgen.core.InterfaceC0634Cx interfaceC0634Cx, boolean z, boolean z2) {
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
        }
        this.A0B = interfaceC0634Cx;
        interfaceC0634Cx.A3z(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC0634Cx, z, z2);
    }

    public final void A0S(boolean z) {
        this.A0E.A0Q(z);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final long A77() {
        return this.A0E.A77();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final long A7T() {
        return this.A0E.A7T();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final int A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final int A7b() {
        return this.A0E.A7b();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final int A7c() {
        return this.A0E.A7c();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final long A7e() {
        return this.A0E.A7e();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final com.facebook.ads.androidx.media3.common.Timeline A7g() {
        return this.A0E.A7g();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final int A7h() {
        return this.A0E.A7h();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final long A7s() {
        return this.A0E.A7s();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final long A9J() {
        return this.A0E.A9J();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final boolean AAd() {
        return this.A0E.AAd();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03993b
    public final void AKG(boolean z) {
        this.A0E.AKG(z);
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
            if (z) {
                this.A0B = null;
            }
        }
    }
}
