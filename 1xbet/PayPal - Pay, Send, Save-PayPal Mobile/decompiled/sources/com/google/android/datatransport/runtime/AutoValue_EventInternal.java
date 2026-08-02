package com.google.android.datatransport.runtime;

/* loaded from: classes3.dex */
final class AutoValue_EventInternal extends com.google.android.datatransport.runtime.EventInternal {
    private final java.util.Map<java.lang.String, java.lang.String> autoMetadata;
    private final java.lang.Integer code;
    private final com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
    private final long eventMillis;
    private final java.lang.Integer productId;
    private final java.lang.String transportName;
    private final long uptimeMillis;

    private AutoValue_EventInternal(java.lang.String str, java.lang.Integer num, com.google.android.datatransport.runtime.EncodedPayload encodedPayload, long j, long j2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Integer num2) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload;
        this.eventMillis = j;
        this.uptimeMillis = j2;
        this.autoMetadata = map;
        this.productId = num2;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final java.lang.String getTransportName() {
        return this.transportName;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final java.lang.Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final com.google.android.datatransport.runtime.EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long getEventMillis() {
        return this.eventMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    protected final java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
        return this.autoMetadata;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final java.lang.Integer getProductId() {
        return this.productId;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventInternal{transportName=");
        sb.append(this.transportName);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", encodedPayload=");
        sb.append(this.encodedPayload);
        sb.append(", eventMillis=");
        sb.append(this.eventMillis);
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", autoMetadata=");
        sb.append(this.autoMetadata);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.EventInternal)) {
            return false;
        }
        com.google.android.datatransport.runtime.EventInternal eventInternal = (com.google.android.datatransport.runtime.EventInternal) obj;
        if (!this.transportName.equals(eventInternal.getTransportName())) {
            return false;
        }
        java.lang.Integer num = this.code;
        if (num == null) {
            if (eventInternal.getCode() != null) {
                return false;
            }
        } else if (!num.equals(eventInternal.getCode())) {
            return false;
        }
        if (!this.encodedPayload.equals(eventInternal.getEncodedPayload()) || this.eventMillis != eventInternal.getEventMillis() || this.uptimeMillis != eventInternal.getUptimeMillis() || !this.autoMetadata.equals(eventInternal.getAutoMetadata())) {
            return false;
        }
        java.lang.Integer num2 = this.productId;
        if (num2 == null) {
            if (eventInternal.getProductId() != null) {
                return false;
            }
        } else if (!num2.equals(eventInternal.getProductId())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.transportName.hashCode();
        java.lang.Integer num = this.code;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.encodedPayload.hashCode();
        long j = this.eventMillis;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.uptimeMillis;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int hashCode4 = this.autoMetadata.hashCode();
        java.lang.Integer num2 = this.productId;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode4) * 1000003) ^ (num2 != null ? num2.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.runtime.EventInternal.Builder {
        private java.util.Map<java.lang.String, java.lang.String> autoMetadata;
        private java.lang.Integer code;
        private com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
        private java.lang.Long eventMillis;
        private java.lang.Integer productId;
        private java.lang.String transportName;
        private java.lang.Long uptimeMillis;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final com.google.android.datatransport.runtime.EventInternal.Builder setTransportName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null transportName");
            }
            this.transportName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final com.google.android.datatransport.runtime.EventInternal.Builder setCode(java.lang.Integer num) {
            this.code = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final com.google.android.datatransport.runtime.EventInternal.Builder setEncodedPayload(com.google.android.datatransport.runtime.EncodedPayload encodedPayload) {
            if (encodedPayload == null) {
                throw new java.lang.NullPointerException("Null encodedPayload");
            }
            this.encodedPayload = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final com.google.android.datatransport.runtime.EventInternal.Builder setEventMillis(long j) {
            this.eventMillis = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final com.google.android.datatransport.runtime.EventInternal.Builder setUptimeMillis(long j) {
            this.uptimeMillis = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected final com.google.android.datatransport.runtime.EventInternal.Builder setAutoMetadata(java.util.Map<java.lang.String, java.lang.String> map) {
            if (map == null) {
                throw new java.lang.NullPointerException("Null autoMetadata");
            }
            this.autoMetadata = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected final java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
            java.util.Map<java.lang.String, java.lang.String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final com.google.android.datatransport.runtime.EventInternal.Builder setProductId(java.lang.Integer num) {
            this.productId = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final com.google.android.datatransport.runtime.EventInternal build() {
            java.lang.String str;
            if (this.transportName != null) {
                str = "";
            } else {
                str = " transportName";
            }
            if (this.encodedPayload == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" encodedPayload");
                str = sb.toString();
            }
            if (this.eventMillis == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" eventMillis");
                str = sb2.toString();
            }
            if (this.uptimeMillis == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" uptimeMillis");
                str = sb3.toString();
            }
            if (this.autoMetadata == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" autoMetadata");
                str = sb4.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new com.google.android.datatransport.runtime.AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata, this.productId);
        }
    }
}
