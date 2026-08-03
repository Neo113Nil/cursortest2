package com.yandex.varioqub.config;

/* loaded from: classes.dex */
public interface VarioqubApi {

    public static final class DefaultImpls {
        public static /* synthetic */ void activateConfig$default(com.yandex.varioqub.config.VarioqubApi varioqubApi, s1.InterfaceC0991a interfaceC0991a, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activateConfig");
            }
            if ((i2 & 1) != 0) {
                interfaceC0991a = null;
            }
            varioqubApi.activateConfig(interfaceC0991a);
        }

        public static /* synthetic */ boolean getBoolean$default(com.yandex.varioqub.config.VarioqubApi varioqubApi, java.lang.String str, boolean z2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            return varioqubApi.getBoolean(str, z2);
        }

        public static /* synthetic */ double getDouble$default(com.yandex.varioqub.config.VarioqubApi varioqubApi, java.lang.String str, double d2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDouble");
            }
            if ((i2 & 2) != 0) {
                d2 = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
            }
            return varioqubApi.getDouble(str, d2);
        }

        public static /* synthetic */ long getLong$default(com.yandex.varioqub.config.VarioqubApi varioqubApi, java.lang.String str, long j2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i2 & 2) != 0) {
                j2 = 0;
            }
            return varioqubApi.getLong(str, j2);
        }

        public static /* synthetic */ java.lang.String getString$default(com.yandex.varioqub.config.VarioqubApi varioqubApi, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i2 & 2) != 0) {
                str2 = "";
            }
            return varioqubApi.getString(str, str2);
        }

        public static /* synthetic */ void setDefaults$default(com.yandex.varioqub.config.VarioqubApi varioqubApi, int i2, s1.InterfaceC0991a interfaceC0991a, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDefaults");
            }
            if ((i3 & 2) != 0) {
                interfaceC0991a = null;
            }
            varioqubApi.setDefaults(i2, interfaceC0991a);
        }
    }

    void activateConfig(s1.InterfaceC0991a interfaceC0991a);

    void clearClientFeatures();

    void fetchConfig(com.yandex.varioqub.config.OnFetchCompleteListener onFetchCompleteListener);

    java.util.Set<java.lang.String> getAllKeys();

    boolean getBoolean(java.lang.String str, boolean z2);

    double getDouble(java.lang.String str, double d2);

    java.lang.String getId();

    long getLong(java.lang.String str, long j2);

    java.lang.String getString(java.lang.String str, java.lang.String str2);

    com.yandex.varioqub.config.model.ConfigValue getValue(java.lang.String str);

    void init(com.yandex.varioqub.config.VarioqubSettings varioqubSettings, com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter varioqubConfigAdapter, android.content.Context context);

    void putClientFeature(java.lang.String str, java.lang.String str2);

    void setDefaults(int i2, s1.InterfaceC0991a interfaceC0991a);

    void setDefaults(java.util.Map<java.lang.String, ? extends java.lang.Object> map);
}
