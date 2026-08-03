package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfqg implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzfqj zzb;
    private java.lang.String zzc;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzfkp zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private java.util.concurrent.Future zzh;
    private final java.util.List zza = new java.util.ArrayList();
    private int zzi = 2;
    private com.google.android.gms.internal.ads.zzfql zzd = com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_UNSPECIFIED;

    zzfqg(com.google.android.gms.internal.ads.zzfqj zzfqjVar) {
        this.zzb = zzfqjVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zza(com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            java.util.List list = this.zza;
            zzfpwVar.zzc();
            list.add(zzfpwVar);
            java.util.concurrent.Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = com.google.android.gms.internal.ads.zzcfr.zzd.schedule(this, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkb)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zzb(java.util.ArrayList arrayList) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(com.google.android.gms.ads.AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(com.google.android.gms.ads.AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(com.google.android.gms.ads.AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(com.google.android.gms.ads.AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzi = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzi = 6;
                            }
                        }
                        this.zzi = 5;
                    }
                    this.zzi = 8;
                }
                this.zzi = 4;
            }
            this.zzi = 3;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zzc(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() && com.google.android.gms.internal.ads.zzfqf.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zzd(android.os.Bundle bundle) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(bundle);
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zze(com.google.android.gms.internal.ads.zzfkp zzfkpVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            this.zzf = zzfkpVar;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zzg(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            java.util.concurrent.Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            java.util.List<com.google.android.gms.internal.ads.zzfpw> list = this.zza;
            for (com.google.android.gms.internal.ads.zzfpw zzfpwVar : list) {
                int i = this.zzi;
                if (i != 2) {
                    zzfpwVar.zzp(i);
                }
                if (!android.text.TextUtils.isEmpty(this.zzc)) {
                    zzfpwVar.zze(this.zzc);
                }
                if (!android.text.TextUtils.isEmpty(this.zze) && !zzfpwVar.zzl()) {
                    zzfpwVar.zzi(this.zze);
                }
                com.google.android.gms.internal.ads.zzfkp zzfkpVar = this.zzf;
                if (zzfkpVar != null) {
                    zzfpwVar.zzg(zzfkpVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                    if (zzeVar != null) {
                        zzfpwVar.zzh(zzeVar);
                    }
                }
                zzfpwVar.zzf(this.zzd);
                this.zzb.zzb(zzfpwVar.zzm());
            }
            list.clear();
        }
    }

    public final synchronized com.google.android.gms.internal.ads.zzfqg zzi(int i) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
