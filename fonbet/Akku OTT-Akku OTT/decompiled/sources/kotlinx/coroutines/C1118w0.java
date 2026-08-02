package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlinx.coroutines.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1118w0 extends B0 {
    public final Function1<Throwable, Unit> e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1118w0(Function1<? super Throwable, Unit> function1) {
        this.e = function1;
    }

    @Override // kotlinx.coroutines.B0
    public final boolean i() {
        return false;
    }

    @Override // kotlinx.coroutines.B0
    public final void j(Throwable th) {
        this.e.invoke(th);
    }
}
