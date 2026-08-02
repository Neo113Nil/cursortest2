package W2;

import W2.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f33201a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2.a f33202b;

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<Map.Entry<f.a<?>, Object>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f33203b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<f.a<?>, Object> entry) {
            Map.Entry<f.a<?>, Object> entry2 = entry;
            Intrinsics.checkNotNullParameter(entry2, "entry");
            Object value = entry2.getValue();
            return "  " + entry2.getKey().a() + " = " + (value instanceof byte[] ? C7705l.O((byte[]) value, ", ", null, 56) : String.valueOf(entry2.getValue()));
        }
    }

    public b() {
        this(false, 3);
    }

    @Override // W2.f
    @NotNull
    public final Map<f.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f33201a.entrySet();
        int h11 = U.h(C7714v.z(entrySet, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap map = new LinkedHashMap(h11);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.e(), pair.f());
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map<f.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    @Override // W2.f
    public final <T> boolean b(@NotNull f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f33201a.containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // W2.f
    public final <T> T c(@NotNull f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t2 = (T) this.f33201a.get(key);
        if (!(t2 instanceof byte[])) {
            return t2;
        }
        byte[] bArr = (byte[]) t2;
        T t11 = (T) Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(t11, "copyOf(this, size)");
        return t11;
    }

    public final void e() {
        if (this.f33202b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z11;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.f33201a;
            LinkedHashMap linkedHashMap2 = this.f33201a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.f33201a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z11 = Intrinsics.d(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z11 = true;
                                }
                                if (z11) {
                                }
                            }
                            z11 = false;
                            if (z11) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f() {
        e();
        this.f33201a.clear();
    }

    public final void g() {
        this.f33202b.b();
    }

    public final void h(@NotNull f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        this.f33201a.remove(key);
    }

    public final int hashCode() {
        Iterator it = this.f33201a.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i11 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i11;
    }

    public final <T> void i(@NotNull f.a<T> key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        j(key, t2);
    }

    public final void j(@NotNull f.a<?> key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        boolean z11 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f33201a;
        if (z11) {
            Set set = (Set) obj;
            Intrinsics.checkNotNullParameter(set, "set");
            Set unmodifiableSet = Collections.unmodifiableSet(C7714v.Y0(set));
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
            return;
        }
        if (!(obj instanceof byte[])) {
            linkedHashMap.put(key, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        linkedHashMap.put(key, copyOf);
    }

    @NotNull
    public final String toString() {
        return C7714v.V(this.f33201a.entrySet(), ",\n", "{\n", "\n}", a.f33203b, 24);
    }

    public /* synthetic */ b(boolean z11, int i11) {
        this(new LinkedHashMap(), (i11 & 2) != 0 ? true : z11);
    }

    public b(@NotNull LinkedHashMap preferencesMap, boolean z11) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f33201a = preferencesMap;
        this.f33202b = new W2.a(z11);
    }
}
