package W;

import W.s0;
import androidx.annotation.NonNull;
import java.util.concurrent.CancellationException;

/* loaded from: classes8.dex */
final class i0 implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.m f33072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f33073b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f0 f33074c;

    i0(f0 f0Var, com.google.common.util.concurrent.m mVar, boolean z11) {
        this.f33074c = f0Var;
        this.f33072a = mVar;
        this.f33073b = z11;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        if (th2 instanceof CancellationException) {
            return;
        }
        C.S.d("VideoCapture", "Surface update completed with unexpected exception", th2);
    }

    @Override // I.c
    public final void onSuccess(Void r32) {
        s0.a aVar;
        f0 f0Var = this.f33074c;
        if (this.f33072a != f0Var.f33043t || (aVar = f0Var.f33045v) == s0.a.INACTIVE) {
            return;
        }
        s0.a aVar2 = this.f33073b ? s0.a.ACTIVE_STREAMING : s0.a.ACTIVE_NON_STREAMING;
        if (aVar2 != aVar) {
            f0Var.f33045v = aVar2;
            f0Var.i0().e(aVar2);
        }
    }
}
