package com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel;

/* loaded from: classes12.dex */
public final class ReplaceDigitalCardViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.C0364ReplaceDigitalCardViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private ReplaceDigitalCardViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.C0364ReplaceDigitalCardViewModel_Factory c0364ReplaceDigitalCardViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0364ReplaceDigitalCardViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        return this.getHighSpeedVideoFpsRangesFor.get(cardReplacementInfo);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.C0364ReplaceDigitalCardViewModel_Factory c0364ReplaceDigitalCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel_Factory_Impl(c0364ReplaceDigitalCardViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.C0364ReplaceDigitalCardViewModel_Factory c0364ReplaceDigitalCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel_Factory_Impl(c0364ReplaceDigitalCardViewModel_Factory));
    }
}
