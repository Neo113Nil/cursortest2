package w4;

import B.v;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.support.v4.media.session.t;
import android.util.Base64;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.internal.w;
import e1.k;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import l4.y;
import w1.C1759x1;
import w1.L;
import z5.C1820b;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1777c {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f18048l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f18049m = Charset.forName("UTF-8");

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f18050n = Executors.defaultThreadFactory();

    /* renamed from: o, reason: collision with root package name */
    public static final C1820b f18051o = new C1820b();

    /* renamed from: a, reason: collision with root package name */
    public volatile int f18052a = 1;

    /* renamed from: b, reason: collision with root package name */
    public volatile Socket f18053b = null;

    /* renamed from: c, reason: collision with root package name */
    public w f18054c = null;

    /* renamed from: d, reason: collision with root package name */
    public final URI f18055d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18056e;

    /* renamed from: f, reason: collision with root package name */
    public final C1779e f18057f;

    /* renamed from: g, reason: collision with root package name */
    public final C1780f f18058g;

    /* renamed from: h, reason: collision with root package name */
    public final C1759x1 f18059h;

    /* renamed from: i, reason: collision with root package name */
    public final t f18060i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final Thread f18061k;

    public C1777c(A0.b bVar, URI uri, HashMap hashMap) {
        int incrementAndGet = f18048l.incrementAndGet();
        this.j = incrementAndGet;
        this.f18061k = f18050n.newThread(new b1(this, 16));
        this.f18055d = uri;
        this.f18056e = (String) bVar.f26h;
        this.f18060i = new t((v) bVar.f24f, "WebSocket", k.d(incrementAndGet, "sk_"), 24);
        C1759x1 c1759x1 = new C1759x1(24, false);
        c1759x1.f17926c = null;
        c1759x1.f17925b = uri;
        c1759x1.f17927d = hashMap;
        byte[] bArr = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            bArr[i7] = (byte) ((Math.random() * 255) + 0);
        }
        c1759x1.f17926c = Base64.encodeToString(bArr, 2);
        this.f18059h = c1759x1;
        C1779e c1779e = new C1779e();
        c1779e.f18062a = null;
        c1779e.f18063b = null;
        c1779e.f18064c = null;
        c1779e.f18065d = new byte[112];
        c1779e.f18067f = false;
        c1779e.f18063b = this;
        this.f18057f = c1779e;
        this.f18058g = new C1780f(this, this.j);
    }

    public final synchronized void a() {
        int e7 = t.e.e(this.f18052a);
        if (e7 == 0) {
            this.f18052a = 5;
            return;
        }
        if (e7 == 1) {
            b();
            return;
        }
        if (e7 != 2) {
            if (e7 != 3) {
                if (e7 != 4) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        try {
            this.f18052a = 4;
            this.f18058g.f18070c = true;
            this.f18058g.b((byte) 8, new byte[0]);
        } catch (IOException e8) {
            this.f18054c.J(new C1778d("Failed to send close frame", e8));
        }
    }

    public final synchronized void b() {
        if (this.f18052a == 5) {
            return;
        }
        this.f18057f.f18067f = true;
        this.f18058g.f18070c = true;
        if (this.f18053b != null) {
            try {
                this.f18053b.close();
            } catch (Exception e7) {
                this.f18054c.J(new C1778d("Failed to close", e7));
            }
        }
        this.f18052a = 5;
        w wVar = this.f18054c;
        ((y) wVar.f11336c).f15028i.execute(new l4.w(wVar, 1));
    }

    public final synchronized void c() {
        if (this.f18052a != 1) {
            this.f18054c.J(new C1778d("connect() already called"));
            a();
            return;
        }
        C1820b c1820b = f18051o;
        Thread thread = this.f18061k;
        String str = "TubeSockReader-" + this.j;
        c1820b.getClass();
        thread.setName(str);
        this.f18052a = 2;
        this.f18061k.start();
    }

    public final Socket d() {
        URI uri = this.f18055d;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e7) {
                throw new C1778d(L.i("unknown host: ", host), e7);
            } catch (IOException e8) {
                throw new C1778d("error while creating socket to " + uri, e8);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new C1778d(L.i("unsupported protocol: ", scheme));
        }
        if (port == -1) {
            port = 443;
        }
        SSLSessionCache sSLSessionCache = null;
        String str = this.f18056e;
        if (str != null) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(str));
            } catch (IOException e9) {
                this.f18060i.W(e9, "Failed to initialize SSL session cache", new Object[0]);
            }
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new C1778d("Error while verifying secure socket to " + uri);
        } catch (UnknownHostException e10) {
            throw new C1778d(L.i("unknown host: ", host), e10);
        } catch (IOException e11) {
            throw new C1778d("error while creating secure socket to " + uri, e11);
        }
    }

    public final synchronized void e(byte b7, byte[] bArr) {
        if (this.f18052a != 3) {
            this.f18054c.J(new C1778d("error while sending data: not connected"));
        } else {
            try {
                this.f18058g.b(b7, bArr);
            } catch (IOException e7) {
                this.f18054c.J(new C1778d("Failed to send frame", e7));
                a();
            }
        }
    }
}
