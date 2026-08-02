package com.visa.cbp;

/* loaded from: classes5.dex */
public abstract class setContactEmail {
    public static int ReplenishAckRequest(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << com.google.common.base.Ascii.CAN) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static void ConfirmReplenishRequest(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }
}
