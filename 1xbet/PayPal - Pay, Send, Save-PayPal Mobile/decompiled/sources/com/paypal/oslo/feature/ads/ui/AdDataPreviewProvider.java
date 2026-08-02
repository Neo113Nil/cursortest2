package com.paypal.oslo.feature.ads.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/ads/ui/AdDataPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdDataPreviewProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.ads.domain.model.AdData> {
    public static final int $stable = 8;
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.ads.domain.model.AdData> values;

    public AdDataPreviewProvider() {
        com.paypal.oslo.feature.ads.domain.model.AdData Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.ads.domain.model.AdData Camera2StreamConfigurationMap2;
        com.paypal.oslo.feature.ads.domain.model.AdData Camera2StreamConfigurationMap3;
        Camera2StreamConfigurationMap = com.paypal.oslo.feature.ads.ui.AdDataPreviewProviderKt.Camera2StreamConfigurationMap("Special Summer Collection", "Exclusive Partner Brand", "Partner Brand", "Shop Now", 360, 200);
        Camera2StreamConfigurationMap2 = com.paypal.oslo.feature.ads.ui.AdDataPreviewProviderKt.Camera2StreamConfigurationMap("Electronics Sale", "Tech Store", "TechHub", "Explore", 360, 200);
        Camera2StreamConfigurationMap3 = com.paypal.oslo.feature.ads.ui.AdDataPreviewProviderKt.Camera2StreamConfigurationMap("Limited Time Offer", "Fashion Retailer", "StylePro", "Get Deal", 360, 200);
        this.values = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.ads.domain.model.AdData[]{Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap3});
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
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.ads.domain.model.AdData> getValues() {
        return this.values;
    }
}
