package I3;

/* loaded from: classes.dex */
public class V extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() != 9) {
            return Boolean.valueOf(aVar.I());
        }
        aVar.G();
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        bVar.E(bool == null ? "null" : bool.toString());
    }
}
