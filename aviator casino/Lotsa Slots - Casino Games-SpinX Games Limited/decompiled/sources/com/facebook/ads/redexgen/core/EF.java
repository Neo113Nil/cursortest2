package com.facebook.ads.redexgen.core;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* loaded from: assets/audience_network/classes2.dex */
public class EF {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"pLRRT7xfKKmC", "sDjB9WgW1E6gHf8gwZURHsTrfoUrQz1T", "uiJP8xmaVv", "5XKoBHy1xynVgVvyT837PyBbXD1HwArb", "BpJCepaU8WbBulVTB", "9USxYKvyty1bKFarGQoBTCJfC9", "y9X2NkRV2raN2WQBQaXrllWfrJ", "7FHQr1tSmfn5NF7ZWaBxZ9Q6x0"};
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.InterfaceC1513ej A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final com.facebook.ads.redexgen.core.C1727iE A0C;
    public final com.facebook.ads.redexgen.core.C1636gi A0D;
    public final com.facebook.ads.redexgen.core.VA A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC1512ei A0F;
    public final com.facebook.ads.redexgen.core.InterfaceC1521er A0G;
    public final com.facebook.ads.redexgen.core.C1522es A0H;
    public final java.lang.String A0J;
    public final java.util.Map<java.lang.String, java.lang.String> A0K;
    public final java.lang.Object A0I = new java.lang.Object();
    public int A00 = 0;
    public java.lang.String A04 = null;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public EF(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1512ei interfaceC1512ei, java.lang.String str, boolean z, int i, int i2, boolean z2, android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.String> map, com.facebook.ads.redexgen.core.InterfaceC1521er interfaceC1521er) {
        this.A02 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A0B = false;
        this.A07 = false;
        this.A06 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0D = c1636gi;
        this.A0E = va;
        this.A0F = interfaceC1512ei;
        this.A0J = str;
        this.A0K = map;
        this.A08 = z;
        this.A07 = z2;
        this.A0G = interfaceC1521er;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.facebook.ads.redexgen.core.EH(this, 0.5d, -1.0d, 2.0d, true));
        arrayList.add(new com.facebook.ads.redexgen.core.EG(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A0C = new com.facebook.ads.redexgen.core.C1727iE(arrayList, bundle.getBundle(A0H(6, 16, 57)), this.A0G);
            this.A02 = bundle.getInt(A0H(97, 18, 74));
            this.A01 = bundle.getInt(A0H(79, 18, 108));
            this.A06 = bundle.getBoolean(A0H(146, 10, 97), false);
            this.A0A = bundle.getBoolean(A0H(171, 20, 71), false);
            this.A09 = bundle.getBoolean(A0H(156, 15, 59), false);
        } else {
            this.A02 = i;
            this.A01 = i2;
            this.A0C = new com.facebook.ads.redexgen.core.C1727iE(arrayList, this.A0G);
        }
        this.A05 = com.facebook.ads.redexgen.core.C1086Up.A2W(this.A0D);
        this.A0B = com.facebook.ads.redexgen.core.C1086Up.A2a(this.A0D);
        this.A0H = new com.facebook.ads.redexgen.core.C1522es(new android.os.Handler(), this);
    }

    public static java.lang.String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0O() {
        A0L = new byte[]{-86, -84, -67, -78, -72, -73, -53, -50, -69, -33, -53, -42, -45, -34, -29, -73, -53, -40, -53, -47, -49, -36, -75, -56, -67, -63, -71, -77, -63, -57, -65, -48, -59, -55, -63, -71, -70, -63, -76, -74, -55, -66, -62, -70, -76, -62, -56, -42, -41, -34, -47, -24, -26, -37, -33, -41, -47, -33, -27, -49, -32, -49, -40, -34, -55, -45, -40, -50, -49, -30, -69, -50, -59, -58, -62, -73, -49, -69, -56, 9, -2, com.google.common.base.Ascii.DLE, 17, -33, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, 1, -2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SYN, -15, 6, 10, 2, -22, -16, -25, -36, -18, -17, -53, -19, -22, -30, -19, -32, -18, -18, -49, -28, -24, -32, -56, -50, -46, -56, -58, -39, -60, -46, -40, -17, -27, -8, -10, -31, -17, -11, -38, -46, -35, -39, -5, -3, -16, -5, -5, -1, -62, -58, -69, -65, -73, -44, -37, 5, 6, -13, 6, -9, -15, -10, 1, 0, -9, -33, -32, -51, -32, -47, -53, -39, -34, -49, -53, -46, -43, -34, -47, -48, -21, -20, -39, -20, -35, -41, -18, -31, -35, -17, -39, -38, -28, -35, -41, -34, -31, -22, -35, -36, -6, -17, -13, -21, -6, -16, -27, -13, -23, -22, -28, -38, -37, -49, -26, -85, -91, -99, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, 32, 19, 17, 6, 10, 2, -4, 10, com.google.common.base.Ascii.DLE, -70, -69, -93, -74, -73, -78, -64, -63, -85, -81, -80, -90, -30, -29, -39, -51, -28, com.google.common.base.Ascii.CAN, 10, com.google.common.base.Ascii.SI, 5, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN};
    }

    static {
        A0O();
    }

    private final float A0F() {
        return com.facebook.ads.redexgen.core.Y7.A00(this.A0D) * this.A0F.getVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.String> A0J(com.facebook.ads.redexgen.core.EnumC1514ek enumC1514ek) {
        int currentPositionInMillis = this.A0F.getCurrentPositionInMillis();
        int i = this.A00 + 1;
        this.A00 = i;
        return A0K(enumC1514ek, currentPositionInMillis, i);
    }

    private java.util.Map<java.lang.String, java.lang.String> A0K(com.facebook.ads.redexgen.core.EnumC1514ek enumC1514ek, int i, int i2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.facebook.ads.redexgen.core.Y7.A03(hashMap, this.A0F.getVideoStartReason() == com.facebook.ads.redexgen.core.EnumC1523et.A02, !this.A0F.AAV());
        A0U(hashMap);
        A0S(hashMap);
        A0W(hashMap, i);
        A0V(hashMap);
        A0T(hashMap);
        A0n(enumC1514ek, hashMap);
        hashMap.put(A0H(0, 6, 24), java.lang.String.valueOf(enumC1514ek.A00));
        hashMap.put(A0H(59, 11, 57), java.lang.String.valueOf(i2));
        return hashMap;
    }

    private void A0M() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(com.facebook.ads.redexgen.core.EnumC1514ek.A04));
    }

    private void A0N() {
        if (this.A07 && this.A06) {
            return;
        }
        java.lang.String str = this.A0J;
        java.lang.String[] strArr = A0M;
        if (strArr[2].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        A0M[6] = "FJm4aBnN5GbAhpBnCwQDj";
        A0R(str, A0J(com.facebook.ads.redexgen.core.EnumC1514ek.A0A));
    }

    private final void A0P(int i, boolean z, boolean z2) {
        if (i <= 0.0d || i < this.A02) {
            return;
        }
        if (i > this.A02) {
            this.A0C.A06((i - this.A02) / 1000.0f, A0F());
            double A9V = this.A0G.A9V();
            if (A9V < 0.5d && com.facebook.ads.redexgen.core.C1086Up.A1i(this.A0D)) {
                this.A0D.A0F().AKk(java.lang.String.valueOf(A9V));
            }
            this.A02 = i;
            if (z2 || i - this.A01 >= 5000) {
                java.lang.String str = this.A0J;
                com.facebook.ads.redexgen.core.EnumC1514ek enumC1514ek = com.facebook.ads.redexgen.core.EnumC1514ek.A09;
                int i2 = this.A00 + 1;
                this.A00 = i2;
                A0R(str, A0K(enumC1514ek, i, i2));
                this.A01 = this.A02;
                this.A0C.A05();
                return;
            }
        }
        if (z) {
            if (this.A07 && this.A06) {
                return;
            }
            this.A06 = true;
            java.lang.String str2 = this.A0J;
            com.facebook.ads.redexgen.core.EnumC1514ek enumC1514ek2 = com.facebook.ads.redexgen.core.EnumC1514ek.A09;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            A0R(str2, A0K(enumC1514ek2, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        this.A0E.ACB(str, data);
        if (this.A03 != null) {
            this.A03.AEk();
        }
    }

    private void A0S(java.util.Map<java.lang.String, java.lang.String> params) {
        com.facebook.ads.redexgen.core.C0925Of A03 = this.A0C.A03();
        com.facebook.ads.redexgen.core.C0924Oe A00 = A03.A00();
        params.put(A0H(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 3, 25), java.lang.String.valueOf(A00.A00()));
        params.put(A0H(229, 3, 8), java.lang.String.valueOf(A00.A06()));
        params.put(A0H(232, 5, 59), java.lang.String.valueOf(A00.A03()));
        params.put(A0H(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 8, 108), java.lang.String.valueOf(A00.A02() * 1000.0d));
        params.put(A0H(47, 12, 65), java.lang.String.valueOf(A00.A01() * 1000.0d));
        params.put(A0H(122, 7, 81), java.lang.String.valueOf(A00.A04() * 1000.0d));
        if (this.A04 != null) {
            params.put(A0H(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 6, 19), this.A04);
        }
        com.facebook.ads.redexgen.core.C0924Oe A01 = A03.A01();
        params.put(A0H(195, 3, 83), java.lang.String.valueOf(A01.A00()));
        params.put(A0H(198, 3, 76), java.lang.String.valueOf(A01.A06()));
        params.put(A0H(201, 5, 61), java.lang.String.valueOf(A01.A03()));
        params.put(A0H(22, 8, 35), java.lang.String.valueOf(A01.A02() * 1000.0d));
        params.put(A0H(35, 12, 36), java.lang.String.valueOf(A01.A01() * 1000.0d));
        params.put(A0H(115, 7, 52), java.lang.String.valueOf(A01.A04() * 1000.0d));
    }

    private void A0T(java.util.Map<java.lang.String, java.lang.String> params) {
        if (this.A0K != null) {
            params.putAll(this.A0K);
        }
    }

    private void A0U(java.util.Map<java.lang.String, java.lang.String> map) {
        map.put(A0H(70, 9, 37), java.lang.String.valueOf(this.A0F.AAQ()));
        map.put(A0H(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 4, 90), java.lang.Long.toString(this.A0F.getInitialBufferTime()));
    }

    private void A0V(java.util.Map<java.lang.String, java.lang.String> params) {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.A0F.getGlobalVisibleRect(rect);
        params.put(A0H(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 2, 90), java.lang.String.valueOf(rect.top));
        params.put(A0H(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 2, 60), java.lang.String.valueOf(rect.left));
        params.put(A0H(129, 2, 57), java.lang.String.valueOf(this.A0F.getMeasuredHeight()));
        params.put(A0H(144, 2, 51), java.lang.String.valueOf(this.A0F.getMeasuredWidth()));
        android.view.WindowManager windowManager = (android.view.WindowManager) this.A0D.getSystemService(A0H(237, 6, 112));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0H(206, 3, 4), java.lang.String.valueOf(displayMetrics.heightPixels));
        params.put(A0H(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 3, 120), java.lang.String.valueOf(displayMetrics.widthPixels));
    }

    private void A0W(java.util.Map<java.lang.String, java.lang.String> map, int i) {
        map.put(A0H(30, 5, 43), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        map.put(A0H(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 5, 33), java.lang.String.valueOf(this.A01 / 1000.0f));
        map.put(A0H(191, 4, 85), java.lang.String.valueOf(i / 1000.0f));
    }

    public final int A0b() {
        return this.A02;
    }

    public final android.os.Bundle A0c() {
        A0l(A0b(), A0b());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(A0H(97, 18, 74), this.A02);
        bundle.putInt(A0H(79, 18, 108), this.A01);
        bundle.putBoolean(A0H(146, 10, 97), this.A06);
        bundle.putBoolean(A0H(171, 20, 71), this.A0A);
        bundle.putBoolean(A0H(156, 15, 59), this.A09);
        bundle.putBundle(A0H(6, 16, 57), this.A0C.A02());
        return bundle;
    }

    public final void A0d() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(com.facebook.ads.redexgen.core.EnumC1514ek.A07));
    }

    public final void A0e() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(com.facebook.ads.redexgen.core.EnumC1514ek.A08));
    }

    public final void A0f() {
        if (A0F() < 0.05d) {
            synchronized (this.A0I) {
                if (this.A08) {
                    A0M();
                    this.A08 = false;
                }
            }
            return;
        }
        synchronized (this.A0I) {
            if (!this.A08) {
                A0N();
                this.A08 = true;
            }
        }
    }

    public final void A0g() {
        this.A0D.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this.A0H);
    }

    public final void A0h() {
        this.A0D.getContentResolver().unregisterContentObserver(this.A0H);
    }

    public final void A0i(int i) {
        if (this.A07 && this.A06) {
            return;
        }
        this.A0C.A04();
        A0R(this.A0J, A0J(com.facebook.ads.redexgen.core.EnumC1514ek.A05));
        if (this.A05) {
            A0P(i, false, true);
        } else {
            A0P(i, false, ((double) i) < 2000.0d);
        }
        if (this.A0B) {
            this.A0C.A05();
        }
    }

    public final void A0j(int i) {
        A0P(i, true, false);
        if (!this.A07) {
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0k(int i) {
        A0P(i, false, false);
    }

    public final void A0l(int i, int i2) {
        A0P(i, true, false);
        this.A01 = i2;
        this.A02 = i2;
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0m(com.facebook.ads.redexgen.core.InterfaceC1513ej interfaceC1513ej) {
        this.A03 = interfaceC1513ej;
    }

    public void A0n(com.facebook.ads.redexgen.core.EnumC1514ek enumC1514ek, java.util.Map<java.lang.String, java.lang.String> params) {
    }

    public final void A0o(com.facebook.ads.redexgen.core.EF ef) {
        ef.A06 = this.A06;
        ef.A07 = this.A07;
        ef.A0A = this.A0A;
        ef.A09 = this.A09;
        ef.A02 = this.A02;
        ef.A01 = this.A01;
    }
}
