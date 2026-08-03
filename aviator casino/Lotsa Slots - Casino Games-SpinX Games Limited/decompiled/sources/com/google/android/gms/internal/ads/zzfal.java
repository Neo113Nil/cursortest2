package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfal implements com.google.android.gms.internal.ads.zzfci {
    private final com.google.android.gms.internal.ads.zzfky zza;
    private final android.content.pm.PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzfal(com.google.android.gms.internal.ads.zzfky zzfkyVar, android.content.pm.PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfkyVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
    
        if (r0 == 3) goto L73;
     */
    @Override // com.google.android.gms.internal.ads.zzfci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        org.json.JSONArray optJSONArray;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zza;
        java.util.ArrayList<java.lang.String> arrayList = zzfkyVar.zzh;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfkyVar.zzi);
        com.google.android.gms.internal.ads.zzblt zzbltVar = zzfkyVar.zzj;
        if (zzbltVar != null) {
            java.lang.String str = "landscape";
            if (zzbltVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i = zzbltVar.zzh;
                java.lang.String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i2 = zzbltVar.zzc;
            if (i2 == 0) {
                str = "any";
            } else if (i2 == 1) {
                str = "portrait";
            } else if (i2 != 2) {
                str = "unknown";
            }
            if (!"unknown".equals(str)) {
                bundle.putString("native_image_orientation", str);
            }
            bundle.putBoolean("native_multiple_images", zzbltVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbltVar.zzg);
            int i3 = zzbltVar.zzi;
            if (i3 != 0) {
                bundle.putBoolean("sccg_tap", zzbltVar.zzj);
                bundle.putInt("sccg_dir", i3);
            }
        }
        android.content.pm.PackageInfo packageInfo = this.zzb;
        int i4 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i4 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i4);
        }
        org.json.JSONObject zzs = zzgVar.zzs();
        java.lang.String str3 = null;
        if (zzs != null && (optJSONArray = zzs.optJSONArray(zzfkyVar.zzg)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i5 = zzfkyVar.zzl;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        com.google.android.gms.internal.ads.zzbsb zzbsbVar = zzfkyVar.zzb;
        if (zzbsbVar != null) {
            java.lang.String str4 = zzbsbVar.zzc;
            if (android.text.TextUtils.isEmpty(str4)) {
                java.lang.String str5 = "p";
                if (zzbsbVar.zza >= 2) {
                    int i6 = zzbsbVar.zzd;
                    if (i6 != 2) {
                    }
                    str5 = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE;
                    bundle.putString("ia_var", str5);
                } else {
                    int i7 = zzbsbVar.zzb;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i7).length() + 41);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i7);
                            sb.append(" is wrong.");
                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb.toString());
                        }
                        bundle.putString("ia_var", str5);
                    }
                    str5 = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE;
                    bundle.putString("ia_var", str5);
                }
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznp)).booleanValue() || zzbltVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbltVar.zzf;
        if (zzfwVar != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("startMuted", zzfwVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzfwVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbltVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbltVar.zze);
    }
}
