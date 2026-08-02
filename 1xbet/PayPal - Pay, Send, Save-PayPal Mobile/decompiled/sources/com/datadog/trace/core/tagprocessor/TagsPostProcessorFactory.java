package com.datadog.trace.core.tagprocessor;

/* loaded from: classes8.dex */
public final class TagsPostProcessorFactory {
    private static boolean Camera2StreamConfigurationMap = true;

    static class Lazy {
        private static com.datadog.trace.core.tagprocessor.TagsPostProcessor getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap();

        private Lazy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.datadog.trace.core.tagprocessor.TagsPostProcessor Camera2StreamConfigurationMap() {
            java.util.ArrayList arrayList = new java.util.ArrayList(com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.Camera2StreamConfigurationMap ? 3 : 2);
            arrayList.add(new com.datadog.trace.core.tagprocessor.PeerServiceCalculator());
            if (com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.Camera2StreamConfigurationMap) {
                arrayList.add(new com.datadog.trace.core.tagprocessor.BaseServiceAdder(com.datadog.trace.api.Config.get().getServiceName()));
            }
            arrayList.add(new com.datadog.trace.core.tagprocessor.QueryObfuscator(com.datadog.trace.api.Config.get().getObfuscationQueryRegexp()));
            return new com.datadog.trace.core.tagprocessor.PostProcessorChain((com.datadog.trace.core.tagprocessor.TagsPostProcessor[]) arrayList.toArray((com.datadog.trace.core.tagprocessor.TagsPostProcessor[]) arrayList.toArray(new com.datadog.trace.core.tagprocessor.TagsPostProcessor[0])));
        }
    }

    public static com.datadog.trace.core.tagprocessor.TagsPostProcessor instance() {
        return com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.Lazy.getHighSpeedVideoFpsRanges;
    }

    public static void withAddBaseService(boolean z) {
        Camera2StreamConfigurationMap = z;
        com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.Lazy.getHighSpeedVideoFpsRanges = com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.Lazy.Camera2StreamConfigurationMap();
    }

    public static void reset() {
        withAddBaseService(true);
        com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.Lazy.getHighSpeedVideoFpsRanges = com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.Lazy.Camera2StreamConfigurationMap();
    }
}
