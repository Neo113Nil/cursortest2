package I3;

/* loaded from: classes.dex */
public class E extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() != 9) {
            return new StringBuilder(aVar.I());
        }
        aVar.G();
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        bVar.E(sb == null ? null : sb.toString());
    }
}
