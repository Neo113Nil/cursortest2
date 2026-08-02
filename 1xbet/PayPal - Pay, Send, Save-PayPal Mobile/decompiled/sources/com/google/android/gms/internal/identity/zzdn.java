package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdn extends com.google.android.gms.internal.identity.zzq {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzdn(java.lang.Object obj, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zzd(com.google.android.gms.internal.identity.zzl zzlVar) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(zzlVar.getStatus(), this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zze() {
    }
}
