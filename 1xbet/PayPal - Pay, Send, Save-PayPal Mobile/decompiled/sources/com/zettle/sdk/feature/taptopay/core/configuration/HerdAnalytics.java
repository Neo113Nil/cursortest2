package com.zettle.sdk.feature.taptopay.core.configuration;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "", "", "failureReason", "", "failed", "(Ljava/lang/String;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "success", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface HerdAnalytics {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.Companion.Camera2StreamConfigurationMap;

    void failed(java.lang.String failureReason);

    void start();

    void success();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.Companion();

        private Companion() {
        }
    }
}
