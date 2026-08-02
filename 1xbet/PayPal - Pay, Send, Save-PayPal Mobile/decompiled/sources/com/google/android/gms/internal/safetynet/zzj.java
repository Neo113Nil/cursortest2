package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzj extends com.google.android.gms.internal.safetynet.zzz {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ java.lang.String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(com.google.android.gms.internal.safetynet.zzae zzaeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List list, java.lang.String str, java.lang.String str2) {
        super(googleApiClient);
        this.zza = list;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.internal.safetynet.zzaf zzafVar) throws android.os.RemoteException {
        zzafVar.zzq(this.zze, this.zza, 1, this.zzb, null);
    }
}
