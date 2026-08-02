package com.google.android.datatransport;

/* loaded from: classes3.dex */
final class AutoValue_Event<T> extends com.google.android.datatransport.Event<T> {
    private final java.lang.Integer code;
    private final T payload;
    private final com.google.android.datatransport.Priority priority;
    private final com.google.android.datatransport.ProductData productData;

    AutoValue_Event(java.lang.Integer num, T t, com.google.android.datatransport.Priority priority, com.google.android.datatransport.ProductData productData) {
        this.code = num;
        if (t == null) {
            throw new java.lang.NullPointerException("Null payload");
        }
        this.payload = t;
        if (priority == null) {
            throw new java.lang.NullPointerException("Null priority");
        }
        this.priority = priority;
        this.productData = productData;
    }

    @Override // com.google.android.datatransport.Event
    public final java.lang.Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    public final T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public final com.google.android.datatransport.Priority getPriority() {
        return this.priority;
    }

    @Override // com.google.android.datatransport.Event
    public final com.google.android.datatransport.ProductData getProductData() {
        return this.productData;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Event{code=");
        sb.append(this.code);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", productData=");
        sb.append(this.productData);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.Event)) {
            return false;
        }
        com.google.android.datatransport.Event event = (com.google.android.datatransport.Event) obj;
        java.lang.Integer num = this.code;
        if (num == null) {
            if (event.getCode() != null) {
                return false;
            }
        } else if (!num.equals(event.getCode())) {
            return false;
        }
        if (!this.payload.equals(event.getPayload()) || !this.priority.equals(event.getPriority())) {
            return false;
        }
        com.google.android.datatransport.ProductData productData = this.productData;
        if (productData == null) {
            if (event.getProductData() != null) {
                return false;
            }
        } else if (!productData.equals(event.getProductData())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Integer num = this.code;
        int hashCode = num == null ? 0 : num.hashCode();
        int hashCode2 = this.payload.hashCode();
        int hashCode3 = this.priority.hashCode();
        com.google.android.datatransport.ProductData productData = this.productData;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (productData != null ? productData.hashCode() : 0);
    }
}
