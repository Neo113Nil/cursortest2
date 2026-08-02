package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public final class EmptyArrayMap extends kotlin.reflect.jvm.internal.impl.util.ArrayMap {
    public static final kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap INSTANCE = new kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap();

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final java.lang.Void get(int i) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int getSize() {
        return 0;
    }

    private EmptyArrayMap() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void set(int i, java.lang.Void r2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "");
        throw new java.lang.IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1();
    }
}
