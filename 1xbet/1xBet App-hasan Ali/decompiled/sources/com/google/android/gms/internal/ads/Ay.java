package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class Ay implements InterfaceC0911dx {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f7742c = AbstractC0952et.v("7a806c");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f7743d = AbstractC0952et.v("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7744e = AbstractC0952et.v("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] f = AbstractC0952et.v("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f7745g = AbstractC0952et.v("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: h, reason: collision with root package name */
    public static final C0052p0 f7746h = new C0052p0(6);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f7747a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7748b;

    public Ay(byte[] bArr, byte[] bArr2) {
        this.f7748b = bArr2;
        AbstractC1400ot.h(bArr.length);
        this.f7747a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f;
            cipher.init(2, new SecretKeySpec(f7744e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f7743d);
            byte[] bArr2 = f7745g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f7742c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0911dx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f7748b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (!AbstractC1451pz.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        Cipher cipher = (Cipher) f7746h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f7747a, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }
}
