package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzftp {
    final AtomicBoolean zza = new AtomicBoolean(false);
    final Map zzb = new LinkedHashMap();
    final AtomicBoolean zzc = new AtomicBoolean(false);
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzfuf zzg;
    private final Clock zzh;

    public zzftp(com.google.android.gms.ads.internal.util.zzg zzgVar, ScheduledExecutorService scheduledExecutorService, zzfuf zzfufVar, Clock clock) {
        this.zzd = zzgVar;
        this.zzf = scheduledExecutorService;
        this.zzg = zzfufVar;
        this.zzh = clock;
    }

    private final boolean zzA(zzfvd zzfvdVar) {
        if (this.zza.get() || zzfvdVar.zzt() != 0 || !zzfvdVar.zzu()) {
            return false;
        }
        zzfvdVar.zze();
        return true;
    }

    private final int zzq() {
        int zzR = this.zzd.zzR();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzS)).booleanValue() && zzR > 0) {
            return zzR;
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzac)).intValue();
    }

    private static String zzr(String str, AdFormat adFormat) {
        return String.format("%s:%s", str, adFormat);
    }

    private final void zzs(final zzfvd zzfvdVar) {
        if (zzfvdVar.zzt() > 0 || zzfvdVar.zzw()) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzftp.this.zzi(zzfvdVar);
                }
            });
        }
        this.zza.set(true);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
        }
        this.zzc.set(true);
    }

    private final boolean zzt(zzfvd zzfvdVar) {
        boolean z;
        AdFormat zzq = zzfvdVar.zzq();
        if (zzq == null) {
            return true;
        }
        Map map = this.zzb;
        synchronized (map) {
            z = !map.containsKey(zzr(zzfvdVar.zzp(), zzq));
        }
        return z;
    }

    private final boolean zzu() {
        zzgxm zzq;
        Map map = this.zzb;
        synchronized (map) {
            zzq = zzgxm.zzq(map.values());
        }
        int size = zzq.size();
        for (int i = 0; i < size; i++) {
            zzfvd zzfvdVar = (zzfvd) zzq.get(i);
            if (zzfvdVar.zzt() == 0 && zzfvdVar.zzu()) {
                return true;
            }
        }
        return false;
    }

    private final void zzv(long j) {
        if (this.zzc.compareAndSet(false, true)) {
            synchronized (this) {
                if (j > 0) {
                    this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzftp.this.zzl();
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfti
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzftp.this.zzk();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzn() {
        zzfvd zzfvdVar;
        zzgxm zzq;
        if (this.zza.get()) {
            return;
        }
        synchronized (this) {
            zzfvdVar = null;
            this.zze = null;
        }
        int zzq2 = zzq();
        if (zzg() < zzq2 || zzu()) {
            Map map = this.zzb;
            synchronized (map) {
                zzq = zzgxm.zzq(map.values());
            }
            int size = zzq.size();
            double d = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                zzfvd zzfvdVar2 = (zzfvd) zzq.get(i);
                if (zzfvdVar2.zzu()) {
                    double zzt = zzfvdVar2.zzt() / zzfvdVar2.zzs();
                    if (zzt < d) {
                        d = zzt;
                    }
                    if (zzt < d) {
                        zzfvdVar = zzfvdVar2;
                    }
                }
            }
            if (zzfvdVar != null) {
                zzfvdVar.zze();
                if (zzfvdVar.zzt() > 0) {
                    this.zzg.zzq(this.zzh.currentTimeMillis(), zzfvdVar.zzp(), zzfvdVar.zzr(), zzfvdVar.zzq(), zzfvdVar.zzs(), zzfvdVar.zzt(), zzg(), zzq2);
                }
            }
            if (zzg() >= zzq2) {
                zzy();
            }
            if (zzg() < zzq2 || zzu()) {
                if (zzu()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftk
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzftp.this.zzm();
                        }
                    });
                    return;
                }
                synchronized (this) {
                    this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftl
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzftp.this.zzn();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzae)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            zzy();
        }
        this.zzc.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzx, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        this.zza.set(false);
        zzn();
    }

    private final void zzy() {
        int size;
        Map map = this.zzb;
        synchronized (map) {
            size = map.size();
        }
        this.zzg.zzs(this.zzh.currentTimeMillis(), zzq(), size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzj(zzfvd zzfvdVar, int i) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzfvdVar.zzp(), zzfvdVar.zzr(), zzfvdVar.zzq(), zzfvdVar.zzs(), zzfvdVar.zzt(), i, zzg(), zzq());
    }

    public final void zza(zzfvd zzfvdVar) {
        int i = 1;
        if (zzfvdVar.zzt() <= 0 && !zzfvdVar.zzw()) {
            i = 0;
        }
        zzd(zzfvdVar, i);
    }

    public final void zzb(zzfvd zzfvdVar) {
        if (zzt(zzfvdVar)) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzY)).booleanValue()) {
            zzs(zzfvdVar);
            return;
        }
        long zzC = zzfvdVar.zzC();
        if (zzC <= 0) {
            zza(zzfvdVar);
            return;
        }
        zzs(zzfvdVar);
        synchronized (this) {
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfto
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzftp.this.zzh();
                }
            }, zzC, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzc(zzfvd zzfvdVar, boolean z) {
        this.zzg.zzu(this.zzh.currentTimeMillis(), zzfvdVar.zzq(), zzfvdVar.zzp(), zzfvdVar.zzr(), z);
        zzh();
    }

    public final void zzd(final zzfvd zzfvdVar, final int i) {
        if (zzt(zzfvdVar)) {
            return;
        }
        if (i > 0) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfth
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzftp.this.zzj(zzfvdVar, i);
                }
            });
        }
        if (!zzA(zzfvdVar)) {
            zzv(0L);
        } else {
            zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzad)).longValue());
        }
    }

    public final void zze(String str, AdFormat adFormat, final zzfvd zzfvdVar) {
        Map map = this.zzb;
        String zzr = zzr(str, adFormat);
        synchronized (map) {
            if (map.containsKey(zzr)) {
                return;
            }
            map.put(zzr, zzfvdVar);
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzftp.this.zzo(zzfvdVar);
                }
            });
        }
    }

    public final void zzf(final zzfvd zzfvdVar) {
        AdFormat zzq = zzfvdVar.zzq();
        if (zzq == null) {
            return;
        }
        String zzr = zzr(zzfvdVar.zzp(), zzq);
        Map map = this.zzb;
        synchronized (map) {
            if (map.containsKey(zzr)) {
                map.remove(zzr);
                final int zzx = zzfvdVar.zzx();
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzftp.this.zzp(zzx, zzfvdVar);
                    }
                });
            }
        }
    }

    final int zzg() {
        zzgxm zzq;
        Map map = this.zzb;
        synchronized (map) {
            zzq = zzgxm.zzq(map.values());
        }
        int size = zzq.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zzfvd) zzq.get(i2)).zzx();
        }
        return i;
    }

    final /* synthetic */ void zzi(zzfvd zzfvdVar) {
        zzj(zzfvdVar, 1);
    }

    final /* synthetic */ void zzo(zzfvd zzfvdVar) {
        zzA(zzfvdVar);
        zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzad)).longValue());
    }

    final /* synthetic */ void zzp(int i, zzfvd zzfvdVar) {
        if (i > 0) {
            zzj(zzfvdVar, i);
        }
        zzv(0L);
    }
}
