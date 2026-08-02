package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

/* loaded from: classes14.dex */
public final class SpecialFinancingViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.C0422SpecialFinancingViewModel_Factory getHighSpeedVideoFpsRanges;

    private SpecialFinancingViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.C0422SpecialFinancingViewModel_Factory c0422SpecialFinancingViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0422SpecialFinancingViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs) {
        return this.getHighSpeedVideoFpsRanges.get(specialFinancingArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.C0422SpecialFinancingViewModel_Factory c0422SpecialFinancingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel_Factory_Impl(c0422SpecialFinancingViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.C0422SpecialFinancingViewModel_Factory c0422SpecialFinancingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel_Factory_Impl(c0422SpecialFinancingViewModel_Factory));
    }
}
