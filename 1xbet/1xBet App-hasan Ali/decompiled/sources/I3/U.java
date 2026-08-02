package I3;

/* loaded from: classes.dex */
public class U extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        int K = aVar.K();
        if (K != 9) {
            return K == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.I())) : Boolean.valueOf(aVar.s());
        }
        aVar.G();
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            bVar.n();
            return;
        }
        bVar.G();
        bVar.b();
        bVar.f3781k.write(bool.booleanValue() ? "true" : "false");
    }
}
