package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.bbflight.background_downloader.TaskWorker;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.C1086c;

@SourceDebugExtension({"SMAP\nHoldingQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingQueue.kt\ncom/bbflight/background_downloader/HoldingQueue\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,326:1\n120#2,10:327\n120#2,10:367\n120#2,8:377\n129#2:392\n777#3:337\n873#3,2:338\n1915#3,2:340\n1586#3:342\n1661#3,3:343\n777#3:346\n873#3,2:347\n1586#3:349\n1661#3,3:350\n777#3:353\n873#3,2:354\n1586#3:356\n1661#3,3:357\n777#3:360\n873#3,2:361\n1586#3:363\n1661#3,3:364\n777#3:385\n873#3,2:386\n231#3,2:388\n231#3,2:390\n*S KotlinDebug\n*F\n+ 1 HoldingQueue.kt\ncom/bbflight/background_downloader/HoldingQueue\n*L\n109#1:327,10\n227#1:367,10\n242#1:377,8\n242#1:392\n140#1:337\n140#1:338,2\n142#1:340,2\n147#1:342\n147#1:343,3\n160#1:346\n160#1:347,2\n160#1:349\n160#1:350,3\n172#1:353\n172#1:354,2\n172#1:356\n172#1:357,3\n186#1:360\n186#1:361,2\n186#1:363\n186#1:364,3\n244#1:385\n244#1:386,2\n251#1:388,2\n262#1:390,2\n*E\n"})
/* renamed from: com.bbflight.background_downloader.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0638c0 {
    public final WorkManager a;
    public int b;
    public int c;
    public int d;
    public final ConcurrentHashMap<String, String> e;
    public final ArrayList f;
    public final AtomicInteger g;
    public final ConcurrentHashMap<String, AtomicInteger> h;
    public final ConcurrentHashMap<String, AtomicInteger> i;
    public final PriorityBlockingQueue<U> j;
    public final kotlinx.coroutines.channels.b k;
    public kotlinx.coroutines.Q0 l;
    public final C1086c m;
    public final kotlinx.coroutines.channels.b n;
    public final kotlinx.coroutines.sync.c o;

    @DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue$1", f = "HoldingQueue.kt", i = {1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {58, 332, 82}, m = "invokeSuspend", n = {"signal", "$this$withLock_u24default$iv", "$i$f$withLock", "signal", "$this$withLock_u24default$iv", "mustWait", "item", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "group", "$i$f$withLock", "$i$a$-withLock$default-HoldingQueue$1$1"}, nl = {59, 333, 83}, s = {"L$1", "L$2", "I$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"}, v = 2)
    @SourceDebugExtension({"SMAP\nHoldingQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingQueue.kt\ncom/bbflight/background_downloader/HoldingQueue$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,326:1\n120#2,10:327\n*S KotlinDebug\n*F\n+ 1 HoldingQueue.kt\ncom/bbflight/background_downloader/HoldingQueue$1\n*L\n59#1:327,10\n*E\n"})
    /* renamed from: com.bbflight.background_downloader.c0$a */
    public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.channels.i a;
        public Object b;
        public kotlinx.coroutines.sync.a c;
        public C0638c0 d;
        public ArrayList e;
        public Object f;
        public Object i;
        public Object j;
        public int k;
        public int l;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0638c0.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
        
            if (r9 != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
        
            r9.g.incrementAndGet();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
        
            if (r5.containsKey(r4) != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
        
            r5.put(r4, new java.util.concurrent.atomic.AtomicInteger(0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
        
            r3 = r5.get(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
        
            if (r3 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0126, code lost:
        
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r3.incrementAndGet());
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0131, code lost:
        
            if (r15.containsKey(r8) != false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0133, code lost:
        
            r15.put(r8, new java.util.concurrent.atomic.AtomicInteger(0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
        
            r3 = r15.get(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
        
            if (r3 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
        
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r3.incrementAndGet());
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
        
            r19.a = r11;
            r19.b = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12);
            r19.c = r10;
            r19.d = r9;
            r19.e = r6;
            r19.f = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13);
            r19.i = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4);
            r19.j = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8);
            r19.k = r2;
            r3 = 3;
            r19.l = 3;
            r7 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0175, code lost:
        
            if (r13.a(0, r19) != r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0178, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:12:0x0189, B:14:0x0194, B:23:0x00b4, B:25:0x00c4, B:26:0x00c9, B:28:0x00cf, B:31:0x00d7, B:33:0x00e7, B:35:0x00f4, B:37:0x00f8, B:39:0x0100, B:40:0x0106, B:43:0x010a, B:45:0x0115, B:46:0x011e, B:48:0x0126, B:49:0x012d, B:51:0x0133, B:52:0x013c, B:54:0x0144, B:55:0x014b, B:59:0x017b), top: B:11:0x0189 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v4, types: [com.bbflight.background_downloader.c0, java.lang.Object, java.util.ArrayList, kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0178 -> B:10:0x0179). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0186 -> B:11:0x0189). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0190 -> B:13:0x018e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.i aVar;
            kotlinx.coroutines.sync.a aVar2;
            Object obj2;
            Throwable th;
            Unit unit;
            kotlinx.coroutines.channels.i iVar;
            C0638c0 c0638c0;
            int i;
            AtomicInteger atomicInteger;
            C0638c0 c0638c02;
            char c;
            ArrayList arrayList;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.l;
            C0638c0 c0638c03 = C0638c0.this;
            char c2 = 3;
            int i3 = 2;
            int i4 = 1;
            int i5 = 0;
            ?? r8 = 0;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = c0638c03.n;
                bVar.getClass();
                aVar = new b.a();
                this.a = aVar;
                this.b = r8;
                this.c = r8;
                this.d = r8;
                this.e = r8;
                this.f = r8;
                this.i = r8;
                this.j = r8;
                this.l = i4;
                obj3 = aVar.b(this);
            } else {
                if (i2 == 1) {
                    aVar = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    if (!((Boolean) obj3).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    aVar.next();
                    Unit unit2 = Unit.INSTANCE;
                    kotlinx.coroutines.sync.c cVar = c0638c03.o;
                    this.a = aVar;
                    this.b = SpillingKt.nullOutSpilledVariable(unit2);
                    this.c = cVar;
                    this.d = c0638c03;
                    this.k = i5;
                    this.l = i3;
                    if (cVar.d(this) != coroutine_suspended) {
                        aVar2 = cVar;
                        unit = unit2;
                        iVar = aVar;
                        c0638c0 = c0638c03;
                        i = i5;
                        atomicInteger = c0638c0.g;
                        PriorityBlockingQueue<U> priorityBlockingQueue = c0638c0.j;
                        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = c0638c0.i;
                        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap2 = c0638c0.h;
                        if (atomicInteger.get() >= c0638c0.b) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 == 2) {
                    i = this.k;
                    c0638c0 = this.d;
                    aVar2 = this.c;
                    Unit unit3 = (Unit) this.b;
                    kotlinx.coroutines.channels.i iVar2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    unit = unit3;
                    iVar = iVar2;
                    atomicInteger = c0638c0.g;
                    PriorityBlockingQueue<U> priorityBlockingQueue2 = c0638c0.j;
                    ConcurrentHashMap<String, AtomicInteger> concurrentHashMap3 = c0638c0.i;
                    ConcurrentHashMap<String, AtomicInteger> concurrentHashMap22 = c0638c0.h;
                    if (atomicInteger.get() >= c0638c0.b) {
                        arrayList = new ArrayList();
                        while (!priorityBlockingQueue2.isEmpty()) {
                            U poll = priorityBlockingQueue2.poll();
                            if (poll != null) {
                                M0 m0 = poll.b;
                                String c3 = m0.c();
                                String str = m0.n;
                                AtomicInteger atomicInteger2 = concurrentHashMap22.get(c3);
                                if (atomicInteger2 != null) {
                                    i5 = atomicInteger2.get();
                                }
                                c0638c02 = c0638c03;
                                if (i5 < c0638c0.c) {
                                    AtomicInteger atomicInteger3 = concurrentHashMap3.get(str);
                                    if ((atomicInteger3 != null ? atomicInteger3.get() : 0) < c0638c0.d) {
                                        break;
                                    }
                                }
                                i5 = 0;
                                arrayList.add(poll);
                                c2 = 3;
                                c0638c03 = c0638c02;
                            }
                        }
                        c0638c02 = c0638c03;
                        c = c2;
                        c0638c0.j.addAll(arrayList);
                        aVar = iVar;
                        Unit unit4 = Unit.INSTANCE;
                        aVar2.c(null);
                        r8 = 0;
                        i3 = 2;
                        i4 = 1;
                        c2 = c;
                        c0638c03 = c0638c02;
                        this.a = aVar;
                        this.b = r8;
                        this.c = r8;
                        this.d = r8;
                        this.e = r8;
                        this.f = r8;
                        this.i = r8;
                        this.j = r8;
                        this.l = i4;
                        obj3 = aVar.b(this);
                    } else {
                        c0638c02 = c0638c03;
                        c = c2;
                        aVar = iVar;
                        Unit unit42 = Unit.INSTANCE;
                        aVar2.c(null);
                        r8 = 0;
                        i3 = 2;
                        i4 = 1;
                        c2 = c;
                        c0638c03 = c0638c02;
                        this.a = aVar;
                        this.b = r8;
                        this.c = r8;
                        this.d = r8;
                        this.e = r8;
                        this.f = r8;
                        this.i = r8;
                        this.j = r8;
                        this.l = i4;
                        obj3 = aVar.b(this);
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ArrayList arrayList2 = this.e;
                    c0638c0 = this.d;
                    aVar2 = this.c;
                    iVar = this.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        c0638c02 = c0638c03;
                        c = 3;
                        arrayList = arrayList2;
                        try {
                            c0638c0.j.addAll(arrayList);
                            aVar = iVar;
                            Unit unit422 = Unit.INSTANCE;
                            aVar2.c(null);
                            r8 = 0;
                            i3 = 2;
                            i4 = 1;
                            c2 = c;
                            c0638c03 = c0638c02;
                            this.a = aVar;
                            this.b = r8;
                            this.c = r8;
                            this.d = r8;
                            this.e = r8;
                            this.f = r8;
                            this.i = r8;
                            this.j = r8;
                            this.l = i4;
                            obj3 = aVar.b(this);
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = null;
                            aVar2.c(obj2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = null;
                        aVar2.c(obj2);
                        throw th;
                    }
                }
            }
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue$2", f = "HoldingQueue.kt", i = {1}, l = {99, 100}, m = "invokeSuspend", n = {"task"}, nl = {100, 102}, s = {"L$1"}, v = 2)
    /* renamed from: com.bbflight.background_downloader.c0$b */
    public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.channels.i a;
        public Object b;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0638c0.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            if (com.bbflight.background_downloader.C0638c0.b(r2, r7, r6) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
        
            if (r7 == r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:6:0x0035). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.i aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            C0638c0 c0638c0 = C0638c0.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = c0638c0.k;
                bVar.getClass();
                aVar = new b.a();
            } else if (i == 1) {
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                M0 m0 = (M0) aVar.next();
                this.a = aVar;
                this.b = SpillingKt.nullOutSpilledVariable(m0);
                this.c = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
            }
            this.a = aVar;
            this.b = null;
            this.c = 1;
            obj = aVar.b(this);
        }
    }

    public C0638c0(WorkManager workManager) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.a = workManager;
        this.b = 1048576;
        this.c = 1048576;
        this.d = 1048576;
        this.e = new ConcurrentHashMap<>();
        this.f = new ArrayList();
        this.g = new AtomicInteger(0);
        this.h = new ConcurrentHashMap<>();
        this.i = new ConcurrentHashMap<>();
        this.j = new PriorityBlockingQueue<>();
        this.k = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        C1086c a2 = kotlinx.coroutines.L.a(C1049c0.a);
        this.m = a2;
        this.n = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        this.o = kotlinx.coroutines.sync.d.a();
        C1082i.c(a2, null, null, new a(null), 3);
        C1082i.c(a2, null, null, new b(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:12:0x004e, B:13:0x006a, B:15:0x0070, B:18:0x0081, B:23:0x0088, B:24:0x009b, B:26:0x00a1, B:29:0x00a8, B:30:0x00b2, B:32:0x00b8, B:35:0x00c8, B:38:0x00de, B:40:0x00e4, B:41:0x00ec, B:43:0x00f4, B:71:0x00fc, B:72:0x0101, B:45:0x0102, B:46:0x010c, B:48:0x0112, B:51:0x0121, B:53:0x0131, B:54:0x0139, B:57:0x0141, B:63:0x014a, B:64:0x014f, B:77:0x0150), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:12:0x004e, B:13:0x006a, B:15:0x0070, B:18:0x0081, B:23:0x0088, B:24:0x009b, B:26:0x00a1, B:29:0x00a8, B:30:0x00b2, B:32:0x00b8, B:35:0x00c8, B:38:0x00de, B:40:0x00e4, B:41:0x00ec, B:43:0x00f4, B:71:0x00fc, B:72:0x0101, B:45:0x0102, B:46:0x010c, B:48:0x0112, B:51:0x0121, B:53:0x0131, B:54:0x0139, B:57:0x0141, B:63:0x014a, B:64:0x014f, B:77:0x0150), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0638c0 c0638c0, ContinuationImpl continuationImpl) {
        C0644f0 c0644f0;
        int i;
        kotlinx.coroutines.sync.c cVar;
        Iterator it;
        boolean startsWith$default;
        boolean startsWith$default2;
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = c0638c0.i;
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap2 = c0638c0.h;
        try {
            if (continuationImpl instanceof C0644f0) {
                c0644f0 = (C0644f0) continuationImpl;
                int i2 = c0644f0.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0644f0.d = i2 - Integer.MIN_VALUE;
                    Object obj = c0644f0.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0644f0.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.c cVar2 = c0638c0.o;
                        c0644f0.a = cVar2;
                        c0644f0.d = 1;
                        if (cVar2.d(c0644f0) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cVar = cVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = c0644f0.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    List<WorkInfo> list = c0638c0.a.getWorkInfosByTag("BackgroundDownloader").get();
                    Intrinsics.checkNotNullExpressionValue(list, "get(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((WorkInfo) obj2).getState().isFinished()) {
                            arrayList.add(obj2);
                        }
                    }
                    c0638c0.g.set(arrayList.size());
                    concurrentHashMap2.clear();
                    concurrentHashMap.clear();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        WorkInfo workInfo = (WorkInfo) it.next();
                        try {
                        } catch (NoSuchElementException unused) {
                        }
                        for (Object obj3 : workInfo.getTags()) {
                            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default((String) obj3, "taskId=", false, 2, null);
                            if (startsWith$default2) {
                                String substring = ((String) obj3).substring(7);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                String str = c0638c0.e.get(substring);
                                if (str == null) {
                                    str = "";
                                }
                                if (!concurrentHashMap2.containsKey(str)) {
                                    concurrentHashMap2.put(str, new AtomicInteger(0));
                                }
                                AtomicInteger atomicInteger = concurrentHashMap2.get(str);
                                if (atomicInteger != null) {
                                    Boxing.boxInt(atomicInteger.incrementAndGet());
                                }
                                try {
                                } catch (NoSuchElementException unused2) {
                                }
                                for (Object obj4 : workInfo.getTags()) {
                                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default((String) obj4, "group=", false, 2, null);
                                    if (startsWith$default) {
                                        String substring2 = ((String) obj4).substring(6);
                                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                        if (!concurrentHashMap.containsKey(substring2)) {
                                            concurrentHashMap.put(substring2, new AtomicInteger(0));
                                        }
                                        AtomicInteger atomicInteger2 = concurrentHashMap.get(substring2);
                                        if (atomicInteger2 != null) {
                                            Boxing.boxInt(atomicInteger2.incrementAndGet());
                                        }
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    Unit unit = Unit.INSTANCE;
                    cVar.c(null);
                    return Unit.INSTANCE;
                }
            }
            List<WorkInfo> list2 = c0638c0.a.getWorkInfosByTag("BackgroundDownloader").get();
            Intrinsics.checkNotNullExpressionValue(list2, "get(...)");
            ArrayList arrayList2 = new ArrayList();
            while (r5.hasNext()) {
            }
            c0638c0.g.set(arrayList2.size());
            concurrentHashMap2.clear();
            concurrentHashMap.clear();
            it = arrayList2.iterator();
            while (it.hasNext()) {
            }
            Unit unit2 = Unit.INSTANCE;
            cVar.c(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar.c(null);
            throw th;
        }
        c0644f0 = new C0644f0(c0638c0, continuationImpl);
        Object obj5 = c0644f0.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0644f0.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x006c, B:14:0x007b, B:15:0x0085, B:17:0x008f), top: B:11:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x006c, B:14:0x007b, B:15:0x0085, B:17:0x008f), top: B:11:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C0638c0 c0638c0, M0 m0, ContinuationImpl continuationImpl) {
        C0650i0 c0650i0;
        int i;
        String c;
        String str;
        kotlinx.coroutines.sync.c cVar;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        try {
            if (continuationImpl instanceof C0650i0) {
                c0650i0 = (C0650i0) continuationImpl;
                int i2 = c0650i0.i;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0650i0.i = i2 - Integer.MIN_VALUE;
                    Object obj = c0650i0.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0650i0.i;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        c0638c0.e.remove(m0.a);
                        c0638c0.f.remove(m0.a);
                        c = m0.c();
                        String str2 = m0.n;
                        kotlinx.coroutines.sync.c cVar2 = c0638c0.o;
                        c0650i0.a = SpillingKt.nullOutSpilledVariable(m0);
                        c0650i0.b = c;
                        c0650i0.c = str2;
                        c0650i0.d = cVar2;
                        c0650i0.i = 1;
                        if (cVar2.d(c0650i0) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str2;
                        cVar = cVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = c0650i0.d;
                        str = c0650i0.c;
                        c = c0650i0.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    c0638c0.g.decrementAndGet();
                    atomicInteger = c0638c0.h.get(c);
                    if (atomicInteger != null) {
                        Boxing.boxInt(atomicInteger.decrementAndGet());
                    }
                    atomicInteger2 = c0638c0.i.get(str);
                    if (atomicInteger2 != null) {
                        Boxing.boxInt(atomicInteger2.decrementAndGet());
                    }
                    cVar.c(null);
                    c0638c0.d();
                    return Unit.INSTANCE;
                }
            }
            c0638c0.g.decrementAndGet();
            atomicInteger = c0638c0.h.get(c);
            if (atomicInteger != null) {
            }
            atomicInteger2 = c0638c0.i.get(str);
            if (atomicInteger2 != null) {
            }
            cVar.c(null);
            c0638c0.d();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar.c(null);
            throw th;
        }
        c0650i0 = new C0650i0(c0638c0, continuationImpl);
        Object obj2 = c0650i0.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0650i0.i;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(U u, ContinuationImpl continuationImpl) {
        C0640d0 c0640d0;
        int i;
        kotlinx.coroutines.sync.c cVar;
        try {
            if (continuationImpl instanceof C0640d0) {
                c0640d0 = (C0640d0) continuationImpl;
                int i2 = c0640d0.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0640d0.e = i2 - Integer.MIN_VALUE;
                    Object obj = c0640d0.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0640d0.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        c0640d0.a = u;
                        cVar = this.o;
                        c0640d0.b = cVar;
                        c0640d0.e = 1;
                        if (cVar.d(c0640d0) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.c cVar2 = c0640d0.b;
                        U u2 = c0640d0.a;
                        ResultKt.throwOnFailure(obj);
                        cVar = cVar2;
                        u = u2;
                    }
                    this.j.add(u);
                    this.f.add(u.b.a);
                    C0657m0 c0657m0 = C0657m0.a;
                    C0657m0.f(u, true);
                    Unit unit = Unit.INSTANCE;
                    cVar.c(null);
                    d();
                    return Unit.INSTANCE;
                }
            }
            this.j.add(u);
            this.f.add(u.b.a);
            C0657m0 c0657m02 = C0657m0.a;
            C0657m0.f(u, true);
            Unit unit2 = Unit.INSTANCE;
            cVar.c(null);
            d();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar.c(null);
            throw th;
        }
        c0640d0 = new C0640d0(this, continuationImpl);
        Object obj2 = c0640d0.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0640d0.e;
        if (i != 0) {
        }
    }

    public final void d() {
        this.n.c(Unit.INSTANCE);
        if (this.j.isEmpty()) {
            return;
        }
        kotlinx.coroutines.Q0 q0 = this.l;
        if (q0 != null) {
            q0.cancel((CancellationException) null);
        }
        this.l = C1082i.c(this.m, null, null, new C0642e0(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, String str, ContinuationImpl continuationImpl) {
        C0646g0 c0646g0;
        int i;
        int collectionSizeOrDefault;
        List list;
        if (continuationImpl instanceof C0646g0) {
            c0646g0 = (C0646g0) continuationImpl;
            int i2 = c0646g0.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0646g0.f = i2 - Integer.MIN_VALUE;
                Object obj = c0646g0.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0646g0.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator<U> it = this.j.iterator();
                    while (it.hasNext()) {
                        U next = it.next();
                        if (Intrinsics.areEqual(next.b.n, str)) {
                            arrayList.add(next);
                        }
                    }
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((U) it2.next()).b.a);
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
                    c0646g0.a = SpillingKt.nullOutSpilledVariable(context);
                    c0646g0.b = SpillingKt.nullOutSpilledVariable(str);
                    c0646g0.c = mutableList;
                    c0646g0.f = 1;
                    if (f(context, mutableList, c0646g0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = mutableList;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = c0646g0.c;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxInt(list.size());
            }
        }
        c0646g0 = new C0646g0(this, continuationImpl);
        Object obj2 = c0646g0.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0646g0.f;
        if (i != 0) {
        }
        return Boxing.boxInt(list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00da -> B:10:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Context context, Iterable iterable, ContinuationImpl continuationImpl) {
        C0648h0 c0648h0;
        int i;
        Context context2;
        C0648h0 c0648h02;
        SharedPreferences defaultSharedPreferences;
        int i2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterable iterable2;
        int collectionSizeOrDefault;
        if (continuationImpl instanceof C0648h0) {
            c0648h0 = (C0648h0) continuationImpl;
            int i3 = c0648h0.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0648h0.n = i3 - Integer.MIN_VALUE;
                Object obj = c0648h0.l;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0648h0.n;
                PriorityBlockingQueue<U> priorityBlockingQueue = this.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<U> it2 = priorityBlockingQueue.iterator();
                    while (it2.hasNext()) {
                        U next = it2.next();
                        if (CollectionsKt.contains(iterable, next.b.a)) {
                            arrayList3.add(next);
                        }
                    }
                    context2 = context;
                    c0648h02 = c0648h0;
                    defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    i2 = 0;
                    arrayList = arrayList3;
                    it = arrayList3.iterator();
                    arrayList2 = arrayList;
                    iterable2 = iterable;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = c0648h0.k;
                    U u = c0648h0.j;
                    it = c0648h0.f;
                    ?? r9 = (Iterable) c0648h0.e;
                    SharedPreferences sharedPreferences = c0648h0.d;
                    ?? r11 = c0648h0.c;
                    Iterable iterable3 = (Iterable) c0648h0.b;
                    Context context3 = c0648h0.a;
                    ResultKt.throwOnFailure(obj);
                    c0648h02 = c0648h0;
                    arrayList = r9;
                    iterable2 = iterable3;
                    context2 = context3;
                    defaultSharedPreferences = sharedPreferences;
                    ArrayList arrayList4 = r11;
                    String str = u.b.a;
                    arrayList2 = arrayList4;
                    if (it.hasNext()) {
                        Object next2 = it.next();
                        U u2 = (U) next2;
                        priorityBlockingQueue.remove(u2);
                        TaskWorker.Companion companion = TaskWorker.INSTANCE;
                        M0 m0 = u2.b;
                        W0 w0 = W0.i;
                        Intrinsics.checkNotNull(defaultSharedPreferences);
                        c0648h02.a = context2;
                        c0648h02.b = SpillingKt.nullOutSpilledVariable(iterable2);
                        c0648h02.c = arrayList2;
                        c0648h02.d = defaultSharedPreferences;
                        c0648h02.e = SpillingKt.nullOutSpilledVariable(arrayList);
                        c0648h02.f = it;
                        c0648h02.i = SpillingKt.nullOutSpilledVariable(next2);
                        c0648h02.j = u2;
                        c0648h02.k = i2;
                        c0648h02.n = 1;
                        if (TaskWorker.Companion.g(companion, m0, w0, defaultSharedPreferences, null, context2, c0648h02, 504) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arrayList4 = arrayList2;
                        u = u2;
                        String str2 = u.b.a;
                        arrayList2 = arrayList4;
                        if (it.hasNext()) {
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault);
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(((U) it3.next()).b.a);
                            }
                            return CollectionsKt.toMutableList((Collection) arrayList5);
                        }
                    }
                }
            }
        }
        c0648h0 = new C0648h0(this, continuationImpl);
        Object obj2 = c0648h0.l;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0648h0.n;
        PriorityBlockingQueue<U> priorityBlockingQueue2 = this.j;
        if (i != 0) {
        }
    }

    public final Object g(M0 m0, ContinuationImpl continuationImpl) {
        Object i = this.k.i(m0, continuationImpl);
        return i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i : Unit.INSTANCE;
    }
}
