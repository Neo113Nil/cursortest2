package com.instagram.common.viewpoint.core;

import android.graphics.Rect;

/* loaded from: assets/audience_network/classes2.dex */
public final class XM {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C3539rN<C2387Uw, V1> c3539rN) {
        if (c3539rN.A06.A05()) {
            return c3539rN.A07.A07();
        }
        if (!c3539rN.A06.A06()) {
            return true;
        }
        return c3539rN.A07.A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if ((r6.A00.bottom - r6.A00.top) > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r4 = r6.A01.bottom;
        r3 = r6.A00.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (com.instagram.common.viewpoint.core.XM.A02[7].length() == 7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        com.instagram.common.viewpoint.core.XM.A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if ((r4 - r3) <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if ((r6.A00.bottom - r6.A00.top) > 0) goto L22;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A01(C3539rN<C2387Uw, V1> c3539rN, InterfaceC3530rD interfaceC3530rD) {
        boolean z;
        float f = -1.0f;
        try {
            f = interfaceC3530rD.A9X(c3539rN);
        } catch (IllegalStateException unused) {
        }
        if (A02[6].length() == 7) {
            throw new RuntimeException();
        }
        A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
        if (f > 0.0f && A00(c3539rN)) {
            return true;
        }
        if (c3539rN.A06.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c3539rN)) {
            return true;
        }
        interfaceC3530rD.A9W(this.A00);
        if (A02[2].length() != 2) {
            A02[2] = "WH3ZGQ";
            interfaceC3530rD.A8D(c3539rN, this.A01);
        } else {
            interfaceC3530rD.A8D(c3539rN, this.A01);
        }
        return z && A00(c3539rN);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C3539rN<C2387Uw, V1> c3539rN, InterfaceC3530rD interfaceC3530rD) {
        if (c3539rN.A07.A04() && A01(c3539rN, interfaceC3530rD)) {
            c3539rN.A07.A01();
            c3539rN.A06.A02().ABx(c3539rN.A06.A03(), c3539rN.A06.A04());
        }
        if (c3539rN.A07.A05() && C2380Up.A1l(c3539rN.A06.A01())) {
            c3539rN.A07.A02();
            c3539rN.A06.A02().ABL(c3539rN.A06.A03(), c3539rN.A06.A04());
        }
    }
}
