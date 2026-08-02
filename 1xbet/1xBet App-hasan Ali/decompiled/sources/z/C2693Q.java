package z;

import android.view.View;
import game.betting133.sports1xbet.R;
import java.util.WeakHashMap;
import n1.C2163d;
import n1.k0;
import r.C2322H;

/* renamed from: z.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2693Q {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f21496u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C2699a f21497a = C2700b.d("captionBar", 4);

    /* renamed from: b, reason: collision with root package name */
    public final C2699a f21498b;

    /* renamed from: c, reason: collision with root package name */
    public final C2699a f21499c;

    /* renamed from: d, reason: collision with root package name */
    public final C2699a f21500d;

    /* renamed from: e, reason: collision with root package name */
    public final C2699a f21501e;
    public final C2699a f;

    /* renamed from: g, reason: collision with root package name */
    public final C2699a f21502g;

    /* renamed from: h, reason: collision with root package name */
    public final C2699a f21503h;
    public final C2699a i;

    /* renamed from: j, reason: collision with root package name */
    public final C2691O f21504j;

    /* renamed from: k, reason: collision with root package name */
    public final C2691O f21505k;

    /* renamed from: l, reason: collision with root package name */
    public final C2691O f21506l;

    /* renamed from: m, reason: collision with root package name */
    public final C2691O f21507m;

    /* renamed from: n, reason: collision with root package name */
    public final C2691O f21508n;

    /* renamed from: o, reason: collision with root package name */
    public final C2691O f21509o;

    /* renamed from: p, reason: collision with root package name */
    public final C2691O f21510p;

    /* renamed from: q, reason: collision with root package name */
    public final C2691O f21511q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21512r;

    /* renamed from: s, reason: collision with root package name */
    public int f21513s;

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC2722x f21514t;

    public C2693Q(View view) {
        C2699a d5 = C2700b.d("displayCutout", 128);
        this.f21498b = d5;
        C2699a d6 = C2700b.d("ime", 8);
        this.f21499c = d6;
        C2699a d7 = C2700b.d("mandatorySystemGestures", 32);
        this.f21500d = d7;
        this.f21501e = C2700b.d("navigationBars", 2);
        this.f = C2700b.d("statusBars", 1);
        C2699a d8 = C2700b.d("systemBars", 519);
        this.f21502g = d8;
        C2699a d9 = C2700b.d("systemGestures", 16);
        this.f21503h = d9;
        C2699a d10 = C2700b.d("tappableElement", 64);
        this.i = d10;
        C2691O c2691o = new C2691O(new C2724z(0, 0, 0, 0), "waterfall");
        this.f21504j = c2691o;
        new C2689M(new C2689M(d8, d6), d5);
        new C2689M(new C2689M(new C2689M(d10, d7), d9), c2691o);
        this.f21505k = C2700b.e("captionBarIgnoringVisibility", 4);
        this.f21506l = C2700b.e("navigationBarsIgnoringVisibility", 2);
        this.f21507m = C2700b.e("statusBarsIgnoringVisibility", 1);
        this.f21508n = C2700b.e("systemBarsIgnoringVisibility", 519);
        this.f21509o = C2700b.e("tappableElementIgnoringVisibility", 64);
        this.f21510p = C2700b.e("imeAnimationTarget", 8);
        this.f21511q = C2700b.e("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f21512r = bool != null ? bool.booleanValue() : true;
        this.f21514t = new RunnableC2722x(this);
    }

    public static void a(C2693Q c2693q, k0 k0Var) {
        boolean z3 = false;
        c2693q.f21497a.f(k0Var, 0);
        c2693q.f21499c.f(k0Var, 0);
        c2693q.f21498b.f(k0Var, 0);
        c2693q.f21501e.f(k0Var, 0);
        c2693q.f.f(k0Var, 0);
        c2693q.f21502g.f(k0Var, 0);
        c2693q.f21503h.f(k0Var, 0);
        c2693q.i.f(k0Var, 0);
        c2693q.f21500d.f(k0Var, 0);
        c2693q.f21505k.f(AbstractC2701c.f(k0Var.f18442a.j(4)));
        c2693q.f21506l.f(AbstractC2701c.f(k0Var.f18442a.j(2)));
        c2693q.f21507m.f(AbstractC2701c.f(k0Var.f18442a.j(1)));
        c2693q.f21508n.f(AbstractC2701c.f(k0Var.f18442a.j(519)));
        c2693q.f21509o.f(AbstractC2701c.f(k0Var.f18442a.j(64)));
        C2163d h3 = k0Var.f18442a.h();
        if (h3 != null) {
            c2693q.f21504j.f(AbstractC2701c.f(h3.a()));
        }
        synchronized (Z.l.f6208c) {
            C2322H c2322h = Z.l.f6213j.f6178h;
            if (c2322h != null) {
                if (c2322h.h()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            Z.l.a();
        }
    }
}
