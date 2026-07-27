package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.ironsource.U3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfbj implements zzfdg {
    private final zzflw zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzfbj(zzflw zzflwVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzflwVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
    
        if (r0 == 3) goto L73;
     */
    @Override // com.google.android.gms.internal.ads.zzfdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray optJSONArray;
        zzflw zzflwVar = this.zza;
        ArrayList<String> arrayList = zzflwVar.zzh;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzflwVar.zzi);
        zzbmk zzbmkVar = zzflwVar.zzj;
        if (zzbmkVar != null) {
            int i = zzbmkVar.zza;
            String str = U3.i.C;
            if (i > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i2 = zzbmkVar.zzh;
                String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "square" : U3.i.D : U3.i.C : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i3 = zzbmkVar.zzc;
            if (i3 == 0) {
                str = "any";
            } else if (i3 == 1) {
                str = U3.i.D;
            } else if (i3 != 2) {
                str = "unknown";
            }
            if (!"unknown".equals(str)) {
                bundle.putString("native_image_orientation", str);
            }
            bundle.putBoolean("native_multiple_images", zzbmkVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbmkVar.zzg);
            int i4 = zzbmkVar.zzi;
            if (i4 != 0) {
                bundle.putBoolean("sccg_tap", zzbmkVar.zzj);
                bundle.putInt("sccg_dir", i4);
            }
        }
        PackageInfo packageInfo = this.zzb;
        int i5 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i5 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i5);
        }
        JSONObject zzs = zzgVar.zzs();
        String str3 = null;
        if (zzs != null && (optJSONArray = zzs.optJSONArray(zzflwVar.zzg)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i6 = zzflwVar.zzl;
        if (i6 > 1) {
            bundle.putInt("max_num_ads", i6);
        }
        zzbst zzbstVar = zzflwVar.zzb;
        if (zzbstVar != null) {
            String str4 = zzbstVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                String str5 = "p";
                if (zzbstVar.zza >= 2) {
                    int i7 = zzbstVar.zzd;
                    if (i7 != 2) {
                    }
                    str5 = CmcdData.Factory.STREAM_TYPE_LIVE;
                    bundle.putString("ia_var", str5);
                } else {
                    int i8 = zzbstVar.zzb;
                    if (i8 != 1) {
                        if (i8 != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 41);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i8);
                            sb.append(" is wrong.");
                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb.toString());
                        }
                        bundle.putString("ia_var", str5);
                    }
                    str5 = CmcdData.Factory.STREAM_TYPE_LIVE;
                    bundle.putString("ia_var", str5);
                }
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznA)).booleanValue() || zzbmkVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmkVar.zzf;
        if (zzfwVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzfwVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzfwVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbmkVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbmkVar.zze);
    }
}
