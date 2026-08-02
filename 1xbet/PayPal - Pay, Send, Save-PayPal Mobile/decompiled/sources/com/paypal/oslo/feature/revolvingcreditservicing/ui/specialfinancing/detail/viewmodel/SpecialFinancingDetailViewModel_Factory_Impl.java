package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel;

/* loaded from: classes14.dex */
public final class SpecialFinancingDetailViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.C0421SpecialFinancingDetailViewModel_Factory getHighSpeedVideoFpsRanges;

    private SpecialFinancingDetailViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.C0421SpecialFinancingDetailViewModel_Factory c0421SpecialFinancingDetailViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0421SpecialFinancingDetailViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoFpsRanges.get(promotionalActivity, creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.C0421SpecialFinancingDetailViewModel_Factory c0421SpecialFinancingDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel_Factory_Impl(c0421SpecialFinancingDetailViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.C0421SpecialFinancingDetailViewModel_Factory c0421SpecialFinancingDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel_Factory_Impl(c0421SpecialFinancingDetailViewModel_Factory));
    }
}
