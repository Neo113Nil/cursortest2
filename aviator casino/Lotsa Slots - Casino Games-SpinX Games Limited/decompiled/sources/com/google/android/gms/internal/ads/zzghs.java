package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzghs {
    public static final java.nio.charset.Charset zza = java.nio.charset.StandardCharsets.UTF_8;
    private static javax.crypto.Cipher zzb = null;
    private static final java.lang.Object zzc = new java.lang.Object();
    private static final java.lang.Object zzd = new java.lang.Object();

    private static final javax.crypto.Cipher zzc() throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException {
        javax.crypto.Cipher cipher;
        synchronized (zzd) {
            if (zzb == null) {
                zzb = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzb;
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, java.lang.String str) throws com.google.android.gms.internal.ads.zzghr {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = com.google.android.gms.internal.ads.zzgea.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 <= 16) {
                throw new com.google.android.gms.internal.ads.zzghr();
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length2);
            allocate.put(zzb2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (zzc) {
                zzc().init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr2));
                doFinal = zzc().doFinal(bArr3);
            }
            return doFinal;
        } catch (java.lang.IllegalArgumentException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            throw new com.google.android.gms.internal.ads.zzghr(e);
        }
    }

    public final java.lang.String zzb(byte[] bArr, java.lang.String str) throws com.google.android.gms.internal.ads.zzghr {
        return new java.lang.String(zza(bArr, str), zza);
    }
}
