package sg.bigo.ads.o1;

import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13228a = new Object();
    public final C5447k b = new C5447k(3, 0, "Play");
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ServerSocket d;
    public final int e;
    public final k f;

    public e() {
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.e = localPort;
            List list = h.d;
            ProxySelector.setDefault(new h(ProxySelector.getDefault(), localPort));
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new d(this, countDownLatch));
            thread.setName("BGAd-Conn");
            thread.start();
            countDownLatch.await();
            this.f = new k(localPort);
            b();
        } catch (IOException | InterruptedException e) {
            C5447k c5447k = this.b;
            c5447k.getClass();
            c5447k.shutdown();
            sg.bigo.ads.s1.b.a(3005, 10110, "Error starting local proxy server, error message is : " + e.toString(), (sg.bigo.ads.P.c) null);
            AbstractC5496a.a("ProxyCache", "Error starting local proxy server, error message is : " + e.toString());
        }
    }

    public final g a(String str) {
        g gVar;
        synchronized (this.f13228a) {
            gVar = (g) this.c.get(str);
            if (gVar == null) {
                gVar = new g(str);
                this.c.put(str, gVar);
            }
        }
        return gVar;
    }

    public final boolean b() {
        String str;
        k kVar = this.f;
        if (kVar == null) {
            return false;
        }
        int i = 70;
        int i2 = 0;
        while (i2 < 3) {
            try {
            } catch (InterruptedException | ExecutionException unused) {
                str = "Error pinging server due to unexpected error";
                AbstractC5496a.a("ProxyCache", str);
                i2++;
                i *= 2;
            } catch (TimeoutException unused2) {
                str = "Error pinging server (attempt: " + i2 + ", timeout: " + i + "). ";
                AbstractC5496a.a("ProxyCache", str);
                i2++;
                i *= 2;
            }
            if (((Boolean) kVar.f13234a.submit(new j(kVar)).get(i, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i2++;
            i *= 2;
        }
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i / 2);
        List<Proxy> arrayList = new ArrayList<>();
        try {
            arrayList = ProxySelector.getDefault().select(new URI("http://" + kVar.b + ServerSentEventKt.COLON + kVar.c + "/ping"));
        } catch (URISyntaxException e) {
            AbstractC5496a.a("ProxyCache", "Pinger#getDefaultProxies, error message is : " + e.toString());
        }
        AbstractC5496a.a("ProxyCache", String.format(locale, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", valueOf, valueOf2, arrayList));
        return false;
    }

    public final void a() {
        synchronized (this.f13228a) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ((g) it.next()).f13230a.get();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(3:2|3|(1:5))|7|8|(1:10)|12|13|(2:15|17)(1:19)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        sg.bigo.ads.w0.AbstractC5496a.a("ProxyCache", "Failed to close socket on proxy side: {}. It seems client have already closed connection." + r1.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: IOException -> 0x0030, TRY_LEAVE, TryCatch #1 {IOException -> 0x0030, blocks: (B:8:0x0026, B:10:0x002c), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: IOException -> 0x0051, TRY_LEAVE, TryCatch #0 {IOException -> 0x0051, blocks: (B:13:0x0047, B:15:0x004d), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Socket socket) {
        String str;
        try {
            try {
                if (!socket.isInputShutdown()) {
                    socket.shutdownInput();
                }
            } catch (SocketException unused) {
                str = "Releasing input stream… Socket is closed by client.";
                AbstractC5496a.a("ProxyCache", str);
                if (!socket.isOutputShutdown()) {
                }
                if (socket.isClosed()) {
                }
            } catch (IOException e) {
                str = "Error closing socket input stream, error message is " + e.getMessage();
                AbstractC5496a.a("ProxyCache", str);
                if (!socket.isOutputShutdown()) {
                }
                if (socket.isClosed()) {
                }
            }
            if (socket.isClosed()) {
                return;
            }
            socket.close();
            return;
        } catch (IOException e2) {
            AbstractC5496a.a("ProxyCache", "Error closing socket" + e2.getMessage());
            return;
        }
        if (!socket.isOutputShutdown()) {
            socket.shutdownOutput();
        }
    }
}
