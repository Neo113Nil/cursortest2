package H8;

import android.content.Context;
import n8.C8451a;
import n8.InterfaceC8452b;
import n8.n;

/* loaded from: classes.dex */
public final class g {

    public interface a<T> {
        String c(Context context);
    }

    public static C8451a<?> a(String str, String str2) {
        H8.a aVar = new H8.a(str, str2);
        C8451a.C1292a j11 = C8451a.j(e.class);
        j11.f(new Uy.a(aVar));
        return j11.d();
    }

    public static C8451a<?> b(final String str, final a<Context> aVar) {
        C8451a.C1292a j11 = C8451a.j(e.class);
        j11.b(n.i(Context.class));
        j11.f(new n8.e() { // from class: H8.f
            @Override // n8.e
            public final Object a(InterfaceC8452b interfaceC8452b) {
                return new a(str, aVar.c((Context) interfaceC8452b.a(Context.class)));
            }
        });
        return j11.d();
    }
}
