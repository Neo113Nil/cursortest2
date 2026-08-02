package Z;

import C.S;
import Y.c;
import Z.m;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5129y0;
import d0.InterfaceC5999j;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class k implements InterfaceC5129y0.a<c.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5999j.a f35234a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f35235b;

    k(m mVar, InterfaceC5999j.a aVar) {
        this.f35235b = mVar;
        this.f35234a = aVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0.a
    public final void a(c.a aVar) {
        c.a aVar2 = aVar;
        Objects.requireNonNull(aVar2);
        m mVar = this.f35235b;
        if (mVar.f35249l == this.f35234a) {
            S.a("AudioSource", "Receive BufferProvider state change: " + mVar.f35245h + " to " + aVar2);
            if (mVar.f35245h != aVar2) {
                mVar.f35245h = aVar2;
                mVar.p();
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0.a
    public final void onError(@NonNull Throwable th2) {
        m mVar = this.f35235b;
        if (mVar.f35249l == this.f35234a) {
            Executor executor = mVar.f35247j;
            m.a aVar = mVar.f35248k;
            if (executor == null || aVar == null) {
                return;
            }
            executor.execute(new c(0, aVar, th2));
        }
    }
}
