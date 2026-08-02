package com.paypal.oslo.feature.subscriptions.details.ui.viewmodel;

/* renamed from: com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0431SubscriptionDetailViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase> getHighSpeedVideoSizes;

    private C0431SubscriptionDetailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel get(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), agreementType);
    }

    public static com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.C0431SubscriptionDetailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2) {
        return new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.C0431SubscriptionDetailViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel newInstance(com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase getConsumerAgreementUseCase, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel(getConsumerAgreementUseCase, formatHelper, agreementType);
    }
}
