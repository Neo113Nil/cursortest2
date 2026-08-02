package coil3.content.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072'\u0010\u000e\u001a#\b\u0001\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcoil3/network/okhttp/internal/CallFactoryNetworkClient;", "Lcoil3/network/NetworkClient;", "Lokhttp3/Call$Factory;", "callFactory", "constructor-impl", "(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;", "T", "Lcoil3/network/NetworkRequest;", "request", "Lkotlin/Function2;", "Lcoil3/network/NetworkResponse;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "block", "executeRequest-impl", "(Lokhttp3/Call$Factory;Lcoil3/network/NetworkRequest;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequest", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Call$Factory;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class CallFactoryNetworkClient implements coil3.content.NetworkClient {
    private final okhttp3.Call.Factory getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static okhttp3.Call.Factory m9785constructorimpl(okhttp3.Call.Factory factory) {
        return factory;
    }

    private /* synthetic */ CallFactoryNetworkClient(okhttp3.Call.Factory factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = factory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0061, code lost:
    
        if (r11 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: executeRequest-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> java.lang.Object m9788executeRequestimpl(okhttp3.Call.Factory factory, coil3.content.NetworkRequest networkRequest, kotlin.jvm.functions.Function2<? super coil3.content.NetworkResponse, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        coil3.content.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 callFactoryNetworkClient$executeRequest$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.functions.Function2<? super coil3.content.NetworkResponse, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function22;
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.io.Closeable closeable2;
        if (continuation instanceof coil3.content.okhttp.internal.CallFactoryNetworkClient$executeRequest$1) {
            callFactoryNetworkClient$executeRequest$1 = (coil3.content.okhttp.internal.CallFactoryNetworkClient$executeRequest$1) continuation;
            if ((callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = callFactoryNetworkClient$executeRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor = function2;
                    callFactoryNetworkClient$executeRequest$1.Camera2StreamConfigurationMap = factory;
                    callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges = 1;
                    obj = coil3.content.okhttp.internal.CallFactoryNetworkClientKt.access$toRequest(networkRequest, callFactoryNetworkClient$executeRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            closeable2 = (java.io.Closeable) callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlin.io.CloseableKt.closeFinally(closeable2, null);
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    kotlin.io.CloseableKt.closeFinally(closeable2, th);
                                    throw th3;
                                }
                            }
                        }
                        function22 = (kotlin.jvm.functions.Function2) callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        closeable = (java.io.Closeable) obj;
                        try {
                            coil3.content.NetworkResponse access$toNetworkResponse = coil3.content.okhttp.internal.CallFactoryNetworkClientKt.access$toNetworkResponse((okhttp3.Response) closeable);
                            callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor = closeable;
                            callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges = 3;
                            obj = function22.invoke(access$toNetworkResponse, callFactoryNetworkClient$executeRequest$1);
                            if (obj != coroutine_suspended) {
                                closeable2 = closeable;
                                kotlin.io.CloseableKt.closeFinally(closeable2, null);
                                return obj;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            closeable2 = closeable;
                            throw th;
                        }
                    }
                    factory = (okhttp3.Call.Factory) callFactoryNetworkClient$executeRequest$1.Camera2StreamConfigurationMap;
                    function2 = (kotlin.jvm.functions.Function2) callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                okhttp3.Call newCall = factory.newCall((okhttp3.Request) obj);
                callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor = function2;
                callFactoryNetworkClient$executeRequest$1.Camera2StreamConfigurationMap = null;
                callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges = 2;
                obj = coil3.content.okhttp.internal.CallsKt.await(newCall, callFactoryNetworkClient$executeRequest$1);
                if (obj != coroutine_suspended) {
                    function22 = function2;
                    closeable = (java.io.Closeable) obj;
                    coil3.content.NetworkResponse access$toNetworkResponse2 = coil3.content.okhttp.internal.CallFactoryNetworkClientKt.access$toNetworkResponse((okhttp3.Response) closeable);
                    callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor = closeable;
                    callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges = 3;
                    obj = function22.invoke(access$toNetworkResponse2, callFactoryNetworkClient$executeRequest$1);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        callFactoryNetworkClient$executeRequest$1 = new coil3.content.okhttp.internal.CallFactoryNetworkClient$executeRequest$1(continuation);
        obj = callFactoryNetworkClient$executeRequest$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        okhttp3.Call newCall2 = factory.newCall((okhttp3.Request) obj);
        callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRangesFor = function2;
        callFactoryNetworkClient$executeRequest$1.Camera2StreamConfigurationMap = null;
        callFactoryNetworkClient$executeRequest$1.getHighSpeedVideoFpsRanges = 2;
        obj = coil3.content.okhttp.internal.CallsKt.await(newCall2, callFactoryNetworkClient$executeRequest$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // coil3.content.NetworkClient
    public final <T> java.lang.Object executeRequest(coil3.content.NetworkRequest networkRequest, kotlin.jvm.functions.Function2<? super coil3.content.NetworkResponse, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return m9788executeRequestimpl(this.getHighResolutionOutputSizeshNQ4ISI, networkRequest, function2, continuation);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ okhttp3.Call.Factory getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m9790toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m9789hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m9786equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9790toStringimpl(okhttp3.Call.Factory factory) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallFactoryNetworkClient(callFactory=");
        sb.append(factory);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9789hashCodeimpl(okhttp3.Call.Factory factory) {
        return factory.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9787equalsimpl0(okhttp3.Call.Factory factory, okhttp3.Call.Factory factory2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(factory, factory2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9786equalsimpl(okhttp3.Call.Factory factory, java.lang.Object obj) {
        return (obj instanceof coil3.content.okhttp.internal.CallFactoryNetworkClient) && kotlin.jvm.internal.Intrinsics.areEqual(factory, ((coil3.content.okhttp.internal.CallFactoryNetworkClient) obj).getGetHighResolutionOutputSizeshNQ4ISI());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ coil3.content.okhttp.internal.CallFactoryNetworkClient m9784boximpl(okhttp3.Call.Factory factory) {
        return new coil3.content.okhttp.internal.CallFactoryNetworkClient(factory);
    }
}
