package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\f\n\u0004\b\u000b\u0010\b\u0012\u0004\b\f\u0010\n"}, d2 = {"Lcom/zettle/sdk/ZettleSDkReporter$Companion;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/ZettleSDkReporter;", "create", "(Lcom/zettle/sdk/ZettleSDkReporter$Companion;Lcom/zettle/sdk/analytics/Analytics;)Lcom/zettle/sdk/ZettleSDkReporter;", "", "ACTION_ADD_FEATURES", "Ljava/lang/String;", "getACTION_ADD_FEATURES$annotations", "()V", "ACTION_REMOVE_FEATURES", "getACTION_REMOVE_FEATURES$annotations"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ZettleSDkReporterKt {
    public static final java.lang.String ACTION_ADD_FEATURES = "AddFeatures";
    public static final java.lang.String ACTION_REMOVE_FEATURES = "RemoveFeatures";

    public static /* synthetic */ void getACTION_ADD_FEATURES$annotations() {
    }

    public static /* synthetic */ void getACTION_REMOVE_FEATURES$annotations() {
    }

    public static final com.zettle.sdk.ZettleSDkReporter create(com.zettle.sdk.ZettleSDkReporter.Companion companion, com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        return new com.zettle.sdk.ZettleSDkReporterImpl(analytics);
    }
}
