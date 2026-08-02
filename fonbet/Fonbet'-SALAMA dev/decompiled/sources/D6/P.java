package D6;

import a.AbstractC0603a;
import f6.C1116i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class P extends AbstractC0126i0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1799e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1800f;

    public /* synthetic */ P(Object obj, int i7) {
        this.f1799e = i7;
        this.f1800f = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1799e) {
            case 0:
                j((Throwable) obj);
                return C1116i.f13008a;
            case 1:
                j((Throwable) obj);
                return C1116i.f13008a;
            case 2:
                j((Throwable) obj);
                throw null;
            case 3:
                j((Throwable) obj);
                return C1116i.f13008a;
            default:
                j((Throwable) obj);
                return C1116i.f13008a;
        }
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) {
        switch (this.f1799e) {
            case 0:
                ((O) this.f1800f).dispose();
                return;
            case 1:
                ((Function1) this.f1800f).invoke(th);
                return;
            case 2:
                Object x4 = ((s0) this.f1800f).x();
                if (!(x4 instanceof C0138v)) {
                    E.v(x4);
                }
                throw null;
            case 3:
                Object x7 = i().x();
                boolean z4 = x7 instanceof C0138v;
                j0 j0Var = (j0) this.f1800f;
                if (z4) {
                    j0Var.resumeWith(AbstractC0603a.h(((C0138v) x7).f1882a));
                    return;
                } else {
                    j0Var.resumeWith(E.v(x7));
                    return;
                }
            default:
                ((C0130m) this.f1800f).resumeWith(C1116i.f13008a);
                return;
        }
    }

    public P(s0 s0Var) {
        this.f1799e = 2;
        this.f1800f = s0Var;
    }
}
