package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: Handshake.java */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f9945a;
    private final g b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f9945a = d0Var;
        this.b = gVar;
        this.c = list;
        this.d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g a2 = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 a3 = d0.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List a4 = certificateArr != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(a3, a2, a4, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.emptyList());
    }

    public List<Certificate> b() {
        return this.c;
    }

    public d0 c() {
        return this.f9945a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9945a.equals(qVar.f9945a) && this.b.equals(qVar.b) && this.c.equals(qVar.c) && this.d.equals(qVar.d);
    }

    public int hashCode() {
        return ((((((this.f9945a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public g a() {
        return this.b;
    }
}
