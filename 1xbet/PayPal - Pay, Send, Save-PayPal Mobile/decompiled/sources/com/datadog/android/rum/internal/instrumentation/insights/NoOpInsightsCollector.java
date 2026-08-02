package com.datadog.android.rum.internal.instrumentation.insights;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\bR\"\u0010\u001e\u001a\u00020\u001d8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u000e8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/insights/NoOpInsightsCollector;", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "<init>", "()V", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsUpdatesListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addUpdateListener", "(Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsUpdatesListener;)V", "onAction", "", "cpuTicks", "onCpuVital", "(Ljava/lang/Double;)V", "", "durationNs", "onLongTask", "(J)V", "memoryValue", "onMemoryVital", "onNetworkRequest", "", "name", "onNewView", "(Ljava/lang/String;)V", "onSlowFrame", "rate", "onSlowFrameRate", "removeUpdateListener", "", "maxSize", com.visa.cbp.getEncExpo.warmup, "getMaxSize", "()I", "setMaxSize", "(I)V", "updateIntervalMs", "J", "getUpdateIntervalMs", "()J", "setUpdateIntervalMs"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpInsightsCollector implements com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector {
    private int maxSize;
    private long updateIntervalMs;

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onAction() {
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onCpuVital(java.lang.Double cpuTicks) {
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onLongTask(long durationNs) {
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onMemoryVital(java.lang.Double memoryValue) {
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onNetworkRequest(long durationNs) {
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onSlowFrame(long durationNs) {
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onSlowFrameRate(java.lang.Double rate) {
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final int getMaxSize() {
        return this.maxSize;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void setMaxSize(int i) {
        this.maxSize = i;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final long getUpdateIntervalMs() {
        return this.updateIntervalMs;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void setUpdateIntervalMs(long j) {
        this.updateIntervalMs = j;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void removeUpdateListener(com.datadog.android.rum.internal.instrumentation.insights.InsightsUpdatesListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void onNewView(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }

    @Override // com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector
    public final void addUpdateListener(com.datadog.android.rum.internal.instrumentation.insights.InsightsUpdatesListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }
}
