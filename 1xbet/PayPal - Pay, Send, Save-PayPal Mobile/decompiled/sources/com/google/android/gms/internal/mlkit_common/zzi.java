package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final java.lang.String[] zzc;
    private static final java.lang.String[] zzd;

    static {
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = io.ktor.http.LinkHeader.Parameters.Media;
        strArr[1] = (android.os.Build.HARDWARE.equals("goldfish") || android.os.Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : "";
        zzc = strArr;
        zzd = new java.lang.String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static android.content.res.AssetFileDescriptor zza(android.content.Context context, android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        com.google.android.gms.internal.mlkit_common.zzh zzhVar = com.google.android.gms.internal.mlkit_common.zzh.zza;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri zzc2 = zzc(uri);
        java.lang.String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(zzc2, "r");
        }
        if ("content".equals(scheme)) {
            if (!zzj(context, zzc2, 1, zzhVar)) {
                throw new java.io.FileNotFoundException("Can't open content uri.");
            }
            android.content.res.AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(zzc2, "r");
            zzd(openAssetFileDescriptor);
            return openAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new java.io.FileNotFoundException("Unsupported scheme");
        }
        android.content.res.AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(zzc2, "r");
        zzd(openAssetFileDescriptor2);
        try {
            zzi(context, openAssetFileDescriptor2.getParcelFileDescriptor(), zzc2, zzhVar);
            return openAssetFileDescriptor2;
        } catch (java.io.FileNotFoundException e) {
            zzg(openAssetFileDescriptor2, e);
            throw e;
        } catch (java.io.IOException e2) {
            java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            zzg(openAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static java.io.InputStream zzb(android.content.Context context, android.net.Uri uri, com.google.android.gms.internal.mlkit_common.zzh zzhVar) throws java.io.FileNotFoundException {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri zzc2 = zzc(uri);
        java.lang.String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(zzc2);
        }
        if ("content".equals(scheme)) {
            if (!zzj(context, zzc2, 1, zzhVar)) {
                throw new java.io.FileNotFoundException("Can't open content uri.");
            }
            java.io.InputStream openInputStream = contentResolver.openInputStream(zzc2);
            zzd(openInputStream);
            return openInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new java.io.FileNotFoundException("Unsupported scheme");
        }
        try {
            android.os.ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(android.net.Uri.fromFile(new java.io.File(zzc2.getPath()).getCanonicalFile()), "r");
            try {
                zzi(context, openFileDescriptor, zzc2, zzhVar);
                return new android.os.ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
            } catch (java.io.FileNotFoundException e) {
                zzh(openFileDescriptor, e);
                throw e;
            } catch (java.io.IOException e2) {
                java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                zzh(openFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (java.io.IOException e3) {
            java.io.FileNotFoundException fileNotFoundException2 = new java.io.FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    private static android.net.Uri zzc(android.net.Uri uri) {
        return android.os.Build.VERSION.SDK_INT < 30 ? android.net.Uri.parse(uri.toString()) : uri;
    }

    private static java.lang.Object zzd(java.lang.Object obj) throws java.io.FileNotFoundException {
        if (obj != null) {
            return obj;
        }
        throw new java.io.FileNotFoundException("Content resolver returned null value.");
    }

    private static java.lang.String zze(java.io.File file) throws java.io.IOException {
        java.lang.String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) ? java.lang.String.valueOf(canonicalPath).concat(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) : canonicalPath;
    }

    private static void zzf(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str) throws java.io.IOException {
        try {
            android.system.StructStat fstat = android.system.Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                android.system.StructStat lstat = android.system.Os.lstat(str);
                if (android.system.OsConstants.S_ISLNK(lstat.st_mode)) {
                    throw new java.io.FileNotFoundException("Can't open file: ".concat(java.lang.String.valueOf(str)));
                }
                if (fstat.st_dev != lstat.st_dev || fstat.st_ino != lstat.st_ino) {
                    throw new java.io.FileNotFoundException("Can't open file: ".concat(java.lang.String.valueOf(str)));
                }
            } catch (android.system.ErrnoException e) {
                throw new java.io.IOException(e);
            }
        } catch (android.system.ErrnoException e2) {
            throw new java.io.IOException(e2);
        }
    }

    private static void zzg(android.content.res.AssetFileDescriptor assetFileDescriptor, java.io.FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (java.io.IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void zzh(android.os.ParcelFileDescriptor parcelFileDescriptor, java.io.FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (java.io.IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void zzi(final android.content.Context context, android.os.ParcelFileDescriptor parcelFileDescriptor, android.net.Uri uri, com.google.android.gms.internal.mlkit_common.zzh zzhVar) throws java.io.IOException {
        boolean z;
        boolean z2;
        java.io.File dataDir;
        java.lang.String canonicalPath = new java.io.File(uri.getPath()).getCanonicalPath();
        zzf(parcelFileDescriptor, canonicalPath);
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            com.google.android.gms.internal.mlkit_common.zzh.zza(zzhVar);
            java.io.File dataDir2 = androidx.core.content.ContextCompat.getDataDir(context);
            if (dataDir2 == null ? !canonicalPath.startsWith(zze(android.os.Environment.getDataDirectory())) : !canonicalPath.startsWith(zze(dataDir2))) {
                android.content.Context createDeviceProtectedStorageContext = androidx.core.content.ContextCompat.createDeviceProtectedStorageContext(context);
                if (createDeviceProtectedStorageContext == null || (dataDir = androidx.core.content.ContextCompat.getDataDir(createDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(zze(dataDir))) {
                    java.io.File[] zzk = zzk(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzb
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            int i = com.google.android.gms.internal.mlkit_common.zzi.zza;
                            return androidx.core.content.ContextCompat.getExternalFilesDirs(context, null);
                        }
                    });
                    int length = zzk.length;
                    z = false;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            java.io.File file = zzk[i];
                            if (file != null && canonicalPath.startsWith(zze(file))) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            for (java.io.File file2 : zzk(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    int i2 = com.google.android.gms.internal.mlkit_common.zzi.zza;
                                    return androidx.core.content.ContextCompat.getExternalCacheDirs(context);
                                }
                            })) {
                                if (file2 == null || !canonicalPath.startsWith(zze(file2))) {
                                }
                            }
                        }
                    }
                }
            }
            z = true;
            z2 = zzhVar.zzb;
            if (z == z2) {
                return;
            }
        }
        throw new java.io.FileNotFoundException("Can't open file: ".concat(java.lang.String.valueOf(canonicalPath)));
    }

    private static boolean zzj(android.content.Context context, android.net.Uri uri, int i, com.google.android.gms.internal.mlkit_common.zzh zzhVar) {
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.String authority = uri.getAuthority();
        android.content.pm.ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                z3 = zzhVar.zzb;
                return !z3;
            }
        }
        if (com.google.android.gms.internal.mlkit_common.zzh.zzc(zzhVar, context, new com.google.android.gms.internal.mlkit_common.zzj(uri, resolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            z2 = zzhVar.zzb;
            return z2;
        }
        z = zzhVar.zzb;
        if (z) {
            return false;
        }
        if (context.checkUriPermission(uri, android.os.Process.myPid(), android.os.Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            java.lang.String[] strArr = zzc;
            int length = strArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                if (strArr[i2].equals(authority)) {
                    return true;
                }
            }
            java.lang.String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr2[i3].equals(authority)) {
                    return true;
                }
            }
            java.lang.String[] strArr3 = zzb;
            for (int i4 = 0; i4 < 6; i4++) {
                java.lang.String str = strArr3[i4];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static java.io.File[] zzk(java.util.concurrent.Callable callable) {
        try {
            return (java.io.File[]) callable.call();
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
