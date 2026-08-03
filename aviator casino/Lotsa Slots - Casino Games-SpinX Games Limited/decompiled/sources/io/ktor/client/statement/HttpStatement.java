package io.ktor.client.statement;

/* compiled from: HttpStatement.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b21\u0010\u000f\u001a-\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0010\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086H¢\u0006\u0004\b\u0013\u0010\u0012JS\u0010\u0013\u001a\u00028\u0001\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0004\b\u0001\u0010\u001423\b\u0004\u0010\u000f\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086H¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\nH\u0081@¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\nH\u0081@¢\u0006\u0004\b\u0016\u0010\u0012J\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\nH\u0081@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lio/ktor/client/statement/HttpStatement;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V", "T", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", com.ironsource.Ve.n, "Lkotlin/coroutines/Continuation;", "block", "execute", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "body", "R", "fetchStreamingResponse", "fetchResponse", "", "cleanup", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "getClient$annotations", "()V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpStatement {
    private final io.ktor.client.request.HttpRequestBuilder builder;
    private final io.ktor.client.HttpClient client;

    public static /* synthetic */ void getClient$annotations() {
    }

    public HttpStatement(io.ktor.client.request.HttpRequestBuilder builder, io.ktor.client.HttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        this.builder = builder;
        this.client = client;
    }

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(2:13|14)(3:16|17|18))(3:19|20|21))(5:22|23|24|25|(1:27)(2:28|29)))(2:36|37))(3:46|47|(1:49))|38|39|40|(1:42)(3:43|25|(0)(0))))|53|6|7|(0)(0)|38|39|40|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object execute(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        io.ktor.client.statement.HttpStatement$execute$1 httpStatement$execute$1;
        java.lang.Object coroutine_suspended;
        int i;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object invoke;
        io.ktor.client.statement.HttpResponse httpResponse2;
        try {
            if (continuation instanceof io.ktor.client.statement.HttpStatement$execute$1) {
                httpStatement$execute$1 = (io.ktor.client.statement.HttpStatement$execute$1) continuation;
                if ((httpStatement$execute$1.label & Integer.MIN_VALUE) != 0) {
                    httpStatement$execute$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = httpStatement$execute$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$execute$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        httpStatement$execute$1.L$0 = function2;
                        httpStatement$execute$1.label = 1;
                        obj = fetchStreamingResponse(httpStatement$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    java.lang.Object obj2 = httpStatement$execute$1.L$0;
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    return obj2;
                                }
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                th = (java.lang.Throwable) httpStatement$execute$1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                throw th;
                            }
                            httpResponse2 = (io.ktor.client.statement.HttpResponse) httpStatement$execute$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                httpStatement$execute$1.L$0 = obj;
                                httpStatement$execute$1.label = 3;
                                return cleanup(httpResponse2, httpStatement$execute$1) != coroutine_suspended ? coroutine_suspended : obj;
                            } catch (java.lang.Throwable th) {
                                httpResponse = httpResponse2;
                                th = th;
                                httpStatement$execute$1.L$0 = th;
                                httpStatement$execute$1.label = 4;
                                if (cleanup(httpResponse, httpStatement$execute$1) == coroutine_suspended) {
                                }
                                throw th;
                            }
                        }
                        function2 = (kotlin.jvm.functions.Function2) httpStatement$execute$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                    httpStatement$execute$1.L$0 = httpResponse;
                    httpStatement$execute$1.label = 2;
                    invoke = function2.invoke(httpResponse, httpStatement$execute$1);
                    if (invoke != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = invoke;
                    httpResponse2 = httpResponse;
                    httpStatement$execute$1.L$0 = obj;
                    httpStatement$execute$1.label = 3;
                    if (cleanup(httpResponse2, httpStatement$execute$1) != coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            httpResponse = (io.ktor.client.statement.HttpResponse) obj;
            httpStatement$execute$1.L$0 = httpResponse;
            httpStatement$execute$1.label = 2;
            invoke = function2.invoke(httpResponse, httpStatement$execute$1);
            if (invoke != coroutine_suspended) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$execute$1 = new io.ktor.client.statement.HttpStatement$execute$1(this, continuation);
        java.lang.Object obj3 = httpStatement$execute$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$execute$1.label;
    }

    public final java.lang.Object execute(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        return fetchResponse(continuation);
    }

    public final /* synthetic */ <T> java.lang.Object body(kotlin.coroutines.Continuation<? super T> continuation) {
        try {
            kotlin.jvm.internal.InlineMarker.mark(3);
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object fetchStreamingResponse = fetchStreamingResponse(null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) fetchStreamingResponse;
            try {
                kotlin.jvm.internal.InlineMarker.mark(3);
                io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
                try {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
                } catch (java.lang.Throwable unused) {
                }
                io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null);
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object bodyNullable = call.bodyNullable(typeInfo, null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                java.lang.Object obj = bodyNullable;
                return bodyNullable;
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                io.ktor.client.statement.HttpResponseKt.complete(httpResponse);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    public final /* synthetic */ <T, R> java.lang.Object body(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        try {
            kotlin.jvm.internal.InlineMarker.mark(3);
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object fetchStreamingResponse = fetchStreamingResponse(null);
            kotlin.jvm.internal.InlineMarker.mark(1);
            io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) fetchStreamingResponse;
            try {
                kotlin.jvm.internal.InlineMarker.mark(3);
                io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
                try {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
                } catch (java.lang.Throwable unused) {
                }
                io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null);
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object bodyNullable = call.bodyNullable(typeInfo, null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                java.lang.Object obj = bodyNullable;
                kotlin.jvm.internal.InlineMarker.mark(3);
                return function2.invoke(bodyNullable, null);
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.mark(3);
                kotlin.jvm.internal.InlineMarker.mark(0);
                cleanup(httpResponse, null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchStreamingResponse(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1 httpStatement$fetchStreamingResponse$1;
        int i;
        try {
            if (continuation instanceof io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1) {
                httpStatement$fetchStreamingResponse$1 = (io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1) continuation;
                if ((httpStatement$fetchStreamingResponse$1.label & Integer.MIN_VALUE) != 0) {
                    httpStatement$fetchStreamingResponse$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = httpStatement$fetchStreamingResponse$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$fetchStreamingResponse$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.client.request.HttpRequestBuilder takeFromWithExecutionContext = new io.ktor.client.request.HttpRequestBuilder().takeFromWithExecutionContext(this.builder);
                        io.ktor.client.plugins.DoubleReceivePluginKt.skipSaveBody(takeFromWithExecutionContext);
                        io.ktor.client.HttpClient httpClient = this.client;
                        httpStatement$fetchStreamingResponse$1.label = 1;
                        obj = httpClient.execute$ktor_client_core(takeFromWithExecutionContext, httpStatement$fetchStreamingResponse$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return ((io.ktor.client.call.HttpClientCall) obj).getResponse();
                }
            }
            if (i != 0) {
            }
            return ((io.ktor.client.call.HttpClientCall) obj).getResponse();
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$fetchStreamingResponse$1 = new io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1(this, continuation);
        java.lang.Object obj2 = httpStatement$fetchStreamingResponse$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$fetchStreamingResponse$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchResponse(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.statement.HttpStatement$fetchResponse$1 httpStatement$fetchResponse$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        io.ktor.client.call.HttpClientCall httpClientCall;
        try {
            if (continuation instanceof io.ktor.client.statement.HttpStatement$fetchResponse$1) {
                httpStatement$fetchResponse$1 = (io.ktor.client.statement.HttpStatement$fetchResponse$1) continuation;
                if ((httpStatement$fetchResponse$1.label & Integer.MIN_VALUE) != 0) {
                    httpStatement$fetchResponse$1.label -= Integer.MIN_VALUE;
                    obj = httpStatement$fetchResponse$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$fetchResponse$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.client.request.HttpRequestBuilder takeFromWithExecutionContext = new io.ktor.client.request.HttpRequestBuilder().takeFromWithExecutionContext(this.builder);
                        io.ktor.client.HttpClient httpClient = this.client;
                        httpStatement$fetchResponse$1.label = 1;
                        obj = httpClient.execute$ktor_client_core(takeFromWithExecutionContext, httpStatement$fetchResponse$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) httpStatement$fetchResponse$1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                return httpResponse;
                            }
                            httpClientCall = (io.ktor.client.call.HttpClientCall) httpStatement$fetchResponse$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            io.ktor.client.statement.HttpResponse response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
                            io.ktor.client.statement.HttpResponse response2 = httpClientCall.getResponse();
                            httpStatement$fetchResponse$1.L$0 = response;
                            httpStatement$fetchResponse$1.label = 3;
                            return cleanup(response2, httpStatement$fetchResponse$1) == coroutine_suspended ? coroutine_suspended : response;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
                    httpStatement$fetchResponse$1.L$0 = httpClientCall;
                    httpStatement$fetchResponse$1.label = 2;
                    obj = io.ktor.client.call.SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    io.ktor.client.statement.HttpResponse response3 = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
                    io.ktor.client.statement.HttpResponse response22 = httpClientCall.getResponse();
                    httpStatement$fetchResponse$1.L$0 = response3;
                    httpStatement$fetchResponse$1.label = 3;
                    if (cleanup(response22, httpStatement$fetchResponse$1) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
            httpStatement$fetchResponse$1.L$0 = httpClientCall;
            httpStatement$fetchResponse$1.label = 2;
            obj = io.ktor.client.call.SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
            if (obj == coroutine_suspended) {
            }
            io.ktor.client.statement.HttpResponse response32 = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
            io.ktor.client.statement.HttpResponse response222 = httpClientCall.getResponse();
            httpStatement$fetchResponse$1.L$0 = response32;
            httpStatement$fetchResponse$1.label = 3;
            if (cleanup(response222, httpStatement$fetchResponse$1) == coroutine_suspended) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$fetchResponse$1 = new io.ktor.client.statement.HttpStatement$fetchResponse$1(this, continuation);
        obj = httpStatement$fetchResponse$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$fetchResponse$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cleanup(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.statement.HttpStatement$cleanup$1 httpStatement$cleanup$1;
        int i;
        if (continuation instanceof io.ktor.client.statement.HttpStatement$cleanup$1) {
            httpStatement$cleanup$1 = (io.ktor.client.statement.HttpStatement$cleanup$1) continuation;
            if ((httpStatement$cleanup$1.label & Integer.MIN_VALUE) != 0) {
                httpStatement$cleanup$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpStatement$cleanup$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpStatement$cleanup$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext.Element element = httpResponse.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    kotlinx.coroutines.CompletableJob completableJob = (kotlinx.coroutines.CompletableJob) element;
                    completableJob.complete();
                    try {
                        io.ktor.utils.io.ByteReadChannelKt.cancel(httpResponse.getRawContent());
                    } catch (java.lang.Throwable unused) {
                    }
                    httpStatement$cleanup$1.L$0 = completableJob;
                    httpStatement$cleanup$1.label = 1;
                    if (completableJob.join(httpStatement$cleanup$1) == coroutine_suspended) {
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
        httpStatement$cleanup$1 = new io.ktor.client.statement.HttpStatement$cleanup$1(this, continuation);
        java.lang.Object obj2 = httpStatement$cleanup$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$cleanup$1.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public java.lang.String toString() {
        return "HttpStatement[" + this.builder.getUrl() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }
}
