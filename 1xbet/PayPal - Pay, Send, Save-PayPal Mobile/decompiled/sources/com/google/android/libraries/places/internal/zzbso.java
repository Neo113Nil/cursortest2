package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
class zzbso extends com.google.android.libraries.places.internal.zzblw {
    private final com.google.android.libraries.places.internal.zzblw zza;

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", this.zza).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final com.google.android.libraries.places.internal.zzbix zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        return this.zza.zza(zzbmlVar, zzbisVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final java.lang.String zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public com.google.android.libraries.places.internal.zzblw zzd() {
        com.google.android.libraries.places.internal.zzblw zzblwVar = this.zza;
        ((com.google.android.libraries.places.internal.zzbvr) zzblwVar).zzg();
        return zzblwVar;
    }

    zzbso(com.google.android.libraries.places.internal.zzblw zzblwVar) {
        this.zza = zzblwVar;
    }
}
