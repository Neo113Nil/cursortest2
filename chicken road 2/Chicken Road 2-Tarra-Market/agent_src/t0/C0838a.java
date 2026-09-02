package t0;

import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.Iterator;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f6663a;

    public C0838a(FlutterEngine flutterEngine) {
        this.f6663a = flutterEngine;
    }

    @Override // t0.b
    public final void a() {
        FlutterEngine flutterEngine = this.f6663a;
        Iterator it = flutterEngine.f5740v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = flutterEngine.f5737s;
            SparseArray sparseArray = jVar.f5888k;
            if (sparseArray.size() <= 0) {
                break;
            }
            jVar.f5898u.n(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.i iVar = flutterEngine.f5738t;
            SparseArray sparseArray2 = iVar.f5870g;
            if (sparseArray2.size() <= 0) {
                flutterEngine.f5729k.f106b = null;
                return;
            } else {
                iVar.f5877n.n(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // t0.b
    public final void b() {
    }
}
