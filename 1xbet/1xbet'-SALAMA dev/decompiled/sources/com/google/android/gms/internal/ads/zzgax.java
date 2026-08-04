package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgax extends zzgav implements I3.b {
    @Override // I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgav
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract I3.b zzc();
}
