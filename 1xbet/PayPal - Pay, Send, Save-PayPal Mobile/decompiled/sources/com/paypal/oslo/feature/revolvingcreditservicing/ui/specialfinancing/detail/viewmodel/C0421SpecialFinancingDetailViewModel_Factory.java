package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0421SpecialFinancingDetailViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailReducer> getHighSpeedVideoFpsRangesFor;

    private C0421SpecialFinancingDetailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), promotionalActivity, creditProductIdentifier);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.C0421SpecialFinancingDetailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.C0421SpecialFinancingDetailViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailReducer specialFinancingDetailReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware specialFinancingDetailSideEffectMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel(specialFinancingDetailReducer, specialFinancingDetailSideEffectMiddleware, promotionalActivity, creditProductIdentifier);
    }
}
