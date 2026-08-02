package com.paypal.oslo.feature.wallet.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/fragment/selections/WalletCardArtFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WalletCardArtFragmentSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;
    public static final com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletCardArtFragmentSelections INSTANCE = new com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletCardArtFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    private WalletCardArtFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build()});
        Camera2StreamConfigurationMap = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build()});
        getHighSpeedVideoSizes = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("primaryImage", com.paypal.oslo.api.graphql.schema.type.CardArtImage.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("thumbnailImage", com.paypal.oslo.api.graphql.schema.type.CardArtImage.INSTANCE.getType()).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("backgroundColor", com.paypal.oslo.api.graphql.schema.type.HexColorCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("foregroundColor", com.paypal.oslo.api.graphql.schema.type.HexColorCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("labelColor", com.paypal.oslo.api.graphql.schema.type.HexColorCode.INSTANCE.getType()).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
