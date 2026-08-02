package com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/selections/GetLegacyWebViewServicingUrlsQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetLegacyWebViewServicingUrlsQuerySelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetLegacyWebViewServicingUrlsQuerySelections INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetLegacyWebViewServicingUrlsQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    private GetLegacyWebViewServicingUrlsQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("makePaymentUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("manageAutopayUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("managePaymentsUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build()});
        Camera2StreamConfigurationMap = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("viewStatementsUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build());
        getHighSpeedVideoSizes = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("viewNotificationsUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build());
        getHighSpeedVideoFpsRangesFor = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("servicingHomeUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("payments", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentsContent.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("statements", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingStatementsContent.INSTANCE.getType()).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledField.Builder("notifications", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNotificationsContent.INSTANCE.getType()).selections(listOf3).build()});
        getHighSpeedVideoFpsRanges = listOf4;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("revolvingCreditServicingContent", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingContent.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__revolvingCreditServicingContent_input()).value(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("creditProductIdentifier", new com.apollographql.apollo.api.CompiledVariable("creditProductIdentifier")))).build())).selections(listOf4).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
