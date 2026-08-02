package R10;

import O10.a.C0392a;
import P10.c;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.D;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;
import ru.ozon.composer.ui.recycler.layout.ComposerGridLayoutManager;

/* loaded from: classes7.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O10.a f24240a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [Q10.a, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [P10.b, java.lang.Object] */
    public d(@NotNull ViewGroup stickyPlaceholder, @NotNull c.a stickyHeaderAsyncDifferFactory, @NotNull androidx.recyclerview.widget.g composerRecyclerView, @NotNull ComposerGridLayoutManager composerLayoutManager, @NotNull C8042d composerAdapter, ComposerListBehavior composerListBehavior, @NotNull D viewLifecycleScope, SwipeRefreshLayout swipeRefreshLayout, boolean z11, boolean z12) {
        ViewParent bVar;
        Intrinsics.checkNotNullParameter(stickyPlaceholder, "stickyPlaceholder");
        Intrinsics.checkNotNullParameter(stickyHeaderAsyncDifferFactory, "stickyHeaderAsyncDifferFactory");
        Intrinsics.checkNotNullParameter(composerRecyclerView, "composerRecyclerView");
        Intrinsics.checkNotNullParameter(composerLayoutManager, "composerLayoutManager");
        Intrinsics.checkNotNullParameter(composerAdapter, "composerAdapter");
        Intrinsics.checkNotNullParameter(viewLifecycleScope, "viewLifecycleScope");
        if (z12) {
            Context context = stickyPlaceholder.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bVar = new Q10.d(context, new b(composerListBehavior));
        } else {
            Context context2 = stickyPlaceholder.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            bVar = new Q10.b(context2, new c(composerListBehavior));
        }
        ?? r22 = bVar;
        Intrinsics.checkNotNullParameter(r22, "<this>");
        stickyPlaceholder.addView(r22);
        O10.c cVar = new O10.c(stickyPlaceholder, r22, composerRecyclerView, swipeRefreshLayout, z12);
        ?? bVar2 = new P10.b(c.a.a(stickyHeaderAsyncDifferFactory, viewLifecycleScope, z11), composerAdapter);
        O10.a aVar = new O10.a(composerRecyclerView, cVar, r22, bVar2, z12);
        composerLayoutManager.s(aVar.new C0392a());
        bVar2.e(cVar, r22, new a(0, aVar, O10.a.class, "refresh", "refresh(Z)V", 0));
        composerAdapter.n(new BY.b(bVar2));
        composerAdapter.o(z12);
        this.f24240a = aVar;
    }

    @Override // R10.f
    public final void a(z00.f fVar) {
        O10.a aVar = this.f24240a;
        if (fVar == null || !fVar.getIsError()) {
            aVar.r();
        } else {
            aVar.s();
        }
    }
}
