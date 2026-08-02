package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class AbstractArrayMapOwner<K, V> implements java.lang.Iterable<V>, kotlin.jvm.internal.markers.KMappedMarker {
    protected abstract kotlin.reflect.jvm.internal.impl.util.ArrayMap<V> getArrayMap();

    protected abstract kotlin.reflect.jvm.internal.impl.util.TypeRegistry<K, V> getTypeRegistry();

    protected abstract void registerComponent(java.lang.String str, V v);

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {
        private final int getHighResolutionOutputSizeshNQ4ISI;

        public AbstractArrayMapAccessor(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        protected final T extractValue(kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner<K, V> abstractArrayMapOwner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractArrayMapOwner, "");
            return abstractArrayMapOwner.getArrayMap().get(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    protected final void registerComponent(kotlin.reflect.KClass<? extends K> kClass, V v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
        java.lang.String qualifiedName = kClass.getQualifiedName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(qualifiedName);
        registerComponent(qualifiedName, (java.lang.String) v);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }
}
