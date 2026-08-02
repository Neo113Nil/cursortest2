package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C1089f;
import kotlinx.coroutines.internal.C1090g;

@SourceDebugExtension({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
/* renamed from: kotlinx.coroutines.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1104p {
    public static final <T> C1100n<T> a(Continuation<? super T> continuation) {
        C1100n<T> c1100n;
        C1100n<T> c1100n2;
        if (!(continuation instanceof C1089f)) {
            return new C1100n<>(1, continuation);
        }
        C1089f c1089f = (C1089f) continuation;
        c1089f.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1089f.j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c1089f);
            c1100n = null;
            kotlinx.coroutines.internal.x xVar = C1090g.b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c1089f, xVar);
                c1100n2 = null;
                break;
            }
            if (obj instanceof C1100n) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c1089f, obj, xVar)) {
                    if (atomicReferenceFieldUpdater.get(c1089f) != obj) {
                        break;
                    }
                }
                c1100n2 = (C1100n) obj;
                break loop0;
            }
            if (obj != xVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1100n2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1100n.i;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1100n2);
            if (!(obj2 instanceof C1123z) || ((C1123z) obj2).d == null) {
                C1100n.f.set(c1100n2, 536870911);
                atomicReferenceFieldUpdater2.set(c1100n2, C1046b.a);
                c1100n = c1100n2;
            } else {
                c1100n2.n();
            }
            if (c1100n != null) {
                return c1100n;
            }
        }
        return new C1100n<>(2, continuation);
    }
}
