package com.paypal.oslo.core.network.rest.adapter;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00040\u0003B+\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00102\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00040\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00040\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00040\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/core/network/rest/adapter/EitherCall;", "", "T", "Lretrofit2/Call;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "proxy", "Ljava/lang/reflect/Type;", "paramType", "", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "errorMappers", "<init>", "(Lretrofit2/Call;Ljava/lang/reflect/Type;Ljava/util/Set;)V", "Lretrofit2/Callback;", com.sun.jna.Callback.METHOD_NAME, "", "enqueue", "(Lretrofit2/Callback;)V", "Lretrofit2/Response;", "execute", "()Lretrofit2/Response;", "clone", "()Lretrofit2/Call;", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "isExecuted", "()Z", "isCanceled", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getHighSpeedVideoSizes", "Lretrofit2/Call;", "getHighSpeedVideoFpsRanges", "Ljava/lang/reflect/Type;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EitherCall<T> implements retrofit2.Call<arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends T>> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.reflect.Type getHighSpeedVideoSizes;
    private final java.util.Set<com.paypal.oslo.core.network.http.error.NetworkErrorMapper> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final retrofit2.Call<T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public EitherCall(retrofit2.Call<T> call, java.lang.reflect.Type type, java.util.Set<? extends com.paypal.oslo.core.network.http.error.NetworkErrorMapper> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRanges = call;
        this.getHighSpeedVideoSizes = type;
        this.getHighSpeedVideoFpsRangesFor = set;
    }

    @Override // retrofit2.Call
    public final void enqueue(final retrofit2.Callback<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T>> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        try {
            this.getHighSpeedVideoFpsRanges.enqueue(new retrofit2.Callback<T>() { // from class: com.paypal.oslo.core.network.rest.adapter.EitherCall$enqueue$1
                @Override // retrofit2.Callback
                public final void onResponse(retrofit2.Call<T> call, retrofit2.Response<T> response) {
                    java.lang.reflect.Type type;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                    retrofit2.Callback<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T>> callback2 = callback;
                    com.paypal.oslo.core.network.rest.adapter.EitherCall<T> eitherCall = this;
                    com.paypal.oslo.core.network.rest.adapter.EitherCall<T> eitherCall2 = eitherCall;
                    type = ((com.paypal.oslo.core.network.rest.adapter.EitherCall) eitherCall).getHighSpeedVideoSizes;
                    callback2.onResponse(eitherCall2, retrofit2.Response.success(com.paypal.oslo.core.network.rest.adapter.EitherExtensionKt.toEither(response, type)));
                }

                @Override // retrofit2.Callback
                public final void onFailure(retrofit2.Call<T> call, java.lang.Throwable t) {
                    com.paypal.oslo.core.network.http.error.NetworkError highResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
                    retrofit2.Callback<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T>> callback2 = callback;
                    com.paypal.oslo.core.network.rest.adapter.EitherCall<T> eitherCall = this;
                    highResolutionOutputSizeshNQ4ISI = eitherCall.getHighResolutionOutputSizeshNQ4ISI(t);
                    callback2.onResponse(eitherCall, retrofit2.Response.success(arrow.core.EitherKt.left(highResolutionOutputSizeshNQ4ISI)));
                }
            });
        } catch (java.lang.Throwable th) {
            callback.onResponse(this, retrofit2.Response.success(arrow.core.EitherKt.left(getHighResolutionOutputSizeshNQ4ISI(th))));
        }
    }

    @Override // retrofit2.Call
    public final retrofit2.Response<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T>> execute() {
        try {
            retrofit2.Response<T> execute = this.getHighSpeedVideoFpsRanges.execute();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(execute, "");
            retrofit2.Response<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T>> success = retrofit2.Response.success(com.paypal.oslo.core.network.rest.adapter.EitherExtensionKt.toEither(execute, this.getHighSpeedVideoSizes));
            kotlin.jvm.internal.Intrinsics.checkNotNull(success);
            return success;
        } catch (java.lang.Throwable th) {
            retrofit2.Response<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T>> success2 = retrofit2.Response.success(arrow.core.EitherKt.left(getHighResolutionOutputSizeshNQ4ISI(th)));
            kotlin.jvm.internal.Intrinsics.checkNotNull(success2);
            return success2;
        }
    }

    @Override // retrofit2.Call
    public final retrofit2.Call<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, T>> clone() {
        retrofit2.Call<T> clone = this.getHighSpeedVideoFpsRanges.clone();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clone, "");
        return new com.paypal.oslo.core.network.rest.adapter.EitherCall(clone, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // retrofit2.Call
    public final okhttp3.Request request() {
        okhttp3.Request request = this.getHighSpeedVideoFpsRanges.request();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(request, "");
        return request;
    }

    @Override // retrofit2.Call
    public final okio.Timeout timeout() {
        okio.Timeout timeout = this.getHighSpeedVideoFpsRanges.timeout();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeout, "");
        return timeout;
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.getHighSpeedVideoFpsRanges.isExecuted();
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.getHighSpeedVideoFpsRanges.isCanceled();
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.getHighSpeedVideoFpsRanges.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.core.network.http.error.NetworkError getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable p0) {
        com.paypal.oslo.core.network.http.error.NetworkError networkError;
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (true) {
            if (!it.hasNext()) {
                networkError = null;
                break;
            }
            networkError = ((com.paypal.oslo.core.network.http.error.NetworkErrorMapper) it.next()).mapToNetworkError(p0);
            if (networkError != null) {
                break;
            }
        }
        return networkError == null ? new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(p0) : networkError;
    }
}
