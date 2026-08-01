package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3522r5 {
    public static C3522r5 A03;
    public static InterfaceC3545rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C3532rF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i4] = (byte) ((b - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C3522r5(ViewpointQeConfig viewpointQeConfig, AbstractC3537rL abstractC3537rL, C3532rF c3532rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c3532rF;
        abstractC3537rL.A03(new C1867Aj(c3532rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C3522r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC3537rL abstractC3537rL, InterfaceC3542rQ interfaceC3542rQ, InterfaceC1868Al interfaceC1868Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C3522r5 c3522r5 = A03;
        if (c3522r5 != null) {
            return c3522r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C3522r5(viewpointQeConfig, abstractC3537rL, new C3532rF(viewpointQeConfig, interfaceC3542rQ, ck, interfaceC1868Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC3536rK interfaceC3536rK) {
        this.A02.A0H(interfaceC3536rK);
    }

    public final void A05(InterfaceC3534rI interfaceC3534rI) {
        this.A02.A0I(interfaceC3534rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C3543rU c3543rU) {
        if (this.A00.A00 && c3543rU != null) {
            this.A01.A06(dspViewableNode, c3543rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C3543rU c3543rU, C3539rN c3539rN) {
        if (this.A00.A00 && c3543rU != null) {
            this.A01.A07(dspViewableNode, c3543rU, c3539rN);
        } else {
            this.A01.A08(dspViewableNode, c3539rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C3539rN c3539rN) {
        A08(dspViewableNode, null, c3539rN);
    }
}
