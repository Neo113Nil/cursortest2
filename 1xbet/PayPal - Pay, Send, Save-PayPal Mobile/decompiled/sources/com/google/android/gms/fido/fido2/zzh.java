package com.google.android.gms.fido.fido2;

/* loaded from: classes8.dex */
final class zzh extends com.google.android.gms.internal.fido.zzq {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzh(com.google.android.gms.fido.fido2.Fido2ApiClient fido2ApiClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(com.google.android.gms.common.api.Status status, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, new com.google.android.gms.internal.fido.zzi(pendingIntent), this.zza);
    }
}
