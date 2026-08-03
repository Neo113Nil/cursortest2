package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzi extends com.google.android.gms.auth.api.accounttransfer.zzn {
    final /* synthetic */ com.google.android.gms.internal.auth.zzav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, int i, com.google.android.gms.internal.auth.zzav zzavVar) {
        super(1610);
        this.zza = zzavVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    protected final void zza(com.google.android.gms.internal.auth.zzau zzauVar) throws android.os.RemoteException {
        zzauVar.zzf(this.zzc, this.zza);
    }
}
