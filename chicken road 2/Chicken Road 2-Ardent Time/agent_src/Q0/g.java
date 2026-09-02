package Q0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f1608a = new java.util.ArrayList();

    public g(P0.AbstractActivityC0047e abstractActivityC0047e, java.lang.String[] strArr) {
        U0.c cVar = (U0.c) I0.b.F().f657b;
        if (cVar.f1733b) {
            return;
        }
        cVar.d(abstractActivityC0047e.getApplicationContext());
        cVar.a(abstractActivityC0047e.getApplicationContext(), strArr);
    }

    public final io.flutter.embedding.engine.FlutterEngine a(Q0.f fVar) {
        R0.a aVar;
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        P0.AbstractActivityC0047e abstractActivityC0047e = fVar.f1602a;
        R0.a aVar2 = fVar.f1603b;
        java.lang.String str = fVar.f1604c;
        java.util.List<java.lang.String> list = fVar.f1605d;
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        boolean z2 = fVar.f1606e;
        boolean z3 = fVar.f1607f;
        if (aVar2 == null) {
            U0.c cVar = (U0.c) I0.b.F().f657b;
            if (!cVar.f1733b) {
                throw new java.lang.AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new R0.a((java.lang.String) cVar.f1736e.f1039c, "main");
        } else {
            aVar = aVar2;
        }
        java.util.ArrayList arrayList = this.f1608a;
        if (arrayList.size() == 0) {
            flutterEngine = new io.flutter.embedding.engine.FlutterEngine(abstractActivityC0047e, null, kVar, z2, z3);
            if (str != null) {
                flutterEngine.f7623i.f1866a.G("setInitialRoute", str, null);
            }
            flutterEngine.f7617c.a(aVar, list);
        } else {
            io.flutter.embedding.engine.FlutterEngine flutterEngine2 = (io.flutter.embedding.engine.FlutterEngine) arrayList.get(0);
            if (!flutterEngine2.f7615a.isAttached()) {
                throw new java.lang.IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = io.flutter.embedding.engine.FlutterEngine.f7613y;
            flutterEngine = new io.flutter.embedding.engine.FlutterEngine(abstractActivityC0047e, flutterEngine2.f7615a.spawn(aVar.f1653c, aVar.f1652b, str, list, j2), kVar, z2, z3);
        }
        arrayList.add(flutterEngine);
        flutterEngine.f7635v.add(new Q0.e(this, flutterEngine));
        return flutterEngine;
    }
}
