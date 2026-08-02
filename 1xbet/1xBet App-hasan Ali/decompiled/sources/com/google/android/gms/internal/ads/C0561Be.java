package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561Be extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f7820a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0569Ce f7821b;

    public C0561Be(C0569Ce c0569Ce) {
        this.f7821b = c0569Ce;
    }

    public final void a(Socket socket) {
        C0569Ce c0569Ce = this.f7821b;
        int i = c0569Ce.f8025B;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        c0569Ce.f8026C.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f7820a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f7820a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f7820a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i5) {
        Socket createSocket = this.f7820a.createSocket(str, i, inetAddress, i5);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f7820a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i5) {
        Socket createSocket = this.f7820a.createSocket(inetAddress, i, inetAddress2, i5);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z3) {
        Socket createSocket = this.f7820a.createSocket(socket, str, i, z3);
        a(createSocket);
        return createSocket;
    }
}
