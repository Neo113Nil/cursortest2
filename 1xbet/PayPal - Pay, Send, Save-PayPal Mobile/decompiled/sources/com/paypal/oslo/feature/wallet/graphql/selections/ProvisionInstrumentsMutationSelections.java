package com.paypal.oslo.feature.wallet.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/selections/ProvisionInstrumentsMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "unwrapAs", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getOutputStallDuration", "getHighSpeedVideoFpsRanges", "getOutputStallDurationlomOqCM", "getHighResolutionOutputSizeshNQ4ISI", "isOutputSupportedForhNQ4ISI", "Camera2StreamConfigurationMap", "getOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "isOutputSupportedFor", "getOutputFormats", "getInputSizeshNQ4ISI", "getInputFormats", "toString", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "getOutputSizes", "CoroutineDebuggingKt", "getValidOutputFormatsForInputhNQ4ISI", "getOutputMinFrameDurationlomOqCM", "coroutineBoundary", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProvisionInstrumentsMutationSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputStallDuration;
    public static final com.paypal.oslo.feature.wallet.graphql.selections.ProvisionInstrumentsMutationSelections INSTANCE = new com.paypal.oslo.feature.wallet.graphql.selections.ProvisionInstrumentsMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> unwrapAs;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> toString;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> coroutineBoundary;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> isOutputSupportedFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputStallDurationlomOqCM;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputFormats;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: toString, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputSizeshNQ4ISI;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    private ProvisionInstrumentsMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRangesFor = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("thumbnailImage", com.paypal.oslo.api.graphql.schema.type.PaymentTokenArtImage.INSTANCE.getType()).selections(listOf).build());
        getHighSpeedVideoFpsRanges = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuerDisplayName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("productDisplayName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("paymentTokenArt", com.paypal.oslo.api.graphql.schema.type.PaymentTokenArt.INSTANCE.getType()).selections(listOf2).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        Camera2StreamConfigurationMap = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("thumbnailImage", com.paypal.oslo.api.graphql.schema.type.PaymentTokenArtImage.INSTANCE.getType()).selections(listOf4).build());
        getHighSpeedVideoSizes = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuerDisplayName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("productDisplayName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("paymentTokenArt", com.paypal.oslo.api.graphql.schema.type.PaymentTokenArt.INSTANCE.getType()).selections(listOf5).build()});
        getOutputFormats = listOf6;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf7 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build());
        getInputFormats = listOf7;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf8 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build()});
        getInputSizeshNQ4ISI = listOf8;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf9 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("thumbnailImage", com.paypal.oslo.api.graphql.schema.type.CardArtImage.INSTANCE.getType()).selections(listOf8).build());
        getOutputMinFrameDuration = listOf9;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf10 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuer", com.paypal.oslo.api.graphql.schema.type.CardIssuer.INSTANCE.getType()).selections(listOf7).build(), new com.apollographql.apollo.api.CompiledField.Builder("cardArt", com.paypal.oslo.api.graphql.schema.type.CardArt.INSTANCE.getType()).selections(listOf9).build(), new com.apollographql.apollo.api.CompiledField.Builder("productClass", com.paypal.oslo.api.graphql.schema.type.CardProductClass.INSTANCE.getType()).build()});
        getHighSpeedVideoSizesFor = listOf10;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf11 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build());
        getOutputSizes = listOf11;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf12 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("baseCdnLinkPath", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build()});
        getOutputStallDuration = listOf12;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf13 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("thumbnailImage", com.paypal.oslo.api.graphql.schema.type.CardArtImage.INSTANCE.getType()).selections(listOf12).build());
        getOutputSizeshNQ4ISI = listOf13;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf14 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuer", com.paypal.oslo.api.graphql.schema.type.CardIssuer.INSTANCE.getType()).selections(listOf11).build(), new com.apollographql.apollo.api.CompiledField.Builder("cardArt", com.paypal.oslo.api.graphql.schema.type.CardArt.INSTANCE.getType()).selections(listOf13).build(), new com.apollographql.apollo.api.CompiledField.Builder("productClass", com.paypal.oslo.api.graphql.schema.type.CardProductClass.INSTANCE.getType()).build()});
        getOutputStallDurationlomOqCM = listOf14;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf15 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        getOutputMinFrameDurationlomOqCM = listOf15;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf16 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("url", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        unwrapAs = listOf16;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf17 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuer", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccountIssuer.INSTANCE.getType())).selections(listOf15).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccountType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("institutionImages", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.InstitutionImage.INSTANCE.getType()))).selections(listOf16).build()});
        getValidOutputFormatsForInputhNQ4ISI = listOf17;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf18 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        toString = listOf18;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf19 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("url", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("width", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("height", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        isOutputSupportedForhNQ4ISI = listOf19;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf20 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuer", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccountIssuer.INSTANCE.getType())).selections(listOf18).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccountType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("institutionImages", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.InstitutionImage.INSTANCE.getType()))).selections(listOf19).build()});
        isOutputSupportedFor = listOf20;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf21 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("paymentTokens", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PaymentToken.INSTANCE.getType()))).selections(listOf3).build(), new com.apollographql.apollo.api.CompiledField.Builder("remainingPaymentTokens", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PaymentToken.INSTANCE.getType()))).selections(listOf6).build(), new com.apollographql.apollo.api.CompiledField.Builder("cards", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Card.INSTANCE.getType()))).selections(listOf10).build(), new com.apollographql.apollo.api.CompiledField.Builder("remainingCards", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Card.INSTANCE.getType()))).selections(listOf14).build(), new com.apollographql.apollo.api.CompiledField.Builder("bankAccounts", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccount.INSTANCE.getType()))).selections(listOf17).build(), new com.apollographql.apollo.api.CompiledField.Builder("remainingBankAccounts", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccount.INSTANCE.getType()))).selections(listOf20).build()});
        coroutineBoundary = listOf21;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("provisionInstruments", com.paypal.oslo.api.graphql.schema.type.ProvisionInstrumentsResult.INSTANCE.getType()).selections(listOf21).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
