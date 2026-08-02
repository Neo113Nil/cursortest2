package com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase;

/* loaded from: classes13.dex */
public final class HandleSilentPushUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase> {
    private final dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser> getHighSpeedVideoFpsRangesFor;

    private HandleSilentPushUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser> provider, dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler>> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser> provider, dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler>> provider2) {
        return new com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase newInstance(com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser silentPushPayloadParser, java.util.Map<java.lang.String, com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler> map) {
        return new com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase(silentPushPayloadParser, map);
    }
}
