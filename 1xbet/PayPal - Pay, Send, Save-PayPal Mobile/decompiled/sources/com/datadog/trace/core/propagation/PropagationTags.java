package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public abstract class PropagationTags {

    public interface Factory {
        com.datadog.trace.core.propagation.PropagationTags empty();

        com.datadog.trace.core.propagation.PropagationTags fromHeaderValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType, java.lang.String str);
    }

    public abstract void fillTagMap(java.util.Map<java.lang.String, java.lang.String> map);

    public abstract java.lang.CharSequence getOrigin();

    public abstract java.lang.String getRumSessionId();

    public abstract int getSamplingPriority();

    public abstract long getTraceIdHighOrderBits();

    public abstract java.lang.String getW3CTracestate();

    public abstract java.lang.String headerValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType);

    public abstract void updateRumSessionId(java.lang.String str);

    public abstract void updateTraceIdHighOrderBits(long j);

    public abstract void updateTraceOrigin(java.lang.CharSequence charSequence);

    public abstract void updateTraceSamplingPriority(int i, int i2);

    public abstract void updateW3CTracestate(java.lang.String str);

    public static com.datadog.trace.core.propagation.PropagationTags.Factory factory(com.datadog.trace.api.Config config) {
        return factory(config.getxDatadogTagsMaxLength());
    }

    public static com.datadog.trace.core.propagation.PropagationTags.Factory factory(int i) {
        return new com.datadog.trace.core.propagation.ptags.PTagsFactory(i);
    }

    public static com.datadog.trace.core.propagation.PropagationTags.Factory factory() {
        return factory(512);
    }

    public enum HeaderType {
        DATADOG,
        W3C;

        private static final int Camera2StreamConfigurationMap = values().length;

        public static int getNumValues() {
            return Camera2StreamConfigurationMap;
        }
    }

    public java.util.HashMap<java.lang.String, java.lang.String> createTagMap() {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        fillTagMap(hashMap);
        return hashMap;
    }
}
