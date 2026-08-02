package com.paypal.oslo.feature.subscriptions.details.manage.ui;

/* renamed from: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0430ManageAgreementViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase> getHighSpeedVideoSizes;

    private C0430ManageAgreementViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    public final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel get(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination) {
        return newInstance(this.getHighSpeedVideoSizes.get(), manageAgreementBottomSheetDestination);
    }

    public static com.paypal.oslo.feature.subscriptions.details.manage.ui.C0430ManageAgreementViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase> provider) {
        return new com.paypal.oslo.feature.subscriptions.details.manage.ui.C0430ManageAgreementViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel newInstance(com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase disableAgreementUseCase, com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination) {
        return new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel(disableAgreementUseCase, manageAgreementBottomSheetDestination);
    }
}
