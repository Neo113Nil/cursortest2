package com.paypal.oslo.feature.subscriptions.details.manage.ui;

/* loaded from: classes15.dex */
public final class ManageAgreementViewModel_Factory_Impl implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.Factory {
    private final com.paypal.oslo.feature.subscriptions.details.manage.ui.C0430ManageAgreementViewModel_Factory Camera2StreamConfigurationMap;

    private ManageAgreementViewModel_Factory_Impl(com.paypal.oslo.feature.subscriptions.details.manage.ui.C0430ManageAgreementViewModel_Factory c0430ManageAgreementViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0430ManageAgreementViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.Factory
    public final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel create(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination) {
        return this.Camera2StreamConfigurationMap.get(manageAgreementBottomSheetDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.Factory> create(com.paypal.oslo.feature.subscriptions.details.manage.ui.C0430ManageAgreementViewModel_Factory c0430ManageAgreementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel_Factory_Impl(c0430ManageAgreementViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.subscriptions.details.manage.ui.C0430ManageAgreementViewModel_Factory c0430ManageAgreementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel_Factory_Impl(c0430ManageAgreementViewModel_Factory));
    }
}
