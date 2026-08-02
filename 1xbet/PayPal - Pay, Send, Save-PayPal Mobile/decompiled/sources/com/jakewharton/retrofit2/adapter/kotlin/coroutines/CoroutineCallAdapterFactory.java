package com.jakewharton.retrofit2.adapter.kotlin.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u000e\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "<init>", "()V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/CallAdapter;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "Companion", "BodyCallAdapter", "ResponseCallAdapter"}, k = 1, mv = {2, 3, 0})
/* loaded from: classes9.dex */
public final class CoroutineCallAdapterFactory extends retrofit2.CallAdapter.Factory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory.Companion INSTANCE = new com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory.Companion(null);

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory$Companion;", "", "<init>", "()V", "Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory;", "create", "()Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory;"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory create() {
            return new com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory(null);
        }
    }

    private CoroutineCallAdapterFactory() {
    }

    public /* synthetic */ CoroutineCallAdapterFactory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // retrofit2.CallAdapter.Factory
    public final retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type returnType, java.lang.annotation.Annotation[] annotations, retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(retrofit, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.coroutines.Deferred.class, retrofit2.CallAdapter.Factory.getRawType(returnType))) {
            return null;
        }
        if (returnType instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type parameterUpperBound = retrofit2.CallAdapter.Factory.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) returnType);
            if (kotlin.jvm.internal.Intrinsics.areEqual(retrofit2.CallAdapter.Factory.getRawType(parameterUpperBound), retrofit2.Response.class)) {
                if (parameterUpperBound instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.Type parameterUpperBound2 = retrofit2.CallAdapter.Factory.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) parameterUpperBound);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterUpperBound2, "");
                    return new com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory.ResponseCallAdapter(parameterUpperBound2);
                }
                throw new java.lang.IllegalStateException("Response must be parameterized as Response<Foo> or Response<out Foo>");
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterUpperBound, "");
            return new com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory.BodyCallAdapter(parameterUpperBound);
        }
        throw new java.lang.IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory$BodyCallAdapter;", "T", "Lretrofit2/CallAdapter;", "Lkotlinx/coroutines/Deferred;", "Ljava/lang/reflect/Type;", "p0", "<init>", "(Ljava/lang/reflect/Type;)V", "responseType", "()Ljava/lang/reflect/Type;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/reflect/Type;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0})
    static final class BodyCallAdapter<T> implements retrofit2.CallAdapter<T, kotlinx.coroutines.Deferred<? extends T>> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.reflect.Type getHighSpeedVideoFpsRanges;

        public BodyCallAdapter(java.lang.reflect.Type type) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "");
            this.getHighSpeedVideoFpsRanges = type;
        }

        @Override // retrofit2.CallAdapter
        public final /* synthetic */ java.lang.Object adapt(final retrofit2.Call call) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call, "");
            final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory$BodyCallAdapter$adapt$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    getHighResolutionOutputSizeshNQ4ISI(th);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
                    if (kotlinx.coroutines.CompletableDeferred.this.isCancelled()) {
                        call.cancel();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            call.enqueue(new retrofit2.Callback<T>() { // from class: com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory$BodyCallAdapter$adapt$2
                @Override // retrofit2.Callback
                public final void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(t, "");
                    kotlinx.coroutines.CompletableDeferred.this.completeExceptionally(t);
                }

                @Override // retrofit2.Callback
                public final void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(response, "");
                    if (response.isSuccessful()) {
                        kotlinx.coroutines.CompletableDeferred completableDeferred = kotlinx.coroutines.CompletableDeferred.this;
                        T body = response.body();
                        if (body == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        completableDeferred.complete(body);
                        return;
                    }
                    kotlinx.coroutines.CompletableDeferred.this.completeExceptionally(new retrofit2.HttpException(response));
                }
            });
            return CompletableDeferred$default;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: responseType, reason: from getter */
        public final java.lang.reflect.Type getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory$ResponseCallAdapter;", "T", "Lretrofit2/CallAdapter;", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Ljava/lang/reflect/Type;", "p0", "<init>", "(Ljava/lang/reflect/Type;)V", "responseType", "()Ljava/lang/reflect/Type;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/reflect/Type;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0})
    static final class ResponseCallAdapter<T> implements retrofit2.CallAdapter<T, kotlinx.coroutines.Deferred<? extends retrofit2.Response<T>>> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.reflect.Type getHighSpeedVideoSizes;

        public ResponseCallAdapter(java.lang.reflect.Type type) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "");
            this.getHighSpeedVideoSizes = type;
        }

        @Override // retrofit2.CallAdapter
        public final /* synthetic */ java.lang.Object adapt(final retrofit2.Call call) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call, "");
            final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory$ResponseCallAdapter$adapt$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    Camera2StreamConfigurationMap(th);
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
                    if (kotlinx.coroutines.CompletableDeferred.this.isCancelled()) {
                        call.cancel();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            call.enqueue(new retrofit2.Callback<T>() { // from class: com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory$ResponseCallAdapter$adapt$2
                @Override // retrofit2.Callback
                public final void onFailure(retrofit2.Call<T> call2, java.lang.Throwable t) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(t, "");
                    kotlinx.coroutines.CompletableDeferred.this.completeExceptionally(t);
                }

                @Override // retrofit2.Callback
                public final void onResponse(retrofit2.Call<T> call2, retrofit2.Response<T> response) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(call2, "");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(response, "");
                    kotlinx.coroutines.CompletableDeferred.this.complete(response);
                }
            });
            return CompletableDeferred$default;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: responseType, reason: from getter */
        public final java.lang.reflect.Type getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory create() {
        return INSTANCE.create();
    }
}
