package com.paypal.oslo.feature.activity.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/selections/GetActivitySearchSuggestionsQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__root", "Ljava/util/List;", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetActivitySearchSuggestionsQuerySelections {
    public static final com.paypal.oslo.feature.activity.graphql.selections.GetActivitySearchSuggestionsQuerySelections INSTANCE = new com.paypal.oslo.feature.activity.graphql.selections.GetActivitySearchSuggestionsQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("activitySearchSuggestions", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())))).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__activitySearchSuggestions_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).build());
    public static final int $stable = 8;

    private GetActivitySearchSuggestionsQuerySelections() {
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
