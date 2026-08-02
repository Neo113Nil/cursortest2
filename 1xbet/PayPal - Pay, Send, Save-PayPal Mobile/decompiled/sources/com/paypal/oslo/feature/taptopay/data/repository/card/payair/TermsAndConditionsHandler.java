package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TermsAndConditionsHandler;", "", "Lcom/payair/logic/managers/ConfigurationManager;", "confManager", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationCompletionHandler;", "tokenizationCompletionHandler", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/ConfigurationManager;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationCompletionHandler;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/payair/model/StartTokenizeData;", "startTokenizeData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "(Lcom/payair/model/StartTokenizeData;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/ConfigurationManager;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationCompletionHandler;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TermsAndConditionsHandler {
    public static final int $stable = 8;
    private final com.payair.logic.managers.ConfigurationManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TermsAndConditionsHandler(com.payair.logic.managers.ConfigurationManager configurationManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler tokenizationCompletionHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationCompletionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = configurationManager;
        this.getHighSpeedVideoFpsRangesFor = tokenizationCompletionHandler;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(com.payair.model.StartTokenizeData startTokenizeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTokenizeData, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1(this, startTokenizeData, null));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent access$createTACContent(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler termsAndConditionsHandler, com.payair.model.AssetType assetType, java.lang.String str) {
        int i = com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler.WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
        if (i == 1) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TermsAndConditionsHandler is successful: Text asset received", null, null, 6, null);
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent.Text(str);
        }
        if (i == 2) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TermsAndConditionsHandler is successful: HTML asset received", null, null, 6, null);
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent.Html(str);
        }
        if (i == 3) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TermsAndConditionsHandler is successful: PDF asset received", null, null, 6, null);
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent.Pdf(str);
        }
        if (i == 4) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TermsAndConditionsHandler is successful: Image asset received", null, null, 6, null);
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent.Image(str);
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unsupported TAC asset type received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("assetType", assetType.name())), null, 4, null);
        return com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent.Unknown.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.AssetType.values().length];
            try {
                iArr[com.payair.model.AssetType.TEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.AssetType.HTML.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.model.AssetType.PDF.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.payair.model.AssetType.IMAGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.payair.model.AssetType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
