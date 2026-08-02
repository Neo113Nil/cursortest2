package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
public final class zze {
    private final long zza;
    private final android.content.Context zzb;
    private java.io.File zzc;

    public zze(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        this.zzb = context;
        this.zza = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void zzl(java.io.File file) throws java.io.IOException {
        java.io.File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                zzl(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException(java.lang.String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static void zzm(java.io.File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean zzp(java.io.File file) {
        return !file.canWrite();
    }

    private static java.io.File zzq(java.io.File file, java.lang.String str) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new java.lang.IllegalArgumentException("split ID cannot be placed in target directory");
    }

    private final java.io.File zzr() throws java.io.IOException {
        java.io.File file = new java.io.File(zzw(), "native-libraries");
        zzu(file);
        return file;
    }

    private final java.io.File zzs(java.lang.String str) throws java.io.IOException {
        java.io.File zzq = zzq(zzr(), str);
        zzu(zzq);
        return zzq;
    }

    private final java.io.File zzt() throws java.io.IOException {
        java.io.File file = new java.io.File(zzw(), "verified-splits");
        zzu(file);
        return file;
    }

    private static java.io.File zzu(java.io.File file) throws java.io.IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new java.io.IOException("Unable to create directory: ".concat(java.lang.String.valueOf(file.getAbsolutePath())));
            }
        } else if (!file.isDirectory()) {
            throw new java.lang.IllegalArgumentException("File input must be directory when it exists.");
        }
        return file;
    }

    private final java.io.File zzv() throws java.io.IOException {
        if (this.zzc == null) {
            android.content.Context context = this.zzb;
            if (context == null) {
                throw new java.lang.IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.zzc = context.getFilesDir();
        }
        java.io.File file = new java.io.File(this.zzc, "splitcompat");
        zzu(file);
        return file;
    }

    private final java.io.File zzw() throws java.io.IOException {
        java.io.File file = new java.io.File(zzv(), java.lang.Long.toString(this.zza));
        zzu(file);
        return file;
    }

    public final java.io.File zza(java.lang.String str) throws java.io.IOException {
        java.io.File file = new java.io.File(zzw(), "dex");
        zzu(file);
        java.io.File zzq = zzq(file, str);
        zzu(zzq);
        return zzq;
    }

    public final java.io.File zzb() throws java.io.IOException {
        java.io.File file = new java.io.File(zzw(), "unverified-splits");
        zzu(file);
        return file;
    }

    public final java.io.File zzc(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return zzq(zzs(str), str2);
    }

    public final java.io.File zzd() throws java.io.IOException {
        return new java.io.File(zzw(), "lock.tmp");
    }

    public final java.io.File zze(java.lang.String str) throws java.io.IOException {
        return zzq(zzb(), zzx(str));
    }

    public final java.io.File zzf(java.io.File file) throws java.io.IOException {
        return zzq(zzt(), file.getName());
    }

    public final java.io.File zzg(java.lang.String str) throws java.io.IOException {
        return zzq(zzt(), zzx(str));
    }

    final java.util.List zzh() throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] listFiles = zzr().listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    final java.util.Set zzi(java.lang.String str) throws java.io.IOException {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.io.File[] listFiles = zzs(str).listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    final java.util.Set zzj() throws java.io.IOException {
        java.io.File zzt = zzt();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.io.File[] listFiles = zzt.listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && zzp(file)) {
                    hashSet.add(new com.google.android.play.core.splitcompat.zzb(file, file.getName().substring(0, r5.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void zzk() throws java.io.IOException {
        java.io.File zzv = zzv();
        java.lang.String[] list = zzv.list();
        if (list != null) {
            for (java.lang.String str : list) {
                if (!str.equals(java.lang.Long.toString(this.zza))) {
                    zzl(new java.io.File(zzv, str));
                }
            }
        }
    }

    final void zzn(java.lang.String str) throws java.io.IOException {
        zzl(zzs(str));
    }

    final void zzo(java.io.File file) throws java.io.IOException {
        if (!file.getParentFile().getParentFile().equals(zzr())) {
            throw new java.lang.IllegalStateException("File to remove is not a native library");
        }
        zzl(file);
    }

    private static java.lang.String zzx(java.lang.String str) {
        return java.lang.String.valueOf(str).concat(".apk");
    }
}
