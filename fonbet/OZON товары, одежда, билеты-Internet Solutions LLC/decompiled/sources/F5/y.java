package F5;

import Sc.r;
import xe.C10737n;

/* loaded from: classes8.dex */
final class y<T> implements B5.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f9079a;

    y(C10737n c10737n) {
        this.f9079a = c10737n;
    }

    @Override // B5.t
    public final void onResult(T t2) {
        C10737n c10737n = this.f9079a;
        if (c10737n.t()) {
            return;
        }
        r.Companion companion = Sc.r.INSTANCE;
        c10737n.resumeWith(t2);
    }
}
