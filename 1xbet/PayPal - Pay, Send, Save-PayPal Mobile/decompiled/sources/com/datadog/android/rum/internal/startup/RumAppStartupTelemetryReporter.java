package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter;", "", "Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "info", "", "indexInSession", "", "reportTTID", "(Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;I)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RumAppStartupTelemetryReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter.Companion INSTANCE = com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter.Companion.Camera2StreamConfigurationMap;

    void reportTTID(com.datadog.android.rum.internal.startup.RumTTIDInfo info, int indexInSession);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter$Companion;", "", "<init>", "()V", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter;", "create", "(Lcom/datadog/android/core/InternalSdkCore;)Lcom/datadog/android/rum/internal/startup/RumAppStartupTelemetryReporter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter.Companion Camera2StreamConfigurationMap = new com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter.Companion();

        private Companion() {
        }

        public final com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter create(com.datadog.android.core.InternalSdkCore sdkCore) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            return new com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl(sdkCore.getInternalLogger(), sdkCore.getAppStartTimeNs(), com.datadog.android.rum.DdRumContentProvider.INSTANCE.getCreateTimeNs(), com.datadog.android.rum.DdRumContentProvider.INSTANCE.getProcessImportance());
        }
    }
}
