package Z;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: e, reason: collision with root package name */
    public static final Z.f f1852e = new Z.f(0);

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        androidx.window.extensions.layout.WindowLayoutComponent a2;
        try {
            java.lang.ClassLoader loader = Z.h.class.getClassLoader();
            Z.e eVar = loader != null ? new Z.e(loader, new V.b(loader)) : null;
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            kotlin.jvm.internal.i.d(loader, "loader");
            V.b bVar = new V.b(loader);
            int a3 = W.e.a();
            return a3 >= 2 ? new b0.d(a2) : a3 == 1 ? new b0.C0093c(a2, bVar) : new b0.C0091a();
        } catch (java.lang.Throwable unused) {
            Z.g gVar = Z.g.f1853a;
            return null;
        }
    }
}
