package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeae {
    private final ConcurrentHashMap zza;
    private final zzcga zzb;
    private final zzflw zzc;
    private final String zzd;
    private final String zze;
    private final zzbbd zzf;
    private final DeviceTierManager zzg;
    private final Bundle zzh = new Bundle();
    private final Context zzi;

    public zzeae(Context context, zzeao zzeaoVar, zzcga zzcgaVar, zzflw zzflwVar, String str, String str2, zzbbd zzbbdVar, DeviceTierManager deviceTierManager) {
        ActivityManager.MemoryInfo zze;
        ConcurrentHashMap zzd = zzeaoVar.zzd();
        this.zza = zzd;
        this.zzb = zzcgaVar;
        this.zzc = zzflwVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzbbdVar;
        this.zzg = deviceTierManager;
        this.zzi = context;
        zzd.put(FirebaseAnalytics.Param.AD_FORMAT, str2.toUpperCase(Locale.ROOT));
        zzi();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzm()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdb)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(zze.availMem));
                zzd("mem_tt", String.valueOf(zze.totalMem));
                zzd("low_m", true != zze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdi)).booleanValue()) {
            zzd("ad_unit_id", zzflwVar.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdc)).booleanValue()) {
            zzd("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdd)).booleanValue()) {
            zzd("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhZ)).booleanValue()) {
            int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzflwVar) - 1;
            if (zzg == 0) {
                zzd.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzd.put("scar", "false");
                return;
            }
            if (zzg == 1) {
                zzd.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzd.put("se", "query_g");
            } else if (zzg == 2) {
                zzd.put("se", "r_adinfo");
            } else if (zzg != 3) {
                zzd.put("se", "r_both");
            } else {
                zzd.put("se", "r_adstring");
            }
            zzd.put("scar", "true");
            zzd("ragent", zzflwVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzflwVar.zzd)));
        }
    }

    public final void zza(zzflo zzfloVar) {
        zzfln zzflnVar = zzfloVar.zzb;
        List list = zzflnVar.zza;
        if (!list.isEmpty()) {
            int i = ((zzfld) list.get(0)).zzb;
            zzd(FirebaseAnalytics.Param.AD_FORMAT, zzfld.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcU)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzflnVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final synchronized Bundle zze() {
        return this.zzh;
    }

    public final synchronized void zzf(String str, long j) {
        this.zzh.putLong(str, j);
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzh.putAll(bundle);
    }

    public final void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpd)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzi() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlc)).booleanValue()) {
            zzbay zzb = this.zzf.zzb();
            if (zzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzb).zzc());
            } else if (zzb instanceof zzcoa) {
                this.zza.put("asv", ((zzcoa) zzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}
