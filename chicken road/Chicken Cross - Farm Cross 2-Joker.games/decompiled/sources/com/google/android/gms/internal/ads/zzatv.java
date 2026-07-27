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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzatv {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzatc zze;
    private final zzatl zzf;
    private final zzatm[] zzg;
    private zzate zzh;
    private final List zzi;
    private final List zzj;
    private final zzatj zzk;

    public zzatv(zzatc zzatcVar, zzatl zzatlVar, int i) {
        zzatj zzatjVar = new zzatj(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzatcVar;
        this.zzf = zzatlVar;
        this.zzg = new zzatm[4];
        this.zzk = zzatjVar;
    }

    public final void zza() {
        zzate zzateVar = this.zzh;
        if (zzateVar != null) {
            zzateVar.zza();
        }
        zzatm[] zzatmVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzatm zzatmVar = zzatmVarArr[i];
            if (zzatmVar != null) {
                zzatmVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzatc zzatcVar = this.zze;
        zzatj zzatjVar = this.zzk;
        zzate zzateVar2 = new zzate(priorityBlockingQueue, priorityBlockingQueue2, zzatcVar, zzatjVar);
        this.zzh = zzateVar2;
        zzateVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzatm zzatmVar2 = new zzatm(priorityBlockingQueue2, this.zzf, zzatcVar, zzatjVar);
            zzatmVarArr[i2] = zzatmVar2;
            zzatmVar2.start();
        }
    }

    public final zzats zzb(zzats zzatsVar) {
        zzatsVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzatsVar);
        }
        zzatsVar.zzg(this.zza.incrementAndGet());
        zzatsVar.zzc("add-to-queue");
        zzd(zzatsVar, 0);
        this.zzc.add(zzatsVar);
        return zzatsVar;
    }

    final void zzc(zzats zzatsVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzatsVar);
        }
        List list = this.zzi;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zzatu) it.next()).zza();
            }
        }
        zzd(zzatsVar, 5);
    }

    final void zzd(zzats zzatsVar, int i) {
        List list = this.zzj;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zzatt) it.next()).zza();
            }
        }
    }
}
