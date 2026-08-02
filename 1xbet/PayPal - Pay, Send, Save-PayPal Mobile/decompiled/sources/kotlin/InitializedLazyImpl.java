package kotlin;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00028\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/InitializedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InitializedLazyImpl<T> implements kotlin.Lazy<T>, java.io.Serializable {
    private final T value;

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return true;
    }

    public InitializedLazyImpl(T t) {
        this.value = t;
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(getValue());
    }
}
