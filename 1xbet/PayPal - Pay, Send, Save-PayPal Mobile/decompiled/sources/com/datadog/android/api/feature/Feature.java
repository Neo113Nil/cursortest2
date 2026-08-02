package com.datadog.android.api.feature;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/api/feature/Feature;", "", "Landroid/content/Context;", "appContext", "", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "", "getName", "()Ljava/lang/String;", "name", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Feature {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.feature.Feature.Companion INSTANCE = com.datadog.android.api.feature.Feature.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final java.lang.String FLAGS_EVALUATIONS_FEATURE_NAME = "flags-evaluations";
    public static final java.lang.String FLAGS_FEATURE_NAME = "flags";
    public static final java.lang.String LOGS_FEATURE_NAME = "logs";
    public static final java.lang.String NDK_CRASH_REPORTS_FEATURE_NAME = "ndk-crash-reporting";
    public static final java.lang.String PROFILING_FEATURE_NAME = "profiling";
    public static final java.lang.String RUM_FEATURE_NAME = "rum";
    public static final java.lang.String SESSION_REPLAY_FEATURE_NAME = "session-replay";
    public static final java.lang.String SESSION_REPLAY_RESOURCES_FEATURE_NAME = "session-replay-resources";
    public static final java.lang.String TRACING_FEATURE_NAME = "tracing";

    java.lang.String getName();

    void onInitialize(android.content.Context appContext);

    void onStop();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/feature/Feature$Companion;", "", "<init>", "()V", "", "FLAGS_EVALUATIONS_FEATURE_NAME", "Ljava/lang/String;", "FLAGS_FEATURE_NAME", "LOGS_FEATURE_NAME", "NDK_CRASH_REPORTS_FEATURE_NAME", "PROFILING_FEATURE_NAME", "RUM_FEATURE_NAME", "SESSION_REPLAY_FEATURE_NAME", "SESSION_REPLAY_RESOURCES_FEATURE_NAME", "TRACING_FEATURE_NAME"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String FLAGS_EVALUATIONS_FEATURE_NAME = "flags-evaluations";
        public static final java.lang.String FLAGS_FEATURE_NAME = "flags";
        public static final java.lang.String LOGS_FEATURE_NAME = "logs";
        public static final java.lang.String NDK_CRASH_REPORTS_FEATURE_NAME = "ndk-crash-reporting";
        public static final java.lang.String PROFILING_FEATURE_NAME = "profiling";
        public static final java.lang.String RUM_FEATURE_NAME = "rum";
        public static final java.lang.String SESSION_REPLAY_FEATURE_NAME = "session-replay";
        public static final java.lang.String SESSION_REPLAY_RESOURCES_FEATURE_NAME = "session-replay-resources";
        public static final java.lang.String TRACING_FEATURE_NAME = "tracing";
        static final /* synthetic */ com.datadog.android.api.feature.Feature.Companion getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.api.feature.Feature.Companion();

        private Companion() {
        }
    }
}
