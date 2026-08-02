package com.paypal.oslo.feature.qrc.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/selections/ConfirmQrCodePaymentMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getInputFormats", "getOutputMinFrameDuration", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConfirmQrCodePaymentMutationSelections {
    public static final int $stable;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.graphql.selections.ConfirmQrCodePaymentMutationSelections INSTANCE = new com.paypal.oslo.feature.qrc.graphql.selections.ConfirmQrCodePaymentMutationSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    private ConfirmQrCodePaymentMutationSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("maximumPollingInterval", com.paypal.oslo.feature.qrc.graphql.type.GraphQLInt.INSTANCE.getType()).build()});
        Camera2StreamConfigurationMap = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.INSTANCE.getType())).build());
        getHighSpeedVideoFpsRangesFor = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("errorReason", com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build()});
        getHighSpeedVideoSizes = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("QRCodeSessionPollingAction", kotlin.collections.CollectionsKt.listOf("QRCodeSessionPollingAction")).selections(listOf).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("QRCodeSessionBasicAction", kotlin.collections.CollectionsKt.listOf("QRCodeSessionBasicAction")).selections(listOf2).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("QRCodeSessionErrorAction", kotlin.collections.CollectionsKt.listOf("QRCodeSessionErrorAction")).selections(listOf3).build()});
        getHighSpeedVideoFpsRanges = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("paymentMethod", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("statusReason", com.paypal.oslo.feature.qrc.graphql.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("transactionTime", com.paypal.oslo.feature.qrc.graphql.type.DateTime.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("requiredAction", com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionRequiredAction.INSTANCE.getType()).selections(listOf4).build(), new com.apollographql.apollo.api.CompiledField.Builder("payment", com.paypal.oslo.feature.qrc.graphql.type.QRCodePayment.INSTANCE.getType()).selections(listOf5).build()});
        getOutputMinFrameDuration = listOf6;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("confirmQrCodePayment", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSession.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.feature.qrc.graphql.type.Mutation.INSTANCE.get__confirmQrCodePayment_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf6).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
