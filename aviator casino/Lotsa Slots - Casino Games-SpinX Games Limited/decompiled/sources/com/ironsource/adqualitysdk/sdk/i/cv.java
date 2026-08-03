package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class cv extends com.ironsource.adqualitysdk.sdk.i.cw {
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static java.lang.reflect.Field m7355(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7868((java.lang.Class) m7362(list, 0, java.lang.Class.class), (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static java.util.List<java.lang.reflect.Field> m7354(java.util.List<java.lang.Object> list) {
        if (list.get(0) instanceof java.lang.Class) {
            if (list.size() > 1) {
                return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7867((java.lang.Class) m7362(list, 0, java.lang.Class.class), (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class));
            }
        } else {
            java.lang.Object obj = m7362(list, 0, java.lang.Object.class);
            boolean booleanValue = list.size() > 1 ? ((java.lang.Boolean) m7362(list, 1, java.lang.Boolean.class)).booleanValue() : false;
            com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937();
            java.lang.reflect.Field[] m7864 = com.ironsource.adqualitysdk.sdk.i.hw.m7864(obj.getClass(), booleanValue, -1, null);
            if (m7864 != null) {
                return java.util.Arrays.asList(m7864);
            }
        }
        return new java.util.ArrayList();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.reflect.Field m7356(java.util.List<java.lang.Object> list) {
        if (list.get(0) instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) m7362(list, 0, java.lang.Class.class);
            if (list.get(1) instanceof java.lang.Class) {
                return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7866(cls, (java.lang.Class) m7362(list, 1, java.lang.Class.class));
            }
            return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7868(cls, (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class));
        }
        java.lang.Object obj = m7362(list, 0, java.lang.Object.class);
        return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7866(obj.getClass(), (java.lang.Class) m7362(list, 1, java.lang.Class.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.lang.reflect.Field m7358(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7865((java.lang.Class) m7362(list, 0, java.lang.Class.class), (java.lang.String) m7362(list, 1, java.lang.String.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static com.ironsource.adqualitysdk.sdk.i.hz.d m7357() {
        com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937();
        return com.ironsource.adqualitysdk.sdk.i.hw.m7861();
    }
}
