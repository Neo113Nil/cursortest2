package org.jose4j.http;

/* loaded from: classes18.dex */
public interface SimpleResponse {
    java.lang.String getBody();

    java.util.Collection<java.lang.String> getHeaderNames();

    java.util.List<java.lang.String> getHeaderValues(java.lang.String str);

    int getStatusCode();

    java.lang.String getStatusMessage();
}
