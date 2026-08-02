package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.ty, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629ty extends AbstractC1674uy {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f15742m;

    public C1629ty(byte[] bArr, int i, int i5) {
        this.f15742m = i5;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f15939l = AbstractC1584sy.d(bArr);
        this.f15938k = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int l() {
        switch (this.f15742m) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int[] n(int[] iArr, int i) {
        switch (this.f15742m) {
            case 0:
                int length = iArr.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f15939l;
                int[] iArr4 = AbstractC1584sy.f15616a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, 3);
                return iArr2;
            default:
                int length2 = iArr.length;
                if (length2 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length2 * 32)));
                }
                int[] iArr5 = new int[16];
                int[] c5 = AbstractC1584sy.c((int[]) this.f15939l, iArr);
                int[] iArr6 = AbstractC1584sy.f15616a;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(c5, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }
}
