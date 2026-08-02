package X0;

import X0.t;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC7697d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class d<K, V> extends AbstractC7697d<K, V> implements V0.d<K, V> {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final d f33914f;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final t<K, V> f33915d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33916e;

    static {
        t tVar;
        tVar = t.f33937e;
        f33914f = new d(tVar, 0);
    }

    public d(@NotNull t<K, V> tVar, int i11) {
        this.f33915d = tVar;
        this.f33916e = i11;
    }

    @Override // kotlin.collections.AbstractC7697d
    @NotNull
    public final Set<Map.Entry<K, V>> c() {
        return new n(this);
    }

    @Override // kotlin.collections.AbstractC7697d, java.util.Map
    public boolean containsKey(K k11) {
        return this.f33915d.e(k11 != null ? k11.hashCode() : 0, 0, k11);
    }

    @Override // kotlin.collections.AbstractC7697d
    public final Set e() {
        return new p(this);
    }

    @Override // kotlin.collections.AbstractC7697d, java.util.Map
    public V get(K k11) {
        return (V) this.f33915d.i(k11 != null ? k11.hashCode() : 0, 0, k11);
    }

    @Override // kotlin.collections.AbstractC7697d
    public final int h() {
        return this.f33916e;
    }

    @Override // kotlin.collections.AbstractC7697d
    public final Collection i() {
        return new r(this);
    }

    @Override // V0.d
    @NotNull
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public f<K, V> d() {
        return new f<>(this);
    }

    @NotNull
    public final t<K, V> n() {
        return this.f33915d;
    }

    @NotNull
    public final d o(Object obj, Y0.a aVar) {
        t.a x11 = this.f33915d.x(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return x11 == null ? this : new d(x11.a(), x11.b() + this.f33916e);
    }

    @NotNull
    public final d<K, V> p(K k11) {
        int hashCode = k11 != null ? k11.hashCode() : 0;
        t<K, V> tVar = this.f33915d;
        t<K, V> y11 = tVar.y(hashCode, 0, k11);
        if (tVar == y11) {
            return this;
        }
        if (y11 != null) {
            return new d<>(y11, this.f33916e - 1);
        }
        d<K, V> dVar = f33914f;
        Intrinsics.g(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        return dVar;
    }
}
