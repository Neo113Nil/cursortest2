package com.plaid.internal;

/* loaded from: classes16.dex */
public final class F5 implements okhttp3.Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.E5 f5788a;

    public F5(com.plaid.internal.E5 e5) {
        this.f5788a = e5;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request.Builder newBuilder = chain.request().newBuilder();
        java.lang.String str = this.f5788a.f5780a;
        if (str != null) {
            newBuilder.addHeader("User-Agent", str);
        }
        okhttp3.Request build = newBuilder.build();
        okhttp3.Response proceed = chain.proceed(build);
        if (!proceed.getIsSuccessful() && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) build.url().encodedPath(), (java.lang.CharSequence) "sentry", false, 2, (java.lang.Object) null)) {
            int i = com.plaid.internal.core.networking.models.NetworkException.c;
            com.plaid.internal.core.networking.models.NetworkException a2 = com.plaid.internal.core.networking.models.NetworkException.a.a(build, proceed);
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, a2, a2.f6014a);
        }
        return proceed;
    }
}
