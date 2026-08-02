package K4;

import A1.C0043s0;
import G4.Z;
import U5.l0;
import java.util.Iterator;
import java.util.Locale;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0043s0 f4070a;

    public v(C0043s0 c0043s0) {
        this.f4070a = c0043s0;
    }

    @Override // K4.y
    public final void a() {
        C0043s0 c0043s0 = this.f4070a;
        Iterator it = c0043s0.f551a.values().iterator();
        while (it.hasNext()) {
            c0043s0.m((Z) it.next());
        }
    }

    @Override // K4.y
    public final void b(l0 l0Var) {
        C0043s0 c0043s0 = this.f4070a;
        c0043s0.getClass();
        if (l0Var.e()) {
            p3.f.O("Watch stream was stopped gracefully while still needed.", !c0043s0.n(), new Object[0]);
        }
        c0043s0.f560k = null;
        boolean n2 = c0043s0.n();
        u uVar = (u) c0043s0.f558h;
        if (!n2) {
            uVar.e(1);
            return;
        }
        if (uVar.f4064a == 2) {
            uVar.d(1);
            p3.f.O("watchStreamFailures must be 0", uVar.f4065b == 0, new Object[0]);
            p3.f.O("onlineStateTimer must be null", ((C1726n0) uVar.f4067d) == null, new Object[0]);
        } else {
            int i7 = uVar.f4065b + 1;
            uVar.f4065b = i7;
            if (i7 >= 1) {
                C1726n0 c1726n0 = (C1726n0) uVar.f4067d;
                if (c1726n0 != null) {
                    c1726n0.f();
                    uVar.f4067d = null;
                }
                Locale locale = Locale.ENGLISH;
                uVar.c("Connection failed 1 times. Most recent error: " + l0Var);
                uVar.d(3);
            }
        }
        c0043s0.p();
    }
}
