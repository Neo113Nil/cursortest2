package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdj extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzdj(java.lang.Object obj, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zza, this.zzb);
    }
}
