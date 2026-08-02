package I3;

import a3.AbstractC0467k;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class B extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        String I5 = aVar.I();
        try {
            return H3.d.i(I5);
        } catch (NumberFormatException e3) {
            StringBuilder w5 = AbstractC0467k.w("Failed parsing '", I5, "' as BigDecimal; at path ");
            w5.append(aVar.m(true));
            throw new F3.p(w5.toString(), e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        bVar.A((BigDecimal) obj);
    }
}
