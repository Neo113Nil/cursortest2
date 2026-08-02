package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\t*\u00060\u0000j\u0002`\u00012\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t*\u00060\u0000j\u0002`\u00012\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0017\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\u00192\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0080H¢\u0006\u0004\b\u001d\u0010\u001e\u001a.\u0010\"\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\"\u0010#"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "", "", "", "", "headers", "Lio/ktor/client/plugins/logging/SanitizedHeader;", "sanitizedHeaders", "", "logHeaders", "(Ljava/lang/Appendable;Ljava/util/Set;Ljava/util/List;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "logHeader", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "log", "Lio/ktor/client/statement/HttpResponse;", "response", "Lio/ktor/client/plugins/logging/LogLevel;", "level", "logResponseHeader", "(Ljava/lang/StringBuilder;Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/plugins/logging/LogLevel;Ljava/util/List;)V", "Lio/ktor/utils/io/ByteReadChannel;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "tryReadText", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "content", "logResponseBody", "(Ljava/lang/StringBuilder;Lio/ktor/http/ContentType;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggingUtilsKt {
    public static final void logHeaders(java.lang.Appendable appendable, java.util.Set<? extends java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>>> set, java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> list) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        for (java.util.Map.Entry entry : kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.CollectionsKt.toList(set), new java.util.Comparator() { // from class: io.ktor.client.plugins.logging.LoggingUtilsKt$logHeaders$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.String) ((java.util.Map.Entry) t).getKey(), (java.lang.String) ((java.util.Map.Entry) t2).getKey());
            }
        })) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((io.ktor.client.plugins.logging.SanitizedHeader) obj).getPredicate().invoke(str).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            io.ktor.client.plugins.logging.SanitizedHeader sanitizedHeader = (io.ktor.client.plugins.logging.SanitizedHeader) obj;
            java.lang.String placeholder = sanitizedHeader != null ? sanitizedHeader.getPlaceholder() : null;
            if (placeholder == null) {
                placeholder = kotlin.collections.CollectionsKt.joinToString$default(list2, "; ", null, null, 0, null, null, 62, null);
            }
            logHeader(appendable, str, placeholder);
        }
    }

    public static final void logHeader(java.lang.Appendable appendable, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("-> ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        appendable.append(sb.toString()).append('\n');
    }

    public static final void logResponseHeader(java.lang.StringBuilder sb, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.client.plugins.logging.LogLevel logLevel, java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (logLevel.getInfo()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("RESPONSE: ");
            sb2.append(httpResponse.getStatus());
            sb.append(sb2.toString());
            sb.append('\n');
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("METHOD: ");
            sb3.append(httpResponse.getCall().getRequest().getMethod());
            sb.append(sb3.toString());
            sb.append('\n');
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("FROM: ");
            sb4.append(httpResponse.getCall().getRequest().getUrl());
            sb.append(sb4.toString());
            sb.append('\n');
        }
        if (logLevel.getHeaders()) {
            sb.append("COMMON HEADERS\n");
            logHeaders(sb, httpResponse.getHeaders().entries(), list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object tryReadText(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1 loggingUtilsKt$tryReadText$1;
        int i;
        try {
            if (continuation instanceof io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1) {
                loggingUtilsKt$tryReadText$1 = (io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1) continuation;
                if ((loggingUtilsKt$tryReadText$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    loggingUtilsKt$tryReadText$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = loggingUtilsKt$tryReadText$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = loggingUtilsKt$tryReadText$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        loggingUtilsKt$tryReadText$1.getHighSpeedVideoSizes = charset;
                        loggingUtilsKt$tryReadText$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, loggingUtilsKt$tryReadText$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        charset = (java.nio.charset.Charset) loggingUtilsKt$tryReadText$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset, 0, 2, null);
                }
            }
            if (i != 0) {
            }
            return io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset, 0, 2, null);
        } catch (java.lang.Throwable unused) {
            return null;
        }
        loggingUtilsKt$tryReadText$1 = new io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1(continuation);
        java.lang.Object obj2 = loggingUtilsKt$tryReadText$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingUtilsKt$tryReadText$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object logResponseBody(java.lang.StringBuilder sb, io.ktor.http.ContentType contentType, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1 loggingUtilsKt$logResponseBody$1;
        int i;
        java.lang.String str;
        java.nio.charset.Charset charset;
        if (continuation instanceof io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1) {
            loggingUtilsKt$logResponseBody$1 = (io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1) continuation;
            if ((loggingUtilsKt$logResponseBody$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                loggingUtilsKt$logResponseBody$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = loggingUtilsKt$logResponseBody$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingUtilsKt$logResponseBody$1.getHighSpeedVideoFpsRanges;
                str = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    sb.append("BODY Content-Type: ".concat(java.lang.String.valueOf(contentType)));
                    sb.append('\n');
                    sb.append("BODY START\n");
                    if (contentType == null || (charset = io.ktor.http.ContentTypesKt.charset(contentType)) == null) {
                        charset = kotlin.text.Charsets.UTF_8;
                    }
                    try {
                        loggingUtilsKt$logResponseBody$1.getHighSpeedVideoSizes = sb;
                        loggingUtilsKt$logResponseBody$1.getHighResolutionOutputSizeshNQ4ISI = charset;
                        loggingUtilsKt$logResponseBody$1.getHighSpeedVideoFpsRanges = 1;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, loggingUtilsKt$logResponseBody$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.nio.charset.Charset charset2 = (java.nio.charset.Charset) loggingUtilsKt$logResponseBody$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.StringBuilder sb2 = (java.lang.StringBuilder) loggingUtilsKt$logResponseBody$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        charset = charset2;
                        sb = sb2;
                    } catch (java.lang.Throwable unused2) {
                        sb = sb2;
                    }
                }
                str = io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset, 0, 2, null);
                if (str == null) {
                    str = "[response body omitted]";
                }
                sb.append(str);
                sb.append("\nBODY END");
                return kotlin.Unit.INSTANCE;
            }
        }
        loggingUtilsKt$logResponseBody$1 = new io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1(continuation);
        java.lang.Object obj2 = loggingUtilsKt$logResponseBody$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingUtilsKt$logResponseBody$1.getHighSpeedVideoFpsRanges;
        str = null;
        if (i != 0) {
        }
        str = io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj2, charset, 0, 2, null);
        if (str == null) {
        }
        sb.append(str);
        sb.append("\nBODY END");
        return kotlin.Unit.INSTANCE;
    }
}
