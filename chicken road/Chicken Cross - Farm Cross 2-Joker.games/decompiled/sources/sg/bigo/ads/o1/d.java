package sg.bigo.ads.o1;

import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f13227a;
    public final /* synthetic */ e b;

    public d(e eVar, CountDownLatch countDownLatch) {
        this.b = eVar;
        this.f13227a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13227a.countDown();
        e eVar = this.b;
        eVar.getClass();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = eVar.d.accept();
                Objects.toString(accept);
                C5447k c5447k = eVar.b;
                c5447k.getClass();
                c5447k.submit(new c(eVar, accept));
            } catch (Throwable th) {
                sg.bigo.ads.s1.b.a(3005, 10111, th.toString(), (sg.bigo.ads.P.c) null);
                AbstractC5496a.a("ProxyCache", "Error during waiting connection, error message is : " + th.toString());
                return;
            }
        }
    }
}
