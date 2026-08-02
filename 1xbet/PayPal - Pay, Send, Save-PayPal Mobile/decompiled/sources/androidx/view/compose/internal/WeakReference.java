package androidx.view.compose.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u0006*\u00028\u00008\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigation/compose/internal/WeakReference;", "", "T", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "<init>", "(Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "", "clear", "()V", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes", "Ljava/lang/ref/WeakReference;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeakReference<T> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<T> Camera2StreamConfigurationMap;

    public WeakReference(T t) {
        this.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(t);
    }

    public final T get() {
        return this.Camera2StreamConfigurationMap.get();
    }

    public final void clear() {
        this.Camera2StreamConfigurationMap.clear();
    }
}
