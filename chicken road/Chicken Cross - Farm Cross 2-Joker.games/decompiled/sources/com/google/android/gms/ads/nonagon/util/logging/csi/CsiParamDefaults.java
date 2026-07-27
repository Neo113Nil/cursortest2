package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzgvb;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private final PackageInfo zzd;
    private final String zze;
    private final DeviceTierManager zzf;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel, PackageInfo packageInfo, String str, DeviceTierManager deviceTierManager) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
        this.zzd = packageInfo;
        this.zze = str;
        this.zzf = deviceTierManager;
    }

    public void set(Map<String, String> map) {
        PackageInfo packageInfo;
        map.put(CmcdData.Factory.STREAMING_FORMAT_SS, "gmob_sdk");
        map.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        map.put(L6.F, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put("device", zzs.zzt());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzH(context) ? "0" : "1");
        zzbix zzbixVar = zzbjg.zza;
        List zzf = zzba.zzb().zzf();
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzhV)).booleanValue()) {
            zzf.addAll(zzt.zzh().zzp().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", zzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzmW)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true == zzs.zzE(context) ? "1" : "0");
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzkW)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzdl)).booleanValue()) {
                map.put(L6.L, zzgvb.zza(zzt.zzh().zzv()));
            }
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzne)).booleanValue()) {
            map.put("uev", zzgvb.zza(this.zze));
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzde)).booleanValue()) {
            map.put("mem_tier", this.zzf.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzdf)).booleanValue()) {
            map.put("proc_tier", this.zzf.getAvailableProcessorTier().name());
        }
        if (!((Boolean) zzba.zzc().zzd(zzbjg.zzdg)).booleanValue() || (packageInfo = this.zzd) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }
}
