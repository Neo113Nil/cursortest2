package io.ktor.client.plugins.cache;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"", "isShared", "Lio/ktor/client/statement/HttpResponse;", "response", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "HttpCacheEntry", "(ZLio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "(Lio/ktor/client/statement/HttpResponse;)Ljava/util/Map;", "Lkotlin/Function0;", "Lio/ktor/util/date/GMTDate;", "fallback", "cacheExpires", "(Lio/ktor/client/statement/HttpResponse;ZLkotlin/jvm/functions/Function0;)Lio/ktor/util/date/GMTDate;", "Lio/ktor/http/Headers;", "responseHeaders", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lio/ktor/client/plugins/cache/ValidateStatus;", "shouldValidate", "(Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/plugins/cache/ValidateStatus;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpCacheEntryKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object HttpCacheEntry(boolean z, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCacheEntry> continuation) {
        io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 httpCacheEntryKt$HttpCacheEntry$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1) {
            httpCacheEntryKt$HttpCacheEntry$1 = (io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1) continuation;
            if ((httpCacheEntryKt$HttpCacheEntry$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                httpCacheEntryKt$HttpCacheEntry$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = httpCacheEntryKt$HttpCacheEntry$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCacheEntryKt$HttpCacheEntry$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteReadChannel rawContent = httpResponse.getRawContent();
                    httpCacheEntryKt$HttpCacheEntry$1.getHighSpeedVideoFpsRanges = httpResponse;
                    httpCacheEntryKt$HttpCacheEntry$1.getHighSpeedVideoSizes = z;
                    httpCacheEntryKt$HttpCacheEntry$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(rawContent, httpCacheEntryKt$HttpCacheEntry$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = httpCacheEntryKt$HttpCacheEntry$1.getHighSpeedVideoSizes;
                    httpResponse = (io.ktor.client.statement.HttpResponse) httpCacheEntryKt$HttpCacheEntry$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new io.ktor.client.plugins.cache.HttpCacheEntry(cacheExpires$default(httpResponse, z, null, 2, null), varyKeys(httpResponse), httpResponse, kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj));
            }
        }
        httpCacheEntryKt$HttpCacheEntry$1 = new io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1(continuation);
        java.lang.Object obj2 = httpCacheEntryKt$HttpCacheEntry$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCacheEntryKt$HttpCacheEntry$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new io.ktor.client.plugins.cache.HttpCacheEntry(cacheExpires$default(httpResponse, z, null, 2, null), varyKeys(httpResponse), httpResponse, kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj2));
    }

    public static final java.util.Map<java.lang.String, java.lang.String> varyKeys(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        java.util.List<java.lang.String> vary = io.ktor.http.HttpMessagePropertiesKt.vary(httpResponse);
        if (vary == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        io.ktor.http.Headers headers = httpResponse.getCall().getRequest().getHeaders();
        for (java.lang.String str : vary) {
            java.lang.String str2 = headers.get(str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ io.ktor.util.date.GMTDate cacheExpires$default(io.ktor.client.statement.HttpResponse httpResponse, boolean z, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.HttpCacheEntryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    io.ktor.util.date.GMTDate GMTDate$default;
                    GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
                    return GMTDate$default;
                }
            };
        }
        return cacheExpires(httpResponse, z, function0);
    }

    public static final io.ktor.util.date.GMTDate cacheExpires(io.ktor.client.statement.HttpResponse httpResponse, boolean z, kotlin.jvm.functions.Function0<io.ktor.util.date.GMTDate> function0) {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String value;
        java.util.List split$default;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.util.List<io.ktor.http.HeaderValue> cacheControl = io.ktor.http.HttpMessagePropertiesKt.cacheControl(httpResponse);
        java.lang.Long l = null;
        if (z) {
            java.util.List<io.ktor.http.HeaderValue> list = cacheControl;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String value2 = ((io.ktor.http.HeaderValue) it.next()).getValue();
                    str = io.ktor.client.utils.CacheControl.S_MAX_AGE;
                    if (kotlin.text.StringsKt.startsWith$default(value2, io.ktor.client.utils.CacheControl.S_MAX_AGE, false, 2, (java.lang.Object) null)) {
                        break;
                    }
                }
            }
        }
        str = io.ktor.client.utils.CacheControl.MAX_AGE;
        java.util.Iterator<T> it2 = cacheControl.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.text.StringsKt.startsWith$default(((io.ktor.http.HeaderValue) obj).getValue(), str, false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) obj;
        if (headerValue != null && (value = headerValue.getValue()) != null && (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) value, new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null)) != null && (str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1)) != null) {
            l = kotlin.text.StringsKt.toLongOrNull(str2);
        }
        if (l != null) {
            return io.ktor.util.date.DateKt.plus(httpResponse.getRequestTime(), l.longValue() * 1000);
        }
        java.lang.String str3 = httpResponse.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getExpires());
        if (str3 != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str3, "0") || kotlin.text.StringsKt.isBlank(str3)) {
                return function0.invoke();
            }
            try {
                return io.ktor.http.DateUtilsKt.fromHttpToGmtDate(str3);
            } catch (java.lang.Throwable unused) {
                return function0.invoke();
            }
        }
        return function0.invoke();
    }

    public static final io.ktor.client.plugins.cache.ValidateStatus shouldValidate(io.ktor.util.date.GMTDate gMTDate, io.ktor.http.Headers headers, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        int i;
        java.lang.Object obj;
        java.lang.Integer num;
        java.lang.String value;
        java.lang.Integer intOrNull;
        java.lang.String value2;
        java.util.List split$default;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.http.HeadersBuilder headers2 = httpRequestBuilder.getHeaders();
        java.util.List<java.lang.String> all = headers.getAll(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl());
        java.lang.Object obj2 = null;
        java.util.List<io.ktor.http.HeaderValue> parseHeaderValue = io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(all != null ? kotlin.collections.CollectionsKt.joinToString$default(all, ",", null, null, 0, null, null, 62, null) : null);
        java.util.List<java.lang.String> all2 = headers2.getAll(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl());
        java.util.List<io.ktor.http.HeaderValue> parseHeaderValue2 = io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(all2 != null ? kotlin.collections.CollectionsKt.joinToString$default(all2, ",", null, null, 0, null, null, 62, null) : null);
        if (parseHeaderValue2.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_CACHE$ktor_client_core())) {
            org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\"no-cache\" is set for ");
            sb.append(httpRequestBuilder.getUrl());
            sb.append(", should validate cached response");
            logger.trace(sb.toString());
            return io.ktor.client.plugins.cache.ValidateStatus.ShouldValidate;
        }
        java.util.List<io.ktor.http.HeaderValue> list = parseHeaderValue2;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.startsWith$default(((io.ktor.http.HeaderValue) obj).getValue(), "max-age=", false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) obj;
        if (headerValue == null || (value2 = headerValue.getValue()) == null || (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) value2, new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null)) == null || (str = (java.lang.String) split$default.get(1)) == null) {
            num = null;
        } else {
            java.lang.Integer intOrNull2 = kotlin.text.StringsKt.toIntOrNull(str);
            num = java.lang.Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0);
        }
        if (num != null && num.intValue() == 0) {
            org.slf4j.Logger logger2 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\"max-age\" is not set for ");
            sb2.append(httpRequestBuilder.getUrl());
            sb2.append(", should validate cached response");
            logger2.trace(sb2.toString());
            return io.ktor.client.plugins.cache.ValidateStatus.ShouldValidate;
        }
        if (parseHeaderValue.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_CACHE$ktor_client_core())) {
            org.slf4j.Logger logger3 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\"no-cache\" is set for ");
            sb3.append(httpRequestBuilder.getUrl());
            sb3.append(", should validate cached response");
            logger3.trace(sb3.toString());
            return io.ktor.client.plugins.cache.ValidateStatus.ShouldValidate;
        }
        long timestamp = gMTDate.getTimestamp() - io.ktor.util.date.DateJvmKt.getTimeMillis();
        if (timestamp > 0) {
            org.slf4j.Logger logger4 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Cached response is valid for ");
            sb4.append(httpRequestBuilder.getUrl());
            sb4.append(", should not validate");
            logger4.trace(sb4.toString());
            return io.ktor.client.plugins.cache.ValidateStatus.ShouldNotValidate;
        }
        if (parseHeaderValue.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getMUST_REVALIDATE$ktor_client_core())) {
            org.slf4j.Logger logger5 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("\"must-revalidate\" is set for ");
            sb5.append(httpRequestBuilder.getUrl());
            sb5.append(", should validate cached response");
            logger5.trace(sb5.toString());
            return io.ktor.client.plugins.cache.ValidateStatus.ShouldValidate;
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            if (kotlin.text.StringsKt.startsWith$default(((io.ktor.http.HeaderValue) next).getValue(), "max-stale=", false, 2, (java.lang.Object) null)) {
                obj2 = next;
                break;
            }
        }
        io.ktor.http.HeaderValue headerValue2 = (io.ktor.http.HeaderValue) obj2;
        if (headerValue2 != null && (value = headerValue2.getValue()) != null) {
            java.lang.String substring = value.substring(10);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            if (substring != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(substring)) != null) {
                i = intOrNull.intValue();
            }
        }
        if (timestamp + (i * 1000) > 0) {
            org.slf4j.Logger logger6 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cached response is stale for ");
            sb6.append(httpRequestBuilder.getUrl());
            sb6.append(" but less than max-stale, should warn");
            logger6.trace(sb6.toString());
            return io.ktor.client.plugins.cache.ValidateStatus.ShouldWarn;
        }
        org.slf4j.Logger logger7 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Cached response is stale for ");
        sb7.append(httpRequestBuilder.getUrl());
        sb7.append(", should validate cached response");
        logger7.trace(sb7.toString());
        return io.ktor.client.plugins.cache.ValidateStatus.ShouldValidate;
    }
}
