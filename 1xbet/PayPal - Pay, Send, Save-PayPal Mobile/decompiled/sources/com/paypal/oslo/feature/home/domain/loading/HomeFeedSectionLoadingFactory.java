package com.paypal.oslo.feature.home.domain.loading;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/loading/HomeFeedSectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/HeroProductSectionLoadingFactory;", "heroProductSectionPlaceholders", "Lcom/paypal/oslo/feature/home/domain/loading/MerchantSectionLoadingFactory;", "merchantSectionPlaceholders", "<init>", "(Lcom/paypal/oslo/feature/home/domain/loading/HeroProductSectionLoadingFactory;Lcom/paypal/oslo/feature/home/domain/loading/MerchantSectionLoadingFactory;)V", "", "sectionId", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/SectionLoading;", "createLoadingSections", "(Ljava/lang/String;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/home/domain/loading/HeroProductSectionLoadingFactory;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/domain/loading/MerchantSectionLoadingFactory;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HomeFeedSectionLoadingFactory implements com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.loading.MerchantSectionLoadingFactory getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.loading.HeroProductSectionLoadingFactory Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public HomeFeedSectionLoadingFactory(com.paypal.oslo.feature.home.domain.loading.HeroProductSectionLoadingFactory heroProductSectionLoadingFactory, com.paypal.oslo.feature.home.domain.loading.MerchantSectionLoadingFactory merchantSectionLoadingFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroProductSectionLoadingFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantSectionLoadingFactory, "");
        this.Camera2StreamConfigurationMap = heroProductSectionLoadingFactory;
        this.getHighSpeedVideoSizes = merchantSectionLoadingFactory;
    }

    @Override // com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory
    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SectionLoading>> createLoadingSections(java.lang.String sectionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.addAll(this.Camera2StreamConfigurationMap.createLoadingSections("hero_product_loading_1"));
        createListBuilder.addAll(this.getHighSpeedVideoSizes.createLoadingSections("merchant_product_loading_1"));
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
