package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdi implements com.google.android.gms.internal.identity.zzdr {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzb;

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzb(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
        this.zzb.trySetResult(null);
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final com.google.android.gms.common.api.internal.ListenerHolder zza() {
        return this.zza;
    }

    zzdi(com.google.android.gms.internal.identity.zzdz zzdzVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = listenerHolder;
        this.zzb = taskCompletionSource;
    }
}
