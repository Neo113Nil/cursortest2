package com.instagram.common.viewpoint.core;

import android.view.View;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1870Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC3546rY A00;
    public InterfaceC3534rI A01;
    public C3522r5 A02;
    public final InterfaceC3535rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC3534rI A03 = new C1871Ap(this);

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C1870Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC3546rY interfaceC3546rY, InterfaceC3535rJ interfaceC3535rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC3546rY;
        this.A04 = interfaceC3535rJ;
    }

    public static C1870Ao A01() {
        return new C1870Ao(new ViewpointQeConfig(), new C1873Ar(), null);
    }

    private void A05(AbstractC3537rL abstractC3537rL, InterfaceC3542rQ interfaceC3542rQ, InterfaceC1868Al interfaceC1868Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C3522r5.A01(this.A05, abstractC3537rL, interfaceC3542rQ, interfaceC1868Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C3543rU c3543rU) {
        C3522r5 c3522r5 = this.A02;
        if (c3522r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c3543rU != null) {
                c3522r5.A07(dspViewableNode, c3543rU);
            } else {
                c3522r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C3543rU c3543rU, C3539rN c3539rN) {
        C3522r5 c3522r5 = this.A02;
        if (c3522r5 != null && dspViewableNode != null && c3539rN != null) {
            if (this.A05.A00 && c3543rU != null) {
                c3539rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c3539rN.A08 + c3543rU;
                c3522r5.A08(dspViewableNode, c3543rU, c3539rN);
            } else {
                c3522r5.A09(dspViewableNode, c3539rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C3539rN<?, ?> c3539rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c3539rN);
    }

    public final void A0A(AbstractC3537rL abstractC3537rL, View view) {
        if (abstractC3537rL != null && view != null) {
            A05(abstractC3537rL, new C1872Aq(view, this.A00), new C16621u(null), null);
        }
    }
}
