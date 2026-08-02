package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzac extends com.google.android.gms.internal.identity.zzae {
    final /* synthetic */ long zza;
    final /* synthetic */ android.app.PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(com.google.android.gms.internal.identity.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        android.app.PendingIntent pendingIntent = this.zzb;
        com.google.android.gms.internal.identity.zzg zzgVar = (com.google.android.gms.internal.identity.zzg) anyClient;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        long j = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        ((com.google.android.gms.internal.identity.zzv) zzgVar.getService()).zzh(j, true, pendingIntent);
        setResult((com.google.android.gms.internal.identity.zzac) com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
