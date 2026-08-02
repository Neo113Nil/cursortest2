package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000 \t2\u00020\u0001:\u0002\n\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter;", "", "Landroid/app/Activity;", "activity", "Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter$Callback;", com.sun.jna.Callback.METHOD_NAME, "", "subscribeToFirstFrameDrawn", "(Landroid/app/Activity;Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter$Callback;)V", "Companion", "Callback"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RumFirstDrawTimeReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Companion INSTANCE = com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter$Callback;", "", "", "timestampNs", "", "onFirstFrameDrawn", "(J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void onFirstFrameDrawn(long timestampNs);
    }

    void subscribeToFirstFrameDrawn(android.app.Activity activity, com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback callback);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter$Companion;", "", "<init>", "()V", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter;", "create", "(Lcom/datadog/android/core/InternalSdkCore;)Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Companion Camera2StreamConfigurationMap = new com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Companion();

        private Companion() {
        }

        public final com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter create(final com.datadog.android.core.InternalSdkCore sdkCore) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            return new com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl(sdkCore.getInternalLogger(), new kotlin.jvm.functions.Function0<java.lang.Long>() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter$Companion$create$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.Long invoke() {
                    return java.lang.Long.valueOf(com.datadog.android.core.InternalSdkCore.this.getTimeProvider().getDeviceElapsedTimeNanos());
                }

                {
                    super(0);
                }
            }, new com.datadog.android.rum.internal.utils.window.RumWindowCallbacksRegistryImpl(), new android.os.Handler(android.os.Looper.getMainLooper()));
        }
    }
}
