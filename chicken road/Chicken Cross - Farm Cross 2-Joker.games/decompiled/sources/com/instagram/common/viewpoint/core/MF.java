package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements InterfaceC2495Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC2493Zd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, Ascii.CR, Ascii.SI, 76, 4, 3, 1, 7, 0, Ascii.CR, Ascii.CR, 9, 76, 3, 6, 17, 76, 3, 6, Ascii.DLE, 7, Ascii.DC2, Ascii.CR, Ascii.DLE, Ascii.SYN, Ascii.VT, Ascii.FF, 5, 76, 36, 43, 44, 43, 49, 42, Base64.padSymbol, 35, 38, Base64.padSymbol, 48, 39, 50, 45, 48, 54, 43, 44, 37, Base64.padSymbol, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public MF(AbstractC2493Zd abstractC2493Zd) {
        this.A00 = abstractC2493Zd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2495Zf
    public final void A53() {
        InterfaceC2471Yh interfaceC2471Yh;
        InterfaceC2471Yh interfaceC2471Yh2;
        interfaceC2471Yh = this.A00.A09;
        if (interfaceC2471Yh == null) {
            return;
        }
        interfaceC2471Yh2 = this.A00.A09;
        interfaceC2471Yh2.A4j(A00(0, 53, 115));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2495Zf
    public final void A54() {
        InterfaceC2472Yi interfaceC2472Yi;
        InterfaceC2492Zc interfaceC2492Zc;
        InterfaceC2492Zc interfaceC2492Zc2;
        InterfaceC2472Yi interfaceC2472Yi2;
        this.A00.A0P();
        interfaceC2472Yi = this.A00.A0A;
        if (interfaceC2472Yi != null) {
            interfaceC2472Yi2 = this.A00.A0A;
            interfaceC2472Yi2.AFi(true);
        }
        interfaceC2492Zc = this.A00.A05;
        if (interfaceC2492Zc != null) {
            interfaceC2492Zc2 = this.A00.A05;
            interfaceC2492Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2495Zf
    public final void A9c() {
        C2224Ok c2224Ok;
        C2224Ok c2224Ok2;
        C2224Ok c2224Ok3;
        C2930gi c2930gi;
        c2224Ok = this.A00.A04;
        if (c2224Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC2493Zd.A03(this.A00);
        c2224Ok2 = this.A00.A04;
        if (c2224Ok2.A02() != null) {
            AbstractC2493Zd abstractC2493Zd = this.A00;
            c2224Ok3 = this.A00.A04;
            abstractC2493Zd.A0H(c2224Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c2930gi = this.A00.A07;
        if (C2380Up.A2Z(c2930gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2495Zf
    public final void AAp() {
        C2220Og c2220Og;
        C2223Oj c2223Oj;
        C2930gi c2930gi;
        C2220Og c2220Og2;
        String str;
        c2220Og = this.A00.A06;
        if (!TextUtils.isEmpty(c2220Og.A0I())) {
            X6 x6 = new X6();
            c2930gi = this.A00.A07;
            c2220Og2 = this.A00.A06;
            Uri A00 = XB.A00(c2220Og2.A0I());
            str = this.A00.A0B;
            X6.A0O(x6, c2930gi, A00, str);
        }
        c2223Oj = this.A00.A03;
        c2223Oj.A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2495Zf
    public final void AAq() {
        InterfaceC2472Yi interfaceC2472Yi;
        C2220Og c2220Og;
        C2223Oj c2223Oj;
        C2930gi c2930gi;
        C2220Og c2220Og2;
        String str;
        InterfaceC2472Yi interfaceC2472Yi2;
        this.A00.A0P();
        interfaceC2472Yi = this.A00.A0A;
        if (interfaceC2472Yi != null) {
            interfaceC2472Yi2 = this.A00.A0A;
            interfaceC2472Yi2.AFi(true);
        }
        c2220Og = this.A00.A06;
        if (!TextUtils.isEmpty(c2220Og.A0C())) {
            X6 x6 = new X6();
            c2930gi = this.A00.A07;
            c2220Og2 = this.A00.A06;
            Uri A00 = XB.A00(c2220Og2.A0C());
            str = this.A00.A0B;
            X6.A0O(x6, c2930gi, A00, str);
        }
        c2223Oj = this.A00.A03;
        c2223Oj.A06();
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2495Zf
    public final void AEr(EnumC2222Oi enumC2222Oi) {
        EnumC2222Oi enumC2222Oi2;
        C2220Og c2220Og;
        C2224Ok A0B;
        C2220Og c2220Og2;
        C2220Og c2220Og3;
        AbstractC2493Zd.A02(this.A00);
        this.A00.A02 = enumC2222Oi;
        enumC2222Oi2 = this.A00.A02;
        if (enumC2222Oi2 != EnumC2222Oi.A04) {
            AbstractC2493Zd abstractC2493Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c2220Og2 = abstractC2493Zd.A06;
                A0B = c2220Og2.A0B();
            } else {
                c2220Og = abstractC2493Zd.A06;
                A0B = c2220Og.A0B();
            }
        } else {
            c2220Og3 = this.A00.A06;
            A0B = c2220Og3.A0A();
        }
        AbstractC2493Zd abstractC2493Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC2493Zd2.A0H(A0B);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2495Zf
    public final void AF4(C2224Ok c2224Ok) {
        C2223Oj c2223Oj;
        AbstractC2493Zd.A02(this.A00);
        c2223Oj = this.A00.A03;
        c2223Oj.A07(c2224Ok.A01());
        if (!c2224Ok.A05().isEmpty()) {
            AbstractC2493Zd abstractC2493Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC2493Zd.A0H(c2224Ok);
            return;
        }
        this.A00.A0G(c2224Ok);
    }
}
