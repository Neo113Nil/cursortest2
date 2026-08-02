package androidx.appcompat.app;

import androidx.core.view.C5326k0;
import androidx.core.view.C5330m0;
import androidx.core.view.Y;

/* loaded from: classes8.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37230a;

    final class a extends C5330m0 {
        a() {
        }

        @Override // androidx.core.view.C5330m0, androidx.core.view.InterfaceC5328l0
        public final void a() {
            o.this.f37230a.f37185w.setVisibility(0);
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void onAnimationEnd() {
            l lVar = o.this.f37230a;
            lVar.f37185w.setAlpha(1.0f);
            lVar.f37191z.f(null);
            lVar.f37191z = null;
        }
    }

    o(l lVar) {
        this.f37230a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f37230a;
        lVar.f37187x.showAtLocation(lVar.f37185w, 55, 0, 0);
        C5326k0 c5326k0 = lVar.f37191z;
        if (c5326k0 != null) {
            c5326k0.b();
        }
        if (!lVar.r0()) {
            lVar.f37185w.setAlpha(1.0f);
            lVar.f37185w.setVisibility(0);
            return;
        }
        lVar.f37185w.setAlpha(0.0f);
        C5326k0 b11 = Y.b(lVar.f37185w);
        b11.a(1.0f);
        lVar.f37191z = b11;
        b11.f(new a());
    }
}
