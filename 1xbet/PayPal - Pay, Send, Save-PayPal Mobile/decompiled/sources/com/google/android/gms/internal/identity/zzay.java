package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzay extends com.google.android.gms.internal.identity.zzba {
    final /* synthetic */ android.location.Location zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(com.google.android.gms.internal.identity.zzbb zzbbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location) {
        super(googleApiClient);
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzA(this.zza, com.google.android.gms.internal.identity.zzbb.zza(this));
    }
}
