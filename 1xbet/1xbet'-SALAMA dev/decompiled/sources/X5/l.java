package X5;

import U5.l0;
import W5.C0556y0;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z5.g f7560b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f7562d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2 f7559a = new P2(Level.FINE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7561c = true;

    public l(m mVar, Z5.g gVar) {
        this.f7562d = mVar;
        this.f7560b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        l0 l0VarG;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f7560b.a(this)) {
            try {
                C0556y0 c0556y0 = this.f7562d.f7570F;
                if (c0556y0 != null) {
                    c0556y0.a();
                }
            } catch (Throwable th) {
                try {
                    m mVar2 = this.f7562d;
                    Z5.a aVar = Z5.a.PROTOCOL_ERROR;
                    l0 l0VarF = l0.f6543m.g("error in frame handler").f(th);
                    Map map = m.f7563P;
                    mVar2.s(0, aVar, l0VarF);
                    try {
                        this.f7560b.close();
                    } catch (IOException e7) {
                        m.f7564Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e7);
                    } catch (RuntimeException e8) {
                        if (!"bio == null".equals(e8.getMessage())) {
                            throw e8;
                        }
                    }
                    mVar = this.f7562d;
                } catch (Throwable th2) {
                    try {
                        this.f7560b.close();
                    } catch (IOException e9) {
                        m.f7564Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e9);
                    } catch (RuntimeException e10) {
                        if (!"bio == null".equals(e10.getMessage())) {
                            throw e10;
                        }
                    }
                    this.f7562d.f7587h.l();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (this.f7562d.f7589k) {
            l0VarG = this.f7562d.f7600v;
        }
        if (l0VarG == null) {
            l0VarG = l0.f6544n.g("End of stream or IOException");
        }
        this.f7562d.s(0, Z5.a.INTERNAL_ERROR, l0VarG);
        try {
            this.f7560b.close();
        } catch (IOException e11) {
            m.f7564Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
        } catch (RuntimeException e12) {
            if (!"bio == null".equals(e12.getMessage())) {
                throw e12;
            }
        }
        mVar = this.f7562d;
        mVar.f7587h.l();
        Thread.currentThread().setName(name);
    }
}
