package B;

import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f804h;

    public h() {
        k kVar = new k();
        kVar.f885a = false;
        kVar.f886b = 0;
        kVar.f887c = 0;
        kVar.f888d = 1.0f;
        kVar.f889e = Float.NaN;
        this.f799c = kVar;
        j jVar = new j();
        jVar.f873a = false;
        jVar.f874b = -1;
        jVar.f875c = 0;
        jVar.f876d = null;
        jVar.f877e = -1;
        jVar.f878f = 0;
        jVar.f879g = Float.NaN;
        jVar.f880h = Float.NaN;
        jVar.f881i = Float.NaN;
        jVar.j = -1;
        jVar.f882k = null;
        jVar.f883l = -3;
        jVar.f884m = -1;
        this.f800d = jVar;
        i iVar = new i();
        iVar.f832a = false;
        iVar.f834b = false;
        iVar.f839e = -1;
        iVar.f841f = -1;
        iVar.f843g = -1.0f;
        iVar.f845h = true;
        iVar.f847i = -1;
        iVar.j = -1;
        iVar.f850k = -1;
        iVar.f852l = -1;
        iVar.f854m = -1;
        iVar.f856n = -1;
        iVar.f858o = -1;
        iVar.f860p = -1;
        iVar.f862q = -1;
        iVar.f863r = -1;
        iVar.f864s = -1;
        iVar.f865t = -1;
        iVar.f866u = -1;
        iVar.f867v = -1;
        iVar.f868w = -1;
        iVar.f869x = 0.5f;
        iVar.f870y = 0.5f;
        iVar.f871z = null;
        iVar.f806A = -1;
        iVar.f807B = 0;
        iVar.f808C = 0.0f;
        iVar.f809D = -1;
        iVar.f810E = -1;
        iVar.f811F = -1;
        iVar.f812G = 0;
        iVar.f813H = 0;
        iVar.f814I = 0;
        iVar.f815J = 0;
        iVar.f816K = 0;
        iVar.f817L = 0;
        iVar.f818M = 0;
        iVar.f819N = Integer.MIN_VALUE;
        iVar.f820O = Integer.MIN_VALUE;
        iVar.f821P = Integer.MIN_VALUE;
        iVar.f822Q = Integer.MIN_VALUE;
        iVar.f823R = Integer.MIN_VALUE;
        iVar.f824S = Integer.MIN_VALUE;
        iVar.f825T = Integer.MIN_VALUE;
        iVar.f826U = -1.0f;
        iVar.f827V = -1.0f;
        iVar.f828W = 0;
        iVar.f829X = 0;
        iVar.f830Y = 0;
        iVar.f831Z = 0;
        iVar.f833a0 = 0;
        iVar.f835b0 = 0;
        iVar.c0 = 0;
        iVar.f838d0 = 0;
        iVar.f840e0 = 1.0f;
        iVar.f842f0 = 1.0f;
        iVar.f844g0 = -1;
        iVar.f846h0 = 0;
        iVar.f848i0 = -1;
        iVar.f855m0 = false;
        iVar.f857n0 = false;
        iVar.f859o0 = true;
        iVar.f861p0 = 0;
        this.f801e = iVar;
        l lVar = new l();
        lVar.f891a = false;
        lVar.f892b = 0.0f;
        lVar.f893c = 0.0f;
        lVar.f894d = 0.0f;
        lVar.f895e = 1.0f;
        lVar.f896f = 1.0f;
        lVar.f897g = Float.NaN;
        lVar.f898h = Float.NaN;
        lVar.f899i = -1;
        lVar.j = 0.0f;
        lVar.f900k = 0.0f;
        lVar.f901l = 0.0f;
        lVar.f902m = false;
        lVar.f903n = 0.0f;
        this.f802f = lVar;
        this.f803g = new HashMap();
    }

    public final void a(c cVar) {
        i iVar = this.f801e;
        cVar.f734e = iVar.f847i;
        cVar.f736f = iVar.j;
        cVar.f738g = iVar.f850k;
        cVar.f740h = iVar.f852l;
        cVar.f742i = iVar.f854m;
        cVar.j = iVar.f856n;
        cVar.f745k = iVar.f858o;
        cVar.f747l = iVar.f860p;
        cVar.f749m = iVar.f862q;
        cVar.f751n = iVar.f863r;
        cVar.f753o = iVar.f864s;
        cVar.f760s = iVar.f865t;
        cVar.f761t = iVar.f866u;
        cVar.f762u = iVar.f867v;
        cVar.f763v = iVar.f868w;
        ((ViewGroup.MarginLayoutParams) cVar).leftMargin = iVar.f812G;
        ((ViewGroup.MarginLayoutParams) cVar).rightMargin = iVar.f813H;
        ((ViewGroup.MarginLayoutParams) cVar).topMargin = iVar.f814I;
        ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = iVar.f815J;
        cVar.f701A = iVar.f824S;
        cVar.f702B = iVar.f823R;
        cVar.f765x = iVar.f820O;
        cVar.f767z = iVar.f822Q;
        cVar.f705E = iVar.f869x;
        cVar.f706F = iVar.f870y;
        cVar.f755p = iVar.f806A;
        cVar.f757q = iVar.f807B;
        cVar.f759r = iVar.f808C;
        cVar.f707G = iVar.f871z;
        cVar.f720T = iVar.f809D;
        cVar.f721U = iVar.f810E;
        cVar.f709I = iVar.f826U;
        cVar.f708H = iVar.f827V;
        cVar.f711K = iVar.f829X;
        cVar.f710J = iVar.f828W;
        cVar.f723W = iVar.f855m0;
        cVar.f724X = iVar.f857n0;
        cVar.f712L = iVar.f830Y;
        cVar.f713M = iVar.f831Z;
        cVar.f716P = iVar.f833a0;
        cVar.f717Q = iVar.f835b0;
        cVar.f714N = iVar.c0;
        cVar.f715O = iVar.f838d0;
        cVar.f718R = iVar.f840e0;
        cVar.f719S = iVar.f842f0;
        cVar.f722V = iVar.f811F;
        cVar.f731c = iVar.f843g;
        cVar.f727a = iVar.f839e;
        cVar.f729b = iVar.f841f;
        ((ViewGroup.MarginLayoutParams) cVar).width = iVar.f836c;
        ((ViewGroup.MarginLayoutParams) cVar).height = iVar.f837d;
        String str = iVar.f853l0;
        if (str != null) {
            cVar.f725Y = str;
        }
        cVar.f726Z = iVar.f861p0;
        cVar.setMarginStart(iVar.f817L);
        cVar.setMarginEnd(iVar.f816K);
        cVar.a();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        h hVar = new h();
        hVar.f801e.a(this.f801e);
        hVar.f800d.a(this.f800d);
        k kVar = hVar.f799c;
        k kVar2 = this.f799c;
        kVar.f885a = kVar2.f885a;
        kVar.f886b = kVar2.f886b;
        kVar.f888d = kVar2.f888d;
        kVar.f889e = kVar2.f889e;
        kVar.f887c = kVar2.f887c;
        hVar.f802f.a(this.f802f);
        hVar.f797a = this.f797a;
        hVar.f804h = this.f804h;
        return hVar;
    }

    public final void c(int i7, c cVar) {
        this.f797a = i7;
        int i8 = cVar.f734e;
        i iVar = this.f801e;
        iVar.f847i = i8;
        iVar.j = cVar.f736f;
        iVar.f850k = cVar.f738g;
        iVar.f852l = cVar.f740h;
        iVar.f854m = cVar.f742i;
        iVar.f856n = cVar.j;
        iVar.f858o = cVar.f745k;
        iVar.f860p = cVar.f747l;
        iVar.f862q = cVar.f749m;
        iVar.f863r = cVar.f751n;
        iVar.f864s = cVar.f753o;
        iVar.f865t = cVar.f760s;
        iVar.f866u = cVar.f761t;
        iVar.f867v = cVar.f762u;
        iVar.f868w = cVar.f763v;
        iVar.f869x = cVar.f705E;
        iVar.f870y = cVar.f706F;
        iVar.f871z = cVar.f707G;
        iVar.f806A = cVar.f755p;
        iVar.f807B = cVar.f757q;
        iVar.f808C = cVar.f759r;
        iVar.f809D = cVar.f720T;
        iVar.f810E = cVar.f721U;
        iVar.f811F = cVar.f722V;
        iVar.f843g = cVar.f731c;
        iVar.f839e = cVar.f727a;
        iVar.f841f = cVar.f729b;
        iVar.f836c = ((ViewGroup.MarginLayoutParams) cVar).width;
        iVar.f837d = ((ViewGroup.MarginLayoutParams) cVar).height;
        iVar.f812G = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        iVar.f813H = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        iVar.f814I = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        iVar.f815J = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        iVar.f818M = cVar.f704D;
        iVar.f826U = cVar.f709I;
        iVar.f827V = cVar.f708H;
        iVar.f829X = cVar.f711K;
        iVar.f828W = cVar.f710J;
        iVar.f855m0 = cVar.f723W;
        iVar.f857n0 = cVar.f724X;
        iVar.f830Y = cVar.f712L;
        iVar.f831Z = cVar.f713M;
        iVar.f833a0 = cVar.f716P;
        iVar.f835b0 = cVar.f717Q;
        iVar.c0 = cVar.f714N;
        iVar.f838d0 = cVar.f715O;
        iVar.f840e0 = cVar.f718R;
        iVar.f842f0 = cVar.f719S;
        iVar.f853l0 = cVar.f725Y;
        iVar.f820O = cVar.f765x;
        iVar.f822Q = cVar.f767z;
        iVar.f819N = cVar.f764w;
        iVar.f821P = cVar.f766y;
        iVar.f824S = cVar.f701A;
        iVar.f823R = cVar.f702B;
        iVar.f825T = cVar.f703C;
        iVar.f861p0 = cVar.f726Z;
        iVar.f816K = cVar.getMarginEnd();
        iVar.f817L = cVar.getMarginStart();
    }

    public final void d(int i7, n nVar) {
        c(i7, nVar);
        this.f799c.f888d = nVar.f917r0;
        float f7 = nVar.f920u0;
        l lVar = this.f802f;
        lVar.f892b = f7;
        lVar.f893c = nVar.f921v0;
        lVar.f894d = nVar.f922w0;
        lVar.f895e = nVar.f923x0;
        lVar.f896f = nVar.f924y0;
        lVar.f897g = nVar.f925z0;
        lVar.f898h = nVar.f913A0;
        lVar.j = nVar.f914B0;
        lVar.f900k = nVar.f915C0;
        lVar.f901l = nVar.f916D0;
        lVar.f903n = nVar.f919t0;
        lVar.f902m = nVar.f918s0;
    }
}
