package C2;

import Sc.r;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;

/* renamed from: C2.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2722q implements r<h0, D2.o> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f4359a;

    C2722q(C10737n c10737n) {
        this.f4359a = c10737n;
    }

    @Override // C2.r
    public final void a(D2.o oVar) {
        D2.o e11 = oVar;
        Intrinsics.checkNotNullParameter(e11, "e");
        C10737n c10737n = this.f4359a;
        if (c10737n.isActive()) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(Sc.s.a(e11));
        }
    }

    @Override // C2.r
    public final void onResult(h0 h0Var) {
        h0 result = h0Var;
        Intrinsics.checkNotNullParameter(result, "result");
        C10737n c10737n = this.f4359a;
        if (c10737n.isActive()) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(result);
        }
    }
}
