package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
final class zzccs extends SSLSocketFactory {
    final SSLSocketFactory zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    final /* synthetic */ zzcct zzb;

    public zzccs(zzcct zzcctVar) {
        this.zzb = zzcctVar;
    }

    private final Socket zza(Socket socket) throws SocketException {
        zzcct zzcctVar = this.zzb;
        if (zzcctVar.zzq > 0) {
            socket.setReceiveBufferSize(zzcctVar.zzq);
        }
        this.zzb.zzr.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i7);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i8) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i7, inetAddress, i8);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i7);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i8) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i7, inetAddress2, i8);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i7, boolean z4) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(socket, str, i7, z4);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }
}
