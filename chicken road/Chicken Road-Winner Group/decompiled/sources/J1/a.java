package J1;

import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f695a;

    public a(FlutterEngine flutterEngine) {
        this.f695a = flutterEngine;
    }

    @Override // J1.b
    public final void b() {
        FlutterEngine flutterEngine = this.f695a;
        Iterator it = flutterEngine.f9118v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        while (true) {
            r rVar = flutterEngine.f9115s;
            SparseArray sparseArray = rVar.f9311l;
            if (sparseArray.size() <= 0) {
                break;
            }
            rVar.f9322w.n(sparseArray.keyAt(0));
        }
        while (true) {
            q qVar = flutterEngine.f9116t;
            SparseArray sparseArray2 = qVar.f9291i;
            if (sparseArray2.size() <= 0) {
                flutterEngine.f9107k.f1429b = null;
                return;
            } else {
                qVar.f9299q.n(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // J1.b
    public final void a() {
    }
}
