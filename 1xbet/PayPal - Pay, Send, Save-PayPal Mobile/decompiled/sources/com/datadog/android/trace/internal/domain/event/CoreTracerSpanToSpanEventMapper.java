package com.datadog.android.trace.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/CoreTracerSpanToSpanEventMapper;", "Lcom/datadog/android/trace/internal/domain/event/BaseSpanEventMapper;", "Lcom/datadog/trace/core/DDSpan;", "", "networkInfoEnabled", "<init>", "(Z)V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "model", "Lcom/datadog/android/trace/model/SpanEvent;", "map", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/trace/core/DDSpan;)Lcom/datadog/android/trace/model/SpanEvent;", "Z", "getNetworkInfoEnabled$dd_sdk_android_trace_release", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoreTracerSpanToSpanEventMapper extends com.datadog.android.trace.internal.domain.event.BaseSpanEventMapper<com.datadog.trace.core.DDSpan> {
    public static final java.lang.String SPAN_LINKS_KEY = "_dd.span_links";
    private final boolean networkInfoEnabled;

    /* renamed from: getNetworkInfoEnabled$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getNetworkInfoEnabled() {
        return this.networkInfoEnabled;
    }

    public CoreTracerSpanToSpanEventMapper(boolean z) {
        this.networkInfoEnabled = z;
    }

    @Override // com.datadog.android.trace.internal.domain.event.ContextAwareMapper
    public final com.datadog.android.trace.model.SpanEvent map(com.datadog.android.api.context.DatadogContext datadogContext, com.datadog.trace.core.DDSpan model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        long serverTimeOffsetNs = datadogContext.getTime().getServerTimeOffsetNs();
        java.util.Map<java.lang.String, java.lang.Object> tags = model.getTags();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tags, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : tags.entrySet()) {
            if (entry.getValue() instanceof java.lang.Number) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            linkedHashMap3.put(key, (java.lang.Number) value);
        }
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(linkedHashMap3);
        int spanSamplingPriority = model.getSpanSamplingPriority();
        if (spanSamplingPriority != -128) {
            mutableMap.put(com.datadog.trace.core.DDSpanContext.PRIORITY_SAMPLING_KEY, java.lang.Integer.valueOf(spanSamplingPriority));
        }
        java.lang.String str = null;
        com.datadog.android.trace.model.SpanEvent.Metrics metrics = new com.datadog.android.trace.model.SpanEvent.Metrics(model.getParentId() == 0 ? 1L : null, mutableMap);
        com.datadog.android.trace.model.SpanEvent.Device resolveDeviceInfo = resolveDeviceInfo(datadogContext.getDeviceInfo());
        com.datadog.android.trace.model.SpanEvent.Os resolveOsInfo = resolveOsInfo(datadogContext.getDeviceInfo());
        com.datadog.android.trace.model.SpanEvent.Network resolveNetworkInfo = this.networkInfoEnabled ? resolveNetworkInfo(datadogContext.getNetworkInfo()) : null;
        com.datadog.android.api.context.UserInfo userInfo = datadogContext.getUserInfo();
        com.datadog.android.api.context.AccountInfo accountInfo = datadogContext.getAccountInfo();
        com.datadog.android.trace.model.SpanEvent.Usr usr = new com.datadog.android.trace.model.SpanEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties()));
        com.datadog.android.trace.model.SpanEvent.Account resolveAccountInfo = accountInfo != null ? resolveAccountInfo(accountInfo) : null;
        java.lang.String source = datadogContext.getSource();
        java.lang.Object obj = model.getTags().get("application_id");
        com.datadog.android.trace.model.SpanEvent.Application application = obj != null ? new com.datadog.android.trace.model.SpanEvent.Application(obj instanceof java.lang.String ? (java.lang.String) obj : null) : null;
        java.lang.Object obj2 = model.getTags().get("session_id");
        com.datadog.android.trace.model.SpanEvent.Session session = obj2 != null ? new com.datadog.android.trace.model.SpanEvent.Session(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null) : null;
        java.lang.Object obj3 = model.getTags().get(com.datadog.android.log.LogAttributes.RUM_VIEW_ID);
        com.datadog.android.trace.model.SpanEvent.Dd dd = new com.datadog.android.trace.model.SpanEvent.Dd(source, application, session, obj3 != null ? new com.datadog.android.trace.model.SpanEvent.View(obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null) : null);
        java.lang.String hexStringPadded = com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(model.getTraceId().toHighOrderLong(), 16);
        java.util.Map<java.lang.String, java.lang.Object> tags2 = model.getTags();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tags2, "");
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(tags2.size()));
        java.util.Iterator<T> it = tags2.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry3 = (java.util.Map.Entry) it.next();
            linkedHashMap4.put(entry3.getKey(), entry3.getValue().toString());
        }
        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.String> baggage = model.getBaggage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(baggage, "");
        linkedHashMap5.putAll(baggage);
        linkedHashMap5.putAll(linkedHashMap4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexStringPadded, "");
        linkedHashMap5.put(com.datadog.android.trace.internal.domain.event.MetaKeysKt.TRACE_ID_META_KEY, hexStringPadded);
        linkedHashMap5.put("variant", datadogContext.getVariant());
        if (!model.getLinks().isEmpty()) {
            java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> links = model.getLinks();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(links, "");
            java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> list = links;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink : list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(agentSpanLink, "");
                java.lang.String hexString = agentSpanLink.traceId().toHexString();
                java.lang.String hexStringPadded2 = com.datadog.trace.api.DDSpanId.toHexStringPadded(agentSpanLink.spanId());
                java.util.Map<java.lang.String, java.lang.String> asMap = agentSpanLink.attributes().asMap();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asMap, "");
                com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry4 : asMap.entrySet()) {
                    jsonObject.addProperty(entry4.getKey(), entry4.getValue());
                }
                byte traceFlags = agentSpanLink.traceFlags();
                java.lang.String traceState = agentSpanLink.traceState();
                com.google.gson.JsonObject jsonObject2 = new com.google.gson.JsonObject();
                jsonObject2.addProperty("trace_id", hexString);
                jsonObject2.addProperty("span_id", hexStringPadded2);
                jsonObject2.add(com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, jsonObject);
                if (traceFlags != 0) {
                    jsonObject2.addProperty("flags", java.lang.Byte.valueOf(traceFlags));
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(traceState, "");
                if (traceState.length() > 0) {
                    jsonObject2.addProperty("tracestate", traceState);
                }
                arrayList.add(jsonObject2);
            }
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jsonArray.add((com.google.gson.JsonObject) it2.next());
            }
            str = jsonArray.toString();
        }
        if (str != null) {
            linkedHashMap5.put("_dd.span_links", str);
        }
        com.datadog.android.trace.model.SpanEvent.Meta meta = new com.datadog.android.trace.model.SpanEvent.Meta(datadogContext.getVersion(), dd, new com.datadog.android.trace.model.SpanEvent.Span(), new com.datadog.android.trace.model.SpanEvent.Tracer(datadogContext.getSdkVersion()), usr, resolveAccountInfo, resolveNetworkInfo, resolveDeviceInfo, resolveOsInfo, linkedHashMap5);
        java.lang.String hexStringPadded3 = com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(model.getTraceId().toLong(), 16);
        java.lang.String hexStringPadded4 = com.datadog.trace.api.DDSpanId.toHexStringPadded(model.getSpanId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexStringPadded4, "");
        java.lang.String hexStringPadded5 = com.datadog.trace.api.DDSpanId.toHexStringPadded(model.getParentId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexStringPadded5, "");
        java.lang.String obj4 = model.getResourceName().toString();
        java.lang.String obj5 = model.getOperationName().toString();
        java.lang.String serviceName = model.getServiceName();
        long durationNano = model.getDurationNano();
        long startTime = model.getStartTime();
        long error = model.getError();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexStringPadded3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serviceName, "");
        return new com.datadog.android.trace.model.SpanEvent(hexStringPadded3, hexStringPadded4, hexStringPadded5, obj4, obj5, serviceName, durationNano, startTime + serverTimeOffsetNs, error, metrics, meta);
    }
}
