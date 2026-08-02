package I3;

import a3.AbstractC0467k;

/* renamed from: I3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0195z extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        String I5 = aVar.I();
        if (I5.length() == 1) {
            return Character.valueOf(I5.charAt(0));
        }
        StringBuilder w5 = AbstractC0467k.w("Expecting character, got: ", I5, "; at ");
        w5.append(aVar.m(true));
        throw new F3.p(w5.toString());
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Character ch = (Character) obj;
        bVar.E(ch == null ? null : String.valueOf(ch));
    }
}
