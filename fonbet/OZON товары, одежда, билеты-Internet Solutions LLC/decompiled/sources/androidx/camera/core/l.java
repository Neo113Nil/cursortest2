package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5104l0;

/* loaded from: classes8.dex */
final class l extends k {

    final class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f38429a;

        a(p pVar) {
            this.f38429a = pVar;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            this.f38429a.close();
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    @Override // androidx.camera.core.k
    final p c(@NonNull InterfaceC5104l0 interfaceC5104l0) {
        return interfaceC5104l0.d();
    }

    @Override // androidx.camera.core.k
    final void e() {
    }

    @Override // androidx.camera.core.k
    final void g(@NonNull p pVar) {
        I.k.b(d(pVar), new a(pVar), H.c.b());
    }
}
