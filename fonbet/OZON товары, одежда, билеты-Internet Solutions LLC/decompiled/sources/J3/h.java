package J3;

import J3.i;
import J3.j;
import j3.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import p3.C8847g;
import p3.o;
import p3.s;

/* loaded from: classes.dex */
public final class h implements i {
    @Override // J3.i
    public final long a(i.c cVar) {
        Throwable th2 = cVar.f13796a;
        if ((th2 instanceof v) || (th2 instanceof FileNotFoundException) || (th2 instanceof o) || (th2 instanceof j.g)) {
            return -9223372036854775807L;
        }
        int i11 = C8847g.f80059b;
        while (th2 != null) {
            if ((th2 instanceof C8847g) && ((C8847g) th2).f80060a == 2008) {
                return -9223372036854775807L;
            }
            th2 = th2.getCause();
        }
        return Math.min((cVar.f13797b - 1) * 1000, 5000);
    }

    @Override // J3.i
    public final int b(int i11) {
        return i11 == 7 ? 6 : 3;
    }

    public final i.b c(i.a aVar, i.c cVar) {
        IOException iOException = cVar.f13796a;
        if (!(iOException instanceof s)) {
            return null;
        }
        int i11 = ((s) iOException).f80119d;
        if (i11 != 403 && i11 != 404 && i11 != 410 && i11 != 416 && i11 != 500 && i11 != 503) {
            return null;
        }
        if (aVar.a(1)) {
            return new i.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new i.b(2, 60000L);
        }
        return null;
    }
}
