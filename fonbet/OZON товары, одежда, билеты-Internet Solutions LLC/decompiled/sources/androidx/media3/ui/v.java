package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class v {

    /* renamed from: A, reason: collision with root package name */
    private boolean f44376A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f44377B;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.media3.ui.d f44379a;

    /* renamed from: b, reason: collision with root package name */
    private final View f44380b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f44381c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewGroup f44382d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f44383e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f44384f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f44385g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f44386h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f44387i;

    /* renamed from: j, reason: collision with root package name */
    private final View f44388j;

    /* renamed from: k, reason: collision with root package name */
    private final View f44389k;

    /* renamed from: l, reason: collision with root package name */
    private final AnimatorSet f44390l;

    /* renamed from: m, reason: collision with root package name */
    private final AnimatorSet f44391m;

    /* renamed from: n, reason: collision with root package name */
    private final AnimatorSet f44392n;

    /* renamed from: o, reason: collision with root package name */
    private final AnimatorSet f44393o;

    /* renamed from: p, reason: collision with root package name */
    private final AnimatorSet f44394p;

    /* renamed from: q, reason: collision with root package name */
    private final ValueAnimator f44395q;

    /* renamed from: r, reason: collision with root package name */
    private final ValueAnimator f44396r;

    /* renamed from: s, reason: collision with root package name */
    private final androidx.media3.ui.i f44397s = new Runnable() { // from class: androidx.media3.ui.i
        @Override // java.lang.Runnable
        public final void run() {
            v.this.Q();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final o f44398t = new Runnable() { // from class: androidx.media3.ui.o
        @Override // java.lang.Runnable
        public final void run() {
            v.j(v.this);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final p f44399u = new Runnable() { // from class: androidx.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            v.e(v.this);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final q f44400v = new Runnable() { // from class: androidx.media3.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            v.g(v.this);
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private final r f44401w = new Runnable() { // from class: androidx.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            v.h(v.this);
        }
    };

    /* renamed from: x, reason: collision with root package name */
    private final s f44402x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.s
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            v.k(v.this, view, i11, i13, i15, i17);
        }
    };

    /* renamed from: C, reason: collision with root package name */
    private boolean f44378C = true;

    /* renamed from: z, reason: collision with root package name */
    private int f44404z = 0;

    /* renamed from: y, reason: collision with root package name */
    private final ArrayList f44403y = new ArrayList();

    final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = v.this;
            if (vVar.f44380b != null) {
                vVar.f44380b.setVisibility(4);
            }
            if (vVar.f44381c != null) {
                vVar.f44381c.setVisibility(4);
            }
            if (vVar.f44383e != null) {
                vVar.f44383e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v vVar = v.this;
            if (!(vVar.f44388j instanceof androidx.media3.ui.b) || vVar.f44376A) {
                return;
            }
            ((androidx.media3.ui.b) vVar.f44388j).f();
        }
    }

    final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v vVar = v.this;
            if (vVar.f44380b != null) {
                vVar.f44380b.setVisibility(0);
            }
            if (vVar.f44381c != null) {
                vVar.f44381c.setVisibility(0);
            }
            if (vVar.f44383e != null) {
                vVar.f44383e.setVisibility(vVar.f44376A ? 0 : 4);
            }
            if (!(vVar.f44388j instanceof androidx.media3.ui.b) || vVar.f44376A) {
                return;
            }
            ((androidx.media3.ui.b) vVar.f44388j).j();
        }
    }

    final class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.d f44407a;

        c(androidx.media3.ui.d dVar) {
            this.f44407a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = v.this;
            vVar.N(1);
            if (vVar.f44377B) {
                this.f44407a.post(vVar.f44397s);
                vVar.f44377B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v.this.N(3);
        }
    }

    final class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.d f44409a;

        d(androidx.media3.ui.d dVar) {
            this.f44409a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = v.this;
            vVar.N(2);
            if (vVar.f44377B) {
                this.f44409a.post(vVar.f44397s);
                vVar.f44377B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v.this.N(3);
        }
    }

    final class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.d f44411a;

        e(androidx.media3.ui.d dVar) {
            this.f44411a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = v.this;
            vVar.N(2);
            if (vVar.f44377B) {
                this.f44411a.post(vVar.f44397s);
                vVar.f44377B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v.this.N(3);
        }
    }

    final class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v.this.N(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v.this.N(4);
        }
    }

    final class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v.this.N(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v.this.N(4);
        }
    }

    final class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = v.this;
            if (vVar.f44384f != null) {
                vVar.f44384f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v vVar = v.this;
            if (vVar.f44386h != null) {
                vVar.f44386h.setVisibility(0);
                vVar.f44386h.setTranslationX(vVar.f44386h.getWidth());
                vVar.f44386h.scrollTo(vVar.f44386h.getWidth(), 0);
            }
        }
    }

    final class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = v.this;
            if (vVar.f44386h != null) {
                vVar.f44386h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v vVar = v.this;
            if (vVar.f44384f != null) {
                vVar.f44384f.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.ui.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media3.ui.o] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.ui.p] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.ui.q] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.media3.ui.r] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.media3.ui.s] */
    public v(androidx.media3.ui.d dVar) {
        this.f44379a = dVar;
        this.f44380b = dVar.findViewById(R.id.exo_controls_background);
        this.f44381c = (ViewGroup) dVar.findViewById(R.id.exo_center_controls);
        this.f44383e = (ViewGroup) dVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) dVar.findViewById(R.id.exo_bottom_bar);
        this.f44382d = viewGroup;
        this.f44387i = (ViewGroup) dVar.findViewById(R.id.exo_time);
        View findViewById = dVar.findViewById(R.id.exo_progress);
        this.f44388j = findViewById;
        this.f44384f = (ViewGroup) dVar.findViewById(R.id.exo_basic_controls);
        this.f44385g = (ViewGroup) dVar.findViewById(R.id.exo_extra_controls);
        this.f44386h = (ViewGroup) dVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = dVar.findViewById(R.id.exo_overflow_show);
        this.f44389k = findViewById2;
        View findViewById3 = dVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v.m(v.this, view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v.m(v.this, view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v.d(v.this, valueAnimator);
            }
        });
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v.f(v.this, valueAnimator);
            }
        });
        ofFloat2.addListener(new b());
        Resources resources = dVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44390l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(dVar));
        animatorSet.play(ofFloat).with(E(findViewById, 0.0f, dimension)).with(E(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44391m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(dVar));
        animatorSet2.play(E(findViewById, dimension, dimension2)).with(E(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f44392n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(dVar));
        animatorSet3.play(ofFloat).with(E(findViewById, 0.0f, dimension2)).with(E(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f44393o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(E(findViewById, dimension, 0.0f)).with(E(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f44394p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(E(findViewById, dimension2, 0.0f)).with(E(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44395q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v.a(v.this, valueAnimator);
            }
        });
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f44396r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v.l(v.this, valueAnimator);
            }
        });
        ofFloat4.addListener(new i());
    }

    private static int A(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    private static ObjectAnimator E(View view, float f7, float f11) {
        return ObjectAnimator.ofFloat(view, "translationY", f7, f11);
    }

    private void I(Runnable runnable, long j11) {
        if (j11 >= 0) {
            this.f44379a.postDelayed(runnable, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i11) {
        int i12 = this.f44404z;
        this.f44404z = i11;
        androidx.media3.ui.d dVar = this.f44379a;
        if (i11 == 2) {
            dVar.setVisibility(8);
        } else if (i12 == 2) {
            dVar.setVisibility(0);
        }
        if (i12 != i11) {
            dVar.i0();
        }
    }

    private static boolean O(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (!this.f44378C) {
            N(0);
            K();
            return;
        }
        int i11 = this.f44404z;
        if (i11 == 1) {
            this.f44393o.start();
        } else if (i11 == 2) {
            this.f44394p.start();
        } else if (i11 == 3) {
            this.f44377B = true;
        } else if (i11 == 4) {
            return;
        }
        K();
    }

    public static /* synthetic */ void a(v vVar, ValueAnimator valueAnimator) {
        vVar.getClass();
        vVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void b(v vVar) {
        ViewGroup viewGroup = vVar.f44383e;
        if (viewGroup != null) {
            viewGroup.setVisibility(vVar.f44376A ? 0 : 4);
        }
        View view = vVar.f44388j;
        if (view != null) {
            int dimensionPixelSize = vVar.f44379a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                if (vVar.f44376A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                view.setLayoutParams(marginLayoutParams);
            }
            if (view instanceof androidx.media3.ui.b) {
                androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
                if (vVar.f44376A) {
                    bVar.g(true);
                } else {
                    int i11 = vVar.f44404z;
                    if (i11 == 1) {
                        bVar.g(false);
                    } else if (i11 != 3) {
                        bVar.i();
                    }
                }
            }
        }
        Iterator it = vVar.f44403y.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            view2.setVisibility((vVar.f44376A && O(view2)) ? 4 : 0);
        }
    }

    public static /* synthetic */ void d(v vVar, ValueAnimator valueAnimator) {
        vVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = vVar.f44380b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = vVar.f44381c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = vVar.f44383e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static void e(v vVar) {
        vVar.f44391m.start();
    }

    public static /* synthetic */ void f(v vVar, ValueAnimator valueAnimator) {
        vVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = vVar.f44380b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = vVar.f44381c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = vVar.f44383e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static void g(v vVar) {
        vVar.f44390l.start();
        vVar.I(vVar.f44399u, 2000L);
    }

    public static void h(v vVar) {
        vVar.N(2);
    }

    public static void i(v vVar) {
        ViewGroup viewGroup;
        int i11;
        ViewGroup viewGroup2 = vVar.f44384f;
        if (viewGroup2 == null || (viewGroup = vVar.f44385g) == null) {
            return;
        }
        androidx.media3.ui.d dVar = vVar.f44379a;
        int width = (dVar.getWidth() - dVar.getPaddingLeft()) - dVar.getPaddingRight();
        while (true) {
            if (viewGroup.getChildCount() <= 1) {
                break;
            }
            int childCount = viewGroup.getChildCount() - 2;
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeViewAt(childCount);
            viewGroup2.addView(childAt, 0);
        }
        View view = vVar.f44389k;
        if (view != null) {
            view.setVisibility(8);
        }
        int A11 = A(vVar.f44387i);
        int childCount2 = viewGroup2.getChildCount() - 1;
        for (int i12 = 0; i12 < childCount2; i12++) {
            A11 += A(viewGroup2.getChildAt(i12));
        }
        if (A11 <= width) {
            ViewGroup viewGroup3 = vVar.f44386h;
            if (viewGroup3 == null || viewGroup3.getVisibility() != 0) {
                return;
            }
            ValueAnimator valueAnimator = vVar.f44396r;
            if (valueAnimator.isStarted()) {
                return;
            }
            vVar.f44395q.cancel();
            valueAnimator.start();
            return;
        }
        if (view != null) {
            view.setVisibility(0);
            A11 += A(view);
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = viewGroup2.getChildAt(i13);
            A11 -= A(childAt2);
            arrayList.add(childAt2);
            if (A11 <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        viewGroup2.removeViews(0, arrayList.size());
        for (i11 = 0; i11 < arrayList.size(); i11++) {
            viewGroup.addView((View) arrayList.get(i11), viewGroup.getChildCount() - 1);
        }
    }

    public static void j(v vVar) {
        vVar.f44392n.start();
    }

    public static void k(final v vVar, View view, int i11, int i12, int i13, int i14) {
        int height;
        int height2;
        androidx.media3.ui.d dVar = vVar.f44379a;
        int width = (dVar.getWidth() - dVar.getPaddingLeft()) - dVar.getPaddingRight();
        int height3 = (dVar.getHeight() - dVar.getPaddingBottom()) - dVar.getPaddingTop();
        ViewGroup viewGroup = vVar.f44381c;
        int A11 = A(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
        if (viewGroup == null) {
            height = 0;
        } else {
            height = viewGroup.getHeight();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
        int max = Math.max(A11, A(vVar.f44387i) + A(vVar.f44389k));
        ViewGroup viewGroup2 = vVar.f44382d;
        if (viewGroup2 == null) {
            height2 = 0;
        } else {
            height2 = viewGroup2.getHeight();
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            }
        }
        boolean z11 = width <= max || height3 <= (height2 * 2) + paddingBottom;
        if (vVar.f44376A != z11) {
            vVar.f44376A = z11;
            view.post(new Runnable() { // from class: androidx.media3.ui.k
                @Override // java.lang.Runnable
                public final void run() {
                    v.b(v.this);
                }
            });
        }
        boolean z12 = i12 - i11 != i14 - i13;
        if (vVar.f44376A || !z12) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.l
            @Override // java.lang.Runnable
            public final void run() {
                v.i(v.this);
            }
        });
    }

    public static /* synthetic */ void l(v vVar, ValueAnimator valueAnimator) {
        vVar.getClass();
        vVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void m(v vVar, View view) {
        vVar.K();
        if (view.getId() == R.id.exo_overflow_show) {
            vVar.f44395q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            vVar.f44396r.start();
        }
    }

    private void y(float f7) {
        ViewGroup viewGroup = this.f44386h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f7) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f44387i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f7);
        }
        ViewGroup viewGroup3 = this.f44384f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f7);
        }
    }

    public final void B() {
        int i11 = this.f44404z;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        J();
        if (!this.f44378C) {
            N(2);
        } else if (this.f44404z == 1) {
            this.f44391m.start();
        } else {
            this.f44392n.start();
        }
    }

    public final void C() {
        int i11 = this.f44404z;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        J();
        N(2);
    }

    public final boolean D() {
        return this.f44404z == 0 && this.f44379a.h0();
    }

    public final void F() {
        this.f44379a.addOnLayoutChangeListener(this.f44402x);
    }

    public final void G() {
        this.f44379a.removeOnLayoutChangeListener(this.f44402x);
    }

    public final void H(int i11, int i12, int i13, int i14) {
        View view = this.f44380b;
        if (view != null) {
            view.layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    public final void J() {
        r rVar = this.f44401w;
        androidx.media3.ui.d dVar = this.f44379a;
        dVar.removeCallbacks(rVar);
        dVar.removeCallbacks(this.f44398t);
        dVar.removeCallbacks(this.f44400v);
        dVar.removeCallbacks(this.f44399u);
    }

    public final void K() {
        if (this.f44404z == 3) {
            return;
        }
        J();
        int c02 = this.f44379a.c0();
        if (c02 > 0) {
            if (!this.f44378C) {
                I(this.f44401w, c02);
            } else if (this.f44404z == 1) {
                I(this.f44399u, 2000L);
            } else {
                I(this.f44400v, c02);
            }
        }
    }

    public final void L(boolean z11) {
        this.f44378C = z11;
    }

    public final void M(View view, boolean z11) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f44403y;
        if (!z11) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f44376A && O(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void P() {
        androidx.media3.ui.d dVar = this.f44379a;
        if (!dVar.h0()) {
            dVar.setVisibility(0);
            dVar.n0();
            dVar.j0();
        }
        Q();
    }

    public final boolean z(View view) {
        return view != null && this.f44403y.contains(view);
    }
}
