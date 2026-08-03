package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
final class zze extends com.google.android.gms.internal.location.zzf {
    final /* synthetic */ android.app.PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(com.google.android.gms.internal.location.zzg zzgVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.location.zzaz zzazVar) throws android.os.RemoteException {
        zzazVar.zzt(this.zza);
        setResult((com.google.android.gms.internal.location.zze) com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
