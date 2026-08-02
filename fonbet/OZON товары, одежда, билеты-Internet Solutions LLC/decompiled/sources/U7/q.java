package U7;

/* loaded from: classes9.dex */
public final class q extends r {
    @Override // U7.r
    public final int[] b(int[] iArr, int i11) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        o.d(iArr2, this.f27417a);
        iArr2[12] = i11;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // U7.r
    public final int e() {
        return 12;
    }
}
