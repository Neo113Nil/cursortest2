package C2;

import Sc.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;

/* renamed from: C2.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2718m implements r<Void, D2.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f4355a;

    C2718m(C10737n c10737n) {
        this.f4355a = c10737n;
    }

    @Override // C2.r
    public final void a(D2.a aVar) {
        D2.a e11 = aVar;
        Intrinsics.checkNotNullParameter(e11, "e");
        C10737n c10737n = this.f4355a;
        if (c10737n.isActive()) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(Sc.s.a(e11));
        }
    }

    @Override // C2.r
    public final void onResult(Void r22) {
        C10737n c10737n = this.f4355a;
        if (c10737n.isActive()) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(Unit.f71690a);
        }
    }
}
