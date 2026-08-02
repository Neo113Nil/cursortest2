package C2;

import Sc.r;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;

/* renamed from: C2.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2720o implements r<AbstractC2708c, D2.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f4357a;

    C2720o(C10737n c10737n) {
        this.f4357a = c10737n;
    }

    @Override // C2.r
    public final void a(D2.g gVar) {
        D2.g e11 = gVar;
        Intrinsics.checkNotNullParameter(e11, "e");
        C10737n c10737n = this.f4357a;
        if (c10737n.isActive()) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(Sc.s.a(e11));
        }
    }

    @Override // C2.r
    public final void onResult(AbstractC2708c abstractC2708c) {
        AbstractC2708c result = abstractC2708c;
        Intrinsics.checkNotNullParameter(result, "result");
        C10737n c10737n = this.f4357a;
        if (c10737n.isActive()) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(result);
        }
    }
}
