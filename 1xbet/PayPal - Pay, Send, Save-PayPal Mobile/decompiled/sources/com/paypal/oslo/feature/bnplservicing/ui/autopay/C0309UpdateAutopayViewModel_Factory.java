package com.paypal.oslo.feature.bnplservicing.ui.autopay;

/* renamed from: com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0309UpdateAutopayViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase> getHighSpeedVideoSizes;

    private C0309UpdateAutopayViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel get(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel) {
        return newInstance(turnOffAutopayModel, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.autopay.C0309UpdateAutopayViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.ui.autopay.C0309UpdateAutopayViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel newInstance(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayReducer updateAutopayReducer, com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase cancelAutopayUseCase, com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter) {
        return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel(turnOffAutopayModel, updateAutopayReducer, cancelAutopayUseCase, bnplServFormatter);
    }
}
