package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
final class zzaj extends com.google.android.gms.internal.p001authapiphone.zzl {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzaj(com.google.android.gms.internal.p001authapiphone.zzam zzamVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        java.util.Objects.requireNonNull(zzamVar);
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzm
    public final void zzb(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zza);
    }
}
