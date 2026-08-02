package z;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* renamed from: z.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2696U extends kotlin.jvm.internal.m implements i4.f {
    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C2693Q c2693q;
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(359872873);
        WeakHashMap weakHashMap = C2693Q.f21496u;
        View view = (View) c0315s.j(AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap2 = C2693Q.f21496u;
        synchronized (weakHashMap2) {
            try {
                Object obj4 = weakHashMap2.get(view);
                if (obj4 == null) {
                    obj4 = new C2693Q(view);
                    weakHashMap2.put(view, obj4);
                }
                c2693q = (C2693Q) obj4;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h3 = c0315s.h(c2693q) | c0315s.h(view);
        Object M5 = c0315s.M();
        if (h3 || M5 == C0302l.f4480a) {
            M5 = new i0.K(17, c2693q, view);
            c0315s.i0(M5);
        }
        AbstractC0329z.c(c2693q, (i4.c) M5, c0315s);
        boolean f = c0315s.f(c2693q);
        Object M6 = c0315s.M();
        if (f || M6 == C0302l.f4480a) {
            M6 = new C2723y(c2693q.f);
            c0315s.i0(M6);
        }
        C2723y c2723y = (C2723y) M6;
        c0315s.q(false);
        return c2723y;
    }
}
