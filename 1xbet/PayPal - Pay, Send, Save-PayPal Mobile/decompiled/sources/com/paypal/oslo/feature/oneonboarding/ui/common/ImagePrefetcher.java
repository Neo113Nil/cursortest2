package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B2\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001f\u0010\t\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R-\u0010\u0018\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/common/ImagePrefetcher;", "", "Landroid/app/Application;", "application", "", "Ljava/lang/Class;", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/ui/common/StepImageProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "stepImageProviders", "<init>", "(Landroid/app/Application;Ljava/util/Map;)V", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", io.ktor.http.LinkHeader.Rel.Prefetch, "(Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;)V", "", "imageUrl", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Landroid/app/Application;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/ImageLoader;", "getHighSpeedVideoFpsRanges", "Lcoil3/ImageLoader;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImagePrefetcher {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final coil3.ImageLoader getHighSpeedVideoSizes;
    private final android.app.Application getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ImagePrefetcher(android.app.Application application, java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRangesFor = application;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        this.getHighSpeedVideoSizes = coil3.SingletonImageLoader.get(application);
    }

    public final void prefetch(com.paypal.oslo.feature.oneonboarding.domain.Flow flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> steps = flow.getSteps();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = steps.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider stepImageProvider = this.getHighResolutionOutputSizeshNQ4ISI.get(((com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig) it.next()).getClass());
            java.util.List<java.lang.String> images = stepImageProvider != null ? stepImageProvider.getImages() : null;
            if (images == null) {
                images = kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, images);
        }
        java.util.Iterator it2 = kotlin.collections.CollectionsKt.distinct(arrayList).iterator();
        while (it2.hasNext()) {
            prefetch((java.lang.String) it2.next());
        }
    }

    public final void prefetch(java.lang.String imageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        this.getHighSpeedVideoSizes.enqueue(new coil3.request.ImageRequest.Builder(this.getHighSpeedVideoFpsRangesFor).data(imageUrl).build());
    }
}
