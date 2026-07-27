package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdwk extends zzcyl {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdom zze;
    private final zzdla zzf;
    private final zzdec zzg;
    private final zzdfj zzh;
    private final zzczg zzi;
    private final zzccx zzj;
    private final zzfys zzk;
    private final zzflq zzl;
    private final zzeaj zzm;
    private boolean zzn;

    zzdwk(zzcyk zzcykVar, Context context, zzclm zzclmVar, zzdom zzdomVar, zzdla zzdlaVar, zzdec zzdecVar, zzdfj zzdfjVar, zzczg zzczgVar, zzfld zzfldVar, zzfys zzfysVar, zzflq zzflqVar, zzeaj zzeajVar) {
        super(zzcykVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdomVar;
        this.zzd = new WeakReference(zzclmVar);
        this.zzf = zzdlaVar;
        this.zzg = zzdecVar;
        this.zzh = zzdfjVar;
        this.zzi = zzczgVar;
        this.zzk = zzfysVar;
        zzcct zzcctVar = zzfldVar.zzl;
        this.zzj = new zzcdr(zzcctVar != null ? zzcctVar.zza : "", zzcctVar != null ? zzcctVar.zzb : 1);
        this.zzl = zzflqVar;
        this.zzm = zzeajVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzclm zzclmVar = (zzclm) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhM)).booleanValue()) {
                if (!this.zzn && zzclmVar != null) {
                    zzhdi zzhdiVar = zzcgj.zzf;
                    Objects.requireNonNull(zzclmVar);
                    zzhdiVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclm.this.destroy();
                        }
                    });
                }
            } else if (zzclmVar != null) {
                zzclmVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    public final boolean zza(boolean z, Activity activity) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdom zzdomVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdomVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpt)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbt)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzfmy.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdla zzdlaVar = this.zzf;
        zzdlaVar.zza();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            zzdomVar.zza(z, activity2, this.zzg);
            zzdlaVar.zzb();
            return true;
        } catch (zzdol e) {
            this.zzg.zzd(e);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzccx zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzclm zzclmVar = (zzclm) this.zzd.get();
        return (zzclmVar == null || zzclmVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzflq zzh() {
        return this.zzl;
    }
}
