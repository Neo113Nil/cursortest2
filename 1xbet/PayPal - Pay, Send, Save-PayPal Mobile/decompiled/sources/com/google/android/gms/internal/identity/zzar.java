package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzar extends com.google.android.gms.internal.identity.zzba {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ com.google.android.gms.location.LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(com.google.android.gms.internal.identity.zzbb zzbbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.location.LocationRequest locationRequest) {
        super(googleApiClient);
        this.zza = listenerHolder;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzs(new com.google.android.gms.internal.identity.zzaz(this.zza), this.zzb, com.google.android.gms.internal.identity.zzbb.zza(this));
    }
}
