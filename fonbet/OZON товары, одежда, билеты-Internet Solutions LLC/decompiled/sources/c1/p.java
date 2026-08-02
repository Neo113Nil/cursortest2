package c1;

import V0.d;
import c1.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class p<K, V> extends r<K, V, Map.Entry<K, V>> {
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
        if (!U.i(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.d(b().get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C5700D(b(), ((V0.b) b().c().g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return U.i(obj) && b().remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (b().remove(((Map.Entry) it.next()).getKey()) != null || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
        Object obj;
        V0.d<K, V> g10;
        int h11;
        boolean z11;
        AbstractC5715f C11;
        Object obj2;
        Collection<? extends Object> collection2 = collection;
        int h12 = kotlin.collections.U.h(C7714v.z(collection2, 10));
        if (h12 < 16) {
            h12 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h12);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.e(), pair.f());
        }
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
            Object it2 = ((p) b11.entrySet()).iterator();
            while (true) {
                z11 = true;
                if (!((AbstractC5701E) it2).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((C5700D) it2).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.d(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    d11.remove(entry2.getKey());
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
