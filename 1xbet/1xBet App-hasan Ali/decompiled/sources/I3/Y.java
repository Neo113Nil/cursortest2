package I3;

/* loaded from: classes.dex */
public class Y extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        try {
            return Integer.valueOf(aVar.v());
        } catch (NumberFormatException e3) {
            throw new F3.p(e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.n();
        } else {
            bVar.v(r4.intValue());
        }
    }
}
