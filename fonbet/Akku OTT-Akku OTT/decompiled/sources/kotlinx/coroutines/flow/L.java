package kotlinx.coroutines.flow;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1055f0;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.InterfaceC1120x0;

@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n27#2:747\n27#2:750\n27#2:769\n27#2:773\n27#2:782\n27#2:793\n27#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n326#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13346#7:755\n13347#7:758\n13346#7:777\n13347#7:780\n13346#7:799\n13347#7:802\n351#8,9:760\n360#8,2:771\n351#8,9:784\n360#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
/* loaded from: classes5.dex */
public class L<T> extends kotlinx.coroutines.flow.internal.b<N> implements F<T>, InterfaceC1060e, kotlinx.coroutines.flow.internal.q<T> {
    public final int d;
    public final kotlinx.coroutines.channels.a e;
    public Object[] f;
    public long i;
    public long j;
    public int k;
    public int l;

    public static final class a implements InterfaceC1053e0 {

        @JvmField
        public final L<?> a;

        @JvmField
        public final long b;

        @JvmField
        public final Object c;

        @JvmField
        public final C1100n d;

        public a(L l, long j, Object obj, C1100n c1100n) {
            this.a = l;
            this.b = j;
            this.c = obj;
            this.d = c1100n;
        }

        @Override // kotlinx.coroutines.InterfaceC1053e0
        public final void dispose() {
            L<?> l = this.a;
            synchronized (l) {
                if (this.b < l.l()) {
                    return;
                }
                Object[] objArr = l.f;
                Intrinsics.checkNotNull(objArr);
                long j = this.b;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                M.a(objArr, j, M.a);
                l.h();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {387, 394, 397}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class b<T> extends ContinuationImpl {
        public L a;
        public InterfaceC1061f b;
        public N c;
        public InterfaceC1120x0 d;
        public /* synthetic */ Object e;
        public final /* synthetic */ L<T> f;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L<T> l, Continuation<? super b> continuation) {
            super(continuation);
            this.f = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.i |= Integer.MIN_VALUE;
            return L.i(this.f, null, this);
        }
    }

    public L(int i) {
        kotlinx.coroutines.channels.a aVar = kotlinx.coroutines.channels.a.b;
        this.d = i;
        this.e = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:46|47))(1:48)|12|13|14|15|(2:16|(3:38|39|(2:41|42)(2:43|37))(4:18|(3:23|24|25)|32|(1:34)(2:36|37))))(4:49|50|51|52)|30|31)(5:58|59|60|(1:62)|65)|53|54|15|(3:16|(0)(0)|37)))|68|6|(0)(0)|53|54|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x007b, code lost:
    
        if (((kotlinx.coroutines.flow.U) r9).a(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> Object i(L<T> l, InterfaceC1061f<? super T> interfaceC1061f, Continuation<?> continuation) {
        b bVar;
        int i;
        L<T> l2;
        Throwable th;
        N n;
        InterfaceC1061f<? super T> interfaceC1061f2;
        InterfaceC1120x0 interfaceC1120x0;
        InterfaceC1061f interfaceC1061f3;
        Object p;
        InterfaceC1120x0 interfaceC1120x02;
        InterfaceC1061f interfaceC1061f4;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.i = i2 - Integer.MIN_VALUE;
                Object obj = bVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.i;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC1120x02 = bVar.d;
                            n = bVar.c;
                            interfaceC1061f4 = bVar.b;
                            l2 = bVar.a;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1120x02 = bVar.d;
                            n = bVar.c;
                            interfaceC1061f4 = bVar.b;
                            l2 = bVar.a;
                        }
                        try {
                            ResultKt.throwOnFailure(obj);
                            interfaceC1061f3 = interfaceC1061f4;
                            interfaceC1120x0 = interfaceC1120x02;
                            l = l2;
                            while (true) {
                                p = l.p(n);
                                if (p == M.a) {
                                    bVar.a = l;
                                    bVar.b = interfaceC1061f3;
                                    bVar.c = n;
                                    bVar.d = interfaceC1120x0;
                                    bVar.i = 2;
                                    if (l.g(n, bVar) == coroutine_suspended) {
                                        break;
                                    }
                                } else {
                                    if (interfaceC1120x0 != null && !interfaceC1120x0.isActive()) {
                                        throw interfaceC1120x0.getCancellationException();
                                    }
                                    bVar.a = l;
                                    bVar.b = interfaceC1061f3;
                                    bVar.c = n;
                                    bVar.d = interfaceC1120x0;
                                    bVar.i = 3;
                                    if (interfaceC1061f3.emit(p, bVar) == coroutine_suspended) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        n = bVar.c;
                        InterfaceC1061f<? super T> interfaceC1061f5 = bVar.b;
                        L<T> l3 = bVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            interfaceC1061f2 = interfaceC1061f5;
                            l = l3;
                        } catch (Throwable th3) {
                            th = th3;
                            l2 = l3;
                        }
                    }
                    l2.f(n);
                    throw th;
                }
                ResultKt.throwOnFailure(obj);
                N b2 = l.b();
                try {
                    if (interfaceC1061f instanceof U) {
                        bVar.a = l;
                        bVar.b = interfaceC1061f;
                        bVar.c = b2;
                        bVar.i = 1;
                    }
                    interfaceC1061f2 = interfaceC1061f;
                    n = b2;
                } catch (Throwable th4) {
                    l2 = l;
                    th = th4;
                    n = b2;
                }
                interfaceC1120x0 = (InterfaceC1120x0) bVar.get$context().get(InterfaceC1120x0.a.a);
                interfaceC1061f3 = interfaceC1061f2;
                while (true) {
                    p = l.p(n);
                    if (p == M.a) {
                    }
                }
            }
        }
        bVar = new b(l, continuation);
        Object obj2 = bVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.i;
        if (i == 0) {
        }
        interfaceC1120x0 = (InterfaceC1120x0) bVar.get$context().get(InterfaceC1120x0.a.a);
        interfaceC1061f3 = interfaceC1061f2;
        while (true) {
            p = l.p(n);
            if (p == M.a) {
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public final InterfaceC1060e<T> a(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return M.b(this, coroutineContext, i, aVar);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    public final Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<?> continuation) {
        return i(this, interfaceC1061f, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final N d() {
        return new N();
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final kotlinx.coroutines.flow.internal.d[] e() {
        return new N[2];
    }

    @Override // kotlinx.coroutines.flow.F, kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        Throwable th;
        boolean z;
        Throwable th2;
        Continuation<Unit>[] k;
        a aVar;
        Continuation<Unit>[] continuationArr = kotlinx.coroutines.flow.internal.c.a;
        synchronized (this) {
            try {
                if (n(t)) {
                    try {
                        continuationArr = k(continuationArr);
                        z = true;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    z = false;
                }
                for (Continuation<Unit> continuation2 : continuationArr) {
                    if (continuation2 != null) {
                        Result.Companion companion = Result.INSTANCE;
                        continuation2.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
                    }
                }
                if (z) {
                    return Unit.INSTANCE;
                }
                C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(continuation));
                c1100n.r();
                Continuation<Unit>[] continuationArr2 = kotlinx.coroutines.flow.internal.c.a;
                synchronized (this) {
                    try {
                        if (n(t)) {
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                c1100n.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
                                k = k(continuationArr2);
                                aVar = null;
                            } catch (Throwable th4) {
                                th2 = th4;
                                throw th2;
                            }
                        } else {
                            try {
                                a aVar2 = new a(this, l() + this.k + this.l, t, c1100n);
                                j(aVar2);
                                this.l++;
                                if (this.d == 0) {
                                    continuationArr2 = k(continuationArr2);
                                }
                                k = continuationArr2;
                                aVar = aVar2;
                            } catch (Throwable th5) {
                                th = th5;
                                th2 = th;
                                throw th2;
                            }
                        }
                        if (aVar != null) {
                            c1100n.u(new C1055f0(aVar));
                        }
                        for (Continuation<Unit> continuation3 : k) {
                            if (continuation3 != null) {
                                Result.Companion companion3 = Result.INSTANCE;
                                continuation3.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
                            }
                        }
                        Object q = c1100n.q();
                        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(continuation);
                        }
                        if (q != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            q = Unit.INSTANCE;
                        }
                        return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final Object g(N n, b bVar) {
        C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(bVar));
        c1100n.r();
        synchronized (this) {
            try {
                if (o(n) < 0) {
                    n.b = c1100n;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    c1100n.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object q = c1100n.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(bVar);
        }
        return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
    }

    public final void h() {
        if (this.d != 0 || this.l > 1) {
            Object[] objArr = this.f;
            Intrinsics.checkNotNull(objArr);
            while (this.l > 0) {
                long l = l();
                int i = this.k;
                int i2 = this.l;
                if (objArr[((int) ((l + (i + i2)) - 1)) & (objArr.length - 1)] != M.a) {
                    return;
                }
                this.l = i2 - 1;
                M.a(objArr, l() + this.k + this.l, null);
            }
        }
    }

    public final void j(Object obj) {
        int i = this.k + this.l;
        Object[] objArr = this.f;
        if (objArr == null) {
            objArr = m(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = m(objArr, i, objArr.length * 2);
        }
        M.a(objArr, l() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final Continuation<Unit>[] k(Continuation<Unit>[] continuationArr) {
        Object[] objArr;
        N n;
        C1100n c1100n;
        int length = continuationArr.length;
        if (this.b != 0 && (objArr = this.a) != null) {
            int length2 = objArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (c1100n = (n = (N) obj).b) != null && o(n) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = c1100n;
                    n.b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long l() {
        return Math.min(this.j, this.i);
    }

    public final Object[] m(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f = objArr2;
        if (objArr != null) {
            long l = l();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + l;
                M.a(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean n(T t) {
        Object[] objArr;
        if (this.b != 0) {
            int i = this.k;
            int i2 = this.d;
            if (i >= i2 && this.j <= this.i) {
                int ordinal = this.e.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            j(t);
            int i3 = this.k + 1;
            this.k = i3;
            if (i3 > i2) {
                Object[] objArr2 = this.f;
                Intrinsics.checkNotNull(objArr2);
                M.a(objArr2, l(), null);
                this.k--;
                long l = l() + 1;
                if (this.i < l) {
                    this.i = l;
                }
                if (this.j < l) {
                    if (this.b != 0 && (objArr = this.a) != null) {
                        for (Object obj : objArr) {
                            if (obj != null) {
                                N n = (N) obj;
                                long j = n.a;
                                if (j >= 0 && j < l) {
                                    n.a = l;
                                }
                            }
                        }
                    }
                    this.j = l;
                }
            }
            long l2 = l() + this.k;
            long j2 = this.i;
            if (((int) (l2 - j2)) > 0) {
                q(1 + j2, this.j, l() + this.k, l() + this.k + this.l);
            }
        }
        return true;
    }

    public final long o(N n) {
        long j = n.a;
        if (j < l() + this.k) {
            return j;
        }
        if (this.d <= 0 && j <= l() && this.l != 0) {
            return j;
        }
        return -1L;
    }

    public final Object p(N n) {
        Object obj;
        Continuation<Unit>[] continuationArr = kotlinx.coroutines.flow.internal.c.a;
        synchronized (this) {
            try {
                long o = o(n);
                if (o < 0) {
                    obj = M.a;
                } else {
                    long j = n.a;
                    Object[] objArr = this.f;
                    Intrinsics.checkNotNull(objArr);
                    Object obj2 = objArr[((int) o) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).c;
                    }
                    n.a = o + 1;
                    Object obj3 = obj2;
                    continuationArr = r(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    public final void q(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long l = l(); l < min; l++) {
            Object[] objArr = this.f;
            Intrinsics.checkNotNull(objArr);
            M.a(objArr, l, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - min);
        this.l = (int) (j4 - j3);
    }

    public final Continuation<Unit>[] r(long j) {
        int i;
        long j2;
        long j3;
        Continuation<Unit>[] continuationArr;
        Continuation<Unit>[] continuationArr2;
        Object[] objArr;
        long j4 = this.j;
        Continuation<Unit>[] continuationArr3 = kotlinx.coroutines.flow.internal.c.a;
        if (j <= j4) {
            long l = l();
            long j5 = this.k + l;
            int i2 = this.d;
            if (i2 == 0 && this.l > 0) {
                j5++;
            }
            if (this.b != 0 && (objArr = this.a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j6 = ((N) obj).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.j) {
                long l2 = l() + this.k;
                int min = this.b > 0 ? Math.min(this.l, i2 - ((int) (l2 - j5))) : this.l;
                long j7 = this.l + l2;
                kotlinx.coroutines.internal.x xVar = M.a;
                if (min > 0) {
                    Continuation<Unit>[] continuationArr4 = new Continuation[min];
                    j3 = 1;
                    Object[] objArr2 = this.f;
                    Intrinsics.checkNotNull(objArr2);
                    long j8 = l2;
                    int i3 = 0;
                    while (true) {
                        if (l2 >= j7) {
                            i = i2;
                            continuationArr2 = continuationArr4;
                            j2 = l;
                            l2 = j8;
                            break;
                        }
                        i = i2;
                        Object obj2 = objArr2[(objArr2.length - 1) & ((int) l2)];
                        if (obj2 != xVar) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            a aVar = (a) obj2;
                            int i4 = i3 + 1;
                            continuationArr2 = continuationArr4;
                            continuationArr2[i3] = aVar.d;
                            M.a(objArr2, l2, xVar);
                            j2 = l;
                            long j9 = j8;
                            M.a(objArr2, j9, aVar.c);
                            long j10 = j9 + 1;
                            if (i4 >= min) {
                                l2 = j10;
                                break;
                            }
                            j8 = j10;
                            i3 = i4;
                        } else {
                            continuationArr2 = continuationArr4;
                            j2 = l;
                        }
                        l2++;
                        i2 = i;
                        continuationArr4 = continuationArr2;
                        l = j2;
                    }
                    continuationArr = continuationArr2;
                } else {
                    i = i2;
                    j2 = l;
                    j3 = 1;
                    continuationArr = continuationArr3;
                }
                int i5 = (int) (l2 - j2);
                long j11 = this.b == 0 ? l2 : j5;
                long max = Math.max(this.i, l2 - Math.min(0, i5));
                if (i == 0 && max < j7) {
                    Object[] objArr3 = this.f;
                    Intrinsics.checkNotNull(objArr3);
                    if (Intrinsics.areEqual(objArr3[((int) max) & (objArr3.length - 1)], xVar)) {
                        l2 += j3;
                        max += j3;
                    }
                }
                q(max, j11, l2, j7);
                h();
                return continuationArr.length == 0 ? continuationArr : k(continuationArr);
            }
        }
        return continuationArr3;
    }
}
