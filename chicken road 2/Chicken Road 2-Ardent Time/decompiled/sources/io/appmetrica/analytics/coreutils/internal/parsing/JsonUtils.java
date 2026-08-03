package io.appmetrica.analytics.coreutils.internal.parsing;

/* loaded from: classes.dex */
public final class JsonUtils {
    public static final io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils();

    private JsonUtils() {
    }

    public static final boolean isEqualTo(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        boolean equals;
        if (!x1.d.G(x1.d.E(jSONObject.keys())).equals(x1.d.G(x1.d.E(jSONObject2.keys())))) {
            return false;
        }
        for (java.lang.String str : x1.d.E(jSONObject.keys())) {
            java.lang.Object obj = jSONObject.get(str);
            java.lang.Object obj2 = jSONObject2.get(str);
            if (obj instanceof org.json.JSONObject) {
                if (!(obj2 instanceof org.json.JSONObject)) {
                    return false;
                }
                equals = isEqualTo((org.json.JSONObject) obj, (org.json.JSONObject) obj2);
            } else if (!(obj instanceof org.json.JSONArray)) {
                equals = obj.equals(obj2);
            } else {
                if (!(obj2 instanceof org.json.JSONArray)) {
                    return false;
                }
                equals = isEqualTo((org.json.JSONArray) obj, (org.json.JSONArray) obj2);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public static final boolean optBooleanOrDefault(org.json.JSONObject jSONObject, java.lang.String str, boolean z2) {
        java.lang.Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull != null ? optBooleanOrNull.booleanValue() : z2;
    }

    public static final java.lang.Boolean optBooleanOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return java.lang.Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.Boolean optBooleanOrNullable(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Boolean bool) {
        java.lang.Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull == null ? bool : optBooleanOrNull;
    }

    public static final float optFloatOrDefault(org.json.JSONObject jSONObject, java.lang.String str, float f2) {
        java.lang.Float optFloatOrNull = optFloatOrNull(jSONObject, str);
        return optFloatOrNull != null ? optFloatOrNull.floatValue() : f2;
    }

    public static final java.lang.Float optFloatOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return java.lang.Float.valueOf((float) jSONObject.getDouble(str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final byte[] optHexByteArray(org.json.JSONObject jSONObject, java.lang.String str, byte[] bArr) {
        java.lang.String optStringOrNull;
        byte[] bArr2;
        if (jSONObject == null || (optStringOrNull = optStringOrNull(jSONObject, str)) == null) {
            return bArr;
        }
        try {
            bArr2 = io.appmetrica.analytics.coreutils.internal.StringUtils.hexToBytes(optStringOrNull);
        } catch (java.lang.Throwable unused) {
            bArr2 = null;
        }
        return bArr2 != null ? bArr2 : bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(org.json.JSONObject jSONObject, java.lang.String str, byte[] bArr, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    public static final java.lang.Integer optIntOrDefault(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Integer num) {
        java.lang.Integer optIntOrNull = optIntOrNull(jSONObject, str);
        return optIntOrNull == null ? num : optIntOrNull;
    }

    public static final java.lang.Integer optIntOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(jSONObject.getInt(str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final org.json.JSONObject optJsonObjectOrDefault(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONObject jSONObject2) {
        org.json.JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final org.json.JSONObject optJsonObjectOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static final org.json.JSONObject optJsonObjectOrNullable(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONObject jSONObject2) {
        org.json.JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final java.lang.Long optLongOrDefault(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Long l2) {
        java.lang.Long optLongOrNull = optLongOrNull(jSONObject, str);
        return optLongOrNull == null ? l2 : optLongOrNull;
    }

    public static final java.lang.Long optLongOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(jSONObject.getLong(str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.String optStringOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.String optStringOrNullable(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        java.lang.String optStringOrNull = optStringOrNull(jSONObject, str);
        return optStringOrNull == null ? str2 : optStringOrNull;
    }

    public static final boolean isEqualTo(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        boolean equals;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        java.lang.Iterable F2 = u0.AbstractC0995a.F(0, jSONArray.length());
        if (!(F2 instanceof java.util.Collection) || !((java.util.Collection) F2).isEmpty()) {
            java.util.Iterator it = F2.iterator();
            while (((v1.C1001b) it).f8392c) {
                int a2 = ((v1.C1001b) it).a();
                java.lang.Object obj = jSONArray.get(a2);
                java.lang.Object obj2 = jSONArray2.get(a2);
                if (obj instanceof org.json.JSONObject) {
                    if (!(obj2 instanceof org.json.JSONObject)) {
                        return false;
                    }
                    equals = isEqualTo((org.json.JSONObject) obj, (org.json.JSONObject) obj2);
                } else if (obj instanceof org.json.JSONArray) {
                    if (!(obj2 instanceof org.json.JSONArray)) {
                        return false;
                    }
                    equals = isEqualTo((org.json.JSONArray) obj, (org.json.JSONArray) obj2);
                } else {
                    equals = obj.equals(obj2);
                }
                if (!equals) {
                    return false;
                }
            }
        }
        return true;
    }
}
