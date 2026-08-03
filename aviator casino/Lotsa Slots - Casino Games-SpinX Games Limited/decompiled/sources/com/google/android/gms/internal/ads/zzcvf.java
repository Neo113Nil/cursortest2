package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcvf extends com.google.android.gms.internal.ads.zzcxt {
    private final com.google.android.gms.internal.ads.zzcku zzc;
    private final int zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzcut zzf;
    private final com.google.android.gms.internal.ads.zzdno zzg;
    private final com.google.android.gms.internal.ads.zzdkc zzh;
    private final com.google.android.gms.internal.ads.zzdde zzi;
    private final boolean zzj;
    private final com.google.android.gms.internal.ads.zzcfi zzk;
    private final com.google.android.gms.internal.ads.zzdzl zzl;
    private boolean zzm;

    zzcvf(com.google.android.gms.internal.ads.zzcxs zzcxsVar, android.content.Context context, com.google.android.gms.internal.ads.zzcku zzckuVar, int i, com.google.android.gms.internal.ads.zzcut zzcutVar, com.google.android.gms.internal.ads.zzdno zzdnoVar, com.google.android.gms.internal.ads.zzdkc zzdkcVar, com.google.android.gms.internal.ads.zzdde zzddeVar, com.google.android.gms.internal.ads.zzcfi zzcfiVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        super(zzcxsVar);
        this.zzm = false;
        this.zzc = zzckuVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcutVar;
        this.zzg = zzdnoVar;
        this.zzh = zzdkcVar;
        this.zzi = zzddeVar;
        this.zzj = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgv)).booleanValue();
        this.zzk = zzcfiVar;
        this.zzl = zzdzlVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzbgd zzbgdVar) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzc;
        if (zzckuVar != null) {
            zzckuVar.zzay(zzbgdVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.Context] */
    public final void zzb(android.app.Activity activity, com.google.android.gms.internal.ads.zzbgq zzbgqVar, boolean z) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.internal.ads.zzfkf zzC;
        android.app.Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        boolean z2 = this.zzj;
        if (z2) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.internal.ads.zzdno zzdnoVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdnoVar.zzb())) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpc)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(activity2, this.zzb, this.zzl);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbm)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(activity2)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbn)).booleanValue()) {
                        new com.google.android.gms.internal.ads.zzfxq(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznr)).booleanValue() && (zzckuVar = this.zzc) != null && (zzC = zzckuVar.zzC()) != null && zzC.zzar && zzC.zzas != this.zzk.zzj()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(com.google.android.gms.internal.ads.zzfma.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(com.google.android.gms.internal.ads.zzfma.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdnoVar.zza(z, activity2, this.zzi);
            if (z2) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (com.google.android.gms.internal.ads.zzdnn e) {
            this.zzi.zzd(e);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzd() {
        super.zzd();
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzc;
        if (zzckuVar != null) {
            zzckuVar.destroy();
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
