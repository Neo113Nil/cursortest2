package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.hB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1061hB implements InterfaceC0911dx {
    public static final C0052p0 f = new C0052p0(9);

    /* renamed from: g, reason: collision with root package name */
    public static final C0052p0 f13720g = new C0052p0(10);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13721a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13722b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13723c;

    /* renamed from: d, reason: collision with root package name */
    public final SecretKeySpec f13724d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13725e;

    public C1061hB(int i, byte[] bArr, byte[] bArr2) {
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f13725e = i;
        AbstractC1400ot.h(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f13724d = secretKeySpec;
        Cipher cipher = (Cipher) f.get();
        cipher.init(1, secretKeySpec);
        byte[] c5 = c(cipher.doFinal(new byte[16]));
        this.f13721a = c5;
        this.f13722b = c(c5);
        this.f13723c = bArr2;
    }

    public static void b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b3 = bArr[i];
            int i5 = i + 1;
            bArr2[i] = (byte) (((b3 + b3) ^ ((bArr[i5] & 255) >>> 7)) & 255);
            i = i5;
        }
        byte b5 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b5 + b5));
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0911dx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f13723c;
        int length2 = length - bArr3.length;
        int i = this.f13725e;
        int i5 = (length2 - i) - 16;
        if (i5 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC1451pz.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f.get();
        SecretKeySpec secretKeySpec = this.f13724d;
        cipher.init(1, secretKeySpec);
        byte[] d5 = d(cipher, 0, bArr, bArr3.length, this.f13725e);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d6 = d(cipher, 1, bArr4, 0, bArr4.length);
        byte[] d7 = d(cipher, 2, bArr, bArr3.length + i, i5);
        int i6 = length - 16;
        byte b3 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            b3 = (byte) (b3 | (((bArr[i6 + i7] ^ d6[i7]) ^ d5[i7]) ^ d7[i7]));
        }
        if (b3 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f13720g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(d5));
        return cipher2.doFinal(bArr, bArr3.length + i, i5);
    }

    public final byte[] d(Cipher cipher, int i, byte[] bArr, int i5, int i6) {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f13721a;
        if (i6 == 0) {
            b(bArr2, bArr3);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr4 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr4);
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr4;
        int i7 = 0;
        while (i6 - i7 > 16) {
            for (int i8 = 0; i8 < 16; i8++) {
                bArr6[i8] = (byte) (bArr[(i5 + i7) + i8] ^ bArr6[i8]);
            }
            cipher.doFinal(bArr6, 0, 16, bArr5);
            i7 += 16;
            byte[] bArr7 = bArr5;
            bArr5 = bArr6;
            bArr6 = bArr7;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7 + i5, i5 + i6);
        if (copyOfRange.length == 16) {
            b(copyOfRange, bArr3);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f13722b, 16);
            int i9 = 0;
            while (true) {
                length = copyOfRange.length;
                if (i9 >= length) {
                    break;
                }
                copyOf[i9] = (byte) (copyOf[i9] ^ copyOfRange[i9]);
                i9++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            copyOfRange = copyOf;
        }
        b(bArr6, copyOfRange);
        cipher.doFinal(bArr6, 0, 16, bArr5);
        return bArr5;
    }
}
