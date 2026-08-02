package financial.atomic.muppet.http;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ab\u0010\u000b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\b2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0080@¢\u0006\u0004\b\u000b\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u000e*\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lio/ktor/client/HttpClient;", "p0", "Lfinancial/atomic/muppet/http/Request;", "p1", "Lio/ktor/client/statement/HttpResponse;", "getHighSpeedVideoFpsRangesFor", "(Lio/ktor/client/HttpClient;Lfinancial/atomic/muppet/http/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/Url;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lio/ktor/http/Url;)Z", "request", "", "status", "", "location", "redirectRequest", "(Lfinancial/atomic/muppet/http/Request;ILjava/lang/String;)Lfinancial/atomic/muppet/http/Request;", "client", "method", "url", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "headers", "followRedirects", "Lkotlinx/coroutines/flow/Flow;", "", "stream", "Lfinancial/atomic/muppet/http/Response;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toHttps", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestKt {
    private static final boolean getHighResolutionOutputSizeshNQ4ISI(io.ktor.http.Url url) {
        java.lang.String user = url.getUser();
        if (user != null && user.length() != 0) {
            return true;
        }
        java.lang.String password = url.getPassword();
        return (password == null || password.length() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(io.ktor.client.HttpClient httpClient, final financial.atomic.muppet.http.Request request, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        financial.atomic.muppet.c.m mVar;
        int i;
        if (continuation instanceof financial.atomic.muppet.c.m) {
            mVar = (financial.atomic.muppet.c.m) continuation;
            int i2 = mVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.b = i2 - 2147483648;
                java.lang.Object obj = mVar.f6850a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mVar.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
                    new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.http.RequestKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            java.lang.String concat;
                            concat = "Http.Request[IN]: ".concat(java.lang.String.valueOf(financial.atomic.muppet.http.Request.this));
                            return concat;
                        }
                    };
                    java.lang.String url = request.getUrl();
                    final io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, url);
                    io.ktor.http.HttpMethod.Companion companion = io.ktor.http.HttpMethod.INSTANCE;
                    java.lang.String upperCase = request.getMethod().toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    httpRequestBuilder.setMethod(companion.parse(upperCase));
                    io.ktor.client.request.HttpRequestKt.headers(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: financial.atomic.muppet.http.RequestKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return financial.atomic.muppet.http.RequestKt.m23225$r8$lambda$xNt9Gju7aX6MvBZA45oKZOEcts(financial.atomic.muppet.http.Request.this, httpRequestBuilder, (io.ktor.http.HeadersBuilder) obj2);
                        }
                    });
                    kotlin.reflect.KType kType = null;
                    if (request.getData() != null) {
                        java.lang.String data = request.getData();
                        if (data == null) {
                            httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
                            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class);
                            try {
                                kType = kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class);
                            } catch (java.lang.Throwable unused) {
                            }
                            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                        } else {
                            httpRequestBuilder.setBody(data);
                            kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class);
                            try {
                                kType = kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class);
                            } catch (java.lang.Throwable unused2) {
                            }
                            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType));
                        }
                    } else if (request.getStream() != null) {
                        httpRequestBuilder.setBody(new financial.atomic.muppet.c.p(request));
                        httpRequestBuilder.setBodyType(null);
                    }
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    mVar.b = 1;
                    obj = httpStatement.execute(mVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                final io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                financial.atomic.muppet.g.a aVar2 = financial.atomic.muppet.g.f6869a;
                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.http.RequestKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return financial.atomic.muppet.http.RequestKt.m23223$r8$lambda$9XhEMexvFDcEed88ffTT9jl6oQ(io.ktor.client.statement.HttpResponse.this);
                    }
                };
                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.http.RequestKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        java.lang.String concat;
                        concat = "Http.Response: ".concat(java.lang.String.valueOf(io.ktor.client.statement.HttpResponse.this));
                        return concat;
                    }
                };
                return httpResponse;
            }
        }
        mVar = new financial.atomic.muppet.c.m(continuation);
        java.lang.Object obj2 = mVar.f6850a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mVar.b;
        if (i != 0) {
        }
        final io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj2;
        financial.atomic.muppet.g.a aVar22 = financial.atomic.muppet.g.f6869a;
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.http.RequestKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.http.RequestKt.m23223$r8$lambda$9XhEMexvFDcEed88ffTT9jl6oQ(io.ktor.client.statement.HttpResponse.this);
            }
        };
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.http.RequestKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String concat;
                concat = "Http.Response: ".concat(java.lang.String.valueOf(io.ktor.client.statement.HttpResponse.this));
                return concat;
            }
        };
        return httpResponse2;
    }

    public static final financial.atomic.muppet.http.Request redirectRequest(financial.atomic.muppet.http.Request request, int i, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (str == null) {
            return null;
        }
        io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(request.getUrl());
        java.lang.String method = request.getMethod();
        java.lang.String data = request.getData();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        io.ktor.http.URLBuilder URLBuilder = io.ktor.http.URLUtilsKt.URLBuilder(str);
        if (kotlin.text.StringsKt.startsWith$default(str, "//", false, 2, (java.lang.Object) null)) {
            URLBuilder.setProtocol(Url.getProtocol());
        } else if (io.ktor.http.URLUtilsKt.isAbsolutePath(URLBuilder) && str.charAt(0) == '/') {
            URLBuilder.setProtocol(Url.getProtocol());
            URLBuilder.setHost(Url.getHost());
            URLBuilder.setPort(Url.getPort());
        } else if (io.ktor.http.URLUtilsKt.isRelativePath(URLBuilder)) {
            URLBuilder.setProtocol(Url.getProtocol());
            URLBuilder.setHost(Url.getHost());
            URLBuilder.setPort(Url.getPort());
            if (Url.getSegments().size() > 1) {
                java.util.List<java.lang.String> pathSegments = URLBuilder.getPathSegments();
                URLBuilder.setPathSegments(Url.getSegments().subList(0, Url.getSegments().size() - 1));
                io.ktor.http.URLBuilderKt.appendPathSegments$default(URLBuilder, (java.util.List) pathSegments, false, 2, (java.lang.Object) null);
            }
        }
        if (URLBuilder.getFragment().length() == 0 && Url.getFragment().length() > 0) {
            URLBuilder.setFragment(Url.getFragment());
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        switch (i) {
            case 301:
            case 302:
            case 303:
                linkedHashSet.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"content-length", "content-type", "transfer-encoding"}));
                str2 = null;
                str3 = "GET";
                break;
            default:
                str3 = method;
                str2 = data;
                break;
        }
        java.util.Map<java.lang.String, java.lang.String> headers = request.getHeaders();
        if ((headers != null ? headers.get("authorization") : null) != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.UrlKt.getProtocolWithAuthority(URLBuilder.build()), io.ktor.http.UrlKt.getProtocolWithAuthority(Url))) {
                linkedHashSet.add("authorization");
            } else if (getHighResolutionOutputSizeshNQ4ISI(Url) && !getHighResolutionOutputSizeshNQ4ISI(URLBuilder.build())) {
                URLBuilder.setUser(Url.getUser());
                URLBuilder.setPassword(Url.getPassword());
            }
        }
        java.util.Map<java.lang.String, java.lang.String> headers2 = request.getHeaders();
        if (headers2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : headers2.entrySet()) {
                java.lang.String lowerCase = entry.getKey().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!linkedHashSet.contains(lowerCase)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return new financial.atomic.muppet.http.Request(str3, URLBuilder.buildString(), str2, linkedHashMap, request.getFollowRedirects(), null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0076 -> B:10:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object request(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, boolean z, kotlinx.coroutines.flow.Flow<byte[]> flow, kotlin.coroutines.Continuation<? super financial.atomic.muppet.http.Response> continuation) {
        financial.atomic.muppet.c.q qVar;
        int i;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        financial.atomic.muppet.http.Request request;
        io.ktor.client.HttpClient httpClient2;
        financial.atomic.muppet.c.q qVar2;
        boolean z2;
        java.lang.Object highSpeedVideoFpsRangesFor;
        int i3;
        if (continuation instanceof financial.atomic.muppet.c.q) {
            qVar = (financial.atomic.muppet.c.q) continuation;
            int i4 = qVar.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qVar.h = i4 - 2147483648;
                java.lang.Object obj = qVar.g;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qVar.h;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = qVar.f;
                    boolean z3 = qVar.e;
                    objectRef = qVar.d;
                    request = qVar.c;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = qVar.b;
                    io.ktor.client.HttpClient httpClient3 = qVar.f6854a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    financial.atomic.muppet.c.q qVar3 = qVar;
                    z2 = z3;
                    T t = obj;
                    objectRef.element = t;
                    if (z2) {
                        io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) objectRef2.element;
                        int value = httpResponse.getStatus().getValue();
                        if (300 <= value && value < 400 && httpResponse.getGetHighSpeedVideoSizesFor().contains("location") && (request = redirectRequest(request, ((io.ktor.client.statement.HttpResponse) objectRef2.element).getStatus().getValue(), ((io.ktor.client.statement.HttpResponse) objectRef2.element).getGetHighSpeedVideoSizesFor().get("location"))) != null && (i3 = i5 + 1) <= 20) {
                            qVar2 = qVar3;
                            objectRef = objectRef2;
                            i2 = i3;
                            httpClient2 = httpClient3;
                            qVar2.f6854a = httpClient2;
                            qVar2.b = objectRef;
                            qVar2.c = request;
                            qVar2.d = objectRef;
                            qVar2.e = z2;
                            qVar2.f = i2;
                            qVar2.h = 1;
                            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(httpClient2, request, qVar2);
                            if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            httpClient3 = httpClient2;
                            t = highSpeedVideoFpsRangesFor;
                            objectRef2 = objectRef;
                            int i6 = i2;
                            qVar3 = qVar2;
                            i5 = i6;
                            objectRef.element = t;
                            if (z2) {
                            }
                        }
                    }
                    kotlinx.coroutines.flow.Flow channelFlow = kotlinx.coroutines.flow.FlowKt.channelFlow(new financial.atomic.muppet.c.r(objectRef2, null));
                    T t2 = objectRef2.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                    return new financial.atomic.muppet.http.Response(((io.ktor.client.statement.HttpResponse) t2).getStatus().getValue(), io.ktor.util.StringValuesKt.toMap(((io.ktor.client.statement.HttpResponse) objectRef2.element).getGetHighSpeedVideoSizesFor()), channelFlow);
                }
                kotlin.ResultKt.throwOnFailure(obj);
                i2 = 0;
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                request = new financial.atomic.muppet.http.Request(str, str2, str3, map, z, flow);
                httpClient2 = httpClient;
                qVar2 = qVar;
                z2 = z;
                qVar2.f6854a = httpClient2;
                qVar2.b = objectRef;
                qVar2.c = request;
                qVar2.d = objectRef;
                qVar2.e = z2;
                qVar2.f = i2;
                qVar2.h = 1;
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(httpClient2, request, qVar2);
                if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                }
            }
        }
        qVar = new financial.atomic.muppet.c.q(continuation);
        java.lang.Object obj2 = qVar.g;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qVar.h;
        if (i == 0) {
        }
    }

    public static final java.lang.String toHttps(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        io.ktor.http.URLBuilder URLBuilder = io.ktor.http.URLUtilsKt.URLBuilder(str);
        io.ktor.http.URLProtocol.Companion companion = io.ktor.http.URLProtocol.INSTANCE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(companion.getHTTP(), URLBuilder.getProtocol())) {
            URLBuilder.setProtocol(companion.getHTTPS());
        }
        return URLBuilder.buildString();
    }

    /* renamed from: $r8$lambda$9XhEMex-vFDcEed88ffTT9jl6oQ, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23223$r8$lambda$9XhEMexvFDcEed88ffTT9jl6oQ(io.ktor.client.statement.HttpResponse httpResponse) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Http.Request[OUT].headers: ");
        sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getGetHighSpeedVideoSizesFor());
        return sb.toString();
    }

    /* renamed from: $r8$lambda$x-Nt9Gju7aX6MvBZA45oKZOEcts, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23225$r8$lambda$xNt9Gju7aX6MvBZA45oKZOEcts(financial.atomic.muppet.http.Request request, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.HeadersBuilder headersBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "");
        java.util.Map<java.lang.String, java.lang.String> headers = request.getHeaders();
        if (headers != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : headers.entrySet()) {
                if (!kotlin.text.StringsKt.equals(entry.getKey(), com.google.common.net.HttpHeaders.ACCEPT_ENCODING, true)) {
                    if (kotlin.text.StringsKt.equals(entry.getKey(), "Content-Type", true)) {
                        io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder, io.ktor.http.ContentType.INSTANCE.parse(entry.getValue()));
                    } else {
                        headersBuilder.append(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
