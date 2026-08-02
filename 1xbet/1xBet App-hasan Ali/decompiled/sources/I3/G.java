package I3;

/* loaded from: classes.dex */
public class G extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() != 9) {
            return new StringBuffer(aVar.I());
        }
        aVar.G();
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        StringBuffer stringBuffer = (StringBuffer) obj;
        bVar.E(stringBuffer == null ? null : stringBuffer.toString());
    }
}
