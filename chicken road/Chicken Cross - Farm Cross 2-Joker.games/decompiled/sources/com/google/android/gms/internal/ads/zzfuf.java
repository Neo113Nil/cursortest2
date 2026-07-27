package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfuf {
    private final zzeaj zza;

    zzfuf(zzeaj zzeajVar, Context context) {
        this.zza = zzeajVar;
    }

    private final void zzv(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j));
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("pas", Integer.toString(i3));
        zza.zzc("pv", "2");
        zza.zzc("ad_unit_id", str3);
        zza.zzc("pid", str2);
        zza.zzd();
    }

    private final void zzw(String str, String str2, long j, int i, int i2, String str3, zzfum zzfumVar, String str4) {
        zzeai zza = this.zza.zza();
        zza.zzc(str2, Long.toString(j));
        if (zzfumVar != null) {
            zza.zzc("ad_unit_id", zzfumVar.zza());
            zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
            zza.zzc("pid", zzfumVar.zzc());
        }
        zza.zzc("action", str);
        if (str3 != null) {
            zza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zza.zzc("cache_size", Integer.toString(i2));
        }
        zza.zzc("pv", str4);
        zza.zzd();
    }

    private final void zzx(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j));
        zza.zzc("pid", str2);
        zza.zzc("ad_unit_id", str3);
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("tpcnt", Integer.toString(i4));
        zza.zzc("mpl", Integer.toString(i5));
        if (adFormat != null) {
            zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            zza.zzc("nptr", Integer.toString(i3));
        }
        zza.zzd();
    }

    public final void zza(int i, long j, zzfum zzfumVar, String str) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zza.zzc("ad_unit_id", zzfumVar.zza());
        zza.zzc("pid", zzfumVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String lowerCase = adFormat.name().toLowerCase(Locale.ENGLISH);
            String.valueOf(lowerCase);
            String valueOf = String.valueOf(lowerCase);
            zza.zzc(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzfum zzfumVar) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", "cache_resize");
        zza.zzc("cs_ts", Long.toString(j));
        zza.zzc("orig_ma", Integer.toString(i));
        zza.zzc("max_ads", Integer.toString(i2));
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zza.zzc("ad_unit_id", zzfumVar.zza());
        zza.zzc("pid", zzfumVar.zzc());
        zza.zzc("pv", "1");
        zza.zzd();
    }

    public final void zzd(int i, int i2, long j, Long l, String str, zzfum zzfumVar, String str2) {
        zzeai zza = this.zza.zza();
        zza.zzc("plaac_ts", Long.toString(j));
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "is_ad_available");
        if (zzfumVar != null) {
            zza.zzc("ad_unit_id", zzfumVar.zza());
            zza.zzc("pid", zzfumVar.zzc());
            zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        }
        if (l != null) {
            zza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zze(long j, String str) {
        zzw("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfum zzfumVar, int i, int i2, String str) {
        zzw("poll_ad", "ppac_ts", j, i, i2, null, zzfumVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzfum zzfumVar, String str2) {
        zzw("poll_ad", "psvroc_ts", j, i, i2, str, zzfumVar, str2);
    }

    public final void zzh(long j, int i, int i2, String str, zzfum zzfumVar, String str2) {
        zzeai zza = this.zza.zza();
        zza.zzc("ppla_ts", Long.toString(j));
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zza.zzc("ad_unit_id", zzfumVar.zza());
        zza.zzc("pid", zzfumVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "poll_ad");
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zzi(long j, String str, zzfum zzfumVar, int i, int i2, String str2) {
        zzw("paa", "pano_ts", j, i, i2, str, zzfumVar, str2);
    }

    public final void zzj(long j, zzfum zzfumVar, int i, String str) {
        zzw("pae", "paeo_ts", j, i, 0, null, zzfumVar, str);
    }

    public final void zzk(long j, zzfum zzfumVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, String str) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", "pftla");
        zza.zzc("pftlat_ts", Long.toString(j));
        zza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("ad_unit_id", zzfumVar.zza());
        zza.zzc("pid", zzfumVar.zzc());
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i) {
        zzv("pda", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzv("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j, int i) {
        zzv("pgcs", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzo(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzv("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, String str, String str2, AdFormat adFormat, int i2) {
        zzv("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }

    public final void zzq(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4) {
        zzx("acmpa", j, str, str2, adFormat, i, i2, 0, i3, i4);
    }

    public final void zzr(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzx("acmpr", j, str, str2, adFormat, i, i2, i3, i4, i5);
    }

    public final void zzs(long j, int i, int i2) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", "acmlr");
        zza.zzc("pat", Long.toString(j));
        zza.zzc("mpl", Integer.toString(i));
        zza.zzc("pas", Integer.toString(i2));
        zza.zzd();
    }

    public final void zzt(long j, long j2, long j3, long j4, long j5) {
        zzeai zza = this.zza.zza();
        zza.zzc("action", "iic");
        zza.zzc("pat", Long.toString(j));
        zza.zzc("bot", Long.toString(j2));
        zza.zzc("cim", Long.toString(j3));
        zza.zzc("mbot", Long.toString(j4));
        zza.zzc("mim", Long.toString(j5));
        zza.zzd();
    }

    public final void zzu(long j, AdFormat adFormat, String str, String str2, boolean z) {
        zzeai zza = this.zza.zza();
        zza.zzc("poaca_ts", Long.toString(j));
        zza.zzc("action", true != z ? "poac" : "poact");
        zza.zzc("ad_unit_id", str2);
        zza.zzc("pid", str);
        if (adFormat != null) {
            zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        zza.zzd();
    }
}
