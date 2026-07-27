package J1;

import I1.AbstractActivityC0027d;
import T1.o;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f726a = new ArrayList();

    public h(AbstractActivityC0027d abstractActivityC0027d, String[] strArr) {
        N1.d dVar = (N1.d) A0.j.F().f66b;
        if (dVar.f999b) {
            return;
        }
        dVar.d(abstractActivityC0027d.getApplicationContext());
        dVar.a(abstractActivityC0027d.getApplicationContext(), strArr);
    }

    public final FlutterEngine a(g gVar) {
        FlutterEngine flutterEngine;
        AbstractActivityC0027d abstractActivityC0027d = gVar.f721a;
        K1.a aVar = gVar.f722b;
        String str = gVar.f723c;
        List<String> list = gVar.f724d;
        r rVar = new r();
        boolean z3 = gVar.f725e;
        boolean z4 = gVar.f;
        if (aVar == null) {
            N1.d dVar = (N1.d) A0.j.F().f66b;
            if (!dVar.f999b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new K1.a(dVar.f1002e.f989b, "main");
        }
        K1.a aVar2 = aVar;
        ArrayList arrayList = this.f726a;
        if (arrayList.size() == 0) {
            flutterEngine = new FlutterEngine(abstractActivityC0027d, null, rVar, z3, z4);
            if (str != null) {
                ((o) flutterEngine.f9105i.f729b).a("setInitialRoute", str, null);
            }
            flutterEngine.f9100c.a(aVar2, list);
        } else {
            FlutterEngine flutterEngine2 = (FlutterEngine) arrayList.get(0);
            if (!flutterEngine2.f9098a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j3 = FlutterEngine.y;
            flutterEngine = new FlutterEngine(abstractActivityC0027d, flutterEngine2.f9098a.spawn(aVar2.f920c, aVar2.f919b, str, list, j3), rVar, z3, z4);
        }
        arrayList.add(flutterEngine);
        flutterEngine.f9118v.add(new f(this, flutterEngine));
        return flutterEngine;
    }
}
