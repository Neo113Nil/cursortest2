package De;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10714b0;
import xe.AbstractC10732k0;
import xe.C10737n;
import xe.C10760z;
import xe.Q;
import xe.Z0;

/* renamed from: De.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2866i<T> extends AbstractC10714b0<T> implements kotlin.coroutines.jvm.internal.d, kotlin.coroutines.d<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6622h = AtomicReferenceFieldUpdater.newUpdater(C2866i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final xe.I f6623d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.jvm.internal.c f6624e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6625f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final Object f6626g;

    public C2866i(@NotNull xe.I i11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        super(-1);
        C2857A c2857a;
        this.f6623d = i11;
        this.f6624e = cVar;
        c2857a = C2867j.f6627a;
        this.f6625f = c2857a;
        this.f6626g = G.b(cVar.getContext());
    }

    @Override // xe.AbstractC10714b0
    @NotNull
    public final kotlin.coroutines.d<T> c() {
        return this;
    }

    @Override // xe.AbstractC10714b0
    public final Object g() {
        C2857A c2857a;
        Object obj = this.f6625f;
        c2857a = C2867j.f6627a;
        this.f6625f = c2857a;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final kotlin.coroutines.jvm.internal.d getCallerFrame() {
        kotlin.coroutines.jvm.internal.c cVar = this.f6624e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        return this.f6624e.getContext();
    }

    public final C10737n<T> h() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6622h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2857A c2857a = C2867j.f6628b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, c2857a);
                return null;
            }
            if (obj instanceof C10737n) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2857a)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return (C10737n) obj;
            }
            if (obj != c2857a && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean i() {
        return f6622h.get(this) != null;
    }

    public final boolean j(@NotNull Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6622h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2857A c2857a = C2867j.f6628b;
            if (Intrinsics.d(obj, c2857a)) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2857a, th2)) {
                    if (atomicReferenceFieldUpdater.get(this) != c2857a) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return false;
        }
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f6622h;
        } while (atomicReferenceFieldUpdater.get(this) == C2867j.f6628b);
        Object obj = atomicReferenceFieldUpdater.get(this);
        C10737n c10737n = obj instanceof C10737n ? (C10737n) obj : null;
        if (c10737n != null) {
            c10737n.k();
        }
    }

    public final Throwable l(@NotNull C10737n c10737n) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6622h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2857A c2857a = C2867j.f6628b;
            if (obj == c2857a) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2857a, c10737n)) {
                    if (atomicReferenceFieldUpdater.get(this) != c2857a) {
                        break;
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        Throwable b11 = Sc.r.b(obj);
        Object c10760z = b11 == null ? obj : new C10760z(false, b11);
        kotlin.coroutines.jvm.internal.c cVar = this.f6624e;
        CoroutineContext context = cVar.getContext();
        xe.I i11 = this.f6623d;
        if (i11.t(context)) {
            this.f6625f = c10760z;
            this.f105427c = 0;
            i11.q(cVar.getContext(), this);
            return;
        }
        AbstractC10732k0 b12 = Z0.b();
        if (b12.H0()) {
            this.f6625f = c10760z;
            this.f105427c = 0;
            b12.z(this);
            return;
        }
        b12.E0(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object c11 = G.c(context2, this.f6626g);
            try {
                cVar.resumeWith(obj);
                Unit unit = Unit.f71690a;
                while (b12.M0()) {
                }
            } finally {
                G.a(context2, c11);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @NotNull
    public final String toString() {
        return "DispatchedContinuation[" + this.f6623d + ", " + Q.b(this.f6624e) + ']';
    }
}
