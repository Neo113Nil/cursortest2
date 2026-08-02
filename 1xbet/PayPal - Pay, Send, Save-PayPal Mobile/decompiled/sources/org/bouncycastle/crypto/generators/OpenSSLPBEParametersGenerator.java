package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class OpenSSLPBEParametersGenerator extends org.bouncycastle.crypto.PBEParametersGenerator {
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

    public void init(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(i3 + i4);
        return new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(highSpeedVideoSizes, 0, i3), highSpeedVideoSizes, i3, i4);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoSizes(i2), 0, i2);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    private byte[] getHighSpeedVideoSizes(int i) {
        int digestSize = this.getHighSpeedVideoSizes.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            this.getHighSpeedVideoSizes.update(this.password, 0, this.password.length);
            this.getHighSpeedVideoSizes.update(this.salt, 0, this.salt.length);
            this.getHighSpeedVideoSizes.doFinal(bArr, 0);
            int i3 = i > digestSize ? digestSize : i;
            java.lang.System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            this.getHighSpeedVideoSizes.reset();
            this.getHighSpeedVideoSizes.update(bArr, 0, digestSize);
        }
    }

    public OpenSSLPBEParametersGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoSizes = digest;
    }

    public OpenSSLPBEParametersGenerator() {
        this(org.bouncycastle.crypto.util.DigestFactory.createMD5());
    }
}
