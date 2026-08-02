package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ>\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/card/AddCardUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "setDefaultCardUseCase", "Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;", "getCardsUseCase", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;)V", "", "encryptedCardInfo", "Lcom/paypal/android/taptopay/domain/model/card/SetAsDefault;", "setAsDefault", "Lcom/paypal/android/taptopay/domain/model/CardScheme;", "cardScheme", "", "consumerEntryMode", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;", "invoke", "([BLcom/paypal/android/taptopay/domain/model/card/SetAsDefault;Lcom/paypal/android/taptopay/domain/model/CardScheme;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddCardUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase getHighSpeedVideoSizes;
    private final com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AddCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllCardsUseCase, "");
        this.getHighSpeedVideoFpsRanges = cardRepository;
        this.getHighSpeedVideoSizes = setDefaultCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = getAllCardsUseCase;
    }

    public /* synthetic */ AddCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase(cardRepository) : setDefaultCardUseCase, (i & 4) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase(cardRepository, null, 2, null) : getAllCardsUseCase);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase addCardUseCase, byte[] bArr, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            setAsDefault = com.paypal.android.taptopay.domain.model.card.SetAsDefault.NO;
        }
        if ((i & 4) != 0) {
            cardScheme = null;
        }
        if ((i & 8) != 0) {
            str = "UNKNOWN";
        }
        return addCardUseCase.invoke(bArr, setAsDefault, cardScheme, str);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> invoke(byte[] encryptedCardInfo, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String consumerEntryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCardInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefault, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerEntryMode, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase$invoke$1(this, encryptedCardInfo, cardScheme, consumerEntryMode, setAsDefault, null));
    }
}
