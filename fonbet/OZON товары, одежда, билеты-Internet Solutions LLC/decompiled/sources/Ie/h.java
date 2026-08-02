package Ie;

import De.C2857A;
import De.x;
import Sc.InterfaceC4003e;
import Sc.s;
import U7.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10724g0;
import xe.InterfaceC10731k;
import xe.InterfaceC10733l;
import xe.j1;
import ze.C11115c;

/* loaded from: classes.dex */
public final class h<R> implements InterfaceC10731k, j, j1 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12289f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f12290a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f12291b;

    /* renamed from: c, reason: collision with root package name */
    private Object f12292c;

    /* renamed from: d, reason: collision with root package name */
    private int f12293d;

    /* renamed from: e, reason: collision with root package name */
    private Object f12294e;
    private volatile /* synthetic */ Object state$volatile;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Object f12295a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC6511n<Object, j<?>, Object, Unit> f12296b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC6511n<Object, Object, Object, Object> f12297c;

        /* renamed from: d, reason: collision with root package name */
        private final C2857A f12298d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final InterfaceC4003e f12299e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC6511n<j<?>, Object, Object, InterfaceC6511n<Throwable, Object, CoroutineContext, Unit>> f12300f;

        /* renamed from: g, reason: collision with root package name */
        public Object f12301g;

        /* renamed from: h, reason: collision with root package name */
        public int f12302h = -1;

        public a(@NotNull Object obj, @NotNull InterfaceC6511n interfaceC6511n, @NotNull InterfaceC6511n interfaceC6511n2, C2857A c2857a, @NotNull InterfaceC4003e interfaceC4003e, InterfaceC6511n interfaceC6511n3) {
            this.f12295a = obj;
            this.f12296b = interfaceC6511n;
            this.f12297c = interfaceC6511n2;
            this.f12298d = c2857a;
            this.f12299e = interfaceC4003e;
            this.f12300f = interfaceC6511n3;
        }

        public final InterfaceC6511n a(@NotNull h hVar, Object obj) {
            InterfaceC6511n<j<?>, Object, Object, InterfaceC6511n<Throwable, Object, CoroutineContext, Unit>> interfaceC6511n = this.f12300f;
            if (interfaceC6511n != null) {
                return interfaceC6511n.invoke(hVar, this.f12298d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f12301g;
            if (obj instanceof x) {
                ((x) obj).l(this.f12302h, h.this.l());
                return;
            }
            InterfaceC10724g0 interfaceC10724g0 = obj instanceof InterfaceC10724g0 ? (InterfaceC10724g0) obj : null;
            if (interfaceC10724g0 != null) {
                interfaceC10724g0.dispose();
            }
        }

        public final Object c(Object obj, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
            C2857A e11 = k.e();
            InterfaceC4003e interfaceC4003e = this.f12299e;
            return this.f12298d == e11 ? ((Function1) interfaceC4003e).invoke(cVar) : ((Function2) interfaceC4003e).invoke(obj, cVar);
        }

        public final Object d(Object obj) {
            return this.f12297c.invoke(this.f12295a, this.f12298d, obj);
        }

        public final boolean e(@NotNull h<R> hVar) {
            C2857A c2857a;
            this.f12296b.invoke(this.f12295a, hVar, this.f12298d);
            Object obj = ((h) hVar).f12294e;
            c2857a = k.f12312e;
            return obj == c2857a;
        }
    }

    public h(@NotNull CoroutineContext coroutineContext) {
        C2857A c2857a;
        C2857A c2857a2;
        this.f12290a = coroutineContext;
        c2857a = k.f12309b;
        this.state$volatile = c2857a;
        this.f12291b = new ArrayList(2);
        this.f12293d = -1;
        c2857a2 = k.f12312e;
        this.f12294e = c2857a2;
    }

    private final Object g(kotlin.coroutines.jvm.internal.c cVar) {
        C2857A c2857a;
        C2857A c2857a2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12289f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f12294e;
        ArrayList arrayList = this.f12291b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2 != aVar) {
                    aVar2.b();
                }
            }
            c2857a = k.f12310c;
            atomicReferenceFieldUpdater.set(this, c2857a);
            c2857a2 = k.f12312e;
            this.f12294e = c2857a2;
            this.f12291b = null;
        }
        return aVar.c(aVar.d(obj2), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(kotlin.coroutines.jvm.internal.c cVar) {
        i frame;
        int i11;
        C2857A c2857a;
        h<R> hVar;
        C2857A c2857a2;
        if (cVar instanceof i) {
            frame = (i) cVar;
            int i12 = frame.f12307g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f12307g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f12305e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f12307g;
                if (i11 != 0) {
                    s.b(obj);
                    frame.f12304d = this;
                    frame.f12307g = 1;
                    C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                    c10737n.o();
                    loop0: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12289f;
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        c2857a = k.f12309b;
                        if (obj2 == c2857a) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c10737n)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                            c10737n.s(this);
                            break loop0;
                        }
                        if (obj2 instanceof List) {
                            c2857a2 = k.f12309b;
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2857a2)) {
                                    Iterator it = ((Iterable) obj2).iterator();
                                    while (it.hasNext()) {
                                        h<R>.a k11 = k(it.next());
                                        Intrinsics.f(k11);
                                        k11.f12301g = null;
                                        k11.f12302h = -1;
                                        n(k11, true);
                                    }
                                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                        } else {
                            if (!(obj2 instanceof a)) {
                                throw new IllegalStateException(("unexpected state: " + obj2).toString());
                            }
                            c10737n.G(Unit.f71690a, ((a) obj2).a(this, this.f12294e));
                        }
                    }
                    Object n11 = c10737n.n();
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    if (n11 == aVar2) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (n11 != aVar2) {
                        n11 = Unit.f71690a;
                    }
                    if (n11 != aVar) {
                        hVar = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                hVar = frame.f12304d;
                s.b(obj);
                frame.f12304d = null;
                frame.f12307g = 2;
                Object g10 = hVar.g(frame);
                return g10 != aVar ? aVar : g10;
            }
        }
        frame = new i(this, cVar);
        Object obj3 = frame.f12305e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f12307g;
        if (i11 != 0) {
        }
        frame.f12304d = null;
        frame.f12307g = 2;
        Object g102 = hVar.g(frame);
        if (g102 != aVar3) {
        }
    }

    private final h<R>.a k(Object obj) {
        ArrayList arrayList = this.f12291b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f12295a == obj) {
                obj2 = next;
                break;
            }
        }
        h<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int p(Object obj, Object obj2) {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12289f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC10733l)) {
                c2857a2 = k.f12310c;
                if (Intrinsics.d(obj3, c2857a2) || (obj3 instanceof a)) {
                    return 3;
                }
                c2857a3 = k.f12311d;
                if (Intrinsics.d(obj3, c2857a3)) {
                    return 2;
                }
                c2857a4 = k.f12309b;
                if (Intrinsics.d(obj3, c2857a4)) {
                    List a02 = C7714v.a0(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, a02)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList q02 = C7714v.q0(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, q02)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            h<R>.a k11 = k(obj);
            if (k11 != null) {
                InterfaceC6511n a11 = k11.a(this, obj2);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, k11)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                InterfaceC10733l interfaceC10733l = (InterfaceC10733l) obj3;
                this.f12294e = obj2;
                int i11 = k.f12314g;
                C2857A D11 = interfaceC10733l.D(Unit.f71690a, a11);
                if (D11 != null) {
                    interfaceC10733l.E(D11);
                    return 0;
                }
                c2857a = k.f12312e;
                this.f12294e = c2857a;
                return 2;
            }
            continue;
        }
    }

    @Override // xe.j1
    public final void a(@NotNull x<?> xVar, int i11) {
        this.f12292c = xVar;
        this.f12293d = i11;
    }

    @Override // xe.InterfaceC10731k
    public final void b(Throwable th2) {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12289f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            c2857a = k.f12310c;
            if (obj == c2857a) {
                return;
            }
            c2857a2 = k.f12311d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2857a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f12291b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
            c2857a3 = k.f12312e;
            this.f12294e = c2857a3;
            this.f12291b = null;
            return;
        }
    }

    @Override // Ie.j
    public final void c(Object obj) {
        this.f12294e = obj;
    }

    @Override // Ie.j
    public final boolean d(@NotNull Object obj, Object obj2) {
        return p(obj, obj2) == 0;
    }

    public final void h(@NotNull InterfaceC10724g0 interfaceC10724g0) {
        this.f12292c = interfaceC10724g0;
    }

    public final Object i(@NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return f12289f.get(this) instanceof a ? g(jVar) : j(jVar);
    }

    @NotNull
    public final CoroutineContext l() {
        return this.f12290a;
    }

    public final <Q> void m(@NotNull f fVar, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        n(new a(fVar.d(), fVar.c(), fVar.b(), null, function2, fVar.a()), false);
    }

    public final void n(@NotNull h<R>.a aVar, boolean z11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12289f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z11) {
            ArrayList arrayList = this.f12291b;
            Intrinsics.f(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object obj = ((a) it.next()).f12295a;
                    Object obj2 = aVar.f12295a;
                    if (obj == obj2) {
                        throw new IllegalStateException(m.b(obj2, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        if (!aVar.e(this)) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z11) {
            ArrayList arrayList2 = this.f12291b;
            Intrinsics.f(arrayList2);
            arrayList2.add(aVar);
        }
        aVar.f12301g = this.f12292c;
        aVar.f12302h = this.f12293d;
        this.f12292c = null;
        this.f12293d = -1;
    }

    @NotNull
    public final l o(@NotNull C11115c c11115c, Unit unit) {
        int p11 = p(c11115c, unit);
        int i11 = k.f12314g;
        if (p11 == 0) {
            return l.SUCCESSFUL;
        }
        if (p11 == 1) {
            return l.REREGISTER;
        }
        if (p11 == 2) {
            return l.CANCELLED;
        }
        if (p11 == 3) {
            return l.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + p11).toString());
    }
}
