package com.paypal.oslo.feature.activity.domain.common.actions.handler.pay;

/* loaded from: classes10.dex */
public final class PayActionHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighResolutionOutputSizeshNQ4ISI;

    private PayActionHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler(activityComposeConfig);
    }
}
