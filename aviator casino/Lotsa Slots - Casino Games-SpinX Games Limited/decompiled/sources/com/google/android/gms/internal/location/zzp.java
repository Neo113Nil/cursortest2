package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
final class zzp extends com.google.android.gms.internal.location.zzx {
    final /* synthetic */ android.location.Location zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzp(com.google.android.gms.internal.location.zzz zzzVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location) {
        super(googleApiClient);
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.location.zzaz zzazVar) throws android.os.RemoteException {
        zzazVar.zzJ(this.zza);
        setResult((com.google.android.gms.internal.location.zzp) com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
