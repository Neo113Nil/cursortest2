package com.datadog.trace.api.internal;

/* loaded from: classes3.dex */
public interface TraceSegment {
    void effectivelyBlocked();

    void setDataCurrent(java.lang.String str, java.lang.Object obj);

    void setDataTop(java.lang.String str, java.lang.Object obj);

    void setTagCurrent(java.lang.String str, java.lang.Object obj, boolean z);

    void setTagTop(java.lang.String str, java.lang.Object obj, boolean z);

    default void setTagTop(java.lang.String str, java.lang.Object obj) {
        setTagTop(str, obj, false);
    }

    default void setTagCurrent(java.lang.String str, java.lang.Object obj) {
        setTagCurrent(str, obj, false);
    }

    /* loaded from: classes8.dex */
    public static class NoOp implements com.datadog.trace.api.internal.TraceSegment {
        public static final com.datadog.trace.api.internal.TraceSegment INSTANCE = new com.datadog.trace.api.internal.TraceSegment.NoOp();

        @Override // com.datadog.trace.api.internal.TraceSegment
        public void effectivelyBlocked() {
        }

        @Override // com.datadog.trace.api.internal.TraceSegment
        public void setDataCurrent(java.lang.String str, java.lang.Object obj) {
        }

        @Override // com.datadog.trace.api.internal.TraceSegment
        public void setDataTop(java.lang.String str, java.lang.Object obj) {
        }

        @Override // com.datadog.trace.api.internal.TraceSegment
        public void setTagCurrent(java.lang.String str, java.lang.Object obj, boolean z) {
        }

        @Override // com.datadog.trace.api.internal.TraceSegment
        public void setTagTop(java.lang.String str, java.lang.Object obj, boolean z) {
        }

        private NoOp() {
        }
    }
}
