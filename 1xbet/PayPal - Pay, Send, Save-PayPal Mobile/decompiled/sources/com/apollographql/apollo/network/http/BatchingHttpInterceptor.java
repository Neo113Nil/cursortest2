package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0019\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "", "batchIntervalMillis", "", "maxBatchSize", "", "exposeErrorBody", "<init>", "(JIZ)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "request", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "chain", "Lcom/apollographql/apollo/api/http/HttpResponse;", "intercept", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "getHighSpeedVideoSizes", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "()V", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Z", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "getInputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getInputFormats", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/sync/Mutex;", "getOutputFormats", "Lkotlinx/coroutines/sync/Mutex;", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "", "Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$PendingRequest;", "getOutputMinFrameDuration", "Ljava/util/List;", "Companion", "PendingRequest"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BatchingHttpInterceptor implements com.apollographql.apollo.network.http.HttpInterceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.network.http.BatchingHttpInterceptor.Companion INSTANCE = new com.apollographql.apollo.network.http.BatchingHttpInterceptor.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getOutputFormats;
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.apollographql.apollo.network.http.HttpInterceptorChain getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineScope getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizesFor;
    private final java.util.List<com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest> getOutputMinFrameDuration;

    public BatchingHttpInterceptor(long j, int i, boolean z) {
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
        kotlinx.coroutines.CoroutineDispatcher limitedParallelism$default = kotlinx.coroutines.CoroutineDispatcher.limitedParallelism$default(kotlinx.coroutines.Dispatchers.getDefault(), 1, null, 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = limitedParallelism$default;
        this.getInputFormats = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(limitedParallelism$default);
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getOutputMinFrameDuration = new java.util.ArrayList();
    }

    public /* synthetic */ BatchingHttpInterceptor(long j, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10L : j, (i2 & 2) != 0 ? 10 : i, (i2 & 4) != 0 ? false : z);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$PendingRequest;", "", "Lcom/apollographql/apollo/api/http/HttpRequest;", "request", "<init>", "(Lcom/apollographql/apollo/api/http/HttpRequest;)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "getRequest", "()Lcom/apollographql/apollo/api/http/HttpRequest;", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/apollographql/apollo/api/http/HttpResponse;", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "getDeferred", "()Lkotlinx/coroutines/CompletableDeferred;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class PendingRequest {
        private final kotlinx.coroutines.CompletableDeferred<com.apollographql.apollo.api.http.HttpResponse> deferred;
        private final com.apollographql.apollo.api.http.HttpRequest request;

        public PendingRequest(com.apollographql.apollo.api.http.HttpRequest httpRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
            this.request = httpRequest;
            this.deferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }

        public final com.apollographql.apollo.api.http.HttpRequest getRequest() {
            return this.request;
        }

        public final kotlinx.coroutines.CompletableDeferred<com.apollographql.apollo.api.http.HttpResponse> getDeferred() {
            return this.deferred;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        if (getHighSpeedVideoSizes(false, r4) != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
    
        if (r0.lock(null, r4) == r5) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:19:0x004f, B:32:0x00d7, B:36:0x00eb), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.apollographql.apollo.network.http.BatchingHttpInterceptor] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.apollographql.apollo.network.http.HttpInterceptorChain] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object intercept(com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.network.http.HttpInterceptorChain httpInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
        com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1 batchingHttpInterceptor$intercept$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest pendingRequest;
        kotlinx.coroutines.sync.Mutex mutex;
        com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest pendingRequest2;
        int i2;
        ?? r2 = httpInterceptorChain;
        try {
            if (continuation instanceof com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1) {
                batchingHttpInterceptor$intercept$1 = (com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1) continuation;
                if ((batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = batchingHttpInterceptor$intercept$1.Camera2StreamConfigurationMap;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String valueOf = com.apollographql.apollo.api.http.HttpHeaders.valueOf(httpRequest.getHeaders(), "X-APOLLO-CAN-BE-BATCHED");
                        if (valueOf != null && !java.lang.Boolean.parseBoolean(valueOf)) {
                            com.apollographql.apollo.api.http.HttpRequest.Builder newBuilder$default = com.apollographql.apollo.api.http.HttpRequest.newBuilder$default(httpRequest, null, null, 3, null);
                            java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers = httpRequest.getHeaders();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj2 : headers) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.apollographql.apollo.api.http.HttpHeader) obj2).getName(), "X-APOLLO-CAN-BE-BATCHED")) {
                                    arrayList.add(obj2);
                                }
                            }
                            com.apollographql.apollo.api.http.HttpRequest build = newBuilder$default.addHeaders(arrayList).build();
                            batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges = 1;
                            java.lang.Object proceed = r2.proceed(build, batchingHttpInterceptor$intercept$1);
                            if (proceed != coroutine_suspended) {
                                return proceed;
                            }
                        } else {
                            this.getInputSizeshNQ4ISI = r2;
                            pendingRequest = new com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest(httpRequest);
                            mutex = this.getHighSpeedVideoSizesFor;
                            batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRangesFor = pendingRequest;
                            batchingHttpInterceptor$intercept$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                            batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges = 2;
                        }
                    }
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        i2 = batchingHttpInterceptor$intercept$1.getHighSpeedVideoSizes;
                        r2 = (kotlinx.coroutines.sync.Mutex) batchingHttpInterceptor$intercept$1.getHighResolutionOutputSizeshNQ4ISI;
                        pendingRequest2 = (com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest) batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!(i2 != 0)) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputFormats, null, null, new com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$3(this, null), 3, null);
                        }
                        kotlinx.coroutines.CompletableDeferred<com.apollographql.apollo.api.http.HttpResponse> deferred = pendingRequest2.getDeferred();
                        batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRangesFor = null;
                        batchingHttpInterceptor$intercept$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges = 4;
                        java.lang.Object await = deferred.await(batchingHttpInterceptor$intercept$1);
                        return await == coroutine_suspended ? coroutine_suspended : await;
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) batchingHttpInterceptor$intercept$1.getHighResolutionOutputSizeshNQ4ISI;
                    pendingRequest = (com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest) batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    pendingRequest2 = pendingRequest;
                    r2 = mutex;
                    this.getOutputMinFrameDuration.add(pendingRequest2);
                    i2 = this.getOutputMinFrameDuration.size() < this.Camera2StreamConfigurationMap ? 1 : 0;
                    if (i2 != 0) {
                        batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRangesFor = pendingRequest2;
                        batchingHttpInterceptor$intercept$1.getHighResolutionOutputSizeshNQ4ISI = r2;
                        batchingHttpInterceptor$intercept$1.getHighSpeedVideoSizes = i2;
                        batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges = 3;
                    }
                    if (!(i2 != 0)) {
                    }
                    kotlinx.coroutines.CompletableDeferred<com.apollographql.apollo.api.http.HttpResponse> deferred2 = pendingRequest2.getDeferred();
                    batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRangesFor = null;
                    batchingHttpInterceptor$intercept$1.getHighResolutionOutputSizeshNQ4ISI = null;
                    batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges = 4;
                    java.lang.Object await2 = deferred2.await(batchingHttpInterceptor$intercept$1);
                    if (await2 == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            pendingRequest2 = pendingRequest;
            r2 = mutex;
            this.getOutputMinFrameDuration.add(pendingRequest2);
            if (this.getOutputMinFrameDuration.size() < this.Camera2StreamConfigurationMap) {
            }
            if (i2 != 0) {
            }
            if (!(i2 != 0)) {
            }
            kotlinx.coroutines.CompletableDeferred<com.apollographql.apollo.api.http.HttpResponse> deferred22 = pendingRequest2.getDeferred();
            batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRangesFor = null;
            batchingHttpInterceptor$intercept$1.getHighResolutionOutputSizeshNQ4ISI = null;
            batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges = 4;
            java.lang.Object await22 = deferred22.await(batchingHttpInterceptor$intercept$1);
            if (await22 == coroutine_suspended) {
            }
        } finally {
            r2.unlock(null);
        }
        batchingHttpInterceptor$intercept$1 = new com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1(this, continuation);
        java.lang.Object obj3 = batchingHttpInterceptor$intercept$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = batchingHttpInterceptor$intercept$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0065, code lost:
    
        if (r4.lock(null, r2) != r3) goto L148;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ad A[Catch: Exception -> 0x0043, TryCatch #5 {Exception -> 0x0043, blocks: (B:12:0x003e, B:13:0x01a5, B:17:0x01b1, B:19:0x01b7, B:33:0x0215, B:35:0x0222, B:36:0x0233, B:38:0x0239, B:40:0x023f, B:42:0x025d, B:43:0x0264, B:45:0x0265, B:67:0x026a, B:68:0x0297, B:69:0x0298, B:70:0x029f, B:71:0x02a0, B:83:0x020b, B:84:0x02a1, B:85:0x02a8, B:86:0x02a9, B:88:0x02ad, B:90:0x02b3, B:92:0x02bd, B:93:0x02ea, B:94:0x02b8, B:21:0x01c5, B:23:0x01e8, B:24:0x0202, B:78:0x0205), top: B:11:0x003e, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b8 A[Catch: Exception -> 0x0043, TryCatch #5 {Exception -> 0x0043, blocks: (B:12:0x003e, B:13:0x01a5, B:17:0x01b1, B:19:0x01b7, B:33:0x0215, B:35:0x0222, B:36:0x0233, B:38:0x0239, B:40:0x023f, B:42:0x025d, B:43:0x0264, B:45:0x0265, B:67:0x026a, B:68:0x0297, B:69:0x0298, B:70:0x029f, B:71:0x02a0, B:83:0x020b, B:84:0x02a1, B:85:0x02a8, B:86:0x02a9, B:88:0x02ad, B:90:0x02b3, B:92:0x02bd, B:93:0x02ea, B:94:0x02b8, B:21:0x01c5, B:23:0x01e8, B:24:0x0202, B:78:0x0205), top: B:11:0x003e, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f4  */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$1 batchingHttpInterceptor$executePendingRequests$1;
        int i;
        java.util.List list;
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.List list2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.util.List list3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        com.apollographql.apollo.api.http.HttpResponse httpResponse;
        int statusCode;
        okio.BufferedSource body;
        java.lang.Throwable th;
        java.lang.Object obj;
        com.apollographql.apollo.api.json.BufferedSourceJsonReader bufferedSourceJsonReader;
        java.lang.Object fromJson;
        try {
            if (continuation instanceof com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$1) {
                batchingHttpInterceptor$executePendingRequests$1 = (com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$1) continuation;
                if ((batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj2 = batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoSizes;
                    java.util.ArrayList arrayList = null;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        if (z) {
                            mutex = this.getHighSpeedVideoSizesFor;
                            batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoFpsRanges = mutex;
                            batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoSizes = 1;
                        } else {
                            list = kotlin.collections.CollectionsKt.toList(this.getOutputMinFrameDuration);
                            this.getOutputMinFrameDuration.clear();
                            list2 = list;
                            if (list2.isEmpty()) {
                                return kotlin.Unit.INSTANCE;
                            }
                            com.apollographql.apollo.api.http.HttpRequest request = ((com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest) kotlin.collections.CollectionsKt.first(list2)).getRequest();
                            java.util.List list4 = list2;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                            java.util.Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                com.apollographql.apollo.api.http.HttpBody body2 = ((com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest) it.next()).getRequest().getBody();
                                if (body2 == null) {
                                    throw new java.lang.IllegalStateException("empty body while batching queries".toString());
                                }
                                arrayList2.add(body2);
                            }
                            final java.util.ArrayList arrayList3 = arrayList2;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                            java.util.Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest) it2.next()).getRequest().getHeaders());
                            }
                            java.util.Iterator it3 = arrayList4.iterator();
                            if (!it3.hasNext()) {
                                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                            }
                            java.lang.Object next = it3.next();
                            while (it3.hasNext()) {
                                next = kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.intersect((java.util.List) next, kotlin.collections.CollectionsKt.toSet((java.util.List) it3.next())));
                            }
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            for (java.lang.Object obj3 : (java.lang.Iterable) next) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.apollographql.apollo.api.http.HttpHeader) obj3).getName(), "X-APOLLO-CAN-BE-BATCHED")) {
                                    arrayList5.add(obj3);
                                }
                            }
                            com.apollographql.apollo.api.http.HttpRequest build = new com.apollographql.apollo.api.http.HttpRequest.Builder(com.apollographql.apollo.api.http.HttpMethod.Post, request.getUrl()).body(new com.apollographql.apollo.api.http.HttpBody() { // from class: com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$body$1
                                private final java.lang.String contentType = "application/json";
                                private final long contentLength = -1;

                                @Override // com.apollographql.apollo.api.http.HttpBody
                                public final java.lang.String getContentType() {
                                    return this.contentType;
                                }

                                @Override // com.apollographql.apollo.api.http.HttpBody
                                public final long getContentLength() {
                                    return this.contentLength;
                                }

                                @Override // com.apollographql.apollo.api.http.HttpBody
                                public final void writeTo(okio.BufferedSink bufferedSink) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
                                    com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter = new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(bufferedSink, null, 2, null);
                                    java.util.List<com.apollographql.apollo.api.http.HttpBody> list5 = arrayList3;
                                    bufferedSinkJsonWriter.beginArray();
                                    com.apollographql.apollo.api.json.BufferedSinkJsonWriter bufferedSinkJsonWriter2 = bufferedSinkJsonWriter;
                                    for (com.apollographql.apollo.api.http.HttpBody httpBody : list5) {
                                        okio.Buffer buffer = new okio.Buffer();
                                        httpBody.writeTo(buffer);
                                        bufferedSinkJsonWriter2.jsonValue(buffer.readUtf8());
                                    }
                                    bufferedSinkJsonWriter.endArray();
                                }
                            }).headers(arrayList5).build();
                            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                            objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                            objectRef2.element = kotlin.collections.CollectionsKt.emptyList();
                            try {
                                com.apollographql.apollo.network.http.HttpInterceptorChain httpInterceptorChain = this.getInputSizeshNQ4ISI;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(httpInterceptorChain);
                                batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoFpsRanges = list2;
                                batchingHttpInterceptor$executePendingRequests$1.getHighResolutionOutputSizeshNQ4ISI = objectRef;
                                batchingHttpInterceptor$executePendingRequests$1.Camera2StreamConfigurationMap = objectRef2;
                                batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoSizes = 2;
                                obj2 = httpInterceptorChain.proceed(build, batchingHttpInterceptor$executePendingRequests$1);
                                if (obj2 != coroutine_suspended) {
                                    list3 = list2;
                                    objectRef3 = objectRef;
                                    objectRef4 = objectRef2;
                                    httpResponse = (com.apollographql.apollo.api.http.HttpResponse) obj2;
                                    statusCode = httpResponse.getStatusCode();
                                    if (200 <= statusCode) {
                                    }
                                    if (!this.getHighSpeedVideoSizes) {
                                    }
                                    int statusCode2 = httpResponse.getStatusCode();
                                    java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers = httpResponse.getHeaders();
                                    int statusCode3 = httpResponse.getStatusCode();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append("HTTP error ");
                                    sb.append(statusCode3);
                                    sb.append(" while executing batched query");
                                    throw new com.apollographql.apollo.exception.ApolloHttpException(statusCode2, headers, body, sb.toString(), null, 16, null);
                                }
                                return coroutine_suspended;
                            } catch (java.lang.Exception e) {
                                e = e;
                                objectRef.element = !(e instanceof com.apollographql.apollo.exception.ApolloException) ? (com.apollographql.apollo.exception.ApolloException) e : new com.apollographql.apollo.exception.DefaultApolloException("batched query failed with exception", e);
                                list3 = list2;
                                objectRef3 = objectRef;
                                objectRef4 = objectRef2;
                                if (objectRef3.element == 0) {
                                }
                            }
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) batchingHttpInterceptor$executePendingRequests$1.Camera2StreamConfigurationMap;
                            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) batchingHttpInterceptor$executePendingRequests$1.getHighResolutionOutputSizeshNQ4ISI;
                            list3 = (java.util.List) batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoFpsRanges;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                httpResponse = (com.apollographql.apollo.api.http.HttpResponse) obj2;
                                statusCode = httpResponse.getStatusCode();
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                objectRef2 = objectRef4;
                                objectRef = objectRef3;
                                list2 = list3;
                                objectRef.element = !(e instanceof com.apollographql.apollo.exception.ApolloException) ? (com.apollographql.apollo.exception.ApolloException) e : new com.apollographql.apollo.exception.DefaultApolloException("batched query failed with exception", e);
                                list3 = list2;
                                objectRef3 = objectRef;
                                objectRef4 = objectRef2;
                                if (objectRef3.element == 0) {
                                }
                            }
                            if (200 <= statusCode || statusCode >= 300) {
                                if (!this.getHighSpeedVideoSizes) {
                                    body = httpResponse.getBody();
                                } else {
                                    okio.BufferedSource body3 = httpResponse.getBody();
                                    if (body3 != null) {
                                        body3.close();
                                    }
                                    body = null;
                                }
                                int statusCode22 = httpResponse.getStatusCode();
                                java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers2 = httpResponse.getHeaders();
                                int statusCode32 = httpResponse.getStatusCode();
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append("HTTP error ");
                                sb2.append(statusCode32);
                                sb2.append(" while executing batched query");
                                throw new com.apollographql.apollo.exception.ApolloHttpException(statusCode22, headers2, body, sb2.toString(), null, 16, null);
                            }
                            okio.BufferedSource body4 = httpResponse.getBody();
                            if (body4 == null) {
                                throw new com.apollographql.apollo.exception.DefaultApolloException("null body when executing batched query", null, 2, null);
                            }
                            objectRef4.element = httpResponse.getHeaders();
                            com.apollographql.apollo.api.json.BufferedSourceJsonReader bufferedSourceJsonReader2 = new com.apollographql.apollo.api.json.BufferedSourceJsonReader(body4);
                            try {
                                bufferedSourceJsonReader = bufferedSourceJsonReader2;
                                fromJson = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(bufferedSourceJsonReader, com.apollographql.apollo.api.CustomScalarAdapters.Empty);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                try {
                                    bufferedSourceJsonReader2.close();
                                } catch (java.lang.Throwable th3) {
                                    kotlin.ExceptionsKt.addSuppressed(th, th3);
                                }
                                obj = null;
                            }
                            if (bufferedSourceJsonReader.getCamera2StreamConfigurationMap() != com.apollographql.apollo.api.json.JsonReader.Token.END_DOCUMENT) {
                                com.apollographql.apollo.api.json.JsonReader.Token camera2StreamConfigurationMap = bufferedSourceJsonReader.getCamera2StreamConfigurationMap();
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append("Expected END_DOCUMENT but was ");
                                sb3.append(camera2StreamConfigurationMap);
                                throw new com.apollographql.apollo.exception.JsonDataException(sb3.toString());
                            }
                            try {
                                bufferedSourceJsonReader2.close();
                                obj = fromJson;
                                th = null;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                obj = fromJson;
                            }
                            if (th == null) {
                                if (!(obj instanceof java.util.List)) {
                                    throw new com.apollographql.apollo.exception.DefaultApolloException("batched query response is not a list when executing batched query", null, 2, null);
                                }
                                if (((java.util.List) obj).size() != list3.size()) {
                                    int size = ((java.util.List) obj).size();
                                    int size2 = list3.size();
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                    sb4.append("batched query response count (");
                                    sb4.append(size);
                                    sb4.append(") does not match the requested queries (");
                                    sb4.append(size2);
                                    sb4.append(")");
                                    throw new com.apollographql.apollo.exception.DefaultApolloException(sb4.toString(), null, 2, null);
                                }
                                java.util.List list5 = (java.lang.Iterable) obj;
                                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                                for (java.lang.Object obj4 : list5) {
                                    if (obj4 == null) {
                                        throw new com.apollographql.apollo.exception.DefaultApolloException("batched query response contains a null item", null, 2, null);
                                    }
                                    okio.Buffer buffer = new okio.Buffer();
                                    com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), com.apollographql.apollo.api.CustomScalarAdapters.Empty, obj4);
                                    arrayList6.add(buffer.readByteString());
                                }
                                arrayList = arrayList6;
                                if (objectRef3.element == 0) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(arrayList);
                                    int i2 = 0;
                                    for (java.lang.Object obj5 : arrayList) {
                                        if (i2 < 0) {
                                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                                        }
                                        ((com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest) list3.get(i2)).getDeferred().complete(new com.apollographql.apollo.api.http.HttpResponse.Builder(200).body((okio.ByteString) obj5).headers((java.util.List) objectRef4.element).build());
                                        i2++;
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                                java.util.Iterator it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    ((com.apollographql.apollo.network.http.BatchingHttpInterceptor.PendingRequest) it4.next()).getDeferred().completeExceptionally((java.lang.Throwable) objectRef3.element);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            throw th;
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    list = kotlin.collections.CollectionsKt.toList(this.getOutputMinFrameDuration);
                    this.getOutputMinFrameDuration.clear();
                    list2 = list;
                    if (list2.isEmpty()) {
                    }
                }
            }
            list = kotlin.collections.CollectionsKt.toList(this.getOutputMinFrameDuration);
            this.getOutputMinFrameDuration.clear();
            list2 = list;
            if (list2.isEmpty()) {
            }
        } finally {
            mutex.unlock(null);
        }
        batchingHttpInterceptor$executePendingRequests$1 = new com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$1(this, continuation);
        java.lang.Object obj22 = batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = batchingHttpInterceptor$executePendingRequests$1.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList7 = null;
        if (i != 0) {
        }
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    public final void dispose() {
        if (this.getOutputFormats) {
            return;
        }
        this.getInputSizeshNQ4ISI = null;
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.getInputFormats, null, 1, null);
        this.getOutputFormats = true;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient$Builder;", "apolloClientBuilder", "", "canBeBatched", "", "configureApolloClientBuilder", "(Lcom/apollographql/apollo/ApolloClient$Builder;Z)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/ApolloCall;", "apolloCall", "configureApolloCall", "(Lcom/apollographql/apollo/ApolloCall;Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void configureApolloClientBuilder(com.apollographql.apollo.ApolloClient.Builder apolloClientBuilder, boolean canBeBatched) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClientBuilder, "");
            apolloClientBuilder.canBeBatched(java.lang.Boolean.valueOf(canBeBatched));
        }

        @kotlin.jvm.JvmStatic
        public final <D extends com.apollographql.apollo.api.Operation.Data> void configureApolloCall(com.apollographql.apollo.ApolloCall<D> apolloCall, boolean canBeBatched) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
            apolloCall.canBeBatched(java.lang.Boolean.valueOf(canBeBatched));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void configureApolloClientBuilder(com.apollographql.apollo.ApolloClient.Builder builder, boolean z) {
        INSTANCE.configureApolloClientBuilder(builder, z);
    }

    @kotlin.jvm.JvmStatic
    public static final <D extends com.apollographql.apollo.api.Operation.Data> void configureApolloCall(com.apollographql.apollo.ApolloCall<D> apolloCall, boolean z) {
        INSTANCE.configureApolloCall(apolloCall, z);
    }

    public BatchingHttpInterceptor(long j, int i) {
        this(j, i, false, 4, null);
    }

    public BatchingHttpInterceptor(long j) {
        this(j, 0, false, 6, null);
    }

    public BatchingHttpInterceptor() {
        this(0L, 0, false, 7, null);
    }
}
