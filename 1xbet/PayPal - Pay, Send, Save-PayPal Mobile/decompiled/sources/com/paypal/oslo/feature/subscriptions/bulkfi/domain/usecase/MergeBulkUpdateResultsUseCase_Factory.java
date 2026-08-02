package com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase;

/* loaded from: classes15.dex */
public final class MergeBulkUpdateResultsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase_Factory create() {
        return com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase newInstance() {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
