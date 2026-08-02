package com.google.android.gms.tasks;

/* loaded from: classes8.dex */
final class zzs implements com.google.android.gms.tasks.OnTokenCanceledListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzs(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        java.util.Objects.requireNonNull(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.zza.zza().zze();
    }
}
