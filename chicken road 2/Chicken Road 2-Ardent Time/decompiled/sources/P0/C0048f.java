package P0;

/* renamed from: P0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048f implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1344b;

    public /* synthetic */ C0048f(int i2, java.lang.Object obj) {
        this.f1343a = i2;
        this.f1344b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f1343a) {
            case 0:
                P0.C0050h c0050h = (P0.C0050h) this.f1344b;
                c0050h.f1347a.getClass();
                c0050h.f1354h = false;
                break;
            case 1:
                P0.t tVar = (P0.t) this.f1344b;
                tVar.f1393h = false;
                java.util.Iterator it = tVar.f1392g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f1344b).f7678c = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f1343a) {
            case 0:
                P0.C0050h c0050h = (P0.C0050h) this.f1344b;
                P0.AbstractActivityC0047e abstractActivityC0047e = c0050h.f1347a;
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0047e.reportFullyDrawn();
                } else {
                    abstractActivityC0047e.getClass();
                }
                c0050h.f1354h = true;
                c0050h.f1355i = true;
                break;
            case 1:
                P0.t tVar = (P0.t) this.f1344b;
                tVar.f1393h = true;
                java.util.Iterator it = tVar.f1392g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case 2:
                P0.J j2 = (P0.J) this.f1344b;
                j2.f1325a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = j2.f1326b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f1344b).f7678c = true;
                break;
        }
    }

    private final void c() {
    }
}
