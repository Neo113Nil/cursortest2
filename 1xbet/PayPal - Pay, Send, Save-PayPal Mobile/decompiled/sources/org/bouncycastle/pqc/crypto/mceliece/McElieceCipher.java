package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceCipher implements org.bouncycastle.pqc.crypto.MessageEncryptor {
    public static final java.lang.String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    public int cipherTextSize;
    private org.bouncycastle.pqc.crypto.mceliece.McElieceKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;
    public int maxPlainTextSize;

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = z;
        if (!z) {
            org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = mcEliecePrivateKeyParameters;
            this.getHighSpeedVideoFpsRanges = mcEliecePrivateKeyParameters.getN();
            int k = mcEliecePrivateKeyParameters.getK();
            this.getHighSpeedVideoSizes = k;
            this.maxPlainTextSize = k >> 3;
            this.cipherTextSize = this.getHighSpeedVideoFpsRanges >> 3;
            return;
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters mcEliecePublicKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = mcEliecePublicKeyParameters;
            Camera2StreamConfigurationMap(mcEliecePublicKeyParameters);
            return;
        }
        org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
        this.Camera2StreamConfigurationMap = parametersWithRandom.getRandom();
        org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters mcEliecePublicKeyParameters2 = (org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters) parametersWithRandom.getParameters();
        this.getHighResolutionOutputSizeshNQ4ISI = mcEliecePublicKeyParameters2;
        Camera2StreamConfigurationMap(mcEliecePublicKeyParameters2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector OS2VP = org.bouncycastle.pqc.math.linearalgebra.GF2Vector.OS2VP(this.getHighSpeedVideoFpsRanges, bArr);
        org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.pqc.math.linearalgebra.GF2mField field = mcEliecePrivateKeyParameters.getField();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM goppaPoly = mcEliecePrivateKeyParameters.getGoppaPoly();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix sInv = mcEliecePrivateKeyParameters.getSInv();
        org.bouncycastle.pqc.math.linearalgebra.Permutation p1 = mcEliecePrivateKeyParameters.getP1();
        org.bouncycastle.pqc.math.linearalgebra.Permutation p2 = mcEliecePrivateKeyParameters.getP2();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix h = mcEliecePrivateKeyParameters.getH();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] qInv = mcEliecePrivateKeyParameters.getQInv();
        org.bouncycastle.pqc.math.linearalgebra.Permutation rightMultiply = p1.rightMultiply(p2);
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) OS2VP.multiply(rightMultiply.computeInverse());
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector syndromeDecode = org.bouncycastle.pqc.math.linearalgebra.GoppaCode.syndromeDecode((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) h.rightMultiply(gF2Vector), field, goppaPoly, qInv);
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector2 = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) gF2Vector.add(syndromeDecode)).multiply(p1);
        byte[] encoded = ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) sInv.leftMultiply(gF2Vector2.extractRightVector(this.getHighSpeedVideoSizes))).getEncoded();
        int length = encoded.length - 1;
        while (length >= 0 && encoded[length] == 0) {
            length--;
        }
        if (length < 0 || encoded[length] != 1) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("Bad Padding: invalid ciphertext");
        }
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(encoded, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        byte[] bArr2 = new byte[this.maxPlainTextSize + ((this.getHighSpeedVideoSizes & 7) != 0 ? 1 : 0)];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) ((org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI).getG().leftMultiply(org.bouncycastle.pqc.math.linearalgebra.GF2Vector.OS2VP(this.getHighSpeedVideoSizes, bArr2)).add(new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap))).getEncoded();
    }

    public int getKeySize(org.bouncycastle.pqc.crypto.mceliece.McElieceKeyParameters mcElieceKeyParameters) {
        if (mcElieceKeyParameters instanceof org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters) {
            return ((org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters) mcElieceKeyParameters).getN();
        }
        if (mcElieceKeyParameters instanceof org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters) {
            return ((org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters) mcElieceKeyParameters).getN();
        }
        throw new java.lang.IllegalArgumentException("unsupported type");
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        this.getHighSpeedVideoFpsRanges = mcEliecePublicKeyParameters.getN();
        this.getHighSpeedVideoSizes = mcEliecePublicKeyParameters.getK();
        this.getInputSizeshNQ4ISI = mcEliecePublicKeyParameters.getT();
        this.cipherTextSize = this.getHighSpeedVideoFpsRanges >> 3;
        this.maxPlainTextSize = this.getHighSpeedVideoSizes >> 3;
    }
}
