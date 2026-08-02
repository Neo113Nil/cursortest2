package org.jose4j.json;

/* loaded from: classes18.dex */
public class JsonHeaderUtil {
    public static java.util.Map<java.lang.String, java.lang.Object> parseJson(java.lang.String str) throws org.jose4j.lang.JoseException {
        return org.jose4j.json.JsonUtil.parseJson(str);
    }

    public static java.lang.String toJson(java.util.Map<java.lang.String, ?> map) {
        return org.jose4j.json.JsonUtil.toJson(map);
    }
}
