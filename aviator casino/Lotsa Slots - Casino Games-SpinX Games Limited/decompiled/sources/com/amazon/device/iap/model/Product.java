package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public final class Product implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amazon.device.iap.model.Product> CREATOR = new android.os.Parcelable.Creator<com.amazon.device.iap.model.Product>() { // from class: com.amazon.device.iap.model.Product.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.amazon.device.iap.model.Product createFromParcel(android.os.Parcel parcel) {
            return new com.amazon.device.iap.model.Product(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.amazon.device.iap.model.Product[] newArray(int i) {
            return new com.amazon.device.iap.model.Product[i];
        }
    };
    private static final java.lang.String DESCRIPTION = "description";
    private static final java.lang.String PRICE = "price";
    private static final java.lang.String PRODUCT_TYPE = "productType";
    private static final java.lang.String SKU = "sku";
    private static final java.lang.String SMALL_ICON_URL = "smallIconUrl";
    private static final java.lang.String TITLE = "title";
    private final java.lang.String description;
    private final java.lang.String price;
    private final com.amazon.device.iap.model.ProductType productType;
    private final java.lang.String sku;
    private final java.lang.String smallIconUrl;
    private final java.lang.String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.sku);
        parcel.writeString(this.productType.toString());
        parcel.writeString(this.description);
        parcel.writeString(this.price);
        parcel.writeString(this.smallIconUrl);
        parcel.writeString(this.title);
    }

    private Product(android.os.Parcel parcel) {
        this.sku = parcel.readString();
        this.productType = com.amazon.device.iap.model.ProductType.valueOf(parcel.readString());
        this.description = parcel.readString();
        this.price = parcel.readString();
        this.smallIconUrl = parcel.readString();
        this.title = parcel.readString();
    }

    public Product(com.amazon.device.iap.internal.model.ProductBuilder productBuilder) {
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) productBuilder.getSku(), "sku");
        com.amazon.device.iap.internal.util.d.a(productBuilder.getProductType(), "productType");
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) productBuilder.getDescription(), "description");
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) productBuilder.getTitle(), "title");
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) productBuilder.getSmallIconUrl(), SMALL_ICON_URL);
        if (com.amazon.device.iap.model.ProductType.SUBSCRIPTION != productBuilder.getProductType()) {
            com.amazon.device.iap.internal.util.d.a((java.lang.Object) productBuilder.getPrice(), "price");
        }
        this.sku = productBuilder.getSku();
        this.productType = productBuilder.getProductType();
        this.description = productBuilder.getDescription();
        this.price = productBuilder.getPrice();
        this.smallIconUrl = productBuilder.getSmallIconUrl();
        this.title = productBuilder.getTitle();
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

    public org.json.JSONObject toJSON() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sku", this.sku);
        jSONObject.put("productType", this.productType);
        jSONObject.put("description", this.description);
        jSONObject.put("price", this.price);
        jSONObject.put(SMALL_ICON_URL, this.smallIconUrl);
        jSONObject.put("title", this.title);
        return jSONObject;
    }

    public java.lang.String toString() {
        try {
            return toJSON().toString(4);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
