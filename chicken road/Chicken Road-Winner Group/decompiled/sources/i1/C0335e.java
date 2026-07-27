package i1;

import S0.r;

/* renamed from: i1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335e {

    /* renamed from: a, reason: collision with root package name */
    public final C0341k f5011a = new C0341k();

    public final void a(Exception exc) {
        C0341k c0341k = this.f5011a;
        c0341k.getClass();
        r.d(exc, "Exception must not be null");
        synchronized (c0341k.f5022a) {
            try {
                if (c0341k.f5024c) {
                    return;
                }
                c0341k.f5024c = true;
                c0341k.f = exc;
                c0341k.f5023b.e(c0341k);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
