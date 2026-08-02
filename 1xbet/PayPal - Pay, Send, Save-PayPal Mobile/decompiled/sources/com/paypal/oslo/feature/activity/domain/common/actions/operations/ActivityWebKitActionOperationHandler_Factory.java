package com.paypal.oslo.feature.activity.domain.common.actions.operations;

/* loaded from: classes10.dex */
public final class ActivityWebKitActionOperationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoSizes;

    private ActivityWebKitActionOperationHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler(activityComposeConfig);
    }
}
