package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class X448PrivateKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final int KEY_SIZE = 56;
    public static final int SECRET_SIZE = 56;
    private final byte[] getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X448PrivateKeyParameters(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length != 56) {
            throw new java.lang.IllegalArgumentException("'buf' must have length 56");
        }
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public final void generateSecret(org.bouncycastle.crypto.params.X448PublicKeyParameters x448PublicKeyParameters, byte[] bArr, int i) {
        byte[] bArr2 = new byte[56];
        x448PublicKeyParameters.encode(bArr2, 0);
        if (!org.bouncycastle.math.ec.rfc7748.X448.calculateAgreement(this.getHighSpeedVideoFpsRanges, 0, bArr2, 0, bArr, i)) {
            throw new java.lang.IllegalStateException("X448 agreement failed");
        }
    }

    public final org.bouncycastle.crypto.params.X448PublicKeyParameters generatePublicKey() {
        byte[] bArr = new byte[56];
        org.bouncycastle.math.ec.rfc7748.X448.generatePublicKey(this.getHighSpeedVideoFpsRanges, 0, bArr, 0);
        return new org.bouncycastle.crypto.params.X448PublicKeyParameters(bArr, 0);
    }

    public final void encode(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr, i, 56);
    }

    public X448PrivateKeyParameters(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.getHighSpeedVideoFpsRanges = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 56);
    }

    public X448PrivateKeyParameters(java.security.SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.getHighSpeedVideoFpsRanges = bArr;
        org.bouncycastle.math.ec.rfc7748.X448.generatePrivateKey(secureRandom, bArr);
    }

    public X448PrivateKeyParameters(java.io.InputStream inputStream) throws java.io.IOException {
        super(true);
        byte[] bArr = new byte[56];
        this.getHighSpeedVideoFpsRanges = bArr;
        if (56 != org.bouncycastle.util.io.Streams.readFully(inputStream, bArr)) {
            throw new java.io.EOFException("EOF encountered in middle of X448 private key");
        }
    }
}
