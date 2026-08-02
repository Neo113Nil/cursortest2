package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
abstract class zzoc {
    private com.google.android.gms.tasks.Task zza;

    public abstract com.google.android.gms.tasks.CancellationTokenSource zza();

    public final void zzd(com.google.android.gms.tasks.Task task) {
        this.zza = task;
    }

    public final com.google.android.gms.tasks.Task zzc() {
        return this.zza;
    }

    /* synthetic */ zzoc(byte[] bArr) {
    }
}
