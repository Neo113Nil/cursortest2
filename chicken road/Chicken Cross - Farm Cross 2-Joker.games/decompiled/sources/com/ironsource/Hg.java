package com.ironsource;

import com.ironsource.H;
import com.ironsource.S4;
import com.ironsource.Yg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Hg implements G, Rg {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f7666a;
    private final AbstractC4720x0 b;
    private final Pg c;
    private final InterfaceC4697vd d;
    private final F e;
    private final Yg f;
    private final Kg g;
    private H h;
    private Sg i;
    private final List<B> j;
    private B k;
    private boolean l;
    private boolean m;
    private int n;

    public Hg(T0 adTools, AbstractC4720x0 adUnitData, boolean z, Pg listener, InterfaceC4697vd interfaceC4697vd, F f) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7666a = adTools;
        this.b = adUnitData;
        this.c = listener;
        this.d = interfaceC4697vd;
        this.e = f;
        this.f = Yg.a.f8033a.a(z, this);
        this.g = Kg.d.a(adTools, adUnitData);
        this.j = new ArrayList();
    }

    private final List<B> e() {
        H.c c;
        List<B> d;
        H h = this.h;
        return (h == null || (c = h.c()) == null || (d = c.d()) == null) ? CollectionsKt.emptyList() : d;
    }

    private final boolean h() {
        return this.k != null;
    }

    private final void i() {
        H h = this.h;
        H.b d = h != null ? h.d() : null;
        if (d == null || d.e()) {
            this.c.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (d.f()) {
            Sg sg2 = this.i;
            if (sg2 != null) {
                sg2.a();
                return;
            }
            return;
        }
        for (B b : d.a()) {
            this.n++;
            if (b.A()) {
                this.m = false;
                b(b);
            } else {
                b.a(this);
            }
        }
    }

    public final void c() {
        this.l = true;
        B b = this.k;
        if (b != null) {
            b.b();
        }
    }

    public final B d() {
        H.c c;
        H h = this.h;
        if (h == null || (c = h.c()) == null) {
            return null;
        }
        return c.c();
    }

    public final Md f() {
        return this.f.b();
    }

    public final boolean g() {
        Iterator<B> it = this.j.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.G
    public void b(B instance) {
        InterfaceC4697vd interfaceC4697vd;
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        c(instance);
        if (this.n > 0 || !this.m || (interfaceC4697vd = this.d) == null) {
            return;
        }
        interfaceC4697vd.a(this.b.b().c(), false);
    }

    public final void d(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Sg sg2 = this.i;
        if (sg2 != null) {
            sg2.a(instance, this.b.l(), this.b.o());
        }
    }

    private final void c(B b) {
        if (!this.l && !h()) {
            F f = this.e;
            if (f != null) {
                b.a(f);
            }
            Sg sg2 = this.i;
            if (sg2 != null) {
                sg2.a(b);
            }
            this.j.add(b);
            if (this.j.size() == 1) {
                Sg sg3 = this.i;
                if (sg3 != null) {
                    sg3.b(b);
                }
                this.c.b(b);
                return;
            }
            H h = this.h;
            if (h == null || !h.a(b)) {
                return;
            }
            this.c.a(b);
            return;
        }
        if (b.A()) {
            InterfaceC4697vd interfaceC4697vd = this.d;
            if (interfaceC4697vd != null) {
                interfaceC4697vd.a(this.b.b().c(), false);
                return;
            }
            return;
        }
        b.c();
    }

    public final void a(E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.g.a(adInstanceFactory, new a());
    }

    public final void b() {
        this.f.a();
    }

    public final void a(K adInstancePresenter, boolean z) {
        Sg sg2;
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        B c = this.f.c();
        if (c != null) {
            this.f.a(c);
            if (!z && (sg2 = this.i) != null) {
                sg2.a(c, e());
            }
            c.a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.G
    public void a(IronSourceError error, B instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        if (this.l) {
            return;
        }
        i();
    }

    public /* synthetic */ Hg(T0 t0, AbstractC4720x0 abstractC4720x0, boolean z, Pg pg, InterfaceC4697vd interfaceC4697vd, F f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, abstractC4720x0, z, pg, (i & 16) != 0 ? null : interfaceC4697vd, (i & 32) != 0 ? null : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Mg mg) {
        H a2 = H.c.a(this.b, mg);
        this.h = a2;
        this.i = Sg.c.a(this.f7666a, this.b, this.g.a(), mg, a2);
        i();
    }

    @Override // com.ironsource.Rg
    public void a(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.k = instance;
        this.j.remove(instance);
    }

    @Override // com.ironsource.Rg
    public void a(S4 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        IronLog.INTERNAL.verbose(C4577p0.a(this.f7666a, "destroyReadyToShowInstances reason=" + reason.a(), (String) null, 2, (Object) null));
        if (this.j.isEmpty()) {
            return;
        }
        String c = this.b.b().c();
        for (B b : this.j) {
            if (b.A()) {
                InterfaceC4697vd interfaceC4697vd = this.d;
                if (interfaceC4697vd != null) {
                    interfaceC4697vd.a(c, false);
                }
            } else {
                b.c();
            }
        }
        this.j.clear();
        S4.a aVar = reason instanceof S4.a ? (S4.a) reason : null;
        this.f7666a.f().h().a(reason.a(), aVar != null ? Long.valueOf(aVar.c()) : null);
    }

    @Override // com.ironsource.Rg
    public boolean a() {
        return !this.j.isEmpty();
    }

    @Override // com.ironsource.Rg
    public B a(int i) {
        List<B> e = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (B) CollectionsKt.getOrNull(arrayList, i);
    }

    public static final class a implements Lg {
        a() {
        }

        @Override // com.ironsource.Lg
        public void a(Mg waterfallInstances) {
            boolean z;
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (Hg.this.l) {
                return;
            }
            Hg hg = Hg.this;
            List<B> b = waterfallInstances.b();
            if (!(b instanceof Collection) || !b.isEmpty()) {
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    if (((B) it.next()).A()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            hg.m = z;
            Hg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.Lg
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (Hg.this.l) {
                return;
            }
            Hg.this.c.a(i, errorReason);
        }
    }
}
