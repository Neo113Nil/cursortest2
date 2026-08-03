package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzac zza;
    private static com.google.android.gms.common.zzad zzb;

    private static synchronized com.google.android.gms.common.zzad zza(android.content.Context context) {
        com.google.android.gms.common.zzad zzadVar;
        synchronized (com.google.android.gms.common.PackageSignatureVerifier.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.common.zzad(context);
            }
            zzadVar = zzb;
        }
        return zzadVar;
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(android.content.Context context, java.lang.String str) {
        boolean honorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        int i = com.google.android.gms.common.zzo.zzh;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                com.google.android.gms.common.zzo.zzb();
                if (com.google.android.gms.common.zzo.zzg.zzi()) {
                    com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider.zza().zza();
                    java.lang.String.valueOf(str);
                    java.lang.String concat = java.lang.String.valueOf(str).concat(true != honorsDebugCertificates ? "-0" : com.ironsource.C2945a2.f);
                    if (zza != null && zza.zza().equals(concat)) {
                        return zza.zzb();
                    }
                    str.isEmpty();
                    zza(context);
                    com.google.android.gms.common.zzv zzvVar = new com.google.android.gms.common.zzv(null);
                    zzvVar.zza(str);
                    zzvVar.zzb(honorsDebugCertificates);
                    zzvVar.zzc(false);
                    com.google.android.gms.common.zzy zzc = com.google.android.gms.common.zzo.zzc(zzvVar.zzd());
                    if (zzc.zza) {
                        com.google.android.gms.common.PackageVerificationResult zzd = com.google.android.gms.common.PackageVerificationResult.zzd(str, zzc.zzd, null);
                        zza = new com.google.android.gms.common.zzac(concat, zzd);
                        return zzd;
                    }
                    java.lang.String str2 = zzc.zzb;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
                    return com.google.android.gms.common.PackageVerificationResult.zza(str, str2, zzc.zzc, null);
                }
            } finally {
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
        }
        throw new com.google.android.gms.common.zzae();
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzc();
            return queryPackageSignatureVerified;
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!queryPackageSignatureVerified2.zzb()) {
                return queryPackageSignatureVerified2;
            }
            android.util.Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            return queryPackageSignatureVerified2;
        }
    }
}
