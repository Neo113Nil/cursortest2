package kotlin;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011"}, d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "Lkotlin/Function0;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/getHighSpeedVideoSizes;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnsafeLazyImpl<T> implements kotlin.Lazy<T>, java.io.Serializable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Object getHighSpeedVideoFpsRangesFor;

    public UnsafeLazyImpl(kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRangesFor = kotlin.UNINITIALIZED_VALUE.INSTANCE;
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        if (this.getHighSpeedVideoFpsRangesFor == kotlin.UNINITIALIZED_VALUE.INSTANCE) {
            kotlin.jvm.functions.Function0<? extends T> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(function0);
            this.getHighSpeedVideoFpsRangesFor = function0.invoke();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        return (T) this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.getHighSpeedVideoFpsRangesFor != kotlin.UNINITIALIZED_VALUE.INSTANCE;
    }

    public final java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final java.lang.Object writeReplace() {
        return new kotlin.InitializedLazyImpl(getValue());
    }

    private final void readObject(java.io.ObjectInputStream input) {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }
}
