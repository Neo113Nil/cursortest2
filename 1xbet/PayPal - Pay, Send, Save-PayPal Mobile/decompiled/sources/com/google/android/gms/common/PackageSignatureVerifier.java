package com.google.android.gms.common;

/* loaded from: classes8.dex */
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzac zza;
    private static com.google.android.gms.common.zzad zzb;

    private static com.google.android.gms.common.zzad zza(android.content.Context context) {
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
            com.google.android.gms.common.zzo.zzb();
            if (com.google.android.gms.common.zzo.zzg.zzi()) {
                com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider.zza().zza();
                java.lang.String concat = java.lang.String.valueOf(str).concat(true != honorsDebugCertificates ? "-0" : "-1");
                if (zza != null && zza.zza().equals(concat)) {
                    return zza.zzb();
                }
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
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        throw new com.google.android.gms.common.zzae();
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzc();
            return queryPackageSignatureVerified;
        } catch (java.lang.SecurityException unused) {
            com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified2.zzb();
            return queryPackageSignatureVerified2;
        }
    }
}
