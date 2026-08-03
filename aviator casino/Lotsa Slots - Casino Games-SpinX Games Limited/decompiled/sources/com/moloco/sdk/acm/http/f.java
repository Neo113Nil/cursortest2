package com.moloco.sdk.acm.http;

/* loaded from: classes5.dex */
public final class f implements com.moloco.sdk.acm.http.e {

    /* renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f6909a;
    public final java.lang.String b;
    public final java.lang.String c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", i = {}, l = {54}, m = "execute-0E7RQCE", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f6910a;
        public int c;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.http.f.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f6910a = obj;
            this.c |= Integer.MIN_VALUE;
            java.lang.Object a2 = com.moloco.sdk.acm.http.f.this.a(null, null, this);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m10797boximpl(a2);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", i = {0, 1, 1}, l = {145, 82}, m = "makeMetricsRequest-BWLJW6A", n = {"this", "this", "responseStatus"}, s = {"L$0", "L$0", "L$1"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6911a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.http.f.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            java.lang.Object a2 = com.moloco.sdk.acm.http.f.this.a(0L, null, null, this);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m10797boximpl(a2);
        }
    }

    public f(io.ktor.client.HttpClient httpClient, java.lang.String apiUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        this.f6909a = httpClient;
        this.b = apiUrl;
        this.c = "PostMetricsRequest";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.http.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.moloco.sdk.acm.http.d dVar, kotlin.jvm.functions.Function1<? super io.ktor.http.HeadersBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation) {
        com.moloco.sdk.acm.http.f.a aVar;
        int i;
        if (continuation instanceof com.moloco.sdk.acm.http.f.a) {
            aVar = (com.moloco.sdk.acm.http.f.a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                com.moloco.sdk.acm.http.f.a aVar2 = aVar;
                java.lang.Object obj = aVar2.f6910a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar2.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlin.Result) obj).getValue();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                aVar2.c = 1;
                java.lang.Object a2 = a(5000L, dVar, function1, aVar2);
                return a2 == coroutine_suspended ? coroutine_suspended : a2;
            }
        }
        aVar = new com.moloco.sdk.acm.http.f.a(continuation);
        com.moloco.sdk.acm.http.f.a aVar22 = aVar;
        java.lang.Object obj2 = aVar22.f6910a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.c;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0105 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:12:0x003a, B:13:0x00f7, B:15:0x0105, B:18:0x0122), top: B:11:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:12:0x003a, B:13:0x00f7, B:15:0x0105, B:18:0x0122), top: B:11:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(final long j, com.moloco.sdk.acm.http.d dVar, kotlin.jvm.functions.Function1<? super io.ktor.http.HeadersBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation) {
        com.moloco.sdk.acm.http.f.b bVar;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.moloco.sdk.acm.http.f fVar;
        kotlin.reflect.KType kType;
        kotlin.reflect.KType kType2;
        com.moloco.sdk.acm.http.f fVar2;
        io.ktor.http.HttpStatusCode httpStatusCode;
        if (continuation instanceof com.moloco.sdk.acm.http.f.b) {
            bVar = (com.moloco.sdk.acm.http.f.b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                obj = bVar.c;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        io.ktor.client.HttpClient httpClient = this.f6909a;
                        java.lang.String str = this.b;
                        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                        io.ktor.client.plugins.HttpTimeoutKt.timeout(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.acm.http.f$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.moloco.sdk.acm.http.f.a(j, (io.ktor.client.plugins.HttpTimeoutConfig) obj2);
                            }
                        });
                        io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder, io.ktor.http.ContentType.Application.INSTANCE.getProtoBuf());
                        io.ktor.client.request.HttpRequestKt.headers(httpRequestBuilder, function1);
                        byte[] a2 = a(dVar);
                        if (a2 == null) {
                            httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
                            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                            try {
                                kType2 = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                            } catch (java.lang.Throwable unused) {
                                kType2 = null;
                            }
                            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType2));
                        } else if (a2 instanceof io.ktor.http.content.OutgoingContent) {
                            httpRequestBuilder.setBody(a2);
                            httpRequestBuilder.setBodyType(null);
                        } else {
                            httpRequestBuilder.setBody(a2);
                            kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                            try {
                                kType = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                            } catch (java.lang.Throwable unused2) {
                                kType = null;
                            }
                            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType));
                        }
                        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                        bVar.f6911a = this;
                        bVar.e = 1;
                        obj = httpStatement.execute(bVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fVar = this;
                    } catch (java.lang.Exception e) {
                        e = e;
                        fVar = this;
                        fVar2 = fVar;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, fVar2.c, "Post Metrics Request Exception", e, false, 8, null);
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e));
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpStatusCode = (io.ktor.http.HttpStatusCode) bVar.b;
                        fVar2 = (com.moloco.sdk.acm.http.f) bVar.f6911a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.String str2 = (java.lang.String) obj;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(httpStatusCode, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                                com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.f6920a, fVar2.c, "Post Metrics Request Success: " + str2, false, 4, null);
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                return kotlin.Result.m10798constructorimpl(str2);
                            }
                            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, fVar2.c, "Post Metrics Request Error: " + str2, null, false, 12, null);
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("PostMetricsRequest Error: " + httpStatusCode)));
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, fVar2.c, "Post Metrics Request Exception", e, false, 8, null);
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e));
                        }
                    }
                    fVar = (com.moloco.sdk.acm.http.f) bVar.f6911a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        fVar2 = fVar;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, fVar2.c, "Post Metrics Request Exception", e, false, 8, null);
                        kotlin.Result.Companion companion42 = kotlin.Result.INSTANCE;
                        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e));
                    }
                }
                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                io.ktor.http.HttpStatusCode status = httpResponse.getStatus();
                bVar.f6911a = fVar;
                bVar.b = status;
                bVar.e = 2;
                obj = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, bVar, 1, null);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar2 = fVar;
                httpStatusCode = status;
                java.lang.String str22 = (java.lang.String) obj;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(httpStatusCode, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                }
            }
        }
        bVar = new com.moloco.sdk.acm.http.f.b(continuation);
        obj = bVar.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
        io.ktor.http.HttpStatusCode status2 = httpResponse2.getStatus();
        bVar.f6911a = fVar;
        bVar.b = status2;
        bVar.e = 2;
        obj = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse2, null, bVar, 1, null);
        if (obj != coroutine_suspended) {
        }
    }

    public static final kotlin.Unit a(long j, io.ktor.client.plugins.HttpTimeoutConfig timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
        timeout.setRequestTimeoutMillis(java.lang.Long.valueOf(j));
        return kotlin.Unit.INSTANCE;
    }

    public final byte[] a(com.moloco.sdk.acm.http.d dVar) {
        com.moloco.sdk.MetricsRequest.PostMetricsRequest build = com.moloco.sdk.MetricsRequest.PostMetricsRequest.newBuilder().addAllCounts(dVar.a()).addAllDurations(dVar.b()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        byte[] byteArray = build.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
