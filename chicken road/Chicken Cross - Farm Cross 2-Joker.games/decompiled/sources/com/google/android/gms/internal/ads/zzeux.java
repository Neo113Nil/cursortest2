package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeux implements zzeuq {
    private final zzflv zza;
    private final zzcob zzb;
    private final Context zzc;
    private final zzeun zzd;
    private final zzfrj zze;
    private zzcza zzf;

    public zzeux(zzcob zzcobVar, Context context, zzeun zzeunVar, zzflv zzflvVar) {
        this.zzb = zzcobVar;
        this.zzc = context;
        this.zzd = zzeunVar;
        this.zza = zzflvVar;
        this.zze = zzcobVar.zzx();
        zzflvVar.zzt(zzeunVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) throws RemoteException {
        zzfrg zzfrgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeux.this.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeux.this.zzd();
                }
            });
            return false;
        }
        boolean z = zzmVar.zzf;
        zzfmt.zzb(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue() && z) {
            this.zzb.zzw().zzc(true);
        }
        int i3 = ((zzeur) zzeuoVar).zza;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String zza = zzdzs.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(currentTimeMillis);
        Bundle zza2 = zzdzu.zza(new Pair(zza, valueOf), new Pair(zzdzs.DYNAMITE_ENTER.zza(), valueOf));
        zzflv zzflvVar = this.zza;
        zzflvVar.zza(zzmVar);
        zzflvVar.zzv(zza2);
        zzflvVar.zzl(i3);
        zzflw zzB = zzflvVar.zzB();
        zzfqw zzo = zzfqw.zzo(context, zzfrf.zzg(zzB), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcl zzclVar = zzB.zzo;
        if (zzclVar != null) {
            this.zzd.zzc().zzo(zzclVar);
        }
        zzcob zzcobVar = this.zzb;
        zzdoz zzo2 = zzcobVar.zzo();
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.zza(context);
        zzdcyVar.zzb(zzB);
        zzo2.zzf(zzdcyVar.zze());
        zzdjo zzdjoVar = new zzdjo();
        zzeun zzeunVar = this.zzd;
        zzdjoVar.zze(zzeunVar.zzc(), zzcobVar.zzb());
        zzo2.zzg(zzdjoVar.zzn());
        zzo2.zze(zzeunVar.zzb());
        zzo2.zzd(new zzcwa(null));
        zzdpa zzh = zzo2.zzh();
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            zzfrg zzc = zzh.zzc();
            zzc.zzi(8);
            zzc.zzc(zzmVar.zzp);
            zzc.zzd(zzmVar.zzm);
            zzfrgVar = zzc;
        } else {
            zzfrgVar = null;
        }
        zzcobVar.zzv().zza(1);
        zzhdi zzc2 = zzfoy.zzc();
        ScheduledExecutorService zzc3 = zzcobVar.zzc();
        zzczp zza3 = zzh.zza();
        zzcza zzczaVar = new zzcza(zzc2, zzc3, zza3.zzc(zza3.zzb()));
        this.zzf = zzczaVar;
        zzczaVar.zza(new zzeuu(this, zzeupVar, zzfrgVar, zzo, zzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final boolean zzb() {
        zzcza zzczaVar = this.zzf;
        return zzczaVar != null && zzczaVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdJ(zzfmy.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdJ(zzfmy.zzd(6, null, null));
    }

    final /* synthetic */ zzcob zze() {
        return this.zzb;
    }

    final /* synthetic */ zzeun zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfrj zzg() {
        return this.zze;
    }
}
