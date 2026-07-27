package Y3;

import L3.n;
import X2.u;
import b2.AbstractC0279e;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e implements u {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f3703d = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f3704a = new n(f3703d);

    /* renamed from: b, reason: collision with root package name */
    public final V3.b f3705b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3706c;

    public e(V3.b bVar, ArrayList arrayList) {
        this.f3705b = bVar;
        this.f3706c = arrayList;
    }

    @Override // X2.u
    public final void a() {
        this.f3704a.a(Level.FINE, AbstractC0279e.h(new StringBuilder("Measurement recorded for instrument "), this.f3705b.f3245b, " outside callback registered to instrument. Dropping measurement."), null);
    }
}
