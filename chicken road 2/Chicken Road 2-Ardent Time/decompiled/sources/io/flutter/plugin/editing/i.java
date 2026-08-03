package io.flutter.plugin.editing;

/* loaded from: classes.dex */
public final class i implements io.flutter.plugin.editing.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.editing.j f7723a;

    public /* synthetic */ i(io.flutter.plugin.editing.j jVar) {
        this.f7723a = jVar;
    }

    public void a(int i2, Z0.n nVar) {
        io.flutter.plugin.editing.j jVar = this.f7723a;
        jVar.c();
        jVar.f7729f = nVar;
        jVar.f7728e = new P.C0039l(2, i2);
        jVar.f7731h.e(jVar);
        F.C0014n c0014n = nVar.f1930j;
        jVar.f7731h = new io.flutter.plugin.editing.f(c0014n != null ? (Z0.p) c0014n.f500c : null, jVar.f7724a);
        jVar.d(nVar);
        jVar.f7732i = true;
        if (jVar.f7728e.f1285b == 3) {
            jVar.f7739p = false;
        }
        jVar.f7736m = null;
        jVar.f7731h.a(jVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        io.flutter.plugin.editing.j jVar = this.f7723a;
        jVar.getClass();
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[7] == com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        D0.j jVar2 = new D0.j(z2, dArr, dArr2);
        jVar2.a(d2, com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        jVar2.a(d2, d3);
        jVar2.a(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE, d3);
        double d8 = jVar.f7724a.getContext().getResources().getDisplayMetrics().density;
        jVar.f7736m = new android.graphics.Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) java.lang.Math.ceil(dArr2[1] * d8), (int) java.lang.Math.ceil(dArr2[3] * d8));
    }

    public void c(Z0.p pVar) {
        Z0.p pVar2;
        int i2;
        int i3;
        io.flutter.plugin.editing.j jVar = this.f7723a;
        P0.t tVar = jVar.f7724a;
        if (!jVar.f7732i && (pVar2 = jVar.f7738o) != null && (i2 = pVar2.f1940d) >= 0 && (i3 = pVar2.f1941e) > i2) {
            int i4 = i3 - i2;
            int i5 = pVar.f1941e;
            int i6 = pVar.f1940d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (pVar2.f1937a.charAt(i7 + i2) != pVar.f1937a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            jVar.f7732i = z2;
        }
        jVar.f7738o = pVar;
        jVar.f7731h.f(pVar);
        if (jVar.f7732i) {
            jVar.f7725b.restartInput(tVar);
            jVar.f7732i = false;
        }
    }
}
