package com.visa.cbp;

/* loaded from: classes5.dex */
public class setEncryptionMetaData {
    public static void ConfirmReplenishRequest(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
