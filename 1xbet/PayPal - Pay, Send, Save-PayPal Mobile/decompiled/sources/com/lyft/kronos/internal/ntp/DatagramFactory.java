package com.lyft.kronos.internal.ntp;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/lyft/kronos/internal/ntp/DatagramFactory;", "", "", "buffer", "Ljava/net/DatagramPacket;", "createPacket", "([B)Ljava/net/DatagramPacket;", "Ljava/net/InetAddress;", "address", "", "port", "([BLjava/net/InetAddress;I)Ljava/net/DatagramPacket;", "Ljava/net/DatagramSocket;", "createSocket", "()Ljava/net/DatagramSocket;"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public interface DatagramFactory {
    java.net.DatagramPacket createPacket(byte[] buffer);

    java.net.DatagramPacket createPacket(byte[] buffer, java.net.InetAddress address, int port);

    java.net.DatagramSocket createSocket() throws java.net.SocketException;
}
