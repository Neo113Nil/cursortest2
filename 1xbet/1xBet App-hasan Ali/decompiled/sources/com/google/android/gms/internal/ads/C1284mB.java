package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.mB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284mB implements Iz {

    /* renamed from: d, reason: collision with root package name */
    public static final C0052p0 f14480d = new C0052p0(11);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f14481a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14482b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14483c;

    public C1284mB(byte[] bArr) {
        AbstractC1400ot.h(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f14481a = secretKeySpec;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f14480d.get();
        cipher.init(1, secretKeySpec);
        byte[] w5 = AbstractC0952et.w(cipher.doFinal(new byte[16]));
        this.f14482b = w5;
        this.f14483c = AbstractC0952et.w(w5);
    }

    @Override // com.google.android.gms.internal.ads.Iz
    public final byte[] a(int i, byte[] bArr) {
        byte[] N5;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = this.f14481a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f14480d.get();
        cipher.init(1, secretKeySpec);
        int length = bArr.length;
        int i5 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i6 = i5 - 1;
        int i7 = i6 * 16;
        if (i5 * 16 == length) {
            N5 = AbstractC1400ot.N(i7, bArr, this.f14482b);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            N5 = AbstractC1400ot.N(0, copyOf, this.f14483c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = i8 * 16;
            for (int i10 = 0; i10 < 16; i10++) {
                bArr3[i10] = (byte) (bArr2[i10] ^ bArr[i10 + i9]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr2[i11] ^ N5[i11]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
