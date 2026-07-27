package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdmx extends zzcyl {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdla zze;
    private final zzdom zzf;
    private final zzczg zzg;
    private final zzfys zzh;
    private final zzdec zzi;
    private final zzcga zzj;
    private final zzeaj zzk;
    private boolean zzl;

    zzdmx(zzcyk zzcykVar, Context context, @Nullable zzclm zzclmVar, zzdla zzdlaVar, zzdom zzdomVar, zzczg zzczgVar, zzfys zzfysVar, zzdec zzdecVar, zzcga zzcgaVar, zzeaj zzeajVar) {
        super(zzcykVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzclmVar);
        this.zze = zzdlaVar;
        this.zzf = zzdomVar;
        this.zzg = zzczgVar;
        this.zzh = zzfysVar;
        this.zzi = zzdecVar;
        this.zzj = zzcgaVar;
        this.zzk = zzeajVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzclm zzclmVar = (zzclm) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhM)).booleanValue()) {
                if (!this.zzl && zzclmVar != null) {
                    zzhdi zzhdiVar = zzcgj.zzf;
                    Objects.requireNonNull(zzclmVar);
                    zzhdiVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmw
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
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean zza(boolean z, @Nullable Activity activity) {
        zzfld zzC;
        zzdla zzdlaVar = this.zze;
        zzdlaVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdom zzdomVar = this.zzf;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdomVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpt)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbt)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        zzclm zzclmVar = (zzclm) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznC)).booleanValue() || zzclmVar == null || (zzC = zzclmVar.zzC()) == null || !zzC.zzar || zzC.zzas == this.zzj.zzj()) {
            if (this.zzl) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                this.zzi.zzc(zzfmy.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzl) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    zzdomVar.zza(z, activity2, this.zzi);
                    zzdlaVar.zzb();
                    this.zzl = true;
                    return true;
                } catch (zzdol e) {
                    this.zzi.zzd(e);
                }
            }
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
            this.zzi.zzc(zzfmy.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
