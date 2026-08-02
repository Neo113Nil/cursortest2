package X0;

import gd.InterfaceC6712a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class b<K, V> implements Map.Entry<K, V>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private final K f33910a;

    /* renamed from: b, reason: collision with root package name */
    private final V f33911b;

    public b(K k11, V v11) {
        this.f33910a = k11;
        this.f33911b = v11;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.d(entry.getKey(), this.f33910a) && Intrinsics.d(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f33910a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f33911b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k11 = this.f33910a;
        int hashCode = k11 != null ? k11.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33910a);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
