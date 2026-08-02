package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdy extends com.google.android.gms.location.zzy {
    private final com.google.android.gms.internal.identity.zzdr zza;

    zzdy(com.google.android.gms.internal.identity.zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    final com.google.android.gms.internal.identity.zzdy zzc(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza.zzb(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzz
    public final void zzd(android.location.Location location) {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.identity.zzdw(this, location));
    }

    @Override // com.google.android.gms.location.zzz
    public final void zze() {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.identity.zzdx(this));
    }

    final void zzf() {
        this.zza.zza().clear();
    }

    final /* synthetic */ com.google.android.gms.internal.identity.zzdr zzg() {
        return this.zza;
    }
}
