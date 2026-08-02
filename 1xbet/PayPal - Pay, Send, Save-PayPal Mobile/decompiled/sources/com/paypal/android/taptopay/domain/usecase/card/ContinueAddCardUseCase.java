package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/card/ContinueAddCardUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "setDefaultCardUseCase", "Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;", "getCardsUseCase", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;)V", "", "digitizedCardId", "Lcom/paypal/android/taptopay/domain/model/card/SetAsDefault;", "setAsDefault", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;", "invoke", "(Ljava/lang/String;Lcom/paypal/android/taptopay/domain/model/card/SetAsDefault;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ContinueAddCardUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ContinueAddCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllCardsUseCase, "");
        this.getHighSpeedVideoFpsRanges = cardRepository;
        this.getHighSpeedVideoFpsRangesFor = setDefaultCardUseCase;
        this.Camera2StreamConfigurationMap = getAllCardsUseCase;
    }

    public /* synthetic */ ContinueAddCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase(cardRepository) : setDefaultCardUseCase, (i & 4) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase(cardRepository, null, 2, null) : getAllCardsUseCase);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase continueAddCardUseCase, java.lang.String str, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            setAsDefault = com.paypal.android.taptopay.domain.model.card.SetAsDefault.NO;
        }
        return continueAddCardUseCase.invoke(str, setAsDefault);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> invoke(java.lang.String digitizedCardId, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefault, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase$invoke$1(this, digitizedCardId, setAsDefault, null));
    }
}
