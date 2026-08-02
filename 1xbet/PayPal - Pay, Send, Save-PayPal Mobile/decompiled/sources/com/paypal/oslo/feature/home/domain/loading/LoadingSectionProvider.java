package com.paypal.oslo.feature.home.domain.loading;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\"\b\u0007\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR%\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "", "", "", "Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "Lkotlin/jvm/JvmSuppressWildcards;", "sectionLoadingFactories", "<init>", "(Ljava/util/Map;)V", "sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/SectionLoading;", "createLoadingSections", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoadingSectionProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public LoadingSectionProvider(java.util.Map<java.lang.String, com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SectionLoading>> createLoadingSections(java.lang.String sectionId, java.lang.String sectionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionType, "");
        com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory orDefault = this.getHighSpeedVideoFpsRangesFor.getOrDefault(sectionType, null);
        if (orDefault == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.home.LoggerKt.log, "Unknown section type, using default loading", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sectionId", sectionId), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, sectionType)), null, 4, null);
            orDefault = this.getHighSpeedVideoFpsRangesFor.get(com.paypal.oslo.feature.home.domain.model.SectionTypes.DEFAULT_LOADING);
        }
        java.util.List<com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SectionLoading>> createLoadingSections = orDefault != null ? orDefault.createLoadingSections(sectionId) : null;
        return createLoadingSections == null ? kotlin.collections.CollectionsKt.emptyList() : createLoadingSections;
    }
}
