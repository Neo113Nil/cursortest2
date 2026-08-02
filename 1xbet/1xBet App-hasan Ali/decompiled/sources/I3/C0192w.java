package I3;

/* renamed from: I3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0192w extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        try {
            return Long.valueOf(aVar.A());
        } catch (NumberFormatException e3) {
            throw new F3.p(e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.n();
        } else {
            bVar.v(number.longValue());
        }
    }
}
