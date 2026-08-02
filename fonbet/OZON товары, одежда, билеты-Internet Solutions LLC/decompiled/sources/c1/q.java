package c1;

import V0.d;
import c1.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class q<K, V> extends r<K, V, K> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        x.b();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        x.b();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!b().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5702F(b(), ((V0.b) b().c().g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return b().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (b().remove(it.next()) != null || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
        Object obj;
        V0.d<K, V> g10;
        int h11;
        boolean z11;
        AbstractC5715f C11;
        Object obj2;
        Set Y02 = C7714v.Y0(collection);
        w<K, V> b11 = b();
        boolean z12 = false;
        do {
            obj = x.f56284a;
            synchronized (obj) {
                AbstractC5706J k11 = b11.k();
                Intrinsics.g(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w.a aVar = (w.a) C5721l.A((w.a) k11);
                g10 = aVar.g();
                h11 = aVar.h();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            d.a<K, V> d11 = g10.d();
            Object it = ((p) b11.entrySet()).iterator();
            while (true) {
                z11 = true;
                if (!((AbstractC5701E) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((C5700D) it).next();
                if (!Y02.contains(entry.getKey())) {
                    d11.remove(entry.getKey());
                    z12 = true;
                }
            }
            Unit unit2 = Unit.f71690a;
            V0.d<K, V> build = d11.build();
            if (Intrinsics.d(build, g10)) {
                break;
            }
            AbstractC5706J k12 = b11.k();
            Intrinsics.g(k12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            w.a aVar2 = (w.a) k12;
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                w.a aVar3 = (w.a) C5721l.Q(aVar2, b11, C11);
                obj2 = x.f56284a;
                synchronized (obj2) {
                    if (aVar3.h() == h11) {
                        aVar3.i(build);
                        aVar3.j(aVar3.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, b11);
        } while (!z11);
        return z12;
    }
}
