package Q0;

/* loaded from: classes.dex */
public final class a implements Q0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.FlutterEngine f1582a;

    public a(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        this.f1582a = flutterEngine;
    }

    @Override // Q0.b
    public final void a() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f1582a;
        java.util.Iterator it = flutterEngine.f7635v.iterator();
        while (it.hasNext()) {
            ((Q0.b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.k kVar = flutterEngine.f7633s;
            android.util.SparseArray sparseArray = kVar.f7776k;
            if (sparseArray.size() <= 0) {
                break;
            }
            kVar.f7785u.k(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = flutterEngine.t;
            android.util.SparseArray sparseArray2 = jVar.f7758g;
            if (sparseArray2.size() <= 0) {
                flutterEngine.f7625k.f1911b = null;
                return;
            } else {
                jVar.f7765n.k(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // Q0.b
    public final void b() {
    }
}
