package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzatm {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static zzata zza(byte[] bArr, String str) {
        Vector zzc2 = zzc(bArr, 255);
        if (zzc2 == null || zzc2.isEmpty()) {
            return null;
        }
        zzata zza2 = zzatb.zza();
        int size = zzc2.size();
        for (int i7 = 0; i7 < size; i7++) {
            zza2.zza(zzgvy.zzv(zzh((byte[]) zzc2.get(i7), str, false), 0, 256));
        }
        byte[] zzf2 = zzf(bArr);
        zzgvy zzgvyVar = zzgvy.zzb;
        zza2.zzb(zzgvy.zzv(zzf2, 0, zzf2.length));
        return zza2;
    }

    public static String zzb(byte[] bArr, String str) {
        zzata zza2 = zza(bArr, str);
        return zzatf.zza(zza2 == null ? zzh(zzg(4096).zzaV(), str, true) : ((zzatb) zza2.zzbr()).zzaV(), true);
    }

    public static Vector zzc(byte[] bArr, int i7) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i8 = length + 254;
        Vector vector = new Vector();
        for (int i9 = 0; i9 < i8 / 255; i9++) {
            int i10 = i9 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i10 > 255) {
                    length2 = i10 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i10, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zze() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzatk(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzatm.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] zzf(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zze();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                throw new NoSuchAlgorithmException("Cannot compute hash");
            } finally {
            }
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static zzasm zzg(int i7) {
        zzarr zza2 = zzasm.zza();
        zza2.zzB(4096L);
        return (zzasm) zza2.zzbr();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z4) {
        byte[] array;
        int length = bArr.length;
        int i7 = true != z4 ? 255 : 239;
        if (length > i7) {
            bArr = zzg(4096).zzaV();
        }
        int i8 = i7 + 1;
        int length2 = bArr.length;
        byte b7 = (byte) length2;
        if (length2 < i7) {
            byte[] bArr2 = new byte[i7 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i8).put(b7).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i8).put(b7).put(bArr).array();
        }
        if (z4) {
            array = ByteBuffer.allocate(256).put(zzf(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzatn[] zzatnVarArr = new zzaub().zzcG;
        int length3 = zzatnVarArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            zzatnVarArr[i9].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzatd(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
