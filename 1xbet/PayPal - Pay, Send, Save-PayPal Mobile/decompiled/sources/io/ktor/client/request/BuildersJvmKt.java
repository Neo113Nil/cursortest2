package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a7\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\f\u0010\n\u001a7\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\r\u0010\n\u001a7\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\n\u001a7\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\n\u001a7\u0010\u0010\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\n\u001a7\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\n\u001a7\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0013\u0010\n\u001a7\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0014\u0010\n\u001a7\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0015\u0010\n\u001a7\u0010\u0016\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0016\u0010\n\u001a7\u0010\u0017\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0017\u0010\n\u001a7\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0018\u0010\n\u001a7\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0019\u0010\n\u001a7\u0010\u001a\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u001a\u0010\n"}, d2 = {"Lio/ktor/client/HttpClient;", "Ljava/net/URL;", "url", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/statement/HttpResponse;", "request", "(Lio/ktor/client/HttpClient;Ljava/net/URL;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "post", "put", "patch", "options", "head", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "prepareGet", "preparePost", "preparePut", "preparePatch", "prepareOptions", "prepareHead", "prepareDelete"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuildersJvmKt {
    public static /* synthetic */ java.lang.Object request$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$xj4o2b2BfMgikRYEcPkMS0NC58I((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return request(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object get$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$g6w4JXN22dj0cAjxzkdsLI7BT98((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return get(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object post$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$6fC4VdRqEQ4yeYoZQdxqvTze6zI((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return post(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object put$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$Z07TKoWaE4xPdS29UrGVSVV75tQ((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return put(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object patch$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$ZrRQEzATCWN_OI7Gv6ESpeEkYtY((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return patch(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object options$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$u9CkLKfR3vRaxHb7GrIWH3jWb7w((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return options(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object head$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.m23341$r8$lambda$YncDawH69Mmgo8NbFWbbu7KMxM((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return head(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object delete$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$uqwKQwEvK16Td8M3oZVsYGCPHlY((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return delete(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object prepareRequest$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$nFXvfKWcrVDMAuJpPTG_nK5ABzM((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return prepareRequest(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object prepareGet$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$eYHQAXE_GOm0PoT96p9HHQV8Glo((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return prepareGet(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object preparePost$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.m23339$r8$lambda$N5RfFVj5pLXb8hVvD7qRmhkgOU((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return preparePost(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object preparePut$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$3kblRlemBbD4ZWU5rtIFQODQ0Rk((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return preparePut(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object preparePatch$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$wEFKDmdzNw5A8DmVja6SwhWsR78((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return preparePatch(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object prepareOptions$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$6WS7WHdidXlglOroYuBPBOzYGU4((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return prepareOptions(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object prepareHead$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.m23340$r8$lambda$OR67J4QfNNpN8gYs0rEZKAdsI((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return prepareHead(httpClient, url, function1, continuation);
    }

    public static /* synthetic */ java.lang.Object prepareDelete$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.request.BuildersJvmKt.$r8$lambda$yrHxDMndhCBBQak05qKzO5VsXfI((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return prepareDelete(httpClient, url, function1, continuation);
    }

    public static final java.lang.Object request(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object get(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object post(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object put(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object patch(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object options(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object head(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object delete(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareRequest(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareGet(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePost(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePut(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePatch(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareOptions(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareHead(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareDelete(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3kblRlemBbD4ZWU5rtIFQODQ0Rk(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6WS7WHdidXlglOroYuBPBOzYGU4(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6fC4VdRqEQ4yeYoZQdxqvTze6zI(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N5RfFVj-5pLXb8hVvD7qRmhkgOU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23339$r8$lambda$N5RfFVj5pLXb8hVvD7qRmhkgOU(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OR67J4QfNNp-N8gYs0rEZK-AdsI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23340$r8$lambda$OR67J4QfNNpN8gYs0rEZKAdsI(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YncDawH69Mmgo8NbFWb-bu7KMxM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23341$r8$lambda$YncDawH69Mmgo8NbFWbbu7KMxM(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z07TKoWaE4xPdS29UrGVSVV75tQ(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZrRQEzATCWN_OI7Gv6ESpeEkYtY(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eYHQAXE_GOm0PoT96p9HHQV8Glo(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g6w4JXN22dj0cAjxzkdsLI7BT98(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nFXvfKWcrVDMAuJpPTG_nK5ABzM(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u9CkLKfR3vRaxHb7GrIWH3jWb7w(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uqwKQwEvK16Td8M3oZVsYGCPHlY(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wEFKDmdzNw5A8DmVja6SwhWsR78(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xj4o2b2BfMgikRYEcPkMS0NC58I(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yrHxDMndhCBBQak05qKzO5VsXfI(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }
}
