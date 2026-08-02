package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a0\u0010\n\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00042\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000f\"#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lio/ktor/http/Url;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lio/ktor/http/Url;)Ljava/lang/String;", "Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/logging/LoggingConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "Logging", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/logging/HttpClientCallLogger;", "getHighSpeedVideoFpsRanges", "Lio/ktor/util/AttributeKey;", "Camera2StreamConfigurationMap", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/api/ClientPlugin;", "getLogging", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getLogging$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggingKt {
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.logging.LoggingConfig> Logging;
    private static final io.ktor.util.AttributeKey<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.logging.HttpClientCallLogger> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x034f, code lost:
    
        if (r1 != r7) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036c, code lost:
    
        if (r1 == r7) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$Logging$lambda$16$logRequestOkHttpFormat(java.util.List list, io.ktor.client.plugins.logging.LogLevel logLevel, io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.util.List list2, kotlin.coroutines.Continuation continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestOkHttpFormat$1 loggingKt$Logging$2$logRequestOkHttpFormat$1;
        int i;
        java.lang.String obj;
        java.lang.Object obj2;
        long length;
        if (continuation instanceof io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestOkHttpFormat$1) {
            loggingKt$Logging$2$logRequestOkHttpFormat$1 = (io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestOkHttpFormat$1) continuation;
            if ((loggingKt$Logging$2$logRequestOkHttpFormat$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                loggingKt$Logging$2$logRequestOkHttpFormat$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestOkHttpFormat$1 loggingKt$Logging$2$logRequestOkHttpFormat$12 = loggingKt$Logging$2$logRequestOkHttpFormat$1;
                java.lang.Object obj3 = loggingKt$Logging$2$logRequestOkHttpFormat$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingKt$Logging$2$logRequestOkHttpFormat$12.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        return (io.ktor.http.content.OutgoingContent) obj3;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj3);
                    return (io.ktor.http.content.OutgoingContent) obj3;
                }
                kotlin.ResultKt.throwOnFailure(obj3);
                if (logLevel == io.ktor.client.plugins.logging.LogLevel.NONE) {
                    return null;
                }
                java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(io.ktor.http.URLUtilsKt.takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), httpRequestBuilder.getUrl()).build());
                java.lang.Object body = httpRequestBuilder.getBody();
                io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
                boolean z = body instanceof io.ktor.http.content.OutgoingContent;
                if (z && !kotlin.jvm.internal.Intrinsics.areEqual(httpRequestBuilder.getMethod(), io.ktor.http.HttpMethod.INSTANCE.getGet()) && !kotlin.jvm.internal.Intrinsics.areEqual(httpRequestBuilder.getMethod(), io.ktor.http.HttpMethod.INSTANCE.getHead()) && !(body instanceof io.ktor.client.utils.EmptyContent)) {
                    io.ktor.http.content.OutgoingContent outgoingContent = (io.ktor.http.content.OutgoingContent) body;
                    io.ktor.http.ContentType contentType = outgoingContent.getContentType();
                    if (contentType != null) {
                        io.ktor.util.StringValuesKt.appendIfNameAbsent(headersBuilder, io.ktor.http.HttpHeaders.INSTANCE.getContentType(), contentType.toString());
                    }
                    java.lang.Long contentLength = outgoingContent.getContentLength();
                    if (contentLength != null) {
                        io.ktor.util.StringValuesKt.appendIfNameAbsent(headersBuilder, io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), java.lang.String.valueOf(contentLength.longValue()));
                    }
                }
                io.ktor.util.StringValuesKt.appendAll(headersBuilder, httpRequestBuilder.getHeaders());
                io.ktor.http.Headers build = headersBuilder.build();
                java.lang.String str = build.get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                java.lang.Long longOrNull = str != null ? kotlin.text.StringsKt.toLongOrNull(str) : null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(httpRequestBuilder.getMethod(), io.ktor.http.HttpMethod.INSTANCE.getGet()) || kotlin.jvm.internal.Intrinsics.areEqual(httpRequestBuilder.getMethod(), io.ktor.http.HttpMethod.INSTANCE.getHead()) || (((logLevel == io.ktor.client.plugins.logging.LogLevel.HEADERS || logLevel == io.ktor.client.plugins.logging.LogLevel.BODY || logLevel == io.ktor.client.plugins.logging.LogLevel.ALL) && longOrNull != null) || ((logLevel == io.ktor.client.plugins.logging.LogLevel.HEADERS && longOrNull == null) || build.contains(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding())))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("--> ");
                    sb.append(httpRequestBuilder.getMethod().getValue());
                    sb.append(' ');
                    sb.append(highResolutionOutputSizeshNQ4ISI);
                    obj = sb.toString();
                } else if (logLevel == io.ktor.client.plugins.logging.LogLevel.INFO && longOrNull != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("--> ");
                    sb2.append(httpRequestBuilder.getMethod().getValue());
                    sb2.append(' ');
                    sb2.append(highResolutionOutputSizeshNQ4ISI);
                    sb2.append(" (");
                    sb2.append(longOrNull);
                    sb2.append("-byte body)");
                    obj = sb2.toString();
                } else {
                    if (!(body instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) && !(body instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent)) {
                        for (java.lang.Object body2 = httpRequestBuilder.getBody(); body2 instanceof io.ktor.http.content.OutgoingContent; body2 = ((io.ktor.http.content.OutgoingContent.ContentWrapper) body2).getGetHighSpeedVideoFpsRanges()) {
                            io.ktor.http.content.OutgoingContent outgoingContent2 = (io.ktor.http.content.OutgoingContent) body2;
                            if (outgoingContent2 instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
                                length = ((io.ktor.http.content.OutgoingContent.ByteArrayContent) body2).getGetHighResolutionOutputSizeshNQ4ISI().length;
                            } else if (!(outgoingContent2 instanceof io.ktor.http.content.OutgoingContent.ContentWrapper)) {
                                if (!(outgoingContent2 instanceof io.ktor.http.content.OutgoingContent.NoContent) && !(outgoingContent2 instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade)) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to calculate the size for type ");
                                    sb3.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(body2.getClass()).getSimpleName());
                                    throw new java.lang.IllegalStateException(sb3.toString().toString());
                                }
                                length = 0;
                            }
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("--> ");
                            sb4.append(httpRequestBuilder.getMethod().getValue());
                            sb4.append(' ');
                            sb4.append(highResolutionOutputSizeshNQ4ISI);
                            sb4.append(" (");
                            sb4.append(length);
                            sb4.append("-byte body)");
                            obj = sb4.toString();
                        }
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("--> ");
                    sb5.append(httpRequestBuilder.getMethod().getValue());
                    sb5.append(' ');
                    sb5.append(highResolutionOutputSizeshNQ4ISI);
                    sb5.append(" (unknown-byte body)");
                    obj = sb5.toString();
                }
                list2.add(obj);
                if (logLevel != io.ktor.client.plugins.logging.LogLevel.HEADERS && logLevel != io.ktor.client.plugins.logging.LogLevel.BODY && logLevel != io.ktor.client.plugins.logging.LogLevel.ALL) {
                    return null;
                }
                for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : build.entries()) {
                    java.lang.String key = entry.getKey();
                    java.util.List<java.lang.String> value = entry.getValue();
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((io.ktor.client.plugins.logging.SanitizedHeader) obj2).getPredicate().invoke(key).booleanValue()) {
                            break;
                        }
                    }
                    if (obj2 == null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(key);
                        sb6.append(": ");
                        sb6.append(kotlin.collections.CollectionsKt.joinToString$default(value, ", ", null, null, 0, null, null, 62, null));
                        list2.add(sb6.toString());
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(key);
                        sb7.append(": ██");
                        list2.add(sb7.toString());
                    }
                }
                if ((logLevel != io.ktor.client.plugins.logging.LogLevel.BODY && logLevel != io.ktor.client.plugins.logging.LogLevel.ALL) || kotlin.jvm.internal.Intrinsics.areEqual(httpRequestBuilder.getMethod(), io.ktor.http.HttpMethod.INSTANCE.getGet()) || kotlin.jvm.internal.Intrinsics.areEqual(httpRequestBuilder.getMethod(), io.ktor.http.HttpMethod.INSTANCE.getHead())) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("--> END ");
                    sb8.append(httpRequestBuilder.getMethod().getValue());
                    list2.add(sb8.toString());
                    return null;
                }
                list2.add("");
                if (!z) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("--> END ");
                    sb9.append(httpRequestBuilder.getMethod().getValue());
                    list2.add(sb9.toString());
                    return null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(httpRequestBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding()), com.statsig.androidsdk.HttpUtils.ENCODING_GZIP)) {
                    io.ktor.http.HttpMethod method = httpRequestBuilder.getMethod();
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.logging.LoggingKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return io.ktor.client.plugins.logging.LoggingKt.$r8$lambda$3fBuI_d2ARXlsrsWAdh7h3ieNOo((io.ktor.utils.io.ByteReadChannel) obj4);
                        }
                    };
                    loggingKt$Logging$2$logRequestOkHttpFormat$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj3 = getHighSpeedVideoFpsRanges(clientPluginBuilder, (io.ktor.http.content.OutgoingContent) body, method, build, list2, function1, loggingKt$Logging$2$logRequestOkHttpFormat$12);
                } else {
                    io.ktor.http.HttpMethod method2 = httpRequestBuilder.getMethod();
                    loggingKt$Logging$2$logRequestOkHttpFormat$12.getHighSpeedVideoFpsRangesFor = 2;
                    obj3 = getHighSpeedVideoFpsRanges(clientPluginBuilder, (io.ktor.http.content.OutgoingContent) body, method2, build, list2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.logging.LoggingKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return io.ktor.client.plugins.logging.LoggingKt.m23269$r8$lambda$Nzr2WsS5jgKJwJdgu_dR3M4cP8((io.ktor.utils.io.ByteReadChannel) obj4);
                        }
                    }, loggingKt$Logging$2$logRequestOkHttpFormat$12);
                }
                return coroutine_suspended;
            }
        }
        loggingKt$Logging$2$logRequestOkHttpFormat$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestOkHttpFormat$1(continuation);
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestOkHttpFormat$1 loggingKt$Logging$2$logRequestOkHttpFormat$122 = loggingKt$Logging$2$logRequestOkHttpFormat$1;
        java.lang.Object obj32 = loggingKt$Logging$2$logRequestOkHttpFormat$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingKt$Logging$2$logRequestOkHttpFormat$122.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$Logging$lambda$16$logResponseOkHttpFormat(java.util.List list, io.ktor.client.plugins.logging.LogLevel logLevel, io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder, io.ktor.client.statement.HttpResponse httpResponse, java.util.List list2, kotlin.coroutines.Continuation continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseOkHttpFormat$1 loggingKt$Logging$2$logResponseOkHttpFormat$1;
        int i;
        java.lang.Object obj;
        java.lang.String obj2;
        java.lang.Object obj3;
        io.ktor.client.statement.HttpResponse httpResponse2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        java.lang.Object obj4;
        if (continuation instanceof io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseOkHttpFormat$1) {
            loggingKt$Logging$2$logResponseOkHttpFormat$1 = (io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseOkHttpFormat$1) continuation;
            if ((loggingKt$Logging$2$logResponseOkHttpFormat$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                loggingKt$Logging$2$logResponseOkHttpFormat$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj5 = loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingKt$Logging$2$logResponseOkHttpFormat$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj5);
                    if (logLevel != io.ktor.client.plugins.logging.LogLevel.NONE) {
                        java.lang.String str = httpResponse.getGetHighSpeedVideoSizesFor().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                        java.lang.Long longOrNull = str != null ? kotlin.text.StringsKt.toLongOrNull(str) : null;
                        io.ktor.client.request.HttpRequest request = io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse);
                        long timestamp = httpResponse.getResponseTime().getTimestamp() - httpResponse.getRequestTime().getTimestamp();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getGetHighSpeedVideoSizesFor().get(io.ktor.http.HttpHeaders.INSTANCE.getTransferEncoding()), "chunked") && (logLevel == io.ktor.client.plugins.logging.LogLevel.INFO || logLevel == io.ktor.client.plugins.logging.LogLevel.HEADERS)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("<-- ");
                            sb.append(httpResponse.getStatus());
                            sb.append(' ');
                            sb.append(getHighResolutionOutputSizeshNQ4ISI(request.getGetHighSpeedVideoFpsRanges()));
                            sb.append(" (");
                            sb.append(timestamp);
                            sb.append("ms, unknown-byte body)");
                            obj2 = sb.toString();
                        } else if (logLevel != io.ktor.client.plugins.logging.LogLevel.INFO || longOrNull == null) {
                            if (logLevel == io.ktor.client.plugins.logging.LogLevel.BODY || logLevel == io.ktor.client.plugins.logging.LogLevel.ALL || ((logLevel == io.ktor.client.plugins.logging.LogLevel.INFO && longOrNull == null) || (logLevel == io.ktor.client.plugins.logging.LogLevel.HEADERS && longOrNull != null))) {
                                obj = coroutine_suspended;
                            } else {
                                obj = coroutine_suspended;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getGetHighSpeedVideoSizesFor().get(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding()), com.statsig.androidsdk.HttpUtils.ENCODING_GZIP)) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<-- ");
                                    sb2.append(httpResponse.getStatus());
                                    sb2.append(' ');
                                    sb2.append(getHighResolutionOutputSizeshNQ4ISI(request.getGetHighSpeedVideoFpsRanges()));
                                    sb2.append(" (");
                                    sb2.append(timestamp);
                                    sb2.append("ms, unknown-byte body)");
                                    obj2 = sb2.toString();
                                    list2.add(obj2);
                                    if (logLevel != io.ktor.client.plugins.logging.LogLevel.HEADERS || logLevel == io.ktor.client.plugins.logging.LogLevel.BODY || logLevel == io.ktor.client.plugins.logging.LogLevel.ALL) {
                                        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : httpResponse.getGetHighSpeedVideoSizesFor().entries()) {
                                            java.lang.String key = entry.getKey();
                                            java.util.List<java.lang.String> value = entry.getValue();
                                            java.util.Iterator it = list.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = it.next();
                                                if (((io.ktor.client.plugins.logging.SanitizedHeader) obj4).getPredicate().invoke(key).booleanValue()) {
                                                    break;
                                                }
                                            }
                                            if (obj4 == null) {
                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                                sb3.append(key);
                                                sb3.append(": ");
                                                sb3.append(kotlin.collections.CollectionsKt.joinToString$default(value, ", ", null, null, 0, null, null, 62, null));
                                                list2.add(sb3.toString());
                                            } else {
                                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                                sb4.append(key);
                                                sb4.append(": ██");
                                                list2.add(sb4.toString());
                                            }
                                        }
                                        if (logLevel == io.ktor.client.plugins.logging.LogLevel.BODY && logLevel != io.ktor.client.plugins.logging.LogLevel.ALL) {
                                            list2.add("<-- END HTTP");
                                            return httpResponse;
                                        }
                                        if (longOrNull == null && longOrNull.longValue() == 0) {
                                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("<-- END HTTP (");
                                            sb5.append(timestamp);
                                            sb5.append("ms, ");
                                            sb5.append(longOrNull);
                                            sb5.append("-byte body)");
                                            list2.add(sb5.toString());
                                            return httpResponse;
                                        }
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse), io.ktor.http.ContentType.Text.INSTANCE.getEventStream())) {
                                            list2.add("<-- END HTTP (streaming)");
                                            return httpResponse;
                                        }
                                        if (io.ktor.client.plugins.DoubleReceivePluginKt.isSaved(httpResponse)) {
                                            io.ktor.utils.io.ByteReadChannel rawContent = httpResponse.getRawContent();
                                            loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighSpeedVideoSizes = httpResponse;
                                            loggingKt$Logging$2$logResponseOkHttpFormat$1.Camera2StreamConfigurationMap = 1;
                                            obj3 = obj;
                                            if (getHighSpeedVideoFpsRangesFor(clientPluginBuilder, httpResponse, rawContent, list2, loggingKt$Logging$2$logResponseOkHttpFormat$1) != obj3) {
                                            }
                                        } else {
                                            obj3 = obj;
                                            kotlin.Pair<io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteReadChannel> split = io.ktor.util.ByteChannelsKt.split(httpResponse.getRawContent(), httpResponse);
                                            io.ktor.utils.io.ByteReadChannel component1 = split.component1();
                                            io.ktor.utils.io.ByteReadChannel component2 = split.component2();
                                            loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighSpeedVideoSizes = httpResponse;
                                            loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighResolutionOutputSizeshNQ4ISI = component1;
                                            loggingKt$Logging$2$logResponseOkHttpFormat$1.Camera2StreamConfigurationMap = 2;
                                            if (getHighSpeedVideoFpsRangesFor(clientPluginBuilder, httpResponse, component2, list2, loggingKt$Logging$2$logResponseOkHttpFormat$1) != obj3) {
                                                httpResponse2 = httpResponse;
                                                byteReadChannel = component1;
                                            }
                                        }
                                        return obj3;
                                    }
                                }
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<-- ");
                            sb6.append(httpResponse.getStatus());
                            sb6.append(' ');
                            sb6.append(getHighResolutionOutputSizeshNQ4ISI(request.getGetHighSpeedVideoFpsRanges()));
                            sb6.append(" (");
                            sb6.append(timestamp);
                            sb6.append("ms)");
                            obj2 = sb6.toString();
                            list2.add(obj2);
                            if (logLevel != io.ktor.client.plugins.logging.LogLevel.HEADERS) {
                            }
                            while (r6.hasNext()) {
                            }
                            if (logLevel == io.ktor.client.plugins.logging.LogLevel.BODY) {
                            }
                            if (longOrNull == null) {
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse), io.ktor.http.ContentType.Text.INSTANCE.getEventStream())) {
                            }
                        } else {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<-- ");
                            sb7.append(httpResponse.getStatus());
                            sb7.append(' ');
                            sb7.append(getHighResolutionOutputSizeshNQ4ISI(request.getGetHighSpeedVideoFpsRanges()));
                            sb7.append(" (");
                            sb7.append(timestamp);
                            sb7.append("ms, ");
                            sb7.append(longOrNull);
                            sb7.append("-byte body)");
                            obj2 = sb7.toString();
                        }
                        obj = coroutine_suspended;
                        list2.add(obj2);
                        if (logLevel != io.ktor.client.plugins.logging.LogLevel.HEADERS) {
                        }
                        while (r6.hasNext()) {
                        }
                        if (logLevel == io.ktor.client.plugins.logging.LogLevel.BODY) {
                        }
                        if (longOrNull == null) {
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse), io.ktor.http.ContentType.Text.INSTANCE.getEventStream())) {
                        }
                    }
                    return httpResponse;
                }
                if (i == 1) {
                    io.ktor.client.statement.HttpResponse httpResponse3 = (io.ktor.client.statement.HttpResponse) loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj5);
                    return httpResponse3;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteReadChannel = (io.ktor.utils.io.ByteReadChannel) loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighResolutionOutputSizeshNQ4ISI;
                httpResponse2 = (io.ktor.client.statement.HttpResponse) loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj5);
                return io.ktor.client.plugins.observer.DelegatedCallKt.wrapWithContent(httpResponse2.getCall(), byteReadChannel).getResponse();
            }
        }
        loggingKt$Logging$2$logResponseOkHttpFormat$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseOkHttpFormat$1(continuation);
        java.lang.Object obj52 = loggingKt$Logging$2$logResponseOkHttpFormat$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingKt$Logging$2$logResponseOkHttpFormat$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return io.ktor.client.plugins.observer.DelegatedCallKt.wrapWithContent(httpResponse2.getCall(), byteReadChannel).getResponse();
    }

    public static /* synthetic */ void getLogging$annotations() {
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.logging.LoggingConfig> getLogging() {
        return Logging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object Camera2StreamConfigurationMap(io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> clientPluginBuilder, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Long l, io.ktor.http.ContentType contentType, io.ktor.http.Headers headers, kotlin.coroutines.Continuation<? super kotlin.Triple<java.lang.Boolean, java.lang.Long, ? extends io.ktor.utils.io.ByteReadChannel>> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$1 loggingKt$Logging$2$detectIfBinary$1;
        int i;
        java.nio.charset.Charset charset;
        byte[] bArr;
        io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> clientPluginBuilder2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        java.lang.Long l2;
        int i2;
        java.nio.charset.Charset charset2;
        int intValue;
        int i3;
        io.ktor.utils.io.ByteChannel byteChannel;
        kotlinx.coroutines.Deferred async$default;
        int i4;
        if (continuation instanceof io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$1) {
            loggingKt$Logging$2$detectIfBinary$1 = (io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$1) continuation;
            if ((loggingKt$Logging$2$detectIfBinary$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                loggingKt$Logging$2$detectIfBinary$1.getInputSizeshNQ4ISI -= 2147483648;
                io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$1 loggingKt$Logging$2$detectIfBinary$12 = loggingKt$Logging$2$detectIfBinary$1;
                java.lang.Object obj = loggingKt$Logging$2$detectIfBinary$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingKt$Logging$2$detectIfBinary$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (headers.contains(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding())) {
                        return new kotlin.Triple(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true), l, byteReadChannel);
                    }
                    if (contentType == null || (charset = io.ktor.http.ContentTypesKt.charset(contentType)) == null) {
                        charset = kotlin.text.Charsets.UTF_8;
                    }
                    java.nio.charset.Charset charset3 = charset;
                    bArr = new byte[1024];
                    loggingKt$Logging$2$detectIfBinary$12.getHighResolutionOutputSizeshNQ4ISI = clientPluginBuilder;
                    loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoSizes = byteReadChannel;
                    loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoFpsRangesFor = l;
                    loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoSizesFor = charset3;
                    loggingKt$Logging$2$detectIfBinary$12.getOutputFormats = bArr;
                    loggingKt$Logging$2$detectIfBinary$12.Camera2StreamConfigurationMap = 0;
                    loggingKt$Logging$2$detectIfBinary$12.getInputSizeshNQ4ISI = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readAvailable$default(byteReadChannel, bArr, 0, 0, loggingKt$Logging$2$detectIfBinary$12, 6, null);
                    if (obj != coroutine_suspended) {
                        clientPluginBuilder2 = clientPluginBuilder;
                        byteReadChannel2 = byteReadChannel;
                        l2 = l;
                        i2 = 0;
                        charset2 = charset3;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoFpsRanges;
                    i3 = loggingKt$Logging$2$detectIfBinary$12.Camera2StreamConfigurationMap;
                    byteChannel = (io.ktor.utils.io.ByteChannel) loggingKt$Logging$2$detectIfBinary$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return new kotlin.Triple(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i3 != 0), kotlin.coroutines.jvm.internal.Boxing.boxLong(((java.lang.Number) obj).longValue() + i4), byteChannel);
                }
                i2 = loggingKt$Logging$2$detectIfBinary$12.Camera2StreamConfigurationMap;
                byte[] bArr2 = (byte[]) loggingKt$Logging$2$detectIfBinary$12.getOutputFormats;
                charset2 = (java.nio.charset.Charset) loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoSizesFor;
                l2 = (java.lang.Long) loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoFpsRangesFor;
                byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoSizes;
                clientPluginBuilder2 = (io.ktor.client.plugins.api.ClientPluginBuilder) loggingKt$Logging$2$detectIfBinary$12.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                bArr = bArr2;
                intValue = ((java.lang.Number) obj).intValue();
                if (intValue > 0) {
                    return new kotlin.Triple(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), kotlin.coroutines.jvm.internal.Boxing.boxLong(0L), byteReadChannel2);
                }
                kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
                io.ktor.utils.io.core.BytePacketBuilderKt.writeFully(buffer, bArr, 0, intValue);
                java.nio.charset.CharsetDecoder newDecoder = charset2.newDecoder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newDecoder, "");
                java.lang.String decode = io.ktor.utils.io.charsets.EncodingKt.decode(newDecoder, buffer, intValue);
                int i5 = -1;
                for (int i6 = 0; i6 < decode.length(); i6++) {
                    i5++;
                }
                int length = decode.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        i3 = i2;
                        break;
                    }
                    if (decode.charAt(i7) == 65533 && i7 != i5) {
                        i3 = 1;
                        break;
                    }
                    i7++;
                }
                if (i3 == 0) {
                    byteChannel = new io.ktor.utils.io.ByteChannel(false, 1, null);
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(clientPluginBuilder2.getClient(), null, null, new io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$copied$1(byteChannel, bArr, intValue, byteReadChannel2, null), 3, null);
                    loggingKt$Logging$2$detectIfBinary$12.getHighResolutionOutputSizeshNQ4ISI = byteChannel;
                    loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoSizes = null;
                    loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoFpsRangesFor = null;
                    loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoSizesFor = null;
                    loggingKt$Logging$2$detectIfBinary$12.getOutputFormats = null;
                    loggingKt$Logging$2$detectIfBinary$12.Camera2StreamConfigurationMap = i3;
                    loggingKt$Logging$2$detectIfBinary$12.getHighSpeedVideoFpsRanges = intValue;
                    loggingKt$Logging$2$detectIfBinary$12.getInputSizeshNQ4ISI = 2;
                    java.lang.Object await = async$default.await(loggingKt$Logging$2$detectIfBinary$12);
                    if (await != coroutine_suspended) {
                        i4 = intValue;
                        obj = await;
                        return new kotlin.Triple(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i3 != 0), kotlin.coroutines.jvm.internal.Boxing.boxLong(((java.lang.Number) obj).longValue() + i4), byteChannel);
                    }
                    return coroutine_suspended;
                }
                return new kotlin.Triple(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i3 != 0), l2, byteReadChannel2);
            }
        }
        loggingKt$Logging$2$detectIfBinary$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$1(continuation);
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$1 loggingKt$Logging$2$detectIfBinary$122 = loggingKt$Logging$2$detectIfBinary$1;
        java.lang.Object obj2 = loggingKt$Logging$2$detectIfBinary$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingKt$Logging$2$detectIfBinary$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        intValue = ((java.lang.Number) obj2).intValue();
        if (intValue > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (r2 != r8) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoSizes(io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> clientPluginBuilder, io.ktor.http.content.OutgoingContent outgoingContent, java.lang.Long l, io.ktor.http.Headers headers, io.ktor.http.HttpMethod httpMethod, java.util.List<java.lang.String> list, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$1 loggingKt$Logging$2$logRequestBody$1;
        int i;
        io.ktor.http.content.OutgoingContent outgoingContent2;
        io.ktor.http.Headers headers2;
        io.ktor.http.HttpMethod httpMethod2;
        java.util.List<java.lang.String> list2;
        java.lang.Object Camera2StreamConfigurationMap;
        boolean booleanValue;
        java.lang.Long l2;
        java.lang.String str;
        java.nio.charset.Charset charset;
        java.nio.charset.Charset charset2;
        io.ktor.http.HttpMethod httpMethod3;
        java.util.List<java.lang.String> list3;
        java.util.List<java.lang.String> list4;
        if (continuation instanceof io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$1) {
            loggingKt$Logging$2$logRequestBody$1 = (io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$1) continuation;
            if ((loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = loggingKt$Logging$2$logRequestBody$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.ContentType contentType = outgoingContent.getContentType();
                    outgoingContent2 = outgoingContent;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizes = outgoingContent2;
                    headers2 = headers;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRanges = headers2;
                    httpMethod2 = httpMethod;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRangesFor = httpMethod2;
                    list2 = list;
                    loggingKt$Logging$2$logRequestBody$1.getHighResolutionOutputSizeshNQ4ISI = list2;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizesFor = 1;
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(clientPluginBuilder, byteReadChannel, l, contentType, headers, loggingKt$Logging$2$logRequestBody$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list3 = (java.util.List) loggingKt$Logging$2$logRequestBody$1.Camera2StreamConfigurationMap;
                        charset2 = (java.nio.charset.Charset) loggingKt$Logging$2$logRequestBody$1.getHighResolutionOutputSizeshNQ4ISI;
                        l2 = (java.lang.Long) loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRangesFor;
                        list4 = (java.util.List) loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRanges;
                        httpMethod3 = (io.ktor.http.HttpMethod) loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list3.add(io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset2, 0, 2, null));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("--> END ");
                        sb.append(httpMethod3.getValue());
                        sb.append(" (");
                        sb.append(l2);
                        sb.append("-byte body)");
                        list4.add(sb.toString());
                        return kotlin.Unit.INSTANCE;
                    }
                    java.util.List<java.lang.String> list5 = (java.util.List) loggingKt$Logging$2$logRequestBody$1.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.http.HttpMethod httpMethod4 = (io.ktor.http.HttpMethod) loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRangesFor;
                    io.ktor.http.Headers headers3 = (io.ktor.http.Headers) loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRanges;
                    io.ktor.http.content.OutgoingContent outgoingContent3 = (io.ktor.http.content.OutgoingContent) loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    list2 = list5;
                    httpMethod2 = httpMethod4;
                    headers2 = headers3;
                    Camera2StreamConfigurationMap = obj;
                    outgoingContent2 = outgoingContent3;
                }
                kotlin.Triple triple = (kotlin.Triple) Camera2StreamConfigurationMap;
                booleanValue = ((java.lang.Boolean) triple.component1()).booleanValue();
                l2 = (java.lang.Long) triple.component2();
                io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) triple.component3();
                if (booleanValue) {
                    io.ktor.http.ContentType contentType2 = outgoingContent2.getContentType();
                    if (contentType2 == null || (charset = io.ktor.http.ContentTypesKt.charset(contentType2)) == null) {
                        charset = kotlin.text.Charsets.UTF_8;
                    }
                    charset2 = charset;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizes = httpMethod2;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRanges = list2;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoFpsRangesFor = l2;
                    loggingKt$Logging$2$logRequestBody$1.getHighResolutionOutputSizeshNQ4ISI = charset2;
                    loggingKt$Logging$2$logRequestBody$1.Camera2StreamConfigurationMap = list2;
                    loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizesFor = 2;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel2, loggingKt$Logging$2$logRequestBody$1);
                    if (obj != coroutine_suspended) {
                        httpMethod3 = httpMethod2;
                        list3 = list2;
                        list4 = list3;
                        list3.add(io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset2, 0, 2, null));
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("--> END ");
                        sb2.append(httpMethod3.getValue());
                        sb2.append(" (");
                        sb2.append(l2);
                        sb2.append("-byte body)");
                        list4.add(sb2.toString());
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (!headers2.contains(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding())) {
                    str = "binary";
                } else {
                    str = "encoded";
                }
                if (l2 != null) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("--> END ");
                    sb3.append(httpMethod2.getValue());
                    sb3.append(" (");
                    sb3.append(str);
                    sb3.append(' ');
                    sb3.append(l2);
                    sb3.append("-byte body omitted)");
                    list2.add(sb3.toString());
                } else {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("--> END ");
                    sb4.append(httpMethod2.getValue());
                    sb4.append(" (");
                    sb4.append(str);
                    sb4.append(" body omitted)");
                    list2.add(sb4.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        loggingKt$Logging$2$logRequestBody$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$1(continuation);
        java.lang.Object obj2 = loggingKt$Logging$2$logRequestBody$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingKt$Logging$2$logRequestBody$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        kotlin.Triple triple2 = (kotlin.Triple) Camera2StreamConfigurationMap;
        booleanValue = ((java.lang.Boolean) triple2.component1()).booleanValue();
        l2 = (java.lang.Long) triple2.component2();
        io.ktor.utils.io.ByteReadChannel byteReadChannel22 = (io.ktor.utils.io.ByteReadChannel) triple2.component3();
        if (booleanValue) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRanges(io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> clientPluginBuilder, io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.http.HttpMethod httpMethod, io.ktor.http.Headers headers, java.util.List<java.lang.String> list, kotlin.jvm.functions.Function1<? super io.ktor.utils.io.ByteReadChannel, ? extends io.ktor.utils.io.ByteReadChannel> function1, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$logOutgoingContent$1 loggingKt$Logging$2$logOutgoingContent$1;
        int i;
        io.ktor.http.content.OutgoingContent outgoingContent2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        io.ktor.http.content.OutgoingContent outgoingContent3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        if (continuation instanceof io.ktor.client.plugins.logging.LoggingKt$Logging$2$logOutgoingContent$1) {
            loggingKt$Logging$2$logOutgoingContent$1 = (io.ktor.client.plugins.logging.LoggingKt$Logging$2$logOutgoingContent$1) continuation;
            if ((loggingKt$Logging$2$logOutgoingContent$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                loggingKt$Logging$2$logOutgoingContent$1.getHighSpeedVideoSizes -= 2147483648;
                io.ktor.client.plugins.logging.LoggingKt$Logging$2$logOutgoingContent$1 loggingKt$Logging$2$logOutgoingContent$12 = loggingKt$Logging$2$logOutgoingContent$1;
                java.lang.Object obj = loggingKt$Logging$2$logOutgoingContent$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoSizes;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return null;
                    }
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i == 3) {
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRanges;
                        outgoingContent3 = (io.ktor.http.content.OutgoingContent) loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return new io.ktor.client.plugins.logging.LoggedContent(outgoingContent3, byteReadChannel2);
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRanges;
                    outgoingContent2 = (io.ktor.http.content.OutgoingContent) loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return new io.ktor.client.plugins.logging.LoggedContent(outgoingContent2, byteReadChannel);
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
                    byte[] getHighResolutionOutputSizeshNQ4ISI2 = ((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getGetHighResolutionOutputSizeshNQ4ISI();
                    java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(getHighResolutionOutputSizeshNQ4ISI2.length);
                    io.ktor.utils.io.ByteReadChannel ByteReadChannel$default = io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(getHighResolutionOutputSizeshNQ4ISI2, 0, 0, 6, null);
                    loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoSizes = 1;
                    if (getHighSpeedVideoSizes(clientPluginBuilder, outgoingContent, boxLong, headers, httpMethod, list, ByteReadChannel$default, loggingKt$Logging$2$logOutgoingContent$12) != coroutine_suspended) {
                        return null;
                    }
                } else if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
                    io.ktor.http.content.OutgoingContent getHighSpeedVideoFpsRanges2 = ((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getGetHighSpeedVideoFpsRanges();
                    loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoSizes = 2;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(clientPluginBuilder, getHighSpeedVideoFpsRanges2, httpMethod, headers, list, function1, loggingKt$Logging$2$logOutgoingContent$12);
                    if (highSpeedVideoFpsRanges != coroutine_suspended) {
                        return highSpeedVideoFpsRanges;
                    }
                } else {
                    if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("--> END ");
                        sb.append(httpMethod.getValue());
                        list.add(sb.toString());
                        return null;
                    }
                    if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("--> END ");
                        sb2.append(httpMethod.getValue());
                        list.add(sb2.toString());
                        return null;
                    }
                    if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                        kotlin.Pair<io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteReadChannel> split = io.ktor.util.ByteChannelsKt.split(((io.ktor.http.content.OutgoingContent.ReadChannelContent) outgoingContent).getGetHighSpeedVideoFpsRanges(), clientPluginBuilder.getClient());
                        io.ktor.utils.io.ByteReadChannel component1 = split.component1();
                        io.ktor.utils.io.ByteReadChannel component2 = split.component2();
                        java.lang.Long contentLength = outgoingContent.getContentLength();
                        loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRangesFor = outgoingContent;
                        loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRanges = component1;
                        loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoSizes = 3;
                        if (getHighSpeedVideoSizes(clientPluginBuilder, outgoingContent, contentLength, headers, httpMethod, list, component2, loggingKt$Logging$2$logOutgoingContent$12) != coroutine_suspended) {
                            outgoingContent3 = outgoingContent;
                            byteReadChannel2 = component1;
                            return new io.ktor.client.plugins.logging.LoggedContent(outgoingContent3, byteReadChannel2);
                        }
                    } else {
                        if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        io.ktor.utils.io.ByteChannel byteChannel = new io.ktor.utils.io.ByteChannel(false, 1, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(clientPluginBuilder.getClient(), null, null, new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logOutgoingContent$3(outgoingContent, byteChannel, null), 3, null);
                        kotlin.Pair<io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteReadChannel> split2 = io.ktor.util.ByteChannelsKt.split(byteChannel, clientPluginBuilder.getClient());
                        io.ktor.utils.io.ByteReadChannel component12 = split2.component1();
                        io.ktor.utils.io.ByteReadChannel component22 = split2.component2();
                        java.lang.Long contentLength2 = outgoingContent.getContentLength();
                        loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRangesFor = outgoingContent;
                        loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoFpsRanges = component12;
                        loggingKt$Logging$2$logOutgoingContent$12.getHighSpeedVideoSizes = 4;
                        if (getHighSpeedVideoSizes(clientPluginBuilder, outgoingContent, contentLength2, headers, httpMethod, list, component22, loggingKt$Logging$2$logOutgoingContent$12) != coroutine_suspended) {
                            outgoingContent2 = outgoingContent;
                            byteReadChannel = component12;
                            return new io.ktor.client.plugins.logging.LoggedContent(outgoingContent2, byteReadChannel);
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        loggingKt$Logging$2$logOutgoingContent$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logOutgoingContent$1(continuation);
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$logOutgoingContent$1 loggingKt$Logging$2$logOutgoingContent$122 = loggingKt$Logging$2$logOutgoingContent$1;
        java.lang.Object obj2 = loggingKt$Logging$2$logOutgoingContent$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingKt$Logging$2$logOutgoingContent$122.getHighSpeedVideoSizes;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r2 != r10) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> clientPluginBuilder, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseBody$1 loggingKt$Logging$2$logResponseBody$1;
        int i;
        boolean booleanValue;
        java.lang.Long l;
        java.lang.String str;
        java.nio.charset.Charset charset;
        java.nio.charset.Charset charset2;
        java.util.List<java.lang.String> list2;
        java.util.List<java.lang.String> list3;
        long j;
        io.ktor.client.statement.HttpResponse httpResponse2 = httpResponse;
        java.util.List<java.lang.String> list4 = list;
        if (continuation instanceof io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseBody$1) {
            loggingKt$Logging$2$logResponseBody$1 = (io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseBody$1) continuation;
            if ((loggingKt$Logging$2$logResponseBody$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                loggingKt$Logging$2$logResponseBody$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = loggingKt$Logging$2$logResponseBody$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingKt$Logging$2$logResponseBody$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    list4.add("");
                    io.ktor.client.statement.HttpResponse httpResponse3 = httpResponse2;
                    java.lang.Long contentLength = io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse3);
                    io.ktor.http.ContentType contentType = io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse3);
                    io.ktor.http.Headers headers = httpResponse.getGetHighSpeedVideoSizesFor();
                    loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoSizes = httpResponse2;
                    loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoFpsRangesFor = list4;
                    loggingKt$Logging$2$logResponseBody$1.getInputSizeshNQ4ISI = 1;
                    obj = Camera2StreamConfigurationMap(clientPluginBuilder, byteReadChannel, contentLength, contentType, headers, loggingKt$Logging$2$logResponseBody$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoFpsRanges;
                        list3 = (java.util.List) loggingKt$Logging$2$logResponseBody$1.Camera2StreamConfigurationMap;
                        charset2 = (java.nio.charset.Charset) loggingKt$Logging$2$logResponseBody$1.getHighResolutionOutputSizeshNQ4ISI;
                        l = (java.lang.Long) loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoFpsRangesFor;
                        list2 = (java.util.List) loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list3.add(io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset2, 0, 2, null));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("<-- END HTTP (");
                        sb.append(j);
                        sb.append("ms, ");
                        sb.append(l);
                        sb.append("-byte body)");
                        list2.add(sb.toString());
                        return kotlin.Unit.INSTANCE;
                    }
                    java.util.List<java.lang.String> list5 = (java.util.List) loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoFpsRangesFor;
                    io.ktor.client.statement.HttpResponse httpResponse4 = (io.ktor.client.statement.HttpResponse) loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    list4 = list5;
                    httpResponse2 = httpResponse4;
                }
                kotlin.Triple triple = (kotlin.Triple) obj;
                booleanValue = ((java.lang.Boolean) triple.component1()).booleanValue();
                l = (java.lang.Long) triple.component2();
                io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) triple.component3();
                long timestamp = httpResponse2.getResponseTime().getTimestamp() - httpResponse2.getRequestTime().getTimestamp();
                if (l == null && l.longValue() == 0) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<-- END HTTP (");
                    sb2.append(timestamp);
                    sb2.append("ms, ");
                    sb2.append(l);
                    sb2.append("-byte body)");
                    list4.add(sb2.toString());
                    return kotlin.Unit.INSTANCE;
                }
                if (booleanValue) {
                    io.ktor.http.ContentType contentType2 = io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse2);
                    if (contentType2 == null || (charset = io.ktor.http.ContentTypesKt.charset(contentType2)) == null) {
                        charset = kotlin.text.Charsets.UTF_8;
                    }
                    charset2 = charset;
                    loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoSizes = list4;
                    loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoFpsRangesFor = l;
                    loggingKt$Logging$2$logResponseBody$1.getHighResolutionOutputSizeshNQ4ISI = charset2;
                    loggingKt$Logging$2$logResponseBody$1.Camera2StreamConfigurationMap = list4;
                    loggingKt$Logging$2$logResponseBody$1.getHighSpeedVideoFpsRanges = timestamp;
                    loggingKt$Logging$2$logResponseBody$1.getInputSizeshNQ4ISI = 2;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel2, loggingKt$Logging$2$logResponseBody$1);
                    if (obj != coroutine_suspended) {
                        list2 = list4;
                        list3 = list2;
                        j = timestamp;
                        list3.add(io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset2, 0, 2, null));
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("<-- END HTTP (");
                        sb3.append(j);
                        sb3.append("ms, ");
                        sb3.append(l);
                        sb3.append("-byte body)");
                        list2.add(sb3.toString());
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (!httpResponse2.getGetHighSpeedVideoSizesFor().contains(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding())) {
                    str = "binary";
                } else {
                    str = "encoded";
                }
                if (l != null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("<-- END HTTP (");
                    sb4.append(timestamp);
                    sb4.append("ms, ");
                    sb4.append(str);
                    sb4.append(' ');
                    sb4.append(l);
                    sb4.append("-byte body omitted)");
                    list4.add(sb4.toString());
                } else {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("<-- END HTTP (");
                    sb5.append(timestamp);
                    sb5.append("ms, ");
                    sb5.append(str);
                    sb5.append(" body omitted)");
                    list4.add(sb5.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        loggingKt$Logging$2$logResponseBody$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseBody$1(continuation);
        java.lang.Object obj2 = loggingKt$Logging$2$logResponseBody$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingKt$Logging$2$logResponseBody$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.Triple triple2 = (kotlin.Triple) obj2;
        booleanValue = ((java.lang.Boolean) triple2.component1()).booleanValue();
        l = (java.lang.Long) triple2.component2();
        io.ktor.utils.io.ByteReadChannel byteReadChannel22 = (io.ktor.utils.io.ByteReadChannel) triple2.component3();
        long timestamp2 = httpResponse2.getResponseTime().getTimestamp() - httpResponse2.getRequestTime().getTimestamp();
        if (l == null) {
        }
        if (booleanValue) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        java.nio.charset.Charset charset;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("BODY Content-Type: ");
        sb2.append(outgoingContent.getContentType());
        sb.append(sb2.toString());
        sb.append('\n');
        io.ktor.http.ContentType contentType = outgoingContent.getContentType();
        if (contentType == null || (charset = io.ktor.http.ContentTypesKt.charset(contentType)) == null) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        io.ktor.utils.io.ByteChannel byteChannel = new io.ktor.utils.io.ByteChannel(false, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getDefault().plus(io.ktor.client.plugins.logging.KtorMDCContext_jvmKt.MDCContext()), null, new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$3(byteChannel, charset, sb, httpClientCallLogger, null), 2, null);
        return io.ktor.client.plugins.logging.ObservingUtilsKt.observe(outgoingContent, byteChannel, continuation);
    }

    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(io.ktor.http.Url url) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (url.getEncodedPath().length() == 0) {
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        } else {
            sb.append(url.getEncodedPath());
        }
        if (url.getEncodedQuery().length() != 0) {
            sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
            sb.append(url.getEncodedQuery());
        }
        return sb.toString();
    }

    public static /* synthetic */ void Logging$default(io.ktor.client.HttpClientConfig httpClientConfig, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.logging.LoggingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.plugins.logging.LoggingKt.m23270$r8$lambda$TPlInnvmhQv6AzO550vpX3748((io.ktor.client.plugins.logging.LoggingConfig) obj2);
                }
            };
        }
        Logging(httpClientConfig, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Logging(io.ktor.client.HttpClientConfig<?> httpClientConfig, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.logging.LoggingConfig, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        httpClientConfig.install(Logging, function1);
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.logging.HttpClientCallLogger.class);
        kotlin.reflect.KType kType2 = null;
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.logging.HttpClientCallLogger.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        getHighSpeedVideoFpsRanges = new io.ktor.util.AttributeKey<>("CallLogger", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(kotlin.Unit.class);
        } catch (java.lang.Throwable unused2) {
        }
        getHighResolutionOutputSizeshNQ4ISI = new io.ktor.util.AttributeKey<>("DisableLogging", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
        Logging = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("Logging", io.ktor.client.plugins.logging.LoggingKt$Logging$1.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.logging.LoggingKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.logging.LoggingKt.m23268$r8$lambda$3FTD9mGhBZSuLnuaj7PjWAfAPk((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$3FTD9mGhBZSuLnuaj7PjW-AfAPk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23268$r8$lambda$3FTD9mGhBZSuLnuaj7PjWAfAPk(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        io.ktor.client.plugins.logging.Logger logger = ((io.ktor.client.plugins.logging.LoggingConfig) clientPluginBuilder.getPluginConfig()).getLogger();
        io.ktor.client.plugins.logging.LogLevel level = ((io.ktor.client.plugins.logging.LoggingConfig) clientPluginBuilder.getPluginConfig()).getLevel();
        java.util.List<kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, java.lang.Boolean>> filters$ktor_client_logging = ((io.ktor.client.plugins.logging.LoggingConfig) clientPluginBuilder.getPluginConfig()).getFilters$ktor_client_logging();
        java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> sanitizedHeaders$ktor_client_logging = ((io.ktor.client.plugins.logging.LoggingConfig) clientPluginBuilder.getPluginConfig()).getSanitizedHeaders$ktor_client_logging();
        boolean z = ((io.ktor.client.plugins.logging.LoggingConfig) clientPluginBuilder.getPluginConfig()).getFormat() == io.ktor.client.plugins.logging.LoggingFormat.OkHttp;
        clientPluginBuilder.on(io.ktor.client.plugins.logging.SendHook.INSTANCE, new io.ktor.client.plugins.logging.LoggingKt$Logging$2$1(z, logger, filters$ktor_client_logging, sanitizedHeaders$ktor_client_logging, level, clientPluginBuilder, null));
        clientPluginBuilder.on(io.ktor.client.plugins.logging.ResponseAfterEncodingHook.INSTANCE, new io.ktor.client.plugins.logging.LoggingKt$Logging$2$2(z, logger, sanitizedHeaders$ktor_client_logging, level, clientPluginBuilder, null));
        clientPluginBuilder.on(io.ktor.client.plugins.logging.ResponseHook.INSTANCE, new io.ktor.client.plugins.logging.LoggingKt$Logging$2$3(z, level, sanitizedHeaders$ktor_client_logging, null));
        clientPluginBuilder.on(io.ktor.client.plugins.logging.ReceiveHook.INSTANCE, new io.ktor.client.plugins.logging.LoggingKt$Logging$2$4(z, level, null));
        if (z) {
            return kotlin.Unit.INSTANCE;
        }
        if (!level.getBody()) {
            return kotlin.Unit.INSTANCE;
        }
        final io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1 loggingKt$Logging$2$observer$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1(level, null);
        io.ktor.client.plugins.observer.ResponseObserverKt.getResponseObserver().install(io.ktor.client.plugins.observer.ResponseObserverKt.getResponseObserver().prepare(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.logging.LoggingKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.logging.LoggingKt.$r8$lambda$m2Gvp7Y8UkhMrVVcjnPu_CW9m9s(kotlin.jvm.functions.Function2.this, (io.ktor.client.plugins.observer.ResponseObserverConfig) obj);
            }
        }), clientPluginBuilder.getClient());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel $r8$lambda$3fBuI_d2ARXlsrsWAdh7h3ieNOo(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        return io.ktor.util.Encoder.DefaultImpls.decode$default(io.ktor.util.GZipEncoder.INSTANCE, byteReadChannel, null, 2, null);
    }

    /* renamed from: $r8$lambda$Nzr2WsS5jgKJw-Jdgu_dR3M4cP8, reason: not valid java name */
    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel m23269$r8$lambda$Nzr2WsS5jgKJwJdgu_dR3M4cP8(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        return byteReadChannel;
    }

    /* renamed from: $r8$lambda$TPlIn-nv-mhQv6AzO550vpX3748, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23270$r8$lambda$TPlInnvmhQv6AzO550vpX3748(io.ktor.client.plugins.logging.LoggingConfig loggingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggingConfig, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m2Gvp7Y8UkhMrVVcjnPu_CW9m9s(kotlin.jvm.functions.Function2 function2, io.ktor.client.plugins.observer.ResponseObserverConfig responseObserverConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseObserverConfig, "");
        responseObserverConfig.onResponse(function2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$Logging$lambda$16$logRequest(io.ktor.client.plugins.logging.Logger logger, io.ktor.client.plugins.logging.LogLevel logLevel, java.util.List list, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation continuation) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object body = httpRequestBuilder.getBody();
        kotlin.jvm.internal.Intrinsics.checkNotNull(body, "");
        io.ktor.http.content.OutgoingContent outgoingContent = (io.ktor.http.content.OutgoingContent) body;
        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger = new io.ktor.client.plugins.logging.HttpClientCallLogger(logger);
        httpRequestBuilder.getAttributes().put(getHighSpeedVideoFpsRanges, httpClientCallLogger);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (logLevel.getInfo()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("REQUEST: ");
            sb2.append(io.ktor.http.URLUtilsKt.Url(httpRequestBuilder.getUrl()));
            sb.append(sb2.toString());
            sb.append('\n');
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("METHOD: ");
            sb3.append(httpRequestBuilder.getMethod());
            sb.append(sb3.toString());
            sb.append('\n');
        }
        if (logLevel.getHeaders()) {
            sb.append("COMMON HEADERS\n");
            java.lang.StringBuilder sb4 = sb;
            io.ktor.client.plugins.logging.LoggingUtilsKt.logHeaders(sb4, httpRequestBuilder.getHeaders().entries(), list);
            sb.append("CONTENT HEADERS\n");
            java.util.List list2 = list;
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((io.ktor.client.plugins.logging.SanitizedHeader) obj).getPredicate().invoke(io.ktor.http.HttpHeaders.INSTANCE.getContentLength()).booleanValue()) {
                    break;
                }
            }
            io.ktor.client.plugins.logging.SanitizedHeader sanitizedHeader = (io.ktor.client.plugins.logging.SanitizedHeader) obj;
            java.lang.String placeholder = sanitizedHeader != null ? sanitizedHeader.getPlaceholder() : null;
            java.util.Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((io.ktor.client.plugins.logging.SanitizedHeader) obj2).getPredicate().invoke(io.ktor.http.HttpHeaders.INSTANCE.getContentType()).booleanValue()) {
                    break;
                }
            }
            io.ktor.client.plugins.logging.SanitizedHeader sanitizedHeader2 = (io.ktor.client.plugins.logging.SanitizedHeader) obj2;
            java.lang.String placeholder2 = sanitizedHeader2 != null ? sanitizedHeader2.getPlaceholder() : null;
            java.lang.Long contentLength = outgoingContent.getContentLength();
            if (contentLength != null) {
                long longValue = contentLength.longValue();
                java.lang.String contentLength2 = io.ktor.http.HttpHeaders.INSTANCE.getContentLength();
                if (placeholder == null) {
                    placeholder = java.lang.String.valueOf(longValue);
                }
                io.ktor.client.plugins.logging.LoggingUtilsKt.logHeader(sb4, contentLength2, placeholder);
            }
            io.ktor.http.ContentType contentType = outgoingContent.getContentType();
            if (contentType != null) {
                java.lang.String contentType2 = io.ktor.http.HttpHeaders.INSTANCE.getContentType();
                if (placeholder2 == null) {
                    placeholder2 = contentType.toString();
                }
                io.ktor.client.plugins.logging.LoggingUtilsKt.logHeader(sb4, contentType2, placeholder2);
            }
            io.ktor.client.plugins.logging.LoggingUtilsKt.logHeaders(sb4, outgoingContent.getHeaders().entries(), list);
        }
        java.lang.String obj3 = sb.toString();
        java.lang.String str = obj3;
        if (str.length() > 0) {
            httpClientCallLogger.logRequest(obj3);
        }
        if (str.length() == 0 || !logLevel.getBody()) {
            httpClientCallLogger.closeRequestLog();
            return null;
        }
        return getHighSpeedVideoFpsRangesFor(outgoingContent, httpClientCallLogger, continuation);
    }

    public static final /* synthetic */ void access$Logging$lambda$16$logRequestException(io.ktor.client.plugins.logging.LogLevel logLevel, io.ktor.client.plugins.logging.Logger logger, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Throwable th) {
        if (logLevel.getInfo()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("REQUEST ");
            sb.append(io.ktor.http.URLUtilsKt.Url(httpRequestBuilder.getUrl()));
            sb.append(" failed with exception: ");
            sb.append(th);
            logger.log(sb.toString());
        }
    }

    public static final /* synthetic */ void access$Logging$lambda$16$logResponseException(io.ktor.client.plugins.logging.LogLevel logLevel, java.lang.StringBuilder sb, io.ktor.client.request.HttpRequest httpRequest, java.lang.Throwable th) {
        if (logLevel.getInfo()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("RESPONSE ");
            sb2.append(httpRequest.getGetHighSpeedVideoFpsRanges());
            sb2.append(" failed with exception: ");
            sb2.append(th);
            sb.append(sb2.toString());
        }
    }

    public static final /* synthetic */ boolean access$Logging$lambda$16$shouldBeLogged(java.util.List list, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        if (list.isEmpty()) {
            return true;
        }
        java.util.List list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((java.lang.Boolean) ((kotlin.jvm.functions.Function1) it.next()).invoke(httpRequestBuilder)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
