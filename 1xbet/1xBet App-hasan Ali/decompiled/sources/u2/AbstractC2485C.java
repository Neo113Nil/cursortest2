package u2;

import P.C0302l;
import P.C0315s;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n.AbstractC2107A;

/* renamed from: u2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2485C {

    /* renamed from: a, reason: collision with root package name */
    public static final long f19985a = W0.b.h(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final F2.e f19986b;

    static {
        F2.h hVar = F2.h.f1535c;
        f19986b = new F2.e();
    }

    public static final E2.i a(E2.i iVar, C0315s c0315s) {
        c0315s.Y(1087186730);
        if (AbstractC2107A.A(iVar)) {
            c0315s.q(false);
            return iVar;
        }
        Context context = (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
        c0315s.Y(-1245195153);
        boolean f = c0315s.f(context) | c0315s.f(iVar);
        Object M5 = c0315s.M();
        if (f || M5 == C0302l.f4480a) {
            E2.h hVar = new E2.h(context);
            hVar.f1424c = iVar;
            M5 = hVar.a();
            c0315s.i0(M5);
        }
        E2.i iVar2 = (E2.i) M5;
        c0315s.q(false);
        c0315s.q(false);
        return iVar2;
    }
}
