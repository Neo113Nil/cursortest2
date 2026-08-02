package U7;

/* loaded from: classes9.dex */
public final class u extends r {
    @Override // U7.r
    final int[] b(int[] iArr, int i11) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        o.d(iArr2, o.b(this.f27417a, iArr));
        iArr2[12] = i11;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // U7.r
    final int e() {
        return 24;
    }
}
