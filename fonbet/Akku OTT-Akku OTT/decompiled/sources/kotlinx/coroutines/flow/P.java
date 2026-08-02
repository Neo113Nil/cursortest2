package kotlinx.coroutines.flow;

import com.google.android.gms.wallet.WalletConstants;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.InterfaceC1120x0;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n27#3:435\n27#3:439\n16#4:436\n16#4:440\n13346#5,2:437\n326#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
/* loaded from: classes5.dex */
public final class P<T> extends kotlinx.coroutines.flow.internal.b<S> implements G<T>, InterfaceC1060e, kotlinx.coroutines.flow.internal.q<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {389, 401, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class a extends ContinuationImpl {
        public P a;
        public InterfaceC1061f b;
        public S c;
        public InterfaceC1120x0 d;
        public Object e;
        public /* synthetic */ Object f;
        public final /* synthetic */ P<T> i;
        public int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(P<T> p, Continuation<? super a> continuation) {
            super(continuation);
            this.i = p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.j |= Integer.MIN_VALUE;
            return this.i.collect(null, this);
        }
    }

    public P(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public final InterfaceC1060e<T> a(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != kotlinx.coroutines.channels.a.b) ? M.b(this, coroutineContext, i, aVar) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.coroutines.internal.x] */
    @Override // kotlinx.coroutines.flow.G
    public final boolean c(T t, T t2) {
        ?? r0 = kotlinx.coroutines.flow.internal.t.a;
        if (t == null) {
            t = r0;
        }
        if (t2 == null) {
            t2 = r0;
        }
        return g(t, t2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, (java.lang.Object) r12) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        if (r12 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
    
        if (((kotlinx.coroutines.flow.U) r11).a(r0) == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:14:0x0094, B:16:0x009c, B:19:0x00a3, B:20:0x00a7, B:24:0x00aa, B:26:0x00cb, B:29:0x00db, B:32:0x00b0, B:35:0x00b7, B:43:0x004f, B:45:0x005a, B:46:0x0085), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:14:0x0094, B:16:0x009c, B:19:0x00a3, B:20:0x00a7, B:24:0x00aa, B:26:0x00cb, B:29:0x00db, B:32:0x00b0, B:35:0x00b7, B:43:0x004f, B:45:0x005a, B:46:0x0085), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlinx.coroutines.flow.S] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:14:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00eb -> B:14:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<?> continuation) {
        a aVar;
        Object coroutine_suspended;
        int i;
        P<T> p;
        S s;
        InterfaceC1061f interfaceC1061f2;
        InterfaceC1120x0 interfaceC1120x0;
        Object obj;
        S s2;
        Object andSet;
        T t;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.j = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.j;
                    ?? r6 = 1;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        S b = b();
                        try {
                            if (interfaceC1061f instanceof U) {
                                aVar.a = this;
                                aVar.b = interfaceC1061f;
                                aVar.c = b;
                                aVar.j = 1;
                            }
                            p = this;
                            s = b;
                        } catch (Throwable th) {
                            th = th;
                            p = this;
                            r6 = b;
                            p.f(r6);
                            throw th;
                        }
                    } else if (i == 1) {
                        S s3 = aVar.c;
                        interfaceC1061f = aVar.b;
                        p = aVar.a;
                        ResultKt.throwOnFailure(obj2);
                        s = s3;
                    } else if (i == 2) {
                        obj = aVar.e;
                        interfaceC1120x0 = aVar.d;
                        S s4 = aVar.c;
                        interfaceC1061f2 = aVar.b;
                        p = aVar.a;
                        ResultKt.throwOnFailure(obj2);
                        s2 = s4;
                        andSet = s2.a.getAndSet(Q.a);
                        Intrinsics.checkNotNull(andSet);
                        if (andSet != Q.b) {
                        }
                        ?? r12 = e.get(p);
                        if (interfaceC1120x0 != null) {
                        }
                        if (r12 == kotlinx.coroutines.flow.internal.t.a) {
                        }
                        aVar.a = p;
                        aVar.b = interfaceC1061f2;
                        aVar.c = r6;
                        aVar.d = interfaceC1120x0;
                        aVar.e = r12;
                        aVar.j = 2;
                        if (interfaceC1061f2.emit(t, aVar) == coroutine_suspended) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = aVar.e;
                        interfaceC1120x0 = aVar.d;
                        S s5 = aVar.c;
                        interfaceC1061f2 = aVar.b;
                        p = aVar.a;
                        ResultKt.throwOnFailure(obj2);
                        r6 = s5;
                        ?? r122 = e.get(p);
                        if (interfaceC1120x0 != null && !interfaceC1120x0.isActive()) {
                            throw interfaceC1120x0.getCancellationException();
                        }
                        t = r122 == kotlinx.coroutines.flow.internal.t.a ? null : r122;
                        aVar.a = p;
                        aVar.b = interfaceC1061f2;
                        aVar.c = r6;
                        aVar.d = interfaceC1120x0;
                        aVar.e = r122;
                        aVar.j = 2;
                        if (interfaceC1061f2.emit(t, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = r122;
                        s2 = r6;
                        andSet = s2.a.getAndSet(Q.a);
                        Intrinsics.checkNotNull(andSet);
                        if (andSet != Q.b) {
                            r6 = s2;
                        } else {
                            aVar.a = p;
                            aVar.b = interfaceC1061f2;
                            aVar.c = s2;
                            aVar.d = interfaceC1120x0;
                            aVar.e = obj;
                            aVar.j = 3;
                            Object c = s2.c(aVar);
                            r6 = s2;
                        }
                        ?? r1222 = e.get(p);
                        if (interfaceC1120x0 != null) {
                            throw interfaceC1120x0.getCancellationException();
                        }
                        if (r1222 == kotlinx.coroutines.flow.internal.t.a) {
                        }
                        aVar.a = p;
                        aVar.b = interfaceC1061f2;
                        aVar.c = r6;
                        aVar.d = interfaceC1120x0;
                        aVar.e = r1222;
                        aVar.j = 2;
                        if (interfaceC1061f2.emit(t, aVar) == coroutine_suspended) {
                        }
                    }
                    interfaceC1061f2 = interfaceC1061f;
                    interfaceC1120x0 = (InterfaceC1120x0) aVar.getContext().get(InterfaceC1120x0.a.a);
                    obj = null;
                    r6 = s;
                    ?? r12222 = e.get(p);
                    if (interfaceC1120x0 != null) {
                    }
                    if (r12222 == kotlinx.coroutines.flow.internal.t.a) {
                    }
                    aVar.a = p;
                    aVar.b = interfaceC1061f2;
                    aVar.c = r6;
                    aVar.d = interfaceC1120x0;
                    aVar.e = r12222;
                    aVar.j = 2;
                    if (interfaceC1061f2.emit(t, aVar) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            interfaceC1061f2 = interfaceC1061f;
            interfaceC1120x0 = (InterfaceC1120x0) aVar.getContext().get(InterfaceC1120x0.a.a);
            obj = null;
            r6 = s;
            ?? r122222 = e.get(p);
            if (interfaceC1120x0 != null) {
            }
            if (r122222 == kotlinx.coroutines.flow.internal.t.a) {
            }
            aVar.a = p;
            aVar.b = interfaceC1061f2;
            aVar.c = r6;
            aVar.d = interfaceC1120x0;
            aVar.e = r122222;
            aVar.j = 2;
            if (interfaceC1061f2.emit(t, aVar) == coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        aVar = new a(this, continuation);
        Object obj22 = aVar.f;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.j;
        ?? r62 = 1;
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final S d() {
        return new S();
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final kotlinx.coroutines.flow.internal.d[] e() {
        return new S[2];
    }

    @Override // kotlinx.coroutines.flow.F, kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.INSTANCE;
    }

    public final boolean g(Object obj, Object obj2) {
        int i;
        Object obj3;
        kotlinx.coroutines.internal.x xVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj4, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.d;
            if ((i2 & 1) != 0) {
                this.d = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.d = i3;
            Object obj5 = this.a;
            Unit unit = Unit.INSTANCE;
            while (true) {
                S[] sArr = (S[]) obj5;
                if (sArr != null) {
                    for (S s : sArr) {
                        if (s != null) {
                            AtomicReference<Object> atomicReference = s.a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 != null && obj6 != (xVar = Q.b)) {
                                    kotlinx.coroutines.internal.x xVar2 = Q.a;
                                    if (obj6 != xVar2) {
                                        while (!atomicReference.compareAndSet(obj6, xVar2)) {
                                            if (atomicReference.get() != obj6) {
                                                break;
                                            }
                                        }
                                        Result.Companion companion = Result.INSTANCE;
                                        ((C1100n) obj6).resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj6, xVar)) {
                                        if (atomicReference.get() != obj6) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                        return true;
                    }
                    obj3 = this.a;
                    Unit unit2 = Unit.INSTANCE;
                }
                obj5 = obj3;
                i3 = i;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.G, kotlinx.coroutines.flow.O
    public final T getValue() {
        T t = (T) e.get(this);
        if (t == kotlinx.coroutines.flow.internal.t.a) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.G
    public final void setValue(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.internal.t.a;
        }
        g(null, t);
    }
}
