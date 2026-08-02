package com.paypal.oslo.feature.cryptocurrency.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/selections/UpdateCryptocurrencyAssetPreferenceMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdateCryptocurrencyAssetPreferenceMutationSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.selections.UpdateCryptocurrencyAssetPreferenceMutationSelections INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.selections.UpdateCryptocurrencyAssetPreferenceMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    private UpdateCryptocurrencyAssetPreferenceMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("hasOptInBefore", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("rate", com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("preferenceType", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.INSTANCE.getType())).build()});
        getHighSpeedVideoFpsRanges = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("assetPreference", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreference.INSTANCE.getType()).selections(listOf).build());
        getHighSpeedVideoFpsRangesFor = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("updateCryptocurrencyPreferences", com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesResult.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.get__updateCryptocurrencyPreferences_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf2).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
