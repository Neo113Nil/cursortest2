package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeui implements com.google.android.gms.internal.ads.zzfci {
    final com.google.android.gms.internal.ads.zzfky zza;
    private final long zzb;
    private final long zzc;

    public zzeui(com.google.android.gms.internal.ads.zzfky zzfkyVar, long j, long j2) {
        this.zza = zzfkyVar;
        this.zzb = j;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfkyVar.zzg);
        int i = zzfkyVar.zzp.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.zzb;
        bundle.putLong("start_signals_timestamp", j);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoX)).booleanValue()) {
            bundle.putLong("tsi", j - this.zzc);
        }
        com.google.android.gms.internal.ads.zzfln.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US);
        long j2 = zzmVar.zzb;
        boolean z = false;
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "cust_age", simpleDateFormat.format(new java.util.Date(j2)), j2 != -1);
        com.google.android.gms.internal.ads.zzfln.zzf(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        com.google.android.gms.internal.ads.zzfln.zzc(bundle, "cust_gender", i3, i3 != -1);
        com.google.android.gms.internal.ads.zzfln.zzg(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        com.google.android.gms.internal.ads.zzfln.zzc(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        com.google.android.gms.internal.ads.zzfln.zzc(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        java.lang.String str = zzmVar.zzi;
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "ppid", str, i5 >= 2 && !android.text.TextUtils.isEmpty(str));
        android.location.Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = location.getLongitude() * 1.0E7d;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putFloat(com.helpshift.proactive.InAppViewConstants.RADIUS, accuracy);
            bundle2.putLong(com.ironsource.M6.s, (long) latitude);
            bundle2.putLong(com.adjust.sdk.Constants.LONG, (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "url", zzmVar.zzl);
        com.google.android.gms.internal.ads.zzfln.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        com.google.android.gms.internal.ads.zzfln.zzf(bundle, "custom_targeting", zzmVar.zzn);
        com.google.android.gms.internal.ads.zzfln.zzg(bundle, "category_exclusions", zzmVar.zzo);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "request_agent", zzmVar.zzp);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "request_pkg", zzmVar.zzq);
        com.google.android.gms.internal.ads.zzfln.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 >= 8) {
            int i6 = zzmVar.zzt;
            com.google.android.gms.internal.ads.zzfln.zzc(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            com.google.android.gms.internal.ads.zzfln.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        android.os.Bundle bundle3 = zzfkyVar.zze;
        com.google.android.gms.internal.ads.zzfln.zzh(bundle, "plcs", java.lang.Integer.valueOf(bundle3.getInt("plcs")));
        com.google.android.gms.internal.ads.zzfln.zzh(bundle, "plbs", java.lang.Integer.valueOf(bundle3.getInt("plbs")));
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "plid", bundle3.getString("plid"));
        if (zzfkyVar.zzv && (zzmVar.zzs != null || zzmVar.zzx != null)) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzfln.zzc(bundle, "s2s_rr", 1, z);
    }
}
