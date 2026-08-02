package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0018\u001a\u00020\u00038CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/apollographql/apollo/network/http/JvmHttpEngine;", "Lcom/apollographql/apollo/network/http/HttpEngine;", "Lkotlin/Function0;", "Lokhttp3/Call$Factory;", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/Call$Factory;)V", "", "(J)V", "p1", "(JJ)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "Lcom/apollographql/apollo/api/http/HttpResponse;", "execute", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class JvmHttpEngine implements com.apollographql.apollo.network.http.HttpEngine {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.network.http.JvmHttpEngine.Companion INSTANCE = new com.apollographql.apollo.network.http.JvmHttpEngine.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<okhttp3.Call.Factory> Camera2StreamConfigurationMap;

    public static /* synthetic */ okhttp3.Call.Factory getHighResolutionOutputSizeshNQ4ISI(okhttp3.Call.Factory factory) {
        return factory;
    }

    @Override // com.apollographql.apollo.network.http.HttpEngine, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmHttpEngine(kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                okhttp3.Call.Factory invoke;
                invoke = com.apollographql.apollo.network.http.JvmHttpEngine.this.Camera2StreamConfigurationMap.invoke();
                return invoke;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmHttpEngine(final okhttp3.Call.Factory factory) {
        this((kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory>) new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.network.http.JvmHttpEngine.getHighResolutionOutputSizeshNQ4ISI(okhttp3.Call.Factory.this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    public JvmHttpEngine(long j) {
        this(j, j);
    }

    public JvmHttpEngine(long j, long j2) {
        this(com.apollographql.apollo.network.OkHttpExtensionsKt.getDefaultOkHttpClientBuilder().connectTimeout(j, java.util.concurrent.TimeUnit.MILLISECONDS).readTimeout(j2, java.util.concurrent.TimeUnit.MILLISECONDS).build());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.http.HttpEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(com.apollographql.apollo.api.http.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
        com.apollographql.apollo.network.http.JvmHttpEngine$execute$1 jvmHttpEngine$execute$1;
        int i;
        com.apollographql.apollo.network.http.JvmHttpEngine.Companion companion;
        if (continuation instanceof com.apollographql.apollo.network.http.JvmHttpEngine$execute$1) {
            jvmHttpEngine$execute$1 = (com.apollographql.apollo.network.http.JvmHttpEngine$execute$1) continuation;
            if ((jvmHttpEngine$execute$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                jvmHttpEngine$execute$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = jvmHttpEngine$execute$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jvmHttpEngine$execute$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.network.http.JvmHttpEngine.Companion companion2 = INSTANCE;
                    okhttp3.Call.Factory factory = (okhttp3.Call.Factory) this.getHighSpeedVideoSizes.getValue();
                    okhttp3.Request okHttpRequest = companion2.toOkHttpRequest(httpRequest);
                    jvmHttpEngine$execute$1.Camera2StreamConfigurationMap = companion2;
                    jvmHttpEngine$execute$1.getHighSpeedVideoSizes = 1;
                    java.lang.Object execute = companion2.execute(factory, okHttpRequest, jvmHttpEngine$execute$1);
                    if (execute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = execute;
                    companion = companion2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (com.apollographql.apollo.network.http.JvmHttpEngine.Companion) jvmHttpEngine$execute$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return companion.toApolloHttpResponse((okhttp3.Response) obj);
            }
        }
        jvmHttpEngine$execute$1 = new com.apollographql.apollo.network.http.JvmHttpEngine$execute$1(this, continuation);
        java.lang.Object obj2 = jvmHttpEngine$execute$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jvmHttpEngine$execute$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return companion.toApolloHttpResponse((okhttp3.Response) obj2);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u00020\r*\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/network/http/JvmHttpEngine$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "Lokhttp3/Request;", "toOkHttpRequest", "(Lcom/apollographql/apollo/api/http/HttpRequest;)Lokhttp3/Request;", "Lokhttp3/Call$Factory;", "request", "Lokhttp3/Response;", "execute", "(Lokhttp3/Call$Factory;Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/http/HttpResponse;", "toApolloHttpResponse", "(Lokhttp3/Response;)Lcom/apollographql/apollo/api/http/HttpResponse;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.Request toOkHttpRequest(com.apollographql.apollo.api.http.HttpRequest httpRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
            okhttp3.Request.Builder headers = new okhttp3.Request.Builder().url(httpRequest.getUrl()).headers(com.apollographql.apollo.network.OkHttpExtensionsKt.toOkHttpHeaders(httpRequest.getHeaders()));
            if (httpRequest.getMethod() == com.apollographql.apollo.api.http.HttpMethod.Get) {
                headers.get();
            } else {
                final com.apollographql.apollo.api.http.HttpBody body = httpRequest.getBody();
                if (body == null) {
                    throw new java.lang.IllegalStateException("HTTP POST requires a request body".toString());
                }
                headers.post(new okhttp3.RequestBody() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$Companion$toOkHttpRequest$1$2
                    @Override // okhttp3.RequestBody
                    /* renamed from: contentType */
                    public final okhttp3.MediaType getGetHighSpeedVideoFpsRanges() {
                        return okhttp3.MediaType.INSTANCE.get(com.apollographql.apollo.api.http.HttpBody.this.getContentType());
                    }

                    @Override // okhttp3.RequestBody
                    public final long contentLength() {
                        return com.apollographql.apollo.api.http.HttpBody.this.getContentLength();
                    }

                    @Override // okhttp3.RequestBody
                    public final boolean isOneShot() {
                        return com.apollographql.apollo.api.http.HttpBody.this instanceof com.apollographql.apollo.api.http.UploadsHttpBody;
                    }

                    @Override // okhttp3.RequestBody
                    public final void writeTo(okio.BufferedSink sink) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                        com.apollographql.apollo.api.http.HttpBody.this.writeTo(sink);
                    }
                });
            }
            return headers.build();
        }

        public final com.apollographql.apollo.api.http.HttpResponse toApolloHttpResponse(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            com.apollographql.apollo.api.http.HttpResponse.Builder builder = new com.apollographql.apollo.api.http.HttpResponse.Builder(response.code());
            okhttp3.ResponseBody body = response.body();
            kotlin.jvm.internal.Intrinsics.checkNotNull(body);
            com.apollographql.apollo.api.http.HttpResponse.Builder body2 = builder.body(body.getGetHighResolutionOutputSizeshNQ4ISI());
            okhttp3.Headers headers = response.headers();
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, headers.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                arrayList.add(new com.apollographql.apollo.api.http.HttpHeader(headers.name(nextInt), headers.value(nextInt)));
            }
            return body2.addHeaders(arrayList).build();
        }

        public final java.lang.Object execute(okhttp3.Call.Factory factory, okhttp3.Request request, kotlin.coroutines.Continuation<? super okhttp3.Response> continuation) {
            okhttp3.Response response;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final okhttp3.Call newCall = factory.newCall(request);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$Companion$execute$2$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    okhttp3.Call.this.cancel();
                    return kotlin.Unit.INSTANCE;
                }
            });
            java.io.IOException iOException = null;
            try {
                response = newCall.execute();
            } catch (java.io.IOException e) {
                iOException = e;
                response = null;
            }
            if (iOException != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new com.apollographql.apollo.exception.ApolloNetworkException("Failed to execute GraphQL http network request", iOException))));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(response);
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(response));
            }
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
