package C10;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private int f4318c;

    /* renamed from: d, reason: collision with root package name */
    private int f4319d;

    /* renamed from: e, reason: collision with root package name */
    private int f4320e;

    public c(@NotNull C8042d adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.registerAdapterDataObserver(new b(this));
    }

    public static final void i(c cVar, int i11) {
        if (i11 <= cVar.j()) {
            cVar.invalidateItemDecorations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j() {
        RecyclerView b11 = b();
        RecyclerView.o layoutManager = b11 != null ? b11.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return -1;
        }
        int g10 = gridLayoutManager.g();
        RecyclerView b12 = b();
        RecyclerView.g adapter = b12 != null ? b12.getAdapter() : null;
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return -1;
        }
        int itemCount = c8042d.getItemCount();
        int i11 = 0;
        for (int i12 = 0; i12 < itemCount; i12++) {
            i11 += c8042d.h(i12).p().a();
            if (i11 > g10) {
                return i12 - 1;
            }
            if (i11 == g10) {
                return i12;
            }
        }
        return c8042d.getItemCount();
    }

    @Override // C10.e
    public final int a() {
        return this.f4318c;
    }

    @Override // C10.e
    public final int c() {
        return this.f4319d;
    }

    @Override // C10.e
    public final void d(int i11) {
        if (this.f4318c == i11) {
            return;
        }
        this.f4318c = i11;
        invalidateItemDecorations();
    }

    @Override // C10.e
    public final void f(int i11) {
        if (this.f4320e == i11) {
            return;
        }
        this.f4320e = i11;
        invalidateItemDecorations();
    }

    @Override // C10.e
    public final void g(int i11) {
        if (this.f4319d == i11) {
            return;
        }
        this.f4319d = i11;
        invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        e(parent);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        Integer valueOf = Integer.valueOf(childAdapterPosition);
        if (childAdapterPosition < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (intValue != 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
                if (bVar == null || bVar.c() == 0) {
                    return;
                }
                RecyclerView b11 = b();
                RecyclerView.g adapter = b11 != null ? b11.getAdapter() : null;
                C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
                if (c8042d == null) {
                    return;
                }
                int c11 = bVar.c();
                while (c11 > 0 && intValue > 0) {
                    intValue--;
                    c11 -= c8042d.h(intValue).p().a();
                }
                if (intValue != 0) {
                    return;
                }
            }
            int i11 = this.f4318c;
            outRect.top = i11 + this.f4319d + ((i11 == 0 && this.f4319d == 0) ? this.f4320e : 0);
        }
    }
}
