package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel;

/* loaded from: classes14.dex */
public final class ChooseWayToPayInitializationMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper> getHighSpeedVideoFpsRanges;

    private ChooseWayToPayInitializationMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper fundingInstrumentUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware(fundingInstrumentUiModelMapper);
    }
}
