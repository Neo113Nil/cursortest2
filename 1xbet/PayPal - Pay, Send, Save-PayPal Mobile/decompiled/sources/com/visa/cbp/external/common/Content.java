package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class Content {
    private java.util.Map<java.lang.String, java.lang.Object> additionalProperties = new java.util.HashMap();
    private java.lang.String height;
    private java.lang.String mimeType;
    private java.lang.String width;

    public java.lang.String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(java.lang.String str) {
        this.mimeType = str;
    }

    public java.lang.String getWidth() {
        return this.width;
    }

    public void setWidth(java.lang.String str) {
        this.width = str;
    }

    public java.lang.String getHeight() {
        return this.height;
    }

    public void setHeight(java.lang.String str) {
        this.height = str;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(java.lang.String str, java.lang.Object obj) {
        this.additionalProperties.put(str, obj);
    }
}
