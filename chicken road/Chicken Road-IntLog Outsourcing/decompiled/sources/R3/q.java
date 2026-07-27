package R3;

import a3.C0182a;
import b2.AbstractC0279e;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class q extends a implements X2.j {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f2644d = Logger.getLogger(q.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final L3.n f2645b;

    /* renamed from: c, reason: collision with root package name */
    public final t f2646c;

    public q(V3.b bVar, t tVar) {
        super(bVar);
        this.f2645b = new L3.n(f2644d);
        this.f2646c = tVar;
    }

    @Override // X2.j
    public final void g(double d6, Q2.c cVar) {
        C0182a a6 = C0182a.a();
        if (d6 >= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            this.f2646c.a(d6, cVar, a6);
            return;
        }
        this.f2645b.a(Level.WARNING, AbstractC0279e.h(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.f2622a.f3245b, " has recorded a negative value."), null);
    }
}
