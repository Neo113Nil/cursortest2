package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.vC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689vC extends Lt {

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f15972o;

    /* renamed from: p, reason: collision with root package name */
    public final DatagramPacket f15973p;

    /* renamed from: q, reason: collision with root package name */
    public Uri f15974q;

    /* renamed from: r, reason: collision with root package name */
    public DatagramSocket f15975r;

    /* renamed from: s, reason: collision with root package name */
    public MulticastSocket f15976s;

    /* renamed from: t, reason: collision with root package name */
    public InetAddress f15977t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15978u;

    /* renamed from: v, reason: collision with root package name */
    public int f15979v;

    public C1689vC() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f15972o = bArr;
        this.f15973p = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        Uri uri = ww.f12125a;
        this.f15974q = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f15974q.getPort();
        g(ww);
        try {
            this.f15977t = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f15977t, port);
            if (this.f15977t.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f15976s = multicastSocket;
                multicastSocket.joinGroup(this.f15977t);
                this.f15975r = this.f15976s;
            } else {
                this.f15975r = new DatagramSocket(inetSocketAddress);
            }
            this.f15975r.setSoTimeout(8000);
            this.f15978u = true;
            k(ww);
            return -1L;
        } catch (IOException e3) {
            throw new C0927eC(2001, e3);
        } catch (SecurityException e5) {
            throw new C0927eC(2006, e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f15979v;
        DatagramPacket datagramPacket = this.f15973p;
        if (i6 == 0) {
            try {
                DatagramSocket datagramSocket = this.f15975r;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f15979v = length;
                B(length);
            } catch (SocketTimeoutException e3) {
                throw new C0927eC(2002, e3);
            } catch (IOException e5) {
                throw new C0927eC(2001, e5);
            }
        }
        int length2 = datagramPacket.getLength();
        int i7 = this.f15979v;
        int min = Math.min(i7, i5);
        System.arraycopy(this.f15972o, length2 - i7, bArr, i, min);
        this.f15979v -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f15974q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        InetAddress inetAddress;
        this.f15974q = null;
        MulticastSocket multicastSocket = this.f15976s;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f15977t;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f15976s = null;
        }
        DatagramSocket datagramSocket = this.f15975r;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f15975r = null;
        }
        this.f15977t = null;
        this.f15979v = 0;
        if (this.f15978u) {
            this.f15978u = false;
            f();
        }
    }
}
