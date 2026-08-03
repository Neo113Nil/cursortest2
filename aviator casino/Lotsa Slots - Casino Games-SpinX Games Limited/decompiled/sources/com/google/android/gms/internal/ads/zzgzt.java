package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgzt {
    public static void zza(byte[] bArr, java.io.File file) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgzi zzgziVar = new com.google.android.gms.internal.ads.zzgzi();
        file.getClass();
        java.io.FileOutputStream zza = com.google.android.gms.internal.ads.zzgzr.zza(file, com.google.android.gms.internal.ads.zzgww.zzq(new com.google.android.gms.internal.ads.zzgzq[0]), zzgziVar);
        try {
            zza.write(bArr);
            zza.close();
        } catch (java.lang.Throwable th) {
            try {
                zza.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(java.io.File file) throws java.io.IOException {
        file.getClass();
        java.io.File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new java.io.IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(java.io.File file, java.io.File file2) throws java.io.IOException {
        file.getClass();
        file2.getClass();
        com.google.android.gms.internal.ads.zzgtj.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        com.google.android.gms.internal.ads.zzgtj.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        com.google.android.gms.internal.ads.zzgzs zzgzsVar = new com.google.android.gms.internal.ads.zzgzs(file, null);
        com.google.android.gms.internal.ads.zzgzi zzgziVar = new com.google.android.gms.internal.ads.zzgzi();
        com.google.android.gms.internal.ads.zzgww zzq = com.google.android.gms.internal.ads.zzgww.zzq(new com.google.android.gms.internal.ads.zzgzq[0]);
        com.google.android.gms.internal.ads.zzgzp zza = com.google.android.gms.internal.ads.zzgzp.zza();
        try {
            java.io.InputStream zza2 = zzgzsVar.zza();
            zza.zzb(zza2);
            java.io.InputStream inputStream = zza2;
            java.io.FileOutputStream zza3 = com.google.android.gms.internal.ads.zzgzr.zza(file2, zzq, zzgziVar);
            zza.zzb(zza3);
            java.io.FileOutputStream fileOutputStream = zza3;
            int i = com.google.android.gms.internal.ads.zzgzm.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = zza2.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            zza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new java.io.IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new java.io.IOException("Unable to delete ".concat(file.toString()));
        } catch (java.lang.Throwable th) {
            try {
                throw zza.zzc(th);
            } catch (java.lang.Throwable th2) {
                zza.close();
                throw th2;
            }
        }
    }
}
