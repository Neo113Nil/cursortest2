package com.datadog.trace.core.tagprocessor;

/* loaded from: classes8.dex */
public class PostProcessorChain implements com.datadog.trace.core.tagprocessor.TagsPostProcessor {
    private final com.datadog.trace.core.tagprocessor.TagsPostProcessor[] getHighResolutionOutputSizeshNQ4ISI;

    public PostProcessorChain(com.datadog.trace.core.tagprocessor.TagsPostProcessor... tagsPostProcessorArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = (com.datadog.trace.core.tagprocessor.TagsPostProcessor[]) java.util.Objects.requireNonNull(tagsPostProcessorArr);
    }

    @Override // com.datadog.trace.core.tagprocessor.TagsPostProcessor
    public java.util.Map<java.lang.String, java.lang.Object> processTags(java.util.Map<java.lang.String, java.lang.Object> map) {
        return processTagsWithContext(map, null);
    }

    @Override // com.datadog.trace.core.tagprocessor.TagsPostProcessor
    public java.util.Map<java.lang.String, java.lang.Object> processTagsWithContext(java.util.Map<java.lang.String, java.lang.Object> map, com.datadog.trace.core.DDSpanContext dDSpanContext) {
        for (com.datadog.trace.core.tagprocessor.TagsPostProcessor tagsPostProcessor : this.getHighResolutionOutputSizeshNQ4ISI) {
            map = tagsPostProcessor.processTagsWithContext(map, dDSpanContext);
        }
        return map;
    }
}
