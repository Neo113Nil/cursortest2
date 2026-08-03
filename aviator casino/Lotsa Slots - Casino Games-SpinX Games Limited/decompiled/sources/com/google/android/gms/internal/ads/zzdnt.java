package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdnt implements com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.internal.ads.zzdkd {
    private final com.google.android.gms.internal.ads.zzcdw zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcdz zzc;
    private final android.view.View zzd;
    private java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza zzf;
    private final com.google.android.gms.internal.ads.zzfkf zzg;

    public zzdnt(com.google.android.gms.internal.ads.zzcdw zzcdwVar, android.content.Context context, com.google.android.gms.internal.ads.zzcdz zzcdzVar, android.view.View view, com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza enumC0068zza, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zza = zzcdwVar;
        this.zzb = context;
        this.zzc = zzcdzVar;
        this.zzd = view;
        this.zzf = enumC0068zza;
        this.zzg = zzfkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    @javax.annotation.ParametersAreNonnullByDefault
    public final void zzd(com.google.android.gms.internal.ads.zzcbp zzcbpVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzcdz zzcdzVar = this.zzc;
        android.content.Context context = this.zzb;
        if (zzcdzVar.zza(context) && this.zzg.zzaG) {
            try {
                zzcdzVar.zzo(context, zzcdzVar.zzj(context), this.zza.zzb(), zzcbpVar.zzb(), zzcbpVar.zzc());
            } catch (android.os.RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
        if (this.zzg.zzaG) {
            android.view.View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzg(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final void zzh() {
        com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza enumC0068zza = this.zzf;
        if (enumC0068zza != com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.APP_OPEN && this.zzg.zzaG) {
            java.lang.String zzf = this.zzc.zzf(this.zzb);
            this.zze = zzf;
            com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza enumC0068zza2 = com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.REWARD_BASED_VIDEO_AD;
            java.lang.String.valueOf(zzf);
            this.zze = java.lang.String.valueOf(zzf).concat(enumC0068zza == enumC0068zza2 ? "/Rewarded" : "/Interstitial");
        }
    }
}
