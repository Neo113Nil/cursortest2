package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone;

/* loaded from: classes14.dex */
public final class PhoneNumberFormatterFacadeImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone.PhoneNumberFormatterFacadeImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> getHighSpeedVideoFpsRanges;

    private PhoneNumberFormatterFacadeImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone.PhoneNumberFormatterFacadeImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone.PhoneNumberFormatterFacadeImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone.PhoneNumberFormatterFacadeImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone.PhoneNumberFormatterFacadeImpl newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone.PhoneNumberFormatterFacadeImpl(formatPhoneNumberUseCase);
    }
}
