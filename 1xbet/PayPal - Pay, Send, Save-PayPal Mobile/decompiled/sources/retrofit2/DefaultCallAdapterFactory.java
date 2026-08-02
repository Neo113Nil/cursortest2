package retrofit2;

/* loaded from: classes5.dex */
final class DefaultCallAdapterFactory extends retrofit2.CallAdapter.Factory {

    @javax.annotation.Nullable
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRanges;

    DefaultCallAdapterFactory(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoFpsRanges = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public final retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != retrofit2.Call.class) {
            return null;
        }
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final java.lang.reflect.Type Camera2StreamConfigurationMap = retrofit2.Utils.Camera2StreamConfigurationMap(0, (java.lang.reflect.ParameterizedType) type);
        final java.util.concurrent.Executor executor = retrofit2.Utils.Camera2StreamConfigurationMap(annotationArr, (java.lang.Class<? extends java.lang.annotation.Annotation>) retrofit2.SkipCallbackExecutor.class) ? null : this.getHighSpeedVideoFpsRanges;
        return new retrofit2.CallAdapter<java.lang.Object, retrofit2.Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            /* renamed from: responseType */
            public java.lang.reflect.Type getGetHighResolutionOutputSizeshNQ4ISI() {
                return Camera2StreamConfigurationMap;
            }

            @Override // retrofit2.CallAdapter
            public /* synthetic */ retrofit2.Call<?> adapt(retrofit2.Call<java.lang.Object> call) {
                java.util.concurrent.Executor executor2 = executor;
                return executor2 == null ? call : new retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall(executor2, call);
            }
        };
    }

    static final class ExecutorCallbackCall<T> implements retrofit2.Call<T> {
        final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        final retrofit2.Call<T> getHighSpeedVideoSizes;

        ExecutorCallbackCall(java.util.concurrent.Executor executor, retrofit2.Call<T> call) {
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
            this.getHighSpeedVideoSizes = call;
        }

        @Override // retrofit2.Call
        public final void enqueue(retrofit2.Callback<T> callback) {
            java.util.Objects.requireNonNull(callback, "callback == null");
            this.getHighSpeedVideoSizes.enqueue(new retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1(callback));
        }

        /* renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: invalid class name */
        class AnonymousClass1 implements retrofit2.Callback<T> {
            final /* synthetic */ retrofit2.Callback getHighSpeedVideoFpsRangesFor;

            AnonymousClass1(retrofit2.Callback callback) {
                this.getHighSpeedVideoFpsRangesFor = callback;
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<T> call, final retrofit2.Response<T> response) {
                java.util.concurrent.Executor executor = retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this.getHighResolutionOutputSizeshNQ4ISI;
                final retrofit2.Callback callback = this.getHighSpeedVideoFpsRangesFor;
                executor.execute(new java.lang.Runnable() { // from class: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1 = retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.this;
                        retrofit2.Callback callback2 = callback;
                        retrofit2.Response response2 = response;
                        if (retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this.getHighSpeedVideoSizes.isCanceled()) {
                            callback2.onFailure(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this, new java.io.IOException("Canceled"));
                        } else {
                            callback2.onResponse(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this, response2);
                        }
                    }
                });
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<T> call, final java.lang.Throwable th) {
                java.util.concurrent.Executor executor = retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this.getHighResolutionOutputSizeshNQ4ISI;
                final retrofit2.Callback callback = this.getHighSpeedVideoFpsRangesFor;
                executor.execute(new java.lang.Runnable() { // from class: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1 = retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.this;
                        callback.onFailure(retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.this, th);
                    }
                });
            }
        }

        @Override // retrofit2.Call
        public final boolean isExecuted() {
            return this.getHighSpeedVideoSizes.isExecuted();
        }

        @Override // retrofit2.Call
        public final retrofit2.Response<T> execute() throws java.io.IOException {
            return this.getHighSpeedVideoSizes.execute();
        }

        @Override // retrofit2.Call
        public final void cancel() {
            this.getHighSpeedVideoSizes.cancel();
        }

        @Override // retrofit2.Call
        public final boolean isCanceled() {
            return this.getHighSpeedVideoSizes.isCanceled();
        }

        @Override // retrofit2.Call
        public final retrofit2.Call<T> clone() {
            return new retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.clone());
        }

        @Override // retrofit2.Call
        public final okhttp3.Request request() {
            return this.getHighSpeedVideoSizes.request();
        }

        @Override // retrofit2.Call
        public final okio.Timeout timeout() {
            return this.getHighSpeedVideoSizes.timeout();
        }
    }
}
