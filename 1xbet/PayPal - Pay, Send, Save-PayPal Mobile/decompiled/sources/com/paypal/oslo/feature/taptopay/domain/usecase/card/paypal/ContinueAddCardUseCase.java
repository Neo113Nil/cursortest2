package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/ContinueAddCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetAsDefaultIfNeededUseCase;", "setAsDefaultIfNeededUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetAsDefaultIfNeededUseCase;)V", "", "digitizedCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;", "setAsDefault", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetAsDefaultIfNeededUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContinueAddCardUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ContinueAddCardUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefaultIfNeededUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepository;
        this.getHighSpeedVideoFpsRanges = setAsDefaultIfNeededUseCase;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase continueAddCardUseCase, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            setAsDefault = com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.NO;
        }
        return continueAddCardUseCase.invoke(str, setAsDefault);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(java.lang.String digitizedCardId, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefault, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase$invoke$1(this, digitizedCardId, setAsDefault, null));
    }
}
