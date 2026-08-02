package com.nimbusds.jose.util;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class Resource {
    private final java.lang.String content;
    private final java.lang.String contentType;

    public Resource(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The resource content must not be null");
        }
        this.content = str;
        this.contentType = str2;
    }

    public java.lang.String getContent() {
        return this.content;
    }

    public java.lang.String getContentType() {
        return this.contentType;
    }
}
