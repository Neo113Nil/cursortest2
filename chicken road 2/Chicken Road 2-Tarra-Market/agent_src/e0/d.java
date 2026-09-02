package e0;

import Q.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k f954a = new k();

    public final void a(Exception exc) {
        k kVar = this.f954a;
        kVar.getClass();
        s.d(exc, "Exception must not be null");
        synchronized (kVar.f968a) {
            try {
                if (kVar.f970c) {
                    return;
                }
                kVar.f970c = true;
                kVar.f973f = exc;
                kVar.f969b.d(kVar);
            } finally {
            }
        }
    }
}
