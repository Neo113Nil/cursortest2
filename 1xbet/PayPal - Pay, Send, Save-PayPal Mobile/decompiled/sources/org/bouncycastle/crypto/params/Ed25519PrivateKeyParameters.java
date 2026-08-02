package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class Ed25519PrivateKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private org.bouncycastle.crypto.params.Ed25519PublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ed25519PrivateKeyParameters(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("'buf' must have length 32");
        }
    }

    public final void sign(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[32];
        generatePublicKey().encode(bArr4, 0);
        if (i == 0) {
            if (bArr != null) {
                throw new java.lang.IllegalArgumentException("ctx");
            }
            org.bouncycastle.math.ec.rfc8032.Ed25519.sign(this.getHighSpeedVideoFpsRanges, 0, bArr4, 0, bArr2, i2, i3, bArr3, i4);
        } else if (i == 1) {
            org.bouncycastle.math.ec.rfc8032.Ed25519.sign(this.getHighSpeedVideoFpsRanges, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalArgumentException("algorithm");
            }
            if (64 != i3) {
                throw new java.lang.IllegalArgumentException("msgLen");
            }
            org.bouncycastle.math.ec.rfc8032.Ed25519.signPrehash(this.getHighSpeedVideoFpsRanges, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
        }
    }

    public final void sign(int i, org.bouncycastle.crypto.params.Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        sign(i, bArr, bArr2, i2, i3, bArr3, i4);
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public final org.bouncycastle.crypto.params.Ed25519PublicKeyParameters generatePublicKey() {
        org.bouncycastle.crypto.params.Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                byte[] bArr = new byte[32];
                org.bouncycastle.math.ec.rfc8032.Ed25519.generatePublicKey(this.getHighSpeedVideoFpsRanges, 0, bArr, 0);
                this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.Ed25519PublicKeyParameters(bArr, 0);
            }
            ed25519PublicKeyParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return ed25519PublicKeyParameters;
    }

    public final void encode(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr, i, 32);
    }

    public Ed25519PrivateKeyParameters(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.getHighSpeedVideoFpsRanges = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    public Ed25519PrivateKeyParameters(java.security.SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.getHighSpeedVideoFpsRanges = bArr;
        org.bouncycastle.math.ec.rfc8032.Ed25519.generatePrivateKey(secureRandom, bArr);
    }

    public Ed25519PrivateKeyParameters(java.io.InputStream inputStream) throws java.io.IOException {
        super(true);
        byte[] bArr = new byte[32];
        this.getHighSpeedVideoFpsRanges = bArr;
        if (32 != org.bouncycastle.util.io.Streams.readFully(inputStream, bArr)) {
            throw new java.io.EOFException("EOF encountered in middle of Ed25519 private key");
        }
    }
}
