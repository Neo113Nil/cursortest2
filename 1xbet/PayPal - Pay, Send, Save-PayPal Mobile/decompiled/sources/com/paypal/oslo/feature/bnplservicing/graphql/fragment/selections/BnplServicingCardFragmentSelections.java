package com.paypal.oslo.feature.bnplservicing.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/selections/BnplServicingCardFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingCardFragmentSelections {
    public static final int $stable;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.selections.BnplServicingCardFragmentSelections INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.selections.BnplServicingCardFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    private BnplServicingCardFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build());
        Camera2StreamConfigurationMap = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRangesFor = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build()});
        getHighSpeedVideoSizes = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("primaryImage", com.paypal.oslo.api.graphql.schema.type.CardArtImage.INSTANCE.getType()).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("thumbnailImage", com.paypal.oslo.api.graphql.schema.type.CardArtImage.INSTANCE.getType()).selections(listOf3).build(), new com.apollographql.apollo.api.CompiledField.Builder("backgroundColor", com.paypal.oslo.api.graphql.schema.type.HexColorCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("foregroundColor", com.paypal.oslo.api.graphql.schema.type.HexColorCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("labelColor", com.paypal.oslo.api.graphql.schema.type.HexColorCode.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRanges = listOf4;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("brand", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CardBrand.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("expirationDate", com.paypal.oslo.api.graphql.schema.type.DateYearMonth.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("productClass", com.paypal.oslo.api.graphql.schema.type.CardProductClass.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("nickName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuer", com.paypal.oslo.api.graphql.schema.type.CardIssuer.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("cardArt", com.paypal.oslo.api.graphql.schema.type.CardArt.INSTANCE.getType()).selections(listOf4).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
