package com.google.android.gms.internal.ads;

import Y4.D;
import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfak {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfak(JsonReader jsonReader) {
        JSONObject F02 = D.F0(jsonReader);
        this.zzd = F02;
        this.zza = F02.optString("ad_html", null);
        this.zzb = F02.optString("ad_base_url", null);
        this.zzc = F02.optJSONObject("ad_json");
    }
}
