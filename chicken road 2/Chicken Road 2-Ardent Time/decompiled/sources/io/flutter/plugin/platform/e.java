package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final P0.AbstractActivityC0047e f7746a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.e f7747b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.AbstractActivityC0047e f7748c;

    /* renamed from: d, reason: collision with root package name */
    public Z0.e f7749d;

    /* renamed from: e, reason: collision with root package name */
    public int f7750e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7751f = false;

    public e(P0.AbstractActivityC0047e abstractActivityC0047e, x0.e eVar, P0.AbstractActivityC0047e abstractActivityC0047e2) {
        Z0.h hVar = new Z0.h(23, this);
        this.f7746a = abstractActivityC0047e;
        this.f7747b = eVar;
        eVar.f8410c = hVar;
        this.f7748c = abstractActivityC0047e2;
        this.f7750e = 1280;
    }

    public final void a(Z0.e eVar) {
        android.view.Window window = this.f7746a.getWindow();
        window.getDecorView();
        int i2 = android.os.Build.VERSION.SDK_INT;
        a.AbstractC0059a v2 = i2 >= 30 ? new y.V(window) : i2 >= 26 ? new y.T(window) : new y.S(window);
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = eVar.f1876b;
        if (i4 != 0) {
            int b2 = H.j.b(i4);
            if (b2 == 0) {
                v2.y(false);
            } else if (b2 == 1) {
                v2.y(true);
            }
        }
        java.lang.Integer num = eVar.f1875a;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        java.lang.Boolean bool = eVar.f1877c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = eVar.f1879e;
            if (i5 != 0) {
                int b3 = H.j.b(i5);
                if (b3 == 0) {
                    v2.x(false);
                } else if (b3 == 1) {
                    v2.x(true);
                }
            }
            java.lang.Integer num2 = eVar.f1878d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        java.lang.Integer num3 = eVar.f1880f;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        java.lang.Boolean bool2 = eVar.f1881g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f7749d = eVar;
    }

    public final void b() {
        boolean z2 = this.f7751f;
        P0.AbstractActivityC0047e abstractActivityC0047e = this.f7746a;
        if (z2) {
            Q1.l.v(abstractActivityC0047e.getWindow(), false);
        } else {
            abstractActivityC0047e.getWindow().getDecorView().setSystemUiVisibility(this.f7750e);
        }
        Z0.e eVar = this.f7749d;
        if (eVar != null) {
            a(eVar);
        }
    }
}
