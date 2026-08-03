package com.amazon.device.iap.internal.model;

/* loaded from: classes2.dex */
public class ReceiptBuilder {
    private java.util.Date cancelDate;
    private com.amazon.device.iap.model.ProductType productType;
    private java.util.Date purchaseDate;
    private java.lang.String receiptId;
    private java.lang.String sku;

    public com.amazon.device.iap.model.Receipt build() {
        return new com.amazon.device.iap.model.Receipt(this);
    }

    public java.lang.String getReceiptId() {
        return this.receiptId;
    }

    public java.lang.String getSku() {
        return this.sku;
    }

    public com.amazon.device.iap.model.ProductType getProductType() {
        return this.productType;
    }

    public java.util.Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public java.util.Date getCancelDate() {
        return this.cancelDate;
    }

    public com.amazon.device.iap.internal.model.ReceiptBuilder setReceiptId(java.lang.String str) {
        this.receiptId = str;
        return this;
    }

    public com.amazon.device.iap.internal.model.ReceiptBuilder setSku(java.lang.String str) {
        this.sku = str;
        return this;
    }

    public com.amazon.device.iap.internal.model.ReceiptBuilder setProductType(com.amazon.device.iap.model.ProductType productType) {
        this.productType = productType;
        return this;
    }

    public com.amazon.device.iap.internal.model.ReceiptBuilder setPurchaseDate(java.util.Date date) {
        this.purchaseDate = date;
        return this;
    }

    public com.amazon.device.iap.internal.model.ReceiptBuilder setCancelDate(java.util.Date date) {
        this.cancelDate = date;
        return this;
    }
}
