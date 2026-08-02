package com.paypal.oslo.feature.onboarding.postonboarding.common;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/common/ImagePrefetcher;", "", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "", "", "imageUrls", "", "prefetchImages$onboarding_prodRelease", "(Ljava/util/List;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/app/Application;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/commonui/components/ImageLoader;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/commonui/components/ImageLoader;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImagePrefetcher {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.app.Application getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.commonui.components.ImageLoader getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ImagePrefetcher(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        this.getHighSpeedVideoFpsRangesFor = application;
        this.getHighSpeedVideoFpsRanges = com.paypal.oslo.core.commonui.components.AsyncImageKt.getImageLoader(application);
    }

    public final void prefetchImages$onboarding_prodRelease(java.util.List<java.lang.String> imageUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrls, "");
        java.util.Iterator<T> it = imageUrls.iterator();
        while (it.hasNext()) {
            this.getHighSpeedVideoFpsRanges.enqueue(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder(this.getHighSpeedVideoFpsRangesFor).data((java.lang.String) it.next()).build());
        }
    }
}
