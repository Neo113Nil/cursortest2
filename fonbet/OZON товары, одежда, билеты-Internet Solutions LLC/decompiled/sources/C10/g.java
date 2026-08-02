package C10;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private int f4327a;

    /* renamed from: b, reason: collision with root package name */
    private int f4328b;

    /* renamed from: c, reason: collision with root package name */
    private A10.d f4329c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f4330d;

    public g(@NotNull C8042d adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.registerAdapterDataObserver(new f(this));
    }

    public static final void a(g gVar) {
        A10.d dVar = gVar.f4329c;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final void b(int i11) {
        if (this.f4328b == i11) {
            return;
        }
        this.f4328b = i11;
        A10.d dVar = this.f4329c;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (!Intrinsics.d(this.f4330d, parent)) {
            this.f4329c = parent != null ? A10.e.a(parent) : null;
        }
        this.f4330d = parent;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        Integer valueOf = Integer.valueOf(childAdapterPosition);
        if (childAdapterPosition < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            RecyclerView.g adapter = parent.getAdapter();
            if (adapter == null) {
                return;
            }
            int itemCount = adapter.getItemCount() - 1;
            if (intValue != itemCount) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
                if (bVar == null) {
                    return;
                }
                RecyclerView recyclerView = this.f4330d;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager == null) {
                    return;
                }
                int g10 = gridLayoutManager.g();
                if (bVar.d() + bVar.c() == g10) {
                    return;
                }
                RecyclerView recyclerView2 = this.f4330d;
                Object adapter2 = recyclerView2 != null ? recyclerView2.getAdapter() : null;
                C8042d c8042d = adapter2 instanceof C8042d ? (C8042d) adapter2 : null;
                if (c8042d == null) {
                    return;
                }
                int d11 = bVar.d() + bVar.c();
                while (d11 < g10 && intValue < itemCount) {
                    intValue++;
                    d11 += c8042d.h(intValue).p().a();
                }
                if (d11 > g10 || intValue != itemCount) {
                    return;
                }
            }
            int i11 = this.f4327a;
            outRect.bottom = i11 + (i11 == 0 ? this.f4328b : 0);
        }
    }

    public final void setBottomOffset(int i11) {
        if (this.f4327a == i11) {
            return;
        }
        this.f4327a = i11;
        A10.d dVar = this.f4329c;
        if (dVar != null) {
            dVar.c();
        }
    }
}
