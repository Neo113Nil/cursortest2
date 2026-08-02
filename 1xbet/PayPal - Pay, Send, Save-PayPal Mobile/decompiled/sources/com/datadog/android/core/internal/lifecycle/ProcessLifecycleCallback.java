package com.datadog.android.core.internal.lifecycle;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleCallback;", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "Landroid/content/Context;", "appContext", "", "instanceName", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)V", "", "onPaused", "()V", "onResumed", "onStarted", "onStopped", "Ljava/lang/ref/Reference;", "contextWeakRef", "Ljava/lang/ref/Reference;", "getContextWeakRef$dd_sdk_android_core_release", "()Ljava/lang/ref/Reference;", "Ljava/lang/String;", "getInstanceName$dd_sdk_android_core_release", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProcessLifecycleCallback implements com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback {
    private final java.lang.ref.Reference<android.content.Context> contextWeakRef;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;
    private final java.lang.String instanceName;

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onPaused() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onResumed() {
    }

    public ProcessLifecycleCallback(android.content.Context context, java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.instanceName = str;
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.contextWeakRef = new java.lang.ref.WeakReference(context);
    }

    /* renamed from: getInstanceName$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getInstanceName() {
        return this.instanceName;
    }

    public final java.lang.ref.Reference<android.content.Context> getContextWeakRef$dd_sdk_android_core_release() {
        return this.contextWeakRef;
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onStarted() {
        android.content.Context context = this.contextWeakRef.get();
        if (context == null || !androidx.work.WorkManager.isInitialized()) {
            return;
        }
        com.datadog.android.core.internal.utils.WorkManagerUtilsKt.cancelUploadWorker(context, this.instanceName, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onStopped() {
        android.content.Context context = this.contextWeakRef.get();
        if (context == null || !androidx.work.WorkManager.isInitialized()) {
            return;
        }
        com.datadog.android.core.internal.utils.WorkManagerUtilsKt.triggerUploadWorker(context, this.instanceName, this.getHighSpeedVideoFpsRangesFor);
    }
}
