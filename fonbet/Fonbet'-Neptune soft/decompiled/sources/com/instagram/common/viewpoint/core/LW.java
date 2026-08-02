package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class LW implements InterfaceC0902Yf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC0900Yd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, Ascii.CR, Ascii.SI, 76, 4, 3, 1, 7, 0, Ascii.CR, Ascii.CR, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, Ascii.DC2, Ascii.CR, 16, Ascii.SYN, Ascii.VT, Ascii.FF, 5, 76, 36, 43, 44, 43, 49, 42, Base64.padSymbol, 35, 38, Base64.padSymbol, 48, 39, 50, 45, 48, 54, 43, 44, 37, Base64.padSymbol, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public LW(AbstractC0900Yd abstractC0900Yd) {
        this.A00 = abstractC0900Yd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0902Yf
    public final void A4v() {
        InterfaceC0884Xn interfaceC0884Xn;
        InterfaceC0884Xn interfaceC0884Xn2;
        interfaceC0884Xn = this.A00.A07;
        if (interfaceC0884Xn == null) {
            return;
        }
        interfaceC0884Xn2 = this.A00.A07;
        interfaceC0884Xn2.A4b(A00(0, 53, 115));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0902Yf
    public final void A4w() {
        InterfaceC0885Xo interfaceC0885Xo;
        InterfaceC0885Xo interfaceC0885Xo2;
        this.A00.A0O();
        interfaceC0885Xo = this.A00.A08;
        if (interfaceC0885Xo != null) {
            interfaceC0885Xo2 = this.A00.A08;
            interfaceC0885Xo2.AF0(true);
        }
        this.A00.A0D();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0902Yf
    public final void A9U() {
        O6 o6;
        O6 o62;
        O6 o63;
        C1153dL c1153dL;
        o6 = this.A00.A03;
        if (o6 == null) {
            A4w();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC0900Yd.A03(this.A00);
        o62 = this.A00.A03;
        if (o62.A02() != null) {
            AbstractC0900Yd abstractC0900Yd = this.A00;
            o63 = this.A00.A03;
            abstractC0900Yd.A0G(o63.A02());
        } else {
            this.A00.A0E();
        }
        c1153dL = this.A00.A05;
        if (U7.A2S(c1153dL)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0902Yf
    public final void AAg() {
        O2 o2;
        O5 o5;
        C1153dL c1153dL;
        O2 o22;
        String str;
        o2 = this.A00.A04;
        if (!TextUtils.isEmpty(o2.A0I())) {
            WN wn = new WN();
            c1153dL = this.A00.A05;
            o22 = this.A00.A04;
            Uri A00 = WQ.A00(o22.A0I());
            str = this.A00.A09;
            WN.A0O(wn, c1153dL, A00, str);
        }
        o5 = this.A00.A02;
        o5.A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0902Yf
    public final void AAh() {
        InterfaceC0885Xo interfaceC0885Xo;
        O2 o2;
        O5 o5;
        C1153dL c1153dL;
        O2 o22;
        String str;
        InterfaceC0885Xo interfaceC0885Xo2;
        this.A00.A0O();
        interfaceC0885Xo = this.A00.A08;
        if (interfaceC0885Xo != null) {
            interfaceC0885Xo2 = this.A00.A08;
            interfaceC0885Xo2.AF0(true);
        }
        o2 = this.A00.A04;
        if (!TextUtils.isEmpty(o2.A0C())) {
            WN wn = new WN();
            c1153dL = this.A00.A05;
            o22 = this.A00.A04;
            Uri A00 = WQ.A00(o22.A0C());
            str = this.A00.A09;
            WN.A0O(wn, c1153dL, A00, str);
        }
        o5 = this.A00.A02;
        o5.A06();
        this.A00.A0D();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0902Yf
    public final void AEC(O4 o4) {
        O4 o42;
        O2 o2;
        O6 A0B;
        O2 o22;
        O2 o23;
        AbstractC0900Yd.A02(this.A00);
        this.A00.A01 = o4;
        o42 = this.A00.A01;
        if (o42 != O4.A04) {
            AbstractC0900Yd abstractC0900Yd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                o22 = abstractC0900Yd.A04;
                A0B = o22.A0B();
            } else {
                o2 = abstractC0900Yd.A04;
                A0B = o2.A0B();
            }
        } else {
            o23 = this.A00.A04;
            A0B = o23.A0A();
        }
        AbstractC0900Yd abstractC0900Yd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC0900Yd2.A0G(A0B);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0902Yf
    public final void AEP(O6 o6) {
        O5 o5;
        AbstractC0900Yd.A02(this.A00);
        o5 = this.A00.A02;
        o5.A07(o6.A01());
        if (!o6.A05().isEmpty()) {
            AbstractC0900Yd abstractC0900Yd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC0900Yd.A0G(o6);
            return;
        }
        this.A00.A0F(o6);
    }
}
