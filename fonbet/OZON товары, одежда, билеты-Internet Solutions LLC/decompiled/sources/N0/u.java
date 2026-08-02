package N0;

import k1.C7459e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class u extends AbstractC7737t implements Function2<C7459e, Z1.o, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final u f18343b = new u(2);

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(C7459e c7459e, Z1.o oVar) {
        C7459e c7459e2 = c7459e;
        Z1.o oVar2 = oVar;
        boolean z11 = false;
        if (c7459e2 != null && (C7459e.g(c7459e2.n()) < oVar2.e() || C7459e.g(c7459e2.n()) > oVar2.f() || C7459e.h(c7459e2.n()) < oVar2.g() || C7459e.h(c7459e2.n()) > oVar2.c())) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
