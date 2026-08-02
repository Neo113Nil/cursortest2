package com.datadog.android.core.internal.persistence.file.advanced;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ScheduledWriter;", "", "T", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "delegateWriter", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/DataWriter;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "element", "", "write", "(Ljava/lang/Object;)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/util/List;)V", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "getDelegateWriter$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/DataWriter;", "Ljava/util/concurrent/ExecutorService;", "getExecutorService$dd_sdk_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScheduledWriter<T> implements com.datadog.android.core.internal.persistence.DataWriter<T> {
    private final com.datadog.android.core.internal.persistence.DataWriter<T> delegateWriter;
    private final java.util.concurrent.ExecutorService executorService;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    public ScheduledWriter(com.datadog.android.core.internal.persistence.DataWriter<T> dataWriter, java.util.concurrent.ExecutorService executorService, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.delegateWriter = dataWriter;
        this.executorService = executorService;
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    public final com.datadog.android.core.internal.persistence.DataWriter<T> getDelegateWriter$dd_sdk_android_core_release() {
        return this.delegateWriter;
    }

    /* renamed from: getExecutorService$dd_sdk_android_core_release, reason: from getter */
    public final java.util.concurrent.ExecutorService getExecutorService() {
        return this.executorService;
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public final void write(final T element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.executorService, "Data writing", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.file.advanced.ScheduledWriter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.file.advanced.ScheduledWriter.this.delegateWriter.write((com.datadog.android.core.internal.persistence.DataWriter<T>) element);
            }
        });
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public final void write(final java.util.List<? extends T> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.executorService, "Data writing", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.file.advanced.ScheduledWriter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.file.advanced.ScheduledWriter.this.delegateWriter.write(data);
            }
        });
    }
}
