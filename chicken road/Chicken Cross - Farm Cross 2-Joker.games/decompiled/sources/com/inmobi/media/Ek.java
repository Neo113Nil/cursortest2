package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Ek {
    public static JSONObject a(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str3, str4);
        return jSONObject;
    }
}
