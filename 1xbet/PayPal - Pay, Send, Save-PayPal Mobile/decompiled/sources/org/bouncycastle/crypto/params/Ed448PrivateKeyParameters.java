package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class Ed448PrivateKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final int KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.Ed448PublicKeyParameters getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ed448PrivateKeyParameters(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length != 57) {
            throw new java.lang.IllegalArgumentException("'buf' must have length 57");
        }
    }

    public final void sign(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[57];
        generatePublicKey().encode(bArr4, 0);
        if (i == 0) {
            org.bouncycastle.math.ec.rfc8032.Ed448.sign(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
        } else {
            if (i != 1) {
                throw new java.lang.IllegalArgumentException("algorithm");
            }
            if (64 != i3) {
                throw new java.lang.IllegalArgumentException("msgLen");
            }
            org.bouncycastle.math.ec.rfc8032.Ed448.signPrehash(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
        }
    }

    public final void sign(int i, org.bouncycastle.crypto.params.Ed448PublicKeyParameters ed448PublicKeyParameters, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        sign(i, bArr, bArr2, i2, i3, bArr3, i4);
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.bouncycastle.crypto.params.Ed448PublicKeyParameters generatePublicKey() {
        org.bouncycastle.crypto.params.Ed448PublicKeyParameters ed448PublicKeyParameters;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                byte[] bArr = new byte[57];
                org.bouncycastle.math.ec.rfc8032.Ed448.generatePublicKey(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, 0);
                this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.params.Ed448PublicKeyParameters(bArr, 0);
            }
            ed448PublicKeyParameters = this.getHighSpeedVideoFpsRanges;
        }
        return ed448PublicKeyParameters;
    }

    public final void encode(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, i, 57);
    }

    public Ed448PrivateKeyParameters(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 57);
    }

    public Ed448PrivateKeyParameters(java.security.SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        org.bouncycastle.math.ec.rfc8032.Ed448.generatePrivateKey(secureRandom, bArr);
    }

    public Ed448PrivateKeyParameters(java.io.InputStream inputStream) throws java.io.IOException {
        super(true);
        byte[] bArr = new byte[57];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        if (57 != org.bouncycastle.util.io.Streams.readFully(inputStream, bArr)) {
            throw new java.io.EOFException("EOF encountered in middle of Ed448 private key");
        }
    }
}
