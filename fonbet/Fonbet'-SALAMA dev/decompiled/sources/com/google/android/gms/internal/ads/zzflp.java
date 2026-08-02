package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzflp {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzflo zzd = null;

    public zzflp() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzflo zzfloVar = (zzflo) this.zzc.poll();
        this.zzd = zzfloVar;
        if (zzfloVar != null) {
            zzfloVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzflo zzfloVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzflo zzfloVar) {
        zzfloVar.zzb(this);
        this.zzc.add(zzfloVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
