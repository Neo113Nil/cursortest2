package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class zzccs extends SSLSocketFactory {
    final SSLSocketFactory zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    final /* synthetic */ zzcct zzb;

    public zzccs(zzcct zzcctVar) {
        this.zzb = zzcctVar;
    }

    private final Socket zza(Socket socket) {
        int i7;
        int i8;
        zzcct zzcctVar = this.zzb;
        i7 = zzcctVar.zzq;
        if (i7 > 0) {
            i8 = zzcctVar.zzq;
            socket.setReceiveBufferSize(i8);
        }
        this.zzb.zzr.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7) {
        Socket createSocket = this.zza.createSocket(str, i7);
        zza(createSocket);
        return createSocket;
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
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i8) {
        Socket createSocket = this.zza.createSocket(str, i7, inetAddress, i8);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7) {
        Socket createSocket = this.zza.createSocket(inetAddress, i7);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i8) {
        Socket createSocket = this.zza.createSocket(inetAddress, i7, inetAddress2, i8);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i7, boolean z4) {
        Socket createSocket = this.zza.createSocket(socket, str, i7, z4);
        zza(createSocket);
        return createSocket;
    }
}
