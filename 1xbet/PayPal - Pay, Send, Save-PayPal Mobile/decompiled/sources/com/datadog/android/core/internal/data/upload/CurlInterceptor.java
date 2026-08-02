package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/CurlInterceptor;", "Lokhttp3/Interceptor;", "", "printBody", "Lkotlin/Function1;", "", "", "output", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Z", "Companion", "CurlBuilder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CurlInterceptor implements okhttp3.Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.data.upload.CurlInterceptor.Companion INSTANCE = new com.datadog.android.core.internal.data.upload.CurlInterceptor.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public CurlInterceptor(boolean z, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoSizes = function1;
    }

    public /* synthetic */ CurlInterceptor(boolean z, com.datadog.android.core.internal.data.upload.CurlInterceptor.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.datadog.android.core.internal.data.upload.CurlInterceptor.1
            public final void getHighSpeedVideoSizes(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                getHighSpeedVideoSizes(str);
                return kotlin.Unit.INSTANCE;
            }
        } : anonymousClass1);
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        this.getHighSpeedVideoSizes.invoke(new com.datadog.android.core.internal.data.upload.CurlInterceptor.CurlBuilder(request.newBuilder().build(), this.getHighSpeedVideoFpsRanges).toCommand());
        return chain.proceed(request);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BS\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R,\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b \u0010\u0013"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/CurlInterceptor$CurlBuilder;", "", "Lokhttp3/Request;", "request", "", "printBody", "<init>", "(Lokhttp3/Request;Z)V", "", "url", "method", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lokhttp3/RequestBody;", "requestBody", "", "", "headers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;Z)V", "toCommand", "()Ljava/lang/String;", "Ljava/lang/String;", "getContentType", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "getMethod", "Z", "getPrintBody", "()Z", "Lokhttp3/RequestBody;", "getRequestBody", "()Lokhttp3/RequestBody;", "getUrl"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CurlBuilder {
        private final java.lang.String contentType;
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;
        private final java.lang.String method;
        private final boolean printBody;
        private final okhttp3.RequestBody requestBody;
        private final java.lang.String url;

        /* JADX WARN: Multi-variable type inference failed */
        public CurlBuilder(java.lang.String str, java.lang.String str2, java.lang.String str3, okhttp3.RequestBody requestBody, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.url = str;
            this.method = str2;
            this.contentType = str3;
            this.requestBody = requestBody;
            this.headers = map;
            this.printBody = z;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getMethod() {
            return this.method;
        }

        public final java.lang.String getContentType() {
            return this.contentType;
        }

        public final okhttp3.RequestBody getRequestBody() {
            return this.requestBody;
        }

        public /* synthetic */ CurlBuilder(java.lang.String str, java.lang.String str2, java.lang.String str3, okhttp3.RequestBody requestBody, java.util.Map map, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : requestBody, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, z);
        }

        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
            return this.headers;
        }

        public final boolean getPrintBody() {
            return this.printBody;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CurlBuilder(okhttp3.Request request, boolean z) {
            this(r2, r3, (r0 == null || (r0 = r0.getContentType()) == null) ? null : r0.toString(), request.body(), request.headers().toMultimap(), z);
            okhttp3.MediaType contentType;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.lang.String obj = request.url().toString();
            java.lang.String method = request.method();
            okhttp3.RequestBody body = request.body();
        }

        public final java.lang.String toCommand() {
            java.util.ArrayList emptyList;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("curl ");
            java.util.Locale locale = java.util.Locale.US;
            java.lang.String str = this.method;
            java.util.Locale locale2 = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String upperCase = str.toUpperCase(locale2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.lang.String format = java.lang.String.format(locale, "-X %1$s", java.util.Arrays.copyOf(new java.lang.Object[]{upperCase}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            sb.append(format);
            sb.append(' ');
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : this.headers.entrySet()) {
                java.lang.String key = entry.getKey();
                java.util.Iterator<T> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    java.lang.String format2 = java.lang.String.format(java.util.Locale.US, "-H \"%1$s:%2$s\"", java.util.Arrays.copyOf(new java.lang.Object[]{key, (java.lang.String) it.next()}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
                    sb.append(format2);
                    sb.append(' ');
                }
            }
            if (this.contentType != null && !this.headers.containsKey("Content-Type")) {
                java.lang.String format3 = java.lang.String.format(java.util.Locale.US, "-H \"%1$s:%2$s\"", java.util.Arrays.copyOf(new java.lang.Object[]{"Content-Type", this.contentType}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
                sb.append(format3);
                sb.append(' ');
            }
            okhttp3.RequestBody requestBody = this.requestBody;
            if (requestBody != null) {
                if (requestBody instanceof okhttp3.MultipartBody) {
                    emptyList = new java.util.ArrayList();
                    for (okhttp3.MultipartBody.Part part : ((okhttp3.MultipartBody) requestBody).parts()) {
                        okhttp3.Headers headers = part.headers();
                        if (headers != null && (multimap = headers.toMultimap()) != null) {
                            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry2 : multimap.entrySet()) {
                                java.lang.String format4 = java.lang.String.format(java.util.Locale.US, "-H \"%1$s:%2$s\"", java.util.Arrays.copyOf(new java.lang.Object[]{entry2.getKey(), entry2.getValue()}, 2));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "");
                                emptyList.add(format4);
                            }
                        }
                        if (this.printBody) {
                            java.lang.String format5 = java.lang.String.format(java.util.Locale.US, "-d '%1$s'", java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.core.internal.data.upload.CurlInterceptor.Companion.access$peekBody(com.datadog.android.core.internal.data.upload.CurlInterceptor.INSTANCE, part.body())}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format5, "");
                            emptyList.add(format5);
                        }
                    }
                } else if (this.printBody) {
                    java.lang.String format6 = java.lang.String.format(java.util.Locale.US, "-d '%1$s'", java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.core.internal.data.upload.CurlInterceptor.Companion.access$peekBody(com.datadog.android.core.internal.data.upload.CurlInterceptor.INSTANCE, requestBody)}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format6, "");
                    emptyList = kotlin.collections.CollectionsKt.listOf(format6);
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                if (emptyList != null) {
                    java.util.Iterator it2 = emptyList.iterator();
                    while (it2.hasNext()) {
                        sb.append((java.lang.String) it2.next());
                        sb.append(' ');
                    }
                }
            }
            java.lang.String format7 = java.lang.String.format(java.util.Locale.US, "\"%1$s\"", java.util.Arrays.copyOf(new java.lang.Object[]{this.url}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format7, "");
            sb.append(format7);
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/CurlInterceptor$Companion;", "", "<init>", "()V", "Lokhttp3/RequestBody;", "p0", "", "getHighSpeedVideoSizes", "(Lokhttp3/RequestBody;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.lang.String access$peekBody(com.datadog.android.core.internal.data.upload.CurlInterceptor.Companion companion, okhttp3.RequestBody requestBody) {
            return getHighSpeedVideoSizes(requestBody);
        }

        private static java.lang.String getHighSpeedVideoSizes(okhttp3.RequestBody p0) {
            if (p0 == null) {
                return null;
            }
            try {
                okio.Buffer buffer = new okio.Buffer();
                java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCharset, "");
                p0.writeTo(buffer);
                return buffer.readString(defaultCharset);
            } catch (java.io.IOException e) {
                return "Error while reading body: ".concat(java.lang.String.valueOf(e));
            } catch (java.lang.IllegalArgumentException e2) {
                return "Error while reading body: ".concat(java.lang.String.valueOf(e2));
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CurlInterceptor() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
