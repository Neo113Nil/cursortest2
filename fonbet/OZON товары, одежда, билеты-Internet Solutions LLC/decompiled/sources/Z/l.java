package Z;

import Z.m;
import Z.o;
import androidx.annotation.NonNull;
import d0.InterfaceC5999j;
import d0.S;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class l implements I.c<S> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5999j.a f35236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f35237b;

    l(m mVar, InterfaceC5999j.a aVar) {
        this.f35237b = mVar;
        this.f35236a = aVar;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        m mVar = this.f35237b;
        if (mVar.f35249l != this.f35236a) {
            return;
        }
        C.S.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
        if (th2 instanceof IllegalStateException) {
            return;
        }
        Executor executor = mVar.f35247j;
        m.a aVar = mVar.f35248k;
        if (executor == null || aVar == null) {
            return;
        }
        executor.execute(new c(0, aVar, th2));
    }

    @Override // I.c
    public final void onSuccess(S s11) {
        S s12 = s11;
        m mVar = this.f35237b;
        if (!mVar.f35246i || mVar.f35249l != this.f35236a) {
            s12.cancel();
            return;
        }
        if (mVar.f35252o && mVar.c()) {
            mVar.h();
        }
        o oVar = mVar.f35252o ? mVar.f35242e : mVar.f35241d;
        ByteBuffer u11 = s12.u();
        o.c read = oVar.read(u11);
        if (read.a() > 0) {
            if (mVar.f35255r) {
                mVar.e(read.a(), u11);
            }
            if (mVar.f35247j != null && read.b() - mVar.f35258u >= 200) {
                mVar.f35258u = read.b();
                mVar.f(u11);
            }
            u11.limit(read.a() + u11.position());
            s12.c(TimeUnit.NANOSECONDS.toMicros(read.b()));
            s12.a();
        } else {
            C.S.k("AudioSource", "Unable to read data from AudioStream.");
            s12.cancel();
        }
        mVar.i();
    }
}
