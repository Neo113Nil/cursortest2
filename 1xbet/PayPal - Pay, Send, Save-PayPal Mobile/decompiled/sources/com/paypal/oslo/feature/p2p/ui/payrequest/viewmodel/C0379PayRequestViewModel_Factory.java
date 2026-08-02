package com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel;

/* renamed from: com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0379PayRequestViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase> getHighSpeedVideoFpsRangesFor;

    private C0379PayRequestViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    public final com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel get(java.lang.String str, java.lang.String str2, boolean z) {
        return newInstance(str, str2, z, this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.C0379PayRequestViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        return new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.C0379PayRequestViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel newInstance(java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase getPaymentRequestUseCase, com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase startPaymentFromRequestUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel(str, str2, z, getPaymentRequestUseCase, startPaymentFromRequestUseCase, userStore);
    }
}
