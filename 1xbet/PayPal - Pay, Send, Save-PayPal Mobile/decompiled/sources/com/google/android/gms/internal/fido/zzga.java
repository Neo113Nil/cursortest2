package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzga extends com.google.android.gms.internal.fido.zzfq implements java.io.Serializable {
    private final java.security.MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final java.lang.String zzd;

    zzga(java.lang.String str, java.lang.String str2) {
        java.security.MessageDigest zzb = zzb("SHA-256");
        this.zza = zzb;
        this.zzb = zzb.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzc(zzb);
    }

    private static java.security.MessageDigest zzb(java.lang.String str) {
        try {
            return java.security.MessageDigest.getInstance(str);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private static boolean zzc(java.security.MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (java.lang.CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzfu
    public final com.google.android.gms.internal.fido.zzfv zza() {
        com.google.android.gms.internal.fido.zzfy zzfyVar = null;
        if (this.zzc) {
            try {
                return new com.google.android.gms.internal.fido.zzfz((java.security.MessageDigest) this.zza.clone(), this.zzb, zzfyVar);
            } catch (java.lang.CloneNotSupportedException unused) {
            }
        }
        return new com.google.android.gms.internal.fido.zzfz(zzb(this.zza.getAlgorithm()), this.zzb, zzfyVar);
    }

    public final java.lang.String toString() {
        return this.zzd;
    }
}
