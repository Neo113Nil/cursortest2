package com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/selections/GetRevolvingCreditPromotionalActivitiesQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetRevolvingCreditPromotionalActivitiesQuerySelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetRevolvingCreditPromotionalActivitiesQuerySelections INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetRevolvingCreditPromotionalActivitiesQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    private GetRevolvingCreditPromotionalActivitiesQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RevolvingCreditHistoricalPromotionalActivities", kotlin.collections.CollectionsKt.listOf("RevolvingCreditHistoricalPromotionalActivities")).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditHistoricalPromotionalActivitiesFragmentSelections.INSTANCE.get__root()).build()});
        Camera2StreamConfigurationMap = listOf;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.PROMOS, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditHistoricalPromotionalActivities.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__revolvingCreditHistoricalPromotionalActivities_input()).value(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("creditProductIdentifier", new com.apollographql.apollo.api.CompiledVariable("creditProductIdentifier")), kotlin.TuplesKt.to("creditAccountId", new com.apollographql.apollo.api.CompiledVariable("creditAccountId")), kotlin.TuplesKt.to("offset", new com.apollographql.apollo.api.CompiledVariable("offset")))).build())).selections(listOf).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
