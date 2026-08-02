package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class O0 extends B0 {
    public final C1100n e;

    public O0(C1100n c1100n) {
        this.e = c1100n;
    }

    @Override // kotlinx.coroutines.B0
    public final boolean i() {
        return false;
    }

    @Override // kotlinx.coroutines.B0
    public final void j(Throwable th) {
        Result.Companion companion = Result.INSTANCE;
        this.e.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
    }
}
