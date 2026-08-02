package C4;

import L4.o;
import b4.C0782b;
import b4.C0784d;
import d4.InterfaceC0964a;
import d4.InterfaceC0965b;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0964a, N4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1568a;

    public /* synthetic */ a(b bVar) {
        this.f1568a = bVar;
    }

    @Override // N4.a
    public void b(N4.b bVar) {
        b bVar2 = this.f1568a;
        synchronized (bVar2) {
            try {
                InterfaceC0965b interfaceC0965b = (InterfaceC0965b) bVar.get();
                bVar2.f1570d = interfaceC0965b;
                if (interfaceC0965b != null) {
                    ((C0784d) interfaceC0965b).a(bVar2.f1572f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d4.InterfaceC0964a
    public void e(C0782b c0782b) {
        b bVar = this.f1568a;
        synchronized (bVar) {
            try {
                if (c0782b.f10130b != null) {
                    Q0.a.v(2, "FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + c0782b.f10130b, new Object[0]);
                }
                o oVar = bVar.f1569c;
                if (oVar != null) {
                    oVar.a(c0782b.f10129a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
