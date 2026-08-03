package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzo {
    static volatile com.google.android.gms.common.internal.zzad zzg;
    public static final /* synthetic */ int zzh = 0;
    private static android.content.Context zzj;
    static final com.google.android.gms.common.zzm zza = new com.google.android.gms.common.zzd(com.google.android.gms.common.zzj.zzf("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final com.google.android.gms.common.zzm zzb = new com.google.android.gms.common.zze(com.google.android.gms.common.zzj.zzf("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final com.google.android.gms.common.zzm zzc = new com.google.android.gms.common.zzf(com.google.android.gms.common.zzj.zzf("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final com.google.android.gms.common.zzm zzd = new com.google.android.gms.common.zzg(com.google.android.gms.common.zzj.zzf("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final com.google.android.gms.common.zzm zze = new com.google.android.gms.common.zzh(com.google.android.gms.common.zzj.zzf("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final com.google.android.gms.common.zzm zzf = new com.google.android.gms.common.zzi(com.google.android.gms.common.zzj.zzf("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final java.lang.Object zzi = new java.lang.Object();

    static synchronized void zza(android.content.Context context) {
        synchronized (com.google.android.gms.common.zzo.class) {
            if (zzj != null) {
                android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                zzj = context.getApplicationContext();
            }
        }
    }

    static void zzb() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        if (zzg != null) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzj);
        synchronized (zzi) {
            if (zzg == null) {
                zzg = com.google.android.gms.common.internal.zzac.zzb(com.google.android.gms.dynamite.DynamiteModule.load(zzj, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }

    static com.google.android.gms.common.zzy zzc(com.google.android.gms.common.zzw zzwVar) {
        com.google.android.gms.common.zzy zzd2;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzj);
            try {
                zzb();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzj);
                com.google.android.gms.common.zzp zzb2 = zzwVar.zzb(zzj);
                try {
                    com.google.android.gms.common.zzr zzf2 = zzwVar.zza() ? zzg.zzf(zzb2) : zzg.zzh(zzb2);
                    if (zzf2.zza()) {
                        zzd2 = com.google.android.gms.common.zzy.zzf(zzf2.zze(), zzf2.zzc());
                    } else {
                        java.lang.String zzb3 = zzf2.zzb();
                        android.content.pm.PackageManager.NameNotFoundException nameNotFoundException = zzf2.zzd() == 4 ? new android.content.pm.PackageManager.NameNotFoundException() : null;
                        if (zzb3 == null) {
                            zzb3 = "error checking package certificate";
                        }
                        zzd2 = com.google.android.gms.common.zzy.zzg(zzf2.zze(), zzf2.zzd(), zzb3, nameNotFoundException);
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    zzd2 = com.google.android.gms.common.zzy.zzd("module call", e);
                }
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                java.lang.String message = e2.getMessage();
                java.lang.String.valueOf(message);
                zzd2 = com.google.android.gms.common.zzy.zzd("module init: ".concat(java.lang.String.valueOf(message)), e2);
            }
            return zzd2;
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @java.lang.Deprecated
    static com.google.android.gms.common.zzy zzd(java.lang.String str, com.google.android.gms.common.zzj zzjVar, boolean z, boolean z2) {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return zzf(str, zzjVar, z, z2);
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static /* synthetic */ java.lang.String zze(boolean z, java.lang.String str, com.google.android.gms.common.zzj zzjVar) {
        java.lang.String str2 = (z || !zzf(str, zzjVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        java.security.MessageDigest zza2 = com.google.android.gms.common.util.AndroidUtilsLight.zza("SHA-256");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zza2);
        return java.lang.String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.Hex.bytesToStringLowercase(zza2.digest(zzjVar.zzc())), java.lang.Boolean.valueOf(z), "12451000.false");
    }

    @java.lang.Deprecated
    private static com.google.android.gms.common.zzy zzf(final java.lang.String str, final com.google.android.gms.common.zzj zzjVar, final boolean z, boolean z2) {
        try {
            zzb();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzj);
            try {
                return zzg.zze(new com.google.android.gms.common.zzt(str, zzjVar, z, z2), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzj.getPackageManager())) ? com.google.android.gms.common.zzy.zzb() : new com.google.android.gms.common.zzx(new java.util.concurrent.Callable() { // from class: com.google.android.gms.common.zzl
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ java.lang.Object call() {
                        return com.google.android.gms.common.zzo.zze(z, str, zzjVar);
                    }
                }, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return com.google.android.gms.common.zzy.zzd("module call", e);
            }
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            java.lang.String message = e2.getMessage();
            java.lang.String.valueOf(message);
            return com.google.android.gms.common.zzy.zzd("module init: ".concat(java.lang.String.valueOf(message)), e2);
        }
    }
}
