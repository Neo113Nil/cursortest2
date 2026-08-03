package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyr {
    public static java.io.File zza(java.lang.String str, java.lang.String str2, java.io.File file) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        return new java.io.File(zzc(str, file), str2);
    }

    public static boolean zzb(java.io.File file, byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new java.io.FileOutputStream(file);
        } catch (java.io.IOException unused) {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            com.google.android.gms.common.util.IOUtils.closeQuietly(fileOutputStream);
            return true;
        } catch (java.io.IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            com.google.android.gms.common.util.IOUtils.closeQuietly(fileOutputStream2);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            com.google.android.gms.common.util.IOUtils.closeQuietly(fileOutputStream2);
            throw th;
        }
    }

    public static java.io.File zzc(java.lang.String str, java.io.File file) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.File file2 = new java.io.File(file, str);
        zzd(file2, false);
        return file2;
    }

    public static java.io.File zzd(java.io.File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean zze(java.io.File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (int i = 0; i < listFiles.length; i++) {
                java.io.File file2 = listFiles[i];
                z = file2 != null && zze(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }
}
