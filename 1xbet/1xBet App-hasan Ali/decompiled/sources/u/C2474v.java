package u;

import a.AbstractC0444a;
import com.google.android.gms.internal.ads.C1071hd;
import k0.C2023c;
import t.AbstractC2388J;
import t.AbstractC2390b;
import t.C2386H;
import t.C2387I;

/* renamed from: u.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2474v implements InterfaceC2461h {

    /* renamed from: a, reason: collision with root package name */
    public final C1071hd f19953a;

    /* renamed from: b, reason: collision with root package name */
    public final A0 f19954b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19955c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2470q f19956d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2470q f19957e;
    public final AbstractC2470q f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f19958g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19959h;

    public C2474v(C2475w c2475w, A0 a02, Object obj, AbstractC2470q abstractC2470q) {
        C1071hd c1071hd = new C1071hd(c2475w.f19964a);
        this.f19953a = c1071hd;
        this.f19954b = a02;
        this.f19955c = obj;
        AbstractC2470q abstractC2470q2 = (AbstractC2470q) a02.f19643a.c(obj);
        this.f19956d = abstractC2470q2;
        this.f19957e = AbstractC2453d.g(abstractC2470q);
        if (((AbstractC2470q) c1071hd.f13764o) == null) {
            c1071hd.f13764o = abstractC2470q2.c();
        }
        AbstractC2470q abstractC2470q3 = (AbstractC2470q) c1071hd.f13764o;
        if (abstractC2470q3 == null) {
            kotlin.jvm.internal.l.k("targetVector");
            throw null;
        }
        int b3 = abstractC2470q3.b();
        int i = 0;
        while (i < b3) {
            AbstractC2470q abstractC2470q4 = (AbstractC2470q) c1071hd.f13764o;
            if (abstractC2470q4 == null) {
                kotlin.jvm.internal.l.k("targetVector");
                throw null;
            }
            float a5 = abstractC2470q2.a(i);
            float a6 = abstractC2470q.a(i);
            C2387I c2387i = (C2387I) ((C2023c) c1071hd.f13761l).f17544l;
            double b5 = c2387i.b(a6);
            double d5 = AbstractC2388J.f19350a;
            float f = c2387i.f19348a * c2387i.f19349b;
            int i5 = i;
            abstractC2470q4.e(i5, (Math.signum(a6) * ((float) (Math.exp((d5 / (d5 - 1.0d)) * b5) * f))) + a5);
            i = i5 + 1;
        }
        AbstractC2470q abstractC2470q5 = (AbstractC2470q) c1071hd.f13764o;
        if (abstractC2470q5 == null) {
            kotlin.jvm.internal.l.k("targetVector");
            throw null;
        }
        this.f19958g = a02.f19644b.c(abstractC2470q5);
        C1071hd c1071hd2 = this.f19953a;
        AbstractC2470q abstractC2470q6 = this.f19956d;
        if (((AbstractC2470q) c1071hd2.f13763n) == null) {
            c1071hd2.f13763n = abstractC2470q6.c();
        }
        AbstractC2470q abstractC2470q7 = (AbstractC2470q) c1071hd2.f13763n;
        if (abstractC2470q7 == null) {
            kotlin.jvm.internal.l.k("velocityVector");
            throw null;
        }
        int b6 = abstractC2470q7.b();
        long j5 = 0;
        for (int i6 = 0; i6 < b6; i6++) {
            abstractC2470q6.getClass();
            j5 = Math.max(j5, ((long) (Math.exp(((C2387I) ((C2023c) c1071hd2.f13761l).f17544l).b(abstractC2470q.a(i6)) / (AbstractC2388J.f19350a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f19959h = j5;
        AbstractC2470q g5 = AbstractC2453d.g(this.f19953a.g(j5, this.f19956d, abstractC2470q));
        this.f = g5;
        int b7 = g5.b();
        for (int i7 = 0; i7 < b7; i7++) {
            AbstractC2470q abstractC2470q8 = this.f;
            float a7 = abstractC2470q8.a(i7);
            this.f19953a.getClass();
            this.f19953a.getClass();
            abstractC2470q8.e(i7, AbstractC0444a.s(a7, -0.0f, 0.0f));
        }
    }

    @Override // u.InterfaceC2461h
    public final boolean b() {
        return false;
    }

    @Override // u.InterfaceC2461h
    public final Object c(long j5) {
        if (AbstractC2462i.a(this, j5)) {
            return this.f19958g;
        }
        i4.c cVar = this.f19954b.f19644b;
        C1071hd c1071hd = this.f19953a;
        AbstractC2470q abstractC2470q = (AbstractC2470q) c1071hd.f13762m;
        AbstractC2470q abstractC2470q2 = this.f19956d;
        if (abstractC2470q == null) {
            c1071hd.f13762m = abstractC2470q2.c();
        }
        AbstractC2470q abstractC2470q3 = (AbstractC2470q) c1071hd.f13762m;
        String str = "valueVector";
        if (abstractC2470q3 == null) {
            kotlin.jvm.internal.l.k("valueVector");
            throw null;
        }
        int b3 = abstractC2470q3.b();
        int i = 0;
        while (i < b3) {
            AbstractC2470q abstractC2470q4 = (AbstractC2470q) c1071hd.f13762m;
            if (abstractC2470q4 == null) {
                kotlin.jvm.internal.l.k(str);
                throw null;
            }
            float a5 = abstractC2470q2.a(i);
            long j6 = j5 / 1000000;
            C2386H a6 = ((C2387I) ((C2023c) c1071hd.f13761l).f17544l).a(this.f19957e.a(i));
            String str2 = str;
            long j7 = a6.f19347c;
            abstractC2470q4.e(i, (Math.signum(a6.f19345a) * a6.f19346b * AbstractC2390b.a(j7 > 0 ? j6 / j7 : 1.0f).f19356a) + a5);
            i++;
            str = str2;
        }
        String str3 = str;
        AbstractC2470q abstractC2470q5 = (AbstractC2470q) c1071hd.f13762m;
        if (abstractC2470q5 != null) {
            return cVar.c(abstractC2470q5);
        }
        kotlin.jvm.internal.l.k(str3);
        throw null;
    }

    @Override // u.InterfaceC2461h
    public final long d() {
        return this.f19959h;
    }

    @Override // u.InterfaceC2461h
    public final A0 e() {
        return this.f19954b;
    }

    @Override // u.InterfaceC2461h
    public final Object f() {
        return this.f19958g;
    }

    @Override // u.InterfaceC2461h
    public final AbstractC2470q g(long j5) {
        if (AbstractC2462i.a(this, j5)) {
            return this.f;
        }
        return this.f19953a.g(j5, this.f19956d, this.f19957e);
    }

    @Override // u.InterfaceC2461h
    public final /* synthetic */ boolean h(long j5) {
        return AbstractC2462i.a(this, j5);
    }
}
