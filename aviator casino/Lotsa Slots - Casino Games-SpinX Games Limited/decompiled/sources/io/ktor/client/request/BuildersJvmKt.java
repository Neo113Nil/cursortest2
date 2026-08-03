package io.ktor.client.request;

/* compiled from: buildersJvm.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a7\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\f\u0010\n\u001a7\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\r\u0010\n\u001a7\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\n\u001a7\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\n\u001a7\u0010\u0010\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\n\u001a7\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\n\u001a7\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0013\u0010\n\u001a7\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0014\u0010\n\u001a7\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0015\u0010\n\u001a7\u0010\u0016\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0016\u0010\n\u001a7\u0010\u0017\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0017\u0010\n\u001a7\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0018\u0010\n\u001a7\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u0019\u0010\n\u001a7\u0010\u001a\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lio/ktor/client/HttpClient;", "Ljava/net/URL;", "url", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/statement/HttpResponse;", "request", "(Lio/ktor/client/HttpClient;Ljava/net/URL;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "post", "put", "patch", "options", "head", "delete", "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "prepareGet", "preparePost", "preparePut", "preparePatch", "prepareOptions", "prepareHead", "prepareDelete", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuildersJvmKt {
    public static /* synthetic */ java.lang.Object request$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit request$lambda$0;
                    request$lambda$0 = io.ktor.client.request.BuildersJvmKt.request$lambda$0((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return request$lambda$0;
                }
            };
        }
        return request(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit request$lambda$0(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object get$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = io.ktor.client.request.BuildersJvmKt.get$lambda$2((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return unit;
                }
            };
        }
        return get(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit get$lambda$2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object post$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit post$lambda$4;
                    post$lambda$4 = io.ktor.client.request.BuildersJvmKt.post$lambda$4((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return post$lambda$4;
                }
            };
        }
        return post(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit post$lambda$4(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object put$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit put$lambda$6;
                    put$lambda$6 = io.ktor.client.request.BuildersJvmKt.put$lambda$6((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return put$lambda$6;
                }
            };
        }
        return put(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit put$lambda$6(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object patch$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit patch$lambda$8;
                    patch$lambda$8 = io.ktor.client.request.BuildersJvmKt.patch$lambda$8((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return patch$lambda$8;
                }
            };
        }
        return patch(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit patch$lambda$8(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object options$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit options$lambda$10;
                    options$lambda$10 = io.ktor.client.request.BuildersJvmKt.options$lambda$10((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return options$lambda$10;
                }
            };
        }
        return options(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit options$lambda$10(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object head$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit head$lambda$12;
                    head$lambda$12 = io.ktor.client.request.BuildersJvmKt.head$lambda$12((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return head$lambda$12;
                }
            };
        }
        return head(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit head$lambda$12(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object delete$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit delete$lambda$14;
                    delete$lambda$14 = io.ktor.client.request.BuildersJvmKt.delete$lambda$14((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return delete$lambda$14;
                }
            };
        }
        return delete(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit delete$lambda$14(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object prepareRequest$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit prepareRequest$lambda$16;
                    prepareRequest$lambda$16 = io.ktor.client.request.BuildersJvmKt.prepareRequest$lambda$16((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return prepareRequest$lambda$16;
                }
            };
        }
        return prepareRequest(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit prepareRequest$lambda$16(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object prepareGet$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit prepareGet$lambda$18;
                    prepareGet$lambda$18 = io.ktor.client.request.BuildersJvmKt.prepareGet$lambda$18((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return prepareGet$lambda$18;
                }
            };
        }
        return prepareGet(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit prepareGet$lambda$18(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object preparePost$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit preparePost$lambda$20;
                    preparePost$lambda$20 = io.ktor.client.request.BuildersJvmKt.preparePost$lambda$20((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return preparePost$lambda$20;
                }
            };
        }
        return preparePost(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit preparePost$lambda$20(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object preparePut$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit preparePut$lambda$22;
                    preparePut$lambda$22 = io.ktor.client.request.BuildersJvmKt.preparePut$lambda$22((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return preparePut$lambda$22;
                }
            };
        }
        return preparePut(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit preparePut$lambda$22(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object preparePatch$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit preparePatch$lambda$24;
                    preparePatch$lambda$24 = io.ktor.client.request.BuildersJvmKt.preparePatch$lambda$24((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return preparePatch$lambda$24;
                }
            };
        }
        return preparePatch(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit preparePatch$lambda$24(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object prepareOptions$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit prepareOptions$lambda$26;
                    prepareOptions$lambda$26 = io.ktor.client.request.BuildersJvmKt.prepareOptions$lambda$26((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return prepareOptions$lambda$26;
                }
            };
        }
        return prepareOptions(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit prepareOptions$lambda$26(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object prepareHead$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit prepareHead$lambda$28;
                    prepareHead$lambda$28 = io.ktor.client.request.BuildersJvmKt.prepareHead$lambda$28((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return prepareHead$lambda$28;
                }
            };
        }
        return prepareHead(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit prepareHead$lambda$28(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object prepareDelete$default(io.ktor.client.HttpClient httpClient, java.net.URL url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.BuildersJvmKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit prepareDelete$lambda$30;
                    prepareDelete$lambda$30 = io.ktor.client.request.BuildersJvmKt.prepareDelete$lambda$30((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return prepareDelete$lambda$30;
                }
            };
        }
        return prepareDelete(httpClient, url, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit prepareDelete$lambda$30(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
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
}
