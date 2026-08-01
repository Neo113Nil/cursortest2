package sg.bigo.ads.z0;

import android.content.Context;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.q0.HandlerC5438b;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5502b;
import sg.bigo.ads.x0.C5508h;
import sg.bigo.ads.y0.AbstractRunnableC5522h;
import sg.bigo.ads.y0.C5518d;

/* renamed from: sg.bigo.ads.z0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5532g {

    /* renamed from: a, reason: collision with root package name */
    public final HttpEngine f13433a;
    public final C5518d b = new C5518d();
    public final sg.bigo.ads.U.h c;
    public final HandlerC5438b d;

    public C5532g(Context context, sg.bigo.ads.U.h hVar) {
        this.c = hVar;
        this.f13433a = new HttpEngine.Builder(context).build();
        HandlerThread handlerThread = new HandlerThread("BGAd-HttpEngine", 0);
        handlerThread.start();
        this.d = new HandlerC5438b("BGAd-HttpEngine", handlerThread.getLooper());
    }

    public final void a(sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c) {
        Executor executor = cVar.c;
        if (executor == null) {
            executor = AbstractRunnableC5522h.b();
        }
        Executor executor2 = executor;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference();
        RunnableC5526a runnableC5526a = new RunnableC5526a(atomicBoolean, cVar, atomicReference, abstractC5503c);
        AbstractC5446j.a(3, new RunnableC5528c(cVar, abstractC5503c), new RunnableC5529d(this, cVar, abstractC5503c, new C5527b(this, runnableC5526a, atomicBoolean, abstractC5503c), executor2, atomicReference, runnableC5526a), 0L);
    }

    public final void b(sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C5502b c5502b = (C5502b) abstractC5503c;
        C5530e c5530e = new C5530e(countDownLatch, atomicBoolean, c5502b);
        Executor executor = cVar.c;
        if (executor == null) {
            executor = AbstractRunnableC5522h.b();
        }
        C5531f a2 = a(cVar, abstractC5503c, c5530e, executor);
        try {
            if (countDownLatch.await(cVar.d, TimeUnit.MILLISECONDS)) {
                return;
            }
            AbstractC5496a.a("HttpEngineNetClient", "sync request timed out: " + cVar.b.a());
            if (a2 != null) {
                a2.b.a(new C5508h(701, "sync request timed out"));
                a2.f13432a.cancel();
            }
            ((C5502b) abstractC5503c).c = new C5508h(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD, "sync request timed out");
            atomicBoolean.compareAndSet(false, true);
        } catch (Throwable th) {
            if (a2 != null) {
                a2.b.a(new C5508h(700, th.getMessage()));
                a2.f13432a.cancel();
            }
            c5502b.c = new C5508h(700, "error: " + th.getMessage());
            atomicBoolean.compareAndSet(false, true);
        }
    }

    public final C5531f a(sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c, InterfaceC5535j interfaceC5535j, Executor executor) {
        try {
            C5534i c5534i = new C5534i(cVar, this.c);
            C5536k c5536k = new C5536k(c5534i, abstractC5503c, this.b, interfaceC5535j);
            UrlRequest a2 = c5534i.a(this.f13433a, executor, c5536k);
            a2.start();
            return new C5531f(a2, c5536k);
        } catch (Throwable th) {
            AbstractC5496a.a("HttpEngineNetClient", "performRequest error: " + th.getMessage());
            abstractC5503c.a(cVar, new C5508h(700, th.getMessage()));
            if (interfaceC5535j == null) {
                return null;
            }
            interfaceC5535j.a();
            return null;
        }
    }
}
