package com.paypal.oslo.feature.consumerprivacy.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/selections/UpdateAllowRequestMoneyByUsernameMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdateAllowRequestMoneyByUsernameMutationSelections {
    public static final int $stable;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.selections.UpdateAllowRequestMoneyByUsernameMutationSelections INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.selections.UpdateAllowRequestMoneyByUsernameMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    private UpdateAllowRequestMoneyByUsernameMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("success", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build());
        Camera2StreamConfigurationMap = listOf;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("updateAllowRequestMoneyByUsername", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.UpdateSettingResult.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.get__updateAllowRequestMoneyByUsername_input()).value(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("allowRequestMoneyByUsername", new com.apollographql.apollo.api.CompiledVariable("allowRequestMoneyByUsername")))).build())).selections(listOf).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
