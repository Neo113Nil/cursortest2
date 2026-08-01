package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzfvd {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfms zzd;
    protected AtomicReference zze;
    protected final zzftp zzf;
    protected AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzce zzh;
    protected final ScheduledExecutorService zzi;
    private com.google.android.gms.ads.internal.client.zzcb zzj;
    private final Queue zzk;
    private final zzfty zzl;
    private final String zzm;
    private AtomicBoolean zzn;
    private final zzfpm zzo;
    private AtomicBoolean zzp;
    private zzfuf zzq;
    private final Clock zzr;
    private final zzfum zzs;

    public zzfvd(ClientApi clientApi, Context context, int i, zzfms zzfmsVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock) {
        this("none", clientApi, context, i, zzfmsVar, zzfpVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock, null);
        this.zzj = zzcbVar;
    }

    private final void zzR(boolean z) {
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null) {
            if (z) {
                this.zzl.zzc();
            }
            zzftpVar.zza(this);
        } else {
            zzfty zzftyVar = this.zzl;
            if (zzftyVar.zze()) {
                return;
            }
            if (z) {
                zzftyVar.zzc();
            }
            this.zzi.schedule(new zzfur(this), zzftyVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzS, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzF() {
        boolean z;
        int i;
        int i2;
        Queue queue = this.zzk;
        synchronized (queue) {
            Iterator it = queue.iterator();
            z = false;
            i = 0;
            while (it.hasNext()) {
                if (((zzfuo) it.next()).zzb()) {
                    it.remove();
                    i++;
                }
            }
            if (i > 0 && queue.isEmpty()) {
                z = true;
            }
            i2 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
        }
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null && i > 0) {
            zzftpVar.zzd(this, i2);
        }
        if (z) {
            zzT();
        }
    }

    private final void zzT() {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfuv(this));
        }
        this.zzi.execute(new zzfuw(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final String zzM() {
        return true != "none".equals(this.zzm) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzV(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar instanceof zzddi) {
            return ((zzddi) zzdxVar).zzd();
        }
        return null;
    }

    protected final void zzA(final int i) {
        int size;
        zzftp zzftpVar;
        boolean z = true;
        int i2 = 0;
        Preconditions.checkArgument(i > 0);
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) this.zze.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.zzfuy
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return ((com.google.android.gms.ads.internal.client.zzfp) obj).zza(i);
            }
        });
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        int i3 = zzfpVar.zzd;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
            if (queue.size() > i) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzB)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    while (i2 < i) {
                        zzfuo zzfuoVar = (zzfuo) queue.poll();
                        if (zzfuoVar != null) {
                            arrayList.add(zzfuoVar);
                        }
                        i2++;
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    i2 = arrayList.size();
                }
            }
            z = false;
        }
        if (z && size > i2 && (zzftpVar = this.zzf) != null) {
            int i4 = size - i2;
            if (i2 == 0) {
                i4--;
            }
            zzftpVar.zzd(this, i4);
        }
        zzfuf zzfufVar = this.zzq;
        if (zzfufVar == null || adFormat == null) {
            return;
        }
        zzfufVar.zzc(i3, i, this.zzr.currentTimeMillis(), new zzfum(new zzful(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, adFormat), null));
    }

    protected final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzG)).booleanValue()) {
            Bundle bundle = zzmVar.zzC;
            bundle.putInt("plcs", zzt());
            bundle.putInt("plbs", zzs());
            bundle.putString("plid", this.zzm);
        }
    }

    final long zzC() {
        long zzb = zzb();
        if (zzb >= 0) {
            return zzb;
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzU)).longValue();
    }

    final /* synthetic */ void zzD(int i, zzfuo zzfuoVar, zzfuo zzfuoVar2, long j, int i2, int i3, boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzQ)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzP)).booleanValue()) {
                this.zzl.zza();
            } else if (i == 1) {
                this.zzl.zza();
            }
        }
        if (zzfuoVar != null && zzfuoVar2 != null) {
            AdFormat adFormat = AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
            String zzV = zzV(zzc(zzfuoVar.zza()));
            if (adFormat != null && zzV != null && zzfuoVar2.zzd() < zzfuoVar.zzd()) {
                this.zzq.zzg(j, i2, i3, zzV, this.zzs, zzM());
            }
        }
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null) {
            zzftpVar.zzb(this);
        } else {
            long zzC = zzC();
            if (zzC > 0) {
                this.zzi.schedule(new zzfur(this), zzC, TimeUnit.MILLISECONDS);
            } else {
                zzy();
            }
        }
        if (z) {
            zzT();
        }
    }

    final /* synthetic */ void zzG(Object obj) {
        if (obj != null) {
            this.zzl.zza();
            com.google.android.gms.ads.internal.client.zzdx zzc = zzc(obj);
            double zzk = !(zzc instanceof zzddi) ? 0.0d : ((zzddi) zzc).zzk();
            com.google.android.gms.ads.internal.client.zzdx zzc2 = zzc(obj);
            zzfuo zzfuoVar = new zzfuo(obj, this.zzr, zzk, zzc2 instanceof zzddi ? ((zzddi) zzc2).zzl() : 2);
            Queue queue = this.zzk;
            synchronized (queue) {
                queue.add(zzfuoVar);
            }
            com.google.android.gms.ads.internal.client.zzdx zzc3 = zzc(obj);
            long currentTimeMillis = this.zzr.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfus(this, zzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzi;
            scheduledExecutorService.execute(new zzfut(this, currentTimeMillis, zzc3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzI)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvb
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfvd.this.zzF();
                        }
                    }, zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfva
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfvd.this.zzE();
                        }
                    }, zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzI)).booleanValue()) {
                    this.zzo.zzb(new zzfur(this), zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new zzfur(this), zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                }
            }
        }
        this.zzn.set(false);
        if (obj == null || this.zzf == null) {
            zzR(obj == null);
        }
    }

    final /* synthetic */ void zzH(Throwable th) {
        this.zzn.set(false);
        if ((th instanceof zzftq) && ((zzftq) th).zza() == 0) {
            throw null;
        }
        zzR(true);
    }

    final /* synthetic */ void zzI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfuu(this, zzeVar));
        }
        this.zzn.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzR(true);
            return;
        }
        int i2 = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb;
        String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26 + String.valueOf(str).length() + 61);
        sb.append("Preloading ");
        sb.append(i2);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb2 = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        this.zzg.set(false);
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null) {
            zzftpVar.zza(this);
        }
        zzful zzfulVar = new zzful(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzq());
        zzfulVar.zza(this.zzm);
        this.zzq.zzk(this.zzr.currentTimeMillis(), new zzfum(zzfulVar, null), zzeVar, zzs(), zzt(), zzM());
    }

    final /* synthetic */ void zzJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzg(this.zzm, zzeVar);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    final /* synthetic */ void zzK(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zze((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zzm, zzdxVar);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    final /* synthetic */ void zzL() {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zzf((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zzm);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    final /* synthetic */ zzfuf zzN() {
        return this.zzq;
    }

    final /* synthetic */ Clock zzO() {
        return this.zzr;
    }

    final /* synthetic */ zzfum zzP() {
        return this.zzs;
    }

    protected abstract ListenableFuture zza(Context context);

    protected long zzb() {
        throw null;
    }

    protected abstract com.google.android.gms.ads.internal.client.zzdx zzc(Object obj);

    public final zzfvd zzd() {
        this.zzi.submit(new zzfur(this));
        return this;
    }

    public final void zze() {
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfvd.this.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        boolean isEmpty;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzO)).booleanValue()) {
            this.zzl.zza();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzH)).booleanValue() && this.zzf == null) {
            zzy();
        } else {
            zzF();
        }
        Queue queue = this.zzk;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        return !isEmpty;
    }

    public final Object zzg() {
        final zzfuo zzfuoVar;
        final boolean z;
        final zzfuo zzfuoVar2;
        Queue queue = this.zzk;
        final int zzt = zzt();
        synchronized (queue) {
            zzfuoVar = (zzfuo) queue.poll();
            boolean z2 = false;
            if (zzfuoVar != null && queue.isEmpty()) {
                z2 = true;
            }
            z = z2;
            zzfuoVar2 = (zzfuoVar == null || queue.isEmpty()) ? null : (zzfuo) queue.peek();
        }
        final long currentTimeMillis = this.zzr.currentTimeMillis();
        final int zzs = zzs();
        final int zzt2 = zzt();
        this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfux
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvd.this.zzD(zzt, zzfuoVar, zzfuoVar2, currentTimeMillis, zzs, zzt2, z);
            }
        });
        if (zzfuoVar == null) {
            return null;
        }
        return zzfuoVar.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        zzftp zzftpVar = this.zzf;
        if (zzftpVar == null) {
            this.zzi.submit(new zzfur(this));
        } else {
            zzftpVar.zzd(this, 0);
        }
    }

    public final boolean zzk(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).equals(zzfpVar);
    }

    public final String zzl() {
        zzfuo zzfuoVar;
        Queue queue = this.zzk;
        synchronized (queue) {
            zzfuoVar = (zzfuo) queue.peek();
        }
        Object zza = zzfuoVar == null ? null : zzfuoVar.zza();
        return zzV(zza != null ? zzc(zza) : null);
    }

    public final void zzm(zzfuf zzfufVar) {
        this.zzq = zzfufVar;
    }

    public final void zzn(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzl.zzf(i);
    }

    protected final com.google.android.gms.ads.internal.client.zzfp zzo() {
        return (com.google.android.gms.ads.internal.client.zzfp) this.zze.get();
    }

    protected final String zzp() {
        return this.zzm;
    }

    protected final AdFormat zzq() {
        return AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
    }

    protected final String zzr() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
    }

    protected final int zzs() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd;
    }

    protected final int zzt() {
        int size;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    protected final boolean zzu() {
        if (!this.zzg.get() || this.zzn.get() || zzt() >= zzs()) {
            return false;
        }
        zzfty zzftyVar = this.zzl;
        return (zzftyVar.zzd() || zzftyVar.zze()) ? false : true;
    }

    protected final void zzv() {
        Queue queue = this.zzk;
        synchronized (queue) {
            queue.clear();
        }
    }

    protected final boolean zzw() {
        return this.zzn.get();
    }

    protected final int zzx() {
        int zzt = zzt();
        int i = zzt - 1;
        if (!this.zzn.get()) {
            zzt = i;
        }
        return Math.max(zzt, 0);
    }

    protected final void zzy() {
        zzF();
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                zzz();
            }
        }
    }

    protected final void zzz() {
        ListenableFuture zza;
        Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (zzd == null) {
            String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(valueOf));
            zza = zza(this.zzb);
        } else {
            zza = zza(zzd);
        }
        zzhcy.zzr(zza, new zzfup(this), this.zzi);
    }

    public zzfvd(String str, ClientApi clientApi, Context context, int i, zzfms zzfmsVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock, zzftp zzftpVar) {
        this(str, clientApi, context, i, zzfmsVar, zzfpVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock, zzftpVar);
        this.zzh = zzceVar;
    }

    private zzfvd(String str, ClientApi clientApi, Context context, int i, zzfms zzfmsVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock, zzftp zzftpVar) {
        Queue priorityQueue;
        this.zzm = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfmsVar;
        this.zze = new AtomicReference(zzfpVar);
        int max = Math.max(1, zzfpVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzag)).booleanValue()) {
            priorityQueue = new zzfvg();
        } else {
            priorityQueue = new PriorityQueue(max, zzfuz.zza);
        }
        this.zzk = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzn = new AtomicBoolean(false);
        this.zzi = scheduledExecutorService;
        this.zzo = zzfpmVar;
        this.zzl = zzftyVar;
        this.zzp = new AtomicBoolean(true);
        this.zzr = clock;
        zzful zzfulVar = new zzful(zzfpVar.zza, AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb));
        zzfulVar.zza(str);
        this.zzs = new zzfum(zzfulVar, null);
        this.zzf = zzftpVar;
    }
}
