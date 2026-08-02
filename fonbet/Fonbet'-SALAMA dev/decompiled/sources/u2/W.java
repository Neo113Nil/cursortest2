package u2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class W extends AbstractC1630g {

    /* renamed from: A, reason: collision with root package name */
    public MulticastSocket f16756A;

    /* renamed from: B, reason: collision with root package name */
    public InetAddress f16757B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16758C;

    /* renamed from: D, reason: collision with root package name */
    public int f16759D;

    /* renamed from: e, reason: collision with root package name */
    public final int f16760e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f16761f;

    /* renamed from: x, reason: collision with root package name */
    public final DatagramPacket f16762x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f16763y;

    /* renamed from: z, reason: collision with root package name */
    public DatagramSocket f16764z;

    public W() {
        super(true);
        this.f16760e = 8000;
        byte[] bArr = new byte[2000];
        this.f16761f = bArr;
        this.f16762x = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        this.f16763y = null;
        MulticastSocket multicastSocket = this.f16756A;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f16757B;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f16756A = null;
        }
        DatagramSocket datagramSocket = this.f16764z;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f16764z = null;
        }
        this.f16757B = null;
        this.f16759D = 0;
        if (this.f16758C) {
            this.f16758C = false;
            e();
        }
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        Uri uri = c1640q.f16808a;
        this.f16763y = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f16763y.getPort();
        f();
        try {
            this.f16757B = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f16757B, port);
            if (this.f16757B.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f16756A = multicastSocket;
                multicastSocket.joinGroup(this.f16757B);
                this.f16764z = this.f16756A;
            } else {
                this.f16764z = new DatagramSocket(inetSocketAddress);
            }
            this.f16764z.setSoTimeout(this.f16760e);
            this.f16758C = true;
            g(c1640q);
            return -1L;
        } catch (IOException e7) {
            throw new V(e7, 2001);
        } catch (SecurityException e8) {
            throw new V(e8, 2006);
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f16759D;
        DatagramPacket datagramPacket = this.f16762x;
        if (i9 == 0) {
            try {
                DatagramSocket datagramSocket = this.f16764z;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f16759D = length;
                b(length);
            } catch (SocketTimeoutException e7) {
                throw new V(e7, 2002);
            } catch (IOException e8) {
                throw new V(e8, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i10 = this.f16759D;
        int min = Math.min(i10, i8);
        System.arraycopy(this.f16761f, length2 - i10, bArr, i7, min);
        this.f16759D -= min;
        return min;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f16763y;
    }
}
