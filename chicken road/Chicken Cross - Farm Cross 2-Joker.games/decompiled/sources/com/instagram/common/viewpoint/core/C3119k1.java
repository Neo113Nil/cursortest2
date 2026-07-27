package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3119k1 extends AbstractC2874fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

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

    public C3119k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2874fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        AnonymousClass76 anonymousClass76;
        C3103jl c3103jl;
        AnonymousClass76 anonymousClass762;
        C18087o c18087o;
        C2875fp c2875fp;
        Y2 y23;
        C18087o c18087o2;
        VA va;
        C18087o c18087o3;
        AnonymousClass76 anonymousClass763;
        C18087o c18087o4;
        C18087o c18087o5;
        C2194Ng A2A;
        AnonymousClass76 anonymousClass764;
        C2875fp c2875fp2;
        AnonymousClass76 anonymousClass765;
        C18087o c18087o6;
        y2 = this.A00.A0H;
        if (!y2.A07()) {
            y22 = this.A00.A0H;
            y22.A05();
            anonymousClass76 = this.A00.A04;
            InterfaceC3157kf A0F = anonymousClass76.A0F();
            c3103jl = this.A00.A02;
            A0F.A4Q(c3103jl != null);
            anonymousClass762 = this.A00.A04;
            anonymousClass762.A0F().A3L();
            c18087o = this.A00.A03;
            AbstractC2214Oa.A02(c18087o.A0y(), AbstractC2450Xm.A00(A00(0, 6, 63)));
            C2587b9 c2587b9 = new C2587b9();
            c2875fp = this.A00.A0B;
            C2587b9 A03 = c2587b9.A03(c2875fp);
            y23 = this.A00.A0H;
            C2587b9 A02 = A03.A02(y23);
            c18087o2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c18087o2.A0z()).A05();
            va = this.A00.A05;
            c18087o3 = this.A00.A03;
            va.ABJ(c18087o3.A2E(), A05);
            anonymousClass763 = this.A00.A04;
            if (C2380Up.A1A(anonymousClass763)) {
                anonymousClass765 = this.A00.A04;
                C2426Wl A00 = C2426Wl.A00(anonymousClass765);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c18087o6 = this.A00.A03;
                A00.A0E(adPlacementType, c18087o6.A2E());
            }
            c18087o4 = this.A00.A03;
            if (c18087o4 == null) {
                A2A = null;
            } else {
                c18087o5 = this.A00.A03;
                A2A = c18087o5.A2A();
            }
            anonymousClass764 = this.A00.A04;
            C2194Ng.A07(A2A, anonymousClass764);
            c2875fp2 = this.A00.A0B;
            c2875fp2.A0V();
        }
    }
}
