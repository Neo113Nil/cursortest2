package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzvz {
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zza;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzvz) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.internal.mlkit_vision_barcode.zzvz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zza() {
        return this.zza;
    }

    /* synthetic */ zzvz(com.google.android.gms.internal.mlkit_vision_barcode.zzvx zzvxVar, com.google.android.gms.internal.mlkit_vision_barcode.zzvy zzvyVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzcsVar;
        zzcsVar = zzvxVar.zza;
        this.zza = zzcsVar;
    }
}
