package kotlinx.coroutines.channels;

import androidx.collection.SieveCacheKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.C1104p;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.internal.AbstractC1085b;
import kotlinx.coroutines.internal.C1084a;
import kotlinx.coroutines.internal.C1091h;

@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3116:1\n270#1,6:3119\n277#1,68:3126\n394#1,18:3217\n241#1:3235\n266#1,10:3236\n277#1,48:3247\n415#1:3295\n331#1,14:3296\n419#1,3:3311\n241#1:3324\n266#1,10:3325\n277#1,68:3336\n241#1:3414\n266#1,10:3415\n277#1,68:3426\n241#1:3498\n266#1,10:3499\n277#1,68:3510\n241#1:3579\n266#1,10:3580\n277#1,68:3591\n906#1,52:3661\n984#1,8:3717\n878#1:3725\n902#1,33:3726\n994#1:3759\n936#1,14:3760\n955#1,3:3775\n999#1,6:3778\n906#1,52:3792\n984#1,8:3848\n878#1:3856\n902#1,33:3857\n994#1:3890\n936#1,14:3891\n955#1,3:3906\n999#1,6:3909\n878#1:3924\n902#1,48:3925\n955#1,3:3974\n878#1:3977\n902#1,48:3978\n955#1,3:4027\n241#1:4039\n266#1,10:4040\n277#1,68:4051\n878#1:4120\n902#1,48:4121\n955#1,3:4170\n1#2:3117\n3099#3:3118\n3099#3:3125\n3099#3:3246\n3099#3:3335\n3099#3:3425\n3099#3:3497\n3099#3:3509\n3099#3:3590\n3099#3:3660\n3099#3:3923\n3099#3:4030\n3099#3:4031\n3113#3:4032\n3113#3:4033\n3112#3:4034\n3112#3:4035\n3112#3:4036\n3113#3:4037\n3112#3:4038\n3099#3:4050\n3100#3:4173\n3099#3:4174\n3099#3:4175\n3099#3:4176\n3100#3:4177\n3099#3:4178\n3100#3:4201\n3099#3:4202\n3099#3:4203\n3100#3:4204\n3099#3:4254\n3100#3:4255\n3100#3:4256\n3100#3:4274\n3100#3:4275\n351#4,9:3194\n360#4,2:3211\n369#4,4:3213\n373#4,8:3314\n351#4,9:3405\n360#4,2:3495\n369#4,4:3713\n373#4,8:3784\n369#4,4:3844\n373#4,8:3915\n206#5:3203\n207#5:3206\n206#5:3207\n207#5:3210\n57#6,2:3204\n57#6,2:3208\n57#6,2:3322\n266#7:3310\n266#7:3404\n266#7:3494\n266#7:3578\n266#7:3659\n266#7:4119\n902#8:3774\n902#8:3905\n902#8:3973\n902#8:4026\n902#8:4169\n33#9,11:4179\n33#9,11:4190\n68#10,3:4205\n42#10,8:4208\n68#10,3:4216\n42#10,8:4219\n42#10,8:4227\n68#10,3:4235\n42#10,8:4238\n42#10,8:4246\n774#11:4257\n865#11,2:4258\n2318#11,14:4260\n774#11:4276\n865#11,2:4277\n2318#11,14:4279\n774#11:4293\n865#11,2:4294\n2318#11,14:4296\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n110#1:3119,6\n110#1:3126,68\n151#1:3217,18\n151#1:3235\n151#1:3236,10\n151#1:3247,48\n151#1:3295\n151#1:3296,14\n151#1:3311,3\n191#1:3324\n191#1:3325,10\n191#1:3336,68\n222#1:3414\n222#1:3415,10\n222#1:3426,68\n353#1:3498\n353#1:3499,10\n353#1:3510,68\n411#1:3579\n411#1:3580,10\n411#1:3591,68\n687#1:3661,52\n716#1:3717,8\n716#1:3725\n716#1:3726,33\n716#1:3759\n716#1:3760,14\n716#1:3775,3\n716#1:3778,6\n752#1:3792,52\n768#1:3848,8\n768#1:3856\n768#1:3857,33\n768#1:3890\n768#1:3891,14\n768#1:3906,3\n768#1:3909,6\n801#1:3924\n801#1:3925,48\n801#1:3974,3\n991#1:3977\n991#1:3978,48\n991#1:4027,3\n1484#1:4039\n1484#1:4040,10\n1484#1:4051,68\n1532#1:4120\n1532#1:4121,48\n1532#1:4170,3\n67#1:3118\n110#1:3125\n151#1:3246\n191#1:3335\n222#1:3425\n275#1:3497\n353#1:3509\n411#1:3590\n626#1:3660\n791#1:3923\n1027#1:4030\n1076#1:4031\n1394#1:4032\n1396#1:4033\n1426#1:4034\n1436#1:4035\n1445#1:4036\n1446#1:4037\n1453#1:4038\n1484#1:4050\n1898#1:4173\n1900#1:4174\n1902#1:4175\n1915#1:4176\n1926#1:4177\n1927#1:4178\n2229#1:4201\n2242#1:4202\n2252#1:4203\n2255#1:4204\n2572#1:4254\n2574#1:4255\n2599#1:4256\n2661#1:4274\n2662#1:4275\n131#1:3194,9\n131#1:3211,2\n150#1:3213,4\n150#1:3314,8\n218#1:3405,9\n218#1:3495,2\n715#1:3713,4\n715#1:3784,8\n766#1:3844,4\n766#1:3915,8\n135#1:3203\n135#1:3206\n138#1:3207\n138#1:3210\n135#1:3204,2\n138#1:3208,2\n180#1:3322,2\n151#1:3310\n191#1:3404\n222#1:3494\n353#1:3578\n411#1:3659\n1484#1:4119\n716#1:3774\n768#1:3905\n801#1:3973\n991#1:4026\n1532#1:4169\n2131#1:4179,11\n2186#1:4190,11\n2394#1:4205,3\n2394#1:4208,8\n2449#1:4216,3\n2449#1:4219,8\n2468#1:4227,8\n2498#1:4235,3\n2498#1:4238,8\n2559#1:4246,8\n2608#1:4257\n2608#1:4258,2\n2609#1:4260,14\n2673#1:4276\n2673#1:4277,2\n2674#1:4279,14\n2714#1:4293\n2714#1:4294,2\n2715#1:4296,14\n*E\n"})
/* loaded from: classes5.dex */
public class b<E> implements g<E> {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n906#2,52:3117\n984#2,8:3173\n878#2:3181\n902#2,33:3182\n994#2:3215\n936#2,14:3216\n955#2,3:3231\n999#2,6:3234\n369#3,4:3169\n373#3,8:3240\n902#4:3230\n57#5,2:3248\n57#5,2:3251\n1#6:3250\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1619#1:3117,52\n1657#1:3173,8\n1657#1:3181\n1657#1:3182,33\n1657#1:3215\n1657#1:3216,14\n1657#1:3231,3\n1657#1:3234,6\n1655#1:3169,4\n1655#1:3240,8\n1657#1:3230\n1693#1:3248,2\n1741#1:3251,2\n*E\n"})
    public final class a implements i<E>, b1 {
        public Object a = f.p;
        public C1100n<? super Boolean> b;

        public a() {
        }

        public static final void c(a aVar) {
            C1100n<? super Boolean> c1100n = aVar.b;
            Intrinsics.checkNotNull(c1100n);
            aVar.b = null;
            aVar.a = f.l;
            Throwable r = b.this.r();
            if (r == null) {
                Result.Companion companion = Result.INSTANCE;
                c1100n.resumeWith(Result.m1716constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c1100n.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(r)));
            }
        }

        @Override // kotlinx.coroutines.b1
        public final void a(kotlinx.coroutines.internal.u<?> uVar, int i) {
            C1100n<? super Boolean> c1100n = this.b;
            if (c1100n != null) {
                c1100n.a(uVar, i);
            }
        }

        @Override // kotlinx.coroutines.channels.i
        public final Object b(Continuation<? super Boolean> continuation) {
            l<E> lVar;
            Boolean boxBoolean;
            Object obj = this.a;
            boolean z = true;
            if (obj == f.p || obj == f.l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.i;
                b<E> bVar = b.this;
                l<E> lVar2 = (l) atomicReferenceFieldUpdater.get(bVar);
                while (true) {
                    if (bVar.x()) {
                        this.a = f.l;
                        Throwable r = bVar.r();
                        if (r != null) {
                            int i = kotlinx.coroutines.internal.w.a;
                            throw r;
                        }
                        z = false;
                    } else {
                        long andIncrement = b.c.getAndIncrement(bVar);
                        long j = f.b;
                        long j2 = andIncrement / j;
                        int i2 = (int) (andIncrement % j);
                        if (lVar2.c != j2) {
                            lVar = bVar.q(j2, lVar2);
                            if (lVar == null) {
                                continue;
                            }
                        } else {
                            lVar = lVar2;
                        }
                        Object H = bVar.H(lVar, i2, andIncrement, null);
                        kotlinx.coroutines.internal.x xVar = f.m;
                        if (H == xVar) {
                            throw new IllegalStateException("unreachable");
                        }
                        kotlinx.coroutines.internal.x xVar2 = f.o;
                        if (H == xVar2) {
                            if (andIncrement < bVar.u()) {
                                lVar.a();
                            }
                            lVar2 = lVar;
                        } else {
                            if (H == f.n) {
                                b<E> bVar2 = b.this;
                                C1100n<? super Boolean> a = C1104p.a(IntrinsicsKt.intercepted(continuation));
                                try {
                                    this.b = a;
                                    Object H2 = bVar2.H(lVar, i2, andIncrement, this);
                                    if (H2 == xVar) {
                                        a(lVar, i2);
                                    } else {
                                        if (H2 == xVar2) {
                                            if (andIncrement < bVar2.u()) {
                                                lVar.a();
                                            }
                                            l<E> lVar3 = (l) b.i.get(bVar2);
                                            while (true) {
                                                if (bVar2.x()) {
                                                    c(this);
                                                    break;
                                                }
                                                long andIncrement2 = b.c.getAndIncrement(bVar2);
                                                long j3 = f.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (lVar3.c != j4) {
                                                    l<E> q = bVar2.q(j4, lVar3);
                                                    if (q != null) {
                                                        lVar3 = q;
                                                    }
                                                }
                                                Object H3 = bVar2.H(lVar3, i3, andIncrement2, this);
                                                if (H3 == f.m) {
                                                    a(lVar3, i3);
                                                    break;
                                                }
                                                if (H3 == f.o) {
                                                    if (andIncrement2 < bVar2.u()) {
                                                        lVar3.a();
                                                    }
                                                } else {
                                                    if (H3 == f.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    lVar3.a();
                                                    this.a = H3;
                                                    this.b = null;
                                                    boxBoolean = Boxing.boxBoolean(true);
                                                }
                                            }
                                        } else {
                                            lVar.a();
                                            this.a = H2;
                                            this.b = null;
                                            boxBoolean = Boxing.boxBoolean(true);
                                        }
                                        a.f(boxBoolean, null);
                                    }
                                    Object q2 = a.q();
                                    if (q2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        DebugProbesKt.probeCoroutineSuspended(continuation);
                                    }
                                    return q2;
                                } catch (Throwable th) {
                                    a.y();
                                    throw th;
                                }
                            }
                            lVar.a();
                            this.a = H;
                        }
                    }
                }
            }
            return Boxing.boxBoolean(z);
        }

        @Override // kotlinx.coroutines.channels.i
        public final E next() {
            E e = (E) this.a;
            kotlinx.coroutines.internal.x xVar = f.p;
            if (e == xVar) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.a = xVar;
            if (e != f.l) {
                return e;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.b;
            Throwable s = b.this.s();
            int i = kotlinx.coroutines.internal.w.a;
            throw s;
        }
    }

    /* renamed from: kotlinx.coroutines.channels.b$b, reason: collision with other inner class name */
    public static final class C0154b implements b1 {
        @Override // kotlinx.coroutines.b1
        public final void a(kotlinx.coroutines.internal.u<?> uVar, int i) {
            throw null;
        }
    }

    public b(int i2) {
        this.a = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.compose.runtime.u.a(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        l<Object> lVar = f.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        l<Object> lVar2 = new l<>(0L, null, this, 3);
        this.sendSegment$volatile = lVar2;
        this.receiveSegment$volatile = lVar2;
        if (z()) {
            lVar2 = f.a;
            Intrinsics.checkNotNull(lVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = lVar2;
        this._closeCause$volatile = f.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object C(b bVar, ContinuationImpl continuationImpl) {
        c cVar;
        int i2;
        l<E> lVar;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i3 = cVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.c = i3 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar2.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((k) obj).a;
                }
                ResultKt.throwOnFailure(obj);
                l<E> lVar2 = (l) i.get(bVar);
                while (!bVar.x()) {
                    long andIncrement = c.getAndIncrement(bVar);
                    long j2 = f.b;
                    long j3 = andIncrement / j2;
                    int i4 = (int) (andIncrement % j2);
                    if (lVar2.c != j3) {
                        l<E> q = bVar.q(j3, lVar2);
                        if (q == null) {
                            continue;
                        } else {
                            lVar = q;
                        }
                    } else {
                        lVar = lVar2;
                    }
                    b bVar2 = bVar;
                    Object H = bVar2.H(lVar, i4, andIncrement, null);
                    if (H == f.m) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (H != f.o) {
                        if (H == f.n) {
                            cVar2.c = 1;
                            Object D = bVar2.D(lVar, i4, andIncrement, cVar2);
                            return D == coroutine_suspended ? coroutine_suspended : D;
                        }
                        lVar.a();
                        k.Companion.getClass();
                        return H;
                    }
                    if (andIncrement < bVar2.u()) {
                        lVar.a();
                    }
                    bVar = bVar2;
                    lVar2 = lVar;
                }
                k.b bVar3 = k.Companion;
                Throwable r = bVar.r();
                bVar3.getClass();
                return new k.a(r);
            }
        }
        cVar = new c(bVar, continuationImpl);
        c cVar22 = cVar;
        Object obj2 = cVar22.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar22.c;
        if (i2 == 0) {
        }
    }

    public static final l b(b bVar, long j2, l lVar) {
        Object a2;
        b bVar2;
        l<Object> lVar2 = f.a;
        e eVar = e.a;
        loop0: while (true) {
            a2 = C1084a.a(lVar, j2, eVar);
            if (!kotlinx.coroutines.internal.v.b(a2)) {
                kotlinx.coroutines.internal.u a3 = kotlinx.coroutines.internal.v.a(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    kotlinx.coroutines.internal.u uVar = (kotlinx.coroutines.internal.u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.c >= a3.c) {
                        break loop0;
                    }
                    if (!a3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, a3)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != uVar) {
                            if (a3.f()) {
                                a3.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean b2 = kotlinx.coroutines.internal.v.b(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (b2) {
            bVar.j();
            if (lVar.c * f.b < atomicLongFieldUpdater.get(bVar)) {
                lVar.a();
                return null;
            }
        } else {
            l lVar3 = (l) kotlinx.coroutines.internal.v.a(a2);
            long j3 = lVar3.c;
            if (j3 <= j2) {
                return lVar3;
            }
            long j4 = f.b * j3;
            while (true) {
                long j5 = b.get(bVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (b.compareAndSet(bVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                bVar = bVar2;
            }
            if (j3 * f.b < atomicLongFieldUpdater.get(bVar2)) {
                lVar3.a();
            }
        }
        return null;
    }

    public static final void f(b bVar, Object obj, C1100n c1100n) {
        Throwable t = bVar.t();
        Result.Companion companion = Result.INSTANCE;
        c1100n.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(t)));
    }

    public static final int k(b bVar, l lVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        lVar.n(i2, obj);
        if (z) {
            return bVar.I(lVar, i2, obj, j2, obj2, z);
        }
        Object l2 = lVar.l(i2);
        if (l2 == null) {
            if (bVar.l(j2)) {
                if (lVar.k(i2, null, f.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (l2 instanceof b1) {
            lVar.n(i2, null);
            if (bVar.F(l2, obj)) {
                lVar.o(i2, f.i);
                return 0;
            }
            kotlinx.coroutines.internal.x xVar = f.k;
            if (lVar.f.getAndSet((i2 * 2) + 1, xVar) == xVar) {
                return 5;
            }
            lVar.m(i2, true);
            return 5;
        }
        return bVar.I(lVar, i2, obj, j2, obj2, z);
    }

    public static void v(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & SieveCacheKt.NodeVisitedBit) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & SieveCacheKt.NodeVisitedBit) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(long j2, l<E> lVar) {
        l<E> lVar2;
        l<E> lVar3;
        while (lVar.c < j2 && (lVar3 = (l) lVar.c()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.d() || (lVar2 = (l) lVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    kotlinx.coroutines.internal.u uVar = (kotlinx.coroutines.internal.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.c >= lVar.c) {
                        return;
                    }
                    if (!lVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (lVar.f()) {
                                lVar.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                        return;
                    }
                    return;
                }
            }
            lVar = lVar2;
        }
    }

    public final Object B(E e2, Continuation<? super Unit> continuation) {
        C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(continuation));
        c1100n.r();
        Throwable t = t();
        Result.Companion companion = Result.INSTANCE;
        c1100n.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(t)));
        Object q = c1100n.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(l lVar, int i2, long j2, ContinuationImpl continuationImpl) {
        d dVar;
        int i3;
        k kVar;
        l<E> lVar2;
        if (continuationImpl instanceof d) {
            dVar = (d) continuationImpl;
            int i4 = dVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.c = i4 - Integer.MIN_VALUE;
                Object obj = dVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = dVar.c;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    dVar.c = 1;
                    C1100n a2 = C1104p.a(IntrinsicsKt.intercepted(dVar));
                    try {
                        Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                        u uVar = new u(a2);
                        Object H = H(lVar, i2, j2, uVar);
                        if (H == f.m) {
                            uVar.a(lVar, i2);
                        } else {
                            if (H == f.o) {
                                if (j2 < u()) {
                                    lVar.a();
                                }
                                l<E> lVar3 = (l) i.get(this);
                                while (true) {
                                    if (x()) {
                                        Result.Companion companion = Result.INSTANCE;
                                        k.b bVar = k.Companion;
                                        Throwable r = r();
                                        bVar.getClass();
                                        a2.resumeWith(Result.m1716constructorimpl(new k(new k.a(r))));
                                        break;
                                    }
                                    long andIncrement = c.getAndIncrement(this);
                                    long j3 = f.b;
                                    long j4 = andIncrement / j3;
                                    int i5 = (int) (andIncrement % j3);
                                    if (lVar3.c != j4) {
                                        lVar2 = q(j4, lVar3);
                                        if (lVar2 == null) {
                                        }
                                    } else {
                                        lVar2 = lVar3;
                                    }
                                    Object H2 = H(lVar2, i5, andIncrement, uVar);
                                    if (H2 == f.m) {
                                        uVar.a(lVar2, i5);
                                        break;
                                    }
                                    if (H2 == f.o) {
                                        if (andIncrement < u()) {
                                            lVar2.a();
                                        }
                                        lVar3 = lVar2;
                                    } else {
                                        if (H2 == f.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar2.a();
                                        k.Companion.getClass();
                                        kVar = new k(H2);
                                    }
                                }
                            } else {
                                lVar.a();
                                k.Companion.getClass();
                                kVar = new k(H);
                            }
                            a2.f(kVar, null);
                        }
                        obj = a2.q();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(dVar);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        a2.y();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((k) obj).a;
            }
        }
        dVar = new d(this, continuationImpl);
        Object obj2 = dVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = dVar.c;
        if (i3 != 0) {
        }
        return ((k) obj2).a;
    }

    public final void E(b1 b1Var, boolean z) {
        if (b1Var instanceof C0154b) {
            ((C0154b) b1Var).getClass();
            Result.Companion companion = Result.INSTANCE;
            Result.m1716constructorimpl(Boolean.FALSE);
            throw null;
        }
        if (b1Var instanceof InterfaceC1096l) {
            Continuation continuation = (Continuation) b1Var;
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(z ? s() : t())));
            return;
        }
        if (b1Var instanceof u) {
            C1100n<k<? extends E>> c1100n = ((u) b1Var).a;
            Result.Companion companion3 = Result.INSTANCE;
            k.b bVar = k.Companion;
            Throwable r = r();
            bVar.getClass();
            c1100n.resumeWith(Result.m1716constructorimpl(new k(new k.a(r))));
            return;
        }
        if (!(b1Var instanceof a)) {
            if (b1Var instanceof kotlinx.coroutines.selects.f) {
                ((kotlinx.coroutines.selects.f) b1Var).e(this, f.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + b1Var).toString());
            }
        }
        a aVar = (a) b1Var;
        C1100n<? super Boolean> c1100n2 = aVar.b;
        Intrinsics.checkNotNull(c1100n2);
        aVar.b = null;
        aVar.a = f.l;
        Throwable r2 = b.this.r();
        if (r2 == null) {
            Result.Companion companion4 = Result.INSTANCE;
            c1100n2.resumeWith(Result.m1716constructorimpl(Boolean.FALSE));
        } else {
            Result.Companion companion5 = Result.INSTANCE;
            c1100n2.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(r2)));
        }
    }

    public final boolean F(Object obj, E e2) {
        if (obj instanceof kotlinx.coroutines.selects.f) {
            return ((kotlinx.coroutines.selects.f) obj).e(this, e2);
        }
        if (obj instanceof u) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C1100n<k<? extends E>> c1100n = ((u) obj).a;
            k.Companion.getClass();
            return f.a(c1100n, new k(e2), null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC1096l) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return f.a((InterfaceC1096l) obj, e2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C1100n<? super Boolean> c1100n2 = aVar.b;
        Intrinsics.checkNotNull(c1100n2);
        aVar.b = null;
        aVar.a = e2;
        Boolean bool = Boolean.TRUE;
        b.this.getClass();
        return f.a(c1100n2, bool, null);
    }

    public final boolean G(Object obj, l<E> lVar, int i2) {
        kotlinx.coroutines.selects.h hVar;
        if (obj instanceof InterfaceC1096l) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.a((InterfaceC1096l) obj, Unit.INSTANCE, null);
        }
        if (!(obj instanceof kotlinx.coroutines.selects.f)) {
            if (obj instanceof C0154b) {
                ((C0154b) obj).getClass();
                f.a(null, Boolean.TRUE, null);
                throw null;
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        Unit unit = Unit.INSTANCE;
        int f2 = ((kotlinx.coroutines.selects.e) obj).f(this);
        if (f2 == 0) {
            hVar = kotlinx.coroutines.selects.h.a;
        } else if (f2 == 1) {
            hVar = kotlinx.coroutines.selects.h.b;
        } else if (f2 == 2) {
            hVar = kotlinx.coroutines.selects.h.c;
        } else {
            if (f2 != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + f2).toString());
            }
            hVar = kotlinx.coroutines.selects.h.d;
        }
        if (hVar == kotlinx.coroutines.selects.h.b) {
            lVar.n(i2, null);
        }
        return hVar == kotlinx.coroutines.selects.h.a;
    }

    public final Object H(l<E> lVar, int i2, long j2, Object obj) {
        Object l2 = lVar.l(i2);
        AtomicReferenceArray atomicReferenceArray = lVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (l2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.n;
                }
                if (lVar.k(i2, l2, obj)) {
                    p();
                    return f.m;
                }
            }
        } else if (l2 == f.d && lVar.k(i2, l2, f.i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            lVar.n(i2, null);
            return obj2;
        }
        while (true) {
            Object l3 = lVar.l(i2);
            if (l3 == null || l3 == f.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (lVar.k(i2, l3, f.h)) {
                        p();
                        return f.o;
                    }
                } else {
                    if (obj == null) {
                        return f.n;
                    }
                    if (lVar.k(i2, l3, obj)) {
                        p();
                        return f.m;
                    }
                }
            } else if (l3 != f.d) {
                kotlinx.coroutines.internal.x xVar = f.j;
                if (l3 == xVar) {
                    return f.o;
                }
                if (l3 == f.h) {
                    return f.o;
                }
                if (l3 == f.l) {
                    p();
                    return f.o;
                }
                if (l3 != f.g && lVar.k(i2, l3, f.f)) {
                    boolean z = l3 instanceof x;
                    if (z) {
                        l3 = ((x) l3).a;
                    }
                    if (G(l3, lVar, i2)) {
                        lVar.o(i2, f.i);
                        p();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        lVar.n(i2, null);
                        return obj3;
                    }
                    lVar.o(i2, xVar);
                    lVar.i();
                    if (z) {
                        p();
                    }
                    return f.o;
                }
            } else if (lVar.k(i2, l3, f.i)) {
                p();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                lVar.n(i2, null);
                return obj4;
            }
        }
    }

    public final int I(l<E> lVar, int i2, E e2, long j2, Object obj, boolean z) {
        while (true) {
            Object l2 = lVar.l(i2);
            if (l2 == null) {
                if (!l(j2) || z) {
                    if (z) {
                        if (lVar.k(i2, null, f.j)) {
                            lVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (lVar.k(i2, null, obj)) {
                            return 2;
                        }
                    }
                } else if (lVar.k(i2, null, f.d)) {
                    break;
                }
            } else {
                if (l2 != f.e) {
                    kotlinx.coroutines.internal.x xVar = f.k;
                    if (l2 == xVar) {
                        lVar.n(i2, null);
                        return 5;
                    }
                    if (l2 == f.h) {
                        lVar.n(i2, null);
                        return 5;
                    }
                    if (l2 == f.l) {
                        lVar.n(i2, null);
                        j();
                        return 4;
                    }
                    lVar.n(i2, null);
                    if (l2 instanceof x) {
                        l2 = ((x) l2).a;
                    }
                    if (F(l2, e2)) {
                        lVar.o(i2, f.i);
                        return 0;
                    }
                    if (lVar.f.getAndSet((i2 * 2) + 1, xVar) != xVar) {
                        lVar.m(i2, true);
                    }
                    return 5;
                }
                if (lVar.k(i2, l2, f.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b<E> bVar = this;
        if (bVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(bVar) > j2) {
                break;
            } else {
                bVar = this;
            }
        }
        int i2 = f.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(bVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j3 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j4, (j4 & 4611686018427387903L) + SieveCacheKt.NodeVisitedBit)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(bVar);
                    long j6 = atomicLongFieldUpdater2.get(bVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & SieveCacheKt.NodeVisitedBit) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (z) {
                        bVar = this;
                    } else {
                        bVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bVar, j6, SieveCacheKt.NodeVisitedBit + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.v
    public final Object a(kotlinx.coroutines.flow.internal.n nVar) {
        return C(this, nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        r1 = kotlinx.coroutines.channels.k.Companion;
        r2 = kotlin.Unit.INSTANCE;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        return r2;
     */
    @Override // kotlinx.coroutines.channels.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(E e2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = w(atomicLongFieldUpdater.get(this), false) ? false : !l(r1 & 1152921504606846975L);
        k.c cVar = k.b;
        if (!z2) {
            Object obj = f.j;
            l lVar = (l) f.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j3 = andIncrement & j2;
                boolean w = w(andIncrement, z);
                int i2 = f.b;
                long j4 = i2;
                long j5 = j3 / j4;
                int i3 = (int) (j3 % j4);
                if (lVar.c != j5) {
                    l b2 = b(this, j5, lVar);
                    if (b2 != null) {
                        lVar = b2;
                    } else {
                        if (w) {
                            k.b bVar = k.Companion;
                            Throwable t = t();
                            bVar.getClass();
                            return new k.a(t);
                        }
                        z = false;
                        j2 = 1152921504606846975L;
                    }
                }
                int k2 = k(this, lVar, i3, e2, j3, obj, w);
                if (k2 == 0) {
                    lVar.a();
                    break;
                }
                if (k2 == 1) {
                    break;
                }
                if (k2 == 2) {
                    if (w) {
                        lVar.i();
                        k.b bVar2 = k.Companion;
                        Throwable t2 = t();
                        bVar2.getClass();
                        return new k.a(t2);
                    }
                    b1 b1Var = obj instanceof b1 ? (b1) obj : null;
                    if (b1Var != null) {
                        b1Var.a(lVar, i3 + i2);
                    }
                    lVar.i();
                    k.Companion.getClass();
                    return cVar;
                }
                if (k2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (k2 == 4) {
                    if (j3 < c.get(this)) {
                        lVar.a();
                    }
                    k.b bVar3 = k.Companion;
                    Throwable t3 = t();
                    bVar3.getClass();
                    return new k.a(t3);
                }
                if (k2 == 5) {
                    lVar.a();
                }
                z = false;
                j2 = 1152921504606846975L;
            }
        } else {
            k.Companion.getClass();
            return cVar;
        }
    }

    @Override // kotlinx.coroutines.channels.v
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m(cancellationException, true);
    }

    @Override // kotlinx.coroutines.channels.v
    public final Object d(ContinuationImpl continuationImpl) {
        l<E> lVar;
        Throwable th;
        l<E> lVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        l<E> lVar3 = (l) atomicReferenceFieldUpdater.get(this);
        while (!x()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = f.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (lVar3.c != j3) {
                l<E> q = q(j3, lVar3);
                if (q == null) {
                    continue;
                } else {
                    lVar = q;
                }
            } else {
                lVar = lVar3;
            }
            Object H = H(lVar, i2, andIncrement, null);
            kotlinx.coroutines.internal.x xVar = f.m;
            if (H == xVar) {
                throw new IllegalStateException("unexpected");
            }
            kotlinx.coroutines.internal.x xVar2 = f.o;
            if (H == xVar2) {
                if (andIncrement < u()) {
                    lVar.a();
                }
                lVar3 = lVar;
            } else {
                if (H != f.n) {
                    lVar.a();
                    return H;
                }
                C1100n a2 = C1104p.a(IntrinsicsKt.intercepted(continuationImpl));
                b<E> bVar = this;
                try {
                    Object H2 = bVar.H(lVar, i2, andIncrement, a2);
                    if (H2 == xVar) {
                        a2.a(lVar, i2);
                    } else if (H2 == xVar2) {
                        if (andIncrement < u()) {
                            lVar.a();
                        }
                        l<E> lVar4 = (l) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (x()) {
                                Result.Companion companion = Result.INSTANCE;
                                a2.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(s())));
                                break;
                            }
                            C1100n c1100n = a2;
                            try {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j4 = f.b;
                                long j5 = andIncrement2 / j4;
                                int i3 = (int) (andIncrement2 % j4);
                                if (lVar4.c != j5) {
                                    try {
                                        l<E> q2 = q(j5, lVar4);
                                        if (q2 == null) {
                                            a2 = c1100n;
                                        } else {
                                            lVar2 = q2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        a2 = c1100n;
                                        a2.y();
                                        throw th;
                                    }
                                } else {
                                    lVar2 = lVar4;
                                }
                                Object H3 = bVar.H(lVar2, i3, andIncrement2, c1100n);
                                l<E> lVar5 = lVar2;
                                a2 = c1100n;
                                if (H3 == f.m) {
                                    a2.a(lVar5, i3);
                                    break;
                                }
                                if (H3 == f.o) {
                                    if (andIncrement2 < u()) {
                                        lVar5.a();
                                    }
                                    bVar = this;
                                    lVar4 = lVar5;
                                } else {
                                    if (H3 == f.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    lVar5.a();
                                    a2.f(H3, null);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                a2 = c1100n;
                                th = th;
                                a2.y();
                                throw th;
                            }
                        }
                    } else {
                        lVar.a();
                        a2.f(H2, null);
                    }
                    Object q3 = a2.q();
                    if (q3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuationImpl);
                    }
                    return q3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable s = s();
        int i4 = kotlinx.coroutines.internal.w.a;
        throw s;
    }

    @Override // kotlinx.coroutines.channels.v
    public final Object e() {
        l<E> lVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = b.get(this);
        if (w(j3, true)) {
            k.b bVar = k.Companion;
            Throwable r = r();
            bVar.getClass();
            return new k.a(r);
        }
        long j4 = j3 & 1152921504606846975L;
        k.c cVar = k.b;
        if (j2 >= j4) {
            k.Companion.getClass();
            return cVar;
        }
        Object obj = f.k;
        l<E> lVar2 = (l) i.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = f.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (lVar2.c != j6) {
                l<E> q = q(j6, lVar2);
                if (q == null) {
                    continue;
                } else {
                    lVar = q;
                }
            } else {
                lVar = lVar2;
            }
            Object H = H(lVar, i2, andIncrement, obj);
            l<E> lVar3 = lVar;
            if (H == f.m) {
                b1 b1Var = obj instanceof b1 ? (b1) obj : null;
                if (b1Var != null) {
                    b1Var.a(lVar3, i2);
                }
                J(andIncrement);
                lVar3.i();
                k.Companion.getClass();
                return cVar;
            }
            if (H != f.o) {
                if (H == f.n) {
                    throw new IllegalStateException("unexpected");
                }
                lVar3.a();
                k.Companion.getClass();
                return H;
            }
            if (andIncrement < u()) {
                lVar3.a();
            }
            lVar2 = lVar3;
        }
        k.b bVar2 = k.Companion;
        Throwable r2 = r();
        bVar2.getClass();
        return new k.a(r2);
    }

    @Override // kotlinx.coroutines.channels.w
    public final boolean g(Throwable th) {
        return m(th, false);
    }

    @Override // kotlinx.coroutines.channels.w
    public final void h(r.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlinx.coroutines.internal.x xVar = f.q;
            if (obj != xVar) {
                if (obj == f.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            kotlinx.coroutines.internal.x xVar2 = f.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, xVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                    break;
                }
            }
            bVar.invoke(r());
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c4, code lost:
    
        f(r1, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ba, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c A[RETURN] */
    @Override // kotlinx.coroutines.channels.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(E e2, Continuation<? super Unit> continuation) {
        int k2;
        Object m1716constructorimpl;
        Object q;
        E e3;
        b<E> bVar;
        l lVar;
        int i2;
        int i3;
        boolean z;
        b<E> bVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        l lVar2 = (l) atomicReferenceFieldUpdater.get(bVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
            long j2 = andIncrement & 1152921504606846975L;
            boolean w = bVar2.w(andIncrement, false);
            int i4 = f.b;
            long j3 = i4;
            long j4 = j2 / j3;
            int i5 = (int) (j2 % j3);
            if (lVar2.c != j4) {
                l b2 = b(bVar2, j4, lVar2);
                if (b2 != null) {
                    lVar2 = b2;
                } else if (w) {
                    Object B = B(e2, continuation);
                    if (B == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return B;
                    }
                }
            }
            int k3 = k(bVar2, lVar2, i5, e2, j2, null, w);
            if (k3 == 0) {
                lVar2.a();
                break;
            }
            if (k3 == 1) {
                break;
            }
            if (k3 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
                if (k3 == 3) {
                    C1100n a2 = C1104p.a(IntrinsicsKt.intercepted(continuation));
                    E e4 = e2;
                    try {
                        k2 = k(bVar2, lVar2, i5, e4, j2, a2, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (k2 == 0) {
                            lVar2.a();
                            Result.Companion companion = Result.INSTANCE;
                            m1716constructorimpl = Result.m1716constructorimpl(Unit.INSTANCE);
                        } else if (k2 != 1) {
                            if (k2 != 2) {
                                if (k2 != 4) {
                                    String str = "unexpected";
                                    if (k2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    lVar2.a();
                                    l lVar3 = (l) atomicReferenceFieldUpdater.get(bVar2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bVar2);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean w2 = bVar2.w(andIncrement2, false);
                                        int i6 = f.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j6 = i6;
                                        String str2 = str;
                                        long j7 = j5 / j6;
                                        int i7 = (int) (j5 % j6);
                                        if (lVar3.c != j7) {
                                            l b3 = b(bVar2, j7, lVar3);
                                            if (b3 != null) {
                                                i2 = i6;
                                                i3 = i7;
                                                z = w2;
                                                lVar = b3;
                                            } else {
                                                if (w2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            lVar = lVar3;
                                            i2 = i6;
                                            i3 = i7;
                                            z = w2;
                                        }
                                        int k4 = k(bVar2, lVar, i3, e4, j5, a2, z);
                                        E e5 = e4;
                                        bVar = bVar2;
                                        l lVar4 = lVar;
                                        int i8 = i3;
                                        e3 = e5;
                                        if (k4 == 0) {
                                            lVar4.a();
                                            Result.Companion companion2 = Result.INSTANCE;
                                            m1716constructorimpl = Result.m1716constructorimpl(Unit.INSTANCE);
                                            break;
                                        }
                                        if (k4 == 1) {
                                            Result.Companion companion3 = Result.INSTANCE;
                                            m1716constructorimpl = Result.m1716constructorimpl(Unit.INSTANCE);
                                            break;
                                        }
                                        if (k4 != 2) {
                                            if (k4 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (k4 != 4) {
                                                if (k4 == 5) {
                                                    lVar4.a();
                                                }
                                                lVar3 = lVar4;
                                                bVar2 = bVar;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                e4 = e3;
                                            } else if (j5 < atomicLongFieldUpdater2.get(bVar)) {
                                                lVar4.a();
                                            }
                                        } else if (z) {
                                            lVar4.i();
                                        } else {
                                            a2.a(lVar4, i8 + i2);
                                        }
                                    }
                                } else {
                                    e3 = e4;
                                    bVar = bVar2;
                                    if (j2 < atomicLongFieldUpdater2.get(bVar)) {
                                        lVar2.a();
                                    }
                                }
                                f(bVar, e3, a2);
                            } else {
                                a2.a(lVar2, i5 + i4);
                            }
                            q = a2.q();
                            if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(continuation);
                            }
                            if (q != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                q = Unit.INSTANCE;
                            }
                            if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return q;
                            }
                        } else {
                            Result.Companion companion4 = Result.INSTANCE;
                            m1716constructorimpl = Result.m1716constructorimpl(Unit.INSTANCE);
                        }
                        a2.resumeWith(m1716constructorimpl);
                        q = a2.q();
                        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        }
                        if (q != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        }
                        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a2.y();
                        throw th;
                    }
                } else if (k3 == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(bVar2)) {
                        lVar2.a();
                    }
                    Object B2 = B(e2, continuation);
                    if (B2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return B2;
                    }
                } else if (k3 == 5) {
                    lVar2.a();
                }
            } else if (w) {
                lVar2.i();
                Object B3 = B(e2, continuation);
                if (B3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return B3;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.v
    public final i<E> iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.w
    public final boolean j() {
        return w(b.get(this), false);
    }

    public final boolean l(long j2) {
        return j2 < d.get(this) || j2 < c.get(this) + ((long) this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Throwable th, boolean z) {
        b<E> bVar;
        kotlinx.coroutines.internal.x xVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (z) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) == 0) {
                    l<Object> lVar = f.a;
                    bVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j6, (j6 & 1152921504606846975L) + (1 << 60)));
            xVar = f.s;
            while (true) {
                atomicReferenceFieldUpdater = k;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, th)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                    z2 = false;
                    break;
                }
            }
            if (z) {
                do {
                    j2 = atomicLongFieldUpdater.get(this);
                    int i2 = (int) (j2 >> 60);
                    if (i2 == 0) {
                        j3 = j2 & 1152921504606846975L;
                        j4 = 2;
                    } else {
                        if (i2 != 1) {
                            break;
                        }
                        j3 = j2 & 1152921504606846975L;
                        j4 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j2, (j4 << 60) + j3));
            } else {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j5, (3 << 60) + (j5 & 1152921504606846975L)));
            }
            j();
            if (z2) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    kotlinx.coroutines.internal.x xVar2 = obj == null ? f.q : f.r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, xVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    ((Function1) obj).invoke(r());
                    return z2;
                }
            }
            return z2;
        }
        bVar = this;
        xVar = f.s;
        while (true) {
            atomicReferenceFieldUpdater = k;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, th)) {
            }
        }
        if (z) {
        }
        j();
        if (z2) {
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (kotlinx.coroutines.channels.l) ((kotlinx.coroutines.internal.AbstractC1085b) kotlinx.coroutines.internal.AbstractC1085b.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l<E> n(long j2) {
        Object obj;
        long j3;
        Object obj2 = j.get(this);
        l lVar = (l) f.get(this);
        if (lVar.c > ((l) obj2).c) {
            obj2 = lVar;
        }
        l lVar2 = (l) i.get(this);
        if (lVar2.c > ((l) obj2).c) {
            obj2 = lVar2;
        }
        AbstractC1085b abstractC1085b = (AbstractC1085b) obj2;
        loop0: while (true) {
            abstractC1085b.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC1085b.a;
            Object obj3 = atomicReferenceFieldUpdater.get(abstractC1085b);
            obj = null;
            kotlinx.coroutines.internal.x xVar = C1084a.a;
            if (obj3 == xVar) {
                break;
            }
            AbstractC1085b abstractC1085b2 = (AbstractC1085b) obj3;
            if (abstractC1085b2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1085b, null, xVar)) {
                    if (atomicReferenceFieldUpdater.get(abstractC1085b) != null) {
                        break;
                    }
                }
                break loop0;
            }
            abstractC1085b = abstractC1085b2;
        }
        l<E> lVar3 = (l) abstractC1085b;
        if (y()) {
            l<E> lVar4 = lVar3;
            loop2: do {
                int i2 = f.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (lVar4.c * f.b) + i2;
                    if (j3 < c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l2 = lVar4.l(i2);
                        if (l2 != null && l2 != f.e) {
                            if (l2 == f.d) {
                                break loop2;
                            }
                        } else {
                            if (lVar4.k(i2, l2, f.l)) {
                                lVar4.i();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (lVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                o(j3);
            }
        }
        loop5: for (l<E> lVar5 = lVar3; lVar5 != null; lVar5 = (l) ((AbstractC1085b) AbstractC1085b.b.get(lVar5))) {
            for (int i3 = f.b - 1; -1 < i3; i3--) {
                if ((lVar5.c * f.b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object l3 = lVar5.l(i3);
                    if (l3 != null && l3 != f.e) {
                        if (!(l3 instanceof x)) {
                            if (!(l3 instanceof b1)) {
                                break;
                            }
                            if (lVar5.k(i3, l3, f.l)) {
                                obj = C1091h.a(obj, l3);
                                lVar5.m(i3, true);
                                break;
                            }
                        } else {
                            if (lVar5.k(i3, l3, f.l)) {
                                obj = C1091h.a(obj, ((x) l3).a);
                                lVar5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar5.k(i3, l3, f.l)) {
                            lVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                E((b1) obj, true);
                return lVar3;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                E((b1) arrayList.get(size), true);
            }
        }
        return lVar3;
    }

    public final void o(long j2) {
        l<E> lVar = (l) i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.a + j3, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = f.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (lVar.c != j5) {
                    l<E> q = q(j5, lVar);
                    if (q != null) {
                        lVar = q;
                    }
                }
                l<E> lVar2 = lVar;
                if (H(lVar2, i2, j3, null) != f.o) {
                    lVar2.a();
                } else if (j3 < u()) {
                    lVar2.a();
                }
                lVar = lVar2;
            }
        }
    }

    public final void p() {
        Object a2;
        if (z()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        l<E> lVar = (l) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / f.b;
            if (u() <= andIncrement) {
                if (lVar.c < j2 && lVar.c() != 0) {
                    A(j2, lVar);
                }
                v(this);
                return;
            }
            if (lVar.c != j2) {
                e eVar = e.a;
                while (true) {
                    a2 = C1084a.a(lVar, j2, eVar);
                    if (!kotlinx.coroutines.internal.v.b(a2)) {
                        kotlinx.coroutines.internal.u a3 = kotlinx.coroutines.internal.v.a(a2);
                        while (true) {
                            kotlinx.coroutines.internal.u uVar = (kotlinx.coroutines.internal.u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.c >= a3.c) {
                                break;
                            }
                            if (!a3.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, a3)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (a3.f()) {
                                        a3.e();
                                    }
                                }
                            }
                            if (uVar.f()) {
                                uVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                l<E> lVar2 = null;
                if (kotlinx.coroutines.internal.v.b(a2)) {
                    j();
                    A(j2, lVar);
                    v(this);
                } else {
                    l<E> lVar3 = (l) kotlinx.coroutines.internal.v.a(a2);
                    long j3 = lVar3.c;
                    if (j3 > j2) {
                        long j4 = f.b;
                        if (d.compareAndSet(this, 1 + andIncrement, j3 * j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, (j3 * j4) - andIncrement) & SieveCacheKt.NodeVisitedBit) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & SieveCacheKt.NodeVisitedBit) != 0) {
                                }
                            }
                        } else {
                            v(this);
                        }
                    } else {
                        lVar2 = lVar3;
                    }
                }
                if (lVar2 == null) {
                    continue;
                } else {
                    lVar = lVar2;
                }
            }
            int i2 = (int) (andIncrement % f.b);
            Object l2 = lVar.l(i2);
            boolean z = l2 instanceof b1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !lVar.k(i2, l2, f.g)) {
                while (true) {
                    Object l3 = lVar.l(i2);
                    if (!(l3 instanceof b1)) {
                        if (l3 != f.j) {
                            if (l3 != null) {
                                if (l3 == f.d || l3 == f.h || l3 == f.i || l3 == f.k || l3 == f.l) {
                                    break loop0;
                                }
                                if (l3 != f.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + l3).toString());
                                }
                            } else if (lVar.k(i2, l3, f.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (lVar.k(i2, l3, new x((b1) l3))) {
                            break loop0;
                        }
                    } else if (lVar.k(i2, l3, f.g)) {
                        if (G(l3, lVar, i2)) {
                            lVar.o(i2, f.d);
                            break;
                        } else {
                            lVar.o(i2, f.j);
                            lVar.i();
                        }
                    }
                }
            } else if (G(l2, lVar, i2)) {
                lVar.o(i2, f.d);
                break;
            } else {
                lVar.o(i2, f.j);
                lVar.i();
                v(this);
            }
        }
        v(this);
    }

    public final l<E> q(long j2, l<E> lVar) {
        Object a2;
        long j3;
        l<Object> lVar2 = f.a;
        e eVar = e.a;
        loop0: while (true) {
            a2 = C1084a.a(lVar, j2, eVar);
            if (!kotlinx.coroutines.internal.v.b(a2)) {
                kotlinx.coroutines.internal.u a3 = kotlinx.coroutines.internal.v.a(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    kotlinx.coroutines.internal.u uVar = (kotlinx.coroutines.internal.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.c >= a3.c) {
                        break loop0;
                    }
                    if (!a3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, a3)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (a3.f()) {
                                a3.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.v.b(a2)) {
            j();
            if (lVar.c * f.b < u()) {
                lVar.a();
                return null;
            }
        } else {
            l<E> lVar3 = (l) kotlinx.coroutines.internal.v.a(a2);
            long j4 = lVar3.c;
            if (!z() && j2 <= d.get(this) / f.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                    kotlinx.coroutines.internal.u uVar2 = (kotlinx.coroutines.internal.u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.c >= j4 || !lVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, lVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (lVar3.f()) {
                                lVar3.e();
                            }
                        }
                    }
                    if (uVar2.f()) {
                        uVar2.e();
                    }
                }
            }
            if (j4 <= j2) {
                return lVar3;
            }
            long j5 = j4 * f.b;
            do {
                j3 = c.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!c.compareAndSet(this, j3, j5));
            if (j4 * f.b < u()) {
                lVar3.a();
            }
        }
        return null;
    }

    public final Throwable r() {
        return (Throwable) k.get(this);
    }

    public final Throwable s() {
        Throwable r = r();
        return r == null ? new o("Channel was closed") : r;
    }

    public final Throwable t() {
        Throwable r = r();
        return r == null ? new p("Channel was closed") : r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01bf, code lost:
    
        r16 = r7;
        r3 = (kotlinx.coroutines.channels.l) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c8, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        char last;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (b.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z2 = true;
        List listOf = CollectionsKt.listOf((Object[]) new l[]{i.get(this), f.get(this), j.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (((l) obj) != f.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((l) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((l) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        l lVar = (l) next;
        long j4 = c.get(this);
        long u = u();
        loop2: while (true) {
            int i4 = f.b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (lVar.c * f.b) + i5;
                if (j5 >= u && j5 >= j4) {
                    break loop2;
                }
                Object l2 = lVar.l(i5);
                boolean z3 = z2;
                Object obj2 = lVar.f.get(i5 * 2);
                if (l2 instanceof InterfaceC1096l) {
                    str = (j5 >= j4 || j5 < u) ? (j5 >= u || j5 < j4) ? "cont" : "send" : "receive";
                } else if (l2 instanceof kotlinx.coroutines.selects.f) {
                    str = (j5 >= j4 || j5 < u) ? (j5 >= u || j5 < j4) ? "select" : "onSend" : "onReceive";
                } else if (l2 instanceof u) {
                    str = "receiveCatching";
                } else if (l2 instanceof C0154b) {
                    str = "sendBroadcast";
                } else if (l2 instanceof x) {
                    str = "EB(" + l2 + ')';
                } else if (Intrinsics.areEqual(l2, f.f) || Intrinsics.areEqual(l2, f.g)) {
                    str = "resuming_sender";
                } else {
                    if (l2 != null && !Intrinsics.areEqual(l2, f.e) && !Intrinsics.areEqual(l2, f.i) && !Intrinsics.areEqual(l2, f.h) && !Intrinsics.areEqual(l2, f.k) && !Intrinsics.areEqual(l2, f.j) && !Intrinsics.areEqual(l2, f.l)) {
                        str = l2.toString();
                    }
                    i5++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i5++;
                z2 = z3;
            }
            z2 = z;
            i3 = 0;
        }
        last = StringsKt___StringsKt.last(sb);
        if (last == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final long u() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0167, code lost:
    
        kotlinx.coroutines.channels.b.c.compareAndSet(r13, r7, r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (kotlinx.coroutines.channels.l) ((kotlinx.coroutines.internal.AbstractC1085b) kotlinx.coroutines.internal.AbstractC1085b.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (i2 == 2) {
                n(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                        l<E> lVar = (l) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (u() <= j3) {
                            break;
                        }
                        long j4 = f.b;
                        long j5 = j3 / j4;
                        if (lVar.c != j5 && (lVar = q(j5, lVar)) == null) {
                            if (((l) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            lVar.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object l2 = lVar.l(i3);
                                if (l2 == null || l2 == f.e) {
                                    if (lVar.k(i3, l2, f.h)) {
                                        p();
                                        break;
                                    }
                                } else {
                                    if (l2 == f.d) {
                                        break;
                                    }
                                    if (l2 != f.j) {
                                        if (l2 != f.l) {
                                            if (l2 != f.i) {
                                                if (l2 != f.h) {
                                                    if (l2 == f.g) {
                                                        break;
                                                    }
                                                    if (l2 != f.f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(android.support.v4.media.a.a(i2, "unexpected close status: ").toString());
                }
                l<E> n = n(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i4 = f.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (n.c * f.b) + i4;
                        while (true) {
                            Object l3 = n.l(i4);
                            if (l3 == f.i) {
                                break loop0;
                            }
                            if (l3 == f.d) {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (n.k(i4, l3, f.l)) {
                                    n.n(i4, null);
                                    n.i();
                                    break;
                                }
                            } else if (l3 != f.e && l3 != null) {
                                if (!(l3 instanceof b1) && !(l3 instanceof x)) {
                                    kotlinx.coroutines.internal.x xVar = f.g;
                                    if (l3 == xVar || l3 == f.f) {
                                        break loop0;
                                    }
                                    if (l3 != xVar) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    b1 b1Var = l3 instanceof x ? ((x) l3).a : (b1) l3;
                                    if (n.k(i4, l3, f.l)) {
                                        obj = C1091h.a(obj, b1Var);
                                        n.n(i4, null);
                                        n.i();
                                        break;
                                    }
                                }
                            } else if (n.k(i4, l3, f.l)) {
                                n.i();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (n != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            E((b1) arrayList.get(size), false);
                        }
                    } else {
                        E((b1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean x() {
        return w(b.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j2 = d.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }
}
