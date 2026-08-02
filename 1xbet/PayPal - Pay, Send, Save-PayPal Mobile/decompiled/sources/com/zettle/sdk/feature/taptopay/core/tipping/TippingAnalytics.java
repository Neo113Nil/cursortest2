package com.zettle.sdk.feature.taptopay.core.tipping;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J'\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0012\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "", "", "percentage", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "trackCustomTipAdded", "(Ljava/lang/String;Ljava/lang/String;)V", "trackCustomTipScreenViewed", "()V", "amount", "preset1", "preset2", "preset3", "trackPresetScreenViewed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", com.daon.sdk.face.license.License.FEATURE_POSITION, "trackPresetSelected", "trackTipSkipped", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TippingAnalytics {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics.Companion.getHighResolutionOutputSizeshNQ4ISI;

    void trackCustomTipAdded(java.lang.String percentage, java.lang.String value);

    void trackCustomTipScreenViewed();

    void trackPresetScreenViewed(java.lang.String amount, java.lang.String preset1, java.lang.String preset2, java.lang.String preset3);

    void trackPresetSelected(java.lang.String percentage, java.lang.String position);

    void trackTipSkipped();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void trackCustomTipAdded$default(com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics tippingAnalytics, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackCustomTipAdded");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            tippingAnalytics.trackCustomTipAdded(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics.Companion();

        private Companion() {
        }
    }
}
