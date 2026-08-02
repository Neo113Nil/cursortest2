package W;

import W.K;
import androidx.camera.core.impl.Y0;
import d0.InterfaceC5999j;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final /* synthetic */ class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K.j f32979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C.s0 f32980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y0 f32981c;

    public /* synthetic */ S(K.j jVar, C.s0 s0Var, Y0 y02) {
        this.f32979a = jVar;
        this.f32980b = s0Var;
        this.f32981c = y02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D3.h hVar;
        Executor executor;
        Y.f fVar;
        K.j jVar = this.f32979a;
        jVar.getClass();
        C.s0 s0Var = this.f32980b;
        boolean j11 = s0Var.j();
        K k11 = K.this;
        if (j11 || (k11.f32912a0.m(s0Var) && !k11.w())) {
            C.S.k("Recorder", "Ignore the SurfaceRequest " + s0Var + " isServiced: " + s0Var.j() + " VideoEncoderSession: " + k11.f32912a0 + " has been configured with a persistent in-progress recording.");
            return;
        }
        hVar = k11.f32920f;
        Executor executor2 = k11.f32919e;
        executor = k11.f32917d;
        r0 r0Var = new r0(hVar, executor2, executor);
        AbstractC4847s abstractC4847s = (AbstractC4847s) K.t(k11.f32887C);
        fVar = k11.f32934t;
        com.google.common.util.concurrent.m<InterfaceC5999j> i11 = r0Var.i(s0Var, this.f32981c, abstractC4847s, fVar);
        k11.f32912a0 = r0Var;
        I.k.b(i11, new U(jVar, r0Var), executor2);
    }
}
