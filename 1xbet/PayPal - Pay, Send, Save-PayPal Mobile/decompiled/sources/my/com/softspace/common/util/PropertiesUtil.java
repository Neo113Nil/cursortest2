package my.com.softspace.common.util;

/* loaded from: classes17.dex */
public class PropertiesUtil {
    public static java.util.Properties fromAssets(android.content.Context context, java.lang.String... strArr) {
        java.util.Objects.requireNonNull(context);
        java.util.Objects.requireNonNull(strArr);
        if (strArr.length == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.Properties properties = new java.util.Properties();
        java.io.IOException e = null;
        for (java.lang.String str : strArr) {
            try {
                properties.load(context.getAssets().open(str));
            } catch (java.io.IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return properties;
        }
        throw new java.lang.RuntimeException(e);
    }

    public static java.lang.String getString(java.util.Properties properties, java.lang.String str) {
        java.lang.String property = properties.getProperty(str);
        java.util.Objects.requireNonNull(property);
        return property;
    }

    public static java.lang.Integer getInteger(java.util.Properties properties, java.lang.String str) {
        return java.lang.Integer.valueOf(getString(properties, str));
    }

    public static java.lang.Long getLong(java.util.Properties properties, java.lang.String str) {
        return java.lang.Long.valueOf(getString(properties, str));
    }

    public static java.lang.Double getDouble(java.util.Properties properties, java.lang.String str) {
        return java.lang.Double.valueOf(getString(properties, str));
    }

    public static java.lang.Float getFloat(java.util.Properties properties, java.lang.String str) {
        return java.lang.Float.valueOf(getString(properties, str));
    }

    public static java.lang.Boolean getBoolean(java.util.Properties properties, java.lang.String str) {
        return java.lang.Boolean.valueOf(getString(properties, str));
    }

    public static java.lang.String optString(java.util.Properties properties, java.lang.String str, java.lang.String str2) {
        return properties.getProperty(str, str2);
    }

    public static java.lang.Integer optInteger(java.util.Properties properties, java.lang.String str, java.lang.Integer num) {
        return java.lang.Integer.valueOf(optString(properties, str, num == null ? "0" : num.toString()));
    }

    public static java.lang.Long optLong(java.util.Properties properties, java.lang.String str, java.lang.Long l) {
        return java.lang.Long.valueOf(optString(properties, str, l == null ? "0" : l.toString()));
    }

    public static java.lang.Double optDouble(java.util.Properties properties, java.lang.String str, java.lang.Double d) {
        return java.lang.Double.valueOf(optString(properties, str, d == null ? androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN : d.toString()));
    }

    public static java.lang.Float optFloat(java.util.Properties properties, java.lang.String str, java.lang.Float f) {
        return java.lang.Float.valueOf(optString(properties, str, f == null ? androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN : f.toString()));
    }

    public static java.lang.Boolean optBoolean(java.util.Properties properties, java.lang.String str, java.lang.Boolean bool) {
        return java.lang.Boolean.valueOf(optString(properties, str, bool == null ? "false" : bool.toString()));
    }
}
