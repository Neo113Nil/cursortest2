package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzav extends com.google.android.gms.internal.identity.zzba {
    final /* synthetic */ android.app.PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzav(com.google.android.gms.internal.identity.zzbb zzbbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzx(this.zza, com.google.android.gms.internal.identity.zzbb.zza(this), null);
    }
}
