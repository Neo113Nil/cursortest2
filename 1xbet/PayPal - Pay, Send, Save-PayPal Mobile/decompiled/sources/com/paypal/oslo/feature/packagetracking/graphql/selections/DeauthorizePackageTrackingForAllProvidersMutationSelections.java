package com.paypal.oslo.feature.packagetracking.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/selections/DeauthorizePackageTrackingForAllProvidersMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeauthorizePackageTrackingForAllProvidersMutationSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.packagetracking.graphql.selections.DeauthorizePackageTrackingForAllProvidersMutationSelections INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.selections.DeauthorizePackageTrackingForAllProvidersMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    private DeauthorizePackageTrackingForAllProvidersMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("dataDeleted", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("deauthorized", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("emailProvider", com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("deauthorizations", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Deauthorization.INSTANCE.getType()))).selections(listOf).build());
        getHighSpeedVideoFpsRanges = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("deauthorizePackageTrackingForAllProviders", com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersResult.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.get__deauthorizePackageTrackingForAllProviders_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf2).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
