package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalActivateCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ActivateCardUseCase;", "activateCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "payPalGetCardIdGroupUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ActivateCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "id", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ActivateCardUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalActivateCardUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PayPalActivateCardUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase activateCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activateCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        this.getHighSpeedVideoFpsRanges = activateCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalGetCardIdGroupUseCase;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase$invoke$1(this, id, null));
    }
}
