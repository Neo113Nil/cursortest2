package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1809xy implements InterfaceC0911dx {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16365b;

    /* renamed from: c, reason: collision with root package name */
    public final C1284mB f16366c;

    public C1809xy(byte[] bArr, C1419pB c1419pB, int i) {
        this.f16366c = new C1284mB(bArr);
        this.f16364a = c1419pB.b();
        this.f16365b = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0911dx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f16364a;
        int length2 = bArr3.length;
        int i = this.f16365b;
        if (length < length2 + i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC1451pz.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length3 = bArr3.length;
        int i5 = i + length3;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length3, i5);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length4 = copyOfRange.length;
        if (length4 > 12 || length4 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(copyOfRange, 0, bArr4, 4, length4);
        System.arraycopy(copyOfRange, 0, bArr5, 4, length4);
        byte[] bArr6 = new byte[32];
        C1284mB c1284mB = this.f16366c;
        System.arraycopy(c1284mB.a(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(c1284mB.a(16, bArr5), 0, bArr6, 16, 16);
        if (!AbstractC0952et.s(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        C0052p0 c0052p0 = AbstractC1360ny.f14734a;
        AbstractC1400ot.h(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i6 = i5 + 12;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i5, i6);
        if (copyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i5 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, copyOfRange2, 0, 12);
        Cipher cipher = (Cipher) AbstractC1360ny.f14734a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i6, length - i6);
    }
}
