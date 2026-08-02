package com.datadog.trace.core.tagprocessor;

/* loaded from: classes8.dex */
public class BaseServiceAdder implements com.datadog.trace.core.tagprocessor.TagsPostProcessor {
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString Camera2StreamConfigurationMap;

    @Override // com.datadog.trace.core.tagprocessor.TagsPostProcessor
    public java.util.Map<java.lang.String, java.lang.Object> processTags(java.util.Map<java.lang.String, java.lang.Object> map) {
        return map;
    }

    public BaseServiceAdder(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str != null ? com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(str) : null;
    }

    @Override // com.datadog.trace.core.tagprocessor.TagsPostProcessor
    public java.util.Map<java.lang.String, java.lang.Object> processTagsWithContext(java.util.Map<java.lang.String, java.lang.Object> map, com.datadog.trace.core.DDSpanContext dDSpanContext) {
        com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString uTF8BytesString = this.Camera2StreamConfigurationMap;
        if (uTF8BytesString != null && !uTF8BytesString.toString().equalsIgnoreCase(dDSpanContext.getServiceName())) {
            map.put(com.datadog.trace.api.DDTags.BASE_SERVICE, this.Camera2StreamConfigurationMap);
        }
        return map;
    }
}
