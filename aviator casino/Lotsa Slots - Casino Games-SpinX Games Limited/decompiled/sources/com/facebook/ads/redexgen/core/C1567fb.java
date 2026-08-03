package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1567fb {
    public static com.facebook.ads.redexgen.core.C5O A06;
    public static com.facebook.ads.redexgen.core.C5 A07;
    public static com.facebook.ads.redexgen.core.MP A08;
    public static com.facebook.ads.redexgen.core.C1567fb A09;
    public static java.io.File A0A;
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"4y", "AwMrvrZaA3qCUMe4DaWf", "nMell2jjCxhf1iVkS1T4", "JoDZxKxhXC6KTCYPanywHJvOgx3oSz2Q", "c4TvbpAtmy9oRzm3BRhbekxSipSfphPN", "JNxty2uNXQJQugnl9tUmEGg4l4lnFcO6", "Bo5IZ2fGdsUyi7NqIQl4cfXztCU0TldF", "nOSbM9ZPEjvtyh7HAXbSWFPDuf7zpKmZ"};
    public boolean A00;
    public final com.facebook.ads.redexgen.core.C1632ge A04;
    public final android.os.Handler A01 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.C1565fZ> A02 = new android.util.SparseArray<>();
    public final java.lang.Runnable A05 = new com.facebook.ads.redexgen.core.RunnableC1564fY(this);
    public final com.facebook.ads.redexgen.core.C4 A03 = new com.facebook.ads.redexgen.core.D3(this);

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{com.google.common.base.Ascii.VT, 6, com.google.common.base.Ascii.VT, 73, 82, 95, 78, 88, 116, 79, 68, 92, 69, 71, 68, 74, 79, 78, 79, 17, 55, 58, 55, 103, 114, 101, 116, 114, 121, 99, 118, 112, 114, 55, 115, 120, 96, 121, 123, 120, 118, 115, 114, 115, 45, 123, 118, 123, 40, 47, 58, 47, 62, 97, 35, 65, 122, 119, 102, 112, 57, 35, 33, 99, 120, 117, 100, 114, 33, 4, 4, 4, 4, 9, 91, 76, 88, 92, 76, 90, 93, 96, 77, 19, com.google.common.base.Ascii.EM, 50, 42, 51, 49, 50, 60, 57, 56, 57, 115, 125, com.google.common.base.Ascii.SO, 41, 60, 41, 56, 103, 125, 62, 9, 9, com.google.common.base.Ascii.DC4, 9, 85, 91, 40, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 65, 91, 110, 91, 73, 81, 126, 123, 113, 104, 50, 123, 112, 104, 113, 115, 112, 126, 123, 108, 37, 32, 55, 84, 86, 84, 95, 82};
    }

    static {
        A0D();
    }

    public C1567fb(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.C5 c5) {
        this.A04 = c1632ge;
        if (c5 != null) {
            A07 = c5;
            c5.A0F(this.A03);
        }
        A03().A0E();
    }

    public static synchronized com.facebook.ads.redexgen.core.C5O A01(android.content.Context context) {
        com.facebook.ads.redexgen.core.C5O c5o;
        synchronized (com.facebook.ads.redexgen.core.C1567fb.class) {
            if (A06 == null) {
                A06 = new com.facebook.ads.redexgen.core.C2135pI(context);
            }
            c5o = A06;
        }
        return c5o;
    }

    private com.facebook.ads.redexgen.core.AO A02() {
        return new com.facebook.ads.redexgen.core.AO().A01(A08(135, 3, 65)).A00(null);
    }

    private synchronized com.facebook.ads.redexgen.core.C5 A03() {
        A0E();
        return A07;
    }

    public static synchronized com.facebook.ads.redexgen.core.MP A04(android.content.Context context) {
        com.facebook.ads.redexgen.core.MP mp;
        synchronized (com.facebook.ads.redexgen.core.C1567fb.class) {
            if (A08 == null) {
                A08 = new com.facebook.ads.redexgen.core.C1845kM(new java.io.File(A07(context), A08(121, 14, 26)), new com.facebook.ads.redexgen.core.AnonymousClass89(com.facebook.ads.redexgen.core.C1086Up.A0T(context)));
            }
            mp = A08;
        }
        return mp;
    }

    public static com.facebook.ads.redexgen.core.C1852kT A05(com.facebook.ads.redexgen.core.C2131pE c2131pE, com.facebook.ads.redexgen.core.MP mp) {
        return new com.facebook.ads.redexgen.core.C1852kT().A06(mp).A05(c2131pE).A04(new com.facebook.ads.redexgen.core.C2125p8()).A03(2);
    }

    public static synchronized com.facebook.ads.redexgen.core.C1567fb A06(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        com.facebook.ads.redexgen.core.C1567fb c1567fb;
        synchronized (com.facebook.ads.redexgen.core.C1567fb.class) {
            if (A09 == null) {
                A09 = new com.facebook.ads.redexgen.core.C1567fb(c1632ge, null);
            }
            c1567fb = A09;
        }
        return c1567fb;
    }

    public static synchronized java.io.File A07(android.content.Context context) {
        java.io.File file;
        synchronized (com.facebook.ads.redexgen.core.C1567fb.class) {
            if (A0A == null) {
                A0A = context.getCacheDir();
                if (A0A == null) {
                    A0A = context.getFilesDir();
                }
            }
            file = A0A;
        }
        return file;
    }

    public static java.lang.String A09(com.facebook.ads.redexgen.core.C1632ge c1632ge, android.net.Uri uri) {
        try {
            if (!com.facebook.ads.redexgen.core.C1086Up.A1w(c1632ge)) {
                return null;
            }
            return new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (java.net.URISyntaxException e) {
            c1632ge.A08().ABC(A08(138, 5, 50), com.facebook.ads.redexgen.core.AbstractC1048Td.A0u, new com.facebook.ads.redexgen.core.C1049Te(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        for (com.facebook.ads.redexgen.core.C0598Bk c0598Bk : A03().A0D()) {
            int requestId = c0598Bk.A07.A02.hashCode();
            com.facebook.ads.redexgen.core.C1565fZ c1565fZ = this.A02.get(requestId);
            boolean z = c0598Bk.A02 == 2 && c0598Bk.A01() > 0;
            java.lang.String str = A08(69, 15, 44) + requestId + A08(20, 25, 18) + c0598Bk.A00() + A08(0, 20, 46) + c0598Bk.A01() + A08(45, 9, 94) + c0598Bk.A02;
            if (c1565fZ != null) {
                int state = c0598Bk.A02;
                if (state != 3 && !z && c0598Bk.A00() < 100.0f) {
                    long A01 = c0598Bk.A01();
                    java.lang.String[] strArr = A0C;
                    if (strArr[7].charAt(29) == strArr[4].charAt(29)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0C;
                    strArr2[3] = "Dot6Q3Penl8IgXRyTYIqC6CBr4bXo7x7";
                    strArr2[6] = "9ocSvY8ybipVJ0ZgVUYrz9Eev0RZQ1px";
                    if (A01 <= c1565fZ.A00) {
                        if (state == 4 || state == 1) {
                            java.lang.String str2 = A08(103, 14, 126) + state;
                            c1565fZ.A01.ADr(new java.lang.Throwable(java.lang.String.valueOf(c0598Bk.A01)));
                            this.A02.remove(requestId);
                        }
                    }
                }
                java.lang.String str3 = A08(84, 19, 88) + state + A08(54, 8, 6) + c0598Bk.A01();
                c1565fZ.A01.ADj(c1565fZ.A02);
                this.A02.remove(requestId);
            }
            java.lang.String str4 = A08(117, 4, 63) + requestId + A08(62, 7, 4) + c0598Bk.A01();
        }
    }

    private void A0B() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.post(this.A05);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A01.removeCallbacks(this.A05);
        this.A00 = false;
    }

    private synchronized void A0E() {
        if (A07 == null) {
            A07 = new com.facebook.ads.redexgen.core.C5(this.A04, A01(this.A04), A04(this.A04), A0H(this.A04), java.util.concurrent.Executors.newFixedThreadPool(6));
            A07.A0F(this.A03);
        }
    }

    public final com.facebook.ads.redexgen.core.C5Y A0H(android.content.Context context) {
        return A05(new com.facebook.ads.redexgen.core.C2131pE(context, (com.facebook.ads.redexgen.core.InterfaceC04675t) null, A02()), A04(context));
    }

    public final void A0I(android.net.Uri uri, com.facebook.ads.redexgen.core.InterfaceC1566fa interfaceC1566fa, long j) {
        java.lang.String cacheKey = A09(this.A04, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean A0J = A0J(cacheKey);
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A05 = new com.facebook.ads.redexgen.core.C8(uri.toString(), uri).A00(cacheKey).A05();
        A03().A0G(A05);
        this.A02.put(A05.A02.hashCode(), new com.facebook.ads.redexgen.core.C1565fZ(interfaceC1566fa, j, A0J, null));
        A0B();
    }

    public final boolean A0J(java.lang.String str) {
        return A04(this.A04).A7C(str, 0L, 1L) > 0;
    }
}
