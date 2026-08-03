package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
final class zzv extends com.google.android.gms.internal.location.zzx {
    final /* synthetic */ com.google.android.gms.location.LocationListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzv(com.google.android.gms.internal.location.zzz zzzVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
        super(googleApiClient);
        this.zza = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.location.zzaz zzazVar) throws android.os.RemoteException {
        zzazVar.zzF(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zza, "LocationListener"), new com.google.android.gms.internal.location.zzy(this));
    }
}
