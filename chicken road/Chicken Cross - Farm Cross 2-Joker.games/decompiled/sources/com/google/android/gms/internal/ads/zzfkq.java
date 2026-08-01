package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfkq implements zzeuq {
    private final Context zza;
    private final Executor zzb;
    private final zzcob zzc;
    private final zzfkh zzd;
    private final zzfiu zze;
    private final zzflp zzf;
    private final zzfrj zzg;
    private final zzflv zzh;
    private ListenableFuture zzi;

    public zzfkq(Context context, Executor executor, zzcob zzcobVar, zzfiu zzfiuVar, zzfkh zzfkhVar, zzflv zzflvVar, zzflp zzflpVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcobVar;
        this.zze = zzfiuVar;
        this.zzd = zzfkhVar;
        this.zzh = zzflvVar;
        this.zzf = zzflpVar;
        this.zzg = zzcobVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdwo zze(zzfis zzfisVar) {
        zzdwo zzp = this.zzc.zzp();
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.zza(this.zza);
        zzdcyVar.zzb(((zzfkp) zzfisVar).zza);
        zzdcyVar.zzf(this.zzf);
        zzp.zzd(zzdcyVar.zze());
        zzp.zze(new zzdjo().zzn());
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) throws RemoteException {
        zzfrg zzfrgVar;
        zzcco zzccoVar = new zzcco(zzmVar, str);
        String str2 = zzccoVar.zzb;
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfko
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfkq.this.zzc();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            zzfiu zzfiuVar = this.zze;
            if (zzfiuVar.zzd() != null) {
                zzfrg zzd = ((zzdwp) zzfiuVar.zzd()).zzd();
                zzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzccoVar.zza;
                zzd.zzc(zzmVar2.zzp);
                zzd.zzd(zzmVar2.zzm);
                zzfrgVar = zzd;
                Context context = this.zza;
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzccoVar.zza;
                boolean z = zzmVar3.zzf;
                zzfmt.zzb(context, z);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue() && z) {
                    this.zzc.zzw().zzc(true);
                }
                Bundle zza = zzdzu.zza(new Pair(zzdzs.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz)), new Pair(zzdzs.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzflv zzflvVar = this.zzh;
                zzflvVar.zzg(str2);
                zzflvVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
                zzflvVar.zza(zzmVar3);
                zzflvVar.zzv(zza);
                zzflw zzB = zzflvVar.zzB();
                zzfqw zzo = zzfqw.zzo(context, zzfrf.zzg(zzB), 5, zzmVar3);
                zzfkp zzfkpVar = new zzfkp(null);
                zzfkpVar.zza = zzB;
                ListenableFuture zzc = this.zze.zzc(new zzfiv(zzfkpVar, null), new zzfit() { // from class: com.google.android.gms.internal.ads.zzfkn
                    @Override // com.google.android.gms.internal.ads.zzfit
                    public final /* synthetic */ zzdcw zza(zzfis zzfisVar) {
                        return zzfkq.this.zzd(zzfisVar);
                    }
                }, null);
                this.zzi = zzc;
                zzhcy.zzr(zzc, new zzfkm(this, zzeupVar, zzfrgVar, zzo, zzfkpVar), this.zzb);
                return true;
            }
        }
        zzfrgVar = null;
        Context context2 = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar32 = zzccoVar.zza;
        boolean z2 = zzmVar32.zzf;
        zzfmt.zzb(context2, z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue()) {
            this.zzc.zzw().zzc(true);
        }
        Bundle zza2 = zzdzu.zza(new Pair(zzdzs.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar32.zzz)), new Pair(zzdzs.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzflv zzflvVar2 = this.zzh;
        zzflvVar2.zzg(str2);
        zzflvVar2.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzflvVar2.zza(zzmVar32);
        zzflvVar2.zzv(zza2);
        zzflw zzB2 = zzflvVar2.zzB();
        zzfqw zzo2 = zzfqw.zzo(context2, zzfrf.zzg(zzB2), 5, zzmVar32);
        zzfkp zzfkpVar2 = new zzfkp(null);
        zzfkpVar2.zza = zzB2;
        ListenableFuture zzc2 = this.zze.zzc(new zzfiv(zzfkpVar2, null), new zzfit() { // from class: com.google.android.gms.internal.ads.zzfkn
            @Override // com.google.android.gms.internal.ads.zzfit
            public final /* synthetic */ zzdcw zza(zzfis zzfisVar) {
                return zzfkq.this.zzd(zzfisVar);
            }
        }, null);
        this.zzi = zzc2;
        zzhcy.zzr(zzc2, new zzfkm(this, zzeupVar, zzfrgVar, zzo2, zzfkpVar2), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdJ(zzfmy.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzfkh zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzfiu zzh() {
        return this.zze;
    }

    final /* synthetic */ zzfrj zzi() {
        return this.zzg;
    }

    final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
