package com.plaid.internal;

/* loaded from: classes16.dex */
public final class U<S, E> implements retrofit2.Call<com.plaid.internal.AbstractC0550i4<? extends S, ? extends E>> {

    /* renamed from: a, reason: collision with root package name */
    public final retrofit2.Call<S> f5929a;
    public final retrofit2.Converter<okhttp3.ResponseBody, E> b;

    public static final class a implements retrofit2.Callback<S> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ retrofit2.Callback<com.plaid.internal.AbstractC0550i4<S, E>> f5930a;
        public final /* synthetic */ com.plaid.internal.U<S, E> b;

        public a(retrofit2.Callback<com.plaid.internal.AbstractC0550i4<S, E>> callback, com.plaid.internal.U<S, E> u) {
            this.f5930a = callback;
            this.b = u;
        }

        @Override // retrofit2.Callback
        public final void onFailure(retrofit2.Call<S> call, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.f5930a.onResponse(this.b, retrofit2.Response.success(th instanceof java.io.IOException ? new com.plaid.internal.AbstractC0550i4.b((java.io.IOException) th) : new com.plaid.internal.AbstractC0550i4.d(th)));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
        @Override // retrofit2.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResponse(retrofit2.Call<S> call, retrofit2.Response<S> response) {
            E e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            S body = response.body();
            int code = response.code();
            okhttp3.ResponseBody errorBody = response.errorBody();
            if (response.isSuccessful()) {
                if (body != null) {
                    this.f5930a.onResponse(this.b, retrofit2.Response.success(new com.plaid.internal.AbstractC0550i4.c(body)));
                    return;
                } else {
                    this.f5930a.onResponse(this.b, retrofit2.Response.success(new com.plaid.internal.AbstractC0550i4.d(null)));
                    return;
                }
            }
            if (errorBody != null && errorBody.getGetHighSpeedVideoFpsRanges() != 0) {
                try {
                    e = this.b.b.convert(errorBody);
                } catch (java.lang.Exception unused) {
                }
                if (e == null) {
                    this.f5930a.onResponse(this.b, retrofit2.Response.success(new com.plaid.internal.AbstractC0550i4.a(e, code)));
                    return;
                } else {
                    this.f5930a.onResponse(this.b, retrofit2.Response.success(new com.plaid.internal.AbstractC0550i4.d(null)));
                    return;
                }
            }
            e = null;
            if (e == null) {
            }
        }
    }

    public U(retrofit2.Call<S> call, retrofit2.Converter<okhttp3.ResponseBody, E> converter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "");
        this.f5929a = call;
        this.b = converter;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f5929a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(retrofit2.Callback<com.plaid.internal.AbstractC0550i4<S, E>> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.f5929a.enqueue(new com.plaid.internal.U.a(callback, this));
    }

    @Override // retrofit2.Call
    public final retrofit2.Response<com.plaid.internal.AbstractC0550i4<S, E>> execute() {
        throw new java.lang.UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f5929a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f5929a.isExecuted();
    }

    @Override // retrofit2.Call
    public final okhttp3.Request request() {
        okhttp3.Request request = this.f5929a.request();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(request, "");
        return request;
    }

    @Override // retrofit2.Call
    public final okio.Timeout timeout() {
        okio.Timeout timeout = this.f5929a.timeout();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeout, "");
        return timeout;
    }

    @Override // retrofit2.Call
    public final com.plaid.internal.U<S, E> clone() {
        retrofit2.Call<S> clone = this.f5929a.clone();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clone, "");
        return new com.plaid.internal.U<>(clone, this.b);
    }
}
