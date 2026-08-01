package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἶ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1042 {

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3091;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3092;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f3093;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3094;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f3095;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public HashMap f3096;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public C1074 f3097;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public E f3098;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public String f3099;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f3100;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f3101;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3102;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f3103;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f3104;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1074 f3105;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f3106;

    static {
        StringFog.decrypt("bs9fPLJBr7lf4148sUu8\n", "LaAxUtci29Y=\n");
        StringFog.decrypt("67OcbA==\n", "hdLxCUW49Dw=\n");
        StringFog.decrypt("mn5Q4rI5br2fekY=\n", "/hcjkt5YF/M=\n");
        StringFog.decrypt("kLpJfqvToQ==\n", "5t87DcK8z/8=\n");
        StringFog.decrypt("8AROK4L5\n", "nW0geOaSQzI=\n");
        StringFog.decrypt("OkoquKf3\n", "VytS68Ocnac=\n");
        f3095 = StringFog.decrypt("EQUc6sMk3qsMFSHb3hbQoQwS\n", "YmF3vqxluc4=\n");
        f3094 = StringFog.decrypt("4Y9QOGVblvzl\n", "luoybgw+4bY=\n");
        f3093 = StringFog.decrypt("l21gPbVq\n", "9AIOTsEZv2U=\n");
        StringFog.decrypt("gCXe/SloNJWJOsXs\n", "50mxn0gEd/o=\n");
        f3092 = StringFog.decrypt("IBfxP7Z6og==\n", "TXKcXdMI0WQ=\n");
        f3091 = StringFog.decrypt("0hsMLaGcbdbN\n", "vnJ/WcTyCKQ=\n");
        StringFog.decrypt("cuZf6RpqNfI=\n", "E4IZgH8GUYE=\n");
    }

    public C1042(String str, C1074 c1074) {
        this.f3106 = new JSONObject();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3106 = jSONObject;
            this.f3105 = c1074;
            this.f3104 = jSONObject.optString(StringFog.decrypt("S0rR0Q==\n", "JSu8tBFfGwM=\n"));
            this.f3103 = jSONObject.optString(StringFog.decrypt("JjzAwC+cfTojONY=\n", "QlWzsEP9BHQ=\n"));
            this.f3102 = jSONObject.optString(StringFog.decrypt("3YdRx9+2Fg==\n", "q+IjtLbZeKA=\n"));
            this.f3101 = jSONObject.optString(StringFog.decrypt("7l/V0Tw8\n", "gza7glhX/2w=\n"));
            this.f3100 = jSONObject.optString(StringFog.decrypt("BuDOp87d\n", "a4G29Kq2/i8=\n"));
            if (jSONObject.has(StringFog.decrypt("FtPmW6imieIfzP1K\n", "cb+JOcnKyo0=\n"))) {
                JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("GmlaGaFlIMcTdkEI\n", "fQU1e8AJY6g=\n"));
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f3105.m5838(next, optJSONObject.opt(next));
                }
            }
        } catch (Throwable th) {
            AbstractC1086.m5875(this.f3104, StringFog.decrypt("HbXmlJpo5l49puCShi+lTzep+p6LPOpeeKT7lY4h4g==\n", "WMeU++hIhSw=\n"), th, null);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap m5814() {
        HashMap hashMap;
        String str = f3091;
        if (this.f3096 == null) {
            JSONObject optJSONObject = this.f3106.optJSONObject(str);
            if (optJSONObject != null) {
                hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, new C1307(this.f3104, next, optJSONObject.optJSONObject(next)));
                }
            } else {
                hashMap = null;
            }
            this.f3096 = hashMap;
        }
        return this.f3096;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1074 m5815() {
        ArrayList arrayList;
        if (this.f3097 == null) {
            C1074 c1074 = new C1074(AbstractC0647.m5603(this.f3106.optJSONObject(f3093), new C1061(this)), this.f3105, true);
            this.f3097 = c1074;
            JSONArray optJSONArray = this.f3106.optJSONArray(f3092);
            if (optJSONArray != null) {
                arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String m5923 = AbstractC1212.m5923(optJSONArray.optString(i));
                    if (m5923 != null) {
                        arrayList.add(m5923);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c1074.f3185.put((String) it.next(), null);
                }
            }
        }
        return this.f3097;
    }
}
