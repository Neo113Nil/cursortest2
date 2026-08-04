package com.google.android.gms.internal.ads;

import Y4.D;
import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzfak {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfak(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObjectF0 = D.F0(jsonReader);
        this.zzd = jSONObjectF0;
        this.zza = jSONObjectF0.optString("ad_html", null);
        this.zzb = jSONObjectF0.optString("ad_base_url", null);
        this.zzc = jSONObjectF0.optJSONObject("ad_json");
    }
}
