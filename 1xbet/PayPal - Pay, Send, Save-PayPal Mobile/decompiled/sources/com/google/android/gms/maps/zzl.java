package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzl implements com.google.android.gms.maps.LocationSource.OnLocationChangedListener {
    final /* synthetic */ com.google.android.gms.maps.internal.zzaj zza;

    zzl(com.google.android.gms.maps.zzt zztVar, com.google.android.gms.maps.internal.zzaj zzajVar) {
        this.zza = zzajVar;
        java.util.Objects.requireNonNull(zztVar);
    }

    @Override // com.google.android.gms.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(android.location.Location location) {
        try {
            this.zza.zzd(location);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
