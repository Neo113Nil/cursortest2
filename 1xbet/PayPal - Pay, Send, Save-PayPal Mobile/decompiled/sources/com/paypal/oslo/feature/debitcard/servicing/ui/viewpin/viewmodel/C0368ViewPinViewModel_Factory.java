package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0368ViewPinViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer> getHighSpeedVideoSizes;

    private C0368ViewPinViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.C0368ViewPinViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase> provider2) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.C0368ViewPinViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer viewPinReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase getDebitPinUseCase) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel(str, viewPinReducer, getDebitPinUseCase);
    }
}
