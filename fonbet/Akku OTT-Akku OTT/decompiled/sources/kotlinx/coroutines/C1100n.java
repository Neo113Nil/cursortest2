package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC1094k;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.internal.C1089f;
import kotlinx.coroutines.internal.C1090g;

@PublishedApi
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,701:1\n227#1,10:705\n227#1,10:716\n1#2:702\n20#3:703\n20#3:704\n18#3:715\n17#3:726\n18#3,3:727\n17#3:730\n18#3,3:731\n18#3:738\n17#3,4:739\n57#4,2:734\n57#4,2:736\n57#4,2:743\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n239#1:705,10\n244#1:716,10\n69#1:703\n155#1:704\n242#1:715\n271#1:726\n272#1:727,3\n281#1:730\n282#1:731,3\n387#1:738\n390#1:739,4\n323#1:734,2\n333#1:736,2\n614#1:743,2\n*E\n"})
/* renamed from: kotlinx.coroutines.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1100n<T> extends Z<T> implements InterfaceC1096l<T>, CoroutineStackFrame, b1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C1100n.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C1100n.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C1100n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation<T> d;
    public final CoroutineContext e;

    public C1100n(int i2, Continuation continuation) {
        super(i2);
        this.d = continuation;
        this.e = continuation.get$context();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1046b.a;
    }

    public static Object B(L0 l0, Object obj, int i2, Function3 function3) {
        if (obj instanceof A) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (function3 != null || (l0 instanceof InterfaceC1094k)) {
            return new C1123z(obj, l0 instanceof InterfaceC1094k ? (InterfaceC1094k) l0 : null, function3, (Throwable) null, 16);
        }
        return obj;
    }

    public static void w(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(I i2, Unit unit) {
        Continuation<T> continuation = this.d;
        C1089f c1089f = continuation instanceof C1089f ? (C1089f) continuation : null;
        z(unit, (c1089f != null ? c1089f.d : null) == i2 ? 4 : this.c, null);
    }

    public final kotlinx.coroutines.internal.x C(Object obj, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof L0)) {
                return null;
            }
            Object B = B((L0) obj2, obj, this.c, function3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            boolean v = v();
            kotlinx.coroutines.internal.x xVar = C1102o.a;
            if (!v) {
                n();
            }
            return xVar;
        }
    }

    @Override // kotlinx.coroutines.b1
    public final void a(kotlinx.coroutines.internal.u<?> uVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        u(uVar);
    }

    @Override // kotlinx.coroutines.InterfaceC1096l
    public final kotlinx.coroutines.internal.x b(Object obj, Function3 function3) {
        return C(obj, function3);
    }

    @Override // kotlinx.coroutines.Z
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof L0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof A) {
                return;
            }
            if (!(obj instanceof C1123z)) {
                cancellationException2 = cancellationException;
                C1123z c1123z = new C1123z(obj, (InterfaceC1094k) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1123z)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1123z c1123z2 = (C1123z) obj;
            if (c1123z2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C1123z a = C1123z.a(c1123z2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC1094k interfaceC1094k = c1123z2.b;
            if (interfaceC1094k != null) {
                j(interfaceC1094k, cancellationException);
            }
            Function3<Throwable, R, CoroutineContext, Unit> function3 = c1123z2.c;
            if (function3 != 0) {
                l(function3, cancellationException, c1123z2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC1096l
    public final boolean cancel(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof L0)) {
                return false;
            }
            C1106q c1106q = new C1106q(this, th, (obj instanceof InterfaceC1094k) || (obj instanceof kotlinx.coroutines.internal.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1106q)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            L0 l0 = (L0) obj;
            if (l0 instanceof InterfaceC1094k) {
                j((InterfaceC1094k) obj, th);
            } else if (l0 instanceof kotlinx.coroutines.internal.u) {
                m((kotlinx.coroutines.internal.u) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.c);
            return true;
        }
    }

    @Override // kotlinx.coroutines.Z
    public final Continuation<T> d() {
        return this.d;
    }

    @Override // kotlinx.coroutines.Z
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC1096l
    public final <R extends T> void f(R r, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        z(r, this.c, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.Z
    public final <T> T g(Object obj) {
        return obj instanceof C1123z ? (T) ((C1123z) obj).a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.e;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.Z
    public final Object i() {
        return i.get(this);
    }

    @Override // kotlinx.coroutines.InterfaceC1096l
    public final boolean isActive() {
        return i.get(this) instanceof L0;
    }

    public final void j(InterfaceC1094k interfaceC1094k, Throwable th) {
        try {
            interfaceC1094k.b(th);
        } catch (Throwable th2) {
            J.a(this.e, new B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.InterfaceC1096l
    public final void k(Object obj) {
        o(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void l(Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Throwable th, R r) {
        CoroutineContext coroutineContext = this.e;
        try {
            function3.invoke(th, r, coroutineContext);
        } catch (Throwable th2) {
            J.a(coroutineContext, new B("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(kotlinx.coroutines.internal.u<?> uVar, Throwable th) {
        CoroutineContext coroutineContext = this.e;
        int i2 = f.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.h(i2, coroutineContext);
        } catch (Throwable th2) {
            J.a(coroutineContext, new B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        InterfaceC1053e0 interfaceC1053e0 = (InterfaceC1053e0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1053e0 == null) {
            return;
        }
        interfaceC1053e0.dispose();
        atomicReferenceFieldUpdater.set(this, K0.a);
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i2 == 4;
                Continuation<T> continuation = this.d;
                if (!z && (continuation instanceof C1089f)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.c;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        C1089f c1089f = (C1089f) continuation;
                        I i6 = c1089f.d;
                        CoroutineContext coroutineContext = c1089f.e.get$context();
                        if (i6.isDispatchNeeded(coroutineContext)) {
                            i6.dispatch(coroutineContext, this);
                            return;
                        }
                        AbstractC1083i0 a = U0.a();
                        if (a.a >= 4294967296L) {
                            a.X(this);
                            return;
                        }
                        a.Y(true);
                        try {
                            C1045a0.a(this, continuation, true);
                            do {
                            } while (a.a0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                C1045a0.a(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable p(C0 c0) {
        return c0.getCancellationException();
    }

    @PublishedApi
    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        InterfaceC1120x0 interfaceC1120x0;
        boolean v = v();
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v) {
                    y();
                }
                Object obj = i.get(this);
                if (obj instanceof A) {
                    throw ((A) obj).a;
                }
                int i4 = this.c;
                if ((i4 != 1 && i4 != 2) || (interfaceC1120x0 = (InterfaceC1120x0) this.e.get(InterfaceC1120x0.a.a)) == null || interfaceC1120x0.isActive()) {
                    return g(obj);
                }
                CancellationException cancellationException = interfaceC1120x0.getCancellationException();
                c(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((InterfaceC1053e0) j.get(this)) == null) {
            s();
        }
        if (v) {
            y();
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final void r() {
        InterfaceC1053e0 s = s();
        if (s == null || (i.get(this) instanceof L0)) {
            return;
        }
        s.dispose();
        j.set(this, K0.a);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(obj);
        if (m1719exceptionOrNullimpl != null) {
            obj = new A(m1719exceptionOrNullimpl, false);
        }
        z(obj, this.c, null);
    }

    public final InterfaceC1053e0 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) this.e.get(InterfaceC1120x0.a.a);
        if (interfaceC1120x0 == null) {
            return null;
        }
        InterfaceC1053e0 f2 = com.google.common.base.r.f(interfaceC1120x0, true, new r(this));
        do {
            atomicReferenceFieldUpdater = j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, f2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return f2;
    }

    public final void t(Function1<? super Throwable, Unit> function1) {
        u(new InterfaceC1094k.a(function1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(O.b(this.d));
        sb.append("){");
        Object obj = i.get(this);
        sb.append(obj instanceof L0 ? "Active" : obj instanceof C1106q ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(O.a(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(L0 l0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1046b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC1094k) || (obj instanceof kotlinx.coroutines.internal.u)) {
                break;
            }
            if (obj instanceof A) {
                A a = (A) obj;
                a.getClass();
                if (!A.b.compareAndSet(a, 0, 1)) {
                    w(l0, obj);
                    throw null;
                }
                if (obj instanceof C1106q) {
                    if (obj == null) {
                        a = null;
                    }
                    Throwable th = a != null ? a.a : null;
                    if (l0 instanceof InterfaceC1094k) {
                        j((InterfaceC1094k) l0, th);
                        return;
                    } else {
                        Intrinsics.checkNotNull(l0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((kotlinx.coroutines.internal.u) l0, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C1123z)) {
                if (l0 instanceof kotlinx.coroutines.internal.u) {
                    return;
                }
                Intrinsics.checkNotNull(l0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C1123z c1123z = new C1123z(obj, (InterfaceC1094k) l0, (Function3) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1123z)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1123z c1123z2 = (C1123z) obj;
            if (c1123z2.b != null) {
                w(l0, obj);
                throw null;
            }
            if (l0 instanceof kotlinx.coroutines.internal.u) {
                return;
            }
            Intrinsics.checkNotNull(l0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC1094k interfaceC1094k = (InterfaceC1094k) l0;
            Throwable th2 = c1123z2.e;
            if (th2 != null) {
                j(interfaceC1094k, th2);
                return;
            }
            C1123z a2 = C1123z.a(c1123z2, interfaceC1094k, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.c != 2) {
            return false;
        }
        Continuation<T> continuation = this.d;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        C1089f c1089f = (C1089f) continuation;
        c1089f.getClass();
        return C1089f.j.get(c1089f) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        Continuation<T> continuation = this.d;
        Throwable th = null;
        C1089f c1089f = continuation instanceof C1089f ? (C1089f) continuation : null;
        if (c1089f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1089f.j;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c1089f);
                kotlinx.coroutines.internal.x xVar = C1090g.b;
                if (obj == xVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1089f, xVar, this)) {
                        if (atomicReferenceFieldUpdater.get(c1089f) != xVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1089f, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c1089f) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            cancel(th);
        }
    }

    public final <R> void z(R r, int i2, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof L0) {
                Object B = B((L0) obj, r, i2, function3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, B)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                o(i2);
                return;
            }
            if (obj instanceof C1106q) {
                C1106q c1106q = (C1106q) obj;
                c1106q.getClass();
                if (C1106q.c.compareAndSet(c1106q, 0, 1)) {
                    if (function3 != null) {
                        l(function3, c1106q.a, r);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + r).toString());
        }
    }
}
