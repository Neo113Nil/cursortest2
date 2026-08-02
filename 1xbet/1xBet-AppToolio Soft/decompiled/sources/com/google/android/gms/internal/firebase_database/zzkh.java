package com.google.android.gms.internal.firebase_database;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class zzkh implements zzdt {
    private ScheduledThreadPoolExecutor zzui = new zzki(this, 1, new zzkj(this, null));

    public zzkh() {
        this.zzui.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzdt
    public final void restart() {
        this.zzui.setCorePoolSize(1);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzdt
    public final void shutdown() {
        this.zzui.setCorePoolSize(0);
    }

    public abstract void zza(Throwable th);

    @Override // com.google.android.gms.internal.firebase_database.zzdt
    public final void zzc(Runnable runnable) {
        this.zzui.execute(runnable);
    }

    public final ScheduledExecutorService zzs() {
        return this.zzui;
    }
}
