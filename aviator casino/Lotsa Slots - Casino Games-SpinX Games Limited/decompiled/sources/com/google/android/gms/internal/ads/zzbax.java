package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbax {
    private static javax.crypto.Cipher zza;
    private static final java.lang.Object zzb = new java.lang.Object();
    private static final java.lang.Object zzc = new java.lang.Object();

    public zzbax(java.security.SecureRandom secureRandom) {
    }

    private static final javax.crypto.Cipher zzc() throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException {
        javax.crypto.Cipher cipher;
        synchronized (zzc) {
            if (zza == null) {
                zza = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zza;
        }
        return cipher;
    }

    public final java.lang.String zza(byte[] bArr, byte[] bArr2) throws com.google.android.gms.internal.ads.zzbaw {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (java.security.SecureRandom) null);
                doFinal = zzc().doFinal(bArr2);
                iv = zzc().getIV();
            }
            int length2 = doFinal.length + iv.length;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return com.google.android.gms.internal.ads.zzazi.zza(bArr3, false);
        } catch (java.security.InvalidKeyException e) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e2);
        } catch (javax.crypto.BadPaddingException e3) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e3);
        } catch (javax.crypto.IllegalBlockSizeException e4) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e4);
        } catch (javax.crypto.NoSuchPaddingException e5) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e5);
        }
    }

    public final byte[] zzb(byte[] bArr, java.lang.String str) throws com.google.android.gms.internal.ads.zzbaw {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = com.google.android.gms.internal.ads.zzazi.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 <= 16) {
                throw new com.google.android.gms.internal.ads.zzbaw(this);
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length2);
            allocate.put(zzb2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr2));
                doFinal = zzc().doFinal(bArr3);
            }
            return doFinal;
        } catch (java.lang.IllegalArgumentException e) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e);
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e2);
        } catch (java.security.InvalidKeyException e3) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e3);
        } catch (java.security.NoSuchAlgorithmException e4) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e4);
        } catch (javax.crypto.BadPaddingException e5) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e5);
        } catch (javax.crypto.IllegalBlockSizeException e6) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e6);
        } catch (javax.crypto.NoSuchPaddingException e7) {
            throw new com.google.android.gms.internal.ads.zzbaw(this, e7);
        }
    }
}
