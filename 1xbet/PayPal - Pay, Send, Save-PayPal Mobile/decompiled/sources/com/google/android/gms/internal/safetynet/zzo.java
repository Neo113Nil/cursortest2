package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzo extends com.google.android.gms.internal.safetynet.zzx {
    final /* synthetic */ java.lang.String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzo(com.google.android.gms.internal.safetynet.zzae zzaeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super(googleApiClient);
        this.zza = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.internal.safetynet.zzaf zzafVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.safetynet.zzh) zzafVar.getService()).zzj(this.zzb, this.zza);
    }
}
