package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

/* loaded from: classes14.dex */
public final class PersistentDebtUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> getHighSpeedVideoFpsRanges;

    private PersistentDebtUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper(phoneNumberFormatterFacade);
    }
}
