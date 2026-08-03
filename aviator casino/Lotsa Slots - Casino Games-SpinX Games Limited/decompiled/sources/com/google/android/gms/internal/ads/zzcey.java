package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcey {
    private java.lang.String zzd;
    private java.lang.String zze;
    private long zzf;
    private org.json.JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.List zzi = new java.util.ArrayList();

    public zzcey(java.lang.String str, long j) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        org.json.JSONArray optJSONArray;
        org.json.JSONObject optJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzg = new org.json.JSONObject(str);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzne)).booleanValue() && zzj()) {
                return;
            }
            if (this.zzg.optInt("status", -1) != 1) {
                this.zzh = false;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            org.json.JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    org.json.JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                    java.lang.String optString = jSONObject.optString("format");
                    java.lang.String optString2 = jSONObject.optString(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID);
                    if (!android.text.TextUtils.isEmpty(optString) && !android.text.TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.zzb.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(optString2, new com.google.android.gms.internal.ads.zzbuw(optJSONObject3));
                        }
                    }
                }
            }
            org.json.JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    this.zza.add(optJSONArray3.optString(i3));
                }
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhP)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    this.zzi.add(optJSONArray.get(i4).toString());
                }
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhk)).booleanValue() || (optJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (org.json.JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AppSettings.parseAppSettingsJson");
        }
    }

    private final boolean zzl() {
        if (!android.text.TextUtils.isEmpty(this.zze) && this.zzg != null) {
            long zzm = zzm();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzm >= 0 && (this.zzf > currentTimeMillis || java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - this.zzf) > zzm)) {
                return false;
            }
        }
        return true;
    }

    private final long zzm() {
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zznh;
        return (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzng)).booleanValue() || android.text.TextUtils.isEmpty(this.zze)) ? ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).longValue() : this.zzg.optLong("cache_ttl_sec", ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).longValue());
    }

    public final void zza(long j) {
        this.zzf = j;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzh;
    }

    public final java.lang.String zzd() {
        return this.zze;
    }

    public final java.lang.String zze() {
        return this.zzd;
    }

    public final java.util.Map zzf() {
        return this.zzc;
    }

    public final org.json.JSONObject zzg() {
        return this.zzg;
    }

    public final java.util.List zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        com.google.android.gms.internal.ads.zzdzl zzv;
        if (zzl()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfc)).booleanValue() && (zzv = com.google.android.gms.ads.internal.zzt.zzh().zzv()) != null) {
            com.google.android.gms.internal.ads.zzdzk zza = zzv.zza();
            zza.zzc("action", "cld_reset");
            zza.zzc("cld_lut_ms", java.lang.String.valueOf(this.zzf));
            zza.zzc("event_timestamp", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zza.zzc("cld_ttl_sec", java.lang.String.valueOf(zzm()));
            zza.zzd();
        }
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd = "";
        this.zze = "";
        this.zzg = null;
        this.zzh = false;
        this.zzi.clear();
        this.zzj = false;
        return true;
    }

    public final int zzk() {
        if (android.text.TextUtils.isEmpty(this.zze) || this.zzg == null) {
            return 3;
        }
        return zzl() ? 1 : 2;
    }
}
