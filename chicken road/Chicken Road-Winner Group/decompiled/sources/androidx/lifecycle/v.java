package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import n.C1136b;
import n.C1137c;
import n.C1140f;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final y f2334a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final y f2335b = new y();

    /* renamed from: c, reason: collision with root package name */
    public static final y f2336c = new y();

    public static final void a(V.g gVar) {
        Object obj;
        V.d dVar;
        f fVar = gVar.e().f2313c;
        if (fVar != f.f2304b && fVar != f.f2305c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        V.e b3 = gVar.b();
        b3.getClass();
        Iterator it = ((C1140f) b3.f1604c).iterator();
        while (true) {
            C1136b c1136b = (C1136b) it;
            obj = null;
            if (!c1136b.hasNext()) {
                dVar = null;
                break;
            }
            Map.Entry components = (Map.Entry) c1136b.next();
            kotlin.jvm.internal.j.d(components, "components");
            String str = (String) components.getKey();
            dVar = (V.d) components.getValue();
            if (kotlin.jvm.internal.j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (dVar == null) {
            w wVar = new w(gVar.b(), (A) gVar);
            C1140f c1140f = (C1140f) gVar.b().f1604c;
            C1137c b4 = c1140f.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            if (b4 != null) {
                obj = b4.f10118b;
            } else {
                C1137c c1137c = new C1137c("androidx.lifecycle.internal.SavedStateHandlesProvider", wVar);
                c1140f.f10127d++;
                C1137c c1137c2 = c1140f.f10125b;
                if (c1137c2 == null) {
                    c1140f.f10124a = c1137c;
                    c1140f.f10125b = c1137c;
                } else {
                    c1137c2.f10119c = c1137c;
                    c1137c.f10120d = c1137c2;
                    c1140f.f10125b = c1137c;
                }
            }
            if (((V.d) obj) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            gVar.e().a(new V.a(1, wVar));
        }
    }
}
