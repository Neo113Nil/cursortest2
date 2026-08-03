package io.appmetrica.analytics.networkokhttp.impl;

/* loaded from: classes.dex */
public abstract class d {
    public static I1.s a(io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings) {
        I1.p pVar;
        I1.r rVar = new I1.r();
        I1.t tVar = I1.t.HTTP_2;
        I1.t tVar2 = I1.t.HTTP_1_1;
        java.util.ArrayList Z2 = i1.AbstractC0190i.Z(i1.AbstractC0191j.H(tVar, tVar2));
        I1.t tVar3 = I1.t.H2_PRIOR_KNOWLEDGE;
        if (!Z2.contains(tVar3) && !Z2.contains(tVar2)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(Z2, "protocols must contain h2_prior_knowledge or http/1.1: ").toString());
        }
        if (Z2.contains(tVar3) && Z2.size() > 1) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(Z2, "protocols containing h2_prior_knowledge cannot use other protocols: ").toString());
        }
        if (Z2.contains(I1.t.HTTP_1_0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(Z2, "protocols must not contain http/1.0: ").toString());
        }
        if (Z2.contains(null)) {
            throw new java.lang.IllegalArgumentException("protocols must not contain null");
        }
        Z2.remove(I1.t.SPDY_3);
        Z2.equals(rVar.f788q);
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(Z2);
        kotlin.jvm.internal.i.d(unmodifiableList, "unmodifiableList(protocolsCopy)");
        rVar.f788q = unmodifiableList;
        java.lang.Integer readTimeout = networkClientSettings.getReadTimeout();
        if (readTimeout != null) {
            long intValue = readTimeout.intValue();
            java.util.concurrent.TimeUnit unit = java.util.concurrent.TimeUnit.MILLISECONDS;
            kotlin.jvm.internal.i.e(unit, "unit");
            rVar.f792v = J1.b.b(intValue, unit);
        }
        java.lang.Integer connectTimeout = networkClientSettings.getConnectTimeout();
        if (connectTimeout != null) {
            long intValue2 = connectTimeout.intValue();
            java.util.concurrent.TimeUnit unit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
            kotlin.jvm.internal.i.e(unit2, "unit");
            rVar.f791u = J1.b.b(intValue2, unit2);
        }
        java.lang.Boolean instanceFollowRedirects = networkClientSettings.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            rVar.f779h = instanceFollowRedirects.booleanValue();
        }
        try {
            java.lang.String readSystemProperty = io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.okhttp.mock");
            io.appmetrica.analytics.networkokhttp.internal.InterceptorSupplier interceptorSupplier = y1.g.T(readSystemProperty) ? null : (io.appmetrica.analytics.networkokhttp.internal.InterceptorSupplier) io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(readSystemProperty, io.appmetrica.analytics.networkokhttp.internal.InterceptorSupplier.class);
            if (interceptorSupplier != null && (pVar = interceptorSupplier.get()) != null) {
                rVar.f774c.add(pVar);
            }
        } catch (java.lang.Throwable unused) {
        }
        javax.net.ssl.SSLSocketFactory sslSocketFactory = networkClientSettings.getSslSocketFactory();
        if (sslSocketFactory != null) {
            try {
                javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((java.security.KeyStore) null);
                javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (javax.net.ssl.TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                }
                javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) i1.AbstractC0190i.N(arrayList);
                if (x509TrustManager != null) {
                    if (sslSocketFactory.equals(rVar.f785n)) {
                        x509TrustManager.equals(rVar.f786o);
                    }
                    rVar.f785n = sslSocketFactory;
                    Q1.n nVar = Q1.n.f1644a;
                    rVar.t = Q1.n.f1644a.b(x509TrustManager);
                    rVar.f786o = x509TrustManager;
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        networkClientSettings.getUseCaches();
        return new I1.s(rVar);
    }
}
