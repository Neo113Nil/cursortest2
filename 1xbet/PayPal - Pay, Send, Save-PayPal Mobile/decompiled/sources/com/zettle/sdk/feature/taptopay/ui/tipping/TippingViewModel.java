package com.zettle.sdk.feature.taptopay.ui.tipping;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeatureDelegate;", "delegate", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeatureDelegate;)V", "", "onCustomerTipScreenViewed", "()V", "", "amount", "", "preset1", "preset2", "preset3", "onPercentageScreenViewed", "(JFFF)V", "percentage", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "startTransaction", "(FI)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Float;Ljava/lang/Long;)V", "tippingSkipped", "maxGratuityPercent", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMaxGratuityPercent", "()F", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "Camera2StreamConfigurationMap", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TippingViewModel extends androidx.view.ViewModel {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics Camera2StreamConfigurationMap;
    private final float maxGratuityPercent;

    public TippingViewModel(com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureDelegate tapToPayFeatureDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayFeatureDelegate, "");
        this.Camera2StreamConfigurationMap = tapToPayFeatureDelegate.getTippingAnalytics$ui_publicRelease();
        this.maxGratuityPercent = tapToPayFeatureDelegate.getMaxGratuityPercent$ui_publicRelease();
    }

    public final float getMaxGratuityPercent() {
        return this.maxGratuityPercent;
    }

    public final void onPercentageScreenViewed(long amount, float preset1, float preset2, float preset3) {
        this.Camera2StreamConfigurationMap.trackPresetScreenViewed(java.lang.String.valueOf(amount), java.lang.String.valueOf(preset1), java.lang.String.valueOf(preset2), java.lang.String.valueOf(preset3));
    }

    public final void onCustomerTipScreenViewed() {
        this.Camera2StreamConfigurationMap.trackCustomTipScreenViewed();
    }

    public final void tippingSkipped() {
        this.Camera2StreamConfigurationMap.trackTipSkipped();
    }

    public final void startTransaction(float percentage, int position) {
        this.Camera2StreamConfigurationMap.trackPresetSelected(java.lang.String.valueOf(percentage), java.lang.String.valueOf(position));
    }

    public static /* synthetic */ void startTransaction$default(com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel tippingViewModel, java.lang.Float f, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        tippingViewModel.startTransaction(f, l);
    }

    public final void startTransaction(java.lang.Float percentage, java.lang.Long value) {
        this.Camera2StreamConfigurationMap.trackCustomTipAdded(java.lang.String.valueOf(percentage), java.lang.String.valueOf(value));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        public static final int $stable = 0;

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            return new com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel(com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureKt.getDelegate());
        }
    }
}
