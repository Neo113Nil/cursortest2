package H1;

import B1.C;
import D1.AbstractC2810k0;
import H1.o;
import I1.r;
import I1.u;
import androidx.compose.ui.platform.N1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(r rVar, int i11, Function1<? super p, Unit> function1) {
        U0.b bVar = new U0.b(new r[16]);
        List i12 = rVar.i(false, false);
        while (true) {
            bVar.d(bVar.m(), i12);
            while (bVar.p()) {
                r rVar2 = (r) Pk0.b.b(1, bVar);
                if (N1.f(rVar2)) {
                    I1.l q11 = rVar2.q();
                    int i13 = u.f11751H;
                    if (q11.e(u.d())) {
                        continue;
                    } else {
                        AbstractC2810k0 d11 = rVar2.d();
                        if (d11 == null) {
                            A1.a.c("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        Z1.o b11 = Z1.p.b(C.b(d11));
                        if (b11.j()) {
                            continue;
                        } else {
                            Function2 function2 = (Function2) I1.m.a(rVar2.q(), I1.k.u());
                            I1.j jVar = (I1.j) I1.m.a(rVar2.q(), u.G());
                            if (function2 == null || jVar == null || jVar.a().invoke().floatValue() <= 0.0f) {
                                i12 = rVar2.i(false, false);
                            } else {
                                int i14 = 1 + i11;
                                ((o.a) function1).invoke(new p(rVar2, i14, b11, d11));
                                a(rVar2, i14, function1);
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
