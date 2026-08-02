package com.google.android.gms.common;

/* loaded from: classes8.dex */
public class PackageVerificationResult {
    private final java.lang.String zza;
    private final boolean zzb;

    @javax.annotation.Nullable
    private final java.lang.String zzc;

    @javax.annotation.Nullable
    private final java.lang.Throwable zzd;

    public final void zzc() {
        if (this.zzb) {
            return;
        }
        java.lang.String str = this.zzc;
        java.lang.Throwable th = this.zzd;
        java.lang.String concat = "PackageVerificationRslt: ".concat(java.lang.String.valueOf(str));
        if (th == null) {
            throw new java.lang.SecurityException(concat);
        }
        throw new java.lang.SecurityException(concat, th);
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public static com.google.android.gms.common.PackageVerificationResult zzd(java.lang.String str, int i, @javax.annotation.Nullable com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new com.google.android.gms.common.PackageVerificationResult(str, i, true, null, null, null);
    }

    public static com.google.android.gms.common.PackageVerificationResult zza(java.lang.String str, java.lang.String str2, @javax.annotation.Nullable java.lang.Throwable th, @javax.annotation.Nullable com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new com.google.android.gms.common.PackageVerificationResult(str, 1, false, str2, th, null);
    }

    private PackageVerificationResult(java.lang.String str, int i, boolean z, @javax.annotation.Nullable java.lang.String str2, @javax.annotation.Nullable java.lang.Throwable th, @javax.annotation.Nullable com.google.android.gms.common.signatureverification.zza zzaVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = str2;
        this.zzd = th;
    }
}
