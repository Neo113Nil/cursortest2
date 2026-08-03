package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ZA implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"IOR0l14leYwQNQq2I2rEV1zfIXqFKI0a", "zW7tVYcZ3dM5iQVsFi8VOfvAOil8nrCv", "ieKj8", "GAk2VDgzwLQ7mEx4yT9NQx4ape", "m3zKFeg", "MHRS5EwiRnbElfi8E", "iluOaWOCUNCvaeFHk", "XDQmqUnzQcQqnZe226mcFYKNf4olT5Vx"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.MW A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -57, -71, -58, -73, -64, -67, -73, -65};
    }

    static {
        A01();
    }

    public ZA(com.facebook.ads.redexgen.core.MW mw) {
        this.A00 = mw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0V(false, A00(0, 9, 66));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            java.lang.String[] strArr = A02;
            if (strArr[6].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "H8CDprpa1Cplh5AC0usdDw9yybstLgCh";
        }
    }
}
