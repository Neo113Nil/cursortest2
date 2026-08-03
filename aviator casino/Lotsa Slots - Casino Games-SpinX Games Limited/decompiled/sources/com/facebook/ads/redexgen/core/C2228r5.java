package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2228r5 {
    public static com.facebook.ads.redexgen.core.C2228r5 A03;
    public static com.facebook.ads.redexgen.core.InterfaceC2251rX A04;
    public static byte[] A05;
    public static java.lang.String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final com.facebook.ads.redexgen.core.ViewpointQeConfig A00;
    public final com.facebook.ads.redexgen.core.ViewpointRegistry A01;
    public final com.facebook.ads.redexgen.core.C2238rF A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i4] = (byte) ((b - i3) - 7);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C2228r5(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.AbstractC2243rL abstractC2243rL, com.facebook.ads.redexgen.core.C2238rF c2238rF, com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2238rF;
        abstractC2243rL.A03(new com.facebook.ads.redexgen.core.C0573Aj(c2238rF));
    }

    public static com.facebook.ads.redexgen.core.ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new java.lang.NullPointerException(A02(0, 6, 61));
    }

    public static com.facebook.ads.redexgen.core.C2228r5 A01(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.AbstractC2243rL abstractC2243rL, com.facebook.ads.redexgen.core.InterfaceC2248rQ interfaceC2248rQ, com.facebook.ads.redexgen.core.InterfaceC0574Al interfaceC0574Al, com.facebook.ads.redexgen.core.ViewpointAutoOcclusion viewpointAutoOcclusion) {
        com.facebook.ads.redexgen.core.C2228r5 c2228r5 = A03;
        if (c2228r5 != null) {
            return c2228r5;
        }
        com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry = new com.facebook.ads.redexgen.core.ViewpointRegistry(viewpointQeConfig);
        com.facebook.ads.redexgen.core.CK ck = com.facebook.ads.redexgen.core.CK.A00;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        A00(100);
        return new com.facebook.ads.redexgen.core.C2228r5(viewpointQeConfig, abstractC2243rL, new com.facebook.ads.redexgen.core.C2238rF(viewpointQeConfig, interfaceC2248rQ, ck, interfaceC0574Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(com.facebook.ads.redexgen.core.InterfaceC2242rK interfaceC2242rK) {
        this.A02.A0H(interfaceC2242rK);
    }

    public final void A05(com.facebook.ads.redexgen.core.InterfaceC2240rI interfaceC2240rI) {
        this.A02.A0I(interfaceC2240rI);
    }

    public final void A06(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C2249rU c2249rU) {
        if (this.A00.A00 && c2249rU != null) {
            this.A01.A06(dspViewableNode, c2249rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C2249rU c2249rU, com.facebook.ads.redexgen.core.C2245rN c2245rN) {
        if (this.A00.A00 && c2249rU != null) {
            this.A01.A07(dspViewableNode, c2249rU, c2245rN);
        } else {
            this.A01.A08(dspViewableNode, c2245rN);
        }
    }

    public final void A09(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C2245rN c2245rN) {
        A08(dspViewableNode, null, c2245rN);
    }
}
