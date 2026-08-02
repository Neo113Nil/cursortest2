package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/selections/RevolvingCreditActivitiesFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "getInputFormats", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditActivitiesFragmentSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditActivitiesFragmentSelections INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditActivitiesFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputFormats;

    private RevolvingCreditActivitiesFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditMoneyFragmentSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoFpsRanges = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CreditImage", kotlin.collections.CollectionsKt.listOf("CreditImage")).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditImageFragmentSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoFpsRangesFor = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("percent", com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType()).build());
        getHighResolutionOutputSizeshNQ4ISI = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("cashback", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditActivityRewardsCashback.INSTANCE.getType()).selections(listOf3).build());
        getHighSpeedVideoSizes = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("types", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType.INSTANCE.getType()))).build()});
        Camera2StreamConfigurationMap = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditActivityID.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("amount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("transactionTime", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.DateTime.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("transactionReferenceNumber", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditTransactionReferenceNumber.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("settled", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("businessName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("displayLogo", com.paypal.oslo.api.graphql.schema.type.CreditImage.INSTANCE.getType()).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("rewards", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditActivityRewards.INSTANCE.getType()).selections(listOf4).build(), new com.apollographql.apollo.api.CompiledField.Builder("offerConstruct", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOfferConstruct.INSTANCE.getType()).selections(listOf5).build()});
        getInputSizeshNQ4ISI = listOf6;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf7 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("items", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditActivity.INSTANCE.getType())))).selections(listOf6).build(), new com.apollographql.apollo.api.CompiledField.Builder("offset", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("limit", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("hasNextPage", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("hasPreviousPage", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build()});
        getInputFormats = listOf7;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("page", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditActivitiesPage.INSTANCE.getType())).selections(listOf7).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
