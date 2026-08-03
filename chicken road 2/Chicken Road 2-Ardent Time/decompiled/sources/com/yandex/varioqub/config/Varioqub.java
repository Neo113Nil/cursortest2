package com.yandex.varioqub.config;

/* loaded from: classes.dex */
public final class Varioqub {
    public static final com.yandex.varioqub.config.Varioqub INSTANCE = new com.yandex.varioqub.config.Varioqub();

    /* renamed from: a, reason: collision with root package name */
    private static final h1.InterfaceC0171c f2636a = Q1.l.q(com.yandex.varioqub.config.impl.A.f2650a);

    private Varioqub() {
    }

    public static final void activateConfig(s1.InterfaceC0991a interfaceC0991a) {
        getInstance().activateConfig(interfaceC0991a);
    }

    public static /* synthetic */ void activateConfig$default(s1.InterfaceC0991a interfaceC0991a, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC0991a = null;
        }
        activateConfig(interfaceC0991a);
    }

    public static final void clearClientFeatures() {
        getInstance().clearClientFeatures();
    }

    public static final void fetchConfig(com.yandex.varioqub.config.OnFetchCompleteListener onFetchCompleteListener) {
        getInstance().fetchConfig(onFetchCompleteListener);
    }

    public static final java.util.Set<java.lang.String> getAllKeys() {
        return getInstance().getAllKeys();
    }

    public static final boolean getBoolean(java.lang.String str, boolean z2) {
        return getInstance().getBoolean(str, z2);
    }

    public static /* synthetic */ boolean getBoolean$default(java.lang.String str, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return getBoolean(str, z2);
    }

    public static final double getDouble(java.lang.String str, double d2) {
        return getInstance().getDouble(str, d2);
    }

    public static /* synthetic */ double getDouble$default(java.lang.String str, double d2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            d2 = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        return getDouble(str, d2);
    }

    public static final java.lang.String getId() {
        return getInstance().getId();
    }

    public static final com.yandex.varioqub.config.VarioqubApi getInstance() {
        INSTANCE.getClass();
        return (com.yandex.varioqub.config.impl.B) ((h1.C0175g) f2636a).a();
    }

    public static final long getLong(java.lang.String str, long j2) {
        return getInstance().getLong(str, j2);
    }

    public static /* synthetic */ long getLong$default(java.lang.String str, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return getLong(str, j2);
    }

    public static final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return getInstance().getString(str, str2);
    }

    public static /* synthetic */ java.lang.String getString$default(java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        return getString(str, str2);
    }

    public static final com.yandex.varioqub.config.model.ConfigValue getValue(java.lang.String str) {
        return getInstance().getValue(str);
    }

    public static final void init(com.yandex.varioqub.config.VarioqubSettings varioqubSettings, com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter varioqubConfigAdapter, android.content.Context context) {
        getInstance().init(varioqubSettings, varioqubConfigAdapter, context);
    }

    public static final void putClientFeature(java.lang.String str, java.lang.String str2) {
        getInstance().putClientFeature(str, str2);
    }

    public static final void setDefaults(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        getInstance().setDefaults(map);
    }

    public static /* synthetic */ void setDefaults$default(int i2, s1.InterfaceC0991a interfaceC0991a, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC0991a = null;
        }
        setDefaults(i2, interfaceC0991a);
    }

    public static final void setDefaults(int i2, s1.InterfaceC0991a interfaceC0991a) {
        getInstance().setDefaults(i2, interfaceC0991a);
    }
}
