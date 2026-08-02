package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u008a@¨\u0006\u0004"}, d2 = {"<anonymous>", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "com/statsig/androidsdk/StatsigNetworkImpl$postRequest$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1", f = "StatsigNetwork.kt", i = {0, 0, 0, 0, 0, 0}, l = {628}, m = "invokeSuspend", n = {"errorMessage", "end", androidx.core.app.NotificationCompat.CATEGORY_CALL, "response", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "code"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0"})
/* loaded from: classes16.dex */
public final class StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse>, java.lang.Object> {
    final /* synthetic */ java.lang.String $bodyString;
    final /* synthetic */ com.statsig.androidsdk.ContextType $contextType;
    final /* synthetic */ com.statsig.androidsdk.Diagnostics $diagnostics;
    final /* synthetic */ java.lang.String $eventsCount;
    final /* synthetic */ java.lang.String $requestCacheKey;
    final /* synthetic */ int $retries;
    final /* synthetic */ java.lang.String $stableID;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef $statusCode$inlined;
    final /* synthetic */ java.lang.Integer $timeout;
    final /* synthetic */ com.statsig.androidsdk.UrlConfig $urlConfig;
    int I$0;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0363  */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v35, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        long elapsedRealtimeNanos;
        kotlin.jvm.internal.Ref.LongRef longRef;
        okhttp3.Call call;
        okhttp3.Call call2;
        com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
        java.lang.String str;
        com.statsig.androidsdk.Marker.ErrorMessage errorMessage;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver2;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        okhttp3.Call call3;
        okhttp3.Response response;
        long j;
        com.statsig.androidsdk.Diagnostics diagnostics;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        com.statsig.androidsdk.GZipRequestInterceptor gZipRequestInterceptor;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.LongRef longRef3;
        long j2;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        okhttp3.Call call4;
        com.google.gson.Gson gson;
        java.lang.Object fromJson;
        kotlinx.coroutines.CoroutineScope coroutineScope3;
        kotlinx.coroutines.CoroutineDispatcher io2;
        kotlin.jvm.functions.Function2 anonymousClass1;
        java.io.BufferedReader bufferedReader;
        com.google.gson.Gson gson2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            longRef = new kotlin.jvm.internal.Ref.LongRef();
            try {
                com.statsig.androidsdk.UrlConfig urlConfig = this.$urlConfig;
                networkFallbackResolver = this.this$0.networkResolver;
                urlConfig.setFallbackUrl(networkFallbackResolver.getActiveFallbackUrlFromMemory(this.$urlConfig));
                java.lang.String fallbackUrl = this.$urlConfig.getFallbackUrl();
                if (fallbackUrl == null) {
                    fallbackUrl = this.$urlConfig.getUrl();
                }
                java.net.URL url = new java.net.URL(fallbackUrl);
                okhttp3.OkHttpClient.Builder newBuilder = com.statsig.androidsdk.HttpUtils.INSTANCE.getHttpClient$android_sdk_release().newBuilder();
                if (this.$timeout != null) {
                    kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                    java.time.Duration ofSeconds = java.time.Duration.ofSeconds(kotlin.time.Duration.m23956getInWholeSecondsimpl(kotlin.time.DurationKt.toDuration(this.$timeout.intValue(), kotlin.time.DurationUnit.MILLISECONDS)), kotlin.time.Duration.m23958getNanosecondsComponentimpl(r13));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofSeconds, "");
                    newBuilder.callTimeout(ofSeconds);
                }
                com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                com.statsig.androidsdk.UrlConfig urlConfig2 = this.$urlConfig;
                java.lang.String obj2 = url.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                if (statsigNetworkImpl.shouldCompressLogEvent$android_sdk_release(urlConfig2, obj2)) {
                    gZipRequestInterceptor = this.this$0.gzipInterceptor;
                    newBuilder.addInterceptor(gZipRequestInterceptor);
                }
                okhttp3.OkHttpClient build = newBuilder.build();
                okhttp3.Request.Builder post = new okhttp3.Request.Builder().url(url).post(com.statsig.androidsdk.HttpUtilsKt.toJsonRequestBody(this.$bodyString));
                str = this.this$0.sdkKey;
                okhttp3.Request.Builder addStatsigHeaders = com.statsig.androidsdk.HttpUtilsKt.addStatsigHeaders(post, str);
                java.lang.String str2 = this.$eventsCount;
                if (str2 != null) {
                    addStatsigHeaders.addHeader(com.statsig.androidsdk.HttpUtils.STATSIG_EVENT_COUNT, str2);
                }
                java.lang.String str3 = this.$stableID;
                if (str3 != null) {
                    addStatsigHeaders.addHeader(com.statsig.androidsdk.HttpUtils.STATSIG_STABLE_ID_HEADER_KEY, str3);
                }
                call = build.newCall(addStatsigHeaders.build());
            } catch (java.lang.Exception e) {
                e = e;
                call = null;
            } catch (java.lang.Throwable th) {
                th = th;
                call = null;
            }
            try {
                if (this.$requestCacheKey != null && this.$urlConfig.getEndpoint() != com.statsig.androidsdk.Endpoint.Rgstr) {
                    map = this.this$0.initializeRequestsMap;
                    if (map.size() > 10) {
                        map3 = this.this$0.initializeRequestsMap;
                        java.util.Iterator it = map3.values().iterator();
                        while (it.hasNext()) {
                            ((okhttp3.Call) it.next()).cancel();
                        }
                        this.this$0.initializeRequestsMap = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
                    }
                    map2 = this.this$0.initializeRequestsMap;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map2, "");
                    map2.put(this.$requestCacheKey, call);
                }
                if (this.$contextType != null && (diagnostics = this.$diagnostics) != null) {
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(diagnostics.markStart(com.statsig.androidsdk.KeyType.INITIALIZE, com.statsig.androidsdk.StepType.NETWORK_REQUEST, new com.statsig.androidsdk.Marker(null, null, null, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$retries), null, null, null, null, null, null, null, null, 1046527, null), this.$contextType));
                }
                okhttp3.Response execute = call.execute();
                int code = execute.code();
                if (code >= 400) {
                    okhttp3.ResponseBody body = execute.body();
                    objectRef.element = body != null ? body.string() : 0;
                    errorMessage = new com.statsig.androidsdk.Marker.ErrorMessage((java.lang.String) objectRef.element, java.lang.String.valueOf(code), null);
                } else {
                    errorMessage = null;
                }
                this.this$0.endDiagnostics(this.$diagnostics, this.$contextType, com.statsig.androidsdk.KeyType.INITIALIZE, kotlin.coroutines.jvm.internal.Boxing.boxInt(code), okhttp3.Response.header$default(execute, "x-statsig-region", null, 2, null), kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$retries), errorMessage, this.$timeout);
                this.$statusCode$inlined.element = kotlin.coroutines.jvm.internal.Boxing.boxInt(code);
                if (200 > code || code >= 300) {
                    if (call != null && call.isExecuted()) {
                        call.cancel();
                    }
                    longRef.element = android.os.SystemClock.elapsedRealtimeNanos();
                    coroutineScope = this.this$0.coroutineScope;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, this.this$0.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass3(longRef, elapsedRealtimeNanos, this.$timeout, this.this$0, this.$urlConfig, objectRef, null), 2, null);
                    return null;
                }
                networkFallbackResolver2 = this.this$0.networkResolver;
                this.L$0 = objectRef;
                this.L$1 = longRef;
                this.L$2 = call;
                this.L$3 = execute;
                this.J$0 = elapsedRealtimeNanos;
                this.I$0 = code;
                this.label = 1;
                if (networkFallbackResolver2.tryBumpExpiryTime(this.$urlConfig, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = code;
                longRef2 = longRef;
                objectRef2 = objectRef;
                call3 = call;
                response = execute;
                j = elapsedRealtimeNanos;
            } catch (java.lang.Exception e2) {
                e = e2;
                call4 = call;
                objectRef2 = objectRef;
                j2 = elapsedRealtimeNanos;
                objectRef3 = objectRef2;
                longRef3 = longRef;
                call3 = call4;
                objectRef3.element = e.getMessage();
                throw e;
            } catch (java.lang.Throwable th2) {
                th = th2;
                call2 = call;
                if (call2 != null) {
                }
                longRef.element = android.os.SystemClock.elapsedRealtimeNanos();
                coroutineScope2 = this.this$0.coroutineScope;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, this.this$0.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass4(longRef, elapsedRealtimeNanos, this.$timeout, this.this$0, this.$urlConfig, objectRef, null), 2, null);
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            j2 = this.J$0;
            okhttp3.Response response2 = (okhttp3.Response) this.L$3;
            call3 = (okhttp3.Call) this.L$2;
            longRef3 = (kotlin.jvm.internal.Ref.LongRef) this.L$1;
            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
            try {
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef2 = objectRef3;
                    response = response2;
                    j = j2;
                    longRef2 = longRef3;
                } catch (java.lang.Exception e3) {
                    e = e3;
                    objectRef3.element = e.getMessage();
                    throw e;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                call2 = call3;
                longRef = longRef3;
                objectRef = objectRef3;
                elapsedRealtimeNanos = j2;
                if (call2 != null) {
                    call2.cancel();
                }
                longRef.element = android.os.SystemClock.elapsedRealtimeNanos();
                coroutineScope2 = this.this$0.coroutineScope;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, this.this$0.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass4(longRef, elapsedRealtimeNanos, this.$timeout, this.this$0, this.$urlConfig, objectRef, null), 2, null);
                throw th;
            }
        }
        try {
            try {
                if (i == 204) {
                    try {
                        try {
                            if (this.$urlConfig.getEndpoint() == com.statsig.androidsdk.Endpoint.Initialize) {
                                gson = this.this$0.gson;
                                fromJson = gson.fromJson("{has_updates: false}", (java.lang.Class<java.lang.Object>) com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse.class);
                                if (call3 != null && call3.isExecuted()) {
                                    call3.cancel();
                                }
                                longRef2.element = android.os.SystemClock.elapsedRealtimeNanos();
                                coroutineScope3 = this.this$0.coroutineScope;
                                io2 = this.this$0.dispatcherProvider.getIo();
                                anonymousClass1 = new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass1(longRef2, j, this.$timeout, this.this$0, this.$urlConfig, objectRef2, null);
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, io2, null, anonymousClass1, 2, null);
                                return fromJson;
                            }
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            elapsedRealtimeNanos = j;
                            call4 = call3;
                            longRef = longRef2;
                            j2 = elapsedRealtimeNanos;
                            objectRef3 = objectRef2;
                            longRef3 = longRef;
                            call3 = call4;
                            objectRef3.element = e.getMessage();
                            throw e;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        elapsedRealtimeNanos = j;
                        call2 = call3;
                        objectRef = objectRef2;
                        longRef = longRef2;
                        if (call2 != null && call2.isExecuted()) {
                            call2.cancel();
                        }
                        longRef.element = android.os.SystemClock.elapsedRealtimeNanos();
                        coroutineScope2 = this.this$0.coroutineScope;
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, this.this$0.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass4(longRef, elapsedRealtimeNanos, this.$timeout, this.this$0, this.$urlConfig, objectRef, null), 2, null);
                        throw th;
                    }
                }
                gson2 = this.this$0.gson;
                fromJson = gson2.fromJson((java.io.Reader) bufferedReader, (java.lang.Class<java.lang.Object>) com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse.class);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                if (call3 != null && call3.isExecuted()) {
                    call3.cancel();
                }
                longRef2.element = android.os.SystemClock.elapsedRealtimeNanos();
                coroutineScope3 = this.this$0.coroutineScope;
                io2 = this.this$0.dispatcherProvider.getIo();
                anonymousClass1 = new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass2(longRef2, j, this.$timeout, this.this$0, this.$urlConfig, objectRef2, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, io2, null, anonymousClass1, 2, null);
                return fromJson;
            } finally {
            }
            okhttp3.ResponseBody body2 = response.body();
            kotlin.jvm.internal.Intrinsics.checkNotNull(body2);
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(body2.byteStream(), kotlin.text.Charsets.UTF_8), 8192);
        } catch (java.lang.Exception e5) {
            e = e5;
            elapsedRealtimeNanos = j;
            call = call3;
            objectRef = objectRef2;
            longRef = longRef2;
            call4 = call;
            objectRef2 = objectRef;
            j2 = elapsedRealtimeNanos;
            objectRef3 = objectRef2;
            longRef3 = longRef;
            call3 = call4;
            objectRef3.element = e.getMessage();
            throw e;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "com/statsig/androidsdk/StatsigNetworkImpl$postRequest$3$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3$3", f = "StatsigNetwork.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_GENERATION_FAILED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $end;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ java.lang.Integer $timeout;
        final /* synthetic */ com.statsig.androidsdk.UrlConfig $urlConfig;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
            com.statsig.androidsdk.StatsigNetworkConnectivityListener statsigNetworkConnectivityListener;
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = (this.$end.element - this.$start) / 1000000000;
                java.lang.Integer num = this.$timeout;
                boolean z = j > ((long) (num != null ? num.intValue() : 0));
                networkFallbackResolver = this.this$0.networkResolver;
                com.statsig.androidsdk.UrlConfig urlConfig = this.$urlConfig;
                java.lang.String str = (java.lang.String) this.$errorMessage.element;
                statsigNetworkConnectivityListener = this.this$0.connectivityListener;
                this.label = 1;
                obj = networkFallbackResolver.tryFetchUpdatedFallbackInfo(urlConfig, str, z, statsigNetworkConnectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                com.statsig.androidsdk.UrlConfig urlConfig2 = this.$urlConfig;
                networkFallbackResolver2 = this.this$0.networkResolver;
                urlConfig2.setFallbackUrl(networkFallbackResolver2.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass1(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.jvm.internal.Ref.LongRef longRef, long j, java.lang.Integer num, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, com.statsig.androidsdk.UrlConfig urlConfig, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "com/statsig/androidsdk/StatsigNetworkImpl$postRequest$3$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3$3", f = "StatsigNetwork.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_GENERATION_FAILED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $end;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ java.lang.Integer $timeout;
        final /* synthetic */ com.statsig.androidsdk.UrlConfig $urlConfig;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
            com.statsig.androidsdk.StatsigNetworkConnectivityListener statsigNetworkConnectivityListener;
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = (this.$end.element - this.$start) / 1000000000;
                java.lang.Integer num = this.$timeout;
                boolean z = j > ((long) (num != null ? num.intValue() : 0));
                networkFallbackResolver = this.this$0.networkResolver;
                com.statsig.androidsdk.UrlConfig urlConfig = this.$urlConfig;
                java.lang.String str = (java.lang.String) this.$errorMessage.element;
                statsigNetworkConnectivityListener = this.this$0.connectivityListener;
                this.label = 1;
                obj = networkFallbackResolver.tryFetchUpdatedFallbackInfo(urlConfig, str, z, statsigNetworkConnectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                com.statsig.androidsdk.UrlConfig urlConfig2 = this.$urlConfig;
                networkFallbackResolver2 = this.this$0.networkResolver;
                urlConfig2.setFallbackUrl(networkFallbackResolver2.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass2(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kotlin.jvm.internal.Ref.LongRef longRef, long j, java.lang.Integer num, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, com.statsig.androidsdk.UrlConfig urlConfig, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "com/statsig/androidsdk/StatsigNetworkImpl$postRequest$3$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3$3", f = "StatsigNetwork.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_GENERATION_FAILED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $end;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ java.lang.Integer $timeout;
        final /* synthetic */ com.statsig.androidsdk.UrlConfig $urlConfig;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
            com.statsig.androidsdk.StatsigNetworkConnectivityListener statsigNetworkConnectivityListener;
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = (this.$end.element - this.$start) / 1000000000;
                java.lang.Integer num = this.$timeout;
                boolean z = j > ((long) (num != null ? num.intValue() : 0));
                networkFallbackResolver = this.this$0.networkResolver;
                com.statsig.androidsdk.UrlConfig urlConfig = this.$urlConfig;
                java.lang.String str = (java.lang.String) this.$errorMessage.element;
                statsigNetworkConnectivityListener = this.this$0.connectivityListener;
                this.label = 1;
                obj = networkFallbackResolver.tryFetchUpdatedFallbackInfo(urlConfig, str, z, statsigNetworkConnectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                com.statsig.androidsdk.UrlConfig urlConfig2 = this.$urlConfig;
                networkFallbackResolver2 = this.this$0.networkResolver;
                urlConfig2.setFallbackUrl(networkFallbackResolver2.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass3(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(kotlin.jvm.internal.Ref.LongRef longRef, long j, java.lang.Integer num, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, com.statsig.androidsdk.UrlConfig urlConfig, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "com/statsig/androidsdk/StatsigNetworkImpl$postRequest$3$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3$3", f = "StatsigNetwork.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_GENERATION_FAILED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $end;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef $errorMessage;
        final /* synthetic */ long $start;
        final /* synthetic */ java.lang.Integer $timeout;
        final /* synthetic */ com.statsig.androidsdk.UrlConfig $urlConfig;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver;
            com.statsig.androidsdk.StatsigNetworkConnectivityListener statsigNetworkConnectivityListener;
            com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = (this.$end.element - this.$start) / 1000000000;
                java.lang.Integer num = this.$timeout;
                boolean z = j > ((long) (num != null ? num.intValue() : 0));
                networkFallbackResolver = this.this$0.networkResolver;
                com.statsig.androidsdk.UrlConfig urlConfig = this.$urlConfig;
                java.lang.String str = (java.lang.String) this.$errorMessage.element;
                statsigNetworkConnectivityListener = this.this$0.connectivityListener;
                this.label = 1;
                obj = networkFallbackResolver.tryFetchUpdatedFallbackInfo(urlConfig, str, z, statsigNetworkConnectivityListener.isNetworkAvailable(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                com.statsig.androidsdk.UrlConfig urlConfig2 = this.$urlConfig;
                networkFallbackResolver2 = this.this$0.networkResolver;
                urlConfig2.setFallbackUrl(networkFallbackResolver2.getActiveFallbackUrlFromMemory(this.$urlConfig));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1.AnonymousClass4(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(kotlin.jvm.internal.Ref.LongRef longRef, long j, java.lang.Integer num, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, com.statsig.androidsdk.UrlConfig urlConfig, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$end = longRef;
            this.$start = j;
            this.$timeout = num;
            this.this$0 = statsigNetworkImpl;
            this.$urlConfig = urlConfig;
            this.$errorMessage = objectRef;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse> continuation) {
        return ((com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1(this.$urlConfig, this.this$0, this.$timeout, this.$bodyString, this.$eventsCount, this.$stableID, this.$requestCacheKey, this.$contextType, this.$diagnostics, this.$retries, continuation, this.$statusCode$inlined);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1(com.statsig.androidsdk.UrlConfig urlConfig, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.statsig.androidsdk.ContextType contextType, com.statsig.androidsdk.Diagnostics diagnostics, int i, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.$urlConfig = urlConfig;
        this.this$0 = statsigNetworkImpl;
        this.$timeout = num;
        this.$bodyString = str;
        this.$eventsCount = str2;
        this.$stableID = str3;
        this.$requestCacheKey = str4;
        this.$contextType = contextType;
        this.$diagnostics = diagnostics;
        this.$retries = i;
        this.$statusCode$inlined = objectRef;
    }
}
