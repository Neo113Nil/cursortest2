package P;

/* renamed from: P.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042o extends L.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1295b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0042o(P.v vVar, int i2) {
        super(vVar);
        this.f1295b = i2;
    }

    @Override // L.b
    public final int b(android.view.View view) {
        switch (this.f1295b) {
            case 0:
                P.w wVar = (P.w) view.getLayoutParams();
                ((P.v) this.f972a).getClass();
                return view.getRight() + ((P.w) view.getLayoutParams()).f1309a.right + ((android.view.ViewGroup.MarginLayoutParams) wVar).rightMargin;
            default:
                P.w wVar2 = (P.w) view.getLayoutParams();
                ((P.v) this.f972a).getClass();
                return view.getBottom() + ((P.w) view.getLayoutParams()).f1309a.bottom + ((android.view.ViewGroup.MarginLayoutParams) wVar2).bottomMargin;
        }
    }

    @Override // L.b
    public final int c(android.view.View view) {
        switch (this.f1295b) {
            case 0:
                P.w wVar = (P.w) view.getLayoutParams();
                ((P.v) this.f972a).getClass();
                return (view.getLeft() - ((P.w) view.getLayoutParams()).f1309a.left) - ((android.view.ViewGroup.MarginLayoutParams) wVar).leftMargin;
            default:
                P.w wVar2 = (P.w) view.getLayoutParams();
                ((P.v) this.f972a).getClass();
                return (view.getTop() - ((P.w) view.getLayoutParams()).f1309a.top) - ((android.view.ViewGroup.MarginLayoutParams) wVar2).topMargin;
        }
    }

    @Override // L.b
    public final int d() {
        switch (this.f1295b) {
            case 0:
                P.v vVar = (P.v) this.f972a;
                return vVar.f1307f - vVar.t();
            default:
                P.v vVar2 = (P.v) this.f972a;
                return vVar2.f1308g - vVar2.r();
        }
    }

    @Override // L.b
    public final int e() {
        switch (this.f1295b) {
            case 0:
                return ((P.v) this.f972a).s();
            default:
                return ((P.v) this.f972a).u();
        }
    }

    @Override // L.b
    public final int f() {
        switch (this.f1295b) {
            case 0:
                P.v vVar = (P.v) this.f972a;
                return (vVar.f1307f - vVar.s()) - vVar.t();
            default:
                P.v vVar2 = (P.v) this.f972a;
                return (vVar2.f1308g - vVar2.u()) - vVar2.r();
        }
    }
}
