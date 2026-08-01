package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbzz {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final String zze;
    public final int zzf;
    public final String zzg;
    public final Bundle zzh;

    public zzbzz(boolean z, String str, boolean z2, boolean z3, String str2, int i, String str3, String str4) {
        this.zza = z;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = z3;
        this.zze = str2;
        this.zzf = i;
        this.zzg = str3;
        Bundle bundle = null;
        if (!TextUtils.isEmpty(str4)) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbp.zzl(new JSONObject(str4));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PlayPrewarmOptions.parseHsdpExtraQueryParams");
            }
        }
        this.zzh = bundle;
    }

    public static zzbzz zza(JSONObject jSONObject) {
        return new zzbzz(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false), jSONObject.optBoolean("enable_hsdp_service", false), jSONObject.optString("target_package", ""), jSONObject.optInt("hsdp_invocation_callback_bitmask", 0), jSONObject.optString(Constants.REFERRER, ""), jSONObject.optString("extra_query_params", JsonUtils.EMPTY_JSON));
    }
}
