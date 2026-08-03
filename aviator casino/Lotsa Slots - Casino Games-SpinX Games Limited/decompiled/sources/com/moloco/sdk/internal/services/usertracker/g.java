package com.moloco.sdk.internal.services.usertracker;

/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.internal.services.usertracker.f {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.e f7316a;
    public final com.moloco.sdk.internal.services.usertracker.b b;
    public final kotlinx.coroutines.sync.Mutex c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.usertracker.UserTrackerServiceImpl", f = "UserTrackerService.kt", i = {0, 0, 1}, l = {48, 29}, m = "clear", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7317a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.usertracker.g.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.usertracker.g.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.usertracker.UserTrackerServiceImpl", f = "UserTrackerService.kt", i = {0, 0, 1, 1, 2, 2}, l = {48, 33, 36}, m = "getIdentifier", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "currentId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7318a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.usertracker.g.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.usertracker.g.this.b(this);
        }
    }

    public g(com.moloco.sdk.internal.services.usertracker.e idGenerator, com.moloco.sdk.internal.services.usertracker.b idRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idRepository, "idRepository");
        this.f7316a = idGenerator;
        this.b = idRepository;
        this.c = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.moloco.sdk.internal.services.usertracker.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.services.usertracker.g.a aVar;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.moloco.sdk.internal.services.usertracker.g gVar;
        com.moloco.sdk.internal.services.usertracker.b bVar;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            if (continuation instanceof com.moloco.sdk.internal.services.usertracker.g.a) {
                aVar = (com.moloco.sdk.internal.services.usertracker.g.a) continuation;
                int i2 = aVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = aVar.c;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.c;
                        aVar.f7317a = this;
                        aVar.b = mutex;
                        aVar.e = 1;
                        if (mutex.lock(null, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) aVar.f7317a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                mutex2.unlock(null);
                                return unit;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                mutex = mutex2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) aVar.b;
                        gVar = (com.moloco.sdk.internal.services.usertracker.g) aVar.f7317a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    bVar = gVar.b;
                    aVar.f7317a = mutex;
                    aVar.b = null;
                    aVar.e = 2;
                    if (bVar.a(aVar) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                }
            }
            bVar = gVar.b;
            aVar.f7317a = mutex;
            aVar.b = null;
            aVar.e = 2;
            if (bVar.a(aVar) != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
        aVar = new com.moloco.sdk.internal.services.usertracker.g.a(continuation);
        java.lang.Object obj2 = aVar.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:26:0x004c, B:27:0x0085, B:29:0x0089), top: B:25:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.moloco.sdk.internal.services.usertracker.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object b(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.moloco.sdk.internal.services.usertracker.g.b bVar;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.moloco.sdk.internal.services.usertracker.g gVar;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Throwable th;
        java.lang.Object b2;
        com.moloco.sdk.internal.services.usertracker.g gVar2;
        kotlinx.coroutines.sync.Mutex mutex3;
        java.lang.String str;
        java.lang.String str2;
        try {
            if (continuation instanceof com.moloco.sdk.internal.services.usertracker.g.b) {
                bVar = (com.moloco.sdk.internal.services.usertracker.g.b) continuation;
                int i2 = bVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = bVar.c;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.c;
                        bVar.f7318a = this;
                        bVar.b = mutex;
                        bVar.e = 1;
                        if (mutex.lock(null, bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str2 = (java.lang.String) bVar.b;
                                mutex2 = (kotlinx.coroutines.sync.Mutex) bVar.f7318a;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    mutex2.unlock(null);
                                    return str2;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    throw th;
                                }
                            }
                            mutex3 = (kotlinx.coroutines.sync.Mutex) bVar.b;
                            gVar2 = (com.moloco.sdk.internal.services.usertracker.g) bVar.f7318a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                str = (java.lang.String) obj;
                                if (str == null) {
                                    str = gVar2.f7316a.a();
                                    com.moloco.sdk.internal.services.usertracker.b bVar2 = gVar2.b;
                                    bVar.f7318a = mutex3;
                                    bVar.b = str;
                                    bVar.e = 3;
                                    if (bVar2.a(str, bVar) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                str2 = str;
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                return str2;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) bVar.b;
                        gVar = (com.moloco.sdk.internal.services.usertracker.g) bVar.f7318a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex4;
                    }
                    com.moloco.sdk.internal.services.usertracker.b bVar3 = gVar.b;
                    bVar.f7318a = gVar;
                    bVar.b = mutex;
                    bVar.e = 2;
                    b2 = bVar3.b(bVar);
                    if (b2 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gVar2 = gVar;
                    mutex3 = mutex;
                    obj = b2;
                    str = (java.lang.String) obj;
                    if (str == null) {
                    }
                    str2 = str;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    return str2;
                }
            }
            com.moloco.sdk.internal.services.usertracker.b bVar32 = gVar.b;
            bVar.f7318a = gVar;
            bVar.b = mutex;
            bVar.e = 2;
            b2 = bVar32.b(bVar);
            if (b2 != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th4) {
            mutex2 = mutex;
            th = th4;
            mutex3 = mutex2;
            mutex3.unlock(null);
            throw th;
        }
        bVar = new com.moloco.sdk.internal.services.usertracker.g.b(continuation);
        java.lang.Object obj2 = bVar.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
    }
}
