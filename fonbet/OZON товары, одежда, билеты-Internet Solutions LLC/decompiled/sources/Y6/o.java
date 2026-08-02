package Y6;

import B90.C2602d;
import B90.d0;
import S6.r;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34694a;

    /* renamed from: b, reason: collision with root package name */
    private final Z6.d f34695b;

    /* renamed from: c, reason: collision with root package name */
    private final q f34696c;

    /* renamed from: d, reason: collision with root package name */
    private final a7.b f34697d;

    o(Executor executor, Z6.d dVar, q qVar, a7.b bVar) {
        this.f34694a = executor;
        this.f34695b = dVar;
        this.f34696c = qVar;
        this.f34697d = bVar;
    }

    public static /* synthetic */ void a(o oVar) {
        Iterator<r> it = oVar.f34695b.Z0().iterator();
        while (it.hasNext()) {
            oVar.f34696c.a(it.next(), 1);
        }
    }

    public static /* synthetic */ void b(o oVar) {
        oVar.getClass();
        oVar.f34697d.c(new C2602d(oVar));
    }

    public final void c() {
        this.f34694a.execute(new d0(this, 1));
    }
}
