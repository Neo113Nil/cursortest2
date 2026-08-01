package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.ironsource.L6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevg implements zzfdg {
    final zzflw zza;
    private final long zzb;
    private final long zzc;

    public zzevg(zzflw zzflwVar, long j, long j2) {
        this.zza = zzflwVar;
        this.zzb = j;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflw zzflwVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzflwVar.zzg);
        int i = zzflwVar.zzp.zza;
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpo)).booleanValue()) {
            bundle.putLong("tsi", j - this.zzc);
        }
        zzfml.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfml.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j2 = zzmVar.zzb;
        zzfml.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j2)), j2 != -1);
        zzfml.zzf(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        zzfml.zzc(bundle, "cust_gender", i3, i3 != -1);
        zzfml.zzg(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        zzfml.zzc(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        zzfml.zzc(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfml.zzb(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong(L6.s, (long) latitude);
            bundle2.putLong(Constants.LONG, (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfml.zze(bundle, "url", zzmVar.zzl);
        zzfml.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfml.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzfml.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzfml.zze(bundle, "request_agent", zzmVar.zzp);
        zzfml.zze(bundle, "request_pkg", zzmVar.zzq);
        zzfml.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 >= 8) {
            int i6 = zzmVar.zzt;
            zzfml.zzc(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            zzfml.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        int i7 = zzmVar.zzB;
        zzfml.zzc(bundle, "tfat", i7, i7 != -1);
        Bundle bundle3 = zzflwVar.zze;
        zzfml.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfml.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfml.zze(bundle, "plid", bundle3.getString("plid"));
        zzfml.zzc(bundle, "s2s_rr", 1, zzflwVar.zzv && !(zzmVar.zzs == null && zzmVar.zzx == null));
    }
}
