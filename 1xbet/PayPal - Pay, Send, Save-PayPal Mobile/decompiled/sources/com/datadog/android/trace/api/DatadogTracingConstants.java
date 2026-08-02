package com.datadog.android.trace.api;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/trace/api/DatadogTracingConstants;", "", "<init>", "()V", "", "DEFAULT_ASYNC_PROPAGATING", "Z", "ErrorPriorities", "LogAttributes", "PrioritySampling", "Tags", "TracerConfig"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatadogTracingConstants {
    public static final boolean DEFAULT_ASYNC_PROPAGATING = true;
    public static final com.datadog.android.trace.api.DatadogTracingConstants INSTANCE = new com.datadog.android.trace.api.DatadogTracingConstants();

    private DatadogTracingConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/datadog/android/trace/api/DatadogTracingConstants$Tags;", "", "<init>", "()V", "", "ERROR_MSG", "Ljava/lang/String;", "ERROR_TYPE", "KEY_ANALYTICS_SAMPLE_RATE", "KEY_ERROR_MSG", "KEY_ERROR_STACK", "KEY_ERROR_TYPE", "KEY_HTTP_METHOD", "KEY_HTTP_STATUS", "KEY_HTTP_URL", "KEY_SPAN_KIND", "RESOURCE_NAME", "VALUE_SPAN_KIND_CLIENT", "VALUE_SPAN_KIND_CONSUMER", "VALUE_SPAN_KIND_PRODUCER", "VALUE_SPAN_KIND_SERVER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Tags {
        public static final java.lang.String ERROR_MSG = "error.message";
        public static final java.lang.String ERROR_TYPE = "error.type";
        public static final com.datadog.android.trace.api.DatadogTracingConstants.Tags INSTANCE = new com.datadog.android.trace.api.DatadogTracingConstants.Tags();
        public static final java.lang.String KEY_ANALYTICS_SAMPLE_RATE = "_dd1.sr.eausr";
        public static final java.lang.String KEY_ERROR_MSG = "error.msg";
        public static final java.lang.String KEY_ERROR_STACK = "error.stack";
        public static final java.lang.String KEY_ERROR_TYPE = "error.type";
        public static final java.lang.String KEY_HTTP_METHOD = "http.method";
        public static final java.lang.String KEY_HTTP_STATUS = "http.status_code";
        public static final java.lang.String KEY_HTTP_URL = "http.url";
        public static final java.lang.String KEY_SPAN_KIND = "span.kind";
        public static final java.lang.String RESOURCE_NAME = "resource.name";
        public static final java.lang.String VALUE_SPAN_KIND_CLIENT = "client";
        public static final java.lang.String VALUE_SPAN_KIND_CONSUMER = "consumer";
        public static final java.lang.String VALUE_SPAN_KIND_PRODUCER = "producer";
        public static final java.lang.String VALUE_SPAN_KIND_SERVER = "server";

        private Tags() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/datadog/android/trace/api/DatadogTracingConstants$PrioritySampling;", "", "<init>", "()V", "", "SAMPLER_DROP", com.visa.cbp.getEncExpo.warmup, "SAMPLER_KEEP", "UNSET", "USER_DROP", "USER_KEEP"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PrioritySampling {
        public static final com.datadog.android.trace.api.DatadogTracingConstants.PrioritySampling INSTANCE = new com.datadog.android.trace.api.DatadogTracingConstants.PrioritySampling();
        public static final int SAMPLER_DROP = 0;
        public static final int SAMPLER_KEEP = 1;
        public static final int UNSET = Integer.MIN_VALUE;
        public static final int USER_DROP = -1;
        public static final int USER_KEEP = 2;

        private PrioritySampling() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/datadog/android/trace/api/DatadogTracingConstants$TracerConfig;", "", "<init>", "()V", "", "PARTIAL_FLUSH_MIN_SPANS", "Ljava/lang/String;", "PROPAGATION_STYLE_EXTRACT", "PROPAGATION_STYLE_INJECT", "SDK_V2_COMPATIBILITY_FLAG", "SERVICE_NAME", "SPAN_TAGS", "TAGS", "TRACE_RATE_LIMIT", "TRACE_SAMPLE_RATE", "URL_AS_RESOURCE_NAME"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TracerConfig {
        public static final com.datadog.android.trace.api.DatadogTracingConstants.TracerConfig INSTANCE = new com.datadog.android.trace.api.DatadogTracingConstants.TracerConfig();
        public static final java.lang.String PARTIAL_FLUSH_MIN_SPANS = "trace.partial.flush.min.spans";
        public static final java.lang.String PROPAGATION_STYLE_EXTRACT = "propagation.style.extract";
        public static final java.lang.String PROPAGATION_STYLE_INJECT = "propagation.style.inject";
        public static final java.lang.String SDK_V2_COMPATIBILITY_FLAG = "v2.compatibility.enabled";
        public static final java.lang.String SERVICE_NAME = "service.name";
        public static final java.lang.String SPAN_TAGS = "trace.span.tags";
        public static final java.lang.String TAGS = "tags";
        public static final java.lang.String TRACE_RATE_LIMIT = "trace.rate.limit";
        public static final java.lang.String TRACE_SAMPLE_RATE = "trace.sample.rate";
        public static final java.lang.String URL_AS_RESOURCE_NAME = "trace.URLAsResourceNameRule.enabled";

        private TracerConfig() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/datadog/android/trace/api/DatadogTracingConstants$LogAttributes;", "", "<init>", "()V", "", "ERROR_KIND", "Ljava/lang/String;", "ERROR_OBJECT", "EVENT", com.google.android.gms.auth.api.phone.IncomingCallRetriever.ACTIVITY_RESULT_INTENT_EXTRA_MESSAGE, "STACK", "STATUS"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LogAttributes {
        public static final java.lang.String ERROR_KIND = "error.kind";
        public static final java.lang.String ERROR_OBJECT = "error.object";
        public static final java.lang.String EVENT = "event";
        public static final com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes INSTANCE = new com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes();
        public static final java.lang.String MESSAGE = "message";
        public static final java.lang.String STACK = "stack";
        public static final java.lang.String STATUS = "status";

        private LogAttributes() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/datadog/android/trace/api/DatadogTracingConstants$ErrorPriorities;", "", "<init>", "()V", "", "DEFAULT", "B", "HTTP_SERVER_DECORATOR", "UNSET"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorPriorities {
        public static final byte DEFAULT = 0;
        public static final byte HTTP_SERVER_DECORATOR = -1;
        public static final com.datadog.android.trace.api.DatadogTracingConstants.ErrorPriorities INSTANCE = new com.datadog.android.trace.api.DatadogTracingConstants.ErrorPriorities();
        public static final byte UNSET = Byte.MIN_VALUE;

        private ErrorPriorities() {
        }
    }
}
