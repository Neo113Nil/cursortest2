package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdvm extends com.google.android.gms.internal.ads.zzcxt {
    private final android.content.Context zzc;
    private final java.lang.ref.WeakReference zzd;
    private final com.google.android.gms.internal.ads.zzdno zze;
    private final com.google.android.gms.internal.ads.zzdkc zzf;
    private final com.google.android.gms.internal.ads.zzdde zzg;
    private final com.google.android.gms.internal.ads.zzdel zzh;
    private final com.google.android.gms.internal.ads.zzcyo zzi;
    private final com.google.android.gms.internal.ads.zzccf zzj;
    private final com.google.android.gms.internal.ads.zzfxq zzk;
    private final com.google.android.gms.internal.ads.zzfks zzl;
    private final com.google.android.gms.internal.ads.zzdzl zzm;
    private boolean zzn;

    zzdvm(com.google.android.gms.internal.ads.zzcxs zzcxsVar, android.content.Context context, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzdno zzdnoVar, com.google.android.gms.internal.ads.zzdkc zzdkcVar, com.google.android.gms.internal.ads.zzdde zzddeVar, com.google.android.gms.internal.ads.zzdel zzdelVar, com.google.android.gms.internal.ads.zzcyo zzcyoVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfxq zzfxqVar, com.google.android.gms.internal.ads.zzfks zzfksVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        super(zzcxsVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdnoVar;
        this.zzd = new java.lang.ref.WeakReference(zzckuVar);
        this.zzf = zzdkcVar;
        this.zzg = zzddeVar;
        this.zzh = zzdelVar;
        this.zzi = zzcyoVar;
        this.zzk = zzfxqVar;
        com.google.android.gms.internal.ads.zzccb zzccbVar = zzfkfVar.zzl;
        this.zzj = new com.google.android.gms.internal.ads.zzccz(zzccbVar != null ? zzccbVar.zza : "", zzccbVar != null ? zzccbVar.zzb : 1);
        this.zzl = zzfksVar;
        this.zzm = zzdzlVar;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            final com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) this.zzd.get();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhG)).booleanValue()) {
                if (!this.zzn && zzckuVar != null) {
                    com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
                    java.util.Objects.requireNonNull(zzckuVar);
                    zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdvl
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
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    public final boolean zza(boolean z, android.app.Activity activity) {
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.internal.ads.zzdno zzdnoVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdnoVar.zzb())) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpc)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzm);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbm)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbn)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(com.google.android.gms.internal.ads.zzfma.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        com.google.android.gms.internal.ads.zzdkc zzdkcVar = this.zzf;
        zzdkcVar.zza();
        android.app.Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            zzdnoVar.zza(z, activity2, this.zzg);
            zzdkcVar.zzb();
            return true;
        } catch (com.google.android.gms.internal.ads.zzdnn e) {
            this.zzg.zzd(e);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final com.google.android.gms.internal.ads.zzccf zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) this.zzd.get();
        return (zzckuVar == null || zzckuVar.zzaB()) ? false : true;
    }

    public final android.os.Bundle zzg() {
        return this.zzh.zzb();
    }

    public final com.google.android.gms.internal.ads.zzfks zzh() {
        return this.zzl;
    }
}
