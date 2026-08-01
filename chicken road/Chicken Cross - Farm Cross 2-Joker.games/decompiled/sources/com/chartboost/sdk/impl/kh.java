package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.g7;
import com.chartboost.sdk.impl.qd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class kh implements qd.a {

    /* renamed from: a, reason: collision with root package name */
    public final mh f4844a;
    public final qd b;
    public final CoroutineDispatcher c;
    public final long d;
    public final int e;
    public final ai f;
    public final int g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentHashMap.KeySetView i;
    public final Set j;
    public final Mutex k;
    public Job l;
    public final CoroutineExceptionHandler m;
    public final CoroutineScope n;
    public final Object o;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4845a;

        static {
            int[] iArr = new int[di.values().length];
            try {
                iArr[di.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[di.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[di.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4845a = iArr;
        }
    }

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public int g;
        public /* synthetic */ Object h;
        public int j;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return kh.this.a((f7) null, this);
        }
    }

    public static final class c extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return kh.this.a(this);
        }
    }

    public static final class d extends LinkedHashMap {
        public d(int i) {
            super(i, 0.75f, false);
        }

        public /* bridge */ boolean a(String str) {
            return super.containsKey(str);
        }

        public /* bridge */ Set b() {
            return super.keySet();
        }

        public /* bridge */ int c() {
            return super.size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return a((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Boolean) {
                return a((Boolean) obj);
            }
            return false;
        }

        public /* bridge */ Collection d() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return a();
        }

        public /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (String) bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return b();
        }

        public /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > kh.this.g;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return d();
        }

        public /* bridge */ boolean a(Boolean bool) {
            return super.containsValue(bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        public /* bridge */ Set a() {
            return super.entrySet();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof Boolean)) {
                return a((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public /* bridge */ boolean a(String str, Boolean bool) {
            return super.remove(str, bool);
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public /* synthetic */ Object j;
        public int l;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return kh.this.a(null, null, null, null, null, this);
        }
    }

    public static final class f extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public f(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            mb.b("Uncaught telemetry coroutine error: " + th.getMessage(), th);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ kh c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kh khVar, Continuation continuation) {
                super(2, continuation);
                this.c = khVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    kh khVar = this.c;
                    this.b = 1;
                    if (khVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = kh.this.new g(continuation);
            gVar.c = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
            } catch (Exception e) {
                mb.b("Error during queue processing: " + e.getMessage(), (Throwable) null, 2, (Object) null);
            } finally {
                mb.a("Releasing lock.", (Throwable) null, 2, (Object) null);
                Mutex.DefaultImpls.unlock$default(kh.this.k, null, 1, null);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                if (!Mutex.DefaultImpls.tryLock$default(kh.this.k, null, 1, null)) {
                    mb.a("Already running, skipping new trigger.", (Throwable) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                if (!kh.this.b.b()) {
                    mb.a("Offline, skipping.", (Throwable) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                mb.a("Acquired lock, starting job.", (Throwable) null, 2, (Object) null);
                Job job = kh.this.l;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                kh khVar = kh.this;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(khVar, null), 3, null);
                khVar.l = launch$default;
                Job job2 = kh.this.l;
                if (job2 != null) {
                    this.b = 1;
                    if (job2.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            mb.a("Job finished.", (Throwable) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public kh(mh networkClient, qd networkStateChecker, CoroutineDispatcher dispatcher, long j, int i, ai trackerRepository, int i2) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(networkStateChecker, "networkStateChecker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(trackerRepository, "trackerRepository");
        this.f4844a = networkClient;
        this.b = networkStateChecker;
        this.c = dispatcher;
        this.d = j;
        this.e = i;
        this.f = trackerRepository;
        this.g = i2;
        this.h = new ConcurrentLinkedQueue();
        this.i = ConcurrentHashMap.newKeySet();
        Set synchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new d(i2)));
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.j = synchronizedSet;
        this.k = MutexKt.Mutex$default(false, 1, null);
        f fVar = new f(CoroutineExceptionHandler.INSTANCE);
        this.m = fVar;
        this.n = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(fVar));
        this.o = new Object();
        networkStateChecker.a(this);
    }

    @Override // com.chartboost.sdk.impl.qd.a
    public void b() {
        mb.a("Network is lost. Will wait for onNetworkAvailable().", (Throwable) null, 2, (Object) null);
    }

    public final void c() {
        BuildersKt__Builders_commonKt.launch$default(this.n, null, null, new g(null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.qd.a
    public void a() {
        mb.a("Network is available. Attempting to process queue.", (Throwable) null, 2, (Object) null);
        c();
    }

    public static /* synthetic */ void a(kh khVar, jh jhVar, List list, g7.b bVar, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        khVar.a(jhVar, list, bVar, list2);
    }

    public final void a(jh eventData, List trackers, g7.b bVar, List trackingErrorTrackers) {
        List emptyList;
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(trackingErrorTrackers, "trackingErrorTrackers");
        mb.a("Received eventId=" + eventData.d() + " (type=" + eventData.getClass().getSimpleName() + ") with " + trackers.size() + " explicit trackers.", (Throwable) null, 2, (Object) null);
        if (!trackers.isEmpty()) {
            mb.a("Using " + trackers.size() + " explicitly provided trackers.", (Throwable) null, 2, (Object) null);
            emptyList = trackers;
        } else if (bVar != null) {
            emptyList = this.f.a(bVar);
            mb.a("Using " + emptyList.size() + " trackers from repository for event type " + bVar.b() + ".", (Throwable) null, 2, (Object) null);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        if (emptyList.isEmpty()) {
            mb.e("No trackers configured for eventId=" + eventData.d() + "; skipping.", null, 2, null);
            return;
        }
        synchronized (this.o) {
            if (this.j.contains(eventData.d())) {
                mb.a("EventId=" + eventData.d() + " has already been processed; skipping duplicate.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (this.i.contains(eventData.d())) {
                mb.a("EventId=" + eventData.d() + " is already in-flight; skipping duplicate.", (Throwable) null, 2, (Object) null);
                return;
            }
            this.i.add(eventData.d());
            ConcurrentLinkedQueue concurrentLinkedQueue = this.h;
            String b2 = bVar != null ? bVar.b() : null;
            ec ecVar = eventData instanceof ec ? (ec) eventData : null;
            concurrentLinkedQueue.offer(new f7(eventData, emptyList, b2, ecVar != null ? ecVar.getMediation() : null, trackingErrorTrackers));
            mb.a("Enqueued eventId=" + eventData.d() + ", queue size=" + this.h.size(), (Throwable) null, 2, (Object) null);
            c();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        c cVar;
        int i;
        kh khVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f = i2 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    mb.a("Starting with queue size=" + this.h.size(), (Throwable) null, 2, (Object) null);
                    khVar = this;
                    if (!khVar.b.b()) {
                    }
                    mb.a("Finished processing loop. Remaining queue size=" + khVar.h.size(), (Throwable) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String d2 = (String) cVar.c;
                khVar = (kh) cVar.b;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    khVar.h.poll();
                    mb.a("Successfully processed eventId=" + d2 + ".", (Throwable) null, 2, (Object) null);
                } else {
                    if (!khVar.b.b()) {
                        khVar.j.remove(d2);
                        khVar.i.add(d2);
                        mb.a("Event processing failed due to network loss. Moved back to in-flight to allow retry.", (Throwable) null, 2, (Object) null);
                        mb.a("Finished processing loop. Remaining queue size=" + khVar.h.size(), (Throwable) null, 2, (Object) null);
                        return Unit.INSTANCE;
                    }
                    khVar.h.poll();
                    mb.b("Event failed permanently and was discarded: eventId=" + d2, (Throwable) null, 2, (Object) null);
                }
                if (!khVar.b.b()) {
                    f7 f7Var = (f7) khVar.h.peek();
                    if (f7Var != null) {
                        d2 = f7Var.a().d();
                        khVar.i.remove(d2);
                        khVar.j.add(d2);
                        cVar.b = khVar;
                        cVar.c = d2;
                        cVar.f = 1;
                        obj = khVar.a(f7Var, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        if (!khVar.b.b()) {
                            mb.a("Network is unavailable. Stopping processing.", (Throwable) null, 2, (Object) null);
                        }
                    }
                }
                mb.a("Finished processing loop. Remaining queue size=" + khVar.h.size(), (Throwable) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.f;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01dc, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0182 -> B:11:0x01df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01dc -> B:11:0x01df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f7 f7Var, Continuation continuation) {
        b bVar;
        int i;
        jh a2;
        List d2;
        kh khVar;
        List list;
        int i2;
        int i3;
        b bVar2;
        jh jhVar;
        f7 f7Var2;
        boolean z;
        f7 f7Var3;
        jh jhVar2;
        int i4;
        int i5;
        boolean isEmpty;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i6 = bVar.j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.j = i6 - Integer.MIN_VALUE;
                Object obj = bVar.h;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.j;
                int i7 = 2;
                Throwable th = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    a2 = f7Var.a();
                    d2 = f7Var.d();
                    mb.a("Processing eventId=" + a2.d() + " with " + d2.size() + " initial trackers.", (Throwable) null, 2, (Object) null);
                    int i8 = this.e;
                    khVar = this;
                    if (1 <= i8) {
                        list = d2;
                        i2 = 1;
                        i3 = i8;
                        bVar2 = bVar;
                        jhVar = a2;
                        f7Var2 = f7Var;
                        if (!list.isEmpty()) {
                        }
                        a2 = jhVar;
                        d2 = list;
                    }
                    isEmpty = d2.isEmpty();
                    if (!isEmpty) {
                    }
                    return Boxing.boxBoolean(isEmpty);
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = bVar.g;
                    i4 = bVar.f;
                    list = (List) bVar.e;
                    jhVar2 = (jh) bVar.d;
                    f7Var3 = (f7) bVar.c;
                    khVar = (kh) bVar.b;
                    ResultKt.throwOnFailure(obj);
                    z = true;
                    i3 = i5;
                    f7Var2 = f7Var3;
                    bVar2 = bVar;
                    jhVar = jhVar2;
                    if (i4 != i3) {
                        i2 = i4 + 1;
                        i7 = 2;
                        th = null;
                        if (!list.isEmpty()) {
                            if (!khVar.b.b()) {
                                mb.a("Went offline during retry loop for eventId=" + jhVar.d() + ". Will retry later.", th, i7, th);
                                return Boxing.boxBoolean(false);
                            }
                            mb.a("Attempt " + i2 + " for eventId=" + jhVar.d() + " with " + list.size() + " pending trackers.", th, 2, th);
                            String b2 = f7Var2.b();
                            Mediation c2 = f7Var2.c();
                            List e2 = f7Var2.e();
                            bVar2.b = khVar;
                            bVar2.c = f7Var2;
                            bVar2.d = jhVar;
                            bVar2.e = th;
                            bVar2.f = i2;
                            bVar2.g = i3;
                            bVar2.j = 1;
                            z = true;
                            int i9 = i2;
                            kh khVar2 = khVar;
                            int i10 = i3;
                            Object a3 = khVar.a(list, jhVar, b2, c2, e2, bVar2);
                            if (a3 != coroutine_suspended) {
                                f7Var3 = f7Var2;
                                jhVar2 = jhVar;
                                bVar = bVar2;
                                khVar = khVar2;
                                i5 = i10;
                                obj = a3;
                                i4 = i9;
                                list = (List) obj;
                                if (list.isEmpty()) {
                                    mb.a("All trackers for eventId=" + jhVar2.d() + " succeeded on attempt #" + i4 + ".", th, 2, th);
                                    d2 = list;
                                    a2 = jhVar2;
                                    isEmpty = d2.isEmpty();
                                    if (!isEmpty) {
                                        mb.b("Event eventId=" + a2.d() + " failed permanently after " + khVar.e + " attempts and was discarded.", (Throwable) null, 2, (Object) null);
                                    }
                                    return Boxing.boxBoolean(isEmpty);
                                }
                                if (i4 < khVar.e) {
                                    long j = khVar.d * (1 << (i4 - 1));
                                    mb.e("Event eventId=" + jhVar2.d() + " failed attempt #" + i4 + ". " + list.size() + " trackers remaining. Retrying in " + j + " ms", null, 2, null);
                                    bVar.b = khVar;
                                    bVar.c = f7Var3;
                                    bVar.d = jhVar2;
                                    bVar.e = list;
                                    bVar.f = i4;
                                    bVar.g = i5;
                                    bVar.j = 2;
                                }
                                i3 = i5;
                                f7Var2 = f7Var3;
                                bVar2 = bVar;
                                jhVar = jhVar2;
                                if (i4 != i3) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    a2 = jhVar;
                    d2 = list;
                    isEmpty = d2.isEmpty();
                    if (!isEmpty) {
                    }
                    return Boxing.boxBoolean(isEmpty);
                }
                i5 = bVar.g;
                i4 = bVar.f;
                jh jhVar3 = (jh) bVar.d;
                f7 f7Var4 = (f7) bVar.c;
                kh khVar3 = (kh) bVar.b;
                ResultKt.throwOnFailure(obj);
                z = true;
                khVar = khVar3;
                f7Var3 = f7Var4;
                jhVar2 = jhVar3;
                list = (List) obj;
                if (list.isEmpty()) {
                }
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.j;
        int i72 = 2;
        Throwable th2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:26|27|28|29|30|31|(1:33)(5:35|12|13|14|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        r11 = r1;
        r10 = r4;
        r9 = r13;
        r8 = r14;
        r1 = r15;
        r6 = r16;
        r4 = r17;
        r12 = r18;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        com.chartboost.sdk.impl.mb.b("Unexpected exception during tracker request for eventId=" + r11.d() + ", url=" + r4.d() + ": " + r0.getMessage(), r0);
        r0 = com.chartboost.sdk.impl.di.c;
        r17 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bb -> B:12:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, jh jhVar, String str, Mediation mediation, List list2, Continuation continuation) {
        e eVar;
        kh khVar;
        int i;
        Mediation mediation2;
        List list3;
        ArrayList arrayList;
        e eVar2;
        kh khVar2;
        Iterator it;
        jh jhVar2;
        String str2;
        di diVar;
        e eVar3;
        xh xhVar;
        kh khVar3;
        ArrayList arrayList2;
        Iterator it2;
        int i2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i3 = eVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.l = i3 - Integer.MIN_VALUE;
                khVar = this;
                Object obj = eVar.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.l;
                int i4 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    mediation2 = mediation;
                    list3 = list2;
                    arrayList = new ArrayList();
                    eVar2 = eVar;
                    khVar2 = khVar;
                    it = list.iterator();
                    jhVar2 = jhVar;
                    str2 = str;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xh xhVar2 = (xh) eVar.i;
                    Iterator it3 = (Iterator) eVar.h;
                    ?? r7 = (List) eVar.g;
                    List list4 = (List) eVar.f;
                    Mediation mediation3 = (Mediation) eVar.e;
                    String str3 = (String) eVar.d;
                    jh jhVar3 = (jh) eVar.c;
                    kh khVar4 = (kh) eVar.b;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            r7 = r7;
                        } catch (Exception e2) {
                            mb.b("Unexpected exception during tracker request for eventId=" + jhVar3.d() + ", url=" + xhVar2.d() + ": " + e2.getMessage(), e2);
                            diVar = di.c;
                            eVar3 = eVar;
                        }
                        diVar = (di) obj;
                        eVar3 = eVar;
                        Iterator it4 = it3;
                        ArrayList arrayList3 = r7;
                        List list5 = list4;
                        Mediation mediation4 = mediation3;
                        jhVar2 = jhVar3;
                        String str4 = str3;
                        int i5 = a.f4845a[diVar.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                i2 = 1;
                                Boxing.boxBoolean(arrayList3.add(xhVar2));
                            } else if (i5 == 3) {
                                mb.b("Tracker request could not be generated for eventId=" + jhVar2.d() + ". URL: " + xhVar2.d(), (Throwable) null, 2, (Object) null);
                                if (!(jhVar2 instanceof hi)) {
                                    i2 = 1;
                                    khVar4.a(jhVar2.a(), xhVar2.d(), str4, mediation4, list5);
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            str2 = str4;
                            khVar2 = khVar4;
                            arrayList = arrayList3;
                            it = it4;
                            mediation2 = mediation4;
                            list3 = list5;
                            eVar2 = eVar3;
                            i4 = i2;
                            if (it.hasNext()) {
                                return arrayList;
                            }
                            xh xhVar3 = (xh) it.next();
                            try {
                            } catch (Exception e3) {
                                e = e3;
                                xhVar = xhVar3;
                                khVar3 = khVar2;
                                arrayList2 = arrayList;
                                it2 = it;
                            }
                            mh mhVar = khVar2.f4844a;
                            String d2 = xhVar3.d();
                            String c2 = xhVar3.c();
                            String a2 = xhVar3.a();
                            String b2 = xhVar3.b();
                            eVar2.b = khVar2;
                            eVar2.c = jhVar2;
                            eVar2.d = str2;
                            eVar2.e = mediation2;
                            eVar2.f = list3;
                            eVar2.g = arrayList;
                            eVar2.h = it;
                            eVar2.i = xhVar3;
                            eVar2.l = i4;
                            xhVar = xhVar3;
                            khVar3 = khVar2;
                            arrayList2 = arrayList;
                            it2 = it;
                            obj = mhVar.a(d2, c2, a2, jhVar2, b2, eVar2);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            jhVar3 = jhVar2;
                            str3 = str2;
                            mediation3 = mediation2;
                            list4 = list3;
                            eVar = eVar2;
                            it3 = it2;
                            xhVar2 = xhVar;
                            khVar4 = khVar3;
                            r7 = arrayList2;
                            diVar = (di) obj;
                            eVar3 = eVar;
                            Iterator it42 = it3;
                            ArrayList arrayList32 = r7;
                            List list52 = list4;
                            Mediation mediation42 = mediation3;
                            jhVar2 = jhVar3;
                            String str42 = str3;
                            int i52 = a.f4845a[diVar.ordinal()];
                            if (i52 != 1) {
                            }
                        }
                        i2 = 1;
                        str2 = str42;
                        khVar2 = khVar4;
                        arrayList = arrayList32;
                        it = it42;
                        mediation2 = mediation42;
                        list3 = list52;
                        eVar2 = eVar3;
                        i4 = i2;
                        if (it.hasNext()) {
                        }
                    } catch (CancellationException e4) {
                        throw e4;
                    }
                }
            }
        }
        khVar = this;
        eVar = khVar.new e(continuation);
        Object obj2 = eVar.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.l;
        int i42 = 1;
        if (i != 0) {
        }
    }

    public final void a(String str, String str2, String str3, Mediation mediation, List list) {
        ai aiVar = this.f;
        g7.b bVar = g7.b.f;
        a(this, new hi(str, str2, "Network request failed. Invalid network request. Failed to create network request for URL: " + str2, "CB_206", "CB_CONNECTIVITY_INVALID_REQUEST", null, str3, mediation, 32, null), CollectionsKt.distinct(CollectionsKt.plus((Collection) list, (Iterable) aiVar.a(bVar))), bVar, (List) null, 8, (Object) null);
    }

    public /* synthetic */ kh(mh mhVar, qd qdVar, CoroutineDispatcher coroutineDispatcher, long j, int i, ai aiVar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mhVar, qdVar, (i3 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i3 & 8) != 0 ? 500L : j, (i3 & 16) != 0 ? 3 : i, aiVar, (i3 & 64) != 0 ? 1000 : i2);
    }
}
