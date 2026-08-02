package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzi extends com.google.android.gms.internal.safetynet.zzr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ java.lang.String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(com.google.android.gms.common.api.GoogleApiClient googleApiClient, byte[] bArr, java.lang.String str) {
        super(googleApiClient);
        this.zza = bArr;
        this.zzb = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.internal.safetynet.zzaf zzafVar) throws android.os.RemoteException {
        com.google.android.gms.internal.safetynet.zzaf zzafVar2 = zzafVar;
        com.google.android.gms.internal.safetynet.zzg zzgVar = this.zzc;
        byte[] bArr = this.zza;
        java.lang.String str = this.zzb;
        if (android.text.TextUtils.isEmpty(str)) {
            str = zzafVar2.zzp("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((com.google.android.gms.internal.safetynet.zzh) zzafVar2.getService()).zzc(zzgVar, bArr, str);
    }
}
