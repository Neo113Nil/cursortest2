package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwm implements com.google.android.libraries.places.internal.zzbmo {
    private final java.util.List zza;
    private final com.google.android.libraries.places.internal.zzbmn zzb;

    @Override // com.google.android.libraries.places.internal.zzbmo
    public final void zza(com.google.android.libraries.places.internal.zzblu zzbluVar, long j, java.util.List list, java.util.List list2) {
        super.zza(zzbluVar, 1L, list, list2);
        for (com.google.android.libraries.places.internal.zzbmp zzbmpVar : this.zza) {
            if (zzbmpVar.zza() <= zzbluVar.zza()) {
                this.zzb.zzb();
                zzbmpVar.zzb();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmo
    public final void zzb(com.google.android.libraries.places.internal.zzblv zzblvVar, long j, java.util.List list, java.util.List list2) {
        super.zzb(zzblvVar, j, list, list2);
        for (com.google.android.libraries.places.internal.zzbmp zzbmpVar : this.zza) {
            if (zzbmpVar.zza() <= zzblvVar.zza()) {
                this.zzb.zzb();
                zzbmpVar.zzb();
            }
        }
    }

    zzbwm(java.util.List list, com.google.android.libraries.places.internal.zzbmn zzbmnVar) {
        this.zza = list;
        this.zzb = zzbmnVar;
    }
}
