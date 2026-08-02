package com.paypal.oslo.feature.cryptocurrency.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/selections/GetCryptocurrencyHoldingsQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "ArtificialStackFrames", "Ljava/util/List;", "getHighSpeedVideoSizes", "getOutputMinFrameDurationlomOqCM", "getHighSpeedVideoFpsRanges", "getOutputSizes", "getHighSpeedVideoFpsRangesFor", "accessartificialFrame", "Camera2StreamConfigurationMap", "unwrapAs", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "toString", "getOutputMinFrameDuration", "getOutputFormats", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI", "getValidOutputFormatsForInputhNQ4ISI", "coroutineBoundary", "getOutputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "getOutputStallDuration", "isOutputSupportedForhNQ4ISI", "isOutputSupportedFor", "coroutineCreation", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetCryptocurrencyHoldingsQuerySelections {
    public static final int $stable;

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.selections.GetCryptocurrencyHoldingsQuerySelections INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.selections.GetCryptocurrencyHoldingsQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> accessartificialFrame;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> coroutineBoundary;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> toString;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> unwrapAs;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> isOutputSupportedFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputStallDuration;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputSizes;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> coroutineCreation;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: toString, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDuration;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    private GetCryptocurrencyHoldingsQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getHighSpeedVideoSizes = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getHighSpeedVideoFpsRanges = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossFiatAmount", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossPercent", com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossStatus", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRangesFor = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("totalHolding", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("gainOrLoss", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLoss.INSTANCE.getType()).selections(listOf3).build()});
        Camera2StreamConfigurationMap = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("lastPayoutReason", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastPayoutStatus", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("quantity", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getInputFormats = listOf6;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf7 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("assetQuantity", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantity.INSTANCE.getType()).selections(listOf6).build());
        getOutputMinFrameDuration = listOf7;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf8 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("quantity", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getOutputFormats = listOf8;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf9 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build()});
        getHighSpeedVideoSizesFor = listOf9;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf10 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("assetQuantity", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantity.INSTANCE.getType()).selections(listOf8).build(), new com.apollographql.apollo.api.CompiledField.Builder("fiatAmount", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf9).build()});
        getInputSizeshNQ4ISI = listOf10;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf11 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("rate", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("payout", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRewardPayout.INSTANCE.getType()).selections(listOf5).build(), new com.apollographql.apollo.api.CompiledField.Builder("lifetimePayout", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRewardLifetimePayout.INSTANCE.getType()).selections(listOf7).build(), new com.apollographql.apollo.api.CompiledField.Builder("accrued", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRewardAccrued.INSTANCE.getType()).selections(listOf10).build()});
        getOutputSizes = listOf11;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf12 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("rewardApy", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRewardAPY.INSTANCE.getType()).selections(listOf11).build());
        getOutputSizeshNQ4ISI = listOf12;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf13 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("quantity", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getOutputMinFrameDurationlomOqCM = listOf13;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf14 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build()});
        getOutputStallDuration = listOf14;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf15 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("assetQuantity", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantity.INSTANCE.getType())).selections(listOf13).build(), new com.apollographql.apollo.api.CompiledField.Builder("fiatAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf14).build()});
        getOutputStallDurationlomOqCM = listOf15;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf16 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        isOutputSupportedForhNQ4ISI = listOf16;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf17 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getValidOutputFormatsForInputhNQ4ISI = listOf17;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf18 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossPercent", com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossStatus", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossFiatAmount", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf17).build()});
        isOutputSupportedFor = listOf18;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf19 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build()});
        toString = listOf19;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf20 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("dailyGainOrLossFiatAmount", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf19).build(), new com.apollographql.apollo.api.CompiledField.Builder("dailyGainOrLossFiatPercent", com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("dailyGainOrLossStatus", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.INSTANCE.getType()).build()});
        unwrapAs = listOf20;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf21 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("quantity", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        accessartificialFrame = listOf21;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf22 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("rewardHolding", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRewardHolding.INSTANCE.getType()).selections(listOf12).build(), new com.apollographql.apollo.api.CompiledField.Builder("assetName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("assetExchangeRate", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetExchangeRate.INSTANCE.getType()).selections(listOf15).build(), new com.apollographql.apollo.api.CompiledField.Builder("logoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("fiatAmount", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf16).build(), new com.apollographql.apollo.api.CompiledField.Builder("gainOrLoss", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLoss.INSTANCE.getType()).selections(listOf18).build(), new com.apollographql.apollo.api.CompiledField.Builder("dailyGainOrLoss", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDailyGainOrLoss.INSTANCE.getType()).selections(listOf20).build(), new com.apollographql.apollo.api.CompiledField.Builder("assetQuantityTruncated", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantity.INSTANCE.getType()).selections(listOf21).build()});
        coroutineCreation = listOf22;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf23 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("totalPortfolioValue", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTotalPortfolioValue.INSTANCE.getType()).selections(listOf4).build(), new com.apollographql.apollo.api.CompiledField.Builder("holdings", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHolding.INSTANCE.getType()))).selections(listOf22).build()});
        coroutineBoundary = listOf23;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("cryptocurrencyHoldings", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldings.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__cryptocurrencyHoldings_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf23).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
