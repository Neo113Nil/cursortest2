package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Se, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ServiceConnectionC1023Se implements android.content.ServiceConnection {
    public static byte[] A02;
    public final java.util.concurrent.BlockingQueue<android.os.IBinder> A00;
    public final java.util.concurrent.atomic.AtomicBoolean A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, -53, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 36, -53, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, 32, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI};
    }

    public ServiceConnectionC1023Se() {
        this.A01 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A00 = new java.util.concurrent.LinkedBlockingDeque();
    }

    public final android.os.IBinder A02() throws java.lang.InterruptedException {
        if (!this.A01.compareAndSet(true, true)) {
            return this.A00.take();
        }
        throw new java.lang.IllegalStateException(A00(0, 23, 56));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.A00.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
