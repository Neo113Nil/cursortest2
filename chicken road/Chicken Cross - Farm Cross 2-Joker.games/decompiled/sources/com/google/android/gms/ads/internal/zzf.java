package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbva;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzhdi;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzeaj zzeajVar, zzfqw zzfqwVar, zzfrj zzfrjVar, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzh().zzp().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzeajVar, "cld_s", zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        String optString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(optString)) {
            zzfqwVar.zzk(optString);
        }
        zzfqwVar.zzd(optBoolean);
        zzfrjVar.zzb(zzfqwVar.zzm());
        return zzhcy.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzeaj zzeajVar, String str, long j) {
        if (zzeajVar != null) {
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzoq)).booleanValue()) {
                zzeai zza = zzeajVar.zza();
                zza.zzc("action", "lat_init");
                zza.zzc(str, Long.toString(j));
                zza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfrj zzfrjVar, zzeaj zzeajVar, Long l, boolean z) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfrjVar, zzeajVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcfq zzcfqVar, zzfrj zzfrjVar, boolean z) {
        zzc(context, versionInfoParcel, false, zzcfqVar, zzcfqVar != null ? zzcfqVar.zze() : null, str, null, zzfrjVar, null, null, z);
    }

    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcfq zzcfqVar, String str, String str2, Runnable runnable, final zzfrj zzfrjVar, final zzeaj zzeajVar, final Long l, boolean z2) {
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzcfqVar != null && !TextUtils.isEmpty(zzcfqVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzcfqVar.zzb() <= ((Long) zzba.zzc().zzd(zzbjg.zzfj)).longValue() && zzcfqVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfqw zzn = zzfqw.zzn(context, 4);
        zzn.zza();
        zzbva zzb = zzt.zzr().zzb(this.zza, versionInfoParcel, zzfrjVar);
        zzbuu zzbuuVar = zzbux.zza;
        zzbuq zza = zzb.zza("google.afma.config.fetchAppSettings", zzbuuVar, zzbuuVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbix zzbixVar = zzbjg.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zzb().zze()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzlb)).booleanValue()) {
                jSONObject.put("inspector_enabled", z2);
            }
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture zzb2 = zza.zzb(jSONObject);
            zzhcg zzhcgVar = new zzhcg(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzf.zzd(l, zzeajVar, zzn, zzfrjVar, (JSONObject) obj);
                }
            };
            zzhdi zzhdiVar = zzcgj.zzh;
            ListenableFuture zzj = zzhcy.zzj(zzb2, zzhcgVar, zzhdiVar);
            if (runnable != null) {
                zzb2.addListener(runnable, zzhdiVar);
            }
            if (l != null) {
                zzb2.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzf.zzf(zzeajVar, "cld_r", zzt.zzk().elapsedRealtime() - l.longValue());
                    }
                }, zzhdiVar);
            }
            if (((Boolean) zzba.zzc().zzd(zzbjg.zziM)).booleanValue()) {
                zzcgm.zzb(zzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcgm.zza(zzj, "ConfigLoader.maybeFetchNewAppSettings", zzhdiVar);
            }
        } catch (Exception e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", e);
            zzn.zzj(e);
            zzn.zzd(false);
            zzfrjVar.zzb(zzn.zzm());
        }
    }
}
