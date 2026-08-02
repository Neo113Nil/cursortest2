package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutModule_ProvideJsonFactory implements dagger.internal.Factory<kotlinx.serialization.json.Json> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.serialization.json.Json get() {
        return provideJson();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideJsonFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideJsonFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static kotlinx.serialization.json.Json provideJson() {
        return (kotlinx.serialization.json.Json) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule.INSTANCE.provideJson());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideJsonFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideJsonFactory();

        private InstanceHolder() {
        }
    }
}
