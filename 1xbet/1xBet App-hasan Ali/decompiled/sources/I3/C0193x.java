package I3;

/* renamed from: I3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0193x extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() != 9) {
            return Float.valueOf((float) aVar.t());
        }
        aVar.G();
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.n();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        bVar.A(number);
    }
}
