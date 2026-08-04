package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zzatm {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static zzata zza(byte[] bArr, String str) {
        Vector vectorZzc = zzc(bArr, 255);
        if (vectorZzc == null || vectorZzc.isEmpty()) {
            return null;
        }
        zzata zzataVarZza = zzatb.zza();
        int size = vectorZzc.size();
        for (int i7 = 0; i7 < size; i7++) {
            zzataVarZza.zza(zzgvy.zzv(zzh((byte[]) vectorZzc.get(i7), str, false), 0, 256));
        }
        byte[] bArrZzf = zzf(bArr);
        zzgvy zzgvyVar = zzgvy.zzb;
        zzataVarZza.zzb(zzgvy.zzv(bArrZzf, 0, bArrZzf.length));
        return zzataVarZza;
    }

    public static String zzb(byte[] bArr, String str) {
        zzata zzataVarZza = zza(bArr, str);
        return zzatf.zza(zzataVarZza == null ? zzh(zzg(4096).zzaV(), str, true) : ((zzatb) zzataVarZza.zzbr()).zzaV(), true);
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

    public static byte[] zzf(byte[] bArr) {
        byte[] bArrDigest;
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
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    public static zzasm zzg(int i7) {
        zzarr zzarrVarZza = zzasm.zza();
        zzarrVarZza.zzB(4096L);
        return (zzasm) zzarrVarZza.zzbr();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z4) {
        byte[] bArrArray;
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
            bArrArray = ByteBuffer.allocate(i8).put(b7).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i8).put(b7).put(bArr).array();
        }
        if (z4) {
            bArrArray = ByteBuffer.allocate(256).put(zzf(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzatn[] zzatnVarArr = new zzaub().zzcG;
        int length3 = zzatnVarArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            zzatnVarArr[i9].zza(bArrArray, bArr3);
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
