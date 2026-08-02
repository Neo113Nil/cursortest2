package com.datadog.android.core.internal.time;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/core/internal/time/DefaultAppStartTimeProvider;", "Lcom/datadog/android/core/internal/time/AppStartTimeProvider;", "Lkotlin/Function0;", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProviderFactory", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "", "appStartTimeNs$delegate", "Lkotlin/Lazy;", "getAppStartTimeNs", "()J", "appStartTimeNs", "getAppUptimeNs", "appUptimeNs", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAppStartTimeProvider implements com.datadog.android.core.internal.time.AppStartTimeProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.time.DefaultAppStartTimeProvider.Companion INSTANCE = new com.datadog.android.core.internal.time.DefaultAppStartTimeProvider.Companion(null);
    private static final long PROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS;
    private final kotlin.jvm.functions.Function0<com.datadog.android.internal.time.TimeProvider> Camera2StreamConfigurationMap;

    /* renamed from: appStartTimeNs$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy appStartTimeNs;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAppStartTimeProvider(kotlin.jvm.functions.Function0<? extends com.datadog.android.internal.time.TimeProvider> function0, final com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.Camera2StreamConfigurationMap = function0;
        this.appStartTimeNs = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Long>() { // from class: com.datadog.android.core.internal.time.DefaultAppStartTimeProvider$appStartTimeNs$2
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
            
                if ((com.datadog.android.rum.DdRumContentProvider.INSTANCE.getCreateTimeNs() - r5) > com.datadog.android.core.internal.time.DefaultAppStartTimeProvider.INSTANCE.getPROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS$dd_sdk_android_core_release()) goto L6;
             */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Long invoke() {
                long createTimeNs;
                kotlin.jvm.functions.Function0 function02;
                if (com.datadog.android.internal.system.BuildSdkVersionProvider.this.getIsAtLeastN()) {
                    function02 = this.Camera2StreamConfigurationMap;
                    com.datadog.android.internal.time.TimeProvider timeProvider = (com.datadog.android.internal.time.TimeProvider) function02.invoke();
                    createTimeNs = timeProvider.getDeviceElapsedTimeNanos() - java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(timeProvider.getDeviceElapsedRealtimeMillis() - android.os.Process.getStartElapsedRealtime());
                }
                createTimeNs = com.datadog.android.rum.DdRumContentProvider.INSTANCE.getCreateTimeNs();
                return java.lang.Long.valueOf(createTimeNs);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public /* synthetic */ DefaultAppStartTimeProvider(kotlin.jvm.functions.Function0 function0, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    @Override // com.datadog.android.core.internal.time.AppStartTimeProvider
    public final long getAppStartTimeNs() {
        return ((java.lang.Number) this.appStartTimeNs.getValue()).longValue();
    }

    @Override // com.datadog.android.core.internal.time.AppStartTimeProvider
    public final long getAppUptimeNs() {
        return this.Camera2StreamConfigurationMap.invoke().getDeviceElapsedTimeNanos() - getAppStartTimeNs();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/time/DefaultAppStartTimeProvider$Companion;", "", "<init>", "()V", "", "PROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS", "J", "getPROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS$dd_sdk_android_core_release", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getPROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.time.DefaultAppStartTimeProvider.PROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        PROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS = kotlin.time.Duration.m23955getInWholeNanosecondsimpl(kotlin.time.DurationKt.toDuration(10, kotlin.time.DurationUnit.SECONDS));
    }
}
