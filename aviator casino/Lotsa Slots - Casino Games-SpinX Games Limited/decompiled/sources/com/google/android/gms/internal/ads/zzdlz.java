package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdlz extends com.google.android.gms.internal.ads.zzcxt {
    private final android.content.Context zzc;
    private final java.lang.ref.WeakReference zzd;
    private final com.google.android.gms.internal.ads.zzdkc zze;
    private final com.google.android.gms.internal.ads.zzdno zzf;
    private final com.google.android.gms.internal.ads.zzcyo zzg;
    private final com.google.android.gms.internal.ads.zzfxq zzh;
    private final com.google.android.gms.internal.ads.zzdde zzi;
    private final com.google.android.gms.internal.ads.zzcfi zzj;
    private final com.google.android.gms.internal.ads.zzdzl zzk;
    private boolean zzl;

    zzdlz(com.google.android.gms.internal.ads.zzcxs zzcxsVar, android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzdkc zzdkcVar, com.google.android.gms.internal.ads.zzdno zzdnoVar, com.google.android.gms.internal.ads.zzcyo zzcyoVar, com.google.android.gms.internal.ads.zzfxq zzfxqVar, com.google.android.gms.internal.ads.zzdde zzddeVar, com.google.android.gms.internal.ads.zzcfi zzcfiVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        super(zzcxsVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new java.lang.ref.WeakReference(zzckuVar);
        this.zze = zzdkcVar;
        this.zzf = zzdnoVar;
        this.zzg = zzcyoVar;
        this.zzh = zzfxqVar;
        this.zzi = zzddeVar;
        this.zzj = zzcfiVar;
        this.zzk = zzdzlVar;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            final com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) this.zzd.get();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhG)).booleanValue()) {
                if (!this.zzl && zzckuVar != null) {
                    com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
                    java.util.Objects.requireNonNull(zzckuVar);
                    zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdly
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzcku.this.destroy();
                        }
                    });
                }
            } else if (zzckuVar != null) {
                zzckuVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean zza(boolean z, @javax.annotation.Nullable android.app.Activity activity) {
        com.google.android.gms.internal.ads.zzfkf zzC;
        com.google.android.gms.internal.ads.zzdkc zzdkcVar = this.zze;
        zzdkcVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.internal.ads.zzdno zzdnoVar = this.zzf;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdnoVar.zzb())) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpc)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzk);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbm)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbn)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) this.zzd.get();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznr)).booleanValue() || zzckuVar == null || (zzC = zzckuVar.zzC()) == null || !zzC.zzar || zzC.zzas == this.zzj.zzj()) {
            if (this.zzl) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                this.zzi.zzc(com.google.android.gms.internal.ads.zzfma.zzd(10, null, null));
            }
            android.app.Activity activity2 = activity;
            if (!this.zzl) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    zzdnoVar.zza(z, activity2, this.zzi);
                    zzdkcVar.zzb();
                    this.zzl = true;
                    return true;
                } catch (com.google.android.gms.internal.ads.zzdnn e) {
                    this.zzi.zzd(e);
                }
            }
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
            this.zzi.zzc(com.google.android.gms.internal.ads.zzfma.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
