package com.google.android.datatransport;

/* loaded from: classes3.dex */
final class AutoValue_ProductData extends com.google.android.datatransport.ProductData {
    private final java.lang.Integer productId;

    AutoValue_ProductData(java.lang.Integer num) {
        this.productId = num;
    }

    @Override // com.google.android.datatransport.ProductData
    public final java.lang.Integer getProductId() {
        return this.productId;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductData{productId=");
        sb.append(this.productId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.ProductData)) {
            return false;
        }
        java.lang.Integer num = this.productId;
        java.lang.Integer productId = ((com.google.android.datatransport.ProductData) obj).getProductId();
        return num == null ? productId == null : num.equals(productId);
    }

    public final int hashCode() {
        java.lang.Integer num = this.productId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }
}
