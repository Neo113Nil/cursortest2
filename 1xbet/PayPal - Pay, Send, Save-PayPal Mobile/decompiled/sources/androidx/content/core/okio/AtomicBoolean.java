package androidx.content.core.okio;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/datastore/core/okio/AtomicBoolean;", "", "", "initialValue", "<init>", "(Z)V", "get", "()Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AtomicBoolean {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;

    public AtomicBoolean(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(z);
    }

    public final boolean get() {
        return this.getHighSpeedVideoFpsRangesFor.get();
    }

    public final void set(boolean value) {
        this.getHighSpeedVideoFpsRangesFor.set(value);
    }
}
