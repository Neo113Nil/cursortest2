package c20;

import B0.A0;
import c20.k;
import i10.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n10.InterfaceC8418b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f56392a;

    /* renamed from: b, reason: collision with root package name */
    private k.b<ru.ozon.composer.ui.widget.l> f56393b;

    public h(@NotNull l10.i parent, @NotNull n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore, InterfaceC8418b interfaceC8418b, @NotNull i trackingQueue) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(trackingQueue, "trackingQueue");
        this.f56392a = new m(parent, widgetStore, interfaceC8418b, trackingQueue);
    }

    public final void a(@NotNull List<? extends k.a> patch) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        this.f56392a.f(patch);
    }

    @NotNull
    public final ArrayList b(@NotNull k.b container) {
        List<ru.ozon.composer.ui.widget.l> list;
        Intrinsics.checkNotNullParameter(container, "container");
        List a11 = container.a();
        k.b<ru.ozon.composer.ui.widget.l> bVar = this.f56393b;
        if (bVar == null || (list = bVar.a()) == null) {
            list = K.f71697a;
        }
        this.f56393b = container;
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        if (H00.b.c()) {
            H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", V.e.a("diff start [oldItems=[", C7714v.V(list, null, null, null, C5737e.f56389b, 31), "], newItems=[", C7714v.V(a11, null, null, null, C5738f.f56390b, 31), "]]")), "OverlayWidgetContainer", null, Boolean.TRUE);
        }
        ArrayList a12 = k.a(list, a11);
        if (H00.b.c()) {
            H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", A0.b("diff end [patch=", C7714v.V(a12, null, null, null, g.f56391b, 31), "]")), "OverlayWidgetContainer", null, Boolean.TRUE);
        }
        return a12;
    }

    public final void c(int i11) {
        this.f56392a.g(i11);
    }
}
