package com.paypal.oslo.core.companion.di;

/* loaded from: classes4.dex */
public final class CompanionModule_ProvideJsonFactory implements dagger.internal.Factory<kotlinx.serialization.json.Json> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.serialization.json.Json get() {
        return provideJson();
    }

    public static com.paypal.oslo.core.companion.di.CompanionModule_ProvideJsonFactory create() {
        return com.paypal.oslo.core.companion.di.CompanionModule_ProvideJsonFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.serialization.json.Json provideJson() {
        return (kotlinx.serialization.json.Json) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.companion.di.CompanionModule.INSTANCE.provideJson());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.companion.di.CompanionModule_ProvideJsonFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.companion.di.CompanionModule_ProvideJsonFactory();

        private InstanceHolder() {
        }
    }
}
