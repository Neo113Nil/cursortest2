package retrofit2;

/* loaded from: classes5.dex */
final class CompletableFutureCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    CompletableFutureCallAdapterFactory() {
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public final retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != java.util.concurrent.CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        java.lang.reflect.Type parameterUpperBound = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type);
        if (getRawType(parameterUpperBound) != retrofit2.Response.class) {
            return new retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter(parameterUpperBound);
        }
        if (!(parameterUpperBound instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter(getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) parameterUpperBound));
    }

    static final class BodyCallAdapter<R> implements retrofit2.CallAdapter<R, java.util.concurrent.CompletableFuture<R>> {
        private final java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI;

        BodyCallAdapter(java.lang.reflect.Type type) {
            this.getHighResolutionOutputSizeshNQ4ISI = type;
        }

        @Override // retrofit2.CallAdapter
        public final java.lang.reflect.Type responseType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        class BodyCallback implements retrofit2.Callback<R> {
            private final java.util.concurrent.CompletableFuture<R> getHighSpeedVideoFpsRangesFor;

            public BodyCallback(java.util.concurrent.CompletableFuture<R> completableFuture) {
                this.getHighSpeedVideoFpsRangesFor = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<R> call, retrofit2.Response<R> response) {
                if (response.isSuccessful()) {
                    this.getHighSpeedVideoFpsRangesFor.complete(response.body());
                } else {
                    this.getHighSpeedVideoFpsRangesFor.completeExceptionally(new retrofit2.HttpException(response));
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<R> call, java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor.completeExceptionally(th);
            }
        }

        @Override // retrofit2.CallAdapter
        public final /* synthetic */ java.lang.Object adapt(retrofit2.Call call) {
            retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture callCancelCompletableFuture = new retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture(call);
            call.enqueue(new retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter.BodyCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    static final class ResponseCallAdapter<R> implements retrofit2.CallAdapter<R, java.util.concurrent.CompletableFuture<retrofit2.Response<R>>> {
        private final java.lang.reflect.Type Camera2StreamConfigurationMap;

        ResponseCallAdapter(java.lang.reflect.Type type) {
            this.Camera2StreamConfigurationMap = type;
        }

        @Override // retrofit2.CallAdapter
        public final java.lang.reflect.Type responseType() {
            return this.Camera2StreamConfigurationMap;
        }

        class ResponseCallback implements retrofit2.Callback<R> {
            private final java.util.concurrent.CompletableFuture<retrofit2.Response<R>> getHighSpeedVideoSizes;

            public ResponseCallback(java.util.concurrent.CompletableFuture<retrofit2.Response<R>> completableFuture) {
                this.getHighSpeedVideoSizes = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<R> call, retrofit2.Response<R> response) {
                this.getHighSpeedVideoSizes.complete(response);
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<R> call, java.lang.Throwable th) {
                this.getHighSpeedVideoSizes.completeExceptionally(th);
            }
        }

        @Override // retrofit2.CallAdapter
        public final /* synthetic */ java.lang.Object adapt(retrofit2.Call call) {
            retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture callCancelCompletableFuture = new retrofit2.CompletableFutureCallAdapterFactory.CallCancelCompletableFuture(call);
            call.enqueue(new retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter.ResponseCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    static final class CallCancelCompletableFuture<T> extends java.util.concurrent.CompletableFuture<T> {
        private final retrofit2.Call<?> getHighResolutionOutputSizeshNQ4ISI;

        CallCancelCompletableFuture(retrofit2.Call<?> call) {
            this.getHighResolutionOutputSizeshNQ4ISI = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            }
            return super.cancel(z);
        }
    }
}
