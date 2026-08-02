package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class Ed448PublicKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    public static final int KEY_SIZE = 57;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ed448PublicKeyParameters(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length != 57) {
            throw new java.lang.IllegalArgumentException("'buf' must have length 57");
        }
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public final void encode(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, 0, bArr, i, 57);
    }

    public Ed448PublicKeyParameters(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 57);
    }

    public Ed448PublicKeyParameters(java.io.InputStream inputStream) throws java.io.IOException {
        super(false);
        byte[] bArr = new byte[57];
        this.getHighSpeedVideoFpsRangesFor = bArr;
        if (57 != org.bouncycastle.util.io.Streams.readFully(inputStream, bArr)) {
            throw new java.io.EOFException("EOF encountered in middle of Ed448 public key");
        }
    }
}
