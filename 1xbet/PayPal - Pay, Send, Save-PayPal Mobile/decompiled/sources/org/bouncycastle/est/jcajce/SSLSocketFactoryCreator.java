package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
public interface SSLSocketFactoryCreator {
    javax.net.ssl.SSLSocketFactory createFactory() throws java.lang.Exception;

    boolean isTrusted();
}
