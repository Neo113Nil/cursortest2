package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcfm {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(zzfaf zzfafVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfn)).booleanValue() && zzfafVar.zzT && zzfafVar.zzV.zzb() && zzfafVar.zzb != 4) {
            zzebi zzebiVar = zzfafVar.zzV.zzc() == 1 ? zzebi.VIDEO : zzebi.HTML_DISPLAY;
            String str = zzfafVar.zzal;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("creativeType", zzebiVar.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e7) {
                int i7 = J.f3546b;
                j.h("Unable to build OMID ENV JSON", e7);
            }
        }
        return null;
    }

    public static String zzb(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
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
}
