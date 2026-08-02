package C10;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    private int f4321c;

    /* renamed from: d, reason: collision with root package name */
    private int f4322d;

    /* renamed from: e, reason: collision with root package name */
    private int f4323e;

    @Override // C10.e
    public final int a() {
        return this.f4321c;
    }

    @Override // C10.e
    public final int c() {
        return this.f4322d;
    }

    @Override // C10.e
    public final void d(int i11) {
        if (this.f4321c == i11) {
            return;
        }
        this.f4321c = i11;
        invalidateItemDecorations();
    }

    @Override // C10.e
    public final void f(int i11) {
        if (this.f4323e == i11) {
            return;
        }
        this.f4323e = i11;
        invalidateItemDecorations();
    }

    @Override // C10.e
    public final void g(int i11) {
        if (this.f4322d == i11) {
            return;
        }
        this.f4322d = i11;
        invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        e(parent);
        if (parent.getChildAdapterPosition(view) == 0) {
            int i11 = this.f4321c;
            outRect.top = i11 + this.f4322d + ((i11 == 0 && this.f4322d == 0) ? this.f4323e : 0);
        }
    }
}
