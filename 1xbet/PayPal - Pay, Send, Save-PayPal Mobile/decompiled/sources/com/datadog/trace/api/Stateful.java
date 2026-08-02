package com.datadog.trace.api;

/* loaded from: classes3.dex */
public interface Stateful extends java.lang.AutoCloseable {
    public static final com.datadog.trace.api.Stateful DEFAULT = new com.datadog.trace.api.Stateful() { // from class: com.datadog.trace.api.Stateful.1
        @Override // com.datadog.trace.api.Stateful
        public void activate(java.lang.Object obj) {
        }

        @Override // com.datadog.trace.api.Stateful, java.lang.AutoCloseable
        public void close() {
        }
    };

    void activate(java.lang.Object obj);

    @Override // java.lang.AutoCloseable
    void close();
}
