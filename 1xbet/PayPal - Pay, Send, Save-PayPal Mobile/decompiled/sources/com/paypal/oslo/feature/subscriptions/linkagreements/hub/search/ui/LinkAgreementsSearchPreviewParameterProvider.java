package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchScreenState;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "getHighSpeedVideoFpsRanges", "()Ljava/util/List;", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class LinkAgreementsSearchPreviewParameterProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges = 5;

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    private final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> getHighSpeedVideoFpsRanges() {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i > 0) {
            int i2 = 1;
            while (true) {
                createListBuilder.add(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("id_".concat(java.lang.String.valueOf(i2)), "Merchant ".concat(java.lang.String.valueOf(i2)), "", ""));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> getValues() {
        return kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState[]{new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState(null, null, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.GENERIC_ERROR, null, 2, null), 3, null), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState("Google", null, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.SEARCH_NOT_FOUND, null, 2, null), 2, null), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState(null, null, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Loading.INSTANCE, 3, null), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState(null, getHighSpeedVideoFpsRanges(), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants(getHighSpeedVideoFpsRanges()), 1, null), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState(null, null, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults(getHighSpeedVideoFpsRanges()), 3, null)});
    }
}
