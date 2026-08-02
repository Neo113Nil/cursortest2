package com.nimbusds.jose.util;

/* loaded from: classes4.dex */
public class JSONObjectUtils {
    private static final com.nimbusds.jose.shaded.gson.Gson GSON = new com.nimbusds.jose.shaded.gson.GsonBuilder().serializeNulls().setObjectToNumberStrategy(com.nimbusds.jose.shaded.gson.ToNumberPolicy.LONG_OR_DOUBLE).disableHtmlEscaping().create();

    public static java.util.Map<java.lang.String, java.lang.Object> parse(java.lang.String str) throws java.text.ParseException {
        return parse(str, -1);
    }

    public static java.util.Map<java.lang.String, java.lang.Object> parse(java.lang.String str, int i) throws java.text.ParseException {
        if (str.trim().isEmpty()) {
            throw new java.text.ParseException("Invalid JSON object", 0);
        }
        if (i >= 0 && str.length() > i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The parsed string is longer than the max accepted size of ");
            sb.append(i);
            sb.append(" characters");
            throw new java.text.ParseException(sb.toString(), 0);
        }
        try {
            return (java.util.Map) GSON.fromJson(str, com.nimbusds.jose.shaded.gson.reflect.TypeToken.getParameterized(java.util.Map.class, java.lang.String.class, java.lang.Object.class).getType());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid JSON: ");
            sb2.append(e.getMessage());
            throw new java.text.ParseException(sb2.toString(), 0);
        } catch (java.lang.StackOverflowError unused) {
            throw new java.text.ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    @java.lang.Deprecated
    public static java.util.Map<java.lang.String, java.lang.Object> parseJSONObject(java.lang.String str) throws java.text.ParseException {
        return parse(str);
    }

    private static <T> T getGeneric(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, java.lang.Class<T> cls) throws java.text.ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t = (T) map.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new java.text.ParseException("Unexpected type of JSON object member with key ".concat(java.lang.String.valueOf(str)), 0);
    }

    public static boolean getBoolean(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.Boolean bool = (java.lang.Boolean) getGeneric(map, str, java.lang.Boolean.class);
        if (bool == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key ");
            sb.append(str);
            sb.append(" is missing or null");
            throw new java.text.ParseException(sb.toString(), 0);
        }
        return bool.booleanValue();
    }

    public static int getInt(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.Number number = (java.lang.Number) getGeneric(map, str, java.lang.Number.class);
        if (number == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key ");
            sb.append(str);
            sb.append(" is missing or null");
            throw new java.text.ParseException(sb.toString(), 0);
        }
        return number.intValue();
    }

    public static long getLong(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.Number number = (java.lang.Number) getGeneric(map, str, java.lang.Number.class);
        if (number == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key ");
            sb.append(str);
            sb.append(" is missing or null");
            throw new java.text.ParseException(sb.toString(), 0);
        }
        return number.longValue();
    }

    public static float getFloat(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.Number number = (java.lang.Number) getGeneric(map, str, java.lang.Number.class);
        if (number == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key ");
            sb.append(str);
            sb.append(" is missing or null");
            throw new java.text.ParseException(sb.toString(), 0);
        }
        return number.floatValue();
    }

    public static double getDouble(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.Number number = (java.lang.Number) getGeneric(map, str, java.lang.Number.class);
        if (number == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key ");
            sb.append(str);
            sb.append(" is missing or null");
            throw new java.text.ParseException(sb.toString(), 0);
        }
        return number.doubleValue();
    }

    public static java.lang.String getString(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        return (java.lang.String) getGeneric(map, str, java.lang.String.class);
    }

    public static java.net.URI getURI(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.String string = getString(map, str);
        if (string == null) {
            return null;
        }
        try {
            return new java.net.URI(string);
        } catch (java.net.URISyntaxException e) {
            throw new java.text.ParseException(e.getMessage(), 0);
        }
    }

    public static java.util.List<java.lang.Object> getJSONArray(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        return (java.util.List) getGeneric(map, str, java.util.List.class);
    }

    public static java.lang.String[] getStringArray(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.util.List<java.lang.Object> jSONArray = getJSONArray(map, str);
        if (jSONArray == null) {
            return null;
        }
        try {
            return (java.lang.String[]) jSONArray.toArray(new java.lang.String[0]);
        } catch (java.lang.ArrayStoreException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key \"");
            sb.append(str);
            sb.append("\" is not an array of strings");
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object>[] getJSONObjectArray(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.util.List<java.lang.Object> jSONArray = getJSONArray(map, str);
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.isEmpty()) {
            return new java.util.HashMap[0];
        }
        for (java.lang.Object obj : jSONArray) {
            if (obj != null) {
                try {
                    if (obj instanceof java.util.HashMap) {
                        return (java.util.Map[]) jSONArray.toArray(new java.util.HashMap[0]);
                    }
                    if (obj instanceof com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap) {
                        return (java.util.Map[]) jSONArray.toArray(new com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap[0]);
                    }
                } catch (java.lang.ArrayStoreException unused) {
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key \"");
        sb.append(str);
        sb.append("\" is not an array of JSON objects");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public static java.util.List<java.lang.String> getStringList(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.String[] stringArray = getStringArray(map, str);
        if (stringArray == null) {
            return null;
        }
        return java.util.Arrays.asList(stringArray);
    }

    public static java.util.Map<java.lang.String, java.lang.Object> getJSONObject(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.util.Map<java.lang.String, java.lang.Object> map2 = (java.util.Map) getGeneric(map, str, java.util.Map.class);
        if (map2 == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> it = map2.keySet().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof java.lang.String)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON object member with key ");
                sb.append(str);
                sb.append(" not a JSON object");
                throw new java.text.ParseException(sb.toString(), 0);
            }
        }
        return map2;
    }

    public static com.nimbusds.jose.util.Base64URL getBase64URL(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws java.text.ParseException {
        java.lang.String string = getString(map, str);
        if (string == null) {
            return null;
        }
        return new com.nimbusds.jose.util.Base64URL(string);
    }

    public static java.lang.String toJSONString(java.util.Map<java.lang.String, ?> map) {
        return GSON.toJson(map);
    }

    public static java.util.Map<java.lang.String, java.lang.Object> newJSONObject() {
        return new java.util.HashMap();
    }

    private JSONObjectUtils() {
    }
}
