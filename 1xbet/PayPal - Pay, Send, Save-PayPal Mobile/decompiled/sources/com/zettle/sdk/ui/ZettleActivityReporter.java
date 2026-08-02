package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/ui/ZettleActivityReporter;", "", "", "failureReason", "", "reportUnexpectedActivityFinish", "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ZettleActivityReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.ui.ZettleActivityReporter.Companion INSTANCE = com.zettle.sdk.ui.ZettleActivityReporter.Companion.getHighSpeedVideoFpsRanges;

    void reportUnexpectedActivityFinish(java.lang.String failureReason);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/ui/ZettleActivityReporter$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/ui/ZettleActivityReporter;", "create", "(Lcom/zettle/sdk/analytics/Analytics;)Lcom/zettle/sdk/ui/ZettleActivityReporter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.ui.ZettleActivityReporter.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.ui.ZettleActivityReporter.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.ui.ZettleActivityReporter create(com.zettle.sdk.analytics.Analytics analytics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
            return new com.zettle.sdk.ui.ZettleActivityReporterImpl(analytics);
        }
    }
}
