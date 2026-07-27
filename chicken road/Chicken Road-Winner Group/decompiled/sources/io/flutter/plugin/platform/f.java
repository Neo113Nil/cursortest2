package io.flutter.plugin.platform;

import D.W;
import D.X;
import D.Y;
import I1.AbstractActivityC0027d;
import a.AbstractC0086a;
import android.os.Build;
import android.view.Window;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0027d f9256a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.e f9257b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0027d f9258c;

    /* renamed from: d, reason: collision with root package name */
    public S1.c f9259d;

    /* renamed from: e, reason: collision with root package name */
    public int f9260e;
    public boolean f = false;

    public f(AbstractActivityC0027d abstractActivityC0027d, a1.e eVar, AbstractActivityC0027d abstractActivityC0027d2) {
        o oVar = new o(1, this);
        this.f9256a = abstractActivityC0027d;
        this.f9257b = eVar;
        eVar.f1789c = oVar;
        this.f9258c = abstractActivityC0027d2;
        this.f9260e = 1280;
    }

    public final void a(S1.c cVar) {
        Window window = this.f9256a.getWindow();
        window.getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        AbstractC0086a y = i3 >= 30 ? new Y(window) : i3 >= 26 ? new X(window) : new W(window);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i5 = cVar.f1390b;
        if (i5 != 0) {
            int b3 = M.j.b(i5);
            if (b3 == 0) {
                y.V(false);
            } else if (b3 == 1) {
                y.V(true);
            }
        }
        Integer num = cVar.f1389a;
        if (num != null && i4 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = cVar.f1391c;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i4 >= 26) {
            int i6 = cVar.f1393e;
            if (i6 != 0) {
                int b4 = M.j.b(i6);
                if (b4 == 0) {
                    y.U(false);
                } else if (b4 == 1) {
                    y.U(true);
                }
            }
            Integer num2 = cVar.f1392d;
            if (num2 != null && i4 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = cVar.f;
        if (num3 != null && i4 >= 28 && i4 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = cVar.f1394g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f9259d = cVar;
    }

    public final void b() {
        boolean z3 = this.f;
        AbstractActivityC0027d abstractActivityC0027d = this.f9256a;
        if (z3) {
            X0.a.G(abstractActivityC0027d.getWindow(), false);
        } else {
            abstractActivityC0027d.getWindow().getDecorView().setSystemUiVisibility(this.f9260e);
        }
        S1.c cVar = this.f9259d;
        if (cVar != null) {
            a(cVar);
        }
    }
}
