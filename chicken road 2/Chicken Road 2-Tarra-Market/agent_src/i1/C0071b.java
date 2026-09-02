package i1;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0071b f1289a = new C0071b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0071b f1290b = new C0071b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0071b f1291c = new C0071b();

    /* renamed from: d, reason: collision with root package name */
    public static final C0071b f1292d = new C0071b();

    /* renamed from: e, reason: collision with root package name */
    public static C0071b f1293e;

    public static Socket a(g gVar, C0070a c0070a, l1.g gVar2) {
        Iterator it = gVar.f1335d.iterator();
        while (it.hasNext()) {
            l1.c cVar = (l1.c) it.next();
            if (cVar.g(c0070a, null) && cVar.f6095h != null && cVar != gVar2.a()) {
                if (gVar2.f6126n != null || gVar2.f6122j.f6101n.size() != 1) {
                    throw new IllegalStateException();
                }
                Reference reference = (Reference) gVar2.f6122j.f6101n.get(0);
                Socket b2 = gVar2.b(true, false, false);
                gVar2.f6122j = cVar;
                cVar.f6101n.add(reference);
                return b2;
            }
        }
        return null;
    }

    public static void b(g gVar, C0070a c0070a, l1.g gVar2, A a2) {
        Iterator it = gVar.f1335d.iterator();
        while (it.hasNext()) {
            l1.c cVar = (l1.c) it.next();
            if (cVar.g(c0070a, a2)) {
                if (gVar2.f6122j != null) {
                    throw new IllegalStateException();
                }
                gVar2.f6122j = cVar;
                gVar2.f6123k = true;
                cVar.f6101n.add(new l1.f(gVar2, gVar2.f6119g));
                return;
            }
        }
    }
}
