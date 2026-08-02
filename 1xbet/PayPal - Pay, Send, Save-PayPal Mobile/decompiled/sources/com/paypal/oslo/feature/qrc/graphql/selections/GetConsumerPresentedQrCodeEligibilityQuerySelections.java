package com.paypal.oslo.feature.qrc.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/selections/GetConsumerPresentedQrCodeEligibilityQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetConsumerPresentedQrCodeEligibilityQuerySelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.graphql.selections.GetConsumerPresentedQrCodeEligibilityQuerySelections INSTANCE = new com.paypal.oslo.feature.qrc.graphql.selections.GetConsumerPresentedQrCodeEligibilityQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    private GetConsumerPresentedQrCodeEligibilityQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("capability", com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("statusReason", com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRangesFor = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("qrCodeType", com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("statusReason", com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("qrCodeCapabilities", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapabilityEligibilityStatus.INSTANCE.getType()))).selections(listOf).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("qrCodeEligibilityStatuses", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeEligibilityStatus.INSTANCE.getType())))).selections(listOf2).build());
        Camera2StreamConfigurationMap = listOf3;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("consumerPresentedQrCodeEligibility", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibility.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.feature.qrc.graphql.type.Query.INSTANCE.get__consumerPresentedQrCodeEligibility_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf3).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
