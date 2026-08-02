package retrofit2;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a \u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0086@¢\u0006\u0004\b\b\u0010\u0007\u001a\u001a\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\f\u0010\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "", "awaitUnit", "Lretrofit2/Response;", "awaitResponse", "", "", "suspendAndThrow", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KotlinExtensions {
    public static final /* synthetic */ <T> T create(retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        T t = (T) retrofit.create(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "");
        return t;
    }

    public static final java.lang.Object awaitUnit(retrofit2.Call<kotlin.Unit> call, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(call, "");
        return awaitNullable(call, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Throwable th, kotlin.coroutines.Continuation<?> continuation) {
        retrofit2.KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        int i;
        if (continuation instanceof retrofit2.KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (retrofit2.KotlinExtensions$suspendAndThrow$1) continuation;
            if ((kotlinExtensions$suspendAndThrow$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = kotlinExtensions$suspendAndThrow$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kotlinExtensions$suspendAndThrow$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinExtensions$suspendAndThrow$1.getHighResolutionOutputSizeshNQ4ISI = th;
                    kotlinExtensions$suspendAndThrow$1.getHighSpeedVideoFpsRangesFor = 1;
                    final retrofit2.KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$12 = kotlinExtensions$suspendAndThrow$1;
                    kotlinx.coroutines.Dispatchers.getDefault().dispatch(kotlinExtensions$suspendAndThrow$12.getContext(), new java.lang.Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$2$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlinExtensions$suspendAndThrow$12);
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            intercepted.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
                        }
                    });
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (coroutine_suspended2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(kotlinExtensions$suspendAndThrow$12);
                    }
                    if (coroutine_suspended2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        kotlinExtensions$suspendAndThrow$1 = new retrofit2.KotlinExtensions$suspendAndThrow$1(continuation);
        java.lang.Object obj2 = kotlinExtensions$suspendAndThrow$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinExtensions$suspendAndThrow$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public static final <T> java.lang.Object await(final retrofit2.Call<T> call, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: retrofit2.KotlinExtensions$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                call.cancel();
                return kotlin.Unit.INSTANCE;
            }
        });
        call.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public final void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        java.lang.Object tag = call2.request().tag(retrofit2.Invocation.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(tag);
                        retrofit2.Invocation invocation = (retrofit2.Invocation) tag;
                        java.lang.Class<?> service = invocation.service();
                        java.lang.reflect.Method method = invocation.method();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Response from ");
                        sb.append(service.getName());
                        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        kotlin.KotlinNullPointerException kotlinNullPointerException = new kotlin.KotlinNullPointerException(sb.toString());
                        kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(kotlinNullPointerException)));
                        return;
                    }
                    kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(body));
                    return;
                }
                kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation3 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                cancellableContinuation3.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new retrofit2.HttpException(response))));
            }

            @Override // retrofit2.Callback
            public final void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
                kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(t)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> java.lang.Object awaitNullable(final retrofit2.Call<T> call, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: retrofit2.KotlinExtensions$await$4$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                call.cancel();
                return kotlin.Unit.INSTANCE;
            }
        });
        call.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public final void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                if (response.isSuccessful()) {
                    kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(response.body()));
                } else {
                    kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new retrofit2.HttpException(response))));
                }
            }

            @Override // retrofit2.Callback
            public final void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
                kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(t)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> java.lang.Object awaitResponse(final retrofit2.Call<T> call, kotlin.coroutines.Continuation<? super retrofit2.Response<T>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                call.cancel();
                return kotlin.Unit.INSTANCE;
            }
        });
        call.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public final void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                kotlinx.coroutines.CancellableContinuation<retrofit2.Response<T>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(response));
            }

            @Override // retrofit2.Callback
            public final void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
                kotlinx.coroutines.CancellableContinuation<retrofit2.Response<T>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(t)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
