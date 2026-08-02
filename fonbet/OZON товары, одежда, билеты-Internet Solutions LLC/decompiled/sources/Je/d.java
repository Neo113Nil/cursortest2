package Je;

import De.C2857A;
import De.x;
import fd.InterfaceC6511n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.C10741p;
import xe.InterfaceC10733l;
import xe.Q;
import xe.j1;

/* loaded from: classes.dex */
public final class d extends h implements InterfaceC3394a {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14630h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    private final class a implements InterfaceC10733l<Unit>, j1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final C10737n<Unit> f14631a;

        public a(@NotNull C10737n c10737n) {
            this.f14631a = c10737n;
        }

        @Override // xe.InterfaceC10733l
        public final boolean A(Throwable th2) {
            return this.f14631a.A(th2);
        }

        @Override // xe.InterfaceC10733l
        public final C2857A D(Object obj, InterfaceC6511n interfaceC6511n) {
            final d dVar = d.this;
            InterfaceC6511n interfaceC6511n2 = new InterfaceC6511n() { // from class: Je.b
                @Override // fd.InterfaceC6511n
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f14630h;
                    this.getClass();
                    d dVar2 = d.this;
                    atomicReferenceFieldUpdater.set(dVar2, null);
                    dVar2.c(null);
                    return Unit.f71690a;
                }
            };
            C2857A D11 = this.f14631a.D((Unit) obj, interfaceC6511n2);
            if (D11 != null) {
                d.f14630h.set(dVar, null);
            }
            return D11;
        }

        @Override // xe.InterfaceC10733l
        public final void E(@NotNull Object obj) {
            this.f14631a.E(obj);
        }

        @Override // xe.InterfaceC10733l
        public final void G(Object obj, InterfaceC6511n interfaceC6511n) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f14630h;
            final d dVar = d.this;
            atomicReferenceFieldUpdater.set(dVar, null);
            Function1<? super Throwable, Unit> function1 = new Function1() { // from class: Je.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    this.getClass();
                    d.this.c(null);
                    return Unit.f71690a;
                }
            };
            this.f14631a.u((Unit) obj, function1);
        }

        @Override // xe.j1
        public final void a(@NotNull x<?> xVar, int i11) {
            this.f14631a.a(xVar, i11);
        }

        @Override // kotlin.coroutines.d
        @NotNull
        public final CoroutineContext getContext() {
            return this.f14631a.getContext();
        }

        @Override // xe.InterfaceC10733l
        public final boolean isActive() {
            return this.f14631a.isActive();
        }

        @Override // kotlin.coroutines.d
        public final void resumeWith(@NotNull Object obj) {
            this.f14631a.resumeWith(obj);
        }

        @Override // xe.InterfaceC10733l
        public final void u(Unit unit, Function1 function1) {
            this.f14631a.u(unit, function1);
        }
    }

    public d(boolean z11) {
        super(1, z11 ? 1 : 0);
        this.owner$volatile = z11 ? null : e.f14633a;
    }

    @Override // Je.InterfaceC3394a
    public final Object a(@NotNull kotlin.coroutines.d frame) {
        if (tryLock()) {
            return Unit.f71690a;
        }
        C10737n b11 = C10741p.b(Wc.b.b(frame));
        try {
            e(new a(b11));
            Object n11 = b11.n();
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (n11 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (n11 != aVar) {
                n11 = Unit.f71690a;
            }
            return n11 == aVar ? n11 : Unit.f71690a;
        } catch (Throwable th2) {
            b11.z();
            throw th2;
        }
    }

    @Override // Je.InterfaceC3394a
    public final boolean b() {
        return g() == 0;
    }

    @Override // Je.InterfaceC3394a
    public final void c(Object obj) {
        C2857A c2857a;
        C2857A c2857a2;
        while (b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14630h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            c2857a = e.f14633a;
            if (obj2 != c2857a) {
                if (obj2 == obj || obj == null) {
                    c2857a2 = e.f14633a;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2857a2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    release();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @NotNull
    public final String toString() {
        return "Mutex@" + Q.a(this) + "[isLocked=" + b() + ",owner=" + f14630h.get(this) + ']';
    }

    @Override // Je.InterfaceC3394a
    public final boolean tryLock() {
        char c11;
        if (h()) {
            f14630h.set(this, null);
            c11 = 0;
        } else {
            c11 = 1;
        }
        if (c11 == 0) {
            return true;
        }
        if (c11 == 1) {
            return false;
        }
        if (c11 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }
}
