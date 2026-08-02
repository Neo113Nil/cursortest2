package com.lyft.kronos.internal.ntp;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/lyft/kronos/internal/ntp/DatagramFactoryImpl;", "Lcom/lyft/kronos/internal/ntp/DatagramFactory;", "<init>", "()V", "", "buffer", "Ljava/net/DatagramPacket;", "createPacket", "([B)Ljava/net/DatagramPacket;", "Ljava/net/InetAddress;", "address", "", "port", "([BLjava/net/InetAddress;I)Ljava/net/DatagramPacket;", "Ljava/net/DatagramSocket;", "createSocket", "()Ljava/net/DatagramSocket;"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class DatagramFactoryImpl implements com.lyft.kronos.internal.ntp.DatagramFactory {
    @Override // com.lyft.kronos.internal.ntp.DatagramFactory
    public final java.net.DatagramSocket createSocket() throws java.net.SocketException {
        return new java.net.DatagramSocket();
    }

    @Override // com.lyft.kronos.internal.ntp.DatagramFactory
    public final java.net.DatagramPacket createPacket(byte[] buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return new java.net.DatagramPacket(buffer, buffer.length);
    }

    @Override // com.lyft.kronos.internal.ntp.DatagramFactory
    public final java.net.DatagramPacket createPacket(byte[] buffer, java.net.InetAddress address, int port) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new java.net.DatagramPacket(buffer, buffer.length, address, port);
    }
}
