package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/media/SharedReference;", "T", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/camera/camera2/pipe/media/Finalizer;", "defaultFinalizer", "<init>", "(Ljava/lang/Object;Landroidx/camera/camera2/pipe/media/Finalizer;)V", "acquireOrNull", "()Ljava/lang/Object;", "", "decrement", "()V", "setFinalizer", "(Landroidx/camera/camera2/pipe/media/Finalizer;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicInt;", "Lkotlinx/atomicfu/AtomicInt;", "Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/atomicfu/AtomicRef;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedReference<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final T getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicInt getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.atomicfu.AtomicRef<androidx.camera.camera2.pipe.media.Finalizer<T>> Camera2StreamConfigurationMap;

    public SharedReference(T t, androidx.camera.camera2.pipe.media.Finalizer<? super T> finalizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalizer, "");
        this.getHighSpeedVideoFpsRanges = t;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(1);
        this.Camera2StreamConfigurationMap = kotlinx.atomicfu.AtomicFU.atomic(finalizer);
    }

    public final T acquireOrNull() {
        int value;
        int i;
        kotlinx.atomicfu.AtomicInt atomicInt = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = atomicInt.getValue();
            i = value == 0 ? 0 : value + 1;
        } while (!atomicInt.compareAndSet(value, i));
        if (i != 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        return null;
    }

    public final void decrement() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.decrementAndGet() == 0) {
            androidx.camera.camera2.pipe.media.Finalizer<T> andSet = this.Camera2StreamConfigurationMap.getAndSet(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(andSet);
            andSet.finalize(this.getHighSpeedVideoFpsRanges);
        }
    }

    public final void setFinalizer(androidx.camera.camera2.pipe.media.Finalizer<? super T> value) {
        androidx.camera.camera2.pipe.media.Finalizer<T> value2;
        androidx.camera.camera2.pipe.media.Finalizer<T> finalizer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.atomicfu.AtomicRef<androidx.camera.camera2.pipe.media.Finalizer<T>> atomicRef = this.Camera2StreamConfigurationMap;
        do {
            value2 = atomicRef.getValue();
            finalizer = value2;
        } while (!atomicRef.compareAndSet(value2, finalizer == null ? null : value));
        if (finalizer != null) {
            finalizer.finalize(null);
        } else {
            value.finalize(null);
        }
    }
}
