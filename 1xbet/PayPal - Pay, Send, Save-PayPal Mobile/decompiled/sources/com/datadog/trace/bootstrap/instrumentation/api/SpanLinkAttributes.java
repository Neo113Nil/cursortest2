package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public class SpanLinkAttributes implements com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes {
    public static final com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes EMPTY = new com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes(java.util.Collections.emptyMap());
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;

    protected SpanLinkAttributes(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRanges = map;
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder builder() {
        return new com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder();
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes fromMap(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes(new java.util.HashMap(map));
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes
    public java.util.Map<java.lang.String, java.lang.String> asMap() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes
    public boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanLinkAttributes{");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

        protected Builder() {
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder put(java.lang.String str, java.lang.String str2) {
            java.util.Objects.requireNonNull(str, "key must not be null");
            if (str2 != null) {
                this.getHighSpeedVideoFpsRangesFor.put(str, str2);
            }
            return this;
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder put(java.lang.String str, boolean z) {
            java.util.Objects.requireNonNull(str, "key must not be null");
            this.getHighSpeedVideoFpsRangesFor.put(str, java.lang.Boolean.toString(z));
            return this;
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder put(java.lang.String str, long j) {
            java.util.Objects.requireNonNull(str, "key must not be null");
            this.getHighSpeedVideoFpsRangesFor.put(str, java.lang.Long.toString(j));
            return this;
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder put(java.lang.String str, double d) {
            java.util.Objects.requireNonNull(str, "key must not be null");
            this.getHighSpeedVideoFpsRangesFor.put(str, java.lang.Double.toString(d));
            return this;
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder putStringArray(java.lang.String str, java.util.List<java.lang.String> list) {
            return putArray(str, list);
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder putBooleanArray(java.lang.String str, java.util.List<java.lang.Boolean> list) {
            return putArray(str, list);
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder putLongArray(java.lang.String str, java.util.List<java.lang.Long> list) {
            return putArray(str, list);
        }

        public com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder putDoubleArray(java.lang.String str, java.util.List<java.lang.Double> list) {
            return putArray(str, list);
        }

        protected <T> com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.Builder putArray(java.lang.String str, java.util.List<T> list) {
            java.util.Objects.requireNonNull(str, "key must not be null");
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    T t = list.get(i);
                    if (t != null) {
                        java.util.Map<java.lang.String, java.lang.String> map = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append(".");
                        sb.append(i);
                        map.put(sb.toString(), t.toString());
                    }
                }
            }
            return this;
        }

        public com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes build() {
            return new com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes(this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
