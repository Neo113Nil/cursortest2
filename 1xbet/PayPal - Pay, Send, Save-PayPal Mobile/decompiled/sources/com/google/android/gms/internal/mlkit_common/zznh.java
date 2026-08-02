package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zznh {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.mlkit_common.zznf zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.mlkit_common.zzne zzf;
    private final java.lang.Long zzg;
    private final java.lang.Boolean zzh;
    private final java.lang.Boolean zzi;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_common.zznh)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_common.zznh zznhVar = (com.google.android.gms.internal.mlkit_common.zznh) obj;
        if (com.google.android.gms.common.internal.Objects.equal(this.zza, zznhVar.zza)) {
            java.lang.String str = zznhVar.zzb;
            if (com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zznhVar.zzc)) {
                java.lang.String str2 = zznhVar.zzd;
                if (com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(this.zze, zznhVar.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zznhVar.zzf)) {
                    java.lang.Long l = zznhVar.zzg;
                    if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                        java.lang.Boolean bool = zznhVar.zzh;
                        if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                            java.lang.Boolean bool2 = zznhVar.zzi;
                            if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    public final java.lang.String zzd() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final com.google.android.gms.internal.mlkit_common.zznf zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.mlkit_common.zzne zza() {
        return this.zzf;
    }

    /* synthetic */ zznh(com.google.android.gms.internal.mlkit_common.zznd zzndVar, com.google.android.gms.internal.mlkit_common.zzng zzngVar) {
        java.lang.String str;
        com.google.android.gms.internal.mlkit_common.zznf zznfVar;
        java.lang.String str2;
        com.google.android.gms.internal.mlkit_common.zzne zzneVar;
        str = zzndVar.zza;
        this.zza = str;
        this.zzb = null;
        zznfVar = zzndVar.zzb;
        this.zzc = zznfVar;
        this.zzd = null;
        str2 = zzndVar.zzc;
        this.zze = str2;
        zzneVar = zzndVar.zzd;
        this.zzf = zzneVar;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
    }
}
