package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdh extends com.google.android.gms.location.LocationCallback {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.gms.internal.identity.zzdz zzb;

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(com.google.android.gms.location.LocationResult locationResult) {
        this.zza.trySetResult(locationResult.getLastLocation());
        try {
            this.zzb.zzw(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this, "GetCurrentLocation"), false, new com.google.android.gms.tasks.TaskCompletionSource());
        } catch (android.os.RemoteException unused) {
        }
    }

    zzdh(com.google.android.gms.internal.identity.zzdz zzdzVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        this.zzb = zzdzVar;
    }
}
