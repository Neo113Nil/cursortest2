package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzgij {
    private static final ThreadLocal zza = new zzgii();

    public static AlgorithmParameterSpec zza(byte[] bArr, int i7, int i8) {
        int i9 = zzgni.zza;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        return new GCMParameterSpec(128, bArr, i7, 12);
    }

    public static Cipher zzb() {
        return (Cipher) zza.get();
    }

    public static SecretKey zzc(byte[] bArr) throws InvalidAlgorithmParameterException {
        zzgvb.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
