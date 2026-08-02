package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardTokenization;", "", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/init/HceConfigurationProvider;", "appConfigurationProvider", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TermsAndConditionsHandler;", "termsAndConditionsHandler", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "authToken", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/TokenManager;Lcom/paypal/oslo/feature/taptopay/data/payair/init/HceConfigurationProvider;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TermsAndConditionsHandler;Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "cardData", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;", "cardScheme", "", "consumerEntryMode", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "([BLcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/TokenManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/payair/init/HceConfigurationProvider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TermsAndConditionsHandler;", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardTokenization {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CardTokenization(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider hceConfigurationProvider, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler termsAndConditionsHandler, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceConfigurationProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsAndConditionsHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = tokenManager;
        this.Camera2StreamConfigurationMap = hceConfigurationProvider;
        this.getHighSpeedVideoSizes = termsAndConditionsHandler;
        this.getHighResolutionOutputSizeshNQ4ISI = authToken;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, byte[] bArr, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "UNKNOWN";
        }
        return cardTokenization.invoke(bArr, cardScheme, str);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(byte[] cardData, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String consumerEntryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardScheme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerEntryMode, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1(this, cardData, cardScheme, consumerEntryMode, null));
    }

    public static final /* synthetic */ com.payair.model.CardScheme access$mapToPayairCardScheme(com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme) {
        int i = com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization.WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return com.payair.model.CardScheme.VISA;
            }
            if (i == 3) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unknown card scheme provided, defaulting to MASTERCARD", null, null, 6, null);
            } else {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported card scheme: ");
                sb.append(cardScheme);
                sb.append(", defaulting to MASTERCARD");
                com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
            }
        }
        return com.payair.model.CardScheme.MASTERCARD;
    }

    public static final /* synthetic */ java.lang.Object access$processSuccessfulTokenization(com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, com.payair.model.StartTokenizeData startTokenizeData, final kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CardTokenization succeeded", null, null, 6, null);
        java.lang.Object collect = cardTokenization.getHighSpeedVideoSizes.invoke(startTokenizeData).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$processSuccessfulTokenization$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object invoke = function2.invoke((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj, continuation2);
                return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
