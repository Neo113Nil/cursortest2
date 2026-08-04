package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzaaq implements zzcb {
    private final Context zza;
    private final zzej zzb = new zzej(10);
    private final zzbi zzc;
    private final SparseArray zzd;
    private final List zze;
    private final zzbx zzf;
    private final zzabo zzg;
    private final zzcz zzh;
    private final CopyOnWriteArraySet zzi;
    private zzdj zzj;
    private Pair zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;

    public /* synthetic */ zzaaq(zzaak zzaakVar, zzaap zzaapVar) {
        this.zza = zzaakVar.zza;
        zzbi zzbiVar = zzaakVar.zzd;
        zzcv.zzb(zzbiVar);
        this.zzc = zzbiVar;
        this.zzd = new SparseArray();
        this.zze = zzaakVar.zze;
        this.zzf = zzaakVar.zzf;
        zzcz zzczVar = zzaakVar.zzg;
        this.zzh = zzczVar;
        this.zzg = new zzzw(zzaakVar.zzb, zzczVar);
        this.zzi = new CopyOnWriteArraySet();
        new zzx().zzaj();
        this.zzn = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
        this.zzq = -1;
        this.zzm = 0;
    }

    public static /* bridge */ /* synthetic */ zzca zzb(zzaaq zzaaqVar, zzz zzzVar, int i7) throws zzabn {
        zzcv.zzf(zzaaqVar.zzm == 0);
        zzk zzkVarZzt = zzt(zzzVar.zzC);
        if (zzkVarZzt.zzd == 7 && zzen.zza < 34) {
            zzi zziVarZzc = zzkVarZzt.zzc();
            zziVarZzc.zzd(6);
            zzkVarZzt = zziVarZzc.zzg();
        }
        zzk zzkVar = zzkVarZzt;
        zzcz zzczVar = zzaaqVar.zzh;
        Looper looperMyLooper = Looper.myLooper();
        zzcv.zzb(looperMyLooper);
        final zzdj zzdjVarZzd = zzczVar.zzd(looperMyLooper, null);
        zzaaqVar.zzj = zzdjVarZzd;
        try {
            zzbi zzbiVar = zzaaqVar.zzc;
            Context context = zzaaqVar.zza;
            zzn zznVar = zzn.zza;
            Objects.requireNonNull(zzdjVarZzd);
            zzbiVar.zza(context, zzkVar, zznVar, zzaaqVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzaai
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdjVarZzd.zzh(runnable);
                }
            }, zzaaqVar.zzf, zzaaqVar.zze, 0L);
            throw null;
        } catch (zzby e7) {
            throw new zzabn(e7, zzzVar);
        }
    }

    public static /* synthetic */ void zzg(zzaaq zzaaqVar) {
        zzaaqVar.zzl--;
    }

    public static /* bridge */ /* synthetic */ void zzi(final zzaaq zzaaqVar, boolean z4) {
        zzej zzejVar;
        if (zzaaqVar.zzm == 1) {
            zzaaqVar.zzl++;
            zzaaqVar.zzg.zze(z4);
            while (true) {
                zzejVar = zzaaqVar.zzb;
                if (zzejVar.zza() <= 1) {
                    break;
                } else {
                    zzejVar.zzb();
                }
            }
            if (zzejVar.zza() == 1) {
                Long l7 = (Long) zzejVar.zzb();
                l7.getClass();
                zzaaqVar.zzg.zzo(l7.longValue(), zzaaqVar.zzp);
            }
            zzaaqVar.zzn = -9223372036854775807L;
            zzaaqVar.zzo = -9223372036854775807L;
            zzdj zzdjVar = zzaaqVar.zzj;
            zzcv.zzb(zzdjVar);
            zzdjVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaj
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaq.zzg(this.zza);
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(zzaaq zzaaqVar, long j) {
        zzaaqVar.zzp = j;
        zzaaqVar.zzg.zzo(0L, j);
    }

    public static /* bridge */ /* synthetic */ boolean zzs(zzaaq zzaaqVar) {
        int i7 = zzaaqVar.zzq;
        return i7 != -1 && i7 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzk zzt(zzk zzkVar) {
        return (zzkVar == null || !zzkVar.zzf()) ? zzk.zza : zzkVar;
    }

    public final zzabo zze(int i7) {
        zzcv.zzf(!zzen.zzH(this.zzd, 0));
        zzaal zzaalVar = new zzaal(this, this.zza, 0);
        this.zzi.add(zzaalVar);
        this.zzd.put(0, zzaalVar);
        return zzaalVar;
    }

    public final void zzn() {
        zzee zzeeVar = zzee.zza;
        zzeeVar.zzb();
        zzeeVar.zza();
        this.zzk = null;
    }

    public final void zzo() {
        if (this.zzm == 2) {
            return;
        }
        zzdj zzdjVar = this.zzj;
        if (zzdjVar != null) {
            zzdjVar.zze(null);
        }
        this.zzk = null;
        this.zzm = 2;
    }

    public final void zzp(Surface surface, zzee zzeeVar) {
        Pair pair = this.zzk;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzee) this.zzk.second).equals(zzeeVar)) {
            return;
        }
        this.zzk = Pair.create(surface, zzeeVar);
        zzeeVar.zzb();
        zzeeVar.zza();
    }

    public final void zzq(int i7) {
        this.zzq = 1;
    }
}
