package I3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public class M extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        int v4;
        int i = 0;
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        aVar.d();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (aVar.K() != 4) {
            String E5 = aVar.E();
            v4 = aVar.v();
            E5.getClass();
            switch (E5) {
                case "dayOfMonth":
                    i6 = v4;
                    break;
                case "minute":
                    i8 = v4;
                    break;
                case "second":
                    i9 = v4;
                    break;
                case "year":
                    i = v4;
                    break;
                case "month":
                    i5 = v4;
                    break;
                case "hourOfDay":
                    i7 = v4;
                    break;
            }
        }
        aVar.k();
        return new GregorianCalendar(i, i5, i6, i7, i8, i9);
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        if (((Calendar) obj) == null) {
            bVar.n();
            return;
        }
        bVar.f();
        bVar.l("year");
        bVar.v(r4.get(1));
        bVar.l("month");
        bVar.v(r4.get(2));
        bVar.l("dayOfMonth");
        bVar.v(r4.get(5));
        bVar.l("hourOfDay");
        bVar.v(r4.get(11));
        bVar.l("minute");
        bVar.v(r4.get(12));
        bVar.l("second");
        bVar.v(r4.get(13));
        bVar.k();
    }
}
