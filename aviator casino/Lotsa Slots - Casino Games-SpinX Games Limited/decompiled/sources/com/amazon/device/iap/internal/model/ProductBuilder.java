package com.amazon.device.iap.internal.model;

/* loaded from: classes2.dex */
public class ProductBuilder {
    private java.lang.String description;
    private java.lang.String price;
    private com.amazon.device.iap.model.ProductType productType;
    private java.lang.String sku;
    private java.lang.String smallIconUrl;
    private java.lang.String title;

    public com.amazon.device.iap.model.Product build() {
        return new com.amazon.device.iap.model.Product(this);
    }

    public com.amazon.device.iap.internal.model.ProductBuilder setSku(java.lang.String str) {
        this.sku = str;
        return this;
    }

    public com.amazon.device.iap.internal.model.ProductBuilder setProductType(com.amazon.device.iap.model.ProductType productType) {
        this.productType = productType;
        return this;
    }

    public com.amazon.device.iap.internal.model.ProductBuilder setDescription(java.lang.String str) {
        this.description = str;
        return this;
    }

    public com.amazon.device.iap.internal.model.ProductBuilder setPrice(java.lang.String str) {
        this.price = str;
        return this;
    }

    public com.amazon.device.iap.internal.model.ProductBuilder setSmallIconUrl(java.lang.String str) {
        this.smallIconUrl = str;
        return this;
    }

    public com.amazon.device.iap.internal.model.ProductBuilder setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }

    public java.lang.String getSku() {
        return this.sku;
    }

    public com.amazon.device.iap.model.ProductType getProductType() {
        return this.productType;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getPrice() {
        return this.price;
    }

    public java.lang.String getSmallIconUrl() {
        return this.smallIconUrl;
    }

    public java.lang.String getTitle() {
        return this.title;
    }
}
