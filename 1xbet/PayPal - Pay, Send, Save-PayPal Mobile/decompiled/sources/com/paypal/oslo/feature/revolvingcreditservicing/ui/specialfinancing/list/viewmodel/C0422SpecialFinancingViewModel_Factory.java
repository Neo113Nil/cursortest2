package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0422SpecialFinancingViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory> getHighSpeedVideoSizes;

    private C0422SpecialFinancingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs) {
        return newInstance(this.getHighSpeedVideoSizes.get(), specialFinancingArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.C0422SpecialFinancingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.C0422SpecialFinancingViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory specialFinancingStateStoreFactory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs specialFinancingArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel(specialFinancingStateStoreFactory, specialFinancingArgs);
    }
}
