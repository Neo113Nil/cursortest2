package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/lifecycle/AtomicReference;", "V", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "expectedValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtomicReference<V> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<V> getHighSpeedVideoFpsRanges;

    public AtomicReference(V v) {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(v);
    }

    public final V get() {
        return this.getHighSpeedVideoFpsRanges.get();
    }

    public final boolean compareAndSet(V expectedValue, V newValue) {
        return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, expectedValue, newValue);
    }
}
