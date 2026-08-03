package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* loaded from: classes5.dex */
public final class j implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.a k = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.a(null);
    public static final int l = 8;
    public static final java.lang.String m = "MediaCacheRepository";
    public static final java.lang.String n = "TEMP";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l f7474a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f d;
    public final kotlinx.coroutines.CoroutineScope e;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlinx.coroutines.sync.Mutex> f;
    public final java.util.HashSet<java.lang.String> g;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b> h;
    public final kotlinx.coroutines.CoroutineScope i;
    public kotlinx.coroutines.Job j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }

        public final java.lang.String a(java.lang.String str) {
            return str + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.n;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$getMediaFile$2", f = "MediaCacheRepository.kt", i = {0, 1, 1, 1}, l = {372, 160}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "dstFile", "tmpFile"}, s = {"L$0", "L$0", "L$2", "L$3"})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7475a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public int e;
        public final /* synthetic */ java.lang.String f;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.b> continuation) {
            super(2, continuation);
            this.f = str;
            this.g = jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.b(this.f, this.g, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x019d A[Catch: all -> 0x0034, Exception -> 0x0037, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x002b, B:10:0x0197, B:12:0x019d, B:14:0x01b5, B:18:0x01db, B:25:0x01f4), top: B:2:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01e4  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            ?? r11;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar;
            java.lang.String str;
            java.lang.Object putIfAbsent;
            kotlinx.coroutines.sync.Mutex mutex;
            java.io.File file;
            java.io.File file2;
            java.lang.Object a2;
            java.lang.Object obj2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a aVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
            } catch (java.lang.Throwable th) {
                th = th;
                r11 = coroutine_suspended;
            }
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.f.length() == 0) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.k.c;
                    }
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.g.f;
                    java.lang.String str2 = this.f;
                    java.lang.Object obj3 = concurrentHashMap.get(str2);
                    if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str2, (obj3 = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null)))) != null) {
                        obj3 = putIfAbsent;
                    }
                    kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) obj3;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(mutex2);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar2 = this.g;
                    java.lang.String str3 = this.f;
                    this.f7475a = mutex2;
                    this.b = jVar2;
                    this.c = str3;
                    this.e = 1;
                    if (mutex2.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jVar = jVar2;
                    str = str3;
                    r11 = mutex2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.io.File file3 = (java.io.File) this.d;
                        java.io.File file4 = (java.io.File) this.c;
                        java.lang.String str4 = (java.lang.String) this.b;
                        mutex = (kotlinx.coroutines.sync.Mutex) this.f7475a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            file = file4;
                            file2 = file3;
                            a2 = obj;
                            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) a2;
                            if (aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b) {
                                mutex.unlock(null);
                                return aVar;
                            }
                            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Renaming tmp file to dst file", false, 4, null);
                            if (file2.renameTo(file)) {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b(file);
                                mutex.unlock(null);
                                return bVar;
                            }
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Renaming to dst file failed, dstFile exists: " + file.exists(), null, false, 12, null);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.p pVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.p.c;
                            mutex.unlock(null);
                            return pVar;
                        } catch (java.lang.Exception e) {
                            e = e;
                            str = str4;
                            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Failed to fetch media from url: " + str, e, false, 8, null);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o.a(e);
                            mutex.unlock(null);
                            return a3;
                        }
                    }
                    str = (java.lang.String) this.c;
                    jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j) this.b;
                    kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.f7475a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r11 = mutex3;
                }
                com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> d = jVar.d();
                if (d instanceof com.moloco.sdk.internal.v.a) {
                    com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Failed to retrieve storageDir with error code: " + ((com.moloco.sdk.internal.m) ((com.moloco.sdk.internal.v.a) d).a()).b(), null, false, 12, null);
                    switch (((com.moloco.sdk.internal.m) ((com.moloco.sdk.internal.v.a) d).a()).b()) {
                        case 100:
                            obj2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.c.c;
                            break;
                        case 101:
                            obj2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.b.c;
                            break;
                        case 102:
                            obj2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.C0235a.c;
                            break;
                        default:
                            obj2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.d.c;
                            break;
                    }
                    r11.unlock(null);
                    return obj2;
                }
                if (!(d instanceof com.moloco.sdk.internal.v.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.io.File file5 = (java.io.File) ((com.moloco.sdk.internal.v.b) d).a();
                java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I.b(str);
                file = new java.io.File(file5, b);
                if (file.exists()) {
                    if (!jVar.c.a(file)) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Found asset in cache: " + str, null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b(file);
                        r11.unlock(null);
                        return bVar2;
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Media file was partially downloaded by ChunkedMediaDownloader. Deleting the file and redownloading", null, false, 12, null);
                    file.delete();
                }
                file2 = new java.io.File(file5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.k.a(b));
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Asset not found in cache. Downloading to tmp file[already exists == " + file2.exists() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, false, 4, null);
                if (file2.exists()) {
                    file2.delete();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d dVar = jVar.b;
                this.f7475a = r11;
                this.b = str;
                this.c = file;
                this.d = file2;
                this.e = 2;
                a2 = dVar.a(str, file2, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = r11;
                aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) a2;
                if (aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b) {
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                mutex = r11;
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Failed to fetch media from url: " + str, e, false, 8, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a a32 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o.a(e);
                mutex.unlock(null);
                return a32;
            } catch (java.lang.Throwable th2) {
                th = th2;
                r11.unlock(null);
                throw th;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFile$2", f = "MediaCacheRepository.kt", i = {0}, l = {372}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7476a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public int e;
        public final /* synthetic */ java.lang.String f;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j g;
        public final /* synthetic */ java.lang.String h;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFile$2$1$1", f = "MediaCacheRepository.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7477a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j b;
            public final /* synthetic */ java.lang.String c;
            public final /* synthetic */ java.io.File d;
            public final /* synthetic */ java.lang.String e;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar, java.lang.String str, java.io.File file, java.lang.String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c.a> continuation) {
                super(2, continuation);
                this.b = jVar;
                this.c = str;
                this.d = file;
                this.e = str2;
                this.f = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c.a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7477a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a aVar = this.b.c;
                    java.lang.String str = this.c;
                    java.io.File file = this.d;
                    java.lang.String str2 = this.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = this.f;
                    this.f7477a = 1;
                    if (aVar.a(str, file, str2, bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.b.g.remove(this.c);
                this.b.h.remove(this.c);
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar, java.lang.String str2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c> continuation) {
            super(2, continuation);
            this.f = str;
            this.g = jVar;
            this.h = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c(this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.sync.Mutex mutex;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar;
            java.lang.String str;
            java.lang.String str2;
            java.lang.Object putIfAbsent;
            java.lang.Object putIfAbsent2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c c0237c;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Streaming media for: " + this.f, null, false, 12, null);
                if (this.f.length() == 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.k.c);
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.g.f;
                java.lang.String str3 = this.f;
                java.lang.Object obj2 = concurrentHashMap.get(str3);
                if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str3, (obj2 = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null)))) != null) {
                    obj2 = putIfAbsent;
                }
                mutex = (kotlinx.coroutines.sync.Mutex) obj2;
                kotlin.jvm.internal.Intrinsics.checkNotNull(mutex);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar2 = this.g;
                java.lang.String str4 = this.f;
                java.lang.String str5 = this.h;
                this.f7476a = mutex;
                this.b = jVar2;
                this.c = str4;
                this.d = str5;
                this.e = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jVar = jVar2;
                str = str4;
                str2 = str5;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str6 = (java.lang.String) this.d;
                java.lang.String str7 = (java.lang.String) this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j) this.b;
                mutex = (kotlinx.coroutines.sync.Mutex) this.f7476a;
                kotlin.ResultKt.throwOnFailure(obj);
                str2 = str6;
                str = str7;
                jVar = jVar3;
            }
            try {
                com.moloco.sdk.internal.v c = jVar.c();
                if (c instanceof com.moloco.sdk.internal.v.a) {
                    return ((com.moloco.sdk.internal.v.a) c).a();
                }
                if (!(c instanceof com.moloco.sdk.internal.v.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.io.File a2 = jVar.a(str, (java.io.File) ((com.moloco.sdk.internal.v.b) c).a());
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Going to download the media file to location: " + a2.getAbsolutePath(), null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) jVar.h.get(str);
                if (jVar.g.contains(str)) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Media file is already being downloaded, so returning in progress status for url: " + str, null, false, 12, null);
                    if (bVar == null || (c0237c = bVar.a()) == null) {
                        c0237c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a());
                    }
                    return c0237c;
                }
                if (jVar.c.b(a2)) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a(a2);
                }
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Media file needs to be downloaded: " + str, null, false, 12, null);
                jVar.g.add(str);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = jVar.h;
                java.lang.Object obj3 = concurrentHashMap2.get(str);
                if (obj3 == null && (putIfAbsent2 = concurrentHashMap2.putIfAbsent(str, (obj3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a()))))) != null) {
                    obj3 = putIfAbsent2;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) obj3;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(jVar.e, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c.a(jVar, str, a2, str2, bVar2, null), 3, null);
                return bVar2.a();
            } finally {
                mutex.unlock(null);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFileStatus$1", f = "MediaCacheRepository.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7478a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ java.io.File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.io.File file, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.d> continuation) {
            super(2, continuation);
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.d) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.d(this.c, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7478a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a(this.c);
                this.f7478a = 1;
                if (flowCollector.emit(aVar, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFileStatus$cacheDir$1", f = "MediaCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7479a;
        public final /* synthetic */ com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b> vVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.e> continuation) {
            super(2, continuation);
            this.b = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.e) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.e(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7479a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ((com.moloco.sdk.internal.v.a) this.b).a();
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$tryCleanup$newCleanUpJob$1", f = "MediaCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7480a;

        public f(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7480a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.this.d.a();
            if (a2 instanceof com.moloco.sdk.internal.v.b) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.this.a((java.io.File) ((com.moloco.sdk.internal.v.b) a2).a());
            } else {
                if (!(a2 instanceof com.moloco.sdk.internal.v.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Failed to cleanup external cache directory", null, false, 12, null);
            }
            com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.this.d.b();
            if (b instanceof com.moloco.sdk.internal.v.b) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.this.a((java.io.File) ((com.moloco.sdk.internal.v.b) b).a());
            } else {
                if (!(b instanceof com.moloco.sdk.internal.v.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.m, "Failed to cleanup internal cache directory", null, false, 12, null);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l mediaConfig, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d legacyMediaDownloader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a chunkedMediaDownloader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f mediaCacheLocationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyMediaDownloader, "legacyMediaDownloader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chunkedMediaDownloader, "chunkedMediaDownloader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCacheLocationProvider, "mediaCacheLocationProvider");
        this.f7474a = mediaConfig;
        this.b = legacyMediaDownloader;
        this.c = chunkedMediaDownloader;
        this.d = mediaCacheLocationProvider;
        this.e = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo());
        this.f = new java.util.concurrent.ConcurrentHashMap<>();
        this.g = new java.util.HashSet<>();
        this.h = new java.util.concurrent.ConcurrentHashMap<>();
        this.i = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo());
    }

    public final com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b> c() {
        com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> d2 = d();
        if (!(d2 instanceof com.moloco.sdk.internal.v.a)) {
            if (d2 instanceof com.moloco.sdk.internal.v.b) {
                return new com.moloco.sdk.internal.v.b(((com.moloco.sdk.internal.v.b) d2).a());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.String str = m;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to retrieve storageDir with error code: ");
        com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) d2;
        sb.append(((com.moloco.sdk.internal.m) aVar.a()).b());
        com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger, str, sb.toString(), null, false, 12, null);
        switch (((com.moloco.sdk.internal.m) aVar.a()).b()) {
            case 100:
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.c.c));
            case 101:
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.b.c));
            case 102:
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.C0235a.c));
            default:
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.d.c));
        }
    }

    public final com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> d() {
        com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> a2 = this.d.a();
        if (a2 instanceof com.moloco.sdk.internal.v.a) {
            return this.d.b();
        }
        if (a2 instanceof com.moloco.sdk.internal.v.b) {
            return a2;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    public kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> b(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b> c2 = c();
        if (c2 instanceof com.moloco.sdk.internal.v.a) {
            return kotlinx.coroutines.flow.FlowKt.flow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.e(c2, null));
        }
        if (c2 instanceof com.moloco.sdk.internal.v.b) {
            java.io.File file = (java.io.File) ((com.moloco.sdk.internal.v.b) c2).a();
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            java.lang.String str = m;
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "Collecting status for media file: " + url, null, false, 12, null);
            java.io.File a2 = a(url, file);
            if (a2.exists() && this.c.b(a2)) {
                return kotlinx.coroutines.flow.FlowKt.flow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.d(a2, null));
            }
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "Media file needs to be downloaded: " + url, null, false, 12, null);
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b> concurrentHashMap = this.h;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = concurrentHashMap.get(url);
            if (bVar == null) {
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "Download has not yet started for: " + url, null, false, 12, null);
                bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a()));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b putIfAbsent = concurrentHashMap.putIfAbsent(url, bVar);
                if (putIfAbsent != null) {
                    bVar = putIfAbsent;
                }
            }
            return bVar.b();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.b(str, this, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    public java.lang.Object a(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.c(str, this, str2, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a(java.lang.String url) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b> c2 = c();
        if (c2 instanceof com.moloco.sdk.internal.v.a) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) ((com.moloco.sdk.internal.v.a) c2).a();
        }
        if (c2 instanceof com.moloco.sdk.internal.v.b) {
            java.io.File a3 = a(url, (java.io.File) ((com.moloco.sdk.internal.v.b) c2).a());
            if (a3.exists() && this.c.b(a3)) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a(a3);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = this.h.get(url);
            return (bVar == null || (a2 = bVar.a()) == null) ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(a3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a()) : a2;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.io.File a(java.lang.String str, java.io.File file) {
        return new java.io.File(file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I.b(str));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i
    public kotlinx.coroutines.Job a() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.j;
        if (job != null && job.isActive()) {
            return job;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.i, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.f(null), 3, null);
        this.j = launch$default;
        return launch$default;
    }

    public final void a(java.io.File file) {
        try {
            if (kotlin.sequences.SequencesKt.sumOfLong(kotlin.sequences.SequencesKt.map(kotlin.io.FilesKt.walkTopDown(file), new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.b((java.io.File) obj));
                }
            })) < this.f7474a.f()) {
                return;
            }
            try {
                kotlin.io.FilesKt.deleteRecursively(file);
            } catch (java.lang.Exception e2) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, e2.toString(), e2, false, 8, null);
            }
        } catch (java.lang.Exception e3) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, e3.toString(), e3, false, 8, null);
        }
    }

    public static final long b(java.io.File it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.length();
    }
}
