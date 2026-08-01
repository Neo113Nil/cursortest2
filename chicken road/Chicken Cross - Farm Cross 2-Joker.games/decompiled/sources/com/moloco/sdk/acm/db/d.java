package com.moloco.sdk.acm.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes8.dex */
public interface d {

    public static final class a {

        @DebugMetadata(c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", f = "MetricsDAO.kt", i = {0, 0, 0, 1}, l = {58, 62}, m = "deleteAndReturnDeletedEvents", n = {"$this", "deletedEvents", "eventsToDeleteChunk", "deletedEvents"}, s = {"L$0", "L$1", "L$2", "L$0"})
        /* renamed from: com.moloco.sdk.acm.db.d$a$a, reason: collision with other inner class name */
        public static final class C1467a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f10380a;
            public Object b;
            public Object c;
            public /* synthetic */ Object d;
            public int e;

            public C1467a(Continuation<? super C1467a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", f = "MetricsDAO.kt", i = {0}, l = {69, 70}, m = "resetDatabase", n = {"$this"}, s = {"L$0"})
        public static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f10381a;
            public /* synthetic */ Object b;
            public int c;

            public b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                return a.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a3 -> B:16:0x00a5). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object a(d dVar, Continuation<? super List<com.moloco.sdk.acm.db.b>> continuation) {
            C1467a c1467a;
            int i;
            ArrayList arrayList;
            List<com.moloco.sdk.acm.db.b> b2;
            if (continuation instanceof C1467a) {
                c1467a = (C1467a) continuation;
                int i2 = c1467a.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1467a.e = i2 - Integer.MIN_VALUE;
                    Object obj = c1467a.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c1467a.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        arrayList = new ArrayList();
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            List list = (List) c1467a.f10380a;
                            ResultKt.throwOnFailure(obj);
                            return list;
                        }
                        List<com.moloco.sdk.acm.db.b> list2 = (List) c1467a.c;
                        ?? r2 = (List) c1467a.b;
                        d dVar2 = (d) c1467a.f10380a;
                        ResultKt.throwOnFailure(obj);
                        arrayList = r2;
                        arrayList.addAll(list2);
                        dVar = dVar2;
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                            c1467a.f10380a = arrayList;
                            c1467a.b = null;
                            c1467a.c = null;
                            c1467a.e = 2;
                            return dVar.d(c1467a) == coroutine_suspended ? coroutine_suspended : arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b2, 10));
                        Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Boxing.boxLong(((com.moloco.sdk.acm.db.b) it.next()).i()));
                        }
                        c1467a.f10380a = dVar;
                        c1467a.b = arrayList;
                        c1467a.c = b2;
                        c1467a.e = 1;
                        if (dVar.a(arrayList2, c1467a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dVar2 = dVar;
                        list2 = b2;
                        arrayList.addAll(list2);
                        dVar = dVar2;
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                        }
                    }
                }
            }
            c1467a = new C1467a(continuation);
            Object obj2 = c1467a.d;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c1467a.e;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object b(d dVar, Continuation<? super Unit> continuation) {
            b bVar;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.b;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        bVar.f10381a = dVar;
                        bVar.c = 1;
                        if (dVar.b(bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        dVar = (d) bVar.f10381a;
                        ResultKt.throwOnFailure(obj);
                    }
                    bVar.f10381a = null;
                    bVar.c = 2;
                    if (dVar.d(bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            bVar = new b(continuation);
            Object obj2 = bVar.b;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = bVar.c;
            if (i != 0) {
            }
            bVar.f10381a = null;
            bVar.c = 2;
            if (dVar.d(bVar) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    long a(b bVar);

    b a(long j);

    Object a(List<Long> list, Continuation<? super Unit> continuation);

    Object a(Continuation<? super List<b>> continuation);

    List<b> a();

    List<Long> a(List<b> list);

    Object b(Continuation<? super Unit> continuation);

    List<b> b();

    List<Long> b(List<b> list);

    Object c(Continuation<? super Unit> continuation);

    Object d(Continuation<? super Unit> continuation);
}
