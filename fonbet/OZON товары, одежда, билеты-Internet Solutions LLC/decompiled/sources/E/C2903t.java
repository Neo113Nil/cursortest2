package E;

import androidx.camera.core.impl.AbstractC5111p;

/* renamed from: E.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2903t extends AbstractC5111p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2904u f6919a;

    C2903t(C2904u c2904u) {
        this.f6919a = c2904u;
    }

    @Override // androidx.camera.core.impl.AbstractC5111p
    public final void d(int i11) {
        H.c.e().execute(new Runnable() { // from class: E.s
            @Override // java.lang.Runnable
            public final void run() {
                P p11 = C2903t.this.f6919a.f6920a;
                if (p11 != null) {
                    p11.l();
                }
            }
        });
    }
}
