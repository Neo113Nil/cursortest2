package org.bouncycastle.crypto.fpe;

/* loaded from: classes17.dex */
public class FPEFF3_1Engine extends org.bouncycastle.crypto.fpe.FPEEngine {
    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.forEncryption = z;
        this.fpeParameters = (org.bouncycastle.crypto.params.FPEParameters) cipherParameters;
        this.baseCipher.init(!this.fpeParameters.isUsingInverseFunction(), new org.bouncycastle.crypto.params.KeyParameter(org.bouncycastle.util.Arrays.reverse(this.fpeParameters.getKey().getKey())));
        if (this.fpeParameters.getTweak().length != 7) {
            throw new java.lang.IllegalArgumentException("tweak should be 56 bits");
        }
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public java.lang.String getAlgorithmName() {
        return "FF3-1";
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    protected int encryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        java.lang.System.arraycopy(this.fpeParameters.getRadix() > 256 ? toByteArray(org.bouncycastle.crypto.fpe.SP80038G.Camera2StreamConfigurationMap(this.baseCipher, this.fpeParameters.getRadix(), this.fpeParameters.getTweak(), toShortArray(bArr), i, i2 / 2)) : org.bouncycastle.crypto.fpe.SP80038G.getHighSpeedVideoSizes(this.baseCipher, this.fpeParameters.getRadix(), this.fpeParameters.getTweak(), bArr, i, i2), 0, bArr2, i3, i2);
        return i2;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    protected int decryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        java.lang.System.arraycopy(this.fpeParameters.getRadix() > 256 ? toByteArray(org.bouncycastle.crypto.fpe.SP80038G.getHighSpeedVideoFpsRanges(this.baseCipher, this.fpeParameters.getRadix(), this.fpeParameters.getTweak(), toShortArray(bArr), i, i2 / 2)) : org.bouncycastle.crypto.fpe.SP80038G.getHighSpeedVideoFpsRanges(this.baseCipher, this.fpeParameters.getRadix(), this.fpeParameters.getTweak(), bArr, i, i2), 0, bArr2, i3, i2);
        return i2;
    }

    public FPEFF3_1Engine(org.bouncycastle.crypto.BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            throw new java.lang.IllegalArgumentException("base cipher needs to be 128 bits");
        }
        if (org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.fpe.disable")) {
            throw new java.lang.UnsupportedOperationException("FPE disabled");
        }
    }

    public FPEFF3_1Engine() {
        this(new org.bouncycastle.crypto.engines.AESEngine());
    }
}
