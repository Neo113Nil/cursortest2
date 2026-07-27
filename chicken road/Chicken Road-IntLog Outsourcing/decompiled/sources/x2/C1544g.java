package x2;

import H2.o;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.m;
import java.util.ArrayList;
import java.util.List;
import w2.AbstractActivityC1515c;
import y2.C1556a;

/* renamed from: x2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12296a = new ArrayList();

    public C1544g(AbstractActivityC1515c abstractActivityC1515c, String[] strArr) {
        B2.e eVar = (B2.e) B4.i.K().f311b;
        if (eVar.f252b) {
            return;
        }
        eVar.d(abstractActivityC1515c.getApplicationContext());
        eVar.a(abstractActivityC1515c.getApplicationContext(), strArr);
    }

    public final FlutterEngine a(C1543f c1543f) {
        C1556a c1556a;
        FlutterEngine flutterEngine;
        AbstractActivityC1515c abstractActivityC1515c = c1543f.f12290a;
        C1556a c1556a2 = c1543f.f12291b;
        String str = c1543f.f12292c;
        List<String> list = c1543f.f12293d;
        m mVar = new m();
        boolean z = c1543f.f12294e;
        boolean z5 = c1543f.f12295f;
        if (c1556a2 == null) {
            B2.e eVar = (B2.e) B4.i.K().f311b;
            if (!eVar.f252b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c1556a = new C1556a((String) eVar.f255e.f241c, "main");
        } else {
            c1556a = c1556a2;
        }
        ArrayList arrayList = this.f12296a;
        if (arrayList.size() == 0) {
            flutterEngine = new FlutterEngine(abstractActivityC1515c, null, mVar, z, z5);
            if (str != null) {
                ((o) flutterEngine.f10090i.f5783b).a("setInitialRoute", str, null);
            }
            flutterEngine.f10084c.a(c1556a, list);
        } else {
            FlutterEngine flutterEngine2 = (FlutterEngine) arrayList.get(0);
            if (!flutterEngine2.f10082a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = FlutterEngine.f10081y;
            flutterEngine = new FlutterEngine(abstractActivityC1515c, flutterEngine2.f10082a.spawn(c1556a.f12345c, c1556a.f12344b, str, list, j2), mVar, z, z5);
        }
        arrayList.add(flutterEngine);
        flutterEngine.f10103v.add(new C1542e(this, flutterEngine));
        return flutterEngine;
    }
}
