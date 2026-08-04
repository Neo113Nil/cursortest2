package p146u2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0948g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MulticastSocket f16762A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InetAddress f16763B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f16764C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f16765D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f16767f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DatagramPacket f16768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Uri f16769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public DatagramSocket f16770z;

    public W() {
        super(true);
        this.f16766e = 8000;
        byte[] bArr = new byte[2000];
        this.f16767f = bArr;
        this.f16768x = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        this.f16769y = null;
        MulticastSocket multicastSocket = this.f16762A;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f16763B;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f16762A = null;
        }
        DatagramSocket datagramSocket = this.f16770z;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f16770z = null;
        }
        this.f16763B = null;
        this.f16765D = 0;
        if (this.f16764C) {
            this.f16764C = false;
            e();
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) throws V {
        Uri uri = c0958q.f16814a;
        this.f16769y = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f16769y.getPort();
        f();
        try {
            this.f16763B = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f16763B, port);
            if (this.f16763B.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f16762A = multicastSocket;
                multicastSocket.joinGroup(this.f16763B);
                this.f16770z = this.f16762A;
            } else {
                this.f16770z = new DatagramSocket(inetSocketAddress);
            }
            this.f16770z.setSoTimeout(this.f16766e);
            this.f16764C = true;
            g(c0958q);
            return -1L;
        } catch (IOException e7) {
            throw new V(e7, 2001);
        } catch (SecurityException e8) {
            throw new V(e8, 2006);
        }
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws V {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f16765D;
        DatagramPacket datagramPacket = this.f16768x;
        if (i9 == 0) {
            try {
                DatagramSocket datagramSocket = this.f16770z;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f16765D = length;
                b(length);
            } catch (SocketTimeoutException e7) {
                throw new V(e7, 2002);
            } catch (IOException e8) {
                throw new V(e8, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i10 = this.f16765D;
        int iMin = Math.min(i10, i8);
        System.arraycopy(this.f16767f, length2 - i10, bArr, i7, iMin);
        this.f16765D -= iMin;
        return iMin;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f16769y;
    }
}
