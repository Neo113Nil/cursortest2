package p158w4;

import B.v;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.support.v4.media.session.t;
import android.util.Base64;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.internal.w;
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
import p031e1.k;
import p083l4.y;
import p136t.e;
import p155w1.C1050x1;
import p155w1.L;
import p174z5.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f18054l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Charset f18055m = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f18056n = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f18057o = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f18058a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Socket f18059b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f18060c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URI f18061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f18063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f18064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1050x1 f18065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f18066i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Thread f18067k;

    public c(A0.b bVar, URI uri, HashMap map) {
        int iIncrementAndGet = f18054l.incrementAndGet();
        this.j = iIncrementAndGet;
        this.f18067k = f18056n.newThread(new b1(this, 16));
        this.f18061d = uri;
        this.f18062e = (String) bVar.f26h;
        this.f18066i = new t((v) bVar.f24f, "WebSocket", k.d(iIncrementAndGet, "sk_"), 24);
        C1050x1 c1050x1 = new C1050x1(24, false);
        c1050x1.f17932c = null;
        c1050x1.f17931b = uri;
        c1050x1.f17933d = map;
        byte[] bArr = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            bArr[i7] = (byte) ((Math.random() * ((double) 255)) + ((double) 0));
        }
        c1050x1.f17932c = Base64.encodeToString(bArr, 2);
        this.f18065h = c1050x1;
        e eVar = new e();
        eVar.f18068a = null;
        eVar.f18069b = null;
        eVar.f18070c = null;
        eVar.f18071d = new byte[112];
        eVar.f18073f = false;
        eVar.f18069b = this;
        this.f18063f = eVar;
        this.f18064g = new f(this, this.j);
    }

    public final synchronized void a() {
        try {
            int iE = e.e(this.f18058a);
            if (iE == 0) {
                this.f18058a = 5;
                return;
            }
            if (iE == 1) {
                b();
                return;
            }
            if (iE != 2) {
                if (iE != 3) {
                    if (iE != 4) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            try {
                this.f18058a = 4;
                this.f18064g.f18076c = true;
                this.f18064g.b((byte) 8, new byte[0]);
            } catch (IOException e7) {
                this.f18060c.J(new d("Failed to send close frame", e7));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        if (this.f18058a == 5) {
            return;
        }
        this.f18063f.f18073f = true;
        this.f18064g.f18076c = true;
        if (this.f18059b != null) {
            try {
                this.f18059b.close();
            } catch (Exception e7) {
                this.f18060c.J(new d("Failed to close", e7));
            }
        }
        this.f18058a = 5;
        w wVar = this.f18060c;
        ((y) wVar.f11336c).f15034i.execute(new p083l4.w(wVar, 1));
    }

    public final synchronized void c() {
        if (this.f18058a != 1) {
            this.f18060c.J(new d("connect() already called"));
            a();
            return;
        }
        b bVar = f18057o;
        Thread thread = this.f18067k;
        String str = "TubeSockReader-" + this.j;
        bVar.getClass();
        thread.setName(str);
        this.f18058a = 2;
        this.f18067k.start();
    }

    public final Socket d() {
        URI uri = this.f18061d;
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
                throw new d(L.i("unknown host: ", host), e7);
            } catch (IOException e8) {
                throw new d("error while creating socket to " + uri, e8);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new d(L.i("unsupported protocol: ", scheme));
        }
        if (port == -1) {
            port = 443;
        }
        SSLSessionCache sSLSessionCache = null;
        String str = this.f18062e;
        if (str != null) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(str));
            } catch (IOException e9) {
                this.f18066i.W(e9, "Failed to initialize SSL session cache", new Object[0]);
            }
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new d("Error while verifying secure socket to " + uri);
        } catch (UnknownHostException e10) {
            throw new d(L.i("unknown host: ", host), e10);
        } catch (IOException e11) {
            throw new d("error while creating secure socket to " + uri, e11);
        }
    }

    public final synchronized void e(byte b7, byte[] bArr) {
        try {
            if (this.f18058a != 3) {
                this.f18060c.J(new d("error while sending data: not connected"));
            } else {
                try {
                    this.f18064g.b(b7, bArr);
                } catch (IOException e7) {
                    this.f18060c.J(new d("Failed to send frame", e7));
                    a();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
