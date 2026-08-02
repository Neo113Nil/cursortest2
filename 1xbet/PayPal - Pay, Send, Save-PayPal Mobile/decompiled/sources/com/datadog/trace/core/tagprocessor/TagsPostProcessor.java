package com.datadog.trace.core.tagprocessor;

/* loaded from: classes8.dex */
public interface TagsPostProcessor {
    java.util.Map<java.lang.String, java.lang.Object> processTags(java.util.Map<java.lang.String, java.lang.Object> map);

    default java.util.Map<java.lang.String, java.lang.Object> processTagsWithContext(java.util.Map<java.lang.String, java.lang.Object> map, com.datadog.trace.core.DDSpanContext dDSpanContext) {
        return processTags(map);
    }
}
