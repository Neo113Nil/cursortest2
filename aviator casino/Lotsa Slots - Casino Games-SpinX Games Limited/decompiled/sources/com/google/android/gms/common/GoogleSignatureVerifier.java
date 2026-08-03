package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class GoogleSignatureVerifier {

    @javax.annotation.Nullable
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;

    @javax.annotation.Nullable
    private static volatile java.util.Set zzd;

    @javax.annotation.Nullable
    private static volatile java.util.Set zze;
    private final android.content.Context zzb;
    private volatile java.lang.String zzc;

    public GoogleSignatureVerifier(android.content.Context context) {
        this.zzb = context.getApplicationContext();
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        synchronized (com.google.android.gms.common.GoogleSignatureVerifier.class) {
            if (zza == null) {
                com.google.android.gms.common.zzo.zza(context);
                zza = new com.google.android.gms.common.GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean zza(android.content.pm.PackageInfo packageInfo, boolean z) {
        com.google.android.gms.internal.common.zzah zzj;
        if (packageInfo == null) {
            return false;
        }
        if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            com.google.android.gms.internal.common.zzah zzahVar = z ? com.google.android.gms.common.zzn.zzc : com.google.android.gms.common.zzn.zzb;
            int i = com.google.android.gms.common.util.AndroidUtilsLight.zza;
            if (android.os.Build.VERSION.SDK_INT < 28) {
                byte[] bArr = null;
                if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                    bArr = packageInfo.signatures[0].toByteArray();
                }
                zzj = bArr != null ? com.google.android.gms.internal.common.zzah.zzk(bArr) : com.google.android.gms.internal.common.zzah.zzj();
            } else {
                com.google.android.gms.internal.common.zzr.zza(android.os.Build.VERSION.SDK_INT >= 28);
                android.content.pm.SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                    int i2 = com.google.android.gms.internal.common.zzah.zzd;
                    com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad();
                    for (android.content.pm.Signature signature : signingInfo.getSigningCertificateHistory()) {
                        zzadVar.zzb(signature.toByteArray());
                    }
                    zzj = zzadVar.zzd();
                }
                zzj = com.google.android.gms.internal.common.zzah.zzj();
            }
            if (zzj.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Unable to obtain package certificate history.");
            }
            com.google.android.gms.internal.common.zzah zzh = zzj.zzh();
            int size = zzh.size();
            int i3 = 0;
            while (i3 < size) {
                byte[] bArr2 = (byte[]) zzh.get(i3);
                com.google.android.gms.internal.common.zzal listIterator = zzahVar.listIterator(0);
                do {
                    int i4 = i3 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!java.util.Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
            return false;
        } catch (java.lang.IllegalArgumentException unused) {
            android.util.Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z ? zzc(packageInfo, com.google.android.gms.common.zzn.zza) : zzc(packageInfo, com.google.android.gms.common.zzn.zza[0])) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.google.android.gms.common.zzy zzb(@javax.annotation.Nullable java.lang.String str, boolean z, boolean z2) {
        com.google.android.gms.common.zzy zzc;
        if (str == null) {
            return com.google.android.gms.common.zzy.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return com.google.android.gms.common.zzy.zzb();
        }
        int i = com.google.android.gms.common.zzo.zzh;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                com.google.android.gms.common.zzo.zzb();
            } finally {
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
        }
        try {
            if (com.google.android.gms.common.zzo.zzg.zzg()) {
                com.google.android.gms.common.zzv zzvVar = new com.google.android.gms.common.zzv(null);
                zzvVar.zza(str);
                zzvVar.zzb(com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                zzvVar.zzc(true);
                zzc = com.google.android.gms.common.zzo.zzc(zzvVar.zzd());
                if (zzc.zza) {
                    this.zzc = str;
                }
                return zzc;
            }
            android.content.pm.PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, allowThreadDiskReads >= 28 ? 134217792 : 64);
            boolean honorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
            if (packageInfo == null) {
                zzc = com.google.android.gms.common.zzy.zzc("null pkg");
            } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                zzc = com.google.android.gms.common.zzy.zzc("single cert required");
            } else {
                com.google.android.gms.common.zzk zzkVar = new com.google.android.gms.common.zzk(packageInfo.signatures[0].toByteArray());
                java.lang.String str2 = packageInfo.packageName;
                com.google.android.gms.common.zzy zzd2 = com.google.android.gms.common.zzo.zzd(str2, zzkVar, honorsDebugCertificates, false);
                zzc = (!zzd2.zza || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !com.google.android.gms.common.zzo.zzd(str2, zzkVar, false, true).zza) ? zzd2 : com.google.android.gms.common.zzy.zzc("debuggable release cert app rejected");
            }
            if (zzc.zza) {
            }
            return zzc;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            return com.google.android.gms.common.zzy.zzd("no pkg ".concat(str), e2);
        }
        allowThreadDiskReads = android.os.Build.VERSION.SDK_INT;
    }

    @javax.annotation.Nullable
    private static com.google.android.gms.common.zzj zzc(android.content.pm.PackageInfo packageInfo, com.google.android.gms.common.zzj... zzjVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            com.google.android.gms.common.zzk zzkVar = new com.google.android.gms.common.zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean isPackageGoogleSigned(@javax.annotation.Nullable java.lang.String str) {
        com.google.android.gms.common.zzy zzb = zzb(str, false, false);
        zzb.zze();
        return zzb.zza;
    }

    public boolean isUidGoogleSigned(int i) {
        com.google.android.gms.common.zzy zzc;
        int length;
        java.lang.String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzb(packagesForUid[i2], false, false);
                if (zzc.zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzc = com.google.android.gms.common.zzy.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
