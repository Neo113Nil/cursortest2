package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7995a = "HttpRequestClient";
    public static final long b = 5000;
    public static final int c = 5;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt", f = "HttpRequestClient.kt", i = {}, l = {36}, m = "sendGetRequest", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7996a;
        public int b;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7996a = obj;
            this.b |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt$sendGetRequest$2", f = "HttpRequestClient.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7997a;
        public final /* synthetic */ io.ktor.client.HttpClient b;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.b> continuation) {
            super(2, continuation);
            this.b = httpClient;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7997a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.HttpClient httpClient = this.b;
                java.lang.String str = this.c;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, 5000L);
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                this.f7997a = 1;
                obj = httpStatement.execute(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            io.ktor.http.HttpStatusCode status = ((io.ktor.client.statement.HttpResponse) obj).getStatus();
            io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(status.compareTo(companion.getOK()) >= 0 && status.compareTo(companion.getBadRequest()) < 0);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt", f = "HttpRequestClient.kt", i = {}, l = {52}, m = "sendPostRequest", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7998a;
        public int b;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7998a = obj;
            this.b |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.HttpRequestClientKt$sendPostRequest$2", f = "HttpRequestClient.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7999a;
        public final /* synthetic */ io.ktor.client.HttpClient b;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ java.lang.String d;
        public final /* synthetic */ byte[] e;
        public final /* synthetic */ io.ktor.http.ContentType f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, byte[] bArr, io.ktor.http.ContentType contentType, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.d> continuation) {
            super(2, continuation);
            this.b = httpClient;
            this.c = str;
            this.d = str2;
            this.e = bArr;
            this.f = contentType;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.d(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7999a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.HttpClient httpClient = this.b;
                java.lang.String str = this.c;
                final java.lang.String str2 = this.d;
                byte[] bArr = this.e;
                io.ktor.http.ContentType contentType = this.f;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                if (str2 != null && (!kotlin.text.StringsKt.isBlank(str2))) {
                    io.ktor.client.request.HttpRequestKt.headers(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e$d$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.d.a(str2, (io.ktor.http.HeadersBuilder) obj2);
                        }
                    });
                }
                kotlin.reflect.KType kType = null;
                if (bArr == null) {
                    httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                    } catch (java.lang.Throwable unused) {
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                } else if (bArr instanceof io.ktor.http.content.OutgoingContent) {
                    httpRequestBuilder.setBody(bArr);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(bArr);
                    kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                    } catch (java.lang.Throwable unused2) {
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType));
                }
                io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder, contentType);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, 5000L);
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                this.f7999a = 1;
                obj = httpStatement.execute(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            io.ktor.http.HttpStatusCode status = ((io.ktor.client.statement.HttpResponse) obj).getStatus();
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "HttpClient", "Response status: " + status + " for url: " + this.c, false, 4, null);
            io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(status.compareTo(companion.getOK()) >= 0 && status.compareTo(companion.getBadRequest()) < 0);
        }

        public static final kotlin.Unit a(java.lang.String str, io.ktor.http.HeadersBuilder headersBuilder) {
            headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding(), str);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final boolean a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        boolean matches = android.util.Patterns.WEB_URL.matcher(str).matches();
        if (!matches) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f7995a, "URL is invalid. " + str, null, false, 12, null);
        }
        return matches;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a aVar;
        int i;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a) {
            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a) continuation;
            int i2 = aVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.f7996a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext io2 = com.moloco.sdk.internal.scheduling.b.a().getIo();
                    com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.b(httpClient, str, null);
                    aVar.b = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(io2, bVar, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                boolean z = ((java.lang.Boolean) obj).booleanValue();
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(continuation);
        java.lang.Object obj2 = aVar.f7996a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.b;
        if (i != 0) {
        }
        boolean z2 = ((java.lang.Boolean) obj2).booleanValue();
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(io.ktor.client.HttpClient httpClient, java.lang.String str, byte[] bArr, io.ktor.http.ContentType contentType, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c cVar;
        int i;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c) {
            cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c) continuation;
            int i2 = cVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.f7998a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext io2 = com.moloco.sdk.internal.scheduling.b.a().getIo();
                    com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.d(httpClient, str, str2, bArr, contentType, null);
                    cVar.b = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(io2, dVar, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                boolean z = ((java.lang.Boolean) obj).booleanValue();
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.c(continuation);
        java.lang.Object obj2 = cVar.f7998a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.b;
        if (i != 0) {
        }
        boolean z2 = ((java.lang.Boolean) obj2).booleanValue();
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    public static /* synthetic */ java.lang.Object a(io.ktor.client.HttpClient httpClient, java.lang.String str, byte[] bArr, io.ktor.http.ContentType contentType, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return a(httpClient, str, bArr, contentType, str2, continuation);
    }
}
