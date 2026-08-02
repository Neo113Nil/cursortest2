package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import m3.c;

/* loaded from: classes.dex */
public final class zzfnq {
    public static File zza(File file, boolean z4) {
        if (z4 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zzc(str, file), str2);
    }

    public static File zzc(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zza(file2, false);
        return file2;
    }

    public static boolean zzd(File file) {
        boolean z4;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z4 = true;
            for (int i7 = 0; i7 < listFiles.length; i7++) {
                File file2 = listFiles[i7];
                z4 = file2 != null && zzd(file2) && z4;
            }
        } else {
            z4 = true;
        }
        return file.delete() && z4;
    }

    public static boolean zze(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                c.d(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                c.d(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                c.d(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
