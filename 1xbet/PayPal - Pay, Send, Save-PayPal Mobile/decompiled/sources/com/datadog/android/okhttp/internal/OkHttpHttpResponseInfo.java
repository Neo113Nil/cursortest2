package com.datadog.android.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/datadog/android/okhttp/internal/OkHttpHttpResponseInfo;", "Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;", "Lokhttp3/Response;", "response", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lokhttp3/Response;Lcom/datadog/android/api/InternalLogger;)V", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "", "getContentType", "()Ljava/lang/String;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "", "getHeaders", "()Ljava/util/Map;", "headers", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/api/InternalLogger;", "Lokhttp3/Response;", "getResponse$dd_sdk_android_okhttp_release", "()Lokhttp3/Response;", "", "getStatusCode", "()I", "statusCode", "getUrl", "url", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpHttpResponseInfo implements com.datadog.android.api.instrumentation.network.HttpResponseInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo.Companion INSTANCE = new com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo.Companion(null);
    public static final java.lang.String ERROR_PEEK_BODY = "Unable to peek response body.";
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final okhttp3.Response response;

    public OkHttpHttpResponseInfo(okhttp3.Response response, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.response = response;
        this.internalLogger = internalLogger;
    }

    /* renamed from: getResponse$dd_sdk_android_okhttp_release, reason: from getter */
    public final okhttp3.Response getResponse() {
        return this.response;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_okhttp_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpResponseInfo
    public final java.lang.String getContentType() {
        okhttp3.MediaType getHighSpeedVideoFpsRangesFor;
        okhttp3.ResponseBody body = this.response.body();
        if (body == null || (getHighSpeedVideoFpsRangesFor = body.getGetHighSpeedVideoFpsRangesFor()) == null) {
            return null;
        }
        java.lang.String type = getHighSpeedVideoFpsRangesFor.type();
        java.lang.String subtype = getHighSpeedVideoFpsRangesFor.subtype();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(type);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(subtype);
        return sb.toString();
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpResponseInfo
    public final int getStatusCode() {
        return this.response.code();
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpResponseInfo
    public final java.lang.String getUrl() {
        return this.response.request().url().toString();
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpResponseInfo
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.response.headers().toMultimap();
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpResponseInfo
    public final java.lang.Long getContentLength() {
        java.lang.Long access$contentLengthOrNull;
        try {
            okhttp3.ResponseBody body = this.response.body();
            return (body == null || (access$contentLengthOrNull = com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo.Companion.access$contentLengthOrNull(INSTANCE, body)) == null) ? com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo.Companion.access$contentLengthOrNull(INSTANCE, this.response.peekBody(33554432L)) : access$contentLengthOrNull;
        } catch (java.io.IOException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo$contentLength$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to peek response body.";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.lang.IllegalArgumentException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo$contentLength$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to peek response body.";
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.lang.IllegalStateException e3) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo$contentLength$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to peek response body.";
                }
            }, (java.lang.Throwable) e3, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/okhttp/internal/OkHttpHttpResponseInfo$Companion;", "", "<init>", "()V", "", "ERROR_PEEK_BODY", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.lang.Long access$contentLengthOrNull(com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo.Companion companion, okhttp3.ResponseBody responseBody) {
            java.lang.Long valueOf = java.lang.Long.valueOf(responseBody.getGetHighResolutionOutputSizeshNQ4ISI());
            if (valueOf.longValue() >= 0) {
                return valueOf;
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
