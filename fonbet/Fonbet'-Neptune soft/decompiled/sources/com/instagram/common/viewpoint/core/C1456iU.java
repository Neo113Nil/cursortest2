package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.iU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1456iU extends AbstractC1225eW {
    public static byte[] A01;
    public final /* synthetic */ C7L A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C1456iU(C7L c7l) {
        this.A00 = c7l;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225eW
    public final void A03() {
        XH xh;
        XH xh2;
        C6M c6m;
        C1440iE c1440iE;
        C6M c6m2;
        AnonymousClass78 anonymousClass78;
        C1226eX c1226eX;
        XH xh3;
        AnonymousClass78 anonymousClass782;
        US us;
        AnonymousClass78 anonymousClass783;
        C6M c6m3;
        AnonymousClass78 anonymousClass784;
        AnonymousClass78 anonymousClass785;
        N3 A21;
        C6M c6m4;
        C1226eX c1226eX2;
        C6M c6m5;
        AnonymousClass78 anonymousClass786;
        xh = this.A00.A07;
        if (!xh.A07()) {
            xh2 = this.A00.A07;
            xh2.A05();
            c6m = this.A00.A04;
            InterfaceC1494j9 A0F = c6m.A0F();
            c1440iE = this.A00.A02;
            A0F.A4I(c1440iE != null);
            c6m2 = this.A00.A04;
            c6m2.A0F().A3D();
            anonymousClass78 = this.A00.A03;
            AbstractC0640Nw.A02(anonymousClass78.A0t(), X0.A00(A00(0, 6, 63)));
            C0938Zp c0938Zp = new C0938Zp();
            c1226eX = this.A00.A0C;
            C0938Zp A03 = c0938Zp.A03(c1226eX);
            xh3 = this.A00.A07;
            C0938Zp A02 = A03.A02(xh3);
            anonymousClass782 = this.A00.A03;
            Map<String, String> A05 = A02.A04(anonymousClass782.A0u()).A05();
            us = this.A00.A05;
            anonymousClass783 = this.A00.A03;
            us.AB5(anonymousClass783.A25(), A05);
            c6m3 = this.A00.A04;
            if (U7.A19(c6m3)) {
                c6m5 = this.A00.A04;
                W2 A00 = W2.A00(c6m5);
                String adPlacementType = AdPlacementType.BANNER.toString();
                anonymousClass786 = this.A00.A03;
                A00.A0E(adPlacementType, anonymousClass786.A25());
            }
            anonymousClass784 = this.A00.A03;
            if (anonymousClass784 == null) {
                A21 = null;
            } else {
                anonymousClass785 = this.A00.A03;
                A21 = anonymousClass785.A21();
            }
            c6m4 = this.A00.A04;
            N3.A07(A21, c6m4);
            c1226eX2 = this.A00.A0C;
            c1226eX2.A0V();
        }
    }
}
