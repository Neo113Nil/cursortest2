package com.paypal.oslo.feature.qrc.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/selections/FundingSourceFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "getInputFormats", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "getOutputFormats", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingSourceFragmentSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputFormats;
    public static final com.paypal.oslo.feature.qrc.graphql.fragment.selections.FundingSourceFragmentSelections INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.selections.FundingSourceFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    private FundingSourceFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("primaryUrl", com.paypal.oslo.feature.qrc.graphql.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("thumbnailUrl", com.paypal.oslo.feature.qrc.graphql.type.URL.INSTANCE.getType()).build()});
        Camera2StreamConfigurationMap = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType())).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("amount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.Money.INSTANCE.getType())).selections(listOf2).build());
        getHighSpeedVideoFpsRangesFor = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.BalanceAmount.INSTANCE.getType())).selections(listOf3).build());
        getHighSpeedVideoSizes = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("productClass", com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("brand", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.CardBrand.INSTANCE.getType())).build()});
        getHighSpeedVideoFpsRanges = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType())).build()});
        getInputFormats = listOf6;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf7 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLID.INSTANCE.getType())).build());
        getOutputMinFrameDuration = listOf7;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf8 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder(com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, kotlin.collections.CollectionsKt.listOf(com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER)).selections(listOf4).build(), new com.apollographql.apollo.api.CompiledFragment.Builder(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD)).selections(listOf5).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BankAccount", kotlin.collections.CollectionsKt.listOf("BankAccount")).selections(listOf6).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("QRCodeCredit", kotlin.collections.CollectionsKt.listOf("QRCodeCredit")).selections(listOf7).build()});
        getInputSizeshNQ4ISI = listOf8;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf9 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType())).build()});
        getOutputFormats = listOf9;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("formattedName", com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("typeLabel", com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("instrumentArt", com.paypal.oslo.feature.qrc.graphql.type.QRCodeFundingInstrumentArt.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("instrument", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodeFundingInstrument.INSTANCE.getType())).selections(listOf8).build(), new com.apollographql.apollo.api.CompiledField.Builder("countryCode", com.paypal.oslo.feature.qrc.graphql.type.CountryCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("amount", com.paypal.oslo.feature.qrc.graphql.type.Money.INSTANCE.getType()).selections(listOf9).build(), new com.apollographql.apollo.api.CompiledField.Builder("internalInstrumentType", com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
