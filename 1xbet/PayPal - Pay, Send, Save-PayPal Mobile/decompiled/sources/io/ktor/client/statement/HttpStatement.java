package io.ktor.client.statement;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2'\u0010\r\u001a#\b\u0001\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u0010J\u0018\u0010\u0011\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086H¢\u0006\u0004\b\u0011\u0010\u0010JI\u0010\u0011\u001a\u00028\u0001\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0004\b\u0001\u0010\u00122)\b\u0004\u0010\r\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086H¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0014\u0010\u0010J\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\nH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lio/ktor/client/statement/HttpStatement;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V", "T", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "block", "execute", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "fetchStreamingResponse", "fetchResponse", "", "cleanup", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/client/request/HttpRequestBuilder;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "getClient$annotations", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpStatement {
    private final io.ktor.client.HttpClient client;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final io.ktor.client.request.HttpRequestBuilder getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getClient$annotations() {
    }

    public HttpStatement(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = httpRequestBuilder;
        this.client = httpClient;
    }

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(3:16|17|18))(3:19|20|21))(5:22|23|24|25|(2:27|28)(1:29)))(2:36|37))(2:45|46)|38|39|40|(3:42|25|(0)(0))|28))|51|6|7|(0)(0)|38|39|40|(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0065, code lost:
    
        if (r10 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
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
                if ((httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = httpStatement$execute$1.getHighSpeedVideoFpsRanges;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        httpStatement$execute$1.getHighSpeedVideoFpsRangesFor = function2;
                        httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = fetchStreamingResponse(httpStatement$execute$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    java.lang.Object obj2 = httpStatement$execute$1.getHighSpeedVideoFpsRangesFor;
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    return obj2;
                                }
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                th = (java.lang.Throwable) httpStatement$execute$1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj);
                                throw th;
                            }
                            httpResponse2 = (io.ktor.client.statement.HttpResponse) httpStatement$execute$1.getHighSpeedVideoFpsRangesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                httpStatement$execute$1.getHighSpeedVideoFpsRangesFor = obj;
                                httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                            } catch (java.lang.Throwable th) {
                                httpResponse = httpResponse2;
                                th = th;
                                httpStatement$execute$1.getHighSpeedVideoFpsRangesFor = th;
                                httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI = 4;
                                if (cleanup(httpResponse, httpStatement$execute$1) == coroutine_suspended) {
                                }
                                throw th;
                            }
                            return cleanup(httpResponse2, httpStatement$execute$1) != coroutine_suspended ? coroutine_suspended : obj;
                        }
                        function2 = (kotlin.jvm.functions.Function2) httpStatement$execute$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                    httpStatement$execute$1.getHighSpeedVideoFpsRangesFor = httpResponse;
                    httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    invoke = function2.invoke(httpResponse, httpStatement$execute$1);
                    if (invoke != coroutine_suspended) {
                        obj = invoke;
                        httpResponse2 = httpResponse;
                        httpStatement$execute$1.getHighSpeedVideoFpsRangesFor = obj;
                        httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                        if (cleanup(httpResponse2, httpStatement$execute$1) != coroutine_suspended) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            httpResponse = (io.ktor.client.statement.HttpResponse) obj;
            httpStatement$execute$1.getHighSpeedVideoFpsRangesFor = httpResponse;
            httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            invoke = function2.invoke(httpResponse, httpStatement$execute$1);
            if (invoke != coroutine_suspended) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$execute$1 = new io.ktor.client.statement.HttpStatement$execute$1(this, continuation);
        java.lang.Object obj3 = httpStatement$execute$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$execute$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.Object execute(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        return fetchResponse(continuation);
    }

    public final /* synthetic */ <T> java.lang.Object body(kotlin.coroutines.Continuation<? super T> continuation) {
        try {
            io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) fetchStreamingResponse(null);
            try {
                io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
                try {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
                } catch (java.lang.Throwable unused) {
                }
                java.lang.Object bodyNullable = call.bodyNullable(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), null);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                java.lang.Object obj = bodyNullable;
                return bodyNullable;
            } finally {
                io.ktor.client.statement.HttpResponseKt.complete(httpResponse);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    public final /* synthetic */ <T, R> java.lang.Object body(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        try {
            io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) fetchStreamingResponse(null);
            try {
                io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
                try {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
                } catch (java.lang.Throwable unused) {
                }
                java.lang.Object bodyNullable = call.bodyNullable(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), null);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                java.lang.Object obj = bodyNullable;
                return function2.invoke(bodyNullable, null);
            } finally {
                cleanup(httpResponse, null);
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
                if ((httpStatement$fetchStreamingResponse$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    httpStatement$fetchStreamingResponse$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = httpStatement$fetchStreamingResponse$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$fetchStreamingResponse$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.client.request.HttpRequestBuilder takeFromWithExecutionContext = new io.ktor.client.request.HttpRequestBuilder().takeFromWithExecutionContext(this.getHighResolutionOutputSizeshNQ4ISI);
                        io.ktor.client.plugins.DoubleReceivePluginKt.skipSaveBody(takeFromWithExecutionContext);
                        io.ktor.client.HttpClient httpClient = this.client;
                        httpStatement$fetchStreamingResponse$1.getHighSpeedVideoSizes = 1;
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
        java.lang.Object obj2 = httpStatement$fetchStreamingResponse$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$fetchStreamingResponse$1.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchResponse(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.statement.HttpStatement$fetchResponse$1 httpStatement$fetchResponse$1;
        int i;
        io.ktor.client.call.HttpClientCall httpClientCall;
        try {
            if (continuation instanceof io.ktor.client.statement.HttpStatement$fetchResponse$1) {
                httpStatement$fetchResponse$1 = (io.ktor.client.statement.HttpStatement$fetchResponse$1) continuation;
                if ((httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = httpStatement$fetchResponse$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.client.request.HttpRequestBuilder takeFromWithExecutionContext = new io.ktor.client.request.HttpRequestBuilder().takeFromWithExecutionContext(this.getHighResolutionOutputSizeshNQ4ISI);
                        io.ktor.client.HttpClient httpClient = this.client;
                        httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = httpClient.execute$ktor_client_core(takeFromWithExecutionContext, httpStatement$fetchResponse$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) httpStatement$fetchResponse$1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                                return httpResponse;
                            }
                            httpClientCall = (io.ktor.client.call.HttpClientCall) httpStatement$fetchResponse$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            io.ktor.client.statement.HttpResponse response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
                            io.ktor.client.statement.HttpResponse response2 = httpClientCall.getResponse();
                            httpStatement$fetchResponse$1.getHighSpeedVideoSizes = response;
                            httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                            return cleanup(response2, httpStatement$fetchResponse$1) == coroutine_suspended ? coroutine_suspended : response;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
                    httpStatement$fetchResponse$1.getHighSpeedVideoSizes = httpClientCall;
                    httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    obj = io.ktor.client.call.SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
                }
            }
            if (i != 0) {
            }
            httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
            httpStatement$fetchResponse$1.getHighSpeedVideoSizes = httpClientCall;
            httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            obj = io.ktor.client.call.SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$fetchResponse$1 = new io.ktor.client.statement.HttpStatement$fetchResponse$1(this, continuation);
        java.lang.Object obj2 = httpStatement$fetchResponse$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$fetchResponse$1.getHighResolutionOutputSizeshNQ4ISI;
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
            if ((httpStatement$cleanup$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                httpStatement$cleanup$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = httpStatement$cleanup$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpStatement$cleanup$1.getHighSpeedVideoSizes;
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
                    httpStatement$cleanup$1.getHighSpeedVideoFpsRanges = completableJob;
                    httpStatement$cleanup$1.getHighSpeedVideoSizes = 1;
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
        java.lang.Object obj2 = httpStatement$cleanup$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$cleanup$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpStatement[");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getUrl());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
