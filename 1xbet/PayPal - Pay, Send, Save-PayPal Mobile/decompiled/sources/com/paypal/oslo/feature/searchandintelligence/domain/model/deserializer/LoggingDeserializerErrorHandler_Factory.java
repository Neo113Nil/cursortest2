package com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer;

/* loaded from: classes14.dex */
public final class LoggingDeserializerErrorHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler_Factory create() {
        return com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler newInstance() {
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.LoggingDeserializerErrorHandler_Factory();

        private InstanceHolder() {
        }
    }
}
