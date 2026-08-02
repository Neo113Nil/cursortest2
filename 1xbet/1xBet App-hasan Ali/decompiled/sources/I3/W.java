package I3;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public class W extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        try {
            int v4 = aVar.v();
            if (v4 <= 255 && v4 >= -128) {
                return Byte.valueOf((byte) v4);
            }
            StringBuilder v5 = AbstractC2107A.v(v4, "Lossy conversion from ", " to byte; at path ");
            v5.append(aVar.m(true));
            throw new F3.p(v5.toString());
        } catch (NumberFormatException e3) {
            throw new F3.p(e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.n();
        } else {
            bVar.v(r4.byteValue());
        }
    }
}
