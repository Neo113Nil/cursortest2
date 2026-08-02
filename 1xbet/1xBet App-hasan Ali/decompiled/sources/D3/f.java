package D3;

import m3.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o f946a = new o();

    public final void a(Exception exc) {
        o oVar = this.f946a;
        oVar.getClass();
        v.f("Exception must not be null", exc);
        synchronized (oVar.f966a) {
            try {
                if (oVar.f968c) {
                    return;
                }
                oVar.f968c = true;
                oVar.f = exc;
                oVar.f967b.g(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
