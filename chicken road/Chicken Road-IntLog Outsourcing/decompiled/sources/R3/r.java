package R3;

import a3.C0182a;
import b2.AbstractC0279e;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class r extends a implements X2.l {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f2647d = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final L3.n f2648b;

    /* renamed from: c, reason: collision with root package name */
    public final t f2649c;

    public r(V3.b bVar, t tVar) {
        super(bVar);
        this.f2648b = new L3.n(f2647d);
        this.f2649c = tVar;
    }

    @Override // X2.l
    public final void d(long j2, Q2.c cVar) {
        C0182a a6 = C0182a.a();
        if (j2 >= 0) {
            this.f2649c.b(j2, cVar, a6);
            return;
        }
        this.f2648b.a(Level.WARNING, AbstractC0279e.h(new StringBuilder("Counters can only increase. Instrument "), this.f2622a.f3245b, " has recorded a negative value."), null);
    }
}
