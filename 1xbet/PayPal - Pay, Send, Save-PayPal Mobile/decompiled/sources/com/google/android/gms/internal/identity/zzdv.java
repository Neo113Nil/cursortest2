package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdv extends com.google.android.gms.location.zzv {
    private final com.google.android.gms.internal.identity.zzdr zza;

    zzdv(com.google.android.gms.internal.identity.zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    final com.google.android.gms.internal.identity.zzdv zzc(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza.zzb(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzw
    public final void zzd(com.google.android.gms.location.LocationResult locationResult) throws android.os.RemoteException {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.identity.zzds(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzw
    public final void zze(com.google.android.gms.location.LocationAvailability locationAvailability) throws android.os.RemoteException {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.identity.zzdt(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzw
    public final void zzf() {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.identity.zzdu(this));
    }

    final void zzg() {
        this.zza.zza().clear();
    }

    final /* synthetic */ com.google.android.gms.internal.identity.zzdr zzh() {
        return this.zza;
    }
}
