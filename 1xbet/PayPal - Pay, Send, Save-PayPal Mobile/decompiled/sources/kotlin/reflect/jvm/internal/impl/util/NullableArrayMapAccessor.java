package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements kotlin.properties.ReadOnlyProperty<kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner<K, V>, V> {
    public NullableArrayMapAccessor(int i) {
        super(i);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final /* bridge */ /* synthetic */ java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
        return getValue((kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner) obj, (kotlin.reflect.KProperty<?>) kProperty);
    }

    public final T getValue(kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner<K, V> abstractArrayMapOwner, kotlin.reflect.KProperty<?> kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractArrayMapOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return extractValue(abstractArrayMapOwner);
    }
}
