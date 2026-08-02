package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class zzdp {
    private final zzcz zza;
    private final zzdj zzb;
    private final zzdn zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzdp(Looper looper, zzcz zzczVar, zzdn zzdnVar) {
        this(new CopyOnWriteArraySet(), looper, zzczVar, zzdnVar, true);
    }

    public static /* synthetic */ boolean zzg(zzdp zzdpVar, Message message) {
        Iterator it = zzdpVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzdo) it.next()).zzb(zzdpVar.zzc);
            if (zzdpVar.zzb.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzcv.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzdp zza(Looper looper, zzdn zzdnVar) {
        return new zzdp(this.zzd, looper, this.zza, zzdnVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            try {
                if (this.zzh) {
                    return;
                }
                this.zzd.add(new zzdo(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(1)) {
            zzdj zzdjVar = this.zzb;
            zzdjVar.zzk(zzdjVar.zzb(1));
        }
        boolean isEmpty = this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (isEmpty) {
            while (!this.zze.isEmpty()) {
                ((Runnable) this.zze.peekFirst()).run();
                this.zze.removeFirst();
            }
        }
    }

    public final void zzd(final int i7, final zzdm zzdmVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdl
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdm zzdmVar2 = zzdmVar;
                    ((zzdo) it.next()).zza(i7, zzdmVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdo) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzdo zzdoVar = (zzdo) it.next();
            if (zzdoVar.zza.equals(obj)) {
                zzdoVar.zzc(this.zzc);
                this.zzd.remove(zzdoVar);
            }
        }
    }

    private zzdp(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzcz zzczVar, zzdn zzdnVar, boolean z4) {
        this.zza = zzczVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdnVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzczVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdk
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzdp.zzg(zzdp.this, message);
                return true;
            }
        });
        this.zzi = z4;
    }
}
