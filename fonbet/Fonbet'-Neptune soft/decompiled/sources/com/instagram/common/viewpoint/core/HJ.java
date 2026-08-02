package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class HJ extends AbstractRunnableC0840Vt {
    public static byte[] A02;
    public static String[] A03 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ C01554n A00;
    public final /* synthetic */ C3Q A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{51, 4, Ascii.ETB, Ascii.ETB, Ascii.DC4, 3, Ascii.CAN, Ascii.US, Ascii.SYN, 81, Ascii.CAN, Ascii.US, Ascii.NAK, Ascii.DC4, Ascii.ETB, Ascii.CAN, Ascii.US, Ascii.CAN, 5, Ascii.DC4, Ascii.GS, 8};
    }

    static {
        A01();
    }

    public HJ(C01554n c01554n, C3Q c3q) {
        this.A00 = c01554n;
        this.A01 = c3q;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        E1 e1;
        E1 e12;
        InterfaceC1100cT interfaceC1100cT;
        e1 = this.A00.A0P;
        if (e1.getState() == EnumC1223eU.A02) {
            e12 = this.A00.A0P;
            int currentPositionInMillis = e12.getCurrentPositionInMillis();
            if (A03[2].length() != 8) {
                throw new RuntimeException();
            }
            A03[7] = "iv52OwD8pgB4ao6bV3eWAeQD9PjHFRbz";
            if (currentPositionInMillis == A00()) {
                interfaceC1100cT = this.A00.A0M;
                interfaceC1100cT.AFg(A00(0, 22, 57));
            }
        }
    }
}
