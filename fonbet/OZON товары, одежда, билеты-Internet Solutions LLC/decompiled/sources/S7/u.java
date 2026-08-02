package S7;

import f8.I;
import f8.J;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26025a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static J a(I i11) {
        J.b G11 = J.G();
        G11.j(i11.J());
        for (I.c cVar : i11.I()) {
            J.c.a I11 = J.c.I();
            I11.l(cVar.I().J());
            I11.k(cVar.L());
            I11.j(cVar.K());
            I11.i(cVar.J());
            G11.i(I11.b());
        }
        return G11.b();
    }
}
