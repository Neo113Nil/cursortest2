package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzau extends com.google.android.gms.internal.identity.zzba {
    final /* synthetic */ com.google.android.gms.location.LocationListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzau(com.google.android.gms.internal.identity.zzbb zzbbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
        super(googleApiClient);
        this.zza = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzv(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zza, "LocationListener"), true, com.google.android.gms.internal.identity.zzbb.zza(this));
    }
}
