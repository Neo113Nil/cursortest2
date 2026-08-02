package I3;

import a3.AbstractC0467k;
import java.util.Currency;

/* loaded from: classes.dex */
public class L extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        String I5 = aVar.I();
        try {
            return Currency.getInstance(I5);
        } catch (IllegalArgumentException e3) {
            StringBuilder w5 = AbstractC0467k.w("Failed parsing '", I5, "' as Currency; at path ");
            w5.append(aVar.m(true));
            throw new F3.p(w5.toString(), e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        bVar.E(((Currency) obj).getCurrencyCode());
    }
}
