package com.moloco.sdk.internal.ilrd;

/* loaded from: classes5.dex */
public final class b implements androidx.lifecycle.DefaultLifecycleObserver {
    public static final com.moloco.sdk.internal.ilrd.b.c s = new com.moloco.sdk.internal.ilrd.b.c(null);
    public static final int t = 8;
    public static final java.lang.String u = "IlrdEventsRepository";
    public static final java.lang.String v = "ilrd_session_store";
    public static final java.lang.String w = "ilrd_events_store";

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f6971a;
    public final java.lang.String b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final com.moloco.sdk.internal.services.J h;
    public final com.moloco.sdk.internal.services.InterfaceC3433d i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final com.moloco.sdk.internal.services.w l;
    public final com.moloco.sdk.internal.ilrd.e m;
    public final com.moloco.sdk.internal.ilrd.e n;
    public final com.moloco.sdk.internal.ilrd.e o;
    public final kotlinx.coroutines.sync.Mutex p;
    public com.moloco.sdk.internal.ilrd.a q;
    public final java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> r;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$1", f = "IlrdEventsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6972a;
        public final /* synthetic */ androidx.lifecycle.Lifecycle b;
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.lifecycle.Lifecycle lifecycle, com.moloco.sdk.internal.ilrd.b bVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.a> continuation) {
            super(2, continuation);
            this.b = lifecycle;
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.ilrd.b.a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6972a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.b.addObserver(this.c);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$2", f = "IlrdEventsRepository.kt", i = {0, 1}, l = {499, 119}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.moloco.sdk.internal.ilrd.b$b, reason: collision with other inner class name */
    public static final class C0179b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6973a;
        public java.lang.Object b;
        public int c;

        public C0179b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.C0179b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.C0179b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new C0179b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.sync.Mutex mutex;
            com.moloco.sdk.internal.ilrd.b bVar;
            kotlinx.coroutines.sync.Mutex mutex2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = com.moloco.sdk.internal.ilrd.b.this.p;
                    bVar = com.moloco.sdk.internal.ilrd.b.this;
                    this.f6973a = mutex;
                    this.b = bVar;
                    this.c = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (kotlinx.coroutines.sync.Mutex) this.f6973a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit;
                        } catch (java.lang.Throwable th) {
                            kotlinx.coroutines.sync.Mutex mutex3 = mutex2;
                            th = th;
                            mutex = mutex3;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    bVar = (com.moloco.sdk.internal.ilrd.b) this.b;
                    kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) this.f6973a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                }
                this.f6973a = mutex;
                this.b = null;
                this.c = 2;
                if (bVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                mutex2.unlock(null);
                return unit2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ void b() {
        }

        public c() {
        }

        public final byte[] a(byte[] bArr) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                    return byteArray;
                } finally {
                }
            } finally {
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$onEvent$1", f = "IlrdEventsRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {499, 251, 259, 267}, m = "invokeSuspend", n = {"shouldSend", "$this$withLock_u24default$iv", "shouldSend", "$this$withLock_u24default$iv", "shouldSend", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6974a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public int e;
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.d.a g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.internal.ilrd.d.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.d> continuation) {
            super(2, continuation);
            this.g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new d(this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x011a A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:16:0x0114, B:18:0x011a, B:19:0x011c), top: B:14:0x0032 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e9 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:31:0x004a, B:32:0x00b0, B:34:0x00e9, B:35:0x00ef), top: B:30:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0110 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.jvm.internal.Ref.BooleanRef booleanRef;
            com.moloco.sdk.internal.ilrd.b bVar;
            kotlinx.coroutines.sync.Mutex mutex;
            com.moloco.sdk.internal.ilrd.d.a aVar;
            kotlinx.coroutines.sync.Mutex mutex2;
            com.moloco.sdk.internal.ilrd.b bVar2;
            kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
            kotlinx.coroutines.sync.Mutex mutex3;
            com.moloco.sdk.internal.ilrd.b bVar3;
            kotlin.jvm.internal.Ref.BooleanRef booleanRef3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlinx.coroutines.sync.Mutex mutex4 = com.moloco.sdk.internal.ilrd.b.this.p;
                    bVar = com.moloco.sdk.internal.ilrd.b.this;
                    com.moloco.sdk.internal.ilrd.d.a aVar2 = this.g;
                    this.f6974a = booleanRef;
                    this.b = mutex4;
                    this.c = bVar;
                    this.d = aVar2;
                    this.e = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex4;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            bVar3 = (com.moloco.sdk.internal.ilrd.b) this.c;
                            mutex3 = (kotlinx.coroutines.sync.Mutex) this.b;
                            booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.f6974a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (bVar3.h()) {
                                    booleanRef3.element = true;
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                mutex3.unlock(null);
                                if (booleanRef3.element) {
                                    com.moloco.sdk.internal.ilrd.b bVar4 = com.moloco.sdk.internal.ilrd.b.this;
                                    this.f6974a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.e = 4;
                                    if (bVar4.b(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        aVar = (com.moloco.sdk.internal.ilrd.d.a) this.d;
                        bVar2 = (com.moloco.sdk.internal.ilrd.b) this.c;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) this.b;
                        booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.f6974a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue a2 = bVar2.a(aVar);
                            java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> b = bVar2.b();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(a2);
                            b.add(a2);
                            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Event id ");
                            sb.append(a2.getEventId());
                            sb.append(" added. Count: ");
                            sb.append(bVar2.b().size());
                            sb.append(", current events in session: ");
                            com.moloco.sdk.internal.ilrd.a e = bVar2.e();
                            sb.append(e == null ? e.b() : null);
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.ilrd.b.u, sb.toString(), null, false, 12, null);
                            this.f6974a = booleanRef2;
                            this.b = mutex2;
                            this.c = bVar2;
                            this.d = null;
                            this.e = 3;
                            if (bVar2.c(this) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            bVar3 = bVar2;
                            mutex3 = mutex2;
                            booleanRef3 = booleanRef2;
                            if (bVar3.h()) {
                            }
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            mutex3.unlock(null);
                            if (booleanRef3.element) {
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            mutex3 = mutex2;
                            mutex3.unlock(null);
                            throw th;
                        }
                    }
                    aVar = (com.moloco.sdk.internal.ilrd.d.a) this.d;
                    bVar = (com.moloco.sdk.internal.ilrd.b) this.c;
                    mutex = (kotlinx.coroutines.sync.Mutex) this.b;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.f6974a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                bVar.a();
                bVar.j();
                com.moloco.sdk.internal.ilrd.a e2 = bVar.e();
                if (e2 != null) {
                    e2.a(aVar);
                }
                this.f6974a = booleanRef;
                this.b = mutex;
                this.c = bVar;
                this.d = aVar;
                this.e = 2;
                if (bVar.d(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar2 = bVar;
                mutex2 = mutex;
                booleanRef2 = booleanRef;
                com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue a22 = bVar2.a(aVar);
                java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> b2 = bVar2.b();
                kotlin.jvm.internal.Intrinsics.checkNotNull(a22);
                b2.add(a22);
                com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Event id ");
                sb2.append(a22.getEventId());
                sb2.append(" added. Count: ");
                sb2.append(bVar2.b().size());
                sb2.append(", current events in session: ");
                com.moloco.sdk.internal.ilrd.a e3 = bVar2.e();
                sb2.append(e3 == null ? e3.b() : null);
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, com.moloco.sdk.internal.ilrd.b.u, sb2.toString(), null, false, 12, null);
                this.f6974a = booleanRef2;
                this.b = mutex2;
                this.c = bVar2;
                this.d = null;
                this.e = 3;
                if (bVar2.c(this) != coroutine_suspended) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                mutex2 = mutex;
                mutex3 = mutex2;
                mutex3.unlock(null);
                throw th;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", i = {0, 1, 1, 2, 5, 5, 6}, l = {148, androidx.compose.material.TextFieldImplKt.AnimationDuration, 153, 166, 176, 194, 205, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "restoreSavedSession", n = {"this", "this", "existingSession", "this", "this", "restoredSession", "this"}, s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0"})
    public static final class e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6975a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public e(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.ilrd.b.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$restoreSavedSession$restoredSession$1", f = "IlrdEventsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.a>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6976a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.f> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.a> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6976a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return new com.moloco.sdk.internal.ilrd.a(com.moloco.sdk.internal.ilrd.b.this.h, this.c);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleInactiveSessionExpiry$1", f = "IlrdEventsRepository.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6977a;

        public g(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.g> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.g) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6977a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a e = com.moloco.sdk.internal.ilrd.b.this.e();
                if (e != null) {
                    e.a();
                }
                com.moloco.sdk.internal.ilrd.b bVar = com.moloco.sdk.internal.ilrd.b.this;
                this.f6977a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleMaxSessionLength$1", f = "IlrdEventsRepository.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6978a;

        public h(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.h> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.h) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6978a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a e = com.moloco.sdk.internal.ilrd.b.this.e();
                if (e != null) {
                    e.a();
                }
                com.moloco.sdk.internal.ilrd.b bVar = com.moloco.sdk.internal.ilrd.b.this;
                this.f6978a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleUploadIntervalScheduler$1", f = "IlrdEventsRepository.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6979a;

        public i(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.i> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.i) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6979a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.b bVar = com.moloco.sdk.internal.ilrd.b.this;
                this.f6979a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$sendEvents$1", f = "IlrdEventsRepository.kt", i = {}, l = {com.ironsource.InterfaceC3141l1.a.b.f}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6980a;

        public j(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.j) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6980a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.b bVar = com.moloco.sdk.internal.ilrd.b.this;
                this.f6980a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", i = {0, 0, 1, 1, 1}, l = {499, 437}, m = "sendEventsSuspending", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "compressed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class k extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6981a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public k(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.ilrd.b.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeEventsToPersistentStorage$2", f = "IlrdEventsRepository.kt", i = {}, l = {448, 455}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6982a;

        public l(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.l) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.b.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6982a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.moloco.sdk.internal.ilrd.b.this.b().isEmpty()) {
                com.moloco.sdk.internal.services.w wVar = com.moloco.sdk.internal.ilrd.b.this.l;
                this.f6982a = 1;
                if (wVar.a(com.moloco.sdk.internal.ilrd.b.w, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            java.lang.String encodeToString = android.util.Base64.encodeToString(com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.newBuilder().addAllEvents(com.moloco.sdk.internal.ilrd.b.this.b()).build().toByteArray(), 2);
            com.moloco.sdk.internal.services.w wVar2 = com.moloco.sdk.internal.ilrd.b.this.l;
            this.f6982a = 2;
            if (wVar2.a(com.moloco.sdk.internal.ilrd.b.w, encodeToString, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeSessionToPersistentStorage$2", f = "IlrdEventsRepository.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6983a;
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.a b;
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.moloco.sdk.internal.ilrd.a aVar, com.moloco.sdk.internal.ilrd.b bVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.b.m> continuation) {
            super(2, continuation);
            this.b = aVar;
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.b.m) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.ilrd.b.m(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6983a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String f = this.b.f();
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.b.u, "Storing current session: " + f, null, false, 12, null);
                com.moloco.sdk.internal.services.w wVar = this.c.l;
                this.f6983a = 1;
                if (wVar.a(com.moloco.sdk.internal.ilrd.b.v, f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, com.moloco.sdk.internal.services.J j5, androidx.lifecycle.Lifecycle lifecycle, com.moloco.sdk.internal.services.InterfaceC3433d interfaceC3433d, java.lang.String str2, java.lang.String str3, com.moloco.sdk.internal.services.w wVar, com.moloco.sdk.internal.ilrd.e eVar, com.moloco.sdk.internal.ilrd.e eVar2, com.moloco.sdk.internal.ilrd.e eVar3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, j5, lifecycle, interfaceC3433d, str2, str3, wVar, eVar, eVar2, eVar3);
    }

    public static /* synthetic */ void c() {
    }

    public final com.moloco.sdk.internal.ilrd.a e() {
        return this.q;
    }

    public final com.moloco.sdk.internal.ilrd.e f() {
        return this.m;
    }

    public final com.moloco.sdk.internal.ilrd.e g() {
        return this.n;
    }

    public final boolean h() {
        boolean z = this.r.size() >= this.e;
        if (z) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "batch size reached", null, false, 12, null);
        }
        return z;
    }

    public final synchronized void i() {
        a();
        j();
    }

    public final void j() {
        this.m.a(this.d, new com.moloco.sdk.internal.ilrd.b.g(null));
    }

    public final void k() {
        this.o.a(this.f, new com.moloco.sdk.internal.ilrd.b.i(null));
    }

    public final void l() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6971a, null, null, new com.moloco.sdk.internal.ilrd.b.j(null), 3, null);
    }

    public final void m() {
        com.moloco.sdk.internal.ilrd.a aVar = new com.moloco.sdk.internal.ilrd.a(this.h, null, 2, null);
        this.q = aVar;
        a(this.g);
        k();
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "New session started: sessionId=" + aVar.c() + ", maxBatch=" + this.e + ", uploadInterval=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(this.f)) + ", sessionExp=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(this.d)) + ", maxLength=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(this.g)), null, false, 12, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(androidx.lifecycle.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "onPause called, sending events", null, false, 12, null);
        l();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public b(kotlinx.coroutines.CoroutineScope scope, java.lang.String url, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, long j2, int i2, long j3, long j4, com.moloco.sdk.internal.services.J timeProvider, androidx.lifecycle.Lifecycle processLifeycle, com.moloco.sdk.internal.services.InterfaceC3433d advertisingIdService, java.lang.String pubId, java.lang.String appId, com.moloco.sdk.internal.services.w dataStoreService, com.moloco.sdk.internal.ilrd.e sessionInactiveScheduler, com.moloco.sdk.internal.ilrd.e sessionMaxLengthScheduler, com.moloco.sdk.internal.ilrd.e scheduledUploadScheduler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processLifeycle, "processLifeycle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisingIdService, "advertisingIdService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubId, "pubId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionInactiveScheduler, "sessionInactiveScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionMaxLengthScheduler, "sessionMaxLengthScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledUploadScheduler, "scheduledUploadScheduler");
        this.f6971a = scope;
        this.b = url;
        this.c = persistentHttpRequest;
        this.d = j2;
        this.e = i2;
        this.f = j3;
        this.g = j4;
        this.h = timeProvider;
        this.i = advertisingIdService;
        this.j = pubId;
        this.k = appId;
        this.l = dataStoreService;
        this.m = sessionInactiveScheduler;
        this.n = sessionMaxLengthScheduler;
        this.o = scheduledUploadScheduler;
        this.p = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.r = new java.util.ArrayList();
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "ILRD repository initialized - url=" + url + ", uploadInterval=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(j3)) + ", maxBatchSize=" + i2 + ", sessionExpiry=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(j2)) + ", maxSessionLength=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(j4)), null, false, 12, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, com.moloco.sdk.internal.scheduling.b.a().getMainImmediate(), null, new com.moloco.sdk.internal.ilrd.b.a(processLifeycle, this, null), 2, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.moloco.sdk.internal.ilrd.b.C0179b(null), 3, null);
    }

    public final com.moloco.sdk.internal.ilrd.e d() {
        return this.o;
    }

    public final java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> b() {
        return this.r;
    }

    public final java.lang.Object d(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext;
        com.moloco.sdk.internal.ilrd.a aVar = this.q;
        return (aVar != null && (withContext = kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new com.moloco.sdk.internal.ilrd.b.m(aVar, this, null), continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? withContext : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.ilrd.b.e eVar;
        com.moloco.sdk.internal.ilrd.b bVar;
        java.lang.String str;
        long duration;
        java.lang.String str2;
        long j2;
        com.moloco.sdk.internal.ilrd.a aVar;
        java.lang.String str3;
        java.lang.Exception exc;
        com.moloco.sdk.internal.services.w wVar;
        if (continuation instanceof com.moloco.sdk.internal.ilrd.b.e) {
            eVar = (com.moloco.sdk.internal.ilrd.b.e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (eVar.e) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.services.w wVar2 = this.l;
                        eVar.f6975a = this;
                        eVar.e = 1;
                        obj = wVar2.d(v, eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bVar = this;
                        str = (java.lang.String) obj;
                        if (str != null) {
                            return kotlin.Unit.INSTANCE;
                        }
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Existing session found: " + str, null, false, 12, null);
                        com.moloco.sdk.internal.services.w wVar3 = bVar.l;
                        eVar.f6975a = bVar;
                        eVar.b = str;
                        eVar.e = 2;
                        if (wVar3.a(v, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        com.moloco.sdk.internal.ilrd.b.f fVar = bVar.new f(str, null);
                        eVar.f6975a = bVar;
                        eVar.b = null;
                        eVar.e = 3;
                        obj = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, fVar, eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.internal.ilrd.a aVar2 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a2 = bVar.h.a();
                        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                        long d2 = a2 - aVar2.d();
                        kotlin.time.DurationUnit durationUnit = kotlin.time.DurationUnit.MILLISECONDS;
                        duration = kotlin.time.DurationKt.toDuration(d2, durationUnit);
                        long i3 = aVar2.b().i();
                        if (kotlin.time.Duration.m12145compareToLRDsOJo(duration, bVar.g) > 0) {
                            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded maximum length.", null, false, 12, null);
                            com.moloco.sdk.internal.services.w wVar4 = bVar.l;
                            eVar.f6975a = null;
                            eVar.e = 4;
                            if (wVar4.a(w, eVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        str2 = w;
                        if (i3 > 0) {
                            j2 = a2;
                            if (a2 - i3 > kotlin.time.Duration.m12157getInWholeMillisecondsimpl(bVar.d)) {
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded inactivity timeout", null, false, 12, null);
                                com.moloco.sdk.internal.services.w wVar5 = bVar.l;
                                eVar.f6975a = null;
                                eVar.e = 5;
                                if (wVar5.a(str2, eVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        } else {
                            j2 = a2;
                        }
                        long duration2 = kotlin.time.DurationKt.toDuration(j2 - aVar2.d(), durationUnit);
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "ILRD session restored successfully - sessionId=" + aVar2.c() + ", age=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(duration2)) + ", impressions=" + aVar2.b(), null, false, 12, null);
                        bVar.q = aVar2;
                        bVar.k();
                        bVar.a(kotlin.time.Duration.m12174minusLRDsOJo(bVar.g, duration));
                        com.moloco.sdk.internal.services.w wVar6 = bVar.l;
                        eVar.f6975a = bVar;
                        eVar.b = aVar2;
                        eVar.e = 6;
                        java.lang.Object d3 = wVar6.d(str2, eVar);
                        if (d3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = aVar2;
                        obj = d3;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                            try {
                                java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> eventsList = com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.parseFrom(android.util.Base64.decode(str3, 0)).getEventsList();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventsList, "getEventsList(...)");
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.Object obj2 : eventsList) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) obj2).getSessionId(), aVar.c())) {
                                        arrayList.add(obj2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    bVar.r.addAll(arrayList);
                                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Restored " + arrayList.size() + " pending ILRD events for sessionId=" + aVar.c(), null, false, 12, null);
                                } else {
                                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "No pending ILRD events matched restored sessionId=" + aVar.c() + "; clearing persisted events", null, false, 12, null);
                                    com.moloco.sdk.internal.services.w wVar7 = bVar.l;
                                    eVar.f6975a = bVar;
                                    eVar.b = null;
                                    eVar.e = 7;
                                    if (wVar7.a(str2, eVar) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } catch (java.lang.Exception e2) {
                                exc = e2;
                                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Failed to restore persisted ILRD events", exc, false, 8, null);
                                wVar = bVar.l;
                                eVar.f6975a = null;
                                eVar.b = null;
                                eVar.e = 8;
                                if (wVar.a(str2, eVar) == coroutine_suspended) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    case 1:
                        bVar = (com.moloco.sdk.internal.ilrd.b) eVar.f6975a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = (java.lang.String) obj;
                        if (str != null) {
                        }
                        break;
                    case 2:
                        java.lang.String str4 = (java.lang.String) eVar.b;
                        com.moloco.sdk.internal.ilrd.b bVar2 = (com.moloco.sdk.internal.ilrd.b) eVar.f6975a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = str4;
                        bVar = bVar2;
                        kotlin.coroutines.CoroutineContext coroutineContext2 = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        com.moloco.sdk.internal.ilrd.b.f fVar2 = bVar.new f(str, null);
                        eVar.f6975a = bVar;
                        eVar.b = null;
                        eVar.e = 3;
                        obj = kotlinx.coroutines.BuildersKt.withContext(coroutineContext2, fVar2, eVar);
                        if (obj == coroutine_suspended) {
                        }
                        com.moloco.sdk.internal.ilrd.a aVar22 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a22 = bVar.h.a();
                        kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
                        long d22 = a22 - aVar22.d();
                        kotlin.time.DurationUnit durationUnit2 = kotlin.time.DurationUnit.MILLISECONDS;
                        duration = kotlin.time.DurationKt.toDuration(d22, durationUnit2);
                        long i32 = aVar22.b().i();
                        if (kotlin.time.Duration.m12145compareToLRDsOJo(duration, bVar.g) > 0) {
                        }
                        break;
                    case 3:
                        bVar = (com.moloco.sdk.internal.ilrd.b) eVar.f6975a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.ilrd.a aVar222 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a222 = bVar.h.a();
                        kotlin.time.Duration.Companion companion22 = kotlin.time.Duration.INSTANCE;
                        long d222 = a222 - aVar222.d();
                        kotlin.time.DurationUnit durationUnit22 = kotlin.time.DurationUnit.MILLISECONDS;
                        duration = kotlin.time.DurationKt.toDuration(d222, durationUnit22);
                        long i322 = aVar222.b().i();
                        if (kotlin.time.Duration.m12145compareToLRDsOJo(duration, bVar.g) > 0) {
                        }
                        break;
                    case 4:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 5:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 6:
                        com.moloco.sdk.internal.ilrd.a aVar3 = (com.moloco.sdk.internal.ilrd.a) eVar.b;
                        com.moloco.sdk.internal.ilrd.b bVar3 = (com.moloco.sdk.internal.ilrd.b) eVar.f6975a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str2 = w;
                        aVar = aVar3;
                        bVar = bVar3;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                        }
                        return kotlin.Unit.INSTANCE;
                    case 7:
                        bVar = (com.moloco.sdk.internal.ilrd.b) eVar.f6975a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.lang.Exception e3) {
                            exc = e3;
                            str2 = w;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Failed to restore persisted ILRD events", exc, false, 8, null);
                            wVar = bVar.l;
                            eVar.f6975a = null;
                            eVar.b = null;
                            eVar.e = 8;
                            if (wVar.a(str2, eVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        return kotlin.Unit.INSTANCE;
                    case 8:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new com.moloco.sdk.internal.ilrd.b.e(continuation);
        java.lang.Object obj3 = eVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (eVar.e) {
        }
    }

    public final void b(com.moloco.sdk.internal.ilrd.d.a ilrdData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        kotlinx.coroutines.BuildersKt.launch(this.f6971a, kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, new com.moloco.sdk.internal.ilrd.b.d(ilrdData, null));
    }

    public final java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new com.moloco.sdk.internal.ilrd.b.l(null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ b(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, com.moloco.sdk.internal.services.J j5, androidx.lifecycle.Lifecycle lifecycle, com.moloco.sdk.internal.services.InterfaceC3433d interfaceC3433d, java.lang.String str2, java.lang.String str3, com.moloco.sdk.internal.services.w wVar, com.moloco.sdk.internal.ilrd.e eVar, com.moloco.sdk.internal.ilrd.e eVar2, com.moloco.sdk.internal.ilrd.e eVar3, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, j5, lifecycle, interfaceC3433d, str2, str3, wVar, (i3 & 8192) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, j5, "SessionInactiveScheduler") : eVar, (i3 & 16384) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, j5, "SessionMaxLengthScheduler") : eVar2, (i3 & 32768) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, j5, "UploadIntervalScheduler") : eVar3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:27:0x006a, B:29:0x0072, B:30:0x0085, B:32:0x00a2, B:34:0x00a8, B:35:0x00af), top: B:26:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:27:0x006a, B:29:0x0072, B:30:0x0085, B:32:0x00a2, B:34:0x00a8, B:35:0x00af), top: B:26:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.ilrd.b.k kVar;
        int i2;
        kotlinx.coroutines.sync.Mutex mutex;
        com.moloco.sdk.internal.ilrd.b bVar;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Throwable th;
        byte[] a2;
        com.moloco.sdk.internal.ilrd.b bVar2;
        try {
            if (continuation instanceof com.moloco.sdk.internal.ilrd.b.k) {
                kVar = (com.moloco.sdk.internal.ilrd.b.k) continuation;
                int i3 = kVar.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kVar.f = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = kVar.d;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = kVar.f;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        k();
                        mutex = this.p;
                        kVar.f6981a = this;
                        kVar.b = mutex;
                        kVar.f = 1;
                        if (mutex.lock(null, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bVar = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a2 = (byte[]) kVar.c;
                            mutex2 = (kotlinx.coroutines.sync.Mutex) kVar.b;
                            bVar2 = (com.moloco.sdk.internal.ilrd.b) kVar.f6981a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                if (a2 != null) {
                                    bVar2.c.a(bVar2.b, a2, io.ktor.http.ContentType.Application.INSTANCE.getProtoBuf(), "gzip");
                                }
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) kVar.b;
                        bVar = (com.moloco.sdk.internal.ilrd.b) kVar.f6981a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    if (!bVar.r.isEmpty()) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Request for sendEvent came, but event list is empty. Returning", null, false, 12, null);
                        mutex2 = mutex;
                        bVar2 = bVar;
                        a2 = null;
                    } else {
                        com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder newBuilder = com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.newBuilder();
                        newBuilder.setOs(com.ironsource.X3.d);
                        newBuilder.setPublisherId(bVar.j);
                        newBuilder.setPublisherAppId(bVar.k);
                        com.moloco.sdk.internal.services.AbstractC3432c a3 = bVar.i.a();
                        com.moloco.sdk.internal.services.AbstractC3432c.a aVar = a3 instanceof com.moloco.sdk.internal.services.AbstractC3432c.a ? (com.moloco.sdk.internal.services.AbstractC3432c.a) a3 : null;
                        if (aVar != null) {
                            newBuilder.setDeviceId(aVar.b());
                        }
                        newBuilder.addAllEvents(bVar.r);
                        com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest build = newBuilder.build();
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Ilrd request created now sending it with " + build.getEventsList().size() + " events", null, false, 12, null);
                        com.moloco.sdk.internal.ilrd.b.c cVar = s;
                        byte[] byteArray = build.toByteArray();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                        a2 = cVar.a(byteArray);
                        bVar.r.clear();
                        com.moloco.sdk.internal.services.w wVar = bVar.l;
                        kVar.f6981a = bVar;
                        kVar.b = mutex;
                        kVar.c = a2;
                        kVar.f = 2;
                        if (wVar.a(w, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex;
                        bVar2 = bVar;
                    }
                    mutex2.unlock(null);
                    if (a2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (!bVar.r.isEmpty()) {
            }
            mutex2.unlock(null);
            if (a2 != null) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        kVar = new com.moloco.sdk.internal.ilrd.b.k(continuation);
        java.lang.Object obj2 = kVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.f;
        if (i2 != 0) {
        }
    }

    public final com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue a(com.moloco.sdk.internal.ilrd.d.a aVar) {
        com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder eventId = com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.newBuilder().setEventId(java.util.UUID.randomUUID().toString());
        com.moloco.sdk.internal.ilrd.a aVar2 = this.q;
        if (aVar2 != null) {
            eventId.setSessionId(aVar2.c());
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            long duration = kotlin.time.DurationKt.toDuration(this.h.a() - aVar2.d(), kotlin.time.DurationUnit.MILLISECONDS);
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Event created: sessionId=" + aVar2.c() + ", sessionAge=" + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(duration)), null, false, 12, null);
        }
        if (aVar instanceof com.moloco.sdk.internal.ilrd.d.a.b) {
            eventId.setMax(((com.moloco.sdk.internal.ilrd.d.a.b) aVar).b());
        } else {
            if (!(aVar instanceof com.moloco.sdk.internal.ilrd.d.a.C0180a)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            eventId.setLevelplay(((com.moloco.sdk.internal.ilrd.d.a.C0180a) aVar).b());
        }
        return eventId.build();
    }

    public final void a() {
        com.moloco.sdk.internal.ilrd.a aVar = this.q;
        if (aVar != null && !aVar.e()) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            long duration = kotlin.time.DurationKt.toDuration(this.h.a() - aVar.d(), kotlin.time.DurationUnit.MILLISECONDS);
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Session validation - age: " + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(duration)) + ", limit: " + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(this.g)), null, false, 12, null);
            return;
        }
        m();
    }

    public final void a(long j2) {
        this.n.a(j2, new com.moloco.sdk.internal.ilrd.b.h(null));
    }
}
