package E;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class X implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2895k f6855a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y f6856b;

    X(Y y11, C2895k c2895k) {
        this.f6856b = y11;
        this.f6855a = c2895k;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        C2895k c2895k = this.f6855a;
        if (c2895k.b()) {
            return;
        }
        int e11 = ((androidx.camera.core.impl.Q) ((ArrayList) c2895k.a()).get(0)).e();
        boolean z11 = th2 instanceof C.K;
        Y y11 = this.f6856b;
        if (z11) {
            y11.f6859c.e(new C2891g(e11, (C.K) th2));
        } else {
            y11.f6859c.e(new C2891g(e11, new C.K("Failed to submit capture request", th2)));
        }
        y11.f6858b.b();
    }

    @Override // I.c
    public final void onSuccess(Void r12) {
        this.f6856b.f6858b.b();
    }
}
