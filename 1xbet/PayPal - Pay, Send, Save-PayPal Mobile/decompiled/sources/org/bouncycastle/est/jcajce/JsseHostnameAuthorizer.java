package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
public interface JsseHostnameAuthorizer {
    boolean verified(java.lang.String str, javax.net.ssl.SSLSession sSLSession) throws java.io.IOException;
}
