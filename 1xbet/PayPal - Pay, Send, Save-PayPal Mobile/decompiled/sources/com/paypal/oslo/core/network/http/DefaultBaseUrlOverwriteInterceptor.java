package com.paypal.oslo.core.network.http;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/network/http/DefaultBaseUrlOverwriteInterceptor;", "Lokhttp3/Interceptor;", "Lkotlin/Function0;", "", "baseUrlProvider", "defaultHostProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultBaseUrlOverwriteInterceptor implements okhttp3.Interceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.String> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public DefaultBaseUrlOverwriteInterceptor(kotlin.jvm.functions.Function0<java.lang.String> function0, kotlin.jvm.functions.Function0<java.lang.String> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoFpsRangesFor = function02;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        okhttp3.HttpUrl url = request.url();
        if (kotlin.jvm.internal.Intrinsics.areEqual(url.host(), this.getHighSpeedVideoFpsRangesFor.invoke())) {
            java.lang.String invoke = this.getHighSpeedVideoFpsRanges.invoke();
            if (kotlin.text.StringsKt.isBlank(invoke)) {
                invoke = null;
            }
            okhttp3.HttpUrl parse = invoke != null ? okhttp3.HttpUrl.INSTANCE.parse(invoke) : null;
            if (parse != null && (!kotlin.jvm.internal.Intrinsics.areEqual(url.scheme(), parse.scheme()) || !kotlin.jvm.internal.Intrinsics.areEqual(url.host(), parse.host()) || url.port() != parse.port())) {
                request = request.newBuilder().url(url.newBuilder().scheme(parse.scheme()).host(parse.host()).port(parse.port()).build()).build();
            }
        }
        return chain.proceed(request);
    }
}
