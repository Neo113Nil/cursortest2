package M5;

import java.io.IOException;

/* renamed from: M5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3608d {
    static I5.a a(N5.c cVar, B5.g gVar) throws IOException {
        return new I5.a(u.a(cVar, gVar, 1.0f, C3611g.f17414a, false));
    }

    public static I5.b b(N5.c cVar, B5.g gVar, boolean z11) throws IOException {
        return new I5.b(u.a(cVar, gVar, z11 ? O5.g.c() : 1.0f, C3616l.f17430a, false));
    }

    static I5.c c(N5.c cVar, B5.g gVar, int i11) throws IOException {
        return new I5.c(u.a(cVar, gVar, 1.0f, new o(i11), false));
    }

    static I5.d d(N5.c cVar, B5.g gVar) throws IOException {
        return new I5.d(u.a(cVar, gVar, 1.0f, r.f17440a, false));
    }

    static I5.f e(N5.c cVar, B5.g gVar) throws IOException {
        return new I5.f(u.a(cVar, gVar, O5.g.c(), A.f17392a, true));
    }
}
