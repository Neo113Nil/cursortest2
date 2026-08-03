package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public final class h implements com.moloco.sdk.internal.services.init.g {
    public static final com.moloco.sdk.internal.services.init.h.a d = new com.moloco.sdk.internal.services.init.h.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "InitCacheImpl";
    public final android.content.SharedPreferences b;
    public final kotlin.coroutines.CoroutineContext c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$clearAll$2", f = "InitCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7290a;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.h.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.init.h.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.init.h.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7290a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.services.init.h.this.b.edit().clear().commit();
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$clearCache$2", f = "InitCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7291a;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder b;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a c;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.h d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.internal.services.init.h hVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.h.c> continuation) {
            super(2, continuation);
            this.b = metricsRecorder;
            this.c = aVar;
            this.d = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.init.h.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.services.init.h.c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7291a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.acm.TimerEvent startTimerEvent = this.b.startTimerEvent("SDKInitCacheClear");
            try {
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Clearing cache for cacheKey: " + this.c.c(), null, false, 12, null);
                android.content.SharedPreferences.Editor edit = this.d.b.edit();
                com.moloco.sdk.internal.services.init.h hVar = this.d;
                com.moloco.sdk.internal.services.init.a aVar = this.c;
                kotlin.jvm.internal.Intrinsics.checkNotNull(edit);
                hVar.a(aVar, edit);
                edit.remove(this.c.c());
                if (edit.commit()) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Successfully cleared cache for cacheKey: " + this.c.c(), null, false, 12, null);
                    this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent("SDKInitCacheClear").withTag("Result", "success"));
                    this.b.recordTimerEvent(startTimerEvent.withTag("Result", "success"));
                } else {
                    com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Failed to clear cache for cacheKey: " + this.c.c(), null, false, 12, null);
                    this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent("SDKInitCacheClear").withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("Reason", "commit_failure"));
                    this.b.recordTimerEvent(startTimerEvent.withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("Reason", "commit_failure"));
                }
            } catch (java.lang.Exception e) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.h.f, "Failed to clear cache for cacheKey: " + this.c.c() + " with exception", e, false, 8, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.b;
                com.moloco.sdk.acm.CountEvent withTag = new com.moloco.sdk.acm.CountEvent("SDKInitCacheClear").withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                java.lang.String simpleName = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                metricsRecorder.recordCountEvent(withTag.withTag("Reason", simpleName));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.b;
                com.moloco.sdk.acm.TimerEvent withTag2 = startTimerEvent.withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                java.lang.String simpleName2 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                metricsRecorder2.recordTimerEvent(withTag2.withTag("Reason", simpleName2));
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$get$2", f = "InitCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.Init.SDKInitResponse>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7292a;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder b;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a c;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.h d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.internal.services.init.h hVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.h.d> continuation) {
            super(2, continuation);
            this.b = metricsRecorder;
            this.c = aVar;
            this.d = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.Init.SDKInitResponse> continuation) {
            return ((com.moloco.sdk.internal.services.init.h.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.services.init.h.d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7292a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.acm.TimerEvent startTimerEvent = this.b.startTimerEvent("SDKInitCacheRead");
            try {
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Reading cache for cacheKey: " + this.c.c(), null, false, 12, null);
                com.moloco.sdk.internal.services.init.h hVar = this.d;
                hVar.b(this.c, hVar.b);
                java.lang.String string = this.d.b.getString(this.c.c(), null);
                com.moloco.sdk.Init.SDKInitResponse parseFrom = string != null ? com.moloco.sdk.Init.SDKInitResponse.parseFrom(android.util.Base64.decode(string, 0)) : null;
                if (parseFrom != null) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Successfully read cache for cacheKey: " + this.c.c(), null, false, 12, null);
                    this.b.recordTimerEvent(startTimerEvent.withTag("Result", "success"));
                    this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent("SDKInitCacheRead").withTag("Result", "success"));
                } else {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Failed to read from cache (cache_miss) for cacheKey: " + this.c.c(), null, false, 12, null);
                    this.b.recordTimerEvent(startTimerEvent.withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("Reason", "cache_miss"));
                    this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent("SDKInitCacheRead").withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("Reason", "cache_miss"));
                }
                return parseFrom;
            } catch (java.lang.Exception e) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.h.f, "Failed to read cache for cacheKey: " + this.c.c() + " with exception", e, false, 8, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.b;
                com.moloco.sdk.acm.TimerEvent withTag = startTimerEvent.withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                java.lang.String simpleName = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                metricsRecorder.recordTimerEvent(withTag.withTag("Reason", simpleName));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.b;
                com.moloco.sdk.acm.CountEvent withTag2 = new com.moloco.sdk.acm.CountEvent("SDKInitCacheRead").withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                java.lang.String simpleName2 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                metricsRecorder2.recordCountEvent(withTag2.withTag("Reason", simpleName2));
                return null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$updateCache$2", f = "InitCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7293a;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder b;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a c;
        public final /* synthetic */ com.moloco.sdk.Init.SDKInitResponse d;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.Init.SDKInitResponse sDKInitResponse, com.moloco.sdk.internal.services.init.h hVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.h.e> continuation) {
            super(2, continuation);
            this.b = metricsRecorder;
            this.c = aVar;
            this.d = sDKInitResponse;
            this.e = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.init.h.e) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.services.init.h.e(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7293a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.acm.TimerEvent startTimerEvent = this.b.startTimerEvent("SDKInitCacheWrite");
            try {
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Updating cache for cacheKey: " + this.c.c(), null, false, 12, null);
                boolean z = false;
                java.lang.String encodeToString = android.util.Base64.encodeToString(this.d.toByteArray(), 0);
                if (encodeToString == null || encodeToString.length() == 0) {
                    com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Failed to encode SDKInitResponse for cacheKey: " + this.c.c(), null, false, 12, null);
                    z = true;
                }
                if (z || !this.e.b.edit().putString(this.c.c(), encodeToString).commit()) {
                    java.lang.String str = z ? "encoding_failure" : "commit_failure";
                    com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Failed to update cache for cacheKey: " + this.c.c() + " with error: " + str, null, false, 12, null);
                    this.b.recordTimerEvent(startTimerEvent.withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("Reason", str));
                    this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent("SDKInitCacheWrite").withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("Reason", str));
                } else {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.h.f, "Successfully updated cache for cacheKey: " + this.c.c(), null, false, 12, null);
                    this.b.recordTimerEvent(startTimerEvent.withTag("Result", "success"));
                    this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent("SDKInitCacheWrite").withTag("Result", "success"));
                }
            } catch (java.lang.Exception e) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.h.f, "Failed to update cache for cacheKey: " + this.c.c() + " with exception", e, false, 8, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.b;
                com.moloco.sdk.acm.TimerEvent withTag = startTimerEvent.withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                java.lang.String simpleName = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                metricsRecorder.recordTimerEvent(withTag.withTag("Reason", simpleName));
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.b;
                com.moloco.sdk.acm.CountEvent withTag2 = new com.moloco.sdk.acm.CountEvent("SDKInitCacheWrite").withTag("Result", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                java.lang.String simpleName2 = e.getClass().getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                metricsRecorder2.recordCountEvent(withTag2.withTag("Reason", simpleName2));
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public h(android.content.SharedPreferences sharedPreferences, kotlin.coroutines.CoroutineContext ioDispatcherContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcherContext, "ioDispatcherContext");
        this.b = sharedPreferences;
        this.c = ioDispatcherContext;
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public java.lang.Object b(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.c, new com.moloco.sdk.internal.services.init.h.c(metricsRecorder, aVar, this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public final void b(com.moloco.sdk.internal.services.init.a aVar, android.content.SharedPreferences sharedPreferences) {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "Performing migration for cache key: " + aVar.c(), null, false, 12, null);
        a(aVar, sharedPreferences);
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public java.lang.Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.Init.SDKInitResponse sDKInitResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.c, new com.moloco.sdk.internal.services.init.h.e(metricsRecorder, aVar, sDKInitResponse, this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public java.lang.Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.Init.SDKInitResponse> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.c, new com.moloco.sdk.internal.services.init.h.d(metricsRecorder, aVar, this, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.c, new com.moloco.sdk.internal.services.init.h.b(null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public final void a(com.moloco.sdk.internal.services.init.a aVar, android.content.SharedPreferences sharedPreferences) {
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, f, "Migrating from v0 to v1 for cache key: " + aVar.c(), null, false, 12, null);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, f, "Total keys in cache: " + sharedPreferences.getAll().size(), null, false, 12, null);
        java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) key, new java.lang.String[]{"___"}, false, 0, 6, (java.lang.Object) null);
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.firstOrNull(split$default), aVar.b()) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.lastOrNull(split$default), "v0")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, f, "Number of existing V0 keys in cache: " + linkedHashMap.size(), null, false, 12, null);
        if (linkedHashMap.isEmpty()) {
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, f, "No v0 cache keys found for migration for appKey: " + aVar.b(), null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, f, "Found v0 cache key: " + ((java.lang.String) kotlin.collections.CollectionsKt.first(linkedHashMap.keySet())) + ", migrating to new key: " + aVar.c(), null, false, 12, null);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        java.lang.String c2 = aVar.c();
        java.lang.Object first = kotlin.collections.CollectionsKt.first(linkedHashMap.values());
        edit.putString(c2, first instanceof java.lang.String ? (java.lang.String) first : null);
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            edit.remove((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
        edit.commit();
    }

    public final void a(com.moloco.sdk.internal.services.init.a aVar, android.content.SharedPreferences.Editor editor) {
        java.util.Iterator<java.lang.String> it = aVar.d().iterator();
        while (it.hasNext()) {
            editor.remove(it.next());
        }
    }
}
