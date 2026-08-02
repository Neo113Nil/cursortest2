package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzqk {
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzqi zza;
    private final java.lang.Integer zzb;
    private final java.lang.Integer zzc;
    private final java.lang.Boolean zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzqk)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzqk zzqkVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzqk) obj;
        if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzqkVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzqkVar.zzb)) {
            java.lang.Integer num = zzqkVar.zzc;
            if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                java.lang.Boolean bool = zzqkVar.zzd;
                if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, null, null);
    }

    public final java.lang.Integer zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzqi zza() {
        return this.zza;
    }

    /* synthetic */ zzqk(com.google.android.gms.internal.mlkit_vision_barcode.zzqh zzqhVar, com.google.android.gms.internal.mlkit_vision_barcode.zzqj zzqjVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzqi zzqiVar;
        java.lang.Integer num;
        zzqiVar = zzqhVar.zza;
        this.zza = zzqiVar;
        num = zzqhVar.zzb;
        this.zzb = num;
        this.zzc = null;
        this.zzd = null;
    }
}
