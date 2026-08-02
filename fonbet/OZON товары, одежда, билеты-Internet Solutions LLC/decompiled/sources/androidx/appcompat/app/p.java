package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.C5330m0;
import androidx.core.view.Y;

/* loaded from: classes8.dex */
final class p extends C5330m0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37232a;

    p(l lVar) {
        this.f37232a = lVar;
    }

    @Override // androidx.core.view.C5330m0, androidx.core.view.InterfaceC5328l0
    public final void a() {
        l lVar = this.f37232a;
        lVar.f37185w.setVisibility(0);
        if (lVar.f37185w.getParent() instanceof View) {
            Y.A((View) lVar.f37185w.getParent());
        }
    }

    @Override // androidx.core.view.InterfaceC5328l0
    public final void onAnimationEnd() {
        l lVar = this.f37232a;
        lVar.f37185w.setAlpha(1.0f);
        lVar.f37191z.f(null);
        lVar.f37191z = null;
    }
}
