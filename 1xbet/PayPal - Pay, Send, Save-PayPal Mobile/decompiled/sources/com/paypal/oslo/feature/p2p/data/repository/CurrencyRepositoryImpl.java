package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\u000e0\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000e0\r2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/repository/CurrencyRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/p2p/data/mapper/SupportedDestinationMapper;", "supportedDestinationMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/FxQuoteMapper;", "fxQuoteMapper", "<init>", "(Ljavax/inject/Provider;Lcom/paypal/oslo/feature/p2p/data/mapper/SupportedDestinationMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/FxQuoteMapper;)V", "", "transferAttemptID", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "getCurrencies", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/p2p/domain/model/CryptoItem;", "getCryptos", "()Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;", "senderAmount", "receiverAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TARGET_CURRENCY_CODE, "Lcom/paypal/oslo/feature/p2p/domain/error/FxQuoteError;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getFxQuote", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyInput;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Ljavax/inject/Provider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/data/mapper/SupportedDestinationMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/FxQuoteMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CurrencyRepositoryImpl implements com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CurrencyRepositoryImpl(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper supportedDestinationMapper, com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper fxQuoteMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedDestinationMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuoteMapper, "");
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = supportedDestinationMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = fxQuoteMapper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<java.lang.Throwable, java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>>> getCurrencies(java.lang.String transferAttemptID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptID, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1(this, transferAttemptID, null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<java.lang.Throwable, java.util.List<com.paypal.oslo.feature.p2p.domain.model.CryptoItem>>> getCryptos() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCryptos$1(null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.FxQuoteError, com.paypal.oslo.feature.p2p.domain.model.FxQuote>> getFxQuote(java.lang.String transferAttemptId, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput senderAmount, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput receiverAmount, java.lang.String targetCurrencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetCurrencyCode, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1(transferAttemptId, targetCurrencyCode, senderAmount, this, receiverAmount, null));
    }
}
