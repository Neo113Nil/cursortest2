package x2;

import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.l;
import io.flutter.plugin.platform.m;
import java.util.Iterator;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538a implements InterfaceC1539b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f12270a;

    public C1538a(FlutterEngine flutterEngine) {
        this.f12270a = flutterEngine;
    }

    @Override // x2.InterfaceC1539b
    public final void b() {
        FlutterEngine flutterEngine = this.f12270a;
        Iterator it = flutterEngine.f10103v.iterator();
        while (it.hasNext()) {
            ((InterfaceC1539b) it.next()).b();
        }
        while (true) {
            m mVar = flutterEngine.f10100s;
            SparseArray sparseArray = mVar.f10245k;
            if (sparseArray.size() <= 0) {
                break;
            }
            mVar.f10255u.r(sparseArray.keyAt(0));
        }
        while (true) {
            l lVar = flutterEngine.f10101t;
            SparseArray sparseArray2 = lVar.f10227g;
            if (sparseArray2.size() <= 0) {
                flutterEngine.f10092k.f971b = null;
                return;
            } else {
                lVar.f10234n.C(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // x2.InterfaceC1539b
    public final void a() {
    }
}
