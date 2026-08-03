package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzetz implements com.google.android.gms.internal.ads.zzets {
    private final com.google.android.gms.internal.ads.zzfkx zza;
    private final com.google.android.gms.internal.ads.zzcnj zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzetp zzd;
    private final com.google.android.gms.internal.ads.zzfqj zze;
    private com.google.android.gms.internal.ads.zzcyi zzf;

    public zzetz(com.google.android.gms.internal.ads.zzcnj zzcnjVar, android.content.Context context, com.google.android.gms.internal.ads.zzetp zzetpVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar) {
        this.zzb = zzcnjVar;
        this.zzc = context;
        this.zzd = zzetpVar;
        this.zza = zzfkxVar;
        this.zze = zzcnjVar.zzx();
        zzfkxVar.zzt(zzetpVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzetq zzetqVar, com.google.android.gms.internal.ads.zzetr zzetrVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzety
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzetz.this.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzetx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzetz.this.zzd();
                }
            });
            return false;
        }
        boolean z = zzmVar.zzf;
        com.google.android.gms.internal.ads.zzflv.zzb(context, z);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && z) {
            this.zzb.zzw().zzc(true);
        }
        int i3 = ((com.google.android.gms.internal.ads.zzett) zzetqVar).zza;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        java.lang.String zza = com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALL.zza();
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
        android.os.Bundle zza2 = com.google.android.gms.internal.ads.zzdyw.zza(new android.util.Pair(zza, valueOf), new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.DYNAMITE_ENTER.zza(), valueOf));
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zza;
        zzfkxVar.zza(zzmVar);
        zzfkxVar.zzv(zza2);
        zzfkxVar.zzl(i3);
        com.google.android.gms.internal.ads.zzfky zzB = zzfkxVar.zzB();
        com.google.android.gms.internal.ads.zzfpw zzo = com.google.android.gms.internal.ads.zzfpw.CC.zzo(context, com.google.android.gms.internal.ads.zzfqf.zzg(zzB), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcl zzclVar = zzB.zzo;
        if (zzclVar != null) {
            this.zzd.zzc().zzo(zzclVar);
        }
        com.google.android.gms.internal.ads.zzcnj zzcnjVar = this.zzb;
        com.google.android.gms.internal.ads.zzdob zzo2 = zzcnjVar.zzo();
        com.google.android.gms.internal.ads.zzdca zzdcaVar = new com.google.android.gms.internal.ads.zzdca();
        zzdcaVar.zza(context);
        zzdcaVar.zzb(zzB);
        zzo2.zzf(zzdcaVar.zze());
        com.google.android.gms.internal.ads.zzdiq zzdiqVar = new com.google.android.gms.internal.ads.zzdiq();
        com.google.android.gms.internal.ads.zzetp zzetpVar = this.zzd;
        zzdiqVar.zze(zzetpVar.zzc(), zzcnjVar.zzb());
        zzo2.zzg(zzdiqVar.zzn());
        zzo2.zze(zzetpVar.zzb());
        zzo2.zzd(new com.google.android.gms.internal.ads.zzcvi(null));
        com.google.android.gms.internal.ads.zzdoc zza3 = zzo2.zza();
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfqg zzc = zza3.zzc();
            zzc.zzi(8);
            zzc.zzc(zzmVar.zzp);
            zzc.zzd(zzmVar.zzm);
            zzfqgVar = zzc;
        } else {
            zzfqgVar = null;
        }
        zzcnjVar.zzv().zza(1);
        com.google.android.gms.internal.ads.zzhcg zzc2 = com.google.android.gms.internal.ads.zzfoa.zzc();
        java.util.concurrent.ScheduledExecutorService zzc3 = zzcnjVar.zzc();
        com.google.android.gms.internal.ads.zzcyx zza4 = zza3.zza();
        com.google.android.gms.internal.ads.zzcyi zzcyiVar = new com.google.android.gms.internal.ads.zzcyi(zzc2, zzc3, zza4.zzc(zza4.zzb()));
        this.zzf = zzcyiVar;
        zzcyiVar.zza(new com.google.android.gms.internal.ads.zzetw(this, zzetrVar, zzfqgVar, zzo, zza3));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zzb() {
        com.google.android.gms.internal.ads.zzcyi zzcyiVar = this.zzf;
        return zzcyiVar != null && zzcyiVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(6, null, null));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcnj zze() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzetp zzf() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zzg() {
        return this.zze;
    }
}
