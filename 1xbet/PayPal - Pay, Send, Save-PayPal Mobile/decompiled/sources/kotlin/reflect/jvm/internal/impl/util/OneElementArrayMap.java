package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public final class OneElementArrayMap<T> extends kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> {
    private final int Camera2StreamConfigurationMap;
    private final T getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int getSize() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(T t, int i) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        this.getHighSpeedVideoFpsRangesFor = t;
        this.Camera2StreamConfigurationMap = i;
    }

    public final int getIndex() {
        return this.Camera2StreamConfigurationMap;
    }

    public final T getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void set(int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        throw new java.lang.IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final T get(int i) {
        if (i == this.Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1(this);
    }
}
