package c1;

import S0.v1;
import V0.d;
import gd.InterfaceC6715d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class w<K, V> implements InterfaceC5704H, Map<K, V>, InterfaceC6715d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private a f56278a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Map.Entry<K, V>> f56279b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<K> f56280c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Collection<V> f56281d;

    public static final class a<K, V> extends AbstractC5706J {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private V0.d<K, ? extends V> f56282c;

        /* renamed from: d, reason: collision with root package name */
        private int f56283d;

        public a(@NotNull V0.d<K, ? extends V> dVar) {
            this.f56282c = dVar;
        }

        @Override // c1.AbstractC5706J
        public final void a(@NotNull AbstractC5706J abstractC5706J) {
            Object obj;
            Intrinsics.g(abstractC5706J, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) abstractC5706J;
            obj = x.f56284a;
            synchronized (obj) {
                this.f56282c = aVar.f56282c;
                this.f56283d = aVar.f56283d;
                Unit unit = Unit.f71690a;
            }
        }

        @Override // c1.AbstractC5706J
        @NotNull
        public final AbstractC5706J b() {
            return new a(this.f56282c);
        }

        @NotNull
        public final V0.d<K, V> g() {
            return this.f56282c;
        }

        public final int h() {
            return this.f56283d;
        }

        public final void i(@NotNull V0.d<K, ? extends V> dVar) {
            this.f56282c = dVar;
        }

        public final void j(int i11) {
            this.f56283d = i11;
        }
    }

    public w() {
        v1 v1Var;
        X0.d dVar = X0.d.f33914f;
        Intrinsics.g(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        a aVar = new a(dVar);
        v1Var = C5721l.f56251b;
        if (v1Var.a() != null) {
            a aVar2 = new a(dVar);
            aVar2.f(1);
            aVar.e(aVar2);
        }
        this.f56278a = aVar;
        this.f56279b = new p(this);
        this.f56280c = new q(this);
        this.f56281d = new s(this);
    }

    @Override // c1.InterfaceC5704H
    public final void b(@NotNull AbstractC5706J abstractC5706J) {
        this.f56278a = (a) abstractC5706J;
    }

    @NotNull
    public final a<K, V> c() {
        a aVar = this.f56278a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) C5721l.M(aVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC5715f C11;
        Object obj;
        a aVar = this.f56278a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar2 = (a) C5721l.A(aVar);
        X0.d dVar = X0.d.f33914f;
        Intrinsics.g(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        if (dVar != aVar2.g()) {
            a aVar3 = this.f56278a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj = x.f56284a;
                synchronized (obj) {
                    aVar4.i(dVar);
                    aVar4.j(aVar4.h() + 1);
                }
            }
            C5721l.H(C11, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().g().containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().g().containsValue(obj);
    }

    public final boolean e(V v11) {
        Map.Entry<K, V> entry;
        Iterator<Map.Entry<K, V>> it = ((p) this.f56279b).iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = it.next();
            if (Intrinsics.d(entry.getValue(), v11)) {
                break;
            }
        }
        Map.Entry<K, V> entry2 = entry;
        if (entry2 == null) {
            return false;
        }
        remove(entry2.getKey());
        return true;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f56279b;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return c().g().get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().g().isEmpty();
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J k() {
        return this.f56278a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f56280c;
    }

    @Override // java.util.Map
    public final V put(K k11, V v11) {
        Object obj;
        V0.d<K, V> g10;
        int h11;
        V v12;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        do {
            obj = x.f56284a;
            synchronized (obj) {
                a aVar = this.f56278a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) C5721l.A(aVar);
                g10 = aVar2.g();
                h11 = aVar2.h();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            X0.f fVar = (X0.f) g10.d();
            v12 = (V) fVar.put(k11, v11);
            V0.d<K, V> build = fVar.build();
            if (Intrinsics.d(build, g10)) {
                break;
            }
            a aVar3 = this.f56278a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = x.f56284a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        z11 = true;
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return v12;
    }

    @Override // java.util.Map
    public final void putAll(@NotNull Map<? extends K, ? extends V> map) {
        Object obj;
        V0.d<K, V> g10;
        int h11;
        AbstractC5715f C11;
        Object obj2;
        boolean z11;
        do {
            obj = x.f56284a;
            synchronized (obj) {
                a aVar = this.f56278a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) C5721l.A(aVar);
                g10 = aVar2.g();
                h11 = aVar2.h();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            X0.f fVar = (X0.f) g10.d();
            fVar.putAll(map);
            V0.d<K, V> build = fVar.build();
            if (Intrinsics.d(build, g10)) {
                return;
            }
            a aVar3 = this.f56278a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj2 = x.f56284a;
                synchronized (obj2) {
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        z11 = true;
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        Object obj2;
        V0.d<K, V> g10;
        int h11;
        V remove;
        AbstractC5715f C11;
        Object obj3;
        boolean z11;
        do {
            obj2 = x.f56284a;
            synchronized (obj2) {
                a aVar = this.f56278a;
                Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) C5721l.A(aVar);
                g10 = aVar2.g();
                h11 = aVar2.h();
                Unit unit = Unit.f71690a;
            }
            Intrinsics.f(g10);
            d.a<K, V> d11 = g10.d();
            remove = d11.remove(obj);
            V0.d<K, V> build = d11.build();
            if (Intrinsics.d(build, g10)) {
                break;
            }
            a aVar3 = this.f56278a;
            Intrinsics.g(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                a aVar4 = (a) C5721l.Q(aVar3, this, C11);
                obj3 = x.f56284a;
                synchronized (obj3) {
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        z11 = true;
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            C5721l.H(C11, this);
        } while (!z11);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return c().g().size();
    }

    @NotNull
    public final String toString() {
        a aVar = this.f56278a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) C5721l.A(aVar)).g() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f56281d;
    }
}
