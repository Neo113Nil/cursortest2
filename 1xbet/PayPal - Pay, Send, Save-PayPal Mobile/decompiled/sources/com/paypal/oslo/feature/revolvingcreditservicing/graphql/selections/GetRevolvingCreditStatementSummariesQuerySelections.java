package com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/selections/GetRevolvingCreditStatementSummariesQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetRevolvingCreditStatementSummariesQuerySelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetRevolvingCreditStatementSummariesQuerySelections INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetRevolvingCreditStatementSummariesQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    private GetRevolvingCreditStatementSummariesQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RevolvingCreditStatementSummary", kotlin.collections.CollectionsKt.listOf("RevolvingCreditStatementSummary")).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditStatementSummaryFragmentSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoFpsRangesFor = listOf;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.StatementsFields.SUMMARIES, com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementSummary.INSTANCE.getType()))).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__revolvingCreditStatementSummaries_input()).value(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("creditProductIdentifier", new com.apollographql.apollo.api.CompiledVariable("creditProductIdentifier")), kotlin.TuplesKt.to("creditAccountId", new com.apollographql.apollo.api.CompiledVariable("creditAccountId")))).build())).selections(listOf).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
