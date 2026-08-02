package com.datadog.android.rum.internal.instrumentation.insights;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0018\u0010\u0010J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0006R\u001c\u0010!\u001a\u00020\u001c8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\u00020\r8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsUpdatesListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addUpdateListener", "(Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsUpdatesListener;)V", "onAction", "()V", "", "cpuTicks", "onCpuVital", "(Ljava/lang/Double;)V", "", "durationNs", "onLongTask", "(J)V", "memoryValue", "onMemoryVital", "onNetworkRequest", "", "name", "onNewView", "(Ljava/lang/String;)V", "onSlowFrame", "rate", "onSlowFrameRate", "removeUpdateListener", "", "getMaxSize", "()I", "setMaxSize", "(I)V", "maxSize", "getUpdateIntervalMs", "()J", "setUpdateIntervalMs", "updateIntervalMs"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InsightsCollector {
    void addUpdateListener(com.datadog.android.rum.internal.instrumentation.insights.InsightsUpdatesListener listener);

    int getMaxSize();

    long getUpdateIntervalMs();

    void onAction();

    void onCpuVital(java.lang.Double cpuTicks);

    void onLongTask(long durationNs);

    void onMemoryVital(java.lang.Double memoryValue);

    void onNetworkRequest(long durationNs);

    void onNewView(java.lang.String name2);

    void onSlowFrame(long durationNs);

    void onSlowFrameRate(java.lang.Double rate);

    void removeUpdateListener(com.datadog.android.rum.internal.instrumentation.insights.InsightsUpdatesListener listener);

    void setMaxSize(int i);

    void setUpdateIntervalMs(long j);
}
