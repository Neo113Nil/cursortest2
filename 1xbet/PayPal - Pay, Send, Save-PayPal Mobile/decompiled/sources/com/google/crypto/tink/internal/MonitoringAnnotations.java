package com.google.crypto.tink.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class MonitoringAnnotations {
    public static final com.google.crypto.tink.internal.MonitoringAnnotations EMPTY = newBuilder().build();
    private final java.util.Map<java.lang.String, java.lang.String> entries;

    public static final class Builder {
        private java.util.HashMap<java.lang.String, java.lang.String> builderEntries = new java.util.HashMap<>();

        public final com.google.crypto.tink.internal.MonitoringAnnotations.Builder addAll(java.util.Map<java.lang.String, java.lang.String> map) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.builderEntries;
            if (hashMap == null) {
                throw new java.lang.IllegalStateException("addAll cannot be called after build()");
            }
            hashMap.putAll(map);
            return this;
        }

        public final com.google.crypto.tink.internal.MonitoringAnnotations.Builder add(java.lang.String str, java.lang.String str2) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.builderEntries;
            if (hashMap == null) {
                throw new java.lang.IllegalStateException("add cannot be called after build()");
            }
            hashMap.put(str, str2);
            return this;
        }

        public final com.google.crypto.tink.internal.MonitoringAnnotations build() {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.builderEntries;
            if (hashMap == null) {
                throw new java.lang.IllegalStateException("cannot call build() twice");
            }
            com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations = new com.google.crypto.tink.internal.MonitoringAnnotations(java.util.Collections.unmodifiableMap(hashMap));
            this.builderEntries = null;
            return monitoringAnnotations;
        }
    }

    private MonitoringAnnotations(java.util.Map<java.lang.String, java.lang.String> map) {
        this.entries = map;
    }

    public static com.google.crypto.tink.internal.MonitoringAnnotations.Builder newBuilder() {
        return new com.google.crypto.tink.internal.MonitoringAnnotations.Builder();
    }

    public final java.util.Map<java.lang.String, java.lang.String> toMap() {
        return this.entries;
    }

    public final boolean isEmpty() {
        return this.entries.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.crypto.tink.internal.MonitoringAnnotations) {
            return this.entries.equals(((com.google.crypto.tink.internal.MonitoringAnnotations) obj).entries);
        }
        return false;
    }

    public final int hashCode() {
        return this.entries.hashCode();
    }

    public final java.lang.String toString() {
        return this.entries.toString();
    }
}
