package com.datadog.trace.core.tagprocessor;

/* loaded from: classes8.dex */
public class PeerServiceCalculator implements com.datadog.trace.core.tagprocessor.TagsPostProcessor {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.api.naming.NamingSchema.ForPeerService getHighSpeedVideoSizes;

    public PeerServiceCalculator() {
        this(com.datadog.trace.api.naming.SpanNaming.instance().namingSchema().peerService(), com.datadog.trace.api.Config.get().getPeerServiceMapping());
    }

    private PeerServiceCalculator(com.datadog.trace.api.naming.NamingSchema.ForPeerService forPeerService, java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoSizes = forPeerService;
        this.getHighSpeedVideoFpsRanges = map;
        this.getHighResolutionOutputSizeshNQ4ISI = !map.isEmpty();
    }

    @Override // com.datadog.trace.core.tagprocessor.TagsPostProcessor
    public java.util.Map<java.lang.String, java.lang.Object> processTags(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj = map.get(com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_SERVICE);
        if (obj != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI ? getHighResolutionOutputSizeshNQ4ISI(map, obj) : map;
        }
        if (!this.getHighSpeedVideoSizes.supports()) {
            return map;
        }
        this.getHighSpeedVideoSizes.tags(map);
        return getHighResolutionOutputSizeshNQ4ISI(map, this.getHighResolutionOutputSizeshNQ4ISI ? map.get(com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_SERVICE) : null);
    }

    private java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.Object obj) {
        java.lang.String str;
        if (obj != null && (str = this.getHighSpeedVideoFpsRanges.get(obj)) != null) {
            map.put(com.datadog.trace.bootstrap.instrumentation.api.Tags.PEER_SERVICE, str);
            map.put(com.datadog.trace.api.DDTags.PEER_SERVICE_REMAPPED_FROM, obj);
        }
        return map;
    }
}
