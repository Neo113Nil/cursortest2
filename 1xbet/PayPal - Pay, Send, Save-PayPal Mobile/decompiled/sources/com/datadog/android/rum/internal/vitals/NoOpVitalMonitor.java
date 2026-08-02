package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/NoOpVitalMonitor;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "<init>", "()V", "", "getLastSample", "()D", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onNewSample", "(D)V", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "register", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;)V", "unregister"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpVitalMonitor implements com.datadog.android.rum.internal.vitals.VitalMonitor {
    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final double getLastSample() {
        return 0.0d;
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalObserver
    public final void onNewSample(double value) {
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final void unregister(com.datadog.android.rum.internal.vitals.VitalListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final void register(com.datadog.android.rum.internal.vitals.VitalListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }
}
