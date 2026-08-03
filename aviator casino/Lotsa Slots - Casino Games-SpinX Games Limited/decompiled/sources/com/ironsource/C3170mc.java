package com.ironsource;

/* renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3170mc {

    /* renamed from: com.ironsource.mc$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3170mc.a f6389a = new com.ironsource.C3170mc.a();
        public static final java.lang.String b = "SDKPluginType";
        public static final java.lang.String c = "sessionid";

        private a() {
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> a() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String pluginType = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(com.ironsource.C3170mc.a.b, pluginType);
        }
        java.lang.String d = com.ironsource.mediationsdk.utils.IronSourceUtils.d();
        if (d != null) {
            linkedHashMap.put("sessionid", d);
        }
        return linkedHashMap;
    }
}
