package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.G;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5404z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G f43181a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<a> f43182b;

    /* renamed from: androidx.fragment.app.z$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final G.m f43183a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f43184b;

        public a(@NotNull G.m callback, boolean z11) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f43183a = callback;
            this.f43184b = z11;
        }

        @NotNull
        public final G.m a() {
            return this.f43183a;
        }

        public final boolean b() {
            return this.f43184b;
        }
    }

    public C5404z(@NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f43181a = fragmentManager;
        this.f43182b = new CopyOnWriteArrayList<>();
    }

    public final void a(@NotNull ComponentCallbacksC5392m f7, Bundle bundle, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().a(f7, bundle, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentActivityCreated(g10, f7, bundle);
            }
        }
    }

    public final void b(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        Context e11 = g10.s0().e();
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().b(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentAttached(g10, f7, e11);
            }
        }
    }

    public final void c(@NotNull ComponentCallbacksC5392m f7, Bundle bundle, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().c(f7, bundle, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentCreated(g10, f7, bundle);
            }
        }
    }

    public final void d(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().d(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentDestroyed(g10, f7);
            }
        }
    }

    public final void e(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().e(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentDetached(g10, f7);
            }
        }
    }

    public final void f(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().f(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentPaused(g10, f7);
            }
        }
    }

    public final void g(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        Context e11 = g10.s0().e();
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().g(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentPreAttached(g10, f7, e11);
            }
        }
    }

    public final void h(@NotNull ComponentCallbacksC5392m f7, Bundle bundle, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().h(f7, bundle, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentPreCreated(g10, f7, bundle);
            }
        }
    }

    public final void i(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().i(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentResumed(g10, f7);
            }
        }
    }

    public final void j(@NotNull ComponentCallbacksC5392m f7, @NotNull Bundle outState, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().j(f7, outState, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentSaveInstanceState(g10, f7, outState);
            }
        }
    }

    public final void k(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().k(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentStarted(g10, f7);
            }
        }
    }

    public final void l(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().l(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentStopped(g10, f7);
            }
        }
    }

    public final void m(@NotNull ComponentCallbacksC5392m f7, @NotNull View v11, Bundle bundle, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        Intrinsics.checkNotNullParameter(v11, "v");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().m(f7, v11, bundle, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentViewCreated(g10, f7, v11, bundle);
            }
        }
    }

    public final void n(@NotNull ComponentCallbacksC5392m f7, boolean z11) {
        Intrinsics.checkNotNullParameter(f7, "f");
        G g10 = this.f43181a;
        ComponentCallbacksC5392m v02 = g10.v0();
        if (v02 != null) {
            G parentFragmentManager = v02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.u0().n(f7, true);
        }
        Iterator<a> it = this.f43182b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z11 || next.b()) {
                next.a().onFragmentViewDestroyed(g10, f7);
            }
        }
    }

    public final void o(@NotNull G.m cb2, boolean z11) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.f43182b.add(new a(cb2, z11));
    }

    public final void p(@NotNull G.m cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        synchronized (this.f43182b) {
            try {
                int size = this.f43182b.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (this.f43182b.get(i11).a() == cb2) {
                        this.f43182b.remove(i11);
                        break;
                    }
                    i11++;
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
