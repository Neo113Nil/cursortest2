package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import spay.sdk.SPaySdkApp;

/* loaded from: classes6.dex */
public final class Yj implements InterfaceC4273gh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30473a;

    /* renamed from: b, reason: collision with root package name */
    public final C8060b f30474b;

    /* renamed from: c, reason: collision with root package name */
    public final Yj f30475c = this;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f30476d;

    /* renamed from: e, reason: collision with root package name */
    public final Jb.f f30477e;

    /* renamed from: f, reason: collision with root package name */
    public final Pc.a f30478f;

    /* renamed from: g, reason: collision with root package name */
    public final Pc.a f30479g;

    /* renamed from: h, reason: collision with root package name */
    public final Pc.a f30480h;

    /* renamed from: i, reason: collision with root package name */
    public final Pc.a f30481i;

    /* renamed from: j, reason: collision with root package name */
    public final Pc.a f30482j;

    /* renamed from: k, reason: collision with root package name */
    public final Pc.a f30483k;

    /* renamed from: l, reason: collision with root package name */
    public final Pc.a f30484l;

    /* renamed from: m, reason: collision with root package name */
    public final B6 f30485m;

    /* renamed from: n, reason: collision with root package name */
    public final Pc.a f30486n;

    /* renamed from: o, reason: collision with root package name */
    public final Pc.a f30487o;

    /* renamed from: p, reason: collision with root package name */
    public final Pc.a f30488p;

    /* renamed from: q, reason: collision with root package name */
    public final Pc.a f30489q;

    /* renamed from: r, reason: collision with root package name */
    public final Pc.a f30490r;

    /* renamed from: s, reason: collision with root package name */
    public final Pc.a f30491s;

    /* renamed from: t, reason: collision with root package name */
    public final X7 f30492t;

    /* renamed from: u, reason: collision with root package name */
    public final T4 f30493u;

    /* renamed from: v, reason: collision with root package name */
    public final C4252fp f30494v;

    /* renamed from: w, reason: collision with root package name */
    public final Pc.a f30495w;

    /* renamed from: x, reason: collision with root package name */
    public final C4093aa f30496x;

    public Yj(G10.a aVar, Bl0.k0 k0Var, Lh0.a aVar2, C8060b c8060b, Context context) {
        this.f30473a = context;
        this.f30474b = c8060b;
        Pc.a b11 = Jb.d.b(new C4513oq());
        this.f30476d = b11;
        Jb.f a11 = Jb.f.a(context);
        this.f30477e = a11;
        Pc.a b12 = Jb.d.b(new Do(a11));
        this.f30478f = b12;
        Pc.a b13 = Jb.d.b(new C4107ao(a11));
        this.f30479g = b13;
        Pc.a b14 = Jb.d.b(new C4809z8(0));
        this.f30480h = b14;
        C4118b6 c4118b6 = new C4118b6(a11);
        Pc.a b15 = Jb.d.b(new Oo());
        this.f30481i = b15;
        Pc.a b16 = Jb.d.b(new Z9());
        this.f30482j = b16;
        Pc.a b17 = Jb.d.b(new C4660u0(b16, 1));
        this.f30483k = b17;
        Pc.a b18 = Jb.d.b(new Fo(b13, b16));
        this.f30484l = b18;
        B6 b62 = new B6(a11, b15, b17, b18, new C4809z8(1));
        this.f30485m = b62;
        Pc.a b19 = Jb.d.b(new Zq(b12, b62));
        this.f30486n = b19;
        Pc.a b21 = Jb.d.b(new C4715vq(c4118b6, b19, b17, Jb.d.b(new Br()), b18));
        this.f30487o = b21;
        Mm mm = new Mm(b21, new C4638t7());
        Pc.a b22 = Jb.d.b(new C4423ln(b14, b11));
        this.f30488p = b22;
        Pc.a b23 = Jb.d.b(new Ln(mm, b22, Jb.d.b(new Sj())));
        this.f30489q = b23;
        Pc.a b24 = Jb.d.b(new C4511oo(aVar2, b23));
        this.f30490r = b24;
        this.f30491s = Jb.d.b(new C4764xj(a11, b24));
        C4627sp c4627sp = new C4627sp(new C4135bn(b24, 1));
        X7 x72 = new X7();
        this.f30492t = x72;
        this.f30493u = new T4(c4627sp, x72, new R6(k0Var), b17, b62);
        this.f30494v = new C4252fp(new Go(a11, b24), new Lp());
        this.f30495w = Jb.d.b(new C4453mo(a11, b15));
        this.f30496x = new C4093aa(c8060b);
    }

    public final Sh a() {
        return new Sh(this.f30473a, (l5.g) this.f30491s.get());
    }

    public final void b(SPaySdkApp sPaySdkApp) {
        sPaySdkApp.sPaySdkMerchantOptionsRepository = (T8) this.f30476d.get();
        sPaySdkApp.securePreferences = (Nh) this.f30478f.get();
        sPaySdkApp.defaultPreferences = (Ma) this.f30479g.get();
        sPaySdkApp.loggingContract = (Tf) this.f30480h.get();
    }

    public final Te c() {
        C4248fl featuresHandler = (C4248fl) this.f30481i.get();
        Vm sPayDataContract = (Vm) this.f30483k.get();
        InterfaceC4436m7 userIdManager = (InterfaceC4436m7) this.f30484l.get();
        C4515p clientProvider = new C4515p();
        Context context = this.f30473a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(userIdManager, "userIdManager");
        Intrinsics.checkNotNullParameter(clientProvider, "clientProvider");
        return new Te(context, featuresHandler, sPayDataContract, userIdManager, clientProvider);
    }
}
