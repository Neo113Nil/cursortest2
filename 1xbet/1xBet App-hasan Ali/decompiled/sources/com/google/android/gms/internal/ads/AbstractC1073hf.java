package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1073hf {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13768a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13769b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(Lq lq) {
        A7 a7 = F7.T4;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && lq.f10482T) {
            Hq hq = lq.f10484V;
            hq.getClass();
            if (((JSONObject) hq.f9491l).optBoolean((String) rVar.f5056c.a(F7.V4), true) && lq.f10491b != 4) {
                int i = hq.g() == 1 ? 3 : 1;
                String str = lq.f10510l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", AbstractC0467k.p(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e3) {
                    U2.j.j("Unable to build OMID ENV JSON", e3);
                }
            }
        }
        return null;
    }

    public static String b(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f13768a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!f13769b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
