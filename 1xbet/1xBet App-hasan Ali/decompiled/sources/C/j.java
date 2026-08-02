package C;

import W3.o;
import android.graphics.Rect;
import android.view.View;
import c4.AbstractC0542c;
import h0.C1989c;
import i4.InterfaceC2015a;
import z0.AbstractC2749f;
import z0.InterfaceC2755l;
import z0.e0;

/* loaded from: classes.dex */
public final class j implements a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2755l f800k;

    public j(InterfaceC2755l interfaceC2755l) {
        this.f800k = interfaceC2755l;
    }

    @Override // C.a
    public final Object A(e0 e0Var, InterfaceC2015a interfaceC2015a, AbstractC0542c abstractC0542c) {
        View x5 = AbstractC2749f.x(this.f800k);
        long J = e0Var.J(0L);
        C1989c c1989c = (C1989c) interfaceC2015a.invoke();
        C1989c g5 = c1989c != null ? c1989c.g(J) : null;
        if (g5 != null) {
            x5.requestRectangleOnScreen(new Rect((int) g5.f17193a, (int) g5.f17194b, (int) g5.f17195c, (int) g5.f17196d), false);
        }
        return o.f6046a;
    }
}
