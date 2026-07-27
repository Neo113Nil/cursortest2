package sg.bigo.ads.o1;

import android.os.SystemClock;
import com.ironsource.U3;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.n1.n;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class g {
    public final String b;
    public volatile b c;
    public volatile C5115b d;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13230a = new AtomicInteger(0);
    public volatile long e = 0;
    public volatile long f = SystemClock.elapsedRealtime();
    public final AtomicInteger g = new AtomicInteger(0);

    public g(String str) {
        str.getClass();
        this.b = str;
    }

    public final synchronized void a() {
        if (this.f13230a.decrementAndGet() <= 0) {
            this.c.a();
            this.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x0117, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0024, B:9:0x0030, B:11:0x0037, B:14:0x003a, B:16:0x0057, B:19:0x005e, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:26:0x007e, B:28:0x0084, B:29:0x0097, B:63:0x008d, B:65:0x0095), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d A[Catch: all -> 0x0117, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0024, B:9:0x0030, B:11:0x0037, B:14:0x003a, B:16:0x0057, B:19:0x005e, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:26:0x007e, B:28:0x0084, B:29:0x0097, B:63:0x008d, B:65:0x0095), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a aVar, Socket socket) {
        b bVar;
        boolean z;
        C5115b c5115b;
        synchronized (this) {
            if (this.c == null) {
                String str = this.b;
                HashMap hashMap = new HashMap();
                for (String str2 : str.substring(str.indexOf("?") + 1).split(U3.j.c)) {
                    String[] split = str2.split(U3.j.b);
                    if (split.length == 2) {
                        hashMap.put(split[0], split[1]);
                    }
                }
                sg.bigo.ads.f0.h hVar = n.n.h;
                String str3 = (String) hashMap.get("path");
                String str4 = (String) hashMap.get("name");
                hVar.getClass();
                if (!I.a((CharSequence) str3) && !I.a((CharSequence) str4)) {
                    c5115b = sg.bigo.ads.f0.h.a(hVar.f12787a, str3, str4);
                    if (c5115b == null) {
                        c5115b = sg.bigo.ads.f0.h.a(hVar.b, str3, str4);
                    }
                    if (c5115b == null) {
                        c5115b = sg.bigo.ads.f0.h.a(hVar.c, str3, str4);
                    }
                    if (c5115b == null) {
                        c5115b = sg.bigo.ads.f0.h.a(hVar.d, str3, str4);
                    }
                    this.d = c5115b;
                    if (this.d != null) {
                        AbstractC5496a.a("ProxyCache", "downloadInfo = null");
                        bVar = null;
                    } else {
                        bVar = new b(this.d);
                    }
                }
                c5115b = null;
                this.d = c5115b;
                if (this.d != null) {
                }
            } else {
                bVar = this.c;
            }
            this.c = bVar;
            z = this.c != null;
        }
        if (!z) {
            AbstractC5496a.a("ProxyCache", "startProcessRequest failed");
            return;
        }
        try {
            if (SystemClock.elapsedRealtime() - this.f > 300000) {
                this.g.getAndSet(0);
                this.f = SystemClock.elapsedRealtime();
            }
            this.f13230a.incrementAndGet();
            if (this.d != null && this.d.j != 1 && this.d.j != 3 && SystemClock.elapsedRealtime() - this.e > 15000 && this.g.getAndIncrement() < 3) {
                this.g.get();
                this.e = SystemClock.elapsedRealtime();
                AbstractC5446j.a(1, null, new f(this), 0L);
            }
            this.c.a(aVar, socket);
        } finally {
            a();
        }
    }
}
