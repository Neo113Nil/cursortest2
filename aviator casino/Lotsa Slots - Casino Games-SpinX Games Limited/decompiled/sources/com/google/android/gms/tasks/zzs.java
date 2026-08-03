package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes4.dex */
final class zzs implements com.google.android.gms.tasks.OnTokenCanceledListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzs(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        com.google.android.gms.tasks.zzw zzwVar;
        zzwVar = this.zza.zza;
        zzwVar.zzc();
    }
}
