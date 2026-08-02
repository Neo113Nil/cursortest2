package org.jose4j.lang;

/* loaded from: classes18.dex */
public class JsonHelp {
    public static java.lang.String getString(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
        return (java.lang.String) map.get(str);
    }

    public static java.lang.String getStringChecked(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
        java.lang.Object obj = map.get(str);
        try {
            return (java.lang.String) obj;
        } catch (java.lang.ClassCastException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(str);
            sb.append("' parameter was ");
            sb.append(jsonTypeName(obj));
            sb.append(" type but is required to be a String.");
            throw new org.jose4j.lang.JoseException(sb.toString());
        }
    }

    public static java.util.List<java.lang.String> getStringArray(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
        return (java.util.List) map.get(str);
    }

    public static org.jose4j.jwt.IntDate getIntDate(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
        return org.jose4j.jwt.IntDate.fromSeconds(getLong(map, str).longValue());
    }

    public static java.lang.Long getLong(java.util.Map<java.lang.String, ?> map, java.lang.String str) {
        java.lang.Object obj = map.get(str);
        if (obj != null) {
            return java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
        }
        return null;
    }

    public static java.lang.String jsonTypeName(java.lang.Object obj) {
        if (obj instanceof java.lang.Number) {
            return "Number";
        }
        if (obj instanceof java.lang.Boolean) {
            return "Boolean";
        }
        if (obj instanceof java.util.List) {
            return "Array";
        }
        if (obj instanceof java.util.Map) {
            return "Object";
        }
        if (obj instanceof java.lang.String) {
            return "String";
        }
        return "unknown";
    }
}
