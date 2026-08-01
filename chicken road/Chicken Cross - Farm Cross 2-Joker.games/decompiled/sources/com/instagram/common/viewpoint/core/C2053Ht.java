package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Ht, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2053Ht extends AbstractRunnableC2417Wc {
    public static byte[] A02;
    public static String[] A03 = {"eWADjtxb1dWvMuQKHnw5jLkRYtYeIVb9", "vJlKnMrqllT8yqHy3c09kMgmhRavVIVM", "Q4u15erxw2VvJfagpGA99x6fik", "", "DcfdvxQ7qaScGwoUH6bgcK", "LZ3ab3PJnMGJQ4QsgAhwpTw2XWco3njm", "Qn1MQsBbREXEZXLMbJl8WtK7V5qupI", "ZrYMyBGTS8dZg7uAD2wVIzoUAJYVhikw"};
    public final /* synthetic */ C5F A00;
    public final /* synthetic */ C4A A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[6].length() == strArr[4].length()) {
                break;
            }
            String[] strArr2 = A03;
            strArr2[3] = "";
            strArr2[2] = "KjbCoXJ8ChyqWCUKbe1FzcklJu";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
            String[] strArr3 = A03;
            if (strArr3[3].length() == strArr3[2].length()) {
                break;
            }
            String[] strArr4 = A03;
            strArr4[3] = "";
            strArr4[2] = "FepnQiYEGf6Y70BjqDmgAXMgjY";
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A02 = new byte[]{95, 104, 123, 123, 120, 111, 116, 115, 122, Base64.padSymbol, 116, 115, 121, 120, 123, 116, 115, 116, 105, 120, 113, 100};
    }

    static {
        A01();
    }

    public C2053Ht(C5F c5f, C4A c4a) {
        this.A00 = c5f;
        this.A01 = c4a;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C1967Ek c1967Ek;
        C1967Ek c1967Ek2;
        InterfaceC2750dm interfaceC2750dm;
        c1967Ek = this.A00.A0b;
        if (c1967Ek.getState() == EnumC2872fm.A02) {
            c1967Ek2 = this.A00.A0b;
            if (c1967Ek2.getCurrentPositionInMillis() == A00()) {
                interfaceC2750dm = this.A00.A0Z;
                String[] strArr = A03;
                if (strArr[5].charAt(23) == strArr[0].charAt(23)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[3] = "";
                strArr2[2] = "farTWgnk5frdrEZBsMmfrvdmtZ";
                interfaceC2750dm.AGQ(A00(0, 22, 60));
            }
        }
    }
}
