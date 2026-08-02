package X6;

import B4.V;
import S6.m;
import S6.r;
import S6.u;
import Y6.q;
import a7.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public final class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f34128f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final q f34129a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f34130b;

    /* renamed from: c, reason: collision with root package name */
    private final T6.e f34131c;

    /* renamed from: d, reason: collision with root package name */
    private final Z6.d f34132d;

    /* renamed from: e, reason: collision with root package name */
    private final a7.b f34133e;

    public c(Executor executor, T6.e eVar, q qVar, Z6.d dVar, a7.b bVar) {
        this.f34130b = executor;
        this.f34131c = eVar;
        this.f34129a = qVar;
        this.f34132d = dVar;
        this.f34133e = bVar;
    }

    public static /* synthetic */ void b(c cVar, r rVar, m mVar) {
        cVar.f34132d.p0(rVar, mVar);
        cVar.f34129a.a(rVar, 1);
    }

    public static /* synthetic */ void c(final c cVar, final r rVar, V v11, m mVar) {
        cVar.getClass();
        Logger logger = f34128f;
        try {
            T6.m mVar2 = cVar.f34131c.get(rVar.b());
            if (mVar2 != null) {
                final m b11 = mVar2.b(mVar);
                cVar.f34133e.c(new b.a() { // from class: X6.b
                    @Override // a7.b.a
                    public final Object execute() {
                        c.b(c.this, rVar, b11);
                        return null;
                    }
                });
                return;
            }
            String str = "Transport backend '" + rVar.b() + "' is not registered";
            logger.warning(str);
            new IllegalArgumentException(str);
        } catch (Exception e11) {
            logger.warning("Error scheduling event " + e11.getMessage());
        }
    }

    @Override // X6.e
    public final void a(final r rVar, final m mVar, final V v11) {
        this.f34130b.execute(new Runnable() { // from class: X6.a
            @Override // java.lang.Runnable
            public final void run() {
                V v12 = v11;
                m mVar2 = mVar;
                c.c(c.this, rVar, v12, mVar2);
            }
        });
    }
}
