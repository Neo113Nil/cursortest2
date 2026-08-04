package com.google.android.gms.internal.appset;

import U2.b;
import Y4.D;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzo extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, com.google.android.gms.appset.zzc zzcVar) {
        D.U(status, zzcVar != null ? new b(zzcVar.f10864a, zzcVar.f10865b) : null, this.zza);
    }
}
