package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzazo {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static java.security.MessageDigest zzd;
    private static final java.lang.Object zze = new java.lang.Object();
    private static final java.lang.Object zzf = new java.lang.Object();
    static final java.util.concurrent.CountDownLatch zzb = new java.util.concurrent.CountDownLatch(1);

    static void zza() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new java.lang.Thread(new com.google.android.gms.internal.ads.zzazn(null)).start();
            }
        }
    }

    static java.lang.String zzb(byte[] bArr, java.lang.String str) throws java.security.GeneralSecurityException, java.io.UnsupportedEncodingException {
        com.google.android.gms.internal.ads.zzaze zzc2 = zzc(bArr, str);
        return com.google.android.gms.internal.ads.zzazi.zza(zzc2 == null ? zzh(zzg(4096).zzaN(), str, true) : ((com.google.android.gms.internal.ads.zzazf) zzc2.zzbu()).zzaN(), true);
    }

    static com.google.android.gms.internal.ads.zzaze zzc(byte[] bArr, java.lang.String str) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        java.util.Vector zzd2 = zzd(bArr, 255);
        if (zzd2 == null || zzd2.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzaze zza2 = com.google.android.gms.internal.ads.zzazf.zza();
        int size = zzd2.size();
        for (int i = 0; i < size; i++) {
            zza2.zza(com.google.android.gms.internal.ads.zzida.zzt(zzh((byte[]) zzd2.get(i), str, false), 0, 256));
        }
        byte[] zze2 = zze(bArr);
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zza2.zzb(com.google.android.gms.internal.ads.zzida.zzt(zze2, 0, zze2.length));
        return zza2;
    }

    static java.util.Vector zzd(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        java.util.Vector vector = new java.util.Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(java.util.Arrays.copyOfRange(bArr, i4, length2));
            } catch (java.lang.IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzazo.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] zze(byte[] bArr) throws java.security.NoSuchAlgorithmException {
        byte[] digest;
        java.security.MessageDigest messageDigest;
        synchronized (zze) {
            zza();
            java.security.MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, java.util.concurrent.TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (java.lang.InterruptedException unused) {
            }
            throw new java.security.NoSuchAlgorithmException("Cannot compute hash");
        }
        return digest;
        throw new java.security.NoSuchAlgorithmException("Cannot compute hash");
    }

    static com.google.android.gms.internal.ads.zzaym zzg(int i) {
        com.google.android.gms.internal.ads.zzaxm zzj = com.google.android.gms.internal.ads.zzaym.zzj();
        zzj.zzl(android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (com.google.android.gms.internal.ads.zzaym) zzj.zzbu();
    }

    private static byte[] zzh(byte[] bArr, java.lang.String str, boolean z) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        byte[] array;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzg(4096).zzaN();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new java.security.SecureRandom().nextBytes(bArr2);
            array = java.nio.ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2).array();
        } else {
            array = java.nio.ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            array = java.nio.ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        com.google.android.gms.internal.ads.zzazp[] zzazpVarArr = new com.google.android.gms.internal.ads.zzbac().zzcK;
        int length3 = zzazpVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzazpVarArr[i3].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new com.google.android.gms.internal.ads.zzazg(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
