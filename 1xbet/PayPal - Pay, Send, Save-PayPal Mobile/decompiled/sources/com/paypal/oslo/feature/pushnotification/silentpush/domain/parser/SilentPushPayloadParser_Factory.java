package com.paypal.oslo.feature.pushnotification.silentpush.domain.parser;

/* loaded from: classes13.dex */
public final class SilentPushPayloadParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser_Factory create() {
        return com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser newInstance() {
        return new com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser_Factory();

        private InstanceHolder() {
        }
    }
}
