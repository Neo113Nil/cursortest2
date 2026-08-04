package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzgba {
    private final boolean zza;
    private final zzfwh zzb;

    public /* synthetic */ zzgba(boolean z4, zzfwh zzfwhVar, zzgbb zzgbbVar) {
        this.zza = z4;
        this.zzb = zzfwhVar;
    }

    public final I3.b zza(Callable callable, Executor executor) {
        return new zzgap(this.zzb, this.zza, executor, callable);
    }
}
