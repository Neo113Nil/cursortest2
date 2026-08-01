package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzczp {
    private final zzegq zza;
    private final zzflw zzb;
    private final zzfqi zzc;
    private final zzcsj zzd;
    private final zzeqi zze;
    private final zzdje zzf;
    private zzflo zzg;
    private final zzeib zzh;
    private final zzdcu zzi;
    private final Executor zzj;
    private final zzehm zzk;
    private final zzemv zzl;

    zzczp(zzegq zzegqVar, zzflw zzflwVar, zzfqi zzfqiVar, zzcsj zzcsjVar, zzeqi zzeqiVar, zzdje zzdjeVar, zzflo zzfloVar, zzeib zzeibVar, zzdcu zzdcuVar, Executor executor, zzehm zzehmVar, zzemv zzemvVar) {
        this.zza = zzegqVar;
        this.zzb = zzflwVar;
        this.zzc = zzfqiVar;
        this.zzd = zzcsjVar;
        this.zze = zzeqiVar;
        this.zzf = zzdjeVar;
        this.zzg = zzfloVar;
        this.zzh = zzeibVar;
        this.zzi = zzdcuVar;
        this.zzj = executor;
        this.zzk = zzehmVar;
        this.zzl = zzemvVar;
    }

    public final ListenableFuture zza(ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            zzfqi zzfqiVar = this.zzc;
            zzfqc zzfqcVar = zzfqc.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfqiVar);
            return zzfpt.zza(zzhcy.zza(this.zzg), zzfqcVar, zzfqiVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfpz zza = this.zzc.zza(zzfqc.SERVER_TRANSACTION, listenableFuture);
        final zzehm zzehmVar = this.zzk;
        Objects.requireNonNull(zzehmVar);
        return zza.zzc(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzczo
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzehm.this.zza((zzcbv) obj);
            }
        }).zzi();
    }

    public final ListenableFuture zzb() {
        zzflw zzflwVar = this.zzb;
        if (!zzflwVar.zzv) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.zzd;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                zzfqi zzfqiVar = this.zzc;
                zzfqc zzfqcVar = zzfqc.PRELOADED_LOADER;
                Objects.requireNonNull(zzfqiVar);
                return zzfpt.zza(this.zza.zza(), zzfqcVar, zzfqiVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final ListenableFuture zzc(ListenableFuture listenableFuture) {
        zzfpz zzc = this.zzc.zza(zzfqc.RENDERER, listenableFuture).zzb(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final /* synthetic */ Object zza(Object obj) {
                zzflo zzfloVar = (zzflo) obj;
                zzczp.this.zzi(zzfloVar);
                return zzfloVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgI)).booleanValue()) {
            zzc = zzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgJ)).intValue(), TimeUnit.SECONDS);
        }
        return zzc.zzi();
    }

    public final zzdje zzd() {
        return this.zzf;
    }

    public final ListenableFuture zze(final zzfns zzfnsVar) {
        zzfpp zzi = this.zzc.zza(zzfqc.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzczm
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzczp.this.zzj(zzfnsVar, (zzcbv) obj);
            }
        }).zzi();
        zzhcy.zzr(zzi, new zzczk(this), this.zzj);
        return zzi;
    }

    public final ListenableFuture zzf(zzcbv zzcbvVar) {
        zzfpp zzi = this.zzc.zza(zzfqc.NOTIFY_CACHE_HIT, this.zzh.zzb(zzcbvVar)).zzi();
        zzhcy.zzr(zzi, new zzczl(this), this.zzj);
        return zzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th) {
        return zzfmy.zzb(th, this.zzl);
    }

    public final void zzh(zzflo zzfloVar) {
        this.zzg = zzfloVar;
    }

    final /* synthetic */ zzflo zzi(zzflo zzfloVar) {
        this.zzd.zza(zzfloVar);
        return zzfloVar;
    }

    final /* synthetic */ ListenableFuture zzj(zzfns zzfnsVar, zzcbv zzcbvVar) {
        zzcbvVar.zzi = zzfnsVar;
        return this.zzh.zza(zzcbvVar);
    }

    final /* synthetic */ zzdje zzk() {
        return this.zzf;
    }
}
