package p4;

import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.Fw;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class C extends w4.i {

    /* renamed from: m, reason: collision with root package name */
    public int f18742m;

    public C(int i) {
        super(0L, false);
        this.f18742m = i;
    }

    public abstract a4.c d();

    public Throwable e(Object obj) {
        C2275o c2275o = obj instanceof C2275o ? (C2275o) obj : null;
        if (c2275o != null) {
            return c2275o.f18812a;
        }
        return null;
    }

    public final void h(Throwable th) {
        AbstractC2282w.l(d().getContext(), new Fw("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (p4.U) r5.l(p4.r.f18819l);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            a4.c d5 = d();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", d5);
            u4.f fVar = (u4.f) d5;
            AbstractC0542c abstractC0542c = fVar.f20088o;
            Object obj = fVar.f20090q;
            a4.h context = abstractC0542c.getContext();
            Object l5 = u4.a.l(context, obj);
            U u5 = null;
            o0 v4 = l5 != u4.a.f20078d ? AbstractC2282w.v(abstractC0542c, context, l5) : null;
            try {
                a4.h context2 = abstractC0542c.getContext();
                Object i = i();
                Throwable e3 = e(i);
                if (e3 == null) {
                    int i5 = this.f18742m;
                    boolean z3 = true;
                    if (i5 != 1 && i5 != 2) {
                        z3 = false;
                    }
                }
                if (u5 != null && !u5.b()) {
                    CancellationException s2 = u5.s();
                    c(s2);
                    abstractC0542c.resumeWith(G4.l.p(s2));
                } else if (e3 != null) {
                    abstractC0542c.resumeWith(G4.l.p(e3));
                } else {
                    abstractC0542c.resumeWith(f(i));
                }
                if (v4 == null || v4.f0()) {
                    u4.a.g(context, l5);
                }
            } catch (Throwable th) {
                if (v4 == null || v4.f0()) {
                    u4.a.g(context, l5);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
