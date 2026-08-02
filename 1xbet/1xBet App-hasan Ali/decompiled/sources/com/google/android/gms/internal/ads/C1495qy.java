package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.qy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495qy implements InterfaceC0911dx {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f15187c = AbstractC0952et.v("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f15188d = AbstractC0952et.v("070000004041424344454647");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f15189e = AbstractC0952et.v("a0784d7a4716f3feb4f64e7f4b39bf04");
    public static final C0052p0 f = new C0052p0(5);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f15190a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15191b;

    public C1495qy(byte[] bArr, byte[] bArr2) {
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (f.get() == null) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f15190a = new SecretKeySpec(bArr, "ChaCha20");
        this.f15191b = bArr2;
    }

    public static boolean b(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f15188d);
            byte[] bArr = f15187c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f15189e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0911dx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f15191b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC1451pz.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f.get();
        cipher.init(2, this.f15190a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (length - r8) - 12);
    }
}
