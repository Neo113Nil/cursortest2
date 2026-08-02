package B;

import P.AbstractC0329z;
import P.C0299j0;
import P.C0305m0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f718a;

    /* renamed from: b, reason: collision with root package name */
    public final x f719b;

    /* renamed from: c, reason: collision with root package name */
    public final C0299j0 f720c = new C0299j0(-1);

    /* renamed from: d, reason: collision with root package name */
    public final C0299j0 f721d = new C0299j0(0);

    /* renamed from: e, reason: collision with root package name */
    public final C0305m0 f722e = AbstractC0329z.t(null);
    public final C0305m0 f = AbstractC0329z.t(null);

    public w(Object obj, x xVar) {
        this.f718a = obj;
        this.f719b = xVar;
    }

    public final w a() {
        C0299j0 c0299j0 = this.f721d;
        if (c0299j0.h() == 0) {
            this.f719b.f723k.add(this);
            w wVar = (w) this.f.getValue();
            if (wVar != null) {
                wVar.a();
            } else {
                wVar = null;
            }
            this.f722e.setValue(wVar);
        }
        c0299j0.i(c0299j0.h() + 1);
        return this;
    }

    public final void b() {
        C0299j0 c0299j0 = this.f721d;
        if (c0299j0.h() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c0299j0.i(c0299j0.h() - 1);
        if (c0299j0.h() == 0) {
            this.f719b.f723k.remove(this);
            C0305m0 c0305m0 = this.f722e;
            w wVar = (w) c0305m0.getValue();
            if (wVar != null) {
                wVar.b();
            }
            c0305m0.setValue(null);
        }
    }
}
