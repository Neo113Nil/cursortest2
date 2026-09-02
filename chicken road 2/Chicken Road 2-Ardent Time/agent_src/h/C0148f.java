package h;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148f extends g.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3149l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h.C0151i f3150m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148f(h.C0151i c0151i, android.content.Context context, g.j jVar, android.view.View view) {
        super(com.watchfacestudio.huasi_urx110.R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f3150m = c0151i;
        this.f3013f = 8388613;
        Z0.h hVar = c0151i.f3181v;
        this.f3015h = hVar;
        g.l lVar = this.f3016i;
        if (lVar != null) {
            lVar.d(hVar);
        }
    }

    @Override // g.n
    public final void c() {
        switch (this.f3149l) {
            case 0:
                h.C0151i c0151i = this.f3150m;
                c0151i.f3179s = null;
                c0151i.getClass();
                super.c();
                break;
            default:
                h.C0151i c0151i2 = this.f3150m;
                g.j jVar = c0151i2.f3163c;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0151i2.f3178r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148f(h.C0151i c0151i, android.content.Context context, g.t tVar, android.view.View view) {
        super(com.watchfacestudio.huasi_urx110.R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f3150m = c0151i;
        if (!tVar.f3038w.d()) {
            android.view.View view2 = c0151i.f3168h;
            this.f3012e = view2 == null ? c0151i.f3167g : view2;
        }
        Z0.h hVar = c0151i.f3181v;
        this.f3015h = hVar;
        g.l lVar = this.f3016i;
        if (lVar != null) {
            lVar.d(hVar);
        }
    }
}
