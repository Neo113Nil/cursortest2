package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzaw extends com.google.android.gms.internal.identity.zzba {
    final /* synthetic */ com.google.android.gms.location.LocationCallback zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaw(com.google.android.gms.internal.identity.zzbb zzbbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback) {
        super(googleApiClient);
        this.zza = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzw(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zza, "LocationCallback"), true, com.google.android.gms.internal.identity.zzbb.zza(this));
    }
}
