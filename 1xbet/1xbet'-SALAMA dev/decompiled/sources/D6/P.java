package D6;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends AbstractC0126i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1800f;

    public /* synthetic */ P(Object obj, int i7) {
        this.f1799e = i7;
        this.f1800f = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        switch (this.f1799e) {
            case 0:
                j((Throwable) obj);
                return p044f6.i.f13014a;
            case 1:
                j((Throwable) obj);
                return p044f6.i.f13014a;
            case 2:
                j((Throwable) obj);
                throw null;
            case 3:
                j((Throwable) obj);
                return p044f6.i.f13014a;
            default:
                j((Throwable) obj);
                return p044f6.i.f13014a;
        }
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) throws IllegalAccessException, InvocationTargetException {
        switch (this.f1799e) {
            case 0:
                ((O) this.f1800f).dispose();
                return;
            case 1:
                ((Function1) this.f1800f).invoke(th);
                return;
            case 2:
                Object objX = ((s0) this.f1800f).x();
                if (!(objX instanceof C0138v)) {
                    E.v(objX);
                }
                throw null;
            case 3:
                Object objX2 = i().x();
                boolean z4 = objX2 instanceof C0138v;
                j0 j0Var = (j0) this.f1800f;
                if (z4) {
                    j0Var.resumeWith(p003a.a.h(((C0138v) objX2).f1882a));
                    return;
                } else {
                    j0Var.resumeWith(E.v(objX2));
                    return;
                }
            default:
                ((C0130m) this.f1800f).resumeWith(p044f6.i.f13014a);
                return;
        }
    }

    public P(s0 s0Var) {
        this.f1799e = 2;
        this.f1800f = s0Var;
    }
}
