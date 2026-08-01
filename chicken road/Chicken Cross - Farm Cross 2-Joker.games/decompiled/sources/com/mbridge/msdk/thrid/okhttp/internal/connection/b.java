package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpecSelector.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f9886a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public b(List<j> list) {
        this.f9886a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.f9886a.size(); i++) {
            if (this.f9886a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i = this.b;
        int size = this.f9886a.size();
        while (true) {
            if (i >= size) {
                jVar = null;
                break;
            }
            jVar = this.f9886a.get(i);
            if (jVar.a(sSLSocket)) {
                this.b = i + 1;
                break;
            }
            i++;
        }
        if (jVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + this.f9886a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        this.c = b(sSLSocket);
        com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(jVar, sSLSocket, this.d);
        return jVar;
    }

    public boolean a(IOException iOException) {
        this.d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
