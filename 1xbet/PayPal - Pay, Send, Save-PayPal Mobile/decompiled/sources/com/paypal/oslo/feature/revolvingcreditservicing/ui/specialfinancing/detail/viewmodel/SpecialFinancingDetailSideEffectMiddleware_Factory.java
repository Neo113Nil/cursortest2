package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel;

/* loaded from: classes14.dex */
public final class SpecialFinancingDetailSideEffectMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper> getHighSpeedVideoFpsRanges;

    private SpecialFinancingDetailSideEffectMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper specialFinancingDetailMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware(specialFinancingDetailMapper);
    }
}
