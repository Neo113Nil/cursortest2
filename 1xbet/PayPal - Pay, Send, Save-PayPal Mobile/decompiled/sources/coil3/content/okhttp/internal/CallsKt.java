package coil3.content.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", "await", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallsKt {
    public static final java.lang.Object await(final okhttp3.Call call, kotlin.coroutines.Continuation<? super okhttp3.Response> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: coil3.network.okhttp.internal.CallsKt$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                okhttp3.Call.this.cancel();
                return kotlin.Unit.INSTANCE;
            }
        });
        call.enqueue(new okhttp3.Callback() { // from class: coil3.network.okhttp.internal.CallsKt$await$2$2
            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call2, java.io.IOException e) {
                kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(e)));
            }

            @Override // okhttp3.Callback
            public final void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                cancellableContinuationImpl2.resume((kotlinx.coroutines.CancellableContinuation<okhttp3.Response>) response, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuation<okhttp3.Response>, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) new kotlin.jvm.functions.Function3<java.lang.Throwable, okhttp3.Response, kotlin.coroutines.CoroutineContext, kotlin.Unit>() { // from class: coil3.network.okhttp.internal.CallsKt$await$2$2$onResponse$1
                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th, okhttp3.Response response2, kotlin.coroutines.CoroutineContext coroutineContext) {
                        coil3.content.okhttp.internal.UtilsKt.closeQuietly(response2);
                        return kotlin.Unit.INSTANCE;
                    }
                });
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
