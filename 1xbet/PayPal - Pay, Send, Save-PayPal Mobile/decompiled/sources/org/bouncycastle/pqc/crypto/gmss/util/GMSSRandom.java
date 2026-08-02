package org.bouncycastle.pqc.crypto.gmss.util;

/* loaded from: classes17.dex */
public class GMSSRandom {
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;

    public byte[] nextSeed(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr3, 0);
        byte b = 0;
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] & 255) + (bArr3[i] & 255) + b;
            bArr[i] = (byte) i2;
            b = (byte) (i2 >> 8);
        }
        byte b2 = 1;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i4 = (bArr[i3] & 255) + b2;
            bArr[i3] = (byte) i4;
            b2 = (byte) (i4 >> 8);
        }
        return bArr3;
    }

    public GMSSRandom(org.bouncycastle.crypto.Digest digest) {
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
    }
}
