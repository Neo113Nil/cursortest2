package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public final class Receipt {
    private static final java.lang.String CANCEL_DATE = "endDate";
    private static final java.util.Date DATE_CANCELED = new java.util.Date(1);
    private static final java.lang.String PRODUCT_TYPE = "itemType";
    private static final java.lang.String PURCHASE_DATE = "purchaseDate";
    private static final java.lang.String RECEIPT_ID = "receiptId";
    private static final java.lang.String SKU = "sku";
    private final java.util.Date cancelDate;
    private final com.amazon.device.iap.model.ProductType productType;
    private final java.util.Date purchaseDate;
    private final java.lang.String receiptId;
    private final java.lang.String sku;

    public int hashCode() {
        java.util.Date date = this.cancelDate;
        int hashCode = ((date == null ? 0 : date.hashCode()) + 31) * 31;
        com.amazon.device.iap.model.ProductType productType = this.productType;
        int hashCode2 = (hashCode + (productType == null ? 0 : productType.hashCode())) * 31;
        java.util.Date date2 = this.purchaseDate;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        java.lang.String str = this.receiptId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.sku;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.amazon.device.iap.model.Receipt receipt = (com.amazon.device.iap.model.Receipt) obj;
        java.util.Date date = this.cancelDate;
        if (date == null) {
            if (receipt.cancelDate != null) {
                return false;
            }
        } else if (!date.equals(receipt.cancelDate)) {
            return false;
        }
        if (this.productType != receipt.productType) {
            return false;
        }
        java.util.Date date2 = this.purchaseDate;
        if (date2 == null) {
            if (receipt.purchaseDate != null) {
                return false;
            }
        } else if (!date2.equals(receipt.purchaseDate)) {
            return false;
        }
        java.lang.String str = this.receiptId;
        if (str == null) {
            if (receipt.receiptId != null) {
                return false;
            }
        } else if (!str.equals(receipt.receiptId)) {
            return false;
        }
        java.lang.String str2 = this.sku;
        if (str2 == null) {
            if (receipt.sku != null) {
                return false;
            }
        } else if (!str2.equals(receipt.sku)) {
            return false;
        }
        return true;
    }

    public Receipt(com.amazon.device.iap.internal.model.ReceiptBuilder receiptBuilder) {
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) receiptBuilder.getSku(), "sku");
        com.amazon.device.iap.internal.util.d.a(receiptBuilder.getProductType(), com.ironsource.X3.i.m);
        if (com.amazon.device.iap.model.ProductType.SUBSCRIPTION == receiptBuilder.getProductType()) {
            com.amazon.device.iap.internal.util.d.a(receiptBuilder.getPurchaseDate(), PURCHASE_DATE);
        }
        this.receiptId = receiptBuilder.getReceiptId();
        this.sku = receiptBuilder.getSku();
        this.productType = receiptBuilder.getProductType();
        this.purchaseDate = receiptBuilder.getPurchaseDate();
        this.cancelDate = receiptBuilder.getCancelDate();
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

    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(RECEIPT_ID, this.receiptId);
            jSONObject.put("sku", this.sku);
            jSONObject.put(PRODUCT_TYPE, this.productType);
            jSONObject.put(PURCHASE_DATE, this.purchaseDate);
            jSONObject.put(CANCEL_DATE, this.cancelDate);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        try {
            return toJSON().toString(4);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public boolean isCanceled() {
        return this.cancelDate != null;
    }
}
