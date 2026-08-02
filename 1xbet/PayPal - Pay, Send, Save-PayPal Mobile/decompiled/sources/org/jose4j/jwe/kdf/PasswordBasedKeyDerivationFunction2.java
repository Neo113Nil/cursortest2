package org.jose4j.jwe.kdf;

/* loaded from: classes18.dex */
public class PasswordBasedKeyDerivationFunction2 {
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public PasswordBasedKeyDerivationFunction2(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public byte[] derive(byte[] bArr, byte[] bArr2, int i, int i2) throws org.jose4j.lang.JoseException {
        return derive(bArr, bArr2, i, i2, null);
    }

    public byte[] derive(byte[] bArr, byte[] bArr2, int i, int i2, java.lang.String str) throws org.jose4j.lang.JoseException {
        int i3;
        javax.crypto.Mac initializedMac = org.jose4j.mac.MacUtil.getInitializedMac(this.getHighSpeedVideoFpsRangesFor, new org.jose4j.keys.HmacKey(bArr), str);
        int macLength = initializedMac.getMacLength();
        if (i2 > 4294967295L) {
            throw new org.jose4j.lang.UncheckedJoseException("derived key too long ".concat(java.lang.String.valueOf(i2)));
        }
        int ceil = (int) java.lang.Math.ceil(i2 / macLength);
        int i4 = ceil - 1;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i5 = 0;
        while (i5 < ceil) {
            int i6 = i5 + 1;
            byte[] bArr3 = null;
            int i7 = 1;
            byte[] bArr4 = null;
            int i8 = 1;
            while (i8 <= i) {
                if (i8 == i7) {
                    bArr3 = initializedMac.doFinal(org.jose4j.lang.ByteUtil.concat(bArr2, org.jose4j.lang.ByteUtil.getBytes(i6)));
                    bArr4 = bArr3;
                } else {
                    bArr4 = initializedMac.doFinal(bArr4);
                    for (int i9 = 0; i9 < bArr4.length; i9++) {
                        bArr3[i9] = (byte) (bArr4[i9] ^ bArr3[i9]);
                    }
                }
                i8++;
                i7 = 1;
            }
            if (i5 == i4) {
                i3 = 0;
                bArr3 = org.jose4j.lang.ByteUtil.subArray(bArr3, 0, i2 - (macLength * i4));
            } else {
                i3 = 0;
            }
            byteArrayOutputStream.write(bArr3, i3, bArr3.length);
            i5 = i6;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
