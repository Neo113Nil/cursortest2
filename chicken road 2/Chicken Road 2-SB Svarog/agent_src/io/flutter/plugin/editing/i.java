package io.flutter.plugin.editing;

import O.p;
import O.r;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f640a;

    public /* synthetic */ i(l lVar) {
        this.f640a = lVar;
    }

    public void a(int i2, p pVar) {
        l lVar = this.f640a;
        lVar.c();
        lVar.f651f = pVar;
        lVar.f650e = new k(2, i2);
        lVar.f653h.e(lVar);
        C.e eVar = pVar.f347j;
        lVar.f653h = new f(eVar != null ? (r) eVar.f10c : null, lVar.f646a);
        lVar.d(pVar);
        lVar.f654i = true;
        if (lVar.f650e.f644a == 3) {
            lVar.f661p = false;
        }
        lVar.f658m = null;
        lVar.f653h.a(lVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        j jVar = new j(z2, dArr, dArr2);
        jVar.a(d2, 0.0d);
        jVar.a(d2, d3);
        jVar.a(0.0d, d3);
        l lVar = this.f640a;
        double d8 = lVar.f646a.getContext().getResources().getDisplayMetrics().density;
        lVar.f658m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(r rVar) {
        r rVar2;
        int i2;
        int i3;
        l lVar = this.f640a;
        View view = lVar.f646a;
        if (!lVar.f654i && (rVar2 = lVar.f660o) != null && (i2 = rVar2.f357d) >= 0 && (i3 = rVar2.f358e) > i2) {
            int i4 = i3 - i2;
            int i5 = rVar.f358e;
            int i6 = rVar.f357d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (rVar2.f354a.charAt(i7 + i2) != rVar.f354a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            lVar.f654i = z2;
        }
        lVar.f660o = rVar;
        lVar.f653h.f(rVar);
        if (lVar.f654i) {
            lVar.f647b.restartInput(view);
            lVar.f654i = false;
        }
    }
}
