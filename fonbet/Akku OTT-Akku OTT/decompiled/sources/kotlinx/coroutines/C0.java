package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.InterfaceC1120x0;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1583:1\n732#1,3:1587\n361#1,2:1597\n363#1,5:1602\n368#1,5:1608\n373#1,2:1616\n361#1,2:1618\n363#1,5:1623\n368#1,5:1629\n373#1,2:1637\n169#1,2:1645\n734#1:1647\n536#1:1648\n169#1,2:1649\n537#1,15:1651\n169#1,2:1666\n169#1,2:1668\n169#1,2:1681\n732#1,3:1683\n732#1,3:1686\n169#1,2:1689\n732#1,3:1691\n169#1,2:1694\n169#1,2:1698\n169#1,2:1700\n536#1:1704\n169#1,2:1705\n537#1,15:1707\n1#2:1584\n1#2:1607\n1#2:1628\n27#3:1585\n27#3:1696\n27#3:1702\n16#4:1586\n16#4:1697\n16#4:1703\n295#5,2:1590\n295#5,2:1592\n22#6:1594\n159#7:1595\n159#7:1596\n149#7,4:1722\n275#8,3:1599\n278#8,3:1613\n275#8,3:1620\n278#8,3:1634\n275#8,6:1639\n351#9,11:1670\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n241#1:1587,3\n324#1:1597,2\n324#1:1602,5\n324#1:1608,5\n324#1:1616,2\n357#1:1618,2\n357#1:1623,5\n357#1:1629,5\n357#1:1637,2\n377#1:1645,2\n422#1:1647\n468#1:1648\n468#1:1649,2\n468#1:1651,15\n536#1:1666,2\n579#1:1668,2\n621#1:1681,2\n648#1:1683,3\n657#1:1686,3\n721#1:1689,2\n750#1:1691,3\n763#1:1694,2\n836#1:1698,2\n858#1:1700,2\n1023#1:1704\n1023#1:1705,2\n1023#1:1707,15\n324#1:1607\n357#1:1628\n204#1:1585\n766#1:1696\n911#1:1702\n204#1:1586\n766#1:1697\n911#1:1703\n252#1:1590,2\n256#1:1592,2\n264#1:1594\n270#1:1595\n272#1:1596\n1327#1:1722,4\n324#1:1599,3\n324#1:1613,3\n357#1:1620,3\n357#1:1634,3\n362#1:1639,6\n585#1:1670,11\n*E\n"})
/* loaded from: classes5.dex */
public class C0 implements InterfaceC1120x0, InterfaceC1113u, M0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class a<T> extends C1100n<T> {
        public final C0 k;

        public a(Continuation<? super T> continuation, C0 c0) {
            super(1, continuation);
            this.k = c0;
        }

        @Override // kotlinx.coroutines.C1100n
        public final Throwable p(C0 c0) {
            Throwable c;
            C0 c02 = this.k;
            c02.getClass();
            Object obj = C0.a.get(c02);
            return (!(obj instanceof c) || (c = ((c) obj).c()) == null) ? obj instanceof A ? ((A) obj).a : c0.getCancellationException() : c;
        }

        @Override // kotlinx.coroutines.C1100n
        public final String x() {
            return "AwaitContinuation";
        }
    }

    public static final class b extends B0 {
        public final C0 e;
        public final c f;
        public final C1111t i;
        public final Object j;

        public b(C0 c0, c cVar, C1111t c1111t, Object obj) {
            this.e = c0;
            this.f = cVar;
            this.i = c1111t;
            this.j = obj;
        }

        @Override // kotlinx.coroutines.B0
        public final boolean i() {
            return false;
        }

        @Override // kotlinx.coroutines.B0
        public final void j(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0.a;
            C0 c0 = this.e;
            c0.getClass();
            C1111t c1111t = this.i;
            C1111t P = C0.P(c1111t);
            c cVar = this.f;
            Object obj = this.j;
            if (P == null || !c0.Z(cVar, P, obj)) {
                cVar.a.c(new kotlinx.coroutines.internal.k(2), 2);
                C1111t P2 = C0.P(c1111t);
                if (P2 == null || !c0.Z(cVar, P2, obj)) {
                    c0.l(c0.B(cVar, obj));
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class c implements InterfaceC1110s0 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final I0 a;

        public c(I0 i0, Throwable th) {
            this.a = i0;
            this._rootCause$volatile = th;
        }

        public final void a(Throwable th) {
            Throwable c2 = c();
            if (c2 == null) {
                c.set(this, th);
                return;
            }
            if (th == c2) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Override // kotlinx.coroutines.InterfaceC1110s0
        public final I0 b() {
            return this.a;
        }

        public final Throwable c() {
            return (Throwable) c.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final ArrayList e(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable c2 = c();
            if (c2 != null) {
                arrayList.add(0, c2);
            }
            if (th != null && !Intrinsics.areEqual(th, c2)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, F0.e);
            return arrayList;
        }

        @Override // kotlinx.coroutines.InterfaceC1110s0
        public final boolean isActive() {
            return c() == null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(d());
            sb.append(", completing=");
            sb.append(b.get(this) != 0);
            sb.append(", rootCause=");
            sb.append(c());
            sb.append(", exceptions=");
            sb.append(d.get(this));
            sb.append(", list=");
            sb.append(this.a);
            sb.append(']');
            return sb.toString();
        }
    }

    public final class d extends B0 {
        public final kotlinx.coroutines.selects.f<?> e;

        public d(kotlinx.coroutines.selects.f<?> fVar) {
            this.e = fVar;
        }

        @Override // kotlinx.coroutines.B0
        public final boolean i() {
            return false;
        }

        @Override // kotlinx.coroutines.B0
        public final void j(Throwable th) {
            C0 c0 = C0.this;
            c0.getClass();
            Object obj = C0.a.get(c0);
            if (!(obj instanceof A)) {
                obj = F0.a(obj);
            }
            this.e.e(c0, obj);
        }
    }

    public final class e extends B0 {
        public final kotlinx.coroutines.selects.f<?> e;

        public e(kotlinx.coroutines.selects.f<?> fVar) {
            this.e = fVar;
        }

        @Override // kotlinx.coroutines.B0
        public final boolean i() {
            return false;
        }

        @Override // kotlinx.coroutines.B0
        public final void j(Throwable th) {
            this.e.e(C0.this, Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {1003, 1005}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n275#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
    public static final class f extends RestrictedSuspendLambda implements Function2<SequenceScope<? super InterfaceC1120x0>, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.internal.l a;
        public C1111t b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ C0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Continuation continuation, C0 c0) {
            super(2, continuation);
            this.e = c0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(continuation, this.e);
            fVar.d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super InterfaceC1120x0> sequenceScope, Continuation<? super Unit> continuation) {
            return ((f) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
        
            if (r4.yield(r7, r6) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            if (r7.yield(r1, r6) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006c -> B:6:0x0085). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0082 -> B:6:0x0085). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            I0 b;
            kotlinx.coroutines.internal.l lVar;
            kotlinx.coroutines.internal.m mVar;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.d;
                Object obj2 = C0.a.get(this.e);
                if (obj2 instanceof C1111t) {
                    InterfaceC1113u interfaceC1113u = ((C1111t) obj2).e;
                    this.c = 1;
                } else if ((obj2 instanceof InterfaceC1110s0) && (b = ((InterfaceC1110s0) obj2).b()) != null) {
                    Object obj3 = kotlinx.coroutines.internal.m.a.get(b);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    kotlinx.coroutines.internal.m mVar2 = (kotlinx.coroutines.internal.m) obj3;
                    lVar = b;
                    mVar = mVar2;
                    sequenceScope = sequenceScope2;
                    if (!Intrinsics.areEqual(mVar, lVar)) {
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = this.b;
                lVar = this.a;
                sequenceScope = (SequenceScope) this.d;
                ResultKt.throwOnFailure(obj);
                mVar = mVar.f();
                if (!Intrinsics.areEqual(mVar, lVar)) {
                    if (mVar instanceof C1111t) {
                        InterfaceC1113u interfaceC1113u2 = ((C1111t) mVar).e;
                        this.d = sequenceScope;
                        this.a = lVar;
                        this.b = (C1111t) mVar;
                        this.c = 2;
                    }
                    mVar = mVar.f();
                    if (!Intrinsics.areEqual(mVar, lVar)) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function3<C0, kotlinx.coroutines.selects.f<?>, Object, Unit> {
        public static final g a = new g(3, C0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(C0 c0, kotlinx.coroutines.selects.f<?> fVar, Object obj) {
            C0 c02 = c0;
            kotlinx.coroutines.selects.f<?> fVar2 = fVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0.a;
            if (c02.L()) {
                fVar2.d(com.google.common.base.r.f(c02, true, c02.new e(fVar2)));
            } else {
                fVar2.c(Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public C0(boolean z) {
        this._state$volatile = z ? F0.g : F0.f;
    }

    public static C1111t P(kotlinx.coroutines.internal.m mVar) {
        while (mVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.m.b;
            kotlinx.coroutines.internal.m d2 = mVar.d();
            if (d2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(mVar);
                while (true) {
                    mVar = (kotlinx.coroutines.internal.m) obj;
                    if (!mVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVar);
                }
            } else {
                mVar = d2;
            }
        }
        while (true) {
            mVar = mVar.f();
            if (!mVar.g()) {
                if (mVar instanceof C1111t) {
                    return (C1111t) mVar;
                }
                if (mVar instanceof I0) {
                    return null;
                }
            }
        }
    }

    public static String W(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC1110s0 ? ((InterfaceC1110s0) obj).isActive() ? "Active" : "New" : obj instanceof A ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.d() ? "Cancelling" : c.b.get(cVar) != 0 ? "Completing" : "Active";
    }

    public static CancellationException X(C0 c0, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C1122y0(c0.v(), th, c0) : cancellationException;
    }

    public final Throwable A(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1122y0(v(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((M0) obj).u();
    }

    public final Object B(c cVar, Object obj) {
        Throwable C;
        A a2 = obj instanceof A ? (A) obj : null;
        Throwable th = a2 != null ? a2.a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> e2 = cVar.e(th);
            C = C(cVar, e2);
            if (C != null && e2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e2.size()));
                for (Throwable th2 : e2) {
                    if (th2 != C && th2 != C && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        ExceptionsKt.addSuppressed(C, th2);
                    }
                }
            }
        }
        if (C != null && C != th) {
            obj = new A(C, false);
        }
        if (C != null && (r(C) || G(C))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            A a3 = (A) obj;
            a3.getClass();
            A.b.compareAndSet(a3, 0, 1);
        }
        R(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object c1112t0 = obj instanceof InterfaceC1110s0 ? new C1112t0((InterfaceC1110s0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c1112t0) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        z(cVar, obj);
        return obj;
    }

    public final Throwable C(c cVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new C1122y0(v(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof V0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof V0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean D() {
        return true;
    }

    public boolean E() {
        return this instanceof C1117w;
    }

    public final I0 F(InterfaceC1110s0 interfaceC1110s0) {
        I0 b2 = interfaceC1110s0.b();
        if (b2 != null) {
            return b2;
        }
        if (interfaceC1110s0 instanceof C1081h0) {
            return new I0();
        }
        if (interfaceC1110s0 instanceof B0) {
            U((B0) interfaceC1110s0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1110s0).toString());
    }

    public boolean G(Throwable th) {
        return false;
    }

    public final void I(InterfaceC1120x0 interfaceC1120x0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        K0 k0 = K0.a;
        if (interfaceC1120x0 == null) {
            atomicReferenceFieldUpdater.set(this, k0);
            return;
        }
        interfaceC1120x0.start();
        InterfaceC1109s attachChild = interfaceC1120x0.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, k0);
        }
    }

    public final InterfaceC1053e0 J(boolean z, B0 b0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K0 k0;
        boolean z2;
        boolean c2;
        b0.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C1081h0;
            k0 = K0.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC1110s0)) {
                    z2 = false;
                    break;
                }
                InterfaceC1110s0 interfaceC1110s0 = (InterfaceC1110s0) obj;
                I0 b2 = interfaceC1110s0.b();
                if (b2 == null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    U((B0) obj);
                } else {
                    if (b0.i()) {
                        c cVar = interfaceC1110s0 instanceof c ? (c) interfaceC1110s0 : null;
                        Throwable c3 = cVar != null ? cVar.c() : null;
                        if (c3 == null) {
                            c2 = b2.c(b0, 5);
                        } else if (z) {
                            b0.j(c3);
                            return k0;
                        }
                    } else {
                        c2 = b2.c(b0, 1);
                    }
                    if (c2) {
                        break;
                    }
                }
            } else {
                C1081h0 c1081h0 = (C1081h0) obj;
                if (c1081h0.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                T(c1081h0);
            }
        }
        if (z2) {
            return b0;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            A a2 = obj2 instanceof A ? (A) obj2 : null;
            b0.j(a2 != null ? a2.a : null);
        }
        return k0;
    }

    public boolean K() {
        return this instanceof C1078g;
    }

    public final boolean L() {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof InterfaceC1110s0)) {
                return false;
            }
        } while (V(obj) < 0);
        return true;
    }

    public final boolean M(Object obj) {
        Object Y;
        do {
            Y = Y(a.get(this), obj);
            if (Y == F0.a) {
                return false;
            }
            if (Y == F0.b) {
                return true;
            }
        } while (Y == F0.c);
        l(Y);
        return true;
    }

    public final Object N(Object obj) {
        Object Y;
        do {
            Y = Y(a.get(this), obj);
            if (Y == F0.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                A a2 = obj instanceof A ? (A) obj : null;
                throw new IllegalStateException(str, a2 != null ? a2.a : null);
            }
        } while (Y == F0.c);
        return Y;
    }

    public String O() {
        return getClass().getSimpleName();
    }

    public final void Q(I0 i0, Throwable th) {
        i0.c(new kotlinx.coroutines.internal.k(4), 4);
        Object obj = kotlinx.coroutines.internal.m.a.get(i0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        B b2 = null;
        for (kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) obj; !Intrinsics.areEqual(mVar, i0); mVar = mVar.f()) {
            if ((mVar instanceof B0) && ((B0) mVar).i()) {
                try {
                    ((B0) mVar).j(th);
                } catch (Throwable th2) {
                    if (b2 != null) {
                        ExceptionsKt.addSuppressed(b2, th2);
                    } else {
                        b2 = new B("Exception in completion handler " + mVar + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (b2 != null) {
            H(b2);
        }
        r(th);
    }

    public void R(Object obj) {
    }

    public void S() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.r0] */
    public final void T(C1081h0 c1081h0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        I0 i0 = new I0();
        if (!c1081h0.a) {
            i0 = new C1108r0(i0);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1081h0, i0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c1081h0);
    }

    public final void U(B0 b0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        I0 i0 = new I0();
        b0.getClass();
        kotlinx.coroutines.internal.m.b.set(i0, b0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.m.a;
        atomicReferenceFieldUpdater2.set(i0, b0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(b0) == b0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b0, b0, i0)) {
                    if (atomicReferenceFieldUpdater2.get(b0) != b0) {
                        break;
                    }
                }
                i0.e(b0);
                break loop0;
            }
            break;
        }
        kotlinx.coroutines.internal.m f2 = b0.f();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b0, f2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b0);
    }

    public final int V(Object obj) {
        boolean z = obj instanceof C1081h0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((C1081h0) obj).a) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, F0.g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            S();
            return 1;
        }
        if (!(obj instanceof C1108r0)) {
            return 0;
        }
        I0 i0 = ((C1108r0) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i0)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        S();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object Y(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1110s0)) {
            return F0.a;
        }
        if (((obj instanceof C1081h0) || (obj instanceof B0)) && !(obj instanceof C1111t) && !(obj2 instanceof A)) {
            InterfaceC1110s0 interfaceC1110s0 = (InterfaceC1110s0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object c1112t0 = obj2 instanceof InterfaceC1110s0 ? new C1112t0((InterfaceC1110s0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1110s0, c1112t0)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1110s0) {
                    return F0.c;
                }
            }
            R(obj2);
            z(interfaceC1110s0, obj2);
            return obj2;
        }
        InterfaceC1110s0 interfaceC1110s02 = (InterfaceC1110s0) obj;
        I0 F = F(interfaceC1110s02);
        if (F == null) {
            return F0.c;
        }
        c cVar = interfaceC1110s02 instanceof c ? (c) interfaceC1110s02 : null;
        if (cVar == null) {
            cVar = new c(F, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.b;
            if (atomicIntegerFieldUpdater.get(cVar) != 0) {
                return F0.a;
            }
            atomicIntegerFieldUpdater.set(cVar, 1);
            if (cVar != interfaceC1110s02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1110s02, cVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1110s02) {
                        return F0.c;
                    }
                }
            }
            boolean d2 = cVar.d();
            A a2 = obj2 instanceof A ? (A) obj2 : null;
            if (a2 != null) {
                cVar.a(a2.a);
            }
            ?? c2 = d2 ? 0 : cVar.c();
            objectRef.element = c2;
            Unit unit = Unit.INSTANCE;
            if (c2 != 0) {
                Q(F, c2);
            }
            C1111t P = P(F);
            if (P != null && Z(cVar, P, obj2)) {
                return F0.b;
            }
            F.c(new kotlinx.coroutines.internal.k(2), 2);
            C1111t P2 = P(F);
            return (P2 == null || !Z(cVar, P2, obj2)) ? B(cVar, obj2) : F0.b;
        }
    }

    public final boolean Z(c cVar, C1111t c1111t, Object obj) {
        while (com.google.common.base.r.f(c1111t.e, false, new b(this, cVar, c1111t, obj)) == K0.a) {
            c1111t = P(c1111t);
            if (c1111t == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1109s attachChild(InterfaceC1113u interfaceC1113u) {
        C1111t c1111t = new C1111t(interfaceC1113u);
        c1111t.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1081h0) {
                C1081h0 c1081h0 = (C1081h0) obj;
                if (c1081h0.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1111t)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                T(c1081h0);
            } else {
                boolean z = obj instanceof InterfaceC1110s0;
                K0 k0 = K0.a;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    A a2 = obj2 instanceof A ? (A) obj2 : null;
                    c1111t.j(a2 != null ? a2.a : null);
                    return k0;
                }
                I0 b2 = ((InterfaceC1110s0) obj).b();
                if (b2 == null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    U((B0) obj);
                } else if (!b2.c(c1111t, 7)) {
                    boolean c2 = b2.c(c1111t, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof c) {
                        r4 = ((c) obj3).c();
                    } else {
                        A a3 = obj3 instanceof A ? (A) obj3 : null;
                        if (a3 != null) {
                            r4 = a3.a;
                        }
                    }
                    c1111t.j(r4);
                    if (c2) {
                        break loop0;
                    }
                    return k0;
                }
            }
        }
        return c1111t;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final CancellationException getCancellationException() {
        Object obj = a.get(this);
        if (!(obj instanceof c)) {
            if (!(obj instanceof InterfaceC1110s0)) {
                return obj instanceof A ? X(this, ((A) obj).a) : new C1122y0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable c2 = ((c) obj).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = v();
        }
        return new C1122y0(concat, c2, this);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final Sequence<InterfaceC1120x0> getChildren() {
        return SequencesKt.sequence(new f(null, this));
    }

    public Object getCompleted() {
        Object obj = a.get(this);
        if (obj instanceof InterfaceC1110s0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof A) {
            throw ((A) obj).a;
        }
        return F0.a(obj);
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = a.get(this);
        if (obj instanceof InterfaceC1110s0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        A a2 = obj instanceof A ? (A) obj : null;
        if (a2 != null) {
            return a2.a;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return InterfaceC1120x0.a.a;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final kotlinx.coroutines.selects.a getOnJoin() {
        g gVar = g.a;
        Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new kotlinx.coroutines.selects.b(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(gVar, 3));
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1120x0 getParent() {
        InterfaceC1109s interfaceC1109s = (InterfaceC1109s) b.get(this);
        if (interfaceC1109s != null) {
            return interfaceC1109s.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1053e0 invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        return J(true, new C1118w0(function1));
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public boolean isActive() {
        Object obj = a.get(this);
        return (obj instanceof InterfaceC1110s0) && ((InterfaceC1110s0) obj).isActive();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isCancelled() {
        Object obj = a.get(this);
        if (obj instanceof A) {
            return true;
        }
        return (obj instanceof c) && ((c) obj).d();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isCompleted() {
        return !(a.get(this) instanceof InterfaceC1110s0);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final Object join(Continuation<? super Unit> continuation) {
        if (!L()) {
            com.google.common.base.r.d(continuation.get$context());
            return Unit.INSTANCE;
        }
        C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(continuation));
        c1100n.r();
        c1100n.u(new C1055f0(com.google.common.base.r.f(this, true, new O0(c1100n))));
        Object q = c1100n.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (q != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            q = Unit.INSTANCE;
        }
        return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
    }

    public void l(Object obj) {
    }

    public void m(Object obj) {
        l(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public final Object n(Continuation<Object> continuation) {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof InterfaceC1110s0)) {
                if (obj instanceof A) {
                    throw ((A) obj).a;
                }
                return F0.a(obj);
            }
        } while (V(obj) < 0);
        a aVar = new a(IntrinsicsKt.intercepted(continuation), this);
        aVar.r();
        aVar.u(new C1055f0(com.google.common.base.r.f(this, true, new N0(aVar))));
        Object q = aVar.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == kotlinx.coroutines.F0.b) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Object obj) {
        kotlinx.coroutines.internal.x xVar;
        Object obj2 = F0.a;
        if (E()) {
            do {
                Object obj3 = a.get(this);
                if (obj3 instanceof InterfaceC1110s0) {
                    if (obj3 instanceof c) {
                        c cVar = (c) obj3;
                        cVar.getClass();
                        if (c.b.get(cVar) != 0) {
                        }
                    }
                    obj2 = Y(obj3, new A(A(obj), false));
                }
                obj2 = F0.a;
                break;
            } while (obj2 == F0.c);
        }
        if (obj2 == F0.a) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof c)) {
                    if (!(obj4 instanceof InterfaceC1110s0)) {
                        xVar = F0.d;
                        break;
                    }
                    if (th == null) {
                        th = A(obj);
                    }
                    InterfaceC1110s0 interfaceC1110s0 = (InterfaceC1110s0) obj4;
                    if (interfaceC1110s0.isActive()) {
                        I0 F = F(interfaceC1110s0);
                        if (F != null) {
                            c cVar2 = new c(F, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1110s0, cVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != interfaceC1110s0) {
                                    break;
                                }
                            }
                            Q(F, th);
                            xVar = F0.a;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object Y = Y(obj4, new A(th, false));
                        if (Y == F0.a) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (Y != F0.c) {
                            obj2 = Y;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        c cVar3 = (c) obj4;
                        cVar3.getClass();
                        if (c.d.get(cVar3) == F0.e) {
                            xVar = F0.d;
                        } else {
                            boolean d2 = ((c) obj4).d();
                            if (obj != null || !d2) {
                                if (th == null) {
                                    th = A(obj);
                                }
                                ((c) obj4).a(th);
                            }
                            Throwable c2 = d2 ? null : ((c) obj4).c();
                            if (c2 != null) {
                                Q(((c) obj4).a, c2);
                            }
                            xVar = F0.a;
                        }
                    }
                }
            }
            obj2 = xVar;
        }
        if (obj2 != F0.a && obj2 != F0.b) {
            if (obj2 == F0.d) {
                return false;
            }
            l(obj2);
            return true;
        }
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public final InterfaceC1120x0 plus(InterfaceC1120x0 interfaceC1120x0) {
        return interfaceC1120x0;
    }

    public final boolean r(Throwable th) {
        if (!K()) {
            boolean z = th instanceof CancellationException;
            InterfaceC1109s interfaceC1109s = (InterfaceC1109s) b.get(this);
            return (interfaceC1109s == null || interfaceC1109s == K0.a) ? z : interfaceC1109s.a(th) || z;
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean start() {
        int V;
        do {
            V = V(a.get(this));
            if (V == 0) {
                return false;
            }
        } while (V != 1);
        return true;
    }

    public boolean t(Object obj) {
        return M(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(O() + '{' + W(a.get(this)) + '}');
        sb.append('@');
        sb.append(O.a(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.M0
    public final CancellationException u() {
        CancellationException cancellationException;
        Object obj = a.get(this);
        if (obj instanceof c) {
            cancellationException = ((c) obj).c();
        } else if (obj instanceof A) {
            cancellationException = ((A) obj).a;
        } else {
            if (obj instanceof InterfaceC1110s0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new C1122y0("Parent job is ".concat(W(obj)), cancellationException, this) : cancellationException2;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && D();
    }

    @Override // kotlinx.coroutines.InterfaceC1113u
    public final void x(C0 c0) {
        o(c0);
    }

    public final void z(InterfaceC1110s0 interfaceC1110s0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        InterfaceC1109s interfaceC1109s = (InterfaceC1109s) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1109s != null) {
            interfaceC1109s.dispose();
            atomicReferenceFieldUpdater.set(this, K0.a);
        }
        B b2 = null;
        A a2 = obj instanceof A ? (A) obj : null;
        Throwable th = a2 != null ? a2.a : null;
        if (interfaceC1110s0 instanceof B0) {
            try {
                ((B0) interfaceC1110s0).j(th);
                return;
            } catch (Throwable th2) {
                H(new B("Exception in completion handler " + interfaceC1110s0 + " for " + this, th2));
                return;
            }
        }
        I0 b3 = interfaceC1110s0.b();
        if (b3 != null) {
            b3.c(new kotlinx.coroutines.internal.k(1), 1);
            Object obj2 = kotlinx.coroutines.internal.m.a.get(b3);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (kotlinx.coroutines.internal.m mVar = (kotlinx.coroutines.internal.m) obj2; !Intrinsics.areEqual(mVar, b3); mVar = mVar.f()) {
                if (mVar instanceof B0) {
                    try {
                        ((B0) mVar).j(th);
                    } catch (Throwable th3) {
                        if (b2 != null) {
                            ExceptionsKt.addSuppressed(b2, th3);
                        } else {
                            b2 = new B("Exception in completion handler " + mVar + " for " + this, th3);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (b2 != null) {
                H(b2);
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(Throwable th) {
        p(th != null ? X(this, th) : new C1122y0(v(), null, this));
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1053e0 invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        B0 c1118w0;
        if (z) {
            c1118w0 = new C1116v0(function1);
        } else {
            c1118w0 = new C1118w0(function1);
        }
        return J(z2, c1118w0);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1122y0(v(), null, this);
        }
        p(cancellationException);
    }

    public void H(B b2) {
        throw b2;
    }
}
