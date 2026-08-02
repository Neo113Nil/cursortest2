package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public interface HttpConnecting {
    void close();

    java.io.InputStream getErrorStream();

    java.io.InputStream getInputStream();

    int getResponseCode();

    java.lang.String getResponseMessage();

    java.lang.String getResponsePropertyValue(java.lang.String str);
}
