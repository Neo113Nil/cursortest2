package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzast implements java.util.concurrent.Executor {
    final /* synthetic */ android.os.Handler zza;

    zzast(com.google.android.gms.internal.ads.zzasv zzasvVar, android.os.Handler handler) {
        this.zza = handler;
        java.util.Objects.requireNonNull(zzasvVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
