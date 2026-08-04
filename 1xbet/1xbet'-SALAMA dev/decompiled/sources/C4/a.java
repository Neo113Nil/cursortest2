package C4;

import L4.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements p026d4.a, N4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1568a;

    public /* synthetic */ a(b bVar) {
        this.f1568a = bVar;
    }

    @Override // N4.a
    public void b(N4.b bVar) {
        b bVar2 = this.f1568a;
        synchronized (bVar2) {
            try {
                p026d4.b bVar3 = (p026d4.b) bVar.get();
                bVar2.f1570d = bVar3;
                if (bVar3 != null) {
                    ((p014b4.d) bVar3).a(bVar2.f1572f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p026d4.a
    public void e(p014b4.b bVar) {
        b bVar2 = this.f1568a;
        synchronized (bVar2) {
            try {
                if (bVar.f10130b != null) {
                    Q0.a.v(2, "FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + bVar.f10130b, new Object[0]);
                }
                o oVar = bVar2.f1569c;
                if (oVar != null) {
                    oVar.a(bVar.f10129a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
