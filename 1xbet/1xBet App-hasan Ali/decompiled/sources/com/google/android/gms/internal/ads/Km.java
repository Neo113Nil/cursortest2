package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Km implements Ar {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f10243n = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: k, reason: collision with root package name */
    public final String f10244k;

    /* renamed from: l, reason: collision with root package name */
    public final Jr f10245l;

    /* renamed from: m, reason: collision with root package name */
    public final Mr f10246m;

    public Km(String str, Mr mr, Jr jr) {
        this.f10244k = str;
        this.f10246m = mr;
        this.f10245l = jr;
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public final Object k(Object obj) {
        String str;
        C0856cm c0856cm;
        JSONObject jSONObject;
        String str2;
        Jm jm = (Jm) obj;
        int optInt = jm.f10051a.optInt("http_timeout_millis", 60000);
        C1473qc c1473qc = jm.f10052b;
        int i = c1473qc.f15130g;
        Mr mr = this.f10246m;
        Jr jr = this.f10245l;
        str = "";
        if (i != -2) {
            if (i == 1) {
                List list = c1473qc.f15125a;
                if (list != null) {
                    str = TextUtils.join(", ", list);
                    U2.j.f(str);
                }
                c0856cm = new C0856cm("Error building request URL: ".concat(String.valueOf(str)), 2);
            } else {
                c0856cm = new C0856cm(1);
            }
            jr.f(c0856cm);
            jr.g(false);
            mr.a(jr);
            throw c0856cm;
        }
        HashMap hashMap = new HashMap();
        if (c1473qc.f15129e) {
            String str3 = this.f10244k;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8746Q0)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = "";
                    } else {
                        Matcher matcher = f10243n.matcher(str3);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        str2 = str2.concat("; ");
                                    }
                                    str2 = str2.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("Cookie", str2);
                    }
                } else {
                    hashMap.put("Cookie", str3);
                }
            }
        }
        if (c1473qc.f15128d && (jSONObject = jm.f10051a) != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                T2.G.m("DSID signal does not exist.");
            }
        }
        String str4 = c1473qc.f15127c;
        str = TextUtils.isEmpty(str4) ? "" : str4;
        jr.g(true);
        mr.a(jr);
        return new Hm(c1473qc.f, optInt, hashMap, str.getBytes(StandardCharsets.UTF_8), "");
    }
}
