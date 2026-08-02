package X0;

import Bl0.k0;
import V0.d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC7700g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class f<K, V> extends AbstractC7700g<K, V> implements d.a<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private d<K, V> f33920a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private k0 f33921b = new k0();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private t<K, V> f33922c;

    /* renamed from: d, reason: collision with root package name */
    private V f33923d;

    /* renamed from: e, reason: collision with root package name */
    private int f33924e;

    /* renamed from: f, reason: collision with root package name */
    private int f33925f;

    public f(@NotNull d<K, V> dVar) {
        this.f33920a = dVar;
        this.f33922c = dVar.n();
        this.f33925f = this.f33920a.h();
    }

    @Override // kotlin.collections.AbstractC7700g
    @NotNull
    public final Set<Map.Entry<K, V>> b() {
        return new h(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        t<K, V> tVar;
        tVar = t.f33937e;
        this.f33922c = tVar;
        y(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k11) {
        return this.f33922c.e(k11 != null ? k11.hashCode() : 0, 0, k11);
    }

    @Override // kotlin.collections.AbstractC7700g
    @NotNull
    public final Set<K> e() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k11) {
        return (V) this.f33922c.i(k11 != null ? k11.hashCode() : 0, 0, k11);
    }

    @Override // kotlin.collections.AbstractC7700g
    public final int h() {
        return this.f33925f;
    }

    @Override // kotlin.collections.AbstractC7700g
    @NotNull
    public final Collection<V> i() {
        return new l(this);
    }

    @Override // V0.d.a
    @NotNull
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d<K, V> build() {
        d<K, V> dVar;
        if (this.f33922c == this.f33920a.n()) {
            dVar = this.f33920a;
        } else {
            this.f33921b = new k0();
            dVar = new d<>(this.f33922c, h());
        }
        this.f33920a = dVar;
        return dVar;
    }

    public final int m() {
        return this.f33924e;
    }

    @NotNull
    public final t<K, V> n() {
        return this.f33922c;
    }

    @NotNull
    public final k0 p() {
        return this.f33921b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        this.f33923d = null;
        this.f33922c = this.f33922c.o(k11 != null ? k11.hashCode() : 0, k11, v11, 0, this);
        return this.f33923d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(@NotNull Map<? extends K, ? extends V> map) {
        d<K, V> dVar = null;
        d<K, V> dVar2 = map instanceof d ? (d) map : null;
        if (dVar2 == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                dVar = fVar.build();
            }
        } else {
            dVar = dVar2;
        }
        if (dVar == null) {
            super.putAll(map);
            return;
        }
        Z0.a aVar = new Z0.a(0);
        int i11 = this.f33925f;
        t<K, V> tVar = this.f33922c;
        t<K, V> n11 = dVar.n();
        Intrinsics.g(n11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f33922c = tVar.p(n11, 0, aVar, this);
        int h11 = (dVar.h() + i11) - aVar.a();
        if (i11 != h11) {
            y(h11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int h11 = h();
        t<K, V> r11 = this.f33922c.r(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (r11 == null) {
            r11 = t.f33937e;
        }
        this.f33922c = r11;
        return h11 != h();
    }

    public final void s(int i11) {
        this.f33924e = i11;
    }

    public final void u(V v11) {
        this.f33923d = v11;
    }

    protected final void v(@NotNull k0 k0Var) {
        this.f33921b = k0Var;
    }

    public final void y(int i11) {
        this.f33925f = i11;
        this.f33924e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k11) {
        this.f33923d = null;
        t<K, V> q11 = this.f33922c.q(k11 != null ? k11.hashCode() : 0, k11, 0, this);
        if (q11 == null) {
            q11 = t.f33937e;
        }
        this.f33922c = q11;
        return this.f33923d;
    }
}
