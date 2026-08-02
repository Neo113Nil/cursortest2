package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper;

/* loaded from: classes14.dex */
public final class ActivityDetailUiModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> getHighSpeedVideoSizes;

    private ActivityDetailUiModelMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper(dateFormatterFacade, currencyFormatterFacade, phoneNumberFormatterFacade);
    }
}
