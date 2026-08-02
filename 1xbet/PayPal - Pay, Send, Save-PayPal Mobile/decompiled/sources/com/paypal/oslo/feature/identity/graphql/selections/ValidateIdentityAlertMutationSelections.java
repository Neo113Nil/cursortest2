package com.paypal.oslo.feature.identity.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/selections/ValidateIdentityAlertMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateIdentityAlertMutationSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.identity.graphql.selections.ValidateIdentityAlertMutationSelections INSTANCE = new com.paypal.oslo.feature.identity.graphql.selections.ValidateIdentityAlertMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    private ValidateIdentityAlertMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("alertStatus", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertStatus.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("item", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.INSTANCE.getType())).build()});
        getHighSpeedVideoFpsRanges = listOf;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("validateAlert", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.ValidateAlertResult.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.get__validateAlert_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
