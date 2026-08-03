package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
final class zzd extends com.google.android.gms.internal.location.zzf {
    final /* synthetic */ long zza;
    final /* synthetic */ android.app.PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(com.google.android.gms.internal.location.zzg zzgVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.location.zzaz zzazVar) throws android.os.RemoteException {
        zzazVar.zzq(this.zza, this.zzb);
        setResult((com.google.android.gms.internal.location.zzd) com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
