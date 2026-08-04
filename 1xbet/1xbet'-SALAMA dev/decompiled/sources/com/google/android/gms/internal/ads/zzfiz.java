package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.F0;
import F2.Q;
import F2.S;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzfiz {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzboo zzd;
    protected com.google.android.gms.ads.internal.client.zzfq zze;
    private final S zzg;
    private final Queue zzh;
    private final zzfig zzi;
    private final ScheduledExecutorService zzk;
    private zzfil zzn;
    private final p090m3.a zzo;
    protected final AtomicBoolean zzf = new AtomicBoolean(true);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicBoolean zzl = new AtomicBoolean(true);
    private final AtomicBoolean zzm = new AtomicBoolean(false);

    public zzfiz(ClientApi clientApi, Context context, int i7, zzboo zzbooVar, com.google.android.gms.ads.internal.client.zzfq zzfqVar, S s7, ScheduledExecutorService scheduledExecutorService, zzfig zzfigVar, p090m3.a aVar) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i7;
        this.zzd = zzbooVar;
        this.zze = zzfqVar;
        this.zzg = s7;
        this.zzh = new PriorityQueue(Math.max(1, zzfqVar.f10732d), new zzfiy(this));
        this.zzk = scheduledExecutorService;
        this.zzi = zzfigVar;
        this.zzo = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzA() {
        if (this.zzl.get()) {
            try {
                S s7 = this.zzg;
                com.google.android.gms.ads.internal.client.zzfq zzfqVar = this.zze;
                Q q7 = (Q) s7;
                Parcel parcelZza = q7.zza();
                zzaxp.zzd(parcelZza, zzfqVar);
                q7.zzda(2, parcelZza);
            } catch (RemoteException unused) {
                int i7 = J.f3546b;
                j.g("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void zzB() {
        if (this.zzm.get() && this.zzh.isEmpty()) {
            this.zzm.set(false);
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfiv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzA();
                }
            });
            this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfiw
                @Override // java.lang.Runnable
                public final void run() {
                    zzfiz.zzi(this.zza);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.set(false);
        int i7 = zzeVar.f10720a;
        if (i7 != 1 && i7 != 8 && i7 != 10 && i7 != 11) {
            zzE(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzfq zzfqVar = this.zze;
        String str = "Preloading " + zzfqVar.f10730b + ", for adUnitId:" + zzfqVar.f10729a + ", Ad load failed. Stop preloading due to non-retriable error:";
        int i8 = J.f3546b;
        j.f(str);
        this.zzf.set(false);
    }

    private final synchronized void zzD() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((zzfir) it.next()).zzd()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzE(boolean z4) {
        try {
            if (this.zzi.zze()) {
                return;
            }
            if (z4) {
                this.zzi.zzb();
            }
            this.zzk.schedule(new zzfiu(this), this.zzi.zza(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final String zzF(F0 f7) {
        if (f7 instanceof zzcuj) {
            return ((zzcuj) f7).zzl();
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ double zzc(zzfiz zzfizVar, F0 f7) {
        if (f7 instanceof zzcuj) {
            return ((zzcuj) f7).zzc();
        }
        return 0.0d;
    }

    public static void zzi(zzfiz zzfizVar) {
        zzfil zzfilVar = zzfizVar.zzn;
        if (zzfilVar != null) {
            EnumC1058b enumC1058bA = EnumC1058b.a(zzfizVar.zze.f10730b);
            ((p090m3.b) zzfizVar.zzo).getClass();
            zzfilVar.zzd(enumC1058bA, System.currentTimeMillis());
        }
    }

    public static /* synthetic */ void zzk(zzfiz zzfizVar, long j, F0 f7) {
        zzfil zzfilVar = zzfizVar.zzn;
        if (zzfilVar != null) {
            zzfilVar.zzc(EnumC1058b.a(zzfizVar.zze.f10730b), j, zzF(f7));
        }
    }

    private final synchronized void zzw(Object obj) {
        zzfir zzfirVar = new zzfir(obj, this.zzo);
        this.zzh.add(zzfirVar);
        p090m3.a aVar = this.zzo;
        final F0 f0Zza = zza(obj);
        ((p090m3.b) aVar).getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfis
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzz();
            }
        });
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfit
            @Override // java.lang.Runnable
            public final void run() {
                zzfiz.zzk(this.zza, jCurrentTimeMillis, f0Zza);
            }
        });
        this.zzk.schedule(new zzfiu(this), zzfirVar.zza(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzx(Throwable th) {
        try {
            this.zzj.set(false);
            if ((th instanceof zzfic) && ((zzfic) th).zza() == 0) {
                throw null;
            }
            zzE(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzy(Object obj) {
        try {
            this.zzj.set(false);
            if (obj != null) {
                this.zzi.zzc();
                this.zzm.set(true);
                zzw(obj);
            }
            zzE(obj == null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzz() {
        if (this.zzl.get()) {
            try {
                S s7 = this.zzg;
                com.google.android.gms.ads.internal.client.zzfq zzfqVar = this.zze;
                Q q7 = (Q) s7;
                Parcel parcelZza = q7.zza();
                zzaxp.zzd(parcelZza, zzfqVar);
                q7.zzda(1, parcelZza);
            } catch (RemoteException unused) {
                int i7 = J.f3546b;
                j.g("Failed to call onAdsAvailable");
            }
        }
    }

    public abstract F0 zza(Object obj);

    public abstract I3.b zzb(Context context);

    public final synchronized zzfiz zzd() {
        this.zzk.submit(new zzfiu(this));
        return this;
    }

    public final synchronized Object zze() {
        zzfir zzfirVar = (zzfir) this.zzh.peek();
        if (zzfirVar == null) {
            return null;
        }
        return zzfirVar.zzc();
    }

    public final synchronized Object zzf() {
        try {
            this.zzi.zzc();
            zzfir zzfirVar = (zzfir) this.zzh.poll();
            this.zzm.set(zzfirVar != null);
            if (zzfirVar == null) {
                zzfirVar = null;
            } else if (!this.zzh.isEmpty()) {
                zzfir zzfirVar2 = (zzfir) this.zzh.peek();
                EnumC1058b enumC1058bA = EnumC1058b.a(this.zze.f10730b);
                String strZzF = zzF(zza(zzfirVar.zzc()));
                if (zzfirVar2 != null && enumC1058bA != null && strZzF != null && zzfirVar2.zzb() < zzfirVar.zzb()) {
                    zzfil zzfilVar = this.zzn;
                    ((p090m3.b) this.zzo).getClass();
                    zzfilVar.zzg(enumC1058bA, System.currentTimeMillis(), strZzF);
                }
            }
            zzp();
            if (zzfirVar == null) {
                return null;
            }
            return zzfirVar.zzc();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String zzg() {
        Object objZze;
        objZze = zze();
        return zzF(objZze == null ? null : zza(objZze));
    }

    public final void zzo() {
        this.zzh.clear();
    }

    public final synchronized void zzp() {
        I3.b bVarZzb;
        try {
            zzD();
            zzB();
            if (!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.f10732d) {
                this.zzj.set(true);
                Activity activityZza = o.f1952C.f1960f.zza();
                if (activityZza == null) {
                    String strValueOf = String.valueOf(this.zze.f10729a);
                    int i7 = J.f3546b;
                    j.g("Empty activity context at preloading: ".concat(strValueOf));
                    bVarZzb = zzb(this.zzb);
                } else {
                    bVarZzb = zzb(activityZza);
                }
                zzgbc.zzr(bVarZzb, new zzfix(this), this.zzk);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzq(int i7) {
        D.b(i7 >= 5);
        this.zzi.zzd(i7);
    }

    public final synchronized void zzr() {
        this.zzf.set(true);
        this.zzl.set(true);
        this.zzk.submit(new zzfiu(this));
    }

    public final void zzs(zzfil zzfilVar) {
        this.zzn = zzfilVar;
    }

    public final void zzt() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    public final void zzu(int i7) {
        D.b(i7 > 0);
        EnumC1058b enumC1058bA = EnumC1058b.a(this.zze.f10730b);
        int i8 = this.zze.f10732d;
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.client.zzfq zzfqVar = this.zze;
                this.zze = new com.google.android.gms.ads.internal.client.zzfq(zzfqVar.f10729a, zzfqVar.f10730b, zzfqVar.f10731c, i7 > 0 ? i7 : zzfqVar.f10732d);
                if (this.zzh.size() > i7) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzt)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i9 = 0; i9 < i7; i9++) {
                            zzfir zzfirVar = (zzfir) this.zzh.poll();
                            if (zzfirVar != null) {
                                arrayList.add(zzfirVar);
                            }
                        }
                        this.zzh.clear();
                        this.zzh.addAll(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfil zzfilVar = this.zzn;
        if (zzfilVar == null || enumC1058bA == null) {
            return;
        }
        ((p090m3.b) this.zzo).getClass();
        zzfilVar.zza(enumC1058bA, i8, i7, System.currentTimeMillis());
    }

    public final synchronized boolean zzv() {
        zzD();
        return !this.zzh.isEmpty();
    }
}
