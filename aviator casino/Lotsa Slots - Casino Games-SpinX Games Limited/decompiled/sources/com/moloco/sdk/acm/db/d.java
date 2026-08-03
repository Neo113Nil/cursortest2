package com.moloco.sdk.acm.db;

/* loaded from: classes5.dex */
public interface d {

    public static final class a {

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", f = "MetricsDAO.kt", i = {0, 0, 0, 1}, l = {58, 62}, m = "deleteAndReturnDeletedEvents", n = {"$this", "deletedEvents", "eventsToDeleteChunk", "deletedEvents"}, s = {"L$0", "L$1", "L$2", "L$0"})
        /* renamed from: com.moloco.sdk.acm.db.d$a$a, reason: collision with other inner class name */
        public static final class C0171a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public java.lang.Object f6878a;
            public java.lang.Object b;
            public java.lang.Object c;
            public /* synthetic */ java.lang.Object d;
            public int e;

            public C0171a(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.db.d.a.C0171a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return com.moloco.sdk.acm.db.d.a.a(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", f = "MetricsDAO.kt", i = {0}, l = {69, 70}, m = "resetDatabase", n = {"$this"}, s = {"L$0"})
        public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public java.lang.Object f6879a;
            public /* synthetic */ java.lang.Object b;
            public int c;

            public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.db.d.a.b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                return com.moloco.sdk.acm.db.d.a.b(null, this);
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
        public static java.lang.Object a(com.moloco.sdk.acm.db.d dVar, kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.acm.db.b>> continuation) {
            com.moloco.sdk.acm.db.d.a.C0171a c0171a;
            int i;
            java.util.ArrayList arrayList;
            java.util.List<com.moloco.sdk.acm.db.b> b2;
            if (continuation instanceof com.moloco.sdk.acm.db.d.a.C0171a) {
                c0171a = (com.moloco.sdk.acm.db.d.a.C0171a) continuation;
                int i2 = c0171a.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0171a.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c0171a.d;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0171a.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrayList = new java.util.ArrayList();
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.util.List list = (java.util.List) c0171a.f6878a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return list;
                        }
                        java.util.List<com.moloco.sdk.acm.db.b> list2 = (java.util.List) c0171a.c;
                        ?? r2 = (java.util.List) c0171a.b;
                        com.moloco.sdk.acm.db.d dVar2 = (com.moloco.sdk.acm.db.d) c0171a.f6878a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrayList = r2;
                        arrayList.addAll(list2);
                        dVar = dVar2;
                        b2 = dVar.b();
                        if (b2.isEmpty()) {
                            c0171a.f6878a = arrayList;
                            c0171a.b = null;
                            c0171a.c = null;
                            c0171a.e = 2;
                            return dVar.d(c0171a) == coroutine_suspended ? coroutine_suspended : arrayList;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b2, 10));
                        java.util.Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(kotlin.coroutines.jvm.internal.Boxing.boxLong(((com.moloco.sdk.acm.db.b) it.next()).i()));
                        }
                        c0171a.f6878a = dVar;
                        c0171a.b = arrayList;
                        c0171a.c = b2;
                        c0171a.e = 1;
                        if (dVar.a(arrayList2, c0171a) == coroutine_suspended) {
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
            c0171a = new com.moloco.sdk.acm.db.d.a.C0171a(continuation);
            java.lang.Object obj2 = c0171a.d;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0171a.e;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object b(com.moloco.sdk.acm.db.d dVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.moloco.sdk.acm.db.d.a.b bVar;
            java.lang.Object coroutine_suspended;
            int i;
            if (continuation instanceof com.moloco.sdk.acm.db.d.a.b) {
                bVar = (com.moloco.sdk.acm.db.d.a.b) continuation;
                int i2 = bVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = bVar.b;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.c;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        bVar.f6879a = dVar;
                        bVar.c = 1;
                        if (dVar.b(bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        dVar = (com.moloco.sdk.acm.db.d) bVar.f6879a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    bVar.f6879a = null;
                    bVar.c = 2;
                    if (dVar.d(bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            bVar = new com.moloco.sdk.acm.db.d.a.b(continuation);
            java.lang.Object obj2 = bVar.b;
            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = bVar.c;
            if (i != 0) {
            }
            bVar.f6879a = null;
            bVar.c = 2;
            if (dVar.d(bVar) == coroutine_suspended) {
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    long a(com.moloco.sdk.acm.db.b bVar);

    com.moloco.sdk.acm.db.b a(long j);

    java.lang.Object a(java.util.List<java.lang.Long> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object a(kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.acm.db.b>> continuation);

    java.util.List<com.moloco.sdk.acm.db.b> a();

    java.util.List<java.lang.Long> a(java.util.List<com.moloco.sdk.acm.db.b> list);

    java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.util.List<com.moloco.sdk.acm.db.b> b();

    java.util.List<java.lang.Long> b(java.util.List<com.moloco.sdk.acm.db.b> list);

    java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object d(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
