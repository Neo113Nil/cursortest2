package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class de extends com.ironsource.adqualitysdk.sdk.i.cw {
    /* renamed from: ﻐ, reason: contains not printable characters */
    public static int m7461(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.kn.m8467((java.lang.String) m7362(list, 0, java.lang.String.class), (java.lang.String) m7362(list, 1, java.lang.String.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m7462(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8048(m7362(list, 0, java.lang.Object.class), (java.util.List<java.lang.String>) m7362(list, 1, java.util.List.class), ((java.lang.Integer) m7362(list, 2, java.lang.Integer.class)).intValue());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m7463(java.util.List<java.lang.Object> list) {
        java.lang.String str = (java.lang.String) m7362(list, 0, java.lang.String.class);
        if (list.get(1) instanceof java.lang.String) {
            return com.ironsource.adqualitysdk.sdk.i.kn.m8477(str, (java.lang.String) m7362(list, 1, java.lang.String.class));
        }
        return com.ironsource.adqualitysdk.sdk.i.kn.m8472(str, new org.json.JSONArray((java.util.Collection) m7362(list, 1, java.util.List.class)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.lang.String m7465(java.util.List<java.lang.Object> list) {
        java.lang.String str = (java.lang.String) m7362(list, 0, java.lang.String.class);
        boolean booleanValue = list.size() > 2 ? ((java.lang.Boolean) m7362(list, 2, java.lang.Boolean.class)).booleanValue() : true;
        if (list.get(1) instanceof java.lang.String) {
            return com.ironsource.adqualitysdk.sdk.i.kn.m8476(str, (java.lang.String) m7362(list, 1, java.lang.String.class), booleanValue);
        }
        return com.ironsource.adqualitysdk.sdk.i.kn.m8471(str, new org.json.JSONArray((java.util.Collection) m7362(list, 1, java.util.List.class)), booleanValue);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m7464(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.kn.m8473((java.lang.String) m7362(list, 0, java.lang.String.class));
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static java.lang.String m7460(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.kn.m8475((java.lang.String) m7362(list, 0, java.lang.String.class));
    }
}
