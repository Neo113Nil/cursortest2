package com.google.android.gms.fido.fido2;

/* loaded from: classes8.dex */
final class zzs extends com.google.android.gms.internal.fido.zzl {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzs(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient fido2PrivilegedApiClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzm
    public final void zzb(com.google.android.gms.common.api.Status status, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, new com.google.android.gms.internal.fido.zzi(pendingIntent), this.zza);
    }
}
