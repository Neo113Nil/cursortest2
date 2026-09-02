package t0;

import io.flutter.embedding.engine.FlutterEngine;
import java.util.ArrayList;
import java.util.List;
import u0.C0839a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6689a = new ArrayList();

    public g(s0.d dVar, String[] strArr) {
        x0.d dVar2 = (x0.d) C0.b.i().f54b;
        if (dVar2.f6788b) {
            return;
        }
        dVar2.d(dVar.getApplicationContext());
        dVar2.a(dVar.getApplicationContext(), strArr);
    }

    public final FlutterEngine a(f fVar) {
        C0839a c0839a;
        FlutterEngine flutterEngine;
        s0.d dVar = fVar.f6683a;
        C0839a c0839a2 = fVar.f6684b;
        String str = fVar.f6685c;
        List<String> list = fVar.f6686d;
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        boolean z2 = fVar.f6687e;
        boolean z3 = fVar.f6688f;
        if (c0839a2 == null) {
            x0.d dVar2 = (x0.d) C0.b.i().f54b;
            if (!dVar2.f6788b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c0839a = new C0839a(dVar2.f6791e.f6779b, "main");
        } else {
            c0839a = c0839a2;
        }
        ArrayList arrayList = this.f6689a;
        if (arrayList.size() == 0) {
            flutterEngine = new FlutterEngine(dVar, null, jVar, z2, z3);
            if (str != null) {
                flutterEngine.f5727i.f57a.f("setInitialRoute", str, null);
            }
            flutterEngine.f5721c.a(c0839a, list);
        } else {
            FlutterEngine flutterEngine2 = (FlutterEngine) arrayList.get(0);
            if (!flutterEngine2.f5719a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = FlutterEngine.f5717y;
            flutterEngine = new FlutterEngine(dVar, flutterEngine2.f5719a.spawn(c0839a.f6696c, c0839a.f6695b, str, list, j2), jVar, z2, z3);
        }
        arrayList.add(flutterEngine);
        flutterEngine.f5740v.add(new e(this, flutterEngine));
        return flutterEngine;
    }
}
