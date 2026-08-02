package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/AggregatingVitalMonitor;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "<init>", "()V", "", "getLastSample", "()D", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", "p0", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;D)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onNewSample", "(D)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "register", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;)V", "unregister", "Camera2StreamConfigurationMap", "D", "getHighResolutionOutputSizeshNQ4ISI", "", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AggregatingVitalMonitor implements com.datadog.android.rum.internal.vitals.VitalMonitor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile double getHighResolutionOutputSizeshNQ4ISI = Double.NaN;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<com.datadog.android.rum.internal.vitals.VitalListener, com.datadog.android.rum.internal.vitals.VitalInfo> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap();

    @Override // com.datadog.android.rum.internal.vitals.VitalObserver
    public final void onNewSample(double value) {
        this.getHighResolutionOutputSizeshNQ4ISI = value;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            java.util.Iterator<com.datadog.android.rum.internal.vitals.VitalListener> it = this.getHighSpeedVideoFpsRanges.keySet().iterator();
            while (it.hasNext()) {
                getHighSpeedVideoFpsRangesFor(it.next(), value);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    /* renamed from: getLastSample, reason: from getter */
    public final double getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final void register(com.datadog.android.rum.internal.vitals.VitalListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        double d = this.getHighResolutionOutputSizeshNQ4ISI;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges.put(listener, com.datadog.android.rum.internal.vitals.VitalInfo.INSTANCE.getEMPTY());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (java.lang.Double.isNaN(d)) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(listener, d);
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final void unregister(com.datadog.android.rum.internal.vitals.VitalListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges.remove(listener);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.vitals.VitalListener p0, double p1) {
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo = this.getHighSpeedVideoFpsRanges.get(p0);
        if (vitalInfo == null) {
            vitalInfo = com.datadog.android.rum.internal.vitals.VitalInfo.INSTANCE.getEMPTY();
        }
        int sampleCount = vitalInfo.getSampleCount() + 1;
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo2 = new com.datadog.android.rum.internal.vitals.VitalInfo(sampleCount, java.lang.Math.min(p1, vitalInfo.getMinValue()), java.lang.Math.max(p1, vitalInfo.getMaxValue()), ((vitalInfo.getSampleCount() * vitalInfo.getMeanValue()) + p1) / sampleCount);
        p0.onVitalUpdate(vitalInfo2);
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges.put(p0, vitalInfo2);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
