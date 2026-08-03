package g;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3008a;

    /* renamed from: b, reason: collision with root package name */
    public final g.j f3009b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3010c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3011d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f3012e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3014g;

    /* renamed from: h, reason: collision with root package name */
    public g.o f3015h;

    /* renamed from: i, reason: collision with root package name */
    public g.l f3016i;

    /* renamed from: j, reason: collision with root package name */
    public g.m f3017j;

    /* renamed from: f, reason: collision with root package name */
    public int f3013f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final g.m f3018k = new g.m(this);

    public n(int i2, android.content.Context context, android.view.View view, g.j jVar, boolean z2) {
        this.f3008a = context;
        this.f3009b = jVar;
        this.f3012e = view;
        this.f3010c = z2;
        this.f3011d = i2;
    }

    public final g.l a() {
        g.l sVar;
        if (this.f3016i == null) {
            android.content.Context context = this.f3008a;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            if (java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new g.g(context, this.f3012e, this.f3011d, this.f3010c);
            } else {
                android.view.View view = this.f3012e;
                android.content.Context context2 = this.f3008a;
                boolean z2 = this.f3010c;
                sVar = new g.s(this.f3011d, context2, view, this.f3009b, z2);
            }
            sVar.l(this.f3009b);
            sVar.r(this.f3018k);
            sVar.n(this.f3012e);
            sVar.d(this.f3015h);
            sVar.o(this.f3014g);
            sVar.p(this.f3013f);
            this.f3016i = sVar;
        }
        return this.f3016i;
    }

    public final boolean b() {
        g.l lVar = this.f3016i;
        return lVar != null && lVar.i();
    }

    public void c() {
        this.f3016i = null;
        g.m mVar = this.f3017j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        g.l a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f3013f;
            android.view.View view = this.f3012e;
            java.lang.reflect.Field field = y.x.f8478a;
            if ((android.view.Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f3012e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f3008a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3006a = new android.graphics.Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.c();
    }
}
