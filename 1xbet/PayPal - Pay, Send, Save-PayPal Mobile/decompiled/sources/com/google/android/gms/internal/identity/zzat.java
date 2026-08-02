package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzat extends com.google.android.gms.internal.identity.zzba {
    final /* synthetic */ android.app.PendingIntent zza;
    final /* synthetic */ com.google.android.gms.location.LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(com.google.android.gms.internal.identity.zzbb zzbbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent, com.google.android.gms.location.LocationRequest locationRequest) {
        super(googleApiClient);
        this.zza = pendingIntent;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzu(this.zza, this.zzb, com.google.android.gms.internal.identity.zzbb.zza(this));
    }
}
