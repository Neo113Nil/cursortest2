package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzape {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaol zze;
    private final zzaou zzf;
    private final zzaov[] zzg;
    private zzaon zzh;
    private final List zzi;
    private final List zzj;
    private final zzaos zzk;

    public zzape(zzaol zzaolVar, zzaou zzaouVar, int i7) {
        zzaos zzaosVar = new zzaos(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaolVar;
        this.zzf = zzaouVar;
        this.zzg = new zzaov[4];
        this.zzk = zzaosVar;
    }

    public final zzapb zza(zzapb zzapbVar) {
        zzapbVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzapbVar);
        }
        zzapbVar.zzg(this.zza.incrementAndGet());
        zzapbVar.zzm("add-to-queue");
        zzc(zzapbVar, 0);
        this.zzc.add(zzapbVar);
        return zzapbVar;
    }

    public final void zzb(zzapb zzapbVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzapbVar);
        }
        synchronized (this.zzi) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzapd) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzc(zzapbVar, 5);
    }

    public final void zzc(zzapb zzapbVar, int i7) {
        synchronized (this.zzj) {
            try {
                Iterator it = this.zzj.iterator();
                while (it.hasNext()) {
                    ((zzapc) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd() {
        zzaon zzaonVar = this.zzh;
        if (zzaonVar != null) {
            zzaonVar.zzb();
        }
        zzaov[] zzaovVarArr = this.zzg;
        for (int i7 = 0; i7 < 4; i7++) {
            zzaov zzaovVar = zzaovVarArr[i7];
            if (zzaovVar != null) {
                zzaovVar.zza();
            }
        }
        zzaon zzaonVar2 = new zzaon(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaonVar2;
        zzaonVar2.start();
        for (int i8 = 0; i8 < 4; i8++) {
            zzaov zzaovVar2 = new zzaov(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i8] = zzaovVar2;
            zzaovVar2.start();
        }
    }
}
