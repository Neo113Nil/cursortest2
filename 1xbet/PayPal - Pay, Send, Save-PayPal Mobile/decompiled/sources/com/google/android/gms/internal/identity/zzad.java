package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzad extends com.google.android.gms.internal.identity.zzae {
    final /* synthetic */ android.app.PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(com.google.android.gms.internal.identity.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzg) anyClient).zzp(this.zza);
        setResult((com.google.android.gms.internal.identity.zzad) com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
