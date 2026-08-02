package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzcx extends com.google.android.gms.internal.identity.zzcy {
    final /* synthetic */ com.google.android.gms.location.LocationSettingsRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcx(com.google.android.gms.internal.identity.zzcz zzczVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, java.lang.String str) {
        super(googleApiClient);
        this.zza = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        ((com.google.android.gms.internal.identity.zzv) ((com.google.android.gms.internal.identity.zzdz) anyClient).getService()).zzD(locationSettingsRequest, new com.google.android.gms.internal.identity.zzdf(this), null);
    }
}
