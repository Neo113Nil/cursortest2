package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzd extends com.google.android.gms.auth.api.accounttransfer.zzj {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zze zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(com.google.android.gms.auth.api.accounttransfer.zze zzeVar, com.google.android.gms.auth.api.accounttransfer.zzl zzlVar) {
        super(zzlVar);
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzb(byte[] bArr) {
        this.zza.zzb.setResult(bArr);
    }
}
