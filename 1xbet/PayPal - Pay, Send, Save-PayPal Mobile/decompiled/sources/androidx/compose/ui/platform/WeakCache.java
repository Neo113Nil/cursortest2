package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0004R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/platform/WeakCache;", "T", "", "<init>", "()V", "element", "", com.adjust.sdk.Constants.PUSH, "(Ljava/lang/Object;)V", "pop", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/Reference;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/ReferenceQueue;", "Camera2StreamConfigurationMap", "Ljava/lang/ref/ReferenceQueue;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;
    private final androidx.compose.runtime.collection.MutableVector<java.lang.ref.Reference<T>> getHighSpeedVideoFpsRanges = new androidx.compose.runtime.collection.MutableVector<>(new java.lang.ref.Reference[16], 0);
    private final java.lang.ref.ReferenceQueue<T> Camera2StreamConfigurationMap = new java.lang.ref.ReferenceQueue<>();

    public final void push(T element) {
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoFpsRanges.add(new java.lang.ref.WeakReference(element, this.Camera2StreamConfigurationMap));
    }

    public final T pop() {
        getHighResolutionOutputSizeshNQ4ISI();
        while (this.getHighSpeedVideoFpsRanges.getSize() != 0) {
            T t = this.getHighSpeedVideoFpsRanges.removeAt(r0.getSize() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final int getSize() {
        getHighResolutionOutputSizeshNQ4ISI();
        return this.getHighSpeedVideoFpsRanges.getSize();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.ref.Reference<? extends T> poll;
        do {
            poll = this.Camera2StreamConfigurationMap.poll();
            if (poll != null) {
                this.getHighSpeedVideoFpsRanges.remove(poll);
            }
        } while (poll != null);
    }
}
