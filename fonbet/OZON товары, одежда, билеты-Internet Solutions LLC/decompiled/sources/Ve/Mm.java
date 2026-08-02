package Ve;

import We.B;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes6.dex */
public final class Mm implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29484a;

    public Mm(Pc.a aVar, C4638t7 c4638t7) {
        this.f29484a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        final InterfaceC4589rg httpHeadersHandler = (InterfaceC4589rg) this.f29484a.get();
        final Fl0.b globalExceptionHandler = new Fl0.b();
        Intrinsics.checkNotNullParameter(httpHeadersHandler, "httpHeadersHandler");
        Intrinsics.checkNotNullParameter(globalExceptionHandler, "globalExceptionHandler");
        return new We.B() { // from class: Ve.Ml
            @Override // We.B
            public final We.L intercept(B.a chain) {
                InterfaceC4589rg httpHeadersHandler2 = InterfaceC4589rg.this;
                Intrinsics.checkNotNullParameter(httpHeadersHandler2, "$httpHeadersHandler");
                Fl0.b globalExceptionHandler2 = globalExceptionHandler;
                Intrinsics.checkNotNullParameter(globalExceptionHandler2, "$globalExceptionHandler");
                Intrinsics.checkNotNullParameter(chain, "chain");
                C10720e0 c10720e0 = C10720e0.f105451a;
                return (We.L) C10727i.d(He.b.f10879b, new C4392kl(chain, httpHeadersHandler2, globalExceptionHandler2, null));
            }
        };
    }
}
