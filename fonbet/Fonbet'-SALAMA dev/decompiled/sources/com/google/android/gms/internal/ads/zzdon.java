package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdon {
    public static String zza(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (zzb(optJSONArray2, str) && !zzb(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    private static boolean zzb(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                String optString = jSONArray.optString(i7);
                try {
                } catch (PatternSyntaxException e7) {
                    o.f1952C.f1961g.zzw(e7, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if ((((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkU)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
