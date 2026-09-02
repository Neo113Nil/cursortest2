package o1;

import P.B;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class p extends j1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6314b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6315c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, t tVar) {
        super("OkHttp %s", rVar.f6322d);
        this.f6315c = rVar;
        this.f6316d = tVar;
    }

    @Override // j1.a
    public final void a() {
        Object obj = this.f6316d;
        Object obj2 = this.f6315c;
        switch (this.f6314b) {
            case 0:
                w wVar = (w) obj;
                p pVar = (p) obj2;
                try {
                    ((r) pVar.f6315c).f6320b.b(wVar);
                    return;
                } catch (IOException e2) {
                    p1.g.f6437a.l(4, "Http2Connection.Listener failure for " + ((r) pVar.f6315c).f6322d, e2);
                    try {
                        wVar.c(2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                p pVar2 = (p) obj2;
                try {
                    ((r) pVar2.f6315c).f6336r.a((B) obj);
                    return;
                } catch (IOException unused2) {
                    r rVar = (r) pVar2.f6315c;
                    ThreadPoolExecutor threadPoolExecutor = r.f6318u;
                    rVar.b();
                    return;
                }
            default:
                r rVar2 = (r) obj2;
                t tVar = (t) obj;
                try {
                    try {
                        tVar.g(this);
                        do {
                        } while (tVar.b(false, this));
                        rVar2.a(1, 6);
                    } catch (IOException unused3) {
                        rVar2.a(2, 2);
                    } catch (Throwable th) {
                        try {
                            rVar2.a(3, 3);
                        } catch (IOException unused4) {
                        }
                        j1.d.c(tVar);
                        throw th;
                    }
                } catch (IOException unused5) {
                }
                j1.d.c(tVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p pVar, Object[] objArr, w wVar) {
        super("OkHttp %s stream %d", objArr);
        this.f6315c = pVar;
        this.f6316d = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p pVar, Object[] objArr, B b2) {
        super("OkHttp %s ACK Settings", objArr);
        this.f6315c = pVar;
        this.f6316d = b2;
    }
}
