package C;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class t0 implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N.r f4242a;

    t0(N.r rVar) {
        this.f4242a = rVar;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
    }

    @Override // I.c
    public final void onSuccess(Void r12) {
        this.f4242a.run();
    }
}
