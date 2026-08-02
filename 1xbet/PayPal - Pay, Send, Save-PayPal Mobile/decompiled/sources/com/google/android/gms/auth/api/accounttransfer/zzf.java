package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes8.dex */
final class zzf extends com.google.android.gms.auth.api.accounttransfer.zzj {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(com.google.android.gms.auth.api.accounttransfer.zzg zzgVar, com.google.android.gms.auth.api.accounttransfer.zzl zzlVar) {
        super(zzlVar);
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzc(com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData) {
        this.zza.zzb.setResult(deviceMetaData);
    }
}
