package Z0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import g0.AbstractC1961f;
import g0.C1965j;
import g0.InterfaceC1964i;
import g0.s;
import h0.C1989c;
import z0.AbstractC2749f;
import z0.C2731G;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.j f6310a = new Q1.j(17);

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(InterfaceC1964i interfaceC1964i, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        s g5 = AbstractC1961f.g(((C1965j) interfaceC1964i).f17031c);
        C1989c j5 = g5 != null ? AbstractC1961f.j(g5) : null;
        if (j5 == null) {
            return null;
        }
        int i = (int) j5.f17193a;
        int i5 = iArr[0];
        int i6 = iArr2[0];
        int i7 = (int) j5.f17194b;
        int i8 = iArr[1];
        int i9 = iArr2[1];
        return new Rect((i + i5) - i6, (i7 + i8) - i9, (((int) j5.f17195c) + i5) - i6, (((int) j5.f17196d) + i8) - i9);
    }

    public static final View c(b0.o oVar) {
        q qVar = AbstractC2749f.v(oVar.f7162k).f21637x;
        View interopView = qVar != null ? qVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(q qVar, C2731G c2731g) {
        long J = c2731g.f21612O.f21768c.J(0L);
        int round = Math.round(Float.intBitsToFloat((int) (J >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (J & 4294967295L)));
        qVar.layout(round, round2, qVar.getMeasuredWidth() + round, qVar.getMeasuredHeight() + round2);
    }
}
