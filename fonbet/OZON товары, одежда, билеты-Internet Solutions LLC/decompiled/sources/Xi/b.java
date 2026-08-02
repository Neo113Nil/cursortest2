package Xi;

import Di.C2872a;
import Vi.c;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f34483a = new b();

    @Override // Xi.a
    public final void a(@NotNull c adapter, @NotNull ViewGroup parent, @NotNull ViewGroup containerView, int i11) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager != null) {
            boolean z11 = true;
            if (i11 != 3 && i11 != 4) {
                z11 = false;
            }
            C2872a m11 = adapter.m(i11);
            int measuredWidth = ((RecyclerView) parent).getMeasuredWidth() / staggeredGridLayoutManager.o();
            int i12 = -2;
            if (i11 != 3 && i11 != 4) {
                i12 = (int) m11.a(measuredWidth);
            }
            StaggeredGridLayoutManager.c cVar = new StaggeredGridLayoutManager.c(staggeredGridLayoutManager.generateDefaultLayoutParams());
            ((ViewGroup.MarginLayoutParams) cVar).height = i12;
            cVar.e(z11);
            containerView.setLayoutParams(cVar);
        }
    }
}
