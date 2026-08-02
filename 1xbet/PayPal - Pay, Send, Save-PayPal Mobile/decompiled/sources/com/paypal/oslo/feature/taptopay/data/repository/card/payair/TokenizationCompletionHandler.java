package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationCompletionHandler;", "", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;", "cardDataSource", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeRequestHandler;", "activationCodeRequestHandler", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;", "cardProvisionHandler", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/TokenManager;Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeRequestHandler;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/payair/model/StartTokenizeData;", "startTokenizeData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "(Lcom/payair/model/StartTokenizeData;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/payair/logic/managers/TokenManager;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeRequestHandler;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenizationCompletionHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public TokenizationCompletionHandler(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationCodeRequestHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProvisionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = tokenManager;
        this.getHighSpeedVideoFpsRangesFor = cardDataSource;
        this.getHighSpeedVideoSizes = activationCodeRequestHandler;
        this.getHighSpeedVideoFpsRanges = cardProvisionHandler;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(com.payair.model.StartTokenizeData startTokenizeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTokenizeData, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1(this, startTokenizeData, null));
    }
}
