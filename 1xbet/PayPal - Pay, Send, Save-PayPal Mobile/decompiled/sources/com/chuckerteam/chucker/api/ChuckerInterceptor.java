package com.chuckerteam.chucker.api;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", "Lokhttp3/Interceptor;", "Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "p0", "<init>", "()V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "", "names", "redactHeaders", "([Ljava/lang/String;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChuckerInterceptor implements okhttp3.Interceptor {
    private ChuckerInterceptor() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChuckerInterceptor(android.content.Context context) {
        this();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        new com.chuckerteam.chucker.api.ChuckerInterceptor.Builder(context);
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request());
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0012\"\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J!\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0012\"\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001e¢\u0006\u0004\b\u001d\u0010\u001fJ!\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0012\"\u00020\u000e¢\u0006\u0004\b!\u0010\u0013J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\u001fJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "collector", "(Lcom/chuckerteam/chucker/api/ChuckerCollector;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "length", "maxContentLength", "(J)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "", "headerNames", "redactHeaders", "(Ljava/lang/Iterable;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "([Ljava/lang/String;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "enable", "alwaysReadResponseBody", "(Z)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "decoder", "addBodyDecoder", "(Ljava/lang/Object;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "createShortcut", "paths", "skipPaths", "Lkotlin/text/Regex;", "(Lkotlin/text/Regex;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "domains", "skipDomains", "Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", "build", "()Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final android.content.Context Camera2StreamConfigurationMap;

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder alwaysReadResponseBody(boolean enable) {
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder createShortcut(boolean enable) {
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder maxContentLength(long length) {
            return this;
        }

        public Builder(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            this.Camera2StreamConfigurationMap = context;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor build() {
            return new com.chuckerteam.chucker.api.ChuckerInterceptor(this, null);
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder skipPaths(java.lang.String... paths) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paths, "");
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder skipPaths(kotlin.text.Regex paths) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paths, "");
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder skipDomains(java.lang.String... domains) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domains, "");
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder skipDomains(kotlin.text.Regex domains) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domains, "");
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder redactHeaders(java.lang.String... headerNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerNames, "");
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder redactHeaders(java.lang.Iterable<java.lang.String> headerNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerNames, "");
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder collector(com.chuckerteam.chucker.api.ChuckerCollector collector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collector, "");
            return this;
        }

        public final com.chuckerteam.chucker.api.ChuckerInterceptor.Builder addBodyDecoder(java.lang.Object decoder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            return this;
        }
    }

    public final com.chuckerteam.chucker.api.ChuckerInterceptor redactHeaders(java.lang.String... names) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(names, "");
        return this;
    }

    public /* synthetic */ ChuckerInterceptor(com.chuckerteam.chucker.api.ChuckerInterceptor.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
