package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class KnotEvent {
    private com.knotapi.knot.models.Environment environment;
    private java.lang.String event;
    private com.knotapi.knot.Knot.Product product;
    private java.lang.String taskId;
    private java.lang.String merchantName = "";
    private java.lang.String merchantId = "";
    private java.util.Map<java.lang.String, java.lang.Object> metaData = new java.util.HashMap();

    public com.knotapi.knot.models.Environment getEnvironment() {
        return this.environment;
    }

    public java.lang.String getEvent() {
        return this.event;
    }

    public java.lang.String getMerchantId() {
        return this.merchantId;
    }

    public java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMetaData() {
        return this.metaData;
    }

    public com.knotapi.knot.Knot.Product getProduct() {
        return this.product;
    }

    public java.lang.String getTaskId() {
        return this.taskId;
    }

    public void setEnvironment(com.knotapi.knot.models.Environment environment) {
        this.environment = environment;
    }

    public void setEvent(java.lang.String str) {
        this.event = str;
    }

    public void setMerchantId(java.lang.String str) {
        this.merchantId = str;
    }

    public void setMerchantName(java.lang.String str) {
        this.merchantName = str;
    }

    public void setMetaData(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.metaData = map;
    }

    public void setMetaDataEntry(java.lang.String str, java.lang.Object obj) {
        this.metaData.put(str, obj);
    }

    public void setProduct(com.knotapi.knot.Knot.Product product) {
        this.product = product;
    }

    public void setTaskId(java.lang.String str) {
        this.taskId = str;
    }
}
