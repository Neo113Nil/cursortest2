package com.nimbusds.jose.util;

/* loaded from: classes10.dex */
public class JSONStringUtils {
    public static java.lang.String toJSONString(java.lang.String str) {
        return new com.nimbusds.jose.shaded.gson.Gson().toJson(str);
    }

    private JSONStringUtils() {
    }
}
