package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzhv implements com.google.android.libraries.places.internal.zzcej {
    final java.util.List zza;
    final /* synthetic */ com.google.common.util.concurrent.SettableFuture zzb;

    zzhv(com.google.android.libraries.places.internal.zzhw zzhwVar, com.google.common.util.concurrent.SettableFuture settableFuture) {
        this.zzb = settableFuture;
        java.util.Objects.requireNonNull(zzhwVar);
        this.zza = new java.util.ArrayList();
    }

    @Override // com.google.android.libraries.places.internal.zzcej
    public final void zza(java.lang.Throwable th) {
        this.zzb.setException(th);
    }

    @Override // com.google.android.libraries.places.internal.zzcej
    public final void zzb() {
        java.util.List<com.google.android.libraries.places.internal.zzavt> list = this.zza;
        for (com.google.android.libraries.places.internal.zzavt zzavtVar : list) {
            if (zzavtVar.zzc().contains(com.google.android.libraries.places.api.model.PlaceTypes.POINT_OF_INTEREST)) {
                this.zzb.set(zzavtVar.zza());
                return;
            }
        }
        this.zzb.set(list.isEmpty() ? "" : ((com.google.android.libraries.places.internal.zzavt) list.get(0)).zza());
    }

    @Override // com.google.android.libraries.places.internal.zzcej
    public final /* synthetic */ void zzc(java.lang.Object obj) {
        this.zza.addAll(((com.google.android.libraries.places.internal.zzavp) obj).zza());
    }
}
