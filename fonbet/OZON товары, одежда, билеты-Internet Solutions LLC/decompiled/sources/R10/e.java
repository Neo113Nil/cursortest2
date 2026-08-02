package R10;

import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f24241a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final N10.d<k<l20.c>> f24242b;

    public e(@NotNull ViewGroup stickyHeaderPlaceholder, @NotNull androidx.recyclerview.widget.g composerRecyclerView, @NotNull N10.b<k<l20.c>> adapter, SwipeRefreshLayout swipeRefreshLayout) {
        Intrinsics.checkNotNullParameter(stickyHeaderPlaceholder, "stickyHeaderPlaceholder");
        Intrinsics.checkNotNullParameter(composerRecyclerView, "composerRecyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f24241a = stickyHeaderPlaceholder;
        N10.d<k<l20.c>> dVar = new N10.d<>(adapter, stickyHeaderPlaceholder, swipeRefreshLayout);
        this.f24242b = dVar;
        composerRecyclerView.removeItemDecoration(dVar);
        composerRecyclerView.addItemDecoration(dVar);
    }

    @Override // R10.f
    public final void a(z00.f fVar) {
        N10.d<k<l20.c>> dVar = this.f24242b;
        if (fVar == null || !fVar.getIsError()) {
            dVar.l();
        } else {
            dVar.k();
            this.f24241a.removeAllViews();
        }
    }
}
