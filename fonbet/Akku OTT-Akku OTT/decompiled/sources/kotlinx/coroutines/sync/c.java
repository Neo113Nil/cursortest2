package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.C1104p;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.O;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.x;

@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n369#2,12:315\n1#3:327\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n171#1:315,12\n*E\n"})
/* loaded from: classes5.dex */
public final class c extends h implements kotlinx.coroutines.sync.a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    public final class a implements InterfaceC1096l<Unit>, b1 {

        @JvmField
        public final C1100n<Unit> a;

        public a(C1100n c1100n) {
            this.a = c1100n;
        }

        @Override // kotlinx.coroutines.b1
        public final void a(u<?> uVar, int i) {
            this.a.a(uVar, i);
        }

        @Override // kotlinx.coroutines.InterfaceC1096l
        public final x b(Object obj, Function3 function3) {
            final c cVar = c.this;
            Function3 function32 = new Function3(this) { // from class: kotlinx.coroutines.sync.b
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.g;
                    c cVar2 = c.this;
                    atomicReferenceFieldUpdater.set(cVar2, null);
                    cVar2.c(null);
                    return Unit.INSTANCE;
                }
            };
            x C = this.a.C((Unit) obj, function32);
            if (C != null) {
                c.g.set(cVar, null);
            }
            return C;
        }

        @Override // kotlinx.coroutines.InterfaceC1096l
        public final boolean cancel(Throwable th) {
            return this.a.cancel(th);
        }

        @Override // kotlinx.coroutines.InterfaceC1096l
        public final void f(Object obj, Function3 function3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.g;
            c cVar = c.this;
            atomicReferenceFieldUpdater.set(cVar, null);
            final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a aVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a(cVar, this);
            C1100n<Unit> c1100n = this.a;
            c1100n.z((Unit) obj, c1100n.c, new Function3() { // from class: kotlinx.coroutines.m
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a.this.invoke((Throwable) obj2);
                    return Unit.INSTANCE;
                }
            });
        }

        @Override // kotlin.coroutines.Continuation
        public final CoroutineContext getContext() {
            return this.a.e;
        }

        @Override // kotlinx.coroutines.InterfaceC1096l
        public final boolean isActive() {
            return this.a.isActive();
        }

        @Override // kotlinx.coroutines.InterfaceC1096l
        public final void k(Object obj) {
            this.a.k(obj);
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            this.a.resumeWith(obj);
        }
    }

    public c(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : d.a;
    }

    @Override // kotlinx.coroutines.sync.a
    public final boolean a(Object obj) {
        int i;
        char c;
        char c2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                if (i2 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (!b()) {
                                c2 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != d.a) {
                                c2 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c2 == 1) {
                            c = 2;
                            break;
                        }
                        if (c2 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c = 0;
                    break;
                }
            }
        }
        c = 1;
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.a
    public final boolean b() {
        return Math.max(h.f.get(this), 0) == 0;
    }

    @Override // kotlinx.coroutines.sync.a
    public final void c(Object obj) {
        while (b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            x xVar = d.a;
            if (obj2 != xVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, xVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    f();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // kotlinx.coroutines.sync.a
    public final Object d(ContinuationImpl continuationImpl) {
        if (a(null)) {
            return Unit.INSTANCE;
        }
        C1100n a2 = C1104p.a(IntrinsicsKt.intercepted(continuationImpl));
        try {
            e(new a(a2));
            Object q = a2.q();
            if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuationImpl);
            }
            if (q != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                q = Unit.INSTANCE;
            }
            return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
        } catch (Throwable th) {
            a2.y();
            throw th;
        }
    }

    public final String toString() {
        return "Mutex@" + O.a(this) + "[isLocked=" + b() + ",owner=" + g.get(this) + ']';
    }
}
