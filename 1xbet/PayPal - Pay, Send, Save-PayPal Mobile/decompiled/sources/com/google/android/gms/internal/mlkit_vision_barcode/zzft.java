package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzft {
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzrb zza;
    private final java.lang.Boolean zzb;
    private final java.lang.Boolean zzc;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzqk zzd;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzvz zze;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzf;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzg;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzft)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzft zzftVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzft) obj;
        if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzftVar.zza)) {
            java.lang.Boolean bool = zzftVar.zzb;
            if (com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzftVar.zzc)) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzqk zzqkVar = zzftVar.zzd;
                if (com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzftVar.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzftVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, zzftVar.zzg)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    public final java.lang.Boolean zze() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzvz zzd() {
        return this.zze;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzrb zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzb() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zza() {
        return this.zzf;
    }

    /* synthetic */ zzft(com.google.android.gms.internal.mlkit_vision_barcode.zzfr zzfrVar, com.google.android.gms.internal.mlkit_vision_barcode.zzfs zzfsVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzrb zzrbVar;
        java.lang.Boolean bool;
        com.google.android.gms.internal.mlkit_vision_barcode.zzvz zzvzVar;
        com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzcsVar;
        com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzcsVar2;
        zzrbVar = zzfrVar.zza;
        this.zza = zzrbVar;
        this.zzb = null;
        bool = zzfrVar.zzb;
        this.zzc = bool;
        this.zzd = null;
        zzvzVar = zzfrVar.zzc;
        this.zze = zzvzVar;
        zzcsVar = zzfrVar.zzd;
        this.zzf = zzcsVar;
        zzcsVar2 = zzfrVar.zze;
        this.zzg = zzcsVar2;
    }
}
