package com.onesignal.core.internal.http.impl;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class TLS12SocketFactory extends SSLSocketFactory {
    private SSLSocketFactory sslSocketFactory;

    public TLS12SocketFactory(SSLSocketFactory sslSocketFactory) {
        i.e(sslSocketFactory, "sslSocketFactory");
        this.sslSocketFactory = sslSocketFactory;
    }

    private final Socket enableTLS(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.sslSocketFactory.createSocket();
        i.d(createSocket, "createSocket(...)");
        return enableTLS(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.sslSocketFactory.getDefaultCipherSuites();
        i.d(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.sslSocketFactory.getSupportedCipherSuites();
        i.d(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    public final void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "<set-?>");
        this.sslSocketFactory = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s2, String host, int i2, boolean z) {
        i.e(s2, "s");
        i.e(host, "host");
        Socket createSocket = this.sslSocketFactory.createSocket(s2, host, i2, z);
        i.d(createSocket, "createSocket(...)");
        return enableTLS(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i2) {
        i.e(host, "host");
        Socket createSocket = this.sslSocketFactory.createSocket(host, i2);
        i.d(createSocket, "createSocket(...)");
        return enableTLS(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i2, InetAddress localHost, int i3) {
        i.e(host, "host");
        i.e(localHost, "localHost");
        Socket createSocket = this.sslSocketFactory.createSocket(host, i2, localHost, i3);
        i.d(createSocket, "createSocket(...)");
        return enableTLS(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i2) {
        i.e(host, "host");
        Socket createSocket = this.sslSocketFactory.createSocket(host, i2);
        i.d(createSocket, "createSocket(...)");
        return enableTLS(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i2, InetAddress localAddress, int i3) {
        i.e(address, "address");
        i.e(localAddress, "localAddress");
        Socket createSocket = this.sslSocketFactory.createSocket(address, i2, localAddress, i3);
        i.d(createSocket, "createSocket(...)");
        return enableTLS(createSocket);
    }
}
