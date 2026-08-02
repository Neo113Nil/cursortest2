package I3;

/* renamed from: I3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0194y extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() != 9) {
            return Double.valueOf(aVar.t());
        }
        aVar.G();
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.n();
        } else {
            bVar.t(number.doubleValue());
        }
    }
}
