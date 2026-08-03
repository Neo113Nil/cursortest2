package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdxj {
    public static java.lang.String zza(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        org.json.JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    org.json.JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (zzb(optJSONArray2, str) && !zzb(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    private static boolean zzb(org.json.JSONArray jSONArray, java.lang.String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String optString = jSONArray.optString(i);
                try {
                } catch (java.util.regex.PatternSyntaxException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmq)).booleanValue() ? java.util.regex.Pattern.compile(optString, 2) : java.util.regex.Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
