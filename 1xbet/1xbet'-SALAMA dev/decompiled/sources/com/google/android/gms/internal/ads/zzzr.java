package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzzr implements zzzs {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdd zzb;

    public zzzr(Executor executor, zzdd zzddVar) {
        this.zza = executor;
        this.zzb = zzddVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
