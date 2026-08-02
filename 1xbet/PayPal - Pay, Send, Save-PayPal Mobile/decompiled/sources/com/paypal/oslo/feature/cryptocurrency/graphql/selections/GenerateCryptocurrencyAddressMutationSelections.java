package com.paypal.oslo.feature.cryptocurrency.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/selections/GenerateCryptocurrencyAddressMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GenerateCryptocurrencyAddressMutationSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.selections.GenerateCryptocurrencyAddressMutationSelections INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.selections.GenerateCryptocurrencyAddressMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    private GenerateCryptocurrencyAddressMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("blockchain", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("defaultNetwork", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("imageURL", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build()});
        getHighSpeedVideoSizes = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("accountId", com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("addressBookEntryName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("cryptoProvisioned", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("displayMemo", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("memo", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("blockchainNetworks", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetworkResult.INSTANCE.getType()))).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("action", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("blockchainAddress", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddress.INSTANCE.getType())).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("transactionTrackingId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build()});
        Camera2StreamConfigurationMap = listOf3;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("generateCryptocurrencyAddress", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesResult.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.get__generateCryptocurrencyAddress_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf3).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
