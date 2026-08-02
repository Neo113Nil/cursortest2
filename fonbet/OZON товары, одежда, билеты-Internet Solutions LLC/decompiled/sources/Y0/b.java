package Y0;

import V0.e;
import X0.d;
import java.util.Iterator;
import kotlin.collections.AbstractC7702i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b<E> extends AbstractC7702i<E> implements e<E> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final b f34518e;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34519b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f34520c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final d<E, a> f34521d;

    static {
        Z0.b bVar = Z0.b.f35315a;
        d dVar = d.f33914f;
        Intrinsics.g(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        f34518e = new b(bVar, bVar, dVar);
    }

    public b(Object obj, Object obj2, @NotNull d<E, a> dVar) {
        this.f34519b = obj;
        this.f34520c = obj2;
        this.f34521d = dVar;
    }

    @Override // java.util.Collection, java.util.Set, V0.e
    @NotNull
    public final b add(Object obj) {
        d<E, a> dVar = this.f34521d;
        if (dVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, dVar.o(obj, new a()));
        }
        Object obj2 = this.f34520c;
        Object obj3 = dVar.get(obj2);
        Intrinsics.f(obj3);
        return new b(this.f34519b, obj, dVar.o(obj2, ((a) obj3).e(obj)).o(obj, new a(obj2, Z0.b.f35315a)));
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f34521d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f34521d.h();
    }

    @Override // kotlin.collections.AbstractC7702i, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<E> iterator() {
        return new c(this.f34521d, this.f34519b);
    }

    @Override // java.util.Collection, java.util.Set, V0.e
    @NotNull
    public final b remove(Object obj) {
        d<E, a> dVar = this.f34521d;
        a aVar = dVar.get(obj);
        if (aVar == null) {
            return this;
        }
        d<E, a> p11 = dVar.p(obj);
        if (aVar.b()) {
            a aVar2 = p11.get(aVar.d());
            Intrinsics.f(aVar2);
            p11 = p11.o(aVar.d(), aVar2.e(aVar.c()));
        }
        if (aVar.a()) {
            a aVar3 = p11.get(aVar.c());
            Intrinsics.f(aVar3);
            p11 = p11.o(aVar.c(), aVar3.f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f34519b, !aVar.a() ? aVar.d() : this.f34520c, p11);
    }
}
