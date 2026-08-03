package com.google.android.gms.common.signatureverification;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zzd {
    private static com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zza;

    public static synchronized void zza(com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration signatureVerificationConfiguration) {
        synchronized (com.google.android.gms.common.signatureverification.zzd.class) {
            if (zza != null) {
                throw new java.lang.IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
            }
            zza = signatureVerificationConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zzc() {
        com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration signatureVerificationConfiguration;
        synchronized (com.google.android.gms.common.signatureverification.zzd.class) {
            if (zza == null) {
                zza(new com.google.android.gms.common.signatureverification.zzb());
            }
            signatureVerificationConfiguration = zza;
        }
        return signatureVerificationConfiguration;
    }
}
