package com.datadog.trace.core;

/* loaded from: classes3.dex */
public class DDSpanLink extends com.datadog.trace.bootstrap.instrumentation.api.SpanLink {
    private static final com.datadog.trace.logger.Logger getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.DDSpanLink.class);

    protected DDSpanLink(com.datadog.trace.api.DDTraceId dDTraceId, long j, byte b, java.lang.String str, com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes attributes) {
        super(dDTraceId, j, b, str, attributes);
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.SpanLink from(com.datadog.trace.core.propagation.ExtractedContext extractedContext) {
        return from(extractedContext, com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.EMPTY);
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.SpanLink from(com.datadog.trace.core.propagation.ExtractedContext extractedContext, com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes attributes) {
        java.lang.String headerValue;
        byte b = extractedContext.getTraceSamplingPriority() > 0 ? (byte) 1 : (byte) 0;
        if (extractedContext.getPropagationTags() == null) {
            headerValue = "";
        } else {
            headerValue = extractedContext.getPropagationTags().headerValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C);
        }
        return new com.datadog.trace.core.DDSpanLink(extractedContext.getTraceId(), extractedContext.getSpanId(), b, headerValue, attributes);
    }

    public static java.lang.String toTag(java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int i = 0;
        while (i < list.size()) {
            com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink = list.get(i);
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("trace_id", agentSpanLink.traceId().toHexString());
            jsonObject.addProperty("span_id", com.datadog.trace.api.DDSpanId.toHexString(agentSpanLink.spanId()));
            jsonObject.addProperty("flags", agentSpanLink.traceFlags() == 0 ? null : java.lang.Byte.valueOf(agentSpanLink.traceFlags()));
            jsonObject.addProperty("tracestate", agentSpanLink.traceState().isEmpty() ? null : agentSpanLink.traceState());
            if (!agentSpanLink.attributes().isEmpty()) {
                jsonObject.addProperty(com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, com.datadog.trace.core.util.MapUtils.getAsJsonObject(agentSpanLink.attributes().asMap()).toString());
            }
            java.lang.String obj = jsonObject.toString();
            if (obj.length() + sb.length() + (i == 0 ? 1 : 2) >= 25000) {
                break;
            }
            if (i > 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            sb.append(obj);
            i++;
        }
        while (i < list.size()) {
            getHighResolutionOutputSizeshNQ4ISI.debug("Span tag full. Dropping span links {}", list.get(i));
            i++;
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
