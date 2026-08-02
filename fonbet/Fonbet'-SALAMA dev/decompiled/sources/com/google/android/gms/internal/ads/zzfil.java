package com.google.android.gms.internal.ads;

import I2.J;
import I2.K;
import I2.P;
import J2.j;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.protocol.App;
import java.util.Locale;
import java.util.Map;
import n3.c;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class zzfil {
    private final zzdqq zza;
    private final String zzb;

    public zzfil(zzdqq zzdqqVar, Context context) {
        CharSequence charSequence;
        this.zza = zzdqqVar;
        K k7 = P.f3579l;
        try {
            charSequence = c.a(context).r(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e7) {
            int i7 = J.f3546b;
            j.h("Failed to get application name", e7);
            charSequence = "";
        }
        this.zzb = charSequence.toString();
    }

    private final void zzj(EnumC1798b enumC1798b, String str, String str2, long j, String str3) {
        zzdqp zza = this.zza.zza();
        zza.zzb(str2, Long.toString(j));
        zza.zzb(App.TYPE, this.zzb);
        zza.zzb("ad_format", enumC1798b == null ? "unknown" : enumC1798b.name());
        if (str != null) {
            zza.zzb("action", str);
        }
        if (str3 != null) {
            zza.zzb("gqi", str3);
        }
        zza.zzj();
    }

    public final void zza(EnumC1798b enumC1798b, int i7, int i8, long j) {
        zzdqp zza = this.zza.zza();
        zza.zzb("action", "cache_resize");
        zza.zzb("cs_ts", Long.toString(j));
        zza.zzb(App.TYPE, this.zzb);
        zza.zzb("orig_ma", Integer.toString(i7));
        zza.zzb("max_ads", Integer.toString(i8));
        zza.zzb("ad_format", enumC1798b.name().toLowerCase(Locale.ENGLISH));
        zza.zzj();
    }

    public final void zzb(EnumC1798b enumC1798b, long j, Long l7, String str) {
        zzdqp zza = this.zza.zza();
        zza.zzb("plaac_ts", Long.toString(j));
        zza.zzb("ad_format", enumC1798b.name());
        zza.zzb(App.TYPE, this.zzb);
        zza.zzb("action", "is_ad_available");
        if (l7 != null) {
            zza.zzb("plaay_ts", Long.toString(l7.longValue()));
        }
        if (str != null) {
            zza.zzb("gqi", str);
        }
        zza.zzj();
    }

    public final void zzc(EnumC1798b enumC1798b, long j, String str) {
        zzj(enumC1798b, null, "pano_ts", j, str);
    }

    public final void zzd(EnumC1798b enumC1798b, long j) {
        zzj(enumC1798b, null, "paeo_ts", j, null);
    }

    public final void zze(EnumC1798b enumC1798b, long j) {
        zzj(enumC1798b, "poll_ad", "ppac_ts", j, null);
    }

    public final void zzf(EnumC1798b enumC1798b, long j, String str) {
        zzj(enumC1798b, "poll_ad", "ppla_ts", j, str);
    }

    public final void zzg(EnumC1798b enumC1798b, long j, String str) {
        zzj(enumC1798b, "poll_ad", "psvroc_ts", j, str);
    }

    public final void zzh(Map map, long j) {
        zzdqp zza = this.zza.zza();
        zza.zzb("action", "start_preload");
        zza.zzb("sp_ts", Long.toString(j));
        zza.zzb(App.TYPE, this.zzb);
        for (EnumC1798b enumC1798b : map.keySet()) {
            String valueOf = String.valueOf(enumC1798b.name().toLowerCase(Locale.ENGLISH));
            zza.zzb(valueOf.concat("_count"), Integer.toString(((Integer) map.get(enumC1798b)).intValue()));
        }
        zza.zzj();
    }

    public final void zzi(EnumC1798b enumC1798b, int i7, long j) {
        zzdqp zza = this.zza.zza();
        zza.zzb("action", "start_preload");
        zza.zzb("sp_ts", Long.toString(j));
        zza.zzb(App.TYPE, this.zzb);
        zza.zzb("ad_format", enumC1798b.name().toLowerCase(Locale.ENGLISH));
        zza.zzb("max_ads", Integer.toString(i7));
        zza.zzj();
    }
}
