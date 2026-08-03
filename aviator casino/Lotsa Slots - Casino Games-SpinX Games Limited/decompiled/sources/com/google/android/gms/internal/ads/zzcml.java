package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcml {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static java.lang.String zza(java.lang.String str, java.lang.String... strArr) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.regex.Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            java.lang.String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!zzb.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static java.lang.String zzb(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && zzfkfVar.zzT) {
            com.google.android.gms.internal.ads.zzflb zzflbVar = zzfkfVar.zzV;
            if (zzflbVar.zzb() && zzfkfVar.zzb != 4) {
                com.google.android.gms.internal.ads.zzelj zzeljVar = zzflbVar.zzc() == 1 ? com.google.android.gms.internal.ads.zzelj.VIDEO : com.google.android.gms.internal.ads.zzelj.HTML_DISPLAY;
                java.lang.String str = zzfkfVar.zzal;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("creativeType", zzeljVar.toString());
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (org.json.JSONException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build OMID ENV JSON", e);
                }
            }
        }
        return null;
    }
}
