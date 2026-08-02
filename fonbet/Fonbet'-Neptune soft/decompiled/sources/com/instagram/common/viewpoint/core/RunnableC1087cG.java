package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1087cG implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C01434b A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, 72, 116, 121, 97, 122, 121, 123, 115, 93, 106, 106, 119, 106};
    }

    public RunnableC1087cG(C01434b c01434b) {
        this.A00 = c01434b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1100cT interfaceC1100cT;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1100cT = this.A00.A00.A0Z;
            interfaceC1100cT.AFg(A00(0, 18, 75));
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
