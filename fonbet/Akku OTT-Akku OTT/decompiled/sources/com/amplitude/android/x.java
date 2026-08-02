package com.amplitude.android;

import com.amplitude.android.m;
import com.amplitude.core.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.k;

@SourceDebugExtension({"SMAP\nTimeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeline.kt\ncom/amplitude/android/Timeline\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
/* loaded from: classes3.dex */
public final class x extends com.amplitude.core.platform.m {
    public final Long c;
    public final kotlinx.coroutines.channels.b d;
    public final AtomicLong e;
    public final AtomicBoolean f;
    public long g;
    public long h;

    public x() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r7.g((java.util.List) r9, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r7.h(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        if (r7.i(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(x xVar, m mVar, ContinuationImpl continuationImpl) {
        t tVar;
        int i;
        xVar.getClass();
        if (continuationImpl instanceof t) {
            tVar = (t) continuationImpl;
            int i2 = tVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.d = i2 - Integer.MIN_VALUE;
                Object obj = tVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (mVar instanceof m.a) {
                        long j = ((m.a) mVar).a;
                        tVar.a = xVar;
                        tVar.d = 1;
                        obj = xVar.l(j, tVar);
                    } else if (mVar instanceof m.b) {
                        com.amplitude.core.events.a aVar = ((m.b) mVar).a;
                        tVar.d = 3;
                    } else {
                        if (!(mVar instanceof m.c)) {
                            return Unit.INSTANCE;
                        }
                        xVar.f.set(false);
                        long j2 = ((m.c) mVar).a;
                        tVar.d = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                xVar = tVar.a;
                ResultKt.throwOnFailure(obj);
                xVar.f.set(true);
                tVar.a = null;
                tVar.d = 2;
            }
        }
        tVar = new t(xVar, continuationImpl);
        Object obj2 = tVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tVar.d;
        if (i != 0) {
        }
    }

    public static final long f(x xVar, com.amplitude.core.k kVar, k.a aVar, long j) {
        Long longOrNull;
        xVar.getClass();
        String f = kVar.f(aVar);
        return (f == null || (longOrNull = StringsKt.toLongOrNull(f)) == null) ? j : longOrNull.longValue();
    }

    @Override // com.amplitude.core.platform.m
    public final void d(com.amplitude.core.events.a incomingEvent) {
        Intrinsics.checkNotNullParameter(incomingEvent, "incomingEvent");
        if (incomingEvent.c == null) {
            incomingEvent.c = Long.valueOf(System.currentTimeMillis());
        }
        if (this.d.c(new m.b(incomingEvent)) instanceof k.c) {
            c().i().b("Failed to enqueue event: " + incomingEvent.a() + ". Channel is closed or full.");
        }
    }

    public final Object g(List list, ContinuationImpl continuationImpl) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        long j = this.g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.amplitude.core.events.a aVar = (com.amplitude.core.events.a) it.next();
            Long l = aVar.e;
            if (l == null) {
                l = Boxing.boxLong(this.e.get());
            }
            aVar.e = l;
            Long l2 = aVar.d;
            if (l2 == null) {
                long j2 = this.g + 1;
                this.g = j2;
                l2 = Boxing.boxLong(j2);
            }
            aVar.d = l2;
            super.d(aVar);
        }
        if (this.g <= j) {
            return Unit.INSTANCE;
        }
        Unit d = c().j().d(k.a.b, String.valueOf(this.g));
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (r2.g((java.util.List) r12, r0) != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        if (r2.g(r11, r0) != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r2.i(r4, r0) != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(com.amplitude.core.events.a aVar, ContinuationImpl continuationImpl) {
        s sVar;
        int i;
        x xVar;
        long j;
        if (continuationImpl instanceof s) {
            sVar = (s) continuationImpl;
            int i2 = sVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.f = i2 - Integer.MIN_VALUE;
                Object obj = sVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Long l = aVar.c;
                    long longValue = l != null ? l.longValue() : System.currentTimeMillis();
                    String a = aVar.a();
                    if (Intrinsics.areEqual(a, "session_start")) {
                        Long l2 = aVar.e;
                        long longValue2 = l2 != null ? l2.longValue() : longValue;
                        sVar.a = this;
                        sVar.b = aVar;
                        sVar.c = longValue;
                        sVar.f = 1;
                        if (j(longValue2, sVar) != coroutine_suspended) {
                            xVar = this;
                            j = longValue;
                            sVar.a = xVar;
                            sVar.b = aVar;
                            sVar.f = 2;
                        }
                    } else if (Intrinsics.areEqual(a, "session_end")) {
                        xVar = this;
                        List listOf = CollectionsKt.listOf(aVar);
                        sVar.a = null;
                        sVar.b = null;
                        sVar.f = 5;
                    } else {
                        sVar.a = this;
                        sVar.b = aVar;
                        sVar.f = 3;
                        obj = l(longValue, sVar);
                        if (obj != coroutine_suspended) {
                            xVar = this;
                            sVar.a = xVar;
                            sVar.b = aVar;
                            sVar.f = 4;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            aVar = sVar.b;
                            xVar = sVar.a;
                            ResultKt.throwOnFailure(obj);
                            sVar.a = xVar;
                            sVar.b = aVar;
                            sVar.f = 4;
                        } else if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                    }
                    aVar = sVar.b;
                    xVar = sVar.a;
                    ResultKt.throwOnFailure(obj);
                    List listOf2 = CollectionsKt.listOf(aVar);
                    sVar.a = null;
                    sVar.b = null;
                    sVar.f = 5;
                } else {
                    j = sVar.c;
                    aVar = sVar.b;
                    xVar = sVar.a;
                    ResultKt.throwOnFailure(obj);
                    sVar.a = xVar;
                    sVar.b = aVar;
                    sVar.f = 2;
                }
                return Unit.INSTANCE;
            }
        }
        sVar = new s(this, continuationImpl);
        Object obj2 = sVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sVar.f;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public final Object i(long j, ContinuationImpl continuationImpl) {
        if (this.e.get() <= -1) {
            return Unit.INSTANCE;
        }
        this.h = j;
        Unit d = c().j().d(k.a.d, String.valueOf(this.h));
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }

    public final Object j(long j, ContinuationImpl continuationImpl) {
        AtomicLong atomicLong = this.e;
        atomicLong.set(j);
        Unit d = c().j().d(k.a.c, String.valueOf(atomicLong.get()));
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, ContinuationImpl continuationImpl) {
        v vVar;
        Object coroutine_suspended;
        int i;
        ArrayList arrayList;
        boolean contains;
        x xVar;
        boolean z;
        long j2;
        List list;
        x xVar2;
        long j3 = j;
        if (continuationImpl instanceof v) {
            vVar = (v) continuationImpl;
            int i2 = vVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.i = i2 - Integer.MIN_VALUE;
                Object obj = vVar.e;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = vVar.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    h hVar = c().a;
                    Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
                    contains = hVar.D.contains(f.c);
                    if (contains) {
                        AtomicLong atomicLong = this.e;
                        if (atomicLong.get() > -1) {
                            com.amplitude.core.events.a aVar = new com.amplitude.core.events.a();
                            Intrinsics.checkNotNullParameter("session_end", "<set-?>");
                            aVar.O = "session_end";
                            Long boxLong = Boxing.boxLong(this.h);
                            boxLong.getClass();
                            if (this.h <= 0) {
                                boxLong = null;
                            }
                            aVar.c = boxLong;
                            aVar.e = Boxing.boxLong(atomicLong.get());
                            arrayList.add(aVar);
                        }
                    }
                    vVar.a = this;
                    vVar.b = arrayList;
                    vVar.c = j3;
                    vVar.d = contains;
                    vVar.i = 1;
                    if (j(j3, vVar) != coroutine_suspended) {
                        xVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = vVar.d;
                    j2 = vVar.c;
                    list = vVar.b;
                    xVar2 = vVar.a;
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        com.amplitude.core.events.a aVar2 = new com.amplitude.core.events.a();
                        Intrinsics.checkNotNullParameter("session_start", "<set-?>");
                        aVar2.O = "session_start";
                        aVar2.c = Boxing.boxLong(j2);
                        aVar2.e = Boxing.boxLong(xVar2.e.get());
                        list.add(aVar2);
                    }
                    return list;
                }
                boolean z2 = vVar.d;
                long j4 = vVar.c;
                ?? r2 = vVar.b;
                x xVar3 = vVar.a;
                ResultKt.throwOnFailure(obj);
                arrayList = r2;
                contains = z2;
                j3 = j4;
                xVar = xVar3;
                vVar.a = xVar;
                vVar.b = arrayList;
                vVar.c = j3;
                vVar.d = contains;
                vVar.i = 2;
                if (xVar.i(j3, vVar) != coroutine_suspended) {
                    long j5 = j3;
                    z = contains;
                    j2 = j5;
                    list = arrayList;
                    xVar2 = xVar;
                    if (z) {
                    }
                    return list;
                }
                return coroutine_suspended;
            }
        }
        vVar = new v(this, continuationImpl);
        Object obj2 = vVar.e;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = vVar.i;
        if (i != 0) {
        }
        vVar.a = xVar;
        vVar.b = arrayList;
        vVar.c = j3;
        vVar.d = contains;
        vVar.i = 2;
        if (xVar.i(j3, vVar) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if ((r10 - r9.h) < r12.u) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (i(r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j, ContinuationImpl continuationImpl) {
        w wVar;
        int i;
        if (continuationImpl instanceof w) {
            wVar = (w) continuationImpl;
            int i2 = wVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.c = i2 - Integer.MIN_VALUE;
                Object obj = wVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.e.get() > -1) {
                        if (!this.f.get()) {
                            h hVar = c().a;
                            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
                        }
                        wVar.c = 1;
                    }
                    wVar.c = 2;
                    Object k = k(j, wVar);
                    return k == coroutine_suspended ? coroutine_suspended : k;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                return CollectionsKt.emptyList();
            }
        }
        wVar = new w(this, continuationImpl);
        Object obj2 = wVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wVar.c;
        if (i != 0) {
        }
        return CollectionsKt.emptyList();
    }

    public x(Long l) {
        this.c = l;
        this.d = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        this.e = new AtomicLong(l != null ? l.longValue() : -1L);
        this.f = new AtomicBoolean(false);
    }
}
