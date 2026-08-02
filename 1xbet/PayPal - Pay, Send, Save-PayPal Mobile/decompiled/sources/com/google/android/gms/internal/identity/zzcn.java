package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzcn extends com.google.android.gms.internal.identity.zzcq {
    final /* synthetic */ com.google.android.gms.location.GeofencingRequest zza;
    final /* synthetic */ android.app.PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcn(com.google.android.gms.internal.identity.zzcr zzcrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = geofencingRequest;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzE(this.zza, this.zzb, com.google.android.gms.internal.identity.zzcr.zza(this));
    }
}
