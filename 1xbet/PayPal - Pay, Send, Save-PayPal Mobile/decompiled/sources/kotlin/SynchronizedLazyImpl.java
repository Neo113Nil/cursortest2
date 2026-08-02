package kotlin;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001a\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "Lkotlin/Function0;", "p0", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getValue", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SynchronizedLazyImpl<T> implements kotlin.Lazy<T>, java.io.Serializable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<? extends T> getHighSpeedVideoFpsRanges;

    public SynchronizedLazyImpl(kotlin.jvm.functions.Function0<? extends T> function0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.UNINITIALIZED_VALUE.INSTANCE;
        this.Camera2StreamConfigurationMap = obj == null ? this : obj;
    }

    public /* synthetic */ SynchronizedLazyImpl(kotlin.jvm.functions.Function0 function0, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj);
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        T t;
        T t2 = (T) this.getHighResolutionOutputSizeshNQ4ISI;
        if (t2 != kotlin.UNINITIALIZED_VALUE.INSTANCE) {
            return t2;
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            t = (T) this.getHighResolutionOutputSizeshNQ4ISI;
            if (t == kotlin.UNINITIALIZED_VALUE.INSTANCE) {
                kotlin.jvm.functions.Function0<? extends T> function0 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(function0);
                t = function0.invoke();
                this.getHighResolutionOutputSizeshNQ4ISI = t;
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
        return t;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.getHighResolutionOutputSizeshNQ4ISI != kotlin.UNINITIALIZED_VALUE.INSTANCE;
    }

    public final java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final java.lang.Object writeReplace() {
        return new kotlin.InitializedLazyImpl(getValue());
    }
}
