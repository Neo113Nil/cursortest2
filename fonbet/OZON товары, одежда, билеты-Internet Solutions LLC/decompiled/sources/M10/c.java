package M10;

import A00.e;
import A00.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import y10.i;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f17248a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7851b f17249b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f17250c;

    public c(@NotNull i loaderController, @NotNull InterfaceC7851b controller, @NotNull a composerScrollOffsetController) {
        Intrinsics.checkNotNullParameter(loaderController, "loaderController");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(composerScrollOffsetController, "composerScrollOffsetController");
        this.f17248a = loaderController;
        this.f17249b = controller;
        this.f17250c = composerScrollOffsetController;
    }

    public final void a(@NotNull g recyclerView, @NotNull e event, int i11) {
        c cVar;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(event, "event");
        a aVar = this.f17250c;
        if (i11 == 0) {
            aVar.d();
        } else if (!f.b(event.e())) {
            aVar.b();
        }
        if (event.g()) {
            boolean i12 = event.i();
            int e11 = event.e();
            int i13 = !f.b(e11) ? 0 : e11;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                cVar = this;
                b bVar = new b(cVar, recyclerView, i12, i13, recyclerView.getContext());
                bVar.setTargetPosition(i11);
                layoutManager.startSmoothScroll(bVar);
            } else {
                cVar = this;
            }
        } else {
            cVar = this;
            if (f.b(event.e())) {
                RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null) {
                    int e12 = event.e();
                    linearLayoutManager.scrollToPositionWithOffset(i11, f.b(e12) ? e12 : 0);
                }
            } else {
                recyclerView.scrollToPosition(i11);
            }
        }
        if (event.h()) {
            cVar.f17248a.g();
        }
        cVar.f17249b.hideLoader();
    }
}
