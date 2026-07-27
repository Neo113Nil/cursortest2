package m0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import o0.C1354a;
import t4.InterfaceC1430a;

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271f extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1271f f11106e = new C1271f(0);

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        WindowLayoutComponent a6;
        try {
            ClassLoader loader = InterfaceC1273h.class.getClassLoader();
            C1270e c1270e = loader != null ? new C1270e(loader, new i0.b(loader)) : null;
            if (c1270e == null || (a6 = c1270e.a()) == null) {
                return null;
            }
            kotlin.jvm.internal.i.d(loader, "loader");
            i0.b bVar = new i0.b(loader);
            int a7 = j0.e.a();
            return a7 >= 2 ? new o0.d(a6) : a7 == 1 ? new o0.c(a6, bVar) : new C1354a();
        } catch (Throwable unused) {
            C1272g c1272g = C1272g.f11107a;
            return null;
        }
    }
}
