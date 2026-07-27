package com.ironsource;

import com.ironsource.E0;
import com.ironsource.InterfaceC4487k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4595q0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4720x0 f8484a;
    private final T0 b;
    private L0 c;
    private InterfaceC4756z0 d;
    private final Hg e;
    private final WeakReference<J0> f;
    private C4385e5 g;
    private final C4725x5 h;

    /* renamed from: com.ironsource.q0$b */
    public static final class b implements Pg {
        b() {
        }

        @Override // com.ironsource.Pg
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC4595q0.this.a(i, errorReason);
        }

        @Override // com.ironsource.Pg
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4595q0.this.h.e().a(C4385e5.a(AbstractC4595q0.this.g), AbstractC4595q0.this.e().u());
            L0 j = AbstractC4595q0.this.j();
            if (j != null) {
                j.a(new C4666u0(AbstractC4595q0.this, instance.e()));
            }
        }

        @Override // com.ironsource.Pg
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4595q0.this.f().f().a().e(AbstractC4595q0.this.h());
            L0 j = AbstractC4595q0.this.j();
            if (j != null) {
                j.b(new C4666u0(AbstractC4595q0.this, instance.e()));
            }
        }
    }

    public AbstractC4595q0(C4577p0 adTools, AbstractC4720x0 adUnitData, J0 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8484a = adUnitData;
        T0 t0 = new T0(adTools, adUnitData, E0.b.MEDIATION);
        this.b = t0;
        this.e = new Hg(t0, adUnitData, false, c(), null, null, 48, null);
        this.f = new WeakReference<>(listener);
        this.h = t0.f();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    protected abstract E a();

    public InterfaceC4487k0 d() {
        return this.e.g() ? InterfaceC4487k0.b.f8276a : new InterfaceC4487k0.a(null, 1, null);
    }

    protected final AbstractC4720x0 e() {
        return this.f8484a;
    }

    protected final T0 f() {
        return this.b;
    }

    protected final C4411fd g() {
        return this.f8484a.b().f();
    }

    protected final String h() {
        return this.f8484a.l();
    }

    protected final InterfaceC4756z0 i() {
        return this.d;
    }

    protected final L0 j() {
        return this.c;
    }

    protected final Hg k() {
        return this.e;
    }

    private final b c() {
        return new b();
    }

    protected final void a(InterfaceC4756z0 interfaceC4756z0) {
        this.d = interfaceC4756z0;
    }

    protected final void b(L0 l0) {
        this.c = l0;
    }

    public void a(L0 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C4577p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.b.a(b());
        this.c = loadListener;
        this.h.a(this.f8484a.u());
        this.g = new C4385e5();
        this.e.a(a());
    }

    public C4630s0 b() {
        return new C4630s0(this.f8484a.b());
    }

    /* renamed from: com.ironsource.q0$a */
    protected class a implements F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(B instance, IronSourceError error) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.INTERNAL.verbose(AbstractC4595q0.this.a(instance.q()));
            AbstractC4595q0.this.h.a().a(AbstractC4595q0.this.h(), error.getErrorCode(), error.getErrorMessage(), null);
            InterfaceC4756z0 i = AbstractC4595q0.this.i();
            if (i != null) {
                i.c(error);
            }
        }

        @Override // com.ironsource.F
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC4595q0.this.a(instance.q()));
            AbstractC4595q0.this.k().d(instance);
            AbstractC4595q0.this.h.a().g(AbstractC4595q0.this.h());
            AbstractC4595q0.this.f().l().b(AbstractC4595q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4595q0.this.h.a().a(AbstractC4595q0.this.h());
            J0 j0 = (J0) AbstractC4595q0.this.f.get();
            if (j0 != null) {
                j0.e();
            }
        }
    }

    public final void a(K adInstancePresenter, InterfaceC4756z0 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.d = displayListener;
        this.e.a(adInstancePresenter, false);
    }

    public final void a(boolean z) {
        IronLog.INTERNAL.verbose(C4577p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.e.c();
        if (z) {
            this.b.f().e().a(this.b.g());
        }
    }

    protected final void a(int i, String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + errorReason));
        this.h.e().a(C4385e5.a(this.g), i, errorReason, this.f8484a.u());
        L0 l0 = this.c;
        if (l0 != null) {
            l0.b(new IronSourceError(i, errorReason));
        }
    }

    protected final String a(String str) {
        return C4577p0.a(this.b, str, (String) null, 2, (Object) null);
    }
}
