package io.ktor.client.plugins.logging;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\r\u0010\u000eR4\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u000f8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010)\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010+\u001a\u00020*8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100"}, d2 = {"Lio/ktor/client/plugins/logging/LoggingConfig;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "predicate", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Lkotlin/jvm/functions/Function1;)V", "", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "sanitizeHeader", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "filters", "Ljava/util/List;", "getFilters$ktor_client_logging", "()Ljava/util/List;", "setFilters$ktor_client_logging", "(Ljava/util/List;)V", "Lio/ktor/client/plugins/logging/SanitizedHeader;", "sanitizedHeaders", "getSanitizedHeaders$ktor_client_logging", "Lio/ktor/client/plugins/logging/Logger;", "getHighSpeedVideoSizes", "Lio/ktor/client/plugins/logging/Logger;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/client/plugins/logging/LoggingFormat;", "format", "Lio/ktor/client/plugins/logging/LoggingFormat;", "getFormat", "()Lio/ktor/client/plugins/logging/LoggingFormat;", "setFormat", "(Lio/ktor/client/plugins/logging/LoggingFormat;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getLogger", "()Lio/ktor/client/plugins/logging/Logger;", "setLogger", "(Lio/ktor/client/plugins/logging/Logger;)V", "logger", "Lio/ktor/client/plugins/logging/LogLevel;", "level", "Lio/ktor/client/plugins/logging/LogLevel;", "getLevel", "()Lio/ktor/client/plugins/logging/LogLevel;", "setLevel", "(Lio/ktor/client/plugins/logging/LogLevel;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggingConfig {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private io.ktor.client.plugins.logging.Logger getHighSpeedVideoFpsRangesFor;
    private java.util.List<kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, java.lang.Boolean>> filters = new java.util.ArrayList();
    private final java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> sanitizedHeaders = new java.util.ArrayList();
    private io.ktor.client.plugins.logging.LoggingFormat format = io.ktor.client.plugins.logging.LoggingFormat.Default;
    private io.ktor.client.plugins.logging.LogLevel level = io.ktor.client.plugins.logging.LogLevel.HEADERS;

    public final java.util.List<kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, java.lang.Boolean>> getFilters$ktor_client_logging() {
        return this.filters;
    }

    public final void setFilters$ktor_client_logging(java.util.List<kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, java.lang.Boolean>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.filters = list;
    }

    public final java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> getSanitizedHeaders$ktor_client_logging() {
        return this.sanitizedHeaders;
    }

    public final io.ktor.client.plugins.logging.LoggingFormat getFormat() {
        return this.format;
    }

    public final void setFormat(io.ktor.client.plugins.logging.LoggingFormat loggingFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggingFormat, "");
        this.format = loggingFormat;
    }

    public final io.ktor.client.plugins.logging.Logger getLogger() {
        io.ktor.client.plugins.logging.Logger logger = this.getHighSpeedVideoFpsRangesFor;
        return logger == null ? io.ktor.client.plugins.logging.LoggerJvmKt.getDEFAULT(io.ktor.client.plugins.logging.Logger.INSTANCE) : logger;
    }

    public final void setLogger(io.ktor.client.plugins.logging.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.getHighSpeedVideoFpsRangesFor = logger;
    }

    public final io.ktor.client.plugins.logging.LogLevel getLevel() {
        return this.level;
    }

    public final void setLevel(io.ktor.client.plugins.logging.LogLevel logLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "");
        this.level = logLevel;
    }

    public final void filter(kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        this.filters.add(predicate);
    }

    public static /* synthetic */ void sanitizeHeader$default(io.ktor.client.plugins.logging.LoggingConfig loggingConfig, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.FIXED_INPUT_MASK;
        }
        loggingConfig.sanitizeHeader(str, function1);
    }

    public final void sanitizeHeader(java.lang.String placeholder, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        this.sanitizedHeaders.add(new io.ktor.client.plugins.logging.SanitizedHeader(placeholder, predicate));
    }
}
