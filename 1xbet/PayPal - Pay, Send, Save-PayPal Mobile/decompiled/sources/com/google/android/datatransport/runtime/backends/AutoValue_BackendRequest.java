package com.google.android.datatransport.runtime.backends;

/* loaded from: classes3.dex */
final class AutoValue_BackendRequest extends com.google.android.datatransport.runtime.backends.BackendRequest {
    private final java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> events;
    private final byte[] extras;

    private AutoValue_BackendRequest(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> iterable, byte[] bArr) {
        this.events = iterable;
        this.extras = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> getEvents() {
        return this.events;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final byte[] getExtras() {
        return this.extras;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackendRequest{events=");
        sb.append(this.events);
        sb.append(", extras=");
        sb.append(java.util.Arrays.toString(this.extras));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.backends.BackendRequest)) {
            return false;
        }
        com.google.android.datatransport.runtime.backends.BackendRequest backendRequest = (com.google.android.datatransport.runtime.backends.BackendRequest) obj;
        if (this.events.equals(backendRequest.getEvents())) {
            return java.util.Arrays.equals(this.extras, backendRequest instanceof com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest ? ((com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest) backendRequest).extras : backendRequest.getExtras());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.events.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.extras);
    }

    static final class Builder extends com.google.android.datatransport.runtime.backends.BackendRequest.Builder {
        private java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> events;
        private byte[] extras;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final com.google.android.datatransport.runtime.backends.BackendRequest.Builder setEvents(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> iterable) {
            if (iterable == null) {
                throw new java.lang.NullPointerException("Null events");
            }
            this.events = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final com.google.android.datatransport.runtime.backends.BackendRequest.Builder setExtras(byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final com.google.android.datatransport.runtime.backends.BackendRequest build() {
            java.lang.String str;
            if (this.events != null) {
                str = "";
            } else {
                str = " events";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
            }
            return new com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest(this.events, this.extras);
        }
    }
}
