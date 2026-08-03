package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ServiceConnectionC1083Um implements android.content.ServiceConnection {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Vw4807oGxAdaHl5Al", "61OeIm55zagm9eF8TwwypJ2x", "EMmzBhTNP4w9g", "EYH0yzb9nIvkx5HKrwnVnQphst8", "oJpEUQYv6dauwAdzygMcXKep8asdjHHS", "ZEL", "ZTCWoVSxq9DuX", "VaiI"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1084Un A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 13);
            if (A02[7].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[6] = "dt08HEEvYnWJr";
            strArr[2] = "T3OITLjrwLx4m";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 116, -127, -123, 120, 114, 116, 47, 114, 126, 125, 125, 116, 114, -125, 116, 115, -66, -48, -35, -31, -44, -50, -48, -117, -49, -44, -34, -50, -38, -39, -39, -48, -50, -33, -48, -49};
    }

    static {
        A01();
    }

    public ServiceConnectionC1083Um(com.facebook.ads.redexgen.core.C1084Un c1084Un) {
        this.A00 = c1084Un;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.os.Bundle A00;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        android.os.Messenger messenger;
        this.A00.A08(com.facebook.ads.redexgen.core.AbstractC1048Td.A1r, new com.facebook.ads.redexgen.core.C1049Te(A00(0, 17, 2)));
        this.A00.A01 = true;
        this.A00.A00 = new android.os.Messenger(iBinder);
        android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, 1);
        A00 = this.A00.A00();
        obtain.setData(A00);
        try {
            messenger = this.A00.A00;
            messenger.send(obtain);
        } catch (android.os.RemoteException e) {
            this.A00.A07(com.facebook.ads.redexgen.core.AbstractC1048Td.A1q, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
        c1636gi = this.A00.A03;
        c1636gi.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        this.A00.A08(com.facebook.ads.redexgen.core.AbstractC1048Td.A1s, new com.facebook.ads.redexgen.core.C1049Te(A00(17, 20, 94)));
        try {
            c1636gi = this.A00.A03;
            c1636gi.unbindService(this);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        this.A00.A00 = null;
        this.A00.A01 = false;
    }
}
