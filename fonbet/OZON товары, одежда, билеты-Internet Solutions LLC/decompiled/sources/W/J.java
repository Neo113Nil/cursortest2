package W;

import androidx.annotation.NonNull;
import d0.InterfaceC5999j;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes8.dex */
final class J implements I.c<InterfaceC5999j> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r0 f32875a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f32876b;

    J(K k11, r0 r0Var) {
        this.f32876b = k11;
        this.f32875a = r0Var;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        C.S.a("Recorder", "Error in ReadyToReleaseFuture: " + th2);
    }

    @Override // I.c
    public final void onSuccess(InterfaceC5999j interfaceC5999j) {
        InterfaceC5999j interfaceC5999j2;
        InterfaceC5999j interfaceC5999j3 = interfaceC5999j;
        C.S.a("Recorder", "VideoEncoder can be released: " + interfaceC5999j3);
        if (interfaceC5999j3 == null) {
            return;
        }
        K k11 = this.f32876b;
        ScheduledFuture<?> scheduledFuture = k11.f32909Y;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC5999j2 = k11.f32889E) != null && interfaceC5999j2 == interfaceC5999j3 && (interfaceC5999j2 instanceof d0.J)) {
            ((d0.J) interfaceC5999j2).B();
        }
        k11.f32914b0 = this.f32875a;
        k11.K(null);
        k11.E(k11.w());
    }
}
