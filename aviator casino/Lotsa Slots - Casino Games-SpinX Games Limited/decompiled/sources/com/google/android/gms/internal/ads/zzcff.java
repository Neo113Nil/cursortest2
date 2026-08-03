package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcff {
    final java.lang.String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzl;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final java.lang.Object zzj = new java.lang.Object();
    private final java.lang.Object zzk = new java.lang.Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private int zzm = 0;
    private final java.util.Map zzn = new java.util.HashMap();
    private final java.util.Map zzo = new java.util.HashMap();

    public zzcff(java.lang.String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzl = zzgVar;
    }

    private final void zzj() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkx.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        android.os.Bundle bundle;
        synchronized (this.zzj) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzl;
            long zzm = zzgVar.zzm();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (this.zzb == -1) {
                if (currentTimeMillis - zzm > ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbG)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = zzgVar.zzo();
                }
                this.zzb = j;
                this.zza = j;
            } else {
                this.zza = j;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzex)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                this.zzc++;
                int i = this.zzd + 1;
                this.zzd = i;
                if (i == 0) {
                    this.zze = 0L;
                    zzgVar.zzp(currentTimeMillis);
                } else {
                    this.zze = currentTimeMillis - zzgVar.zzq();
                }
            }
        }
    }

    public final void zzf() {
        zzj();
    }

    public final void zzg() {
        zzj();
    }

    public final android.os.Bundle zzh(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle;
        synchronized (this.zzj) {
            bundle = new android.os.Bundle();
            if (!this.zzl.zzx()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            android.content.Context zza = com.google.android.gms.internal.ads.zzcbn.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new android.content.ComponentName(zza.getPackageName(), com.google.android.gms.ads.AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to fetch AdActivity theme");
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
            bundle.putInt("consent_form_action_identifier", zzd());
        }
        return bundle;
    }

    public final com.google.android.gms.internal.ads.zzcfe zzi(java.util.Set set, java.lang.String str) {
        synchronized (this.zzk) {
            int i = this.zzm;
            this.zzm = i + 1;
            if (set.isEmpty()) {
                return new com.google.android.gms.internal.ads.zzcfe(i, -1, -1);
            }
            java.lang.String m = kotlin.UByte$$ExternalSyntheticBackport0.m((java.lang.CharSequence) ",", (java.lang.Iterable) new java.util.TreeSet(set));
            java.util.Map map = this.zzn;
            java.lang.Integer num = (java.lang.Integer) map.get(m);
            int i2 = 0;
            int intValue = num == null ? 0 : num.intValue();
            map.put(m, java.lang.Integer.valueOf(intValue + 1));
            if (str == null) {
                return new com.google.android.gms.internal.ads.zzcfe(i, intValue, -1);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + java.lang.String.valueOf(m).length());
            sb.append(str);
            sb.append("|");
            sb.append(m);
            java.lang.String sb2 = sb.toString();
            java.util.Map map2 = this.zzo;
            java.lang.Integer num2 = (java.lang.Integer) map2.get(sb2);
            if (num2 != null) {
                i2 = num2.intValue();
            }
            map2.put(sb2, java.lang.Integer.valueOf(i2 + 1));
            return new com.google.android.gms.internal.ads.zzcfe(i, intValue, i2);
        }
    }
}
