package O4;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import k0.C2023c;

/* renamed from: O4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0268n implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4215k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4216l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4217m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4218n;

    public /* synthetic */ RunnableC0268n(Object obj, Object obj2, Object obj3, int i) {
        this.f4215k = i;
        this.f4216l = obj;
        this.f4217m = obj2;
        this.f4218n = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4215k) {
            case 0:
                C0269o c0269o = (C0269o) ((G.v) this.f4216l).f1750m;
                boolean h3 = c0269o.f4220l.h();
                InterfaceC0262h interfaceC0262h = (InterfaceC0262h) this.f4217m;
                if (h3) {
                    interfaceC0262h.h(c0269o, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC0262h.a(c0269o, (S) this.f4218n);
                    return;
                }
            case 1:
                ((InterfaceC0262h) this.f4217m).h((C0269o) ((G.v) this.f4216l).f1750m, (Throwable) this.f4218n);
                return;
            default:
                C2023c c2023c = (C2023c) this.f4216l;
                v1.j jVar = (v1.j) this.f4217m;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4218n;
                c2023c.getClass();
                try {
                    v1.r b3 = v1.d.b((Context) c2023c.f17544l);
                    if (b3 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    v1.q qVar = (v1.q) b3.f20371a;
                    synchronized (qVar.f20365n) {
                        qVar.f20367p = threadPoolExecutor;
                    }
                    b3.f20371a.f(new v1.l(jVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    jVar.c(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
