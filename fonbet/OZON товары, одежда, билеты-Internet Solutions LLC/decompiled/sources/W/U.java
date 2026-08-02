package W;

import W.K;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import d0.InterfaceC5999j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class U implements I.c<InterfaceC5999j> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r0 f32983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K.j f32984b;

    U(K.j jVar, r0 r0Var) {
        this.f32984b = jVar;
        this.f32983a = r0Var;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        int i11;
        int i12;
        C.S.l("Recorder", "VideoEncoder Setup error: " + th2, th2);
        K.j jVar = this.f32984b;
        i11 = jVar.f32971e;
        i12 = jVar.f32969c;
        K k11 = K.this;
        if (i11 >= i12) {
            k11.A(th2);
            return;
        }
        K.j.c(jVar);
        Runnable runnable = new Runnable() { // from class: W.T
            @Override // java.lang.Runnable
            public final void run() {
                boolean z11;
                int i13;
                C.s0 s0Var;
                Y0 y02;
                K.j jVar2 = U.this.f32984b;
                z11 = jVar2.f32970d;
                if (z11) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Retry setupVideo #");
                i13 = jVar2.f32971e;
                sb2.append(i13);
                C.S.a("Recorder", sb2.toString());
                s0Var = jVar2.f32967a;
                y02 = jVar2.f32968b;
                StringBuilder sb3 = new StringBuilder("Try to safely release video encoder: ");
                K k12 = K.this;
                sb3.append(k12.f32889E);
                C.S.a("Recorder", sb3.toString());
                k12.f32912a0.o().a(new S(jVar2, s0Var, y02), k12.f32919e);
            }
        };
        jVar.f32972f = H.c.e().schedule(new AB.a(2, k11.f32919e, runnable), K.f32884l0, TimeUnit.MILLISECONDS);
    }

    @Override // I.c
    public final void onSuccess(InterfaceC5999j interfaceC5999j) {
        InterfaceC5999j interfaceC5999j2 = interfaceC5999j;
        C.S.a("Recorder", "VideoEncoder is created. " + interfaceC5999j2);
        if (interfaceC5999j2 == null) {
            return;
        }
        K.j jVar = this.f32984b;
        r0 r0Var = K.this.f32912a0;
        r0 r0Var2 = this.f32983a;
        x2.i.f(null, r0Var == r0Var2);
        K k11 = K.this;
        x2.i.f(null, k11.f32889E == null);
        InterfaceC5999j l11 = r0Var2.l();
        k11.f32889E = l11;
        ((d0.Y) ((d0.J) l11).p()).c();
        k11.f32889E.c();
        Surface j11 = r0Var2.j();
        k11.f32885A = j11;
        k11.K(j11);
        Executor executor = k11.f32919e;
        r0Var2.n(executor, new C(k11));
        I.k.b(r0Var2.k(), new J(k11, r0Var2), executor);
        k11.z();
    }
}
