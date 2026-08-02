package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdo extends com.google.android.gms.internal.identity.zzq {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.gms.location.zzz zzb;

    zzdo(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.location.zzz zzzVar) {
        this.zza = taskCompletionSource;
        this.zzb = zzzVar;
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zzd(com.google.android.gms.internal.identity.zzl zzlVar) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(zzlVar.getStatus(), this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zze() throws android.os.RemoteException {
        this.zzb.zze();
    }
}
