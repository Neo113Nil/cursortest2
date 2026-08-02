package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class X25519PrivateKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    public static final int SECRET_SIZE = 32;
    private final byte[] getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X25519PrivateKeyParameters(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("'buf' must have length 32");
        }
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public final void generateSecret(org.bouncycastle.crypto.params.X25519PublicKeyParameters x25519PublicKeyParameters, byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        x25519PublicKeyParameters.encode(bArr2, 0);
        if (!org.bouncycastle.math.ec.rfc7748.X25519.calculateAgreement(this.getHighSpeedVideoFpsRanges, 0, bArr2, 0, bArr, i)) {
            throw new java.lang.IllegalStateException("X25519 agreement failed");
        }
    }

    public final org.bouncycastle.crypto.params.X25519PublicKeyParameters generatePublicKey() {
        byte[] bArr = new byte[32];
        org.bouncycastle.math.ec.rfc7748.X25519.generatePublicKey(this.getHighSpeedVideoFpsRanges, 0, bArr, 0);
        return new org.bouncycastle.crypto.params.X25519PublicKeyParameters(bArr, 0);
    }

    public final void encode(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr, i, 32);
    }

    public X25519PrivateKeyParameters(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.getHighSpeedVideoFpsRanges = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    public X25519PrivateKeyParameters(java.security.SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.getHighSpeedVideoFpsRanges = bArr;
        org.bouncycastle.math.ec.rfc7748.X25519.generatePrivateKey(secureRandom, bArr);
    }

    public X25519PrivateKeyParameters(java.io.InputStream inputStream) throws java.io.IOException {
        super(true);
        byte[] bArr = new byte[32];
        this.getHighSpeedVideoFpsRanges = bArr;
        if (32 != org.bouncycastle.util.io.Streams.readFully(inputStream, bArr)) {
            throw new java.io.EOFException("EOF encountered in middle of X25519 private key");
        }
    }
}
