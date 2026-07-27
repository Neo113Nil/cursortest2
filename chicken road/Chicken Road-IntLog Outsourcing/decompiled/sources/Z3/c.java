package Z3;

import L3.n;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c implements R3.b, T3.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3780a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final n f3781b = new n(Logger.getLogger(c.class.getName()));

    @Override // T3.b
    public final boolean a(V3.b bVar) {
        T3.b bVar2;
        switch (bVar.f3248e.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                bVar2 = h.f3787a;
                break;
            case 2:
                bVar2 = e.f3783b;
                break;
            case 5:
            case 6:
                bVar2 = f.f3785a;
                break;
            default:
                f3781b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + bVar, null);
                bVar2 = d.f3782a;
                break;
        }
        return bVar2.a(bVar);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}
