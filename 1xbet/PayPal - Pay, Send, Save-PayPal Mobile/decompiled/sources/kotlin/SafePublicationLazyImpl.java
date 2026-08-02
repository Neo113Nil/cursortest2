package kotlin;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u001fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "Lkotlin/Function0;", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getValue", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SafePublicationLazyImpl<T> implements kotlin.Lazy<T>, java.io.Serializable {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.SafePublicationLazyImpl<?>, java.lang.Object> getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlin.SafePublicationLazyImpl.class, java.lang.Object.class, "getHighSpeedVideoFpsRanges");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile kotlin.jvm.functions.Function0<? extends T> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    public SafePublicationLazyImpl(kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoFpsRangesFor = kotlin.UNINITIALIZED_VALUE.INSTANCE;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.UNINITIALIZED_VALUE.INSTANCE;
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        T t = (T) this.getHighSpeedVideoFpsRangesFor;
        if (t != kotlin.UNINITIALIZED_VALUE.INSTANCE) {
            return t;
        }
        kotlin.jvm.functions.Function0<? extends T> function0 = this.getHighSpeedVideoFpsRanges;
        if (function0 != null) {
            T invoke = function0.invoke();
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, this, kotlin.UNINITIALIZED_VALUE.INSTANCE, invoke)) {
                this.getHighSpeedVideoFpsRanges = null;
                return invoke;
            }
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
