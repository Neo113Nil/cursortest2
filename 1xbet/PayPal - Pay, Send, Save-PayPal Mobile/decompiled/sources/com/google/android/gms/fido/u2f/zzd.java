package com.google.android.gms.fido.u2f;

/* loaded from: classes8.dex */
final class zzd extends com.google.android.gms.internal.fido.zzu {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzd(com.google.android.gms.fido.u2f.U2fApiClient u2fApiClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzv
    public final void zzb(com.google.android.gms.common.api.Status status, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, new com.google.android.gms.internal.fido.zzt(pendingIntent), this.zza);
    }
}
