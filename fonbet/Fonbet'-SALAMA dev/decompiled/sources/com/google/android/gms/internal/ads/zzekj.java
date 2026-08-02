package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzekj implements zzesg {
    final zzfba zza;
    private final long zzb;

    public zzekj(zzfba zzfbaVar, long j) {
        this.zza = zzfbaVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zza(Object obj) {
        Bundle bundle = ((zzcts) obj).zzb;
        zzfba zzfbaVar = this.zza;
        bundle.putString("slotname", zzfbaVar.zzf);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfbaVar.zzd;
        if (zzmVar.f10761f) {
            bundle.putBoolean("test_request", true);
        }
        int i7 = zzmVar.f10762x;
        zzfbo.zze(bundle, "tag_for_child_directed_treatment", i7, i7 != -1);
        if (zzmVar.f10756a >= 8) {
            int i8 = zzmVar.f10749K;
            zzfbo.zze(bundle, "tag_for_under_age_of_consent", i8, i8 != -1);
        }
        zzfbo.zzc(bundle, "url", zzmVar.f10741C);
        zzfbo.zzd(bundle, "neighboring_content_urls", zzmVar.f10751M);
        Bundle bundle2 = zzmVar.f10758c;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) C0254t.f2723d.f2726c.zzb(zzbby.zzhz)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfbo.zzb(bundle, "extras", bundle3);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.f10752N);
        bundle.putString("slotname", this.zza.zzf);
        int i7 = this.zza.zzo.zza;
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i8 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        Bundle bundle2 = zzmVar.f10758c;
        zzfbo.zzg(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j = zzmVar.f10757b;
        zzfbo.zzf(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
        zzfbo.zzb(bundle, "extras", bundle2);
        int i9 = zzmVar.f10759d;
        zzfbo.zze(bundle, "cust_gender", i9, i9 != -1);
        zzfbo.zzd(bundle, "kw", zzmVar.f10760e);
        int i10 = zzmVar.f10762x;
        zzfbo.zze(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (zzmVar.f10761f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.f10754P);
        int i11 = zzmVar.f10756a;
        zzfbo.zze(bundle, "d_imp_hdr", 1, i11 >= 2 && zzmVar.f10763y);
        String str = zzmVar.f10764z;
        zzfbo.zzf(bundle, "ppid", str, i11 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.f10740B;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        zzfbo.zzc(bundle, "url", zzmVar.f10741C);
        zzfbo.zzd(bundle, "neighboring_content_urls", zzmVar.f10751M);
        zzfbo.zzb(bundle, "custom_targeting", zzmVar.f10743E);
        zzfbo.zzd(bundle, "category_exclusions", zzmVar.f10744F);
        zzfbo.zzc(bundle, "request_agent", zzmVar.f10745G);
        zzfbo.zzc(bundle, "request_pkg", zzmVar.f10746H);
        zzfbo.zzg(bundle, "is_designed_for_families", zzmVar.f10747I, i11 >= 7);
        if (i11 >= 8) {
            int i12 = zzmVar.f10749K;
            zzfbo.zze(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            zzfbo.zzc(bundle, "max_ad_content_rating", zzmVar.f10750L);
        }
    }
}
