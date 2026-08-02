package Pe;

import Le.InterfaceC3583a;
import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class t extends g implements Map<String, g>, InterfaceC6712a {

    @NotNull
    public static final a Companion = new a(0);

    public static final class a {
        private a() {
        }

        @NotNull
        public final InterfaceC3583a<t> serializer() {
            return u.f22305a;
        }

        public /* synthetic */ a(int i11) {
            this();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ g compute(String str, BiFunction<? super String, ? super g, ? extends g> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ g computeIfAbsent(String str, Function<? super String, ? extends g> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ g computeIfPresent(String str, BiFunction<? super String, ? super g, ? extends g> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        throw null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g value = (g) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        throw null;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, g>> entrySet() {
        throw null;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.d(null, obj);
    }

    @Override // java.util.Map
    public final g get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        throw null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ g merge(String str, g gVar, BiFunction<? super g, ? super g, ? extends g> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ g put(String str, g gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends g> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ g putIfAbsent(String str, g gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final g remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ g replace(String str, g gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super g, ? extends g> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        throw null;
    }

    @NotNull
    public final String toString() {
        throw null;
    }

    @Override // java.util.Map
    public final Collection<g> values() {
        throw null;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, g gVar, g gVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
