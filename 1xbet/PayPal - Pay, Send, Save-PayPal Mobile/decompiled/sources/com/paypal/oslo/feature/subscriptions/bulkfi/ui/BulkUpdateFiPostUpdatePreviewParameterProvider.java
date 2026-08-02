package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdatePreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdatePreviewData;", "<init>", "()V", "Lkotlin/enums/EnumEntries;", "Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "getHighSpeedVideoFpsRanges", "Lkotlin/enums/EnumEntries;", "", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiPostUpdatePreviewParameterProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData> {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;
    private final kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason> getHighSpeedVideoFpsRanges;
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData> values;

    public BulkUpdateFiPostUpdatePreviewParameterProvider() {
        kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason> entries = com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.getEntries();
        this.getHighSpeedVideoFpsRanges = entries;
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Netflix", "Spotify", "Hulu", "Adobe", "Grammarly", "Disney+"});
        kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason> enumEntries = entries;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(enumEntries, 10));
        int i = 0;
        for (java.lang.Object obj : enumEntries) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(kotlin.TuplesKt.to("agreement_".concat(java.lang.String.valueOf(i2)), ((com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason) obj).name()));
            i = i2;
        }
        this.getHighSpeedVideoSizes = kotlin.collections.MapsKt.toMap(arrayList);
        this.values = kotlin.sequences.SequencesKt.flatMap(kotlin.collections.CollectionsKt.asSequence(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getAllTypes()), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewParameterProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewParameterProvider.m19761$r8$lambda$1kTQs0SGLQFNMQwvU435018Tj0(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewParameterProvider.this, (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj2);
            }
        });
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData> getValues() {
        return this.values;
    }

    /* renamed from: $r8$lambda$1kTQs0SGLQFNMQwvU43-5018Tj0, reason: not valid java name */
    public static /* synthetic */ kotlin.sequences.Sequence m19761$r8$lambda$1kTQs0SGLQFNMQwvU435018Tj0(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewParameterProvider bulkUpdateFiPostUpdatePreviewParameterProvider, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason> enumEntries = bulkUpdateFiPostUpdatePreviewParameterProvider.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(enumEntries, 10));
        int i = 0;
        for (java.lang.Object obj : enumEntries) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String concat = "agreement_".concat(java.lang.String.valueOf(i2));
            com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData fundingInstrumentPreviewData = com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE;
            java.util.List<java.lang.String> list = bulkUpdateFiPostUpdatePreviewParameterProvider.Camera2StreamConfigurationMap;
            java.lang.String str = list.get(i % list.size());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(concat);
            sb.append("_fi");
            arrayList.add(kotlin.TuplesKt.to(concat, com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.createArgumentForPreview$default(fundingInstrumentPreviewData, concat, str, null, null, fundingInstrumentUiModel.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit ? com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalDebit() : null, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(fundingInstrumentUiModel, sb.toString(), null, null, null, null, null, 62, null), 12, null)));
            i = i2;
        }
        java.util.Map map = kotlin.collections.MapsKt.toMap(arrayList);
        return kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData[]{new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData("All Failed - ".concat(java.lang.String.valueOf(fundingInstrumentUiModel.getName())), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements(new com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult(kotlin.collections.CollectionsKt.emptyList(), bulkUpdateFiPostUpdatePreviewParameterProvider.getHighSpeedVideoSizes), map, null, 4, null)), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData("Partial Failure - ".concat(java.lang.String.valueOf(fundingInstrumentUiModel.getName())), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements(new com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult(kotlin.collections.CollectionsKt.listOf("agreement_1"), kotlin.collections.MapsKt.minus(bulkUpdateFiPostUpdatePreviewParameterProvider.getHighSpeedVideoSizes, "agreement_1")), map, null, 4, null)), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData("All Success - ".concat(java.lang.String.valueOf(fundingInstrumentUiModel.getName())), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements(new com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult(kotlin.collections.CollectionsKt.toList(map.keySet()), kotlin.collections.MapsKt.emptyMap()), map, null, 4, null))});
    }
}
