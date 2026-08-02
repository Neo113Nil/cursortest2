package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n351#2,9:122\n360#2,2:133\n13346#3,2:131\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n63#1:122,9\n63#1:133,2\n75#1:131,2\n*E\n"})
/* renamed from: kotlinx.coroutines.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1048c<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C1048c.class, "notCompletedCount$volatile");
    public final S<T>[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n11102#2:122\n11437#2,3:123\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n115#1:122\n115#1:123,3\n*E\n"})
    /* renamed from: kotlinx.coroutines.c$a */
    public final class a extends B0 {
        public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        public final C1100n e;
        public InterfaceC1053e0 f;

        public a(C1100n c1100n) {
            this.e = c1100n;
        }

        @Override // kotlinx.coroutines.B0
        public final boolean i() {
            return false;
        }

        @Override // kotlinx.coroutines.B0
        public final void j(Throwable th) {
            C1100n c1100n = this.e;
            if (th != null) {
                c1100n.getClass();
                kotlinx.coroutines.internal.x C = c1100n.C(new A(th, false), null);
                if (C != null) {
                    c1100n.k(C);
                    b bVar = (b) j.get(this);
                    if (bVar != null) {
                        bVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1048c.b;
            C1048c<T> c1048c = C1048c.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(c1048c) == 0) {
                S<T>[] sArr = c1048c.a;
                ArrayList arrayList = new ArrayList(sArr.length);
                for (S<T> s : sArr) {
                    arrayList.add(s.getCompleted());
                }
                c1100n.resumeWith(Result.m1716constructorimpl(arrayList));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n13346#2,2:122\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n88#1:122,2\n*E\n"})
    /* renamed from: kotlinx.coroutines.c$b */
    public final class b implements InterfaceC1094k {
        public final C1048c<T>.a[] a;

        public b(a[] aVarArr) {
            this.a = aVarArr;
        }

        public final void a() {
            for (C1048c<T>.a aVar : this.a) {
                InterfaceC1053e0 interfaceC1053e0 = aVar.f;
                if (interfaceC1053e0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handle");
                    interfaceC1053e0 = null;
                }
                interfaceC1053e0.dispose();
            }
        }

        @Override // kotlinx.coroutines.InterfaceC1094k
        public final void b(Throwable th) {
            a();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1048c(S<? extends T>[] sArr) {
        this.a = sArr;
        this.notCompletedCount$volatile = sArr.length;
    }

    public final Object a(SuspendLambda suspendLambda) {
        C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(suspendLambda));
        c1100n.r();
        S<T>[] sArr = this.a;
        int length = sArr.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            S<T> s = sArr[i];
            s.start();
            a aVar = new a(c1100n);
            aVar.f = com.google.common.base.r.f(s, true, aVar);
            Unit unit = Unit.INSTANCE;
            aVarArr[i] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            a aVar2 = aVarArr[i2];
            aVar2.getClass();
            a.j.set(aVar2, bVar);
        }
        if (C1100n.i.get(c1100n) instanceof L0) {
            c1100n.u(bVar);
        } else {
            bVar.a();
        }
        Object q = c1100n.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return q;
    }
}
