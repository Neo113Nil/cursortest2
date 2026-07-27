package g0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import d0.AbstractC0265e;
import i0.C0328a;
import i0.C0330c;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307f extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0307f f4963e = new C0307f(0);

    @Override // o2.a
    public final Object invoke() {
        WindowLayoutComponent a3;
        int i3 = 29;
        try {
            ClassLoader loader = InterfaceC0309h.class.getClassLoader();
            C0306e c0306e = loader != null ? new C0306e(loader, new J1.i(i3, loader)) : null;
            if (c0306e != null && (a3 = c0306e.a()) != null) {
                kotlin.jvm.internal.j.d(loader, "loader");
                J1.i iVar = new J1.i(i3, loader);
                int a4 = AbstractC0265e.a();
                return a4 >= 2 ? new i0.d(a3) : a4 == 1 ? new C0330c(a3, iVar) : new C0328a();
            }
        } catch (Throwable unused) {
            C0308g c0308g = C0308g.f4964a;
        }
        return null;
    }
}
