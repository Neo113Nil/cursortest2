package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class PKCS5S1ParametersGenerator extends org.bouncycastle.crypto.PBEParametersGenerator {
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        if (i5 <= this.getHighSpeedVideoFpsRanges.getDigestSize()) {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes();
            return new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(highSpeedVideoSizes, 0, i3), highSpeedVideoSizes, i3, i4);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't generate a derived key ");
        sb.append(i5);
        sb.append(" bytes long.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        if (i2 <= this.getHighSpeedVideoFpsRanges.getDigestSize()) {
            return new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoSizes(), 0, i2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't generate a derived key ");
        sb.append(i2);
        sb.append(" bytes long.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    private byte[] getHighSpeedVideoSizes() {
        int digestSize = this.getHighSpeedVideoFpsRanges.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.getHighSpeedVideoFpsRanges.update(this.password, 0, this.password.length);
        this.getHighSpeedVideoFpsRanges.update(this.salt, 0, this.salt.length);
        this.getHighSpeedVideoFpsRanges.doFinal(bArr, 0);
        for (int i = 1; i < this.iterationCount; i++) {
            this.getHighSpeedVideoFpsRanges.update(bArr, 0, digestSize);
            this.getHighSpeedVideoFpsRanges.doFinal(bArr, 0);
        }
        return bArr;
    }

    public PKCS5S1ParametersGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRanges = digest;
    }
}
