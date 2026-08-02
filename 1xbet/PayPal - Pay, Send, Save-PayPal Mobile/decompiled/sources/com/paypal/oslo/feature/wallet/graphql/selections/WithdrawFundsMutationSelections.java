package com.paypal.oslo.feature.wallet.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/selections/WithdrawFundsMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getInputFormats", "getInputSizeshNQ4ISI", "getOutputFormats", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WithdrawFundsMutationSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.wallet.graphql.selections.WithdrawFundsMutationSelections INSTANCE = new com.paypal.oslo.feature.wallet.graphql.selections.WithdrawFundsMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputFormats;

    private WithdrawFundsMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getHighSpeedVideoFpsRangesFor = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getHighSpeedVideoSizes = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf3).build()});
        getHighSpeedVideoFpsRanges = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        Camera2StreamConfigurationMap = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf5).build()});
        getInputSizeshNQ4ISI = listOf6;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf7 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.WithdrawStatus.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("transferMethod", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("transferMode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("amount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Currency.INSTANCE.getType())).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("fees", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Currency.INSTANCE.getType())).selections(listOf4).build(), new com.apollographql.apollo.api.CompiledField.Builder("netAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Currency.INSTANCE.getType())).selections(listOf6).build()});
        getOutputFormats = listOf7;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("withdrawFunds", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.WithdrawFunds.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.get__withdrawFunds_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf7).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
