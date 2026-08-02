package com.paypal.oslo.core.i18n.di;

/* loaded from: classes4.dex */
public final class JsonHiltModule_ProvideJsonFactory implements dagger.internal.Factory<kotlinx.serialization.json.Json> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.serialization.json.Json get() {
        return provideJson();
    }

    public static com.paypal.oslo.core.i18n.di.JsonHiltModule_ProvideJsonFactory create() {
        return com.paypal.oslo.core.i18n.di.JsonHiltModule_ProvideJsonFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.serialization.json.Json provideJson() {
        return (kotlinx.serialization.json.Json) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.i18n.di.JsonHiltModule.INSTANCE.provideJson());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.di.JsonHiltModule_ProvideJsonFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.i18n.di.JsonHiltModule_ProvideJsonFactory();

        private InstanceHolder() {
        }
    }
}
