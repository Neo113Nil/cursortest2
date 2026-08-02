package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzj extends com.google.android.libraries.places.internal.zzbmu {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzk zza;
    private final com.google.android.libraries.places.internal.zzbmu zzb;

    zzbzj(com.google.android.libraries.places.internal.zzbzk zzbzkVar, com.google.android.libraries.places.internal.zzbmu zzbmuVar) {
        java.util.Objects.requireNonNull(zzbzkVar);
        this.zza = zzbzkVar;
        this.zzb = zzbmuVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmu
    public final com.google.android.libraries.places.internal.zzbnp zza(com.google.android.libraries.places.internal.zzbmw zzbmwVar) {
        com.google.android.libraries.places.internal.zzbnp zza = this.zzb.zza(zzbmwVar);
        if (zza.zzj()) {
            this.zza.zze().zzb();
            return zza;
        }
        com.google.android.libraries.places.internal.zzbzk zzbzkVar = this.zza;
        zzbzkVar.zze().zza(new com.google.android.libraries.places.internal.zzbzi(zzbzkVar));
        return zza;
    }
}
