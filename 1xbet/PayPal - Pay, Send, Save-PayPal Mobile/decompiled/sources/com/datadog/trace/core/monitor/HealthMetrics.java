package com.datadog.trace.core.monitor;

/* loaded from: classes3.dex */
public abstract class HealthMetrics implements java.lang.AutoCloseable {
    public static com.datadog.trace.core.monitor.HealthMetrics NO_OP = new com.datadog.trace.core.monitor.HealthMetrics() { // from class: com.datadog.trace.core.monitor.HealthMetrics.1
    };

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    public void onActivateScope() {
    }

    public void onCancelContinuation() {
    }

    public void onCaptureContinuation() {
    }

    public void onCloseScope() {
    }

    public void onCreateSpan() {
    }

    public void onCreateTrace() {
    }

    public void onFailedPublish(int i, int i2) {
    }

    public void onFailedSerialize(java.util.List<com.datadog.trace.core.DDSpan> list, java.lang.Throwable th) {
    }

    public void onFinishContinuation() {
    }

    public void onFinishSpan() {
    }

    public void onFlush(boolean z) {
    }

    public void onLongRunningUpdate(int i, int i2, int i3) {
    }

    public void onPartialFlush(int i) {
    }

    public void onPartialPublish(int i) {
    }

    public void onPublish(java.util.List<com.datadog.trace.core.DDSpan> list, int i) {
    }

    public void onScheduleFlush(boolean z) {
    }

    public void onScopeCloseError(int i) {
    }

    public void onScopeStackOverflow() {
    }

    public void onSerialize(int i) {
    }

    public void onShutdown(boolean z) {
    }

    public void onSingleSpanSample() {
    }

    public void onSingleSpanUnsampled() {
    }

    public void onStart(int i) {
    }

    public void start() {
    }

    public java.lang.String summary() {
        return "";
    }
}
