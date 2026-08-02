package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.gms.internal.p001authapiphone.zzd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzw(com.google.android.gms.internal.p001authapiphone.zzab zzabVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        java.util.Objects.requireNonNull(zzabVar);
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zze
    public final void zzb(com.google.android.gms.common.api.Status status, int i) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, java.lang.Integer.valueOf(i), this.zza);
    }
}
