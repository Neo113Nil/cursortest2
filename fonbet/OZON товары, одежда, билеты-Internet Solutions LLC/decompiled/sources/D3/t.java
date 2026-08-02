package D3;

import B90.Y;
import D3.m;
import D3.q;
import j3.C7250F;
import j3.C7275q;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import m3.AbstractRunnableFutureC8051D;
import m3.N;
import p3.i;
import q3.InterfaceC8980a;
import q3.c;

/* loaded from: classes8.dex */
public final class t implements q {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f5724a;

    /* renamed from: b, reason: collision with root package name */
    final p3.i f5725b;

    /* renamed from: c, reason: collision with root package name */
    private final q3.c f5726c;

    /* renamed from: d, reason: collision with root package name */
    private final q3.i f5727d;

    /* renamed from: e, reason: collision with root package name */
    private q.a f5728e;

    /* renamed from: f, reason: collision with root package name */
    private volatile AbstractRunnableFutureC8051D<Void, IOException> f5729f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f5730g;

    final class a extends AbstractRunnableFutureC8051D<Void, IOException> {
        a() {
        }

        @Override // m3.AbstractRunnableFutureC8051D
        protected final void d() {
            t.this.f5727d.b();
        }

        @Override // m3.AbstractRunnableFutureC8051D
        protected final Void e() throws Exception {
            t.this.f5727d.a();
            return null;
        }
    }

    public t(C7275q c7275q, c.a aVar, ExecutorService executorService, long j11, long j12) {
        executorService.getClass();
        this.f5724a = executorService;
        C7275q.f fVar = c7275q.f69184b;
        fVar.getClass();
        i.a aVar2 = new i.a();
        aVar2.i(fVar.f69240a);
        aVar2.f(fVar.f69244e);
        aVar2.b(4);
        aVar2.h(j11);
        aVar2.g(j12);
        p3.i a11 = aVar2.a();
        this.f5725b = a11;
        q3.c b11 = aVar.b();
        this.f5726c = b11;
        this.f5727d = new q3.i(b11, a11, null, new Y(this));
    }

    public static void b(t tVar, long j11, long j12) {
        if (tVar.f5728e == null) {
            return;
        }
        float U10 = (j11 == -1 || j11 == 0) ? -1.0f : N.U(j12, j11);
        q.a aVar = tVar.f5728e;
        aVar.getClass();
        ((m.d) aVar).a(j11, j12, U10);
    }

    @Override // D3.q
    public final void a(q.a aVar) throws IOException, InterruptedException {
        this.f5728e = aVar;
        boolean z11 = false;
        while (!z11) {
            try {
                if (this.f5730g) {
                    break;
                }
                this.f5729f = new a();
                this.f5724a.execute(this.f5729f);
                try {
                    this.f5729f.get();
                    z11 = true;
                } catch (ExecutionException e11) {
                    Throwable cause = e11.getCause();
                    cause.getClass();
                    if (!(cause instanceof C7250F)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i11 = N.f74289a;
                        throw cause;
                    }
                }
            } finally {
                AbstractRunnableFutureC8051D<Void, IOException> abstractRunnableFutureC8051D = this.f5729f;
                abstractRunnableFutureC8051D.getClass();
                abstractRunnableFutureC8051D.b();
            }
        }
    }

    @Override // D3.q
    public final void cancel() {
        this.f5730g = true;
        AbstractRunnableFutureC8051D<Void, IOException> abstractRunnableFutureC8051D = this.f5729f;
        if (abstractRunnableFutureC8051D != null) {
            abstractRunnableFutureC8051D.cancel(true);
        }
    }

    @Override // D3.q
    public final void remove() {
        q3.c cVar = this.f5726c;
        InterfaceC8980a j11 = cVar.j();
        q3.q qVar = (q3.q) j11;
        qVar.b(((Pk0.f) cVar.k()).a(this.f5725b));
    }
}
