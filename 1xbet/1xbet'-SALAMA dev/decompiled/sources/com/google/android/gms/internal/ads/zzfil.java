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
import p097n3.c;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzfil {
    private final zzdqq zza;
    private final String zzb;

    public zzfil(zzdqq zzdqqVar, Context context) {
        CharSequence charSequenceR;
        this.zza = zzdqqVar;
        K k7 = P.f3579l;
        try {
            charSequenceR = c.a(context).r(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e7) {
            int i7 = J.f3546b;
            j.h("Failed to get application name", e7);
            charSequenceR = "";
        }
        this.zzb = charSequenceR.toString();
    }

    private final void zzj(EnumC1058b enumC1058b, String str, String str2, long j, String str3) {
        zzdqp zzdqpVarZza = this.zza.zza();
        zzdqpVarZza.zzb(str2, Long.toString(j));
        zzdqpVarZza.zzb(App.TYPE, this.zzb);
        zzdqpVarZza.zzb("ad_format", enumC1058b == null ? "unknown" : enumC1058b.name());
        if (str != null) {
            zzdqpVarZza.zzb("action", str);
        }
        if (str3 != null) {
            zzdqpVarZza.zzb("gqi", str3);
        }
        zzdqpVarZza.zzj();
    }

    public final void zza(EnumC1058b enumC1058b, int i7, int i8, long j) {
        zzdqp zzdqpVarZza = this.zza.zza();
        zzdqpVarZza.zzb("action", "cache_resize");
        zzdqpVarZza.zzb("cs_ts", Long.toString(j));
        zzdqpVarZza.zzb(App.TYPE, this.zzb);
        zzdqpVarZza.zzb("orig_ma", Integer.toString(i7));
        zzdqpVarZza.zzb("max_ads", Integer.toString(i8));
        zzdqpVarZza.zzb("ad_format", enumC1058b.name().toLowerCase(Locale.ENGLISH));
        zzdqpVarZza.zzj();
    }

    public final void zzb(EnumC1058b enumC1058b, long j, Long l7, String str) {
        zzdqp zzdqpVarZza = this.zza.zza();
        zzdqpVarZza.zzb("plaac_ts", Long.toString(j));
        zzdqpVarZza.zzb("ad_format", enumC1058b.name());
        zzdqpVarZza.zzb(App.TYPE, this.zzb);
        zzdqpVarZza.zzb("action", "is_ad_available");
        if (l7 != null) {
            zzdqpVarZza.zzb("plaay_ts", Long.toString(l7.longValue()));
        }
        if (str != null) {
            zzdqpVarZza.zzb("gqi", str);
        }
        zzdqpVarZza.zzj();
    }

    public final void zzc(EnumC1058b enumC1058b, long j, String str) {
        zzj(enumC1058b, null, "pano_ts", j, str);
    }

    public final void zzd(EnumC1058b enumC1058b, long j) {
        zzj(enumC1058b, null, "paeo_ts", j, null);
    }

    public final void zze(EnumC1058b enumC1058b, long j) {
        zzj(enumC1058b, "poll_ad", "ppac_ts", j, null);
    }

    public final void zzf(EnumC1058b enumC1058b, long j, String str) {
        zzj(enumC1058b, "poll_ad", "ppla_ts", j, str);
    }

    public final void zzg(EnumC1058b enumC1058b, long j, String str) {
        zzj(enumC1058b, "poll_ad", "psvroc_ts", j, str);
    }

    public final void zzh(Map map, long j) {
        zzdqp zzdqpVarZza = this.zza.zza();
        zzdqpVarZza.zzb("action", "start_preload");
        zzdqpVarZza.zzb("sp_ts", Long.toString(j));
        zzdqpVarZza.zzb(App.TYPE, this.zzb);
        for (EnumC1058b enumC1058b : map.keySet()) {
            String strValueOf = String.valueOf(enumC1058b.name().toLowerCase(Locale.ENGLISH));
            zzdqpVarZza.zzb(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(enumC1058b)).intValue()));
        }
        zzdqpVarZza.zzj();
    }

    public final void zzi(EnumC1058b enumC1058b, int i7, long j) {
        zzdqp zzdqpVarZza = this.zza.zza();
        zzdqpVarZza.zzb("action", "start_preload");
        zzdqpVarZza.zzb("sp_ts", Long.toString(j));
        zzdqpVarZza.zzb(App.TYPE, this.zzb);
        zzdqpVarZza.zzb("ad_format", enumC1058b.name().toLowerCase(Locale.ENGLISH));
        zzdqpVarZza.zzb("max_ads", Integer.toString(i7));
        zzdqpVarZza.zzj();
    }
}
