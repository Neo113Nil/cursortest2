package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeg {
    private final Thread zza;
    private final zzea zzb;
    private final zzec zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzeg(Looper looper, zzdp zzdpVar, zzec zzecVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), zzdpVar, zzecVar, true);
    }

    private final void zzi() {
        if (this.zzi) {
            zzguk.zzi(zzb());
        }
    }

    public final zzeg zza(Looper looper, zzdp zzdpVar, zzec zzecVar) {
        return new zzeg(this.zzd, looper, looper.getThread(), zzdpVar, zzecVar, this.zzi);
    }

    public final boolean zzb() {
        return Thread.currentThread() == this.zza;
    }

    public final void zzd(Object obj) {
        zzi();
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            zzed zzedVar = (zzed) it.next();
            if (zzedVar.zza.equals(obj)) {
                zzedVar.zzc(this.zzc);
                copyOnWriteArraySet.remove(zzedVar);
            }
        }
    }

    public final void zze(final int i, final zzeb zzebVar) {
        zzi();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzee
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzeb zzebVar2 = zzebVar;
                    ((zzed) it.next()).zza(i, zzebVar2);
                }
            }
        });
    }

    public final void zzf() {
        zzi();
        ArrayDeque arrayDeque = this.zzf;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.zzc != null) {
            zzea zzeaVar = this.zzb;
            zzeaVar.getClass();
            if (!zzeaVar.zzb(1)) {
                zzeaVar.zzg(zzeaVar.zzc(1));
            }
        }
        ArrayDeque arrayDeque2 = this.zze;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void zzg() {
        zzi();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzed) it.next()).zzc(this.zzc);
        }
        copyOnWriteArraySet.clear();
    }

    final /* synthetic */ boolean zzh(Message message) {
        zzec zzecVar = this.zzc;
        zzecVar.getClass();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzed) it.next()).zzb(zzecVar);
            zzea zzeaVar = this.zzb;
            zzeaVar.getClass();
            if (zzeaVar.zzb(1)) {
                break;
            }
        }
        return true;
    }

    public zzeg(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    private zzeg(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, zzdp zzdpVar, zzec zzecVar, boolean z) {
        this.zza = thread;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzecVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = (looper == null || zzdpVar == null || zzecVar == null) ? null : zzdpVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzef
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                zzeg.this.zzh(message);
                return true;
            }
        });
        this.zzi = z;
    }

    public final void zzc(Object obj) {
        obj.getClass();
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzed(obj));
        }
    }
}
