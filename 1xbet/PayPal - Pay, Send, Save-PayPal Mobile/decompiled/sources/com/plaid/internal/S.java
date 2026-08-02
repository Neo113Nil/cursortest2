package com.plaid.internal;

/* loaded from: classes16.dex */
public final class S<S, E> implements retrofit2.CallAdapter<S, retrofit2.Call<com.plaid.internal.AbstractC0550i4<? extends S, ? extends E>>> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Type f5914a;
    public final retrofit2.Converter<okhttp3.ResponseBody, E> b;

    public S(java.lang.reflect.Type type, retrofit2.Converter<okhttp3.ResponseBody, E> converter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "");
        this.f5914a = type;
        this.b = converter;
    }

    @Override // retrofit2.CallAdapter
    public final java.lang.Object adapt(retrofit2.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        return new com.plaid.internal.U(call, this.b);
    }

    @Override // retrofit2.CallAdapter
    public final java.lang.reflect.Type responseType() {
        return this.f5914a;
    }
}
