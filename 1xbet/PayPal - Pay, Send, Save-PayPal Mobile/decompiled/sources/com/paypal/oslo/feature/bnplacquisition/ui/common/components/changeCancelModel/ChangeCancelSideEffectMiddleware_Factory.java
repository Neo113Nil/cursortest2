package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

/* loaded from: classes11.dex */
public final class ChangeCancelSideEffectMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase> getHighSpeedVideoSizes;

    private ChangeCancelSideEffectMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware newInstance(com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase closeCreditLoanUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware(closeCreditLoanUseCase, sessionStorage);
    }
}
