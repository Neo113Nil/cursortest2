package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1859pb {
    public static C1859pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C1870pm A02;

    public C1859pb(ViewpointQeConfig viewpointQeConfig, AbstractC1875ps abstractC1875ps, C1870pm c1870pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c1870pm;
        abstractC1875ps.A03(new A4(c1870pm));
    }

    public static C1859pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC1875ps abstractC1875ps, InterfaceC1880px interfaceC1880px, A6 a6) {
        C1859pb localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C1859pb(viewpointQeConfig, abstractC1875ps, new C1870pm(viewpointQeConfig, interfaceC1880px, C0316Bg.A00, a6, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC1874pr interfaceC1874pr) {
        this.A02.A0E(interfaceC1874pr);
    }

    public final void A02(InterfaceC1872pp interfaceC1872pp) {
        this.A02.A0F(interfaceC1872pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C1881q0 c1881q0) {
        if (this.A00.A00 && c1881q0 != null) {
            this.A01.A06(dspViewableNode, c1881q0);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C1881q0 c1881q0, C1877pu c1877pu) {
        if (this.A00.A00 && c1881q0 != null) {
            this.A01.A07(dspViewableNode, c1881q0, c1877pu);
        } else {
            this.A01.A08(dspViewableNode, c1877pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C1877pu c1877pu) {
        A05(dspViewableNode, null, c1877pu);
    }
}
