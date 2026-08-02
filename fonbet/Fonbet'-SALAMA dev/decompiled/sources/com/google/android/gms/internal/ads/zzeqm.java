package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.L;
import I2.M;
import J2.j;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.ProfilingTraceData;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeqm implements zzesg {
    private final zzfba zza;
    private final PackageInfo zzb;
    private final L zzc;

    public zzeqm(zzfba zzfbaVar, PackageInfo packageInfo, L l7) {
        this.zza = zzfbaVar;
        this.zzb = packageInfo;
        this.zzc = l7;
    }

    private final void zzc(Bundle bundle) {
        zzbey zzbeyVar = this.zza.zzi;
        if (zzbeyVar == null || zzbeyVar.zzi == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbeyVar.zzj);
        bundle.putInt("sccg_dir", this.zza.zzi.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcts zzctsVar = (zzcts) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzctsVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        int i7;
        JSONObject jSONObject;
        zzbey zzbeyVar;
        String str;
        JSONArray optJSONArray;
        ArrayList<String> arrayList = this.zza.zzg;
        zzcts zzctsVar = (zzcts) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzctsVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzctsVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zza.zzh);
        zzbey zzbeyVar2 = this.zza.zzi;
        if (zzbeyVar2 != null) {
            if (zzbeyVar2.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i8 = this.zza.zzi.zzh;
                String str2 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i9 = this.zza.zzi.zzc;
            String str3 = i9 != 0 ? i9 != 1 ? i9 != 2 ? "unknown" : "landscape" : "portrait" : "any";
            if (!"unknown".equals(str3)) {
                bundle.putString("native_image_orientation", str3);
            }
            bundle.putBoolean("native_multiple_images", this.zza.zzi.zzd);
            bundle.putBoolean("use_custom_mute", this.zza.zzi.zzg);
            zzc(zzctsVar.zza);
        }
        PackageInfo packageInfo = this.zzb;
        int i10 = packageInfo != null ? packageInfo.versionCode : 0;
        M m7 = (M) this.zzc;
        m7.l();
        synchronized (m7.f3551a) {
            i7 = m7.f3567r;
        }
        if (i10 > i7) {
            M m8 = (M) this.zzc;
            m8.l();
            synchronized (m8.f3551a) {
                try {
                    m8.f3569t = new JSONObject();
                    SharedPreferences.Editor editor = m8.f3557g;
                    if (editor != null) {
                        editor.remove("native_advanced_settings");
                        m8.f3557g.apply();
                    }
                    m8.m();
                } finally {
                }
            }
            M m9 = (M) this.zzc;
            m9.l();
            synchronized (m9.f3551a) {
                try {
                    if (m9.f3567r != i10) {
                        m9.f3567r = i10;
                        SharedPreferences.Editor editor2 = m9.f3557g;
                        if (editor2 != null) {
                            editor2.putInt(ProfilingTraceData.JsonKeys.VERSION_CODE, i10);
                            m9.f3557g.apply();
                        }
                        m9.m();
                    }
                } finally {
                }
            }
        }
        M m10 = (M) this.zzc;
        m10.l();
        synchronized (m10.f3551a) {
            jSONObject = m10.f3569t;
        }
        String str4 = null;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(this.zza.zzf)) != null) {
            str4 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("native_advanced_settings", str4);
        }
        int i11 = this.zza.zzk;
        if (i11 > 1) {
            bundle.putInt("max_num_ads", i11);
        }
        zzblj zzbljVar = this.zza.zzb;
        if (zzbljVar != null) {
            if (TextUtils.isEmpty(zzbljVar.zzc)) {
                if (zzbljVar.zza >= 2) {
                    int i12 = zzbljVar.zzd;
                    str = i12 != 2 ? i12 != 3 ? "l" : "p" : "l";
                } else {
                    int i13 = zzbljVar.zzb;
                    if (i13 != 1) {
                        if (i13 != 2) {
                            j.d("Instream ad video aspect ratio " + i13 + " is wrong.");
                        } else {
                            str = "p";
                        }
                    }
                    str = "l";
                }
                bundle.putString("ia_var", str);
            } else {
                bundle.putString("ad_tag", zzbljVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlQ)).booleanValue() || (zzbeyVar = this.zza.zzi) == null) {
            return;
        }
        if (zzbeyVar.zzf != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", this.zza.zzi.zzf.f10736a);
            bundle2.putBoolean("clickToExpandRequested", this.zza.zzi.zzf.f10738c);
            bundle2.putBoolean("customControlsRequested", this.zza.zzi.zzf.f10737b);
            bundle.putBundle(RRWebVideoEvent.EVENT_TAG, bundle2);
        }
        bundle.putBoolean("disable_image_loading", this.zza.zzi.zzb);
        bundle.putInt("preferred_ad_choices_position", this.zza.zzi.zze);
    }
}
