package F5;

import Sc.r;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;

/* loaded from: classes8.dex */
final class z<T> implements B5.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f9080a;

    z(C10737n c10737n) {
        this.f9080a = c10737n;
    }

    @Override // B5.t
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        C10737n c10737n = this.f9080a;
        if (c10737n.t()) {
            return;
        }
        r.Companion companion = Sc.r.INSTANCE;
        Intrinsics.f(th2);
        c10737n.resumeWith(Sc.s.a(th2));
    }
}
