package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzk extends com.google.android.gms.internal.safetynet.zzz {
    final /* synthetic */ int[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ java.lang.String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(com.google.android.gms.common.api.GoogleApiClient googleApiClient, int[] iArr, int i, java.lang.String str, java.lang.String str2) {
        super(googleApiClient);
        this.zza = iArr;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.internal.safetynet.zzaf zzafVar) throws android.os.RemoteException {
        com.google.android.gms.internal.safetynet.zzaf zzafVar2 = zzafVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : this.zza) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        zzafVar2.zzq(this.zze, arrayList, this.zzb, this.zzc, this.zzd);
    }
}
