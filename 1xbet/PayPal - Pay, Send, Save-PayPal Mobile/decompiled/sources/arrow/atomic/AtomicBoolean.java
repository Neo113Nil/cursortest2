package arrow.atomic;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\u0005"}, d2 = {"Larrow/atomic/AtomicBoolean;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Z)V", "expected", "new", "compareAndSet", "(ZZ)Z", "get", "()Z", "", "set", "getAndSet", "(Z)Z", "Ljava/util/concurrent/atomic/AtomicInteger;", "Larrow/atomic/getHighSpeedVideoFpsRanges;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicInteger;", "getValue", "setValue"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtomicBoolean {
    private final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;

    public AtomicBoolean(boolean z) {
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(z ? 1 : 0);
    }

    public final boolean getValue() {
        return arrow.atomic.AtomicIntKt.getValue(this.Camera2StreamConfigurationMap) != 0;
    }

    public final void setValue(boolean z) {
        arrow.atomic.AtomicIntKt.setValue(this.Camera2StreamConfigurationMap, z ? 1 : 0);
    }

    public final boolean compareAndSet(boolean expected, boolean r3) {
        return this.Camera2StreamConfigurationMap.compareAndSet(expected ? 1 : 0, r3 ? 1 : 0);
    }

    public final boolean get() {
        return getValue();
    }

    public final void set(boolean value) {
        setValue(value);
    }

    public final boolean getAndSet(boolean value) {
        return this.Camera2StreamConfigurationMap.getAndSet(value ? 1 : 0) == 1;
    }
}
