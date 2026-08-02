package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class CardDatum {
    private java.lang.String contentType;
    private java.lang.String guid;
    private java.util.List<com.visa.cbp.external.common.Content> content = new java.util.ArrayList();
    private java.util.Map<java.lang.String, java.lang.Object> additionalProperties = new java.util.HashMap();

    public java.lang.String getGuid() {
        return this.guid;
    }

    public void setGuid(java.lang.String str) {
        this.guid = str;
    }

    public java.lang.String getContentType() {
        return this.contentType;
    }

    public void setContentType(java.lang.String str) {
        this.contentType = str;
    }

    public java.util.List<com.visa.cbp.external.common.Content> getContent() {
        return this.content;
    }

    public void setContent(java.util.List<com.visa.cbp.external.common.Content> list) {
        this.content = list;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(java.lang.String str, java.lang.Object obj) {
        this.additionalProperties.put(str, obj);
    }
}
