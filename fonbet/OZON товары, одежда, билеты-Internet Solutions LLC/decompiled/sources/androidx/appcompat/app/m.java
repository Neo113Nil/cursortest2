package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;

/* loaded from: classes.dex */
final class m implements androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37228a;

    m(l lVar) {
        this.f37228a = lVar;
    }

    @Override // androidx.core.view.D
    public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        int l11 = c5353y0.l();
        int u02 = this.f37228a.u0(c5353y0);
        if (l11 != u02) {
            int j11 = c5353y0.j();
            int k11 = c5353y0.k();
            int i11 = c5353y0.i();
            C5353y0.b bVar = new C5353y0.b(c5353y0);
            bVar.d(androidx.core.graphics.d.b(j11, u02, k11, i11));
            c5353y0 = bVar.a();
        }
        return Y.u(view, c5353y0);
    }
}
