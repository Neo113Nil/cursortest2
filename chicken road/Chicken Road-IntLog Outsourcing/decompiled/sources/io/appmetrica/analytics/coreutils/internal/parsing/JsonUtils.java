package io.appmetrica.analytics.coreutils.internal.parsing;

import A4.g;
import K1.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.C1573b;

/* loaded from: classes.dex */
public final class JsonUtils {
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean equals;
        if (!g.Q(g.N(jSONObject.keys())).equals(g.Q(g.N(jSONObject2.keys())))) {
            return false;
        }
        for (String str : g.N(jSONObject.keys())) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!(obj2 instanceof JSONObject)) {
                    return false;
                }
                equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
            } else if (!(obj instanceof JSONArray)) {
                equals = obj.equals(obj2);
            } else {
                if (!(obj2 instanceof JSONArray)) {
                    return false;
                }
                equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public static final boolean optBooleanOrDefault(JSONObject jSONObject, String str, boolean z) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull != null ? optBooleanOrNull.booleanValue() : z;
    }

    public static final Boolean optBooleanOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Boolean optBooleanOrNullable(JSONObject jSONObject, String str, Boolean bool) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull == null ? bool : optBooleanOrNull;
    }

    public static final float optFloatOrDefault(JSONObject jSONObject, String str, float f3) {
        Float optFloatOrNull = optFloatOrNull(jSONObject, str);
        return optFloatOrNull != null ? optFloatOrNull.floatValue() : f3;
    }

    public static final Float optFloatOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Float.valueOf((float) jSONObject.getDouble(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final byte[] optHexByteArray(JSONObject jSONObject, String str, byte[] bArr) {
        String optStringOrNull;
        byte[] bArr2;
        if (jSONObject == null || (optStringOrNull = optStringOrNull(jSONObject, str)) == null) {
            return bArr;
        }
        try {
            bArr2 = StringUtils.hexToBytes(optStringOrNull);
        } catch (Throwable unused) {
            bArr2 = null;
        }
        return bArr2 != null ? bArr2 : bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String str, byte[] bArr, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    public static final Integer optIntOrDefault(JSONObject jSONObject, String str, Integer num) {
        Integer optIntOrNull = optIntOrNull(jSONObject, str);
        return optIntOrNull == null ? num : optIntOrNull;
    }

    public static final Integer optIntOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final JSONObject optJsonObjectOrDefault(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final JSONObject optJsonObjectOrNull(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static final JSONObject optJsonObjectOrNullable(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final Long optLongOrDefault(JSONObject jSONObject, String str, Long l2) {
        Long optLongOrNull = optLongOrNull(jSONObject, str);
        return optLongOrNull == null ? l2 : optLongOrNull;
    }

    public static final Long optLongOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String optStringOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String optStringOrNullable(JSONObject jSONObject, String str, String str2) {
        String optStringOrNull = optStringOrNull(jSONObject, str);
        return optStringOrNull == null ? str2 : optStringOrNull;
    }

    public static final boolean isEqualTo(JSONArray jSONArray, JSONArray jSONArray2) {
        boolean equals;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        Iterable s02 = b.s0(0, jSONArray.length());
        if (!(s02 instanceof Collection) || !((Collection) s02).isEmpty()) {
            Iterator it = s02.iterator();
            while (((C1573b) it).f12444c) {
                int a6 = ((C1573b) it).a();
                Object obj = jSONArray.get(a6);
                Object obj2 = jSONArray2.get(a6);
                if (obj instanceof JSONObject) {
                    if (!(obj2 instanceof JSONObject)) {
                        return false;
                    }
                    equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                } else if (obj instanceof JSONArray) {
                    if (!(obj2 instanceof JSONArray)) {
                        return false;
                    }
                    equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
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
