package G;

import F.AbstractActivityC0005f;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f212a = new ArrayList();

    public j(AbstractActivityC0005f abstractActivityC0005f, String[] strArr) {
        K.d dVar = (K.d) E.b.d().f18a;
        if (dVar.f276b) {
            return;
        }
        dVar.d(abstractActivityC0005f.getApplicationContext());
        dVar.a(abstractActivityC0005f.getApplicationContext(), strArr);
    }

    public final c a(i iVar) {
        c cVar;
        Context context = iVar.f206a;
        H.a aVar = iVar.f207b;
        String str = iVar.f208c;
        List<String> list = iVar.f209d;
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        boolean z2 = iVar.f210e;
        boolean z3 = iVar.f211f;
        if (aVar == null) {
            K.d dVar = (K.d) E.b.d().f18a;
            if (!dVar.f276b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new H.a(dVar.f279e.f267b, "main");
        }
        H.a aVar2 = aVar;
        ArrayList arrayList = this.f212a;
        if (arrayList.size() == 0) {
            cVar = new c(context, null, kVar, z2, z3);
            if (str != null) {
                cVar.f158i.f283a.e("setInitialRoute", str, null);
            }
            cVar.f152c.a(aVar2, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f150a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            cVar = new c(context, cVar2.f150a.spawn(aVar2.f219c, aVar2.f218b, str, list, c.f148y), kVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.v.add(new h(this, cVar));
        return cVar;
    }
}
