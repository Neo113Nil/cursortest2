package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class X448PublicKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final int KEY_SIZE = 56;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X448PublicKeyParameters(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length != 56) {
            throw new java.lang.IllegalArgumentException("'buf' must have length 56");
        }
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final void encode(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, i, 56);
    }

    public X448PublicKeyParameters(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 56);
    }

    public X448PublicKeyParameters(java.io.InputStream inputStream) throws java.io.IOException {
        super(false);
        byte[] bArr = new byte[56];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        if (56 != org.bouncycastle.util.io.Streams.readFully(inputStream, bArr)) {
            throw new java.io.EOFException("EOF encountered in middle of X448 public key");
        }
    }
}
