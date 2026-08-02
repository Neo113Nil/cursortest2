package C;

import C.s0;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;

/* loaded from: classes8.dex */
final class p0 implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.a f4212a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.m f4213b;

    p0(b.a aVar, com.google.common.util.concurrent.m mVar) {
        this.f4212a = aVar;
        this.f4213b = mVar;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        if (th2 instanceof s0.b) {
            x2.i.f(null, this.f4213b.cancel(false));
        } else {
            x2.i.f(null, this.f4212a.c(null));
        }
    }

    @Override // I.c
    public final void onSuccess(Void r22) {
        x2.i.f(null, this.f4212a.c(null));
    }
}
